package com.github.hellocrossy.biologicalwonders.entity;

import com.github.hellocrossy.biologicalwonders.item.BioItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;
import org.zawamod.zawa.world.entity.ClimbingEntity;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.ai.goal.BreachGoal;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaAquaticEntity;
import org.zawamod.zawa.world.entity.animal.ZawaSemiAquaticEntity;

import javax.annotation.Nullable;
import java.util.logging.Level;

import static net.minecraft.world.entity.Mob.createMobAttributes;

public class NurseSharkEntity extends ZawaAquaticEntity implements OviparousEntity, ClimbingEntity {
    public static final DataParameter<Boolean> CLIMBING = EntityDataManager.defineId(NurseSharkEntity.class, DataSerializers.BOOLEAN);

    public NurseSharkEntity(EntityType<? extends ZawaAquaticEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 1.0F;
        this.moveControl = new MovementController(this);
    }
    public static AttributeSupplier.Builder registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.15F).add(Attributes.MAX_HEALTH, 12.0).add(Attributes.ATTACK_DAMAGE, 4.0);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return BioEntities.NURSE_SHARK.get().create(world);
    }

    @Override
    public ItemStack getBreedEggItem() {
        return BioItems.NURSE_SHARK_EGG.get().getDefaultInstance();
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(4, new BreachGoal(this, 5));
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 4.0, 1.33, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
    }
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(CLIMBING, false);
    }

    protected PathNavigator createNavigation(Level world) {
        return new ClimberPathNavigator(this, world);
    }
    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return size.height * 0.85F;
    }
    @Override
    protected void playStepSound(BlockPos blockPos, BlockState blockState) {
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public CreatureAttribute getMobType() {
        return CreatureAttribute.WATER;
    }

    @Override
    public boolean checkSpawnObstruction(LevelAccessorReader level) {
        return level.isUnobstructed(this);
    }

    @Override
    public boolean isPushedByFluid() {
        return false;
    }

    @Override
    public void tick() {
        super.tick();
        if (!level.isClientSide && horizontalCollision)
            setClimbing(isClimbableBlock(level, blockPosition().relative(getDirection())));
    }

    @Override
    public boolean onClimbable() {
        return isClimbing();
    }

    @Override
    public boolean causeFallDamage(float distance, float damageMultiplier) {
        return false;
    }

    @Override
    public boolean isClimbing() {
        return entityData.get(CLIMBING);
    }

    @Override
    public void setClimbing(boolean climbing) {
        this.entityData.set(CLIMBING, climbing);
    }

    @Override
    public boolean isClimbableBlock(Level level, BlockPos blockPos) {
        Block block = (level.getBlockState(blockPos)).getBlock();
        return Tags.Blocks.DIRT.contains(block) || BlockTags.SAND.contains(block) || ClimbingEntity.super.isClimbableBlock(level, blockPos);
    }
}
