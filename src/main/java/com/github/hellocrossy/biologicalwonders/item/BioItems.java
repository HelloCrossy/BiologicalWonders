package com.github.hellocrossy.biologicalwonders.item;

import com.github.hellocrossy.biologicalwonders.BiologicalWonders;
import com.github.hellocrossy.biologicalwonders.block.BioBlocks;
import com.github.hellocrossy.biologicalwonders.entity.BioEntities;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.util.Util;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.item.PlushBlockItem;
import org.zawamod.zawa.world.item.ZawaEggItem;
import org.zawamod.zawa.world.item.ZawaFishBucketItem;

import java.util.ArrayList;
import java.util.List;



public class BioItems {
    public static final DeferredRegister<Item> REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, BiologicalWonders.MOD_ID);

    public static final RegistryObject<Item> CUBAN_CROCODILE_EGG = REGISTRAR.register("cuban_crocodile_egg", () -> new ZawaEggItem(BioEntities.CUBAN_CROCODILE, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            BUTTERFLYFISH = REGISTRAR.register("butterflyfish", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            COWFISH = REGISTRAR.register("cowfish", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            BUTTERFLYFISH_BUCKET = REGISTRAR.register("bucket_of_butterflyfish", () -> new ZawaFishBucketItem(BioEntities.BUTTERFLYFISH, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            COWFISH_BUCKET = REGISTRAR.register("bucket_of_cowfish", () -> new ZawaFishBucketItem(BioEntities.COWFISH, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            HORSESHOE_CRAB = REGISTRAR.register("horseshoe_crab", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            MOORISH_IDOL = REGISTRAR.register("moorish_idol", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            HORSESHOE_CRAB_BUCKET = REGISTRAR.register("bucket_of_horseshoe_crab", () -> new ZawaFishBucketItem(BioEntities.HORSESHOE_CRAB, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            MOORISH_IDOL_BUCKET = REGISTRAR.register("bucket_of_moorish_idol", () -> new ZawaFishBucketItem(BioEntities.MOORISH_IDOL, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            SEA_BUNNY = REGISTRAR.register("sea_bunny", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            SPOTTED_DRUM = REGISTRAR.register("spotted_drum", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            SPOTTED_DRUM_BUCKET = REGISTRAR.register("bucket_of_spotted_drum", () -> new ZawaFishBucketItem(BioEntities.SPOTTED_DRUM, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            SEA_BUNNY_BUCKET = REGISTRAR.register("bucket_of_sea_bunny", () -> new ZawaFishBucketItem(BioEntities.SEA_BUNNY, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            SQUIRRELFISH = REGISTRAR.register("squirrelfish", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            TRIGGERFISH = REGISTRAR.register("triggerfish", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            SQUIRRELFISH_BUCKET = REGISTRAR.register("bucket_of_squirrelfish", () -> new ZawaFishBucketItem(BioEntities.SQUIRRELFISH, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            TRIGGERFISH_BUCKET = REGISTRAR.register("bucket_of_triggerfish", () -> new ZawaFishBucketItem(BioEntities.TRIGGERFISH, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            TULIP_SNAIL = REGISTRAR.register("tulip_snail", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> ALLIGATOR_GAR_EGG = REGISTRAR.register("alligator_gar_egg", () -> new ZawaEggItem(BioEntities.ALLIGATOR_GAR, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> BLACKTIP_SHARK_EGG = REGISTRAR.register("blacktip_shark_egg", () -> new ZawaEggItem(BioEntities.BLACKTIP_SHARK, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> COWNOSE_RAY_EGG = REGISTRAR.register("cownose_ray_egg", () -> new ZawaEggItem(BioEntities.COWNOSE_RAY, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> NURSE_SHARK_EGG = REGISTRAR.register("nurse_shark_egg", () -> new ZawaEggItem(BioEntities.NURSE_SHARK, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> NAPOLEON_WRASSE_EGG = REGISTRAR.register("napoleon_wrasse_egg", () -> new ZawaEggItem(BioEntities.NAPOLEON_WRASSE, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> LIONFISH_EGG = REGISTRAR.register("lionfish_egg", () -> new ZawaEggItem(BioEntities.LIONFISH, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));

}

