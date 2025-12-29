package com.github.hellocrossy.biologicalwonders.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import org.zawamod.zawa.world.entity.ClimbingEntity;
import org.zawamod.zawa.world.entity.ambient.ZawaBaseAmbientEntity;
import javax.annotation.Nullable;
import java.util.logging.Level;
import static net.minecraft.world.entity.Mob.createMobAttributes;

public class SeaBunnyEntity extends ZawaBaseAmbientEntity implements ClimbingEntity{
    public static final DataParameter<Boolean> CLIMBING = EntityDataManager.defineId(SeaBunnyEntity.class, DataSerializers.BOOLEAN);

    public SeaBunnyEntity(EntityType<? extends ZawaBaseAmbientEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 1.0F;
        this.moveControl = new MovementController(this);
    }

    public static AttributeSupplier.Builder registerSeaBunnyAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.10F).add(Attributes.MAX_HEALTH, 2.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new FindWaterGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33D));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, Player.class, 8.0F, 0.8D, 1.33D, AVOID_PLAYERS::test));
        this.goalSelector.addGoal(8, new RandomWalkingGoal(this, 1.0D));
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(CLIMBING, false);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return BioEntities.SEA_BUNNY.get().create(world);
    }

    public boolean isClimbing() {
        return (Boolean)this.entityData.get(CLIMBING);
    }

    public void setClimbing(boolean climbing) {
        this.entityData.set(CLIMBING, climbing);
    }

    public void tick() {
        super.tick();
        if (!this.level.isClientSide && this.horizontalCollision) {
            this.setClimbing(this.isClimbableBlock(this.level, this.blockPosition().relative(this.getDirection())));
        }

    }

    public boolean onClimbable() {
        return this.isClimbing();
    }

    @Override
    public boolean isClimbableBlock(Level level, BlockPos blockPos) {
        Block block = (level.getBlockState(blockPos)).getBlock();
        return Tags.Blocks.DIRT.contains(block) || BlockTags.SAND.contains(block) || ClimbingEntity.super.isClimbableBlock(level, blockPos);
    }
}
