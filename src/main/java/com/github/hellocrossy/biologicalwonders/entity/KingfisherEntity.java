package com.github.hellocrossy.biologicalwonders.entity;

import com.github.hellocrossy.biologicalwonders.item.BioItems;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.level.LevelAccessor;


import javax.annotation.Nullable;

public class KingfisherEntity extends org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity implements org.zawamod.zawa.world.entity.OviparousEntity, org.zawamod.zawa.world.entity.SpeciesVariantsEntity {
    public KingfisherEntity(net.minecraft.world.entity.EntityType<? extends org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity> type, net.minecraft.world.level.Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return createMobAttributes().add(net.minecraft.world.entity.ai.attributes.Attributes.FLYING_SPEED, 0.80F).add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.30F).add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 6.0).add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE, 0.5);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.PanicGoal(this, 1.33));
        this.goalSelector.addGoal(4, new net.minecraft.world.entity.ai.goal.AvoidEntityGoal<>(this, net.minecraft.world.entity.player.Player.class, 16.0F, 0.8, 1.33, (entity) -> AVOID_PLAYERS.test(entity) && !this.isTame()));
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(net.minecraft.server.level.ServerLevel world, AgeableMob entity) {
        return BioEntities.KINGFISHER.get().create(world);
    }

    protected float getStandingEyeHeight(net.minecraft.world.entity.Pose pose, net.minecraft.world.entity.EntityDimensions size) {
        return size.height * 0.85F;
    }

    @Override
    public net.minecraft.world.item.ItemStack getBreedEggItem() {
        return BioItems.KINGFISHER_EGG.get().getDefaultInstance();
    }

    @Override
    public int getVariantByBiome(LevelAccessor iWorld) {
        return random.nextInt(getWildVariants());
    }
}


