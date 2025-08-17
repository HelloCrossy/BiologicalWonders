package com.github.hellocrossy.biologicalwonders.entity;

import com.github.hellocrossy.biologicalwonders.BiologicalWonders;
import com.github.hellocrossy.biologicalwonders.client.render.entity.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.fml.RegistryObject;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.ZawaEntityRegistry;
import org.zawamod.zawa.world.entity.ambient.ZawaAmbientFishEntity;
import org.zawamod.zawa.world.entity.animal.ZawaSemiAquaticEntity;

public class BioEntities {
    public static final ZawaEntityRegistry REGISTRY = new ZawaEntityRegistry(BiologicalWonders.MOD_ID, Zawa.ENTITIES_GROUP);

    public static final RegistryObject<EntityType<CubanCrocodileEntity>> CUBAN_CROCODILE =
            REGISTRY.builder(CubanCrocodileEntity::new, EntityClassification.CREATURE)
                    .attributes(CubanCrocodileEntity::registerAttributes)
                    .renderer(() -> CubanCrocodileRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("cuban_crocodile");

    //AMBIENT ENTITIES
    public static final RegistryObject<EntityType<ButterflyfishEntity>> BUTTERFLYFISH =
            REGISTRY.builder(ButterflyfishEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(ButterflyfishEntity::registerAttributes)
                    .renderer(() -> ButterflyfishRenderer::new)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("butterflyfish");
    public static final RegistryObject<EntityType<CowfishEntity>> COWFISH =
            REGISTRY.builder(CowfishEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(CowfishEntity::registerAttributes)
                    .renderer(() -> CowfishRenderer::new)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("cowfish");
    public static final RegistryObject<EntityType<HorseshoeCrabEntity>> HORSESHOE_CRAB =
            REGISTRY.builder(HorseshoeCrabEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(HorseshoeCrabEntity::registerAttributes)
                    .renderer(() -> HorseshoeCrabRenderer::new)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("horseshoe_crab");
    public static final RegistryObject<EntityType<MoorishIdolEntity>> MOORISH_IDOL =
            REGISTRY.builder(MoorishIdolEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(MoorishIdolEntity::registerAttributes)
                    .renderer(() -> MoorishIdolRenderer::new)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("moorish_idol");
    public static final RegistryObject<EntityType<SeaBunnyEntity>> SEA_BUNNY =
            REGISTRY.builder(SeaBunnyEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(SeaBunnyEntity::registerSeaBunnyAttributes)
                    .renderer(() -> SeaBunnyRenderer::new)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("sea_bunny");
    public static final RegistryObject<EntityType<SpottedDrumEntity>> SPOTTED_DRUM =
            REGISTRY.builder(SpottedDrumEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(SpottedDrumEntity::registerAttributes)
                    .renderer(() -> SpottedDrumRenderer::new)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("spotted_drum");
    public static final RegistryObject<EntityType<SquirrelfishEntity>> SQUIRRELFISH =
            REGISTRY.builder(SquirrelfishEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(SquirrelfishEntity::registerAttributes)
                    .renderer(() -> SquirrelfishRenderer::new)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("squirrelfish");
    public static final RegistryObject<EntityType<TriggerfishEntity>> TRIGGERFISH =
            REGISTRY.builder(TriggerfishEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(TriggerfishEntity::registerAttributes)
                    .renderer(() -> TriggerfishRenderer::new)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("triggerfish");
    public static final RegistryObject<EntityType<TulipSnailEntity>> TULIP_SNAIL =
            REGISTRY.builder(TulipSnailEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(TulipSnailEntity::registerTulipSnailAttributes)
                    .renderer(() -> TulipSnailRenderer::new)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("tulip_snail");
    
    public static void registerSpawnPlacements() {
        EntitySpawnPlacementRegistry.register(CUBAN_CROCODILE.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkSemiAquaticSpawnRules);


        EntitySpawnPlacementRegistry.register(BUTTERFLYFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(COWFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(HORSESHOE_CRAB.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(MOORISH_IDOL.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(SEA_BUNNY.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(SPOTTED_DRUM.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(SQUIRRELFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(TRIGGERFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(TULIP_SNAIL.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
    }
}