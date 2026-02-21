package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.BioModelLayers;
import com.github.hellocrossy.biologicalwonders.client.model.LionfishModel;
import com.github.hellocrossy.biologicalwonders.entity.ElephantSealEntity;
import com.github.hellocrossy.biologicalwonders.entity.LionfishEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class LionfishRenderer extends ZawaMobRenderer<LionfishEntity, LionfishModel> {
    public LionfishRenderer(EntityRendererProvider.Context context) {
        super(context, new LionfishModel.Adult(context.bakeLayer(BioModelLayers.LIONFISH_ADULT)), new LionfishModel.Child(context.bakeLayer(BioModelLayers.LIONFISH_CHILD)), 0.6F);
    }

    @Override
    protected void scale(LionfishEntity entity, PoseStack PoseStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 1.0F;
        PoseStack.scale(scale, scale, scale);
        super.scale(entity, PoseStack, partialTickTime);

    }
    @Override
    protected boolean hasBabyVariants(LionfishEntity entity) {
        return true;
    }
}

