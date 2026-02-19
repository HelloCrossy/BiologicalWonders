package com.github.hellocrossy.biologicalwonders.entity;

import com.github.hellocrossy.biologicalwonders.item.BioItems;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.NonTamedTargetGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.ambient.ZawaAmbientFishEntity;

import javax.annotation.Nullable;

public class TriggerfishEntity extends ZawaAmbientFishEntity {
    public TriggerfishEntity(EntityType<? extends ZawaAmbientFishEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.30F).add(Attributes.MAX_HEALTH, 4.0);
    }

    @Override
    protected ItemStack getBucketItemStack() {
        return new ItemStack(BioItems.TRIGGERFISH_BUCKET.get());
    }

    @Override
    protected SoundEvent getFlopSound() {
        return SoundEvents.COD_FLOP;
    }

    protected float getStandingEyeHeight(Pose pose, EntitySize size) {
        return size.height * 0.85F;
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return BioEntities.TRIGGERFISH.get().create(world);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 1.5, 1.33, true));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
    }
}
