package com.github.hellocrossy.biologicalwonders.item;

import com.github.hellocrossy.biologicalwonders.BiologicalWonders;
import com.github.hellocrossy.biologicalwonders.entity.BioEntities;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.zawamod.zawa.world.item.ZawaBucketItem;
import org.zawamod.zawa.world.item.ZawaEggItem;

//import static com.github.hellocrossy.biologicalwonders.BiologicalWonders.PLUSHIES_LIST;

public class BioItems {
    public static final DeferredRegister<Item> ITEMS_REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, BiologicalWonders.MOD_ID);
    public static final DeferredRegister<Item> DECORATIONS_REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, BiologicalWonders.MOD_ID);
//    public static final List<RegistryObject<Item>> PLUSHIES = Util.make(new ArrayList<>(), list -> {
//        for (String plush : PLUSHIES_LIST)
//            list.add(REGISTRAR.register(plush + "_plush", () -> new PlushBlockItem(BioBlocks.PLUSHIES.get(plush).get(), new Item.Properties().tab(Zawa.DECORATIONS_GROUP))));
//    });

    public static final RegistryObject<Item> CUBAN_CROCODILE_EGG = ITEMS_REGISTRAR.register("cuban_crocodile_egg", () -> new ZawaEggItem(BioEntities.CUBAN_CROCODILE, new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item>
            BUTTERFLYFISH = ITEMS_REGISTRAR.register("butterflyfish", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>
            COWFISH = ITEMS_REGISTRAR.register("cowfish", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>
            BUTTERFLYFISH_BUCKET = ITEMS_REGISTRAR.register("bucket_of_butterflyfish", () -> new ZawaBucketItem(BioEntities.BUTTERFLYFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
            new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item>
            COWFISH_BUCKET = ITEMS_REGISTRAR.register("bucket_of_cowfish", () -> new ZawaBucketItem(BioEntities.COWFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
            new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item>
            HORSESHOE_CRAB = ITEMS_REGISTRAR.register("horseshoe_crab", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>
            MOORISH_IDOL = ITEMS_REGISTRAR.register("moorish_idol", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>
            HORSESHOE_CRAB_BUCKET = ITEMS_REGISTRAR.register("bucket_of_horseshoe_crab", () -> new ZawaBucketItem(BioEntities.HORSESHOE_CRAB, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
            new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item>
            MOORISH_IDOL_BUCKET = ITEMS_REGISTRAR.register("bucket_of_moorish_idol", () -> new ZawaBucketItem(BioEntities.MOORISH_IDOL, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
            new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item>
            SEA_BUNNY = ITEMS_REGISTRAR.register("sea_bunny", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>
            SPOTTED_DRUM = ITEMS_REGISTRAR.register("spotted_drum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>
            SPOTTED_DRUM_BUCKET = ITEMS_REGISTRAR.register("bucket_of_spotted_drum", () -> new ZawaBucketItem(BioEntities.SPOTTED_DRUM, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
            new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item>
            SEA_BUNNY_BUCKET = ITEMS_REGISTRAR.register("bucket_of_sea_bunny", () -> new ZawaBucketItem(BioEntities.SEA_BUNNY, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
            new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item>
            SQUIRRELFISH = ITEMS_REGISTRAR.register("squirrelfish", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>
            TRIGGERFISH = ITEMS_REGISTRAR.register("triggerfish", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>
            SQUIRRELFISH_BUCKET = ITEMS_REGISTRAR.register("bucket_of_squirrelfish", () -> new ZawaBucketItem(BioEntities.SQUIRRELFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
            new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item>
            TRIGGERFISH_BUCKET = ITEMS_REGISTRAR.register("bucket_of_triggerfish", () -> new ZawaBucketItem(BioEntities.TRIGGERFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
            new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> ALLIGATOR_GAR_EGG = ITEMS_REGISTRAR.register("alligator_gar_egg", () -> new ZawaEggItem(BioEntities.ALLIGATOR_GAR, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> NAPOLEON_WRASSE_EGG = ITEMS_REGISTRAR.register("napoleon_wrasse_egg", () -> new ZawaEggItem(BioEntities.NAPOLEON_WRASSE, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> LIONFISH_EGG = ITEMS_REGISTRAR.register("lionfish_egg", () -> new ZawaEggItem(BioEntities.LIONFISH, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> KINGFISHER_EGG = ITEMS_REGISTRAR.register("kingfisher_egg", () -> new ZawaEggItem(BioEntities.KINGFISHER, new Item.Properties().stacksTo(16)));
}

