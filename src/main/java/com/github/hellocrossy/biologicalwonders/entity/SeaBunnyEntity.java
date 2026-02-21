package com.github.hellocrossy.biologicalwonders.entity;

import com.github.hellocrossy.biologicalwonders.item.BioItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.ai.goal.FindWaterGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.ClimberPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.Tags;
import org.zawamod.zawa.world.entity.ClimbingEntity;
import org.zawamod.zawa.world.entity.ambient.ZawaAmbientFishEntity;
import org.zawamod.zawa.world.entity.ambient.ZawaBaseAmbientEntity;
import org.zawamod.zawa.world.item.ZawaItems;

import javax.annotation.Nullable;

public class SeaBunnyEntity extends ZawaBaseAmbientEntity implements ClimbingEntity{
    public static final DataParameter<Boolean> CLIMBING = EntityDataManager.defineId(SeaBunnyEntity.class, DataSerializers.BOOLEAN);

    public SeaBunnyEntity(EntityType<? extends ZawaAmbientFishEntity> type, World world) {
        super(type, world);
        this.maxUpStep = 1.0F;
        this.moveControl = new MovementController(this);
    }

    public static AttributeModifierMap.MutableAttribute registerSeaBunnyAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.15F).add(Attributes.MAX_HEALTH, 4.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new FindWaterGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33D));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, PlayerEntity.class, 8.0F, 0.8D, 1.33D, AVOID_PLAYERS::test));
        this.goalSelector.addGoal(8, new RandomWalkingGoal(this, 1.0D));
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(CLIMBING, false);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return BioEntities.SEA_BUNNY.get().create(world);
    }
    protected ItemStack getBucketItemStack() {
        return new ItemStack((IItemProvider) BioItems.SEA_BUNNY_BUCKET.get());
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
    public boolean isClimbableBlock(World level, BlockPos blockPos) {
        Block block = (level.getBlockState(blockPos)).getBlock();
        return Tags.Blocks.DIRT.contains(block) || BlockTags.SAND.contains(block) || ClimbingEntity.super.isClimbableBlock(level, blockPos);
    }
}
