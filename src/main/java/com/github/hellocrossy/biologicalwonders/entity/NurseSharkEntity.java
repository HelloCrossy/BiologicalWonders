package com.github.hellocrossy.biologicalwonders.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WallClimberNavigation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraftforge.fluids.FluidType;
import org.zawamod.zawa.world.entity.ClimbingEntity;
import org.zawamod.zawa.world.entity.ai.goal.BreachGoal;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaAquaticEntity;

import javax.annotation.Nullable;

public class NurseSharkEntity extends ZawaAquaticEntity implements ClimbingEntity {
    public static final EntityDataAccessor<Boolean> CLIMBING = SynchedEntityData.defineId(NurseSharkEntity.class, EntityDataSerializers.BOOLEAN);

    public NurseSharkEntity(EntityType<? extends ZawaAquaticEntity> type, Level world) {
        super(type, world);
        this.setPathfindingMalus(BlockPathTypes.WATER, 0.0F);
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
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(4, new BreachGoal(this, 5));
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 4.0, 1.33, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(CLIMBING, false);
    }

    @Override
    protected PathNavigation createNavigation(Level world) {
        return new WallClimberNavigation(this, world);
    }

    @Override
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
    public MobType getMobType() {
        return MobType.WATER;
    }

    @Override
    public boolean checkSpawnObstruction(LevelReader level) {
        return level().isUnobstructed(this);
    }

    @Override
    public boolean isPushedByFluid(FluidType type) {
        return false;
    }

    @Override
    public void tick() {
        super.tick();
        if (!level().isClientSide && horizontalCollision)
            setClimbing(isClimbableBlock(level(), blockPosition().relative(getDirection())));
    }

    @Override
    public boolean onClimbable() {
        return isClimbing();
    }

    @Override
    public boolean causeFallDamage(float p_147187_, float p_147188_, DamageSource p_147189_) {
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
        BlockState blockState = level.getBlockState(blockPos);
        return blockState.is(BlockTags.DIRT) || blockState.is(BlockTags.SAND) || ClimbingEntity.super.isClimbableBlock(level, blockPos);
    }
}
