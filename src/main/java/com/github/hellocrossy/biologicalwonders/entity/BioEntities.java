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
import org.zawamod.zawa.world.entity.animal.ZawaAquaticEntity;
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
    public static final RegistryObject<EntityType<AlligatorGarEntity>> ALLIGATOR_GAR =
            REGISTRY.builder(AlligatorGarEntity::new, EntityClassification.WATER_CREATURE)
                    .attributes(AlligatorGarEntity::registerAttributes)
                    .renderer(() -> AlligatorGarRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("alligator_gar");
    public static final RegistryObject<EntityType<BlacktipSharkEntity>> BLACKTIP_SHARK =
            REGISTRY.builder(BlacktipSharkEntity::new, EntityClassification.WATER_CREATURE)
                    .attributes(BlacktipSharkEntity::registerAttributes)
                    .renderer(() -> BlacktipSharkRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("blacktip_shark");
    public static final RegistryObject<EntityType<CownoseRayEntity>> COWNOSE_RAY =
            REGISTRY.builder(CownoseRayEntity::new, EntityClassification.WATER_CREATURE)
                    .attributes(CownoseRayEntity::registerAttributes)
                    .renderer(() -> CownoseRayRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("cownose_ray");
    public static final RegistryObject<EntityType<ElephantSealEntity>> ELEPHANT_SEAL =
            REGISTRY.builder(ElephantSealEntity::new, EntityClassification.CREATURE)
                    .attributes(ElephantSealEntity::registerAttributes)
                    .renderer(() -> ElephantSealRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("elephant_seal");
    public static final RegistryObject<EntityType<GreySealEntity>> GREY_SEAL =
            REGISTRY.builder(GreySealEntity::new, EntityClassification.CREATURE)
                    .attributes(GreySealEntity::registerAttributes)
                    .renderer(() -> GreySealRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("grey_seal");
    public static final RegistryObject<EntityType<RibbonSealEntity>> RIBBON_SEAL =
            REGISTRY.builder(RibbonSealEntity::new, EntityClassification.CREATURE)
                    .attributes(RibbonSealEntity::registerAttributes)
                    .renderer(() -> RibbonSealRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("ribbon_seal");
    public static final RegistryObject<EntityType<HarborSealEntity>> HARBOR_SEAL =
            REGISTRY.builder(HarborSealEntity::new, EntityClassification.CREATURE)
                    .attributes(HarborSealEntity::registerAttributes)
                    .renderer(() -> HarborSealRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("harbor_seal");
    public static final RegistryObject<EntityType<LionfishEntity>> LIONFISH =
            REGISTRY.builder(LionfishEntity::new, EntityClassification.WATER_CREATURE)
                    .attributes(LionfishEntity::registerAttributes)
                    .renderer(() -> LionfishRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("lionfish");
    public static final RegistryObject<EntityType<NapoleonWrasseEntity>> NAPOLEON_WRASSE =
            REGISTRY.builder(NapoleonWrasseEntity::new, EntityClassification.WATER_CREATURE)
                    .attributes(NapoleonWrasseEntity::registerAttributes)
                    .renderer(() -> NapoleonWrasseRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("napoleon_wrasse");
    public static final RegistryObject<EntityType<NurseSharkEntity>> NURSE_SHARK =
            REGISTRY.builder(NurseSharkEntity::new, EntityClassification.WATER_CREATURE)
                    .attributes(NurseSharkEntity::registerAttributes)
                    .renderer(() -> NurseSharkRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("nurse_shark");
    public static final RegistryObject<EntityType< WSDolphinEntity>> WS_DOLPHIN =
            REGISTRY.builder( WSDolphinEntity::new, EntityClassification.WATER_CREATURE)
                    .attributes( WSDolphinEntity::registerAttributes)
                    .renderer(() ->  WSDolphinRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("ws_dolphin");

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
        EntitySpawnPlacementRegistry.register(ELEPHANT_SEAL.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(GREY_SEAL.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(RIBBON_SEAL.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(HARBOR_SEAL.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(ALLIGATOR_GAR.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAquaticEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(BLACKTIP_SHARK.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAquaticEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(COWNOSE_RAY.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAquaticEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(LIONFISH.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAquaticEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(NAPOLEON_WRASSE.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAquaticEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(NURSE_SHARK.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAquaticEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(WS_DOLPHIN.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAquaticEntity::checkAquaticSpawnRules);

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