package com.github.hellocrossy.biologicalwonders;


import com.github.hellocrossy.biologicalwonders.entity.BioEntities;
import com.github.hellocrossy.biologicalwonders.item.BioItems;
import com.github.hellocrossy.biologicalwonders.sounds.BioSounds;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BiologicalWonders.MOD_ID)
public class BiologicalWonders {
    public static final String MOD_ID = "biologicalwonders";

    public BiologicalWonders() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BioEntities.REGISTRY.initialize();
        BioItems.REGISTRAR.register(bus);
        BioSounds.REGISTRAR.register(bus);

        bus.addListener(this::setup);
        bus.addListener(this::setupClient);
    }

    private void setup(final FMLCommonSetupEvent event) {
        BioEntities.registerSpawnPlacements();
    }

    private void setupClient(final FMLClientSetupEvent event) {
        BioEntities.registerRenderers();
    }

}

