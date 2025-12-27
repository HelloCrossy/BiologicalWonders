package com.github.hellocrossy.biologicalwonders.block;

import com.github.hellocrossy.biologicalwonders.BiologicalWonders;
import com.github.hellocrossy.biologicalwonders.item.BioItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Util;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.block.PlushBlock;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static com.github.hellocrossy.biologicalwonders.BiologicalWonders.PLUSHIES_LIST;

public class BioBlocks {
    public static final DeferredRegister<Block> REGISTRAR = DeferredRegister.create(ForgeRegistries.BLOCKS, BiologicalWonders.MOD_ID);
    public static final Map<String, RegistryObject<Block>> PLUSHIES = Util.make(new HashMap<>(), map -> {
        for (String plush : PLUSHIES_LIST)
            map.put(plush, REGISTRAR.register(plush + "_plush", () -> new PlushBlock(AbstractBlock.Properties.of(Material.WOOL).sound(SoundType.WOOL).noOcclusion())));
    });
    private static <T extends Block> RegistryObject<T> registerWithItem(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = REGISTRAR.register(name, block);
        BioItems.REGISTRAR.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties().tab(Zawa.DECORATIONS_GROUP)));
        return registryObject;
    }

    @OnlyIn(Dist.CLIENT)
    public static void setRenderLayers() {
        RenderType cutoutMipped = RenderType.cutoutMipped();
        RenderTypeLookup.setRenderLayer(PLUSHIES.get("pelican").get(), cutoutMipped);
    }
}