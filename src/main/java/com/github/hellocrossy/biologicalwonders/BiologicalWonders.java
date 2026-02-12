package com.github.hellocrossy.biologicalwonders;

import com.github.hellocrossy.biologicalwonders.entity.BioEntities;
import com.github.hellocrossy.biologicalwonders.item.BioItems;
import com.github.hellocrossy.biologicalwonders.sounds.BioSounds;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.zawamod.zawa.Zawa;

@Mod(BiologicalWonders.MOD_ID)
public class BiologicalWonders {
    public static final String MOD_ID = "biologicalwonders";
//    public static final String[] PLUSHIES_LIST = new String[]{};

    public BiologicalWonders() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BioEntities.REGISTRY.initialize();
        BioItems.ITEMS_REGISTRAR.register(bus);
        BioSounds.REGISTRAR.register(bus);

        bus.addListener(this::addCreativeTabs);
        bus.addListener(this::setup);
        bus.addListener(this::setupClient);
    }

    private void addCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == Zawa.ITEMS_GROUP.getKey()) {
            BioItems.ITEMS_REGISTRAR.getEntries().forEach(item -> event.accept(item.get()));
        }
        if (event.getTabKey() == Zawa.DECORATIONS_GROUP.getKey()) {
            BioItems.DECORATIONS_REGISTRAR.getEntries().forEach(item -> event.accept(item.get()));
        }
        if (event.getTabKey() == Zawa.ENTITIES_GROUP.getKey()) {
            BioEntities.REGISTRY.itemRegistrar.getEntries().forEach(item -> event.accept(item.get()));
        }
    }

    private void setup(final FMLCommonSetupEvent event) {
        BioEntities.registerSpawnPlacements();
    }

    private void setupClient(final FMLClientSetupEvent event) {
        BioEntities.registerRenderers();
    }

}

