package com.github.hellocrossy.biologicalwonders.entity;

import com.github.hellocrossy.biologicalwonders.BiologicalWonders;
import com.github.hellocrossy.biologicalwonders.client.render.entity.*;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.registries.RegistryObject;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.ZawaEntityRegistry;
import org.zawamod.zawa.world.entity.ambient.ZawaAmbientFishEntity;
import org.zawamod.zawa.world.entity.animal.ZawaAquaticEntity;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;
import org.zawamod.zawa.world.entity.animal.ZawaSemiAquaticEntity;

public class BioEntities {
    public static final ZawaEntityRegistry REGISTRY = new ZawaEntityRegistry(BiologicalWonders.MOD_ID);

    public static final RegistryObject<EntityType<CubanCrocodileEntity>> CUBAN_CROCODILE =
            REGISTRY.builder(CubanCrocodileEntity::new, MobCategory.CREATURE)
                    .attributes(CubanCrocodileEntity::registerAttributes)
                    .spawns(2, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.6F, 0.8F).clientTrackingRange(10))
                    .build("cuban_crocodile");
    public static final RegistryObject<EntityType<AlligatorGarEntity>> ALLIGATOR_GAR =
            REGISTRY.builder(AlligatorGarEntity::new, MobCategory.WATER_CREATURE)
                    .attributes(AlligatorGarEntity::registerAttributes)
                    .spawns(10, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 0.8F).clientTrackingRange(10))
                    .build("alligator_gar");
    public static final RegistryObject<EntityType<BlacktipReefSharkEntity>> BLACKTIP_REEF_SHARK =
            REGISTRY.builder(BlacktipReefSharkEntity::new, MobCategory.WATER_CREATURE)
                    .attributes(BlacktipReefSharkEntity::registerAttributes)
                    .spawns(10, 1, 4, ZawaSpawnCategory.TROPICAL_OCEAN)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("blacktip_reef_shark");
    public static final RegistryObject<EntityType<CownoseRayEntity>> COWNOSE_RAY =
            REGISTRY.builder(CownoseRayEntity::new, MobCategory.WATER_CREATURE)
                    .attributes(CownoseRayEntity::registerAttributes)
                    .spawns(10, 1, 1, ZawaSpawnCategory.PELAGIC_OCEAN, ZawaSpawnCategory.TROPICAL_OCEAN)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 0.5F).clientTrackingRange(10))
                    .build("cownose_ray");
    public static final RegistryObject<EntityType<ElephantSealEntity>> ELEPHANT_SEAL =
            REGISTRY.builder(ElephantSealEntity::new, MobCategory.CREATURE)
                    .attributes(ElephantSealEntity::registerAttributes)
                    .spawns(10, 2, 5, ZawaSpawnCategory.COASTAL_DESERT)
                    .data(entityBuilder -> entityBuilder.sized(2.5F, 2.2F).clientTrackingRange(10))
                    .build("elephant_seal");
    public static final RegistryObject<EntityType<GreySealEntity>> GREY_SEAL =
            REGISTRY.builder(GreySealEntity::new, MobCategory.CREATURE)
                    .attributes(GreySealEntity::registerAttributes)
                    .spawns(8, 1, 4, ZawaSpawnCategory.COASTAL_DESERT)
                    .data(entityBuilder -> entityBuilder.sized(1.75F, 0.5F).clientTrackingRange(10))
                    .build("grey_seal");
    public static final RegistryObject<EntityType<RibbonSealEntity>> RIBBON_SEAL =
            REGISTRY.builder(RibbonSealEntity::new, MobCategory.CREATURE)
                    .attributes(RibbonSealEntity::registerAttributes)
                    .spawns(8, 1, 4, ZawaSpawnCategory.COASTAL_DESERT)
                    .data(entityBuilder -> entityBuilder.sized(1.2F, 0.4F).clientTrackingRange(10))
                    .build("ribbon_seal");
    public static final RegistryObject<EntityType<HarborSealEntity>> HARBOR_SEAL =
            REGISTRY.builder(HarborSealEntity::new, MobCategory.CREATURE)
                    .attributes(HarborSealEntity::registerAttributes)
                    .spawns(10, 1, 4, ZawaSpawnCategory.COASTAL_DESERT)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 0.4F).clientTrackingRange(10))
                    .build("harbor_seal");
    public static final RegistryObject<EntityType<LionfishEntity>> LIONFISH =
            REGISTRY.builder(LionfishEntity::new, MobCategory.WATER_CREATURE)
                    .attributes(LionfishEntity::registerAttributes)
                    .spawns(15, 1, 2, ZawaSpawnCategory.TROPICAL_OCEAN)
                    .data(entityBuilder -> entityBuilder.sized(0.7F, 0.5F).clientTrackingRange(10))
                    .build("lionfish");
    public static final RegistryObject<EntityType<NapoleonWrasseEntity>> NAPOLEON_WRASSE =
            REGISTRY.builder(NapoleonWrasseEntity::new, MobCategory.WATER_CREATURE)
                    .attributes(NapoleonWrasseEntity::registerAttributes)
                    .spawns(8, 1, 1, ZawaSpawnCategory.TROPICAL_OCEAN)
                    .data(entityBuilder -> entityBuilder.sized(1.3F, 1.0F).clientTrackingRange(10))
                    .build("napoleon_wrasse");
    public static final RegistryObject<EntityType<NurseSharkEntity>> NURSE_SHARK =
            REGISTRY.builder(NurseSharkEntity::new, MobCategory.WATER_CREATURE)
                    .attributes(NurseSharkEntity::registerAttributes)
                    .spawns(10, 1, 2, ZawaSpawnCategory.TROPICAL_OCEAN)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("nurse_shark");
    public static final RegistryObject<EntityType<PacificWhiteSidedDolphinEntity>> PACIFIC_WHITE_SIDED_DOLPHIN =
            REGISTRY.builder(PacificWhiteSidedDolphinEntity::new, MobCategory.WATER_CREATURE)
                    .attributes(PacificWhiteSidedDolphinEntity::registerAttributes)
                    .spawns(8, 1, 2, ZawaSpawnCategory.PELAGIC_OCEAN)
                    .data(entityBuilder -> entityBuilder.sized(2.0F, 1.0F).clientTrackingRange(10))
                    .build("pacific_white_sided_dolphin");
    public static final RegistryObject<EntityType<KingfisherEntity>> KINGFISHER =
            REGISTRY.builder(KingfisherEntity::new, MobCategory.WATER_CREATURE)
                    .attributes(KingfisherEntity::registerAttributes)
                    .spawns(8, 1, 2, ZawaSpawnCategory.PELAGIC_OCEAN)
                    .data(entityBuilder -> entityBuilder.sized(2.0F, 1.0F).clientTrackingRange(10))
                    .build("kingfisher");

    //AMBIENT ENTITIES
    public static final RegistryObject<EntityType<ButterflyfishEntity>> BUTTERFLYFISH =
            REGISTRY.builder(ButterflyfishEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(ButterflyfishEntity::registerAttributes)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("butterflyfish");
    public static final RegistryObject<EntityType<CowfishEntity>> COWFISH =
            REGISTRY.builder(CowfishEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(CowfishEntity::registerAttributes)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("cowfish");
    public static final RegistryObject<EntityType<HorseshoeCrabEntity>> HORSESHOE_CRAB =
            REGISTRY.builder(HorseshoeCrabEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(HorseshoeCrabEntity::registerAttributes)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("horseshoe_crab");
    public static final RegistryObject<EntityType<MoorishIdolEntity>> MOORISH_IDOL =
            REGISTRY.builder(MoorishIdolEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(MoorishIdolEntity::registerAttributes)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("moorish_idol");
    public static final RegistryObject<EntityType<SeaBunnyEntity>> SEA_BUNNY =
            REGISTRY.builder(SeaBunnyEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(SeaBunnyEntity::registerSeaBunnyAttributes)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("sea_bunny");
    public static final RegistryObject<EntityType<SpottedDrumEntity>> SPOTTED_DRUM =
            REGISTRY.builder(SpottedDrumEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(SpottedDrumEntity::registerAttributes)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("spotted_drum");
    public static final RegistryObject<EntityType<SquirrelfishEntity>> SQUIRRELFISH =
            REGISTRY.builder(SquirrelfishEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(SquirrelfishEntity::registerAttributes)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("squirrelfish");
    public static final RegistryObject<EntityType<TriggerfishEntity>> TRIGGERFISH =
            REGISTRY.builder(TriggerfishEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(TriggerfishEntity::registerAttributes)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("triggerfish");
    public static final RegistryObject<EntityType<TulipSnailEntity>> TULIP_SNAIL =
            REGISTRY.builder(TulipSnailEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(TulipSnailEntity::registerTulipSnailAttributes)
                    .spawns(8, 5, 6, ZawaSpawnCategory.FAST_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("tulip_snail");

    public static void registerSpawnPlacements() {
        SpawnPlacements.register(CUBAN_CROCODILE.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkSemiAquaticSpawnRules);
        SpawnPlacements.register(ELEPHANT_SEAL.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkSemiAquaticSpawnRules);
        SpawnPlacements.register(GREY_SEAL.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkSemiAquaticSpawnRules);
        SpawnPlacements.register(RIBBON_SEAL.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkSemiAquaticSpawnRules);
        SpawnPlacements.register(HARBOR_SEAL.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkSemiAquaticSpawnRules);
        SpawnPlacements.register(ALLIGATOR_GAR.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAquaticEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(BLACKTIP_REEF_SHARK.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAquaticEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(COWNOSE_RAY.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAquaticEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(LIONFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAquaticEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(NAPOLEON_WRASSE.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAquaticEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(NURSE_SHARK.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAquaticEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(PACIFIC_WHITE_SIDED_DOLPHIN.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAquaticEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(KINGFISHER.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaFlyingEntity::checkFlyingSpawnRules);

        SpawnPlacements.register(BUTTERFLYFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(COWFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(HORSESHOE_CRAB.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(MOORISH_IDOL.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(SEA_BUNNY.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(SPOTTED_DRUM.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(SQUIRRELFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(TRIGGERFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(TULIP_SNAIL.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
    }

    public static void registerRenderers() {
        EntityRenderers.register(CUBAN_CROCODILE.get(), CubanCrocodileRenderer::new);
        EntityRenderers.register(ELEPHANT_SEAL.get(), ElephantSealRenderer::new);
        EntityRenderers.register(GREY_SEAL.get(), GreySealRenderer::new);
        EntityRenderers.register(RIBBON_SEAL.get(), RibbonSealRenderer::new);
        EntityRenderers.register(HARBOR_SEAL.get(), HarborSealRenderer::new);
        EntityRenderers.register(ALLIGATOR_GAR.get(), AlligatorGarRenderer::new);
        EntityRenderers.register(BLACKTIP_REEF_SHARK.get(), BlacktipReefSharkRenderer::new);
        EntityRenderers.register(COWNOSE_RAY.get(), CownoseRayRenderer::new);
        EntityRenderers.register(LIONFISH.get(), LionfishRenderer::new);
        EntityRenderers.register(NAPOLEON_WRASSE.get(), NapoleonWrasseRenderer::new);
        EntityRenderers.register(NURSE_SHARK.get(), NurseSharkRenderer::new);
        EntityRenderers.register(PACIFIC_WHITE_SIDED_DOLPHIN.get(), PacificWhiteSidedDolphinRenderer::new);
        EntityRenderers.register(KINGFISHER.get(), KingfisherRenderer::new);
        EntityRenderers.register(BUTTERFLYFISH.get(), ButterflyfishRenderer::new);
        EntityRenderers.register(COWFISH.get(), CowfishRenderer::new);
        EntityRenderers.register(HORSESHOE_CRAB.get(), HorseshoeCrabRenderer::new);
        EntityRenderers.register(MOORISH_IDOL.get(), MoorishIdolRenderer::new);
        EntityRenderers.register(SEA_BUNNY.get(), SeaBunnyRenderer::new);
        EntityRenderers.register(SPOTTED_DRUM.get(), SpottedDrumRenderer::new);
        EntityRenderers.register(SQUIRRELFISH.get(), SquirrelfishRenderer::new);
        EntityRenderers.register(TRIGGERFISH.get(), TriggerfishRenderer::new);
        EntityRenderers.register(TULIP_SNAIL.get(), TulipSnailRenderer::new);
    }
}