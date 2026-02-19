package com.github.hellocrossy.biologicalwonders.entity;

import com.github.hellocrossy.biologicalwonders.item.BioItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.ambient.ZawaAmbientFishEntity;

import javax.annotation.Nullable;

public class TriggerfishEntity extends ZawaAmbientFishEntity {
    public TriggerfishEntity(EntityType<? extends ZawaAmbientFishEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.30F).add(Attributes.MAX_HEALTH, 4.0);
    }

    @Override
    public ItemStack getBucketItemStack() {
        return new ItemStack(BioItems.TRIGGERFISH_BUCKET.get());
    }

    @Override
    protected SoundEvent getFlopSound() {
        return SoundEvents.COD_FLOP;
    }

    @Override
    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return size.height * 0.85F;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return BioEntities.TRIGGERFISH.get().create(world);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 1.5, 1.33, true));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
    }
}
