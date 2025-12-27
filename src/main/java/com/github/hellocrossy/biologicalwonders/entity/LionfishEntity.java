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
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaAquaticEntity;
import org.zawamod.zawa.world.entity.animal.ZawaSemiAquaticEntity;

import javax.annotation.Nullable;

public class LionfishEntity extends ZawaAquaticEntity implements OviparousEntity {
    public LionfishEntity(EntityType<? extends ZawaAquaticEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.18F).add(Attributes.MAX_HEALTH, 6.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return BioEntities.LIONFISH.get().create(world);
    }

    @Override
    public ItemStack getBreedEggItem() {
        return BioItems.LIONFISH_EGG.get().getDefaultInstance();
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
    }

    protected float getStandingEyeHeight(Pose pose, EntitySize size) {
        return size.height * 0.85F;
    }
}
