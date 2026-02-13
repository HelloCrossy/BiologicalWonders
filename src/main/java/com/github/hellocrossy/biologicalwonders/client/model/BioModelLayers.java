package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.BiologicalWonders;
import com.google.common.collect.Sets;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Tuple;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

@OnlyIn(Dist.CLIENT)
public class BioModelLayers {
    public static final Set<ModelLayerLocation> ALL_MODELS = Sets.newHashSet();
    public static final List<Tuple<ModelLayerLocation, Supplier<LayerDefinition>>> MODEL_LAYERS_LIST = new ArrayList<>();
    public static final ModelLayerLocation CUBAN_CROCODILE_ADULT = register("cuban_crocodile", "adult", CubanCrocodileModel.Adult::createBodyLayer);
    public static final ModelLayerLocation CUBAN_CROCODILE_CHILD = register("cuban_crocodile", "child", CubanCrocodileModel.Child::createBodyLayer);
    public static final ModelLayerLocation ALLIGATOR_GAR_ADULT = register("alligator_gar", "adult", AlligatorGarModel.Adult::createBodyLayer);
    public static final ModelLayerLocation ALLIGATOR_GAR_CHILD = register("alligator_gar", "child", AlligatorGarModel.Child::createBodyLayer);
    public static final ModelLayerLocation BLACKTIP_REEF_SHARK_ADULT = register("blacktip_reef_shark", "adult", BlacktipReefSharkModel.Adult::createBodyLayer);
    public static final ModelLayerLocation BLACKTIP_REEF_SHARK_CHILD = register("blacktip_reef_shark", "child", BlacktipReefSharkModel.Child::createBodyLayer);
    public static final ModelLayerLocation COWNOSE_RAY_ADULT = register("cownose_ray", "adult", CownoseRayModel.Adult::createBodyLayer);
    public static final ModelLayerLocation COWNOSE_RAY_CHILD = register("cownose_ray", "child", CownoseRayModel.Child::createBodyLayer);
    public static final ModelLayerLocation ELEPHANT_SEAL_ADULT_MALE = register("elephant_seal", "adult/male", ElephantSealModel.AdultMale::createBodyLayer);
    public static final ModelLayerLocation ELEPHANT_SEAL_ADULT_FEMALE = register("elephant_seal", "adult/female", ElephantSealModel.AdultFemale::createBodyLayer);
    public static final ModelLayerLocation ELEPHANT_SEAL_CHILD = register("elephant_seal", "child", ElephantSealModel.Child::createBodyLayer);
    public static final ModelLayerLocation GREY_SEAL_ADULT = register("grey_seal", "adult", GreySealModel.Adult::createBodyLayer);
    public static final ModelLayerLocation GREY_SEAL_CHILD = register("grey_seal", "child", GreySealModel.Child::createBodyLayer);
    public static final ModelLayerLocation RIBBON_SEAL_ADULT = register("ribbon_seal", "adult", RibbonSealModel.Adult::createBodyLayer);
    public static final ModelLayerLocation RIBBON_SEAL_CHILD = register("ribbon_seal", "child", RibbonSealModel.Child::createBodyLayer);
    public static final ModelLayerLocation HARBOR_SEAL_ADULT = register("harbor_seal", "adult", HarborSealModel.Adult::createBodyLayer);
    public static final ModelLayerLocation HARBOR_SEAL_CHILD = register("harbor_seal", "child", HarborSealModel.Child::createBodyLayer);
    public static final ModelLayerLocation LIONFISH_ADULT = register("lionfish", "adult", LionfishModel.Adult::createBodyLayer);
    public static final ModelLayerLocation LIONFISH_CHILD = register("lionfish", "child", LionfishModel.Child::createBodyLayer);
    public static final ModelLayerLocation NAPOLEON_WRASSE_ADULT = register("napoleon_wrasse", "adult", NapoleonWrasseModel.Adult::createBodyLayer);
    public static final ModelLayerLocation NAPOLEON_WRASSE_CHILD = register("napoleon_wrasse", "child", NapoleonWrasseModel.Child::createBodyLayer);
    public static final ModelLayerLocation NURSE_SHARK_ADULT = register("nurse_shark", "adult", NurseSharkModel.Adult::createBodyLayer);
    public static final ModelLayerLocation NURSE_SHARK_CHILD = register("nurse_shark", "child", NurseSharkModel.Child::createBodyLayer);
    public static final ModelLayerLocation PACIFIC_WHITE_SIDED_DOLPHIN_ADULT = register("pacific_white_sided_dolphin", "adult", PacificWhiteSidedDolphinModel.Adult::createBodyLayer);
    public static final ModelLayerLocation PACIFIC_WHITE_SIDED_DOLPHIN_CHILD = register("pacific_white_sided_dolphin", "child", PacificWhiteSidedDolphinModel.Child::createBodyLayer);
    public static final ModelLayerLocation BUTTERFLYFISH = register("butterflyfish", ButterflyfishModel::createBodyLayer);
    public static final ModelLayerLocation COWFISH = register("cowfish", CowfishModel::createBodyLayer);
    public static final ModelLayerLocation HORSESHOE_CRAB = register("horseshoe_crab", HorseshoeCrabModel::createBodyLayer);
    public static final ModelLayerLocation MOORISH_IDOL = register("moorish_idol", MoorishIdolModel::createBodyLayer);
    public static final ModelLayerLocation SEA_BUNNY = register("sea_bunny", SeaBunnyModel::createBodyLayer);
    public static final ModelLayerLocation SPOTTED_DRUM = register("spotted_drum", SpottedDrumModel::createBodyLayer);
    public static final ModelLayerLocation SQUIRRELFISH = register("squirrelfish", SquirrelfishModel::createBodyLayer);
    public static final ModelLayerLocation TRIGGERFISH = register("triggerfish", TriggerfishModel::createBodyLayer);
    public static final ModelLayerLocation TULIP_SNAIL = register("tulip_snail", TulipSnailModel::createBodyLayer);

    public BioModelLayers() {
    }

    private static ModelLayerLocation register(String path, Supplier<LayerDefinition> layerDefinition) {
        return register(path, "main", layerDefinition);
    }

    private static ModelLayerLocation register(String path, String model, Supplier<LayerDefinition> layerDefinition) {
        ModelLayerLocation modellayerlocation = createLocation(path, model);
        MODEL_LAYERS_LIST.add(new Tuple<>(modellayerlocation, layerDefinition));
        if (!ALL_MODELS.add(modellayerlocation))
            throw new IllegalStateException("Duplicate registration for " + modellayerlocation);
        else return modellayerlocation;
    }

    private static ModelLayerLocation createLocation(String path, String model) {
        return new ModelLayerLocation(new ResourceLocation(BiologicalWonders.MOD_ID, path), model);
    }
}
