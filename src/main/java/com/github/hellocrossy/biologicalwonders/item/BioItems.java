package com.github.hellocrossy.biologicalwonders.item;

import com.github.hellocrossy.biologicalwonders.BiologicalWonders;
import com.github.hellocrossy.biologicalwonders.block.BioBlocks;
import net.minecraft.item.Item;
import net.minecraft.util.Util;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.item.PlushBlockItem;

import java.util.ArrayList;
import java.util.List;

import static com.github.hellocrossy.biologicalwonders.BiologicalWonders.PLUSHIES_LIST;

public class BioItems {
    public static final DeferredRegister<Item> REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, BiologicalWonders.MOD_ID);
    public static final List<RegistryObject<Item>> PLUSHIES = Util.make(new ArrayList<>(), list -> {
        for (String plush : PLUSHIES_LIST)
            list.add(REGISTRAR.register(plush + "_plush", () -> new PlushBlockItem(BioBlocks.PLUSHIES.get(plush).get(), new Item.Properties().tab(Zawa.DECORATIONS_GROUP))));
    });

}
