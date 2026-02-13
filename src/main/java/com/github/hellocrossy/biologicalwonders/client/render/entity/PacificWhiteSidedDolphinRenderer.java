package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.BioModelLayers;
import com.github.hellocrossy.biologicalwonders.client.model.PacificWhiteSidedDolphinModel;
import com.github.hellocrossy.biologicalwonders.entity.PacificWhiteSidedDolphinEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PacificWhiteSidedDolphinRenderer extends ZawaMobRenderer<PacificWhiteSidedDolphinEntity, PacificWhiteSidedDolphinModel> {
    public PacificWhiteSidedDolphinRenderer(EntityRendererProvider.Context context) {
        super(context, new PacificWhiteSidedDolphinModel.Adult(context.bakeLayer(BioModelLayers.PACIFIC_WHITE_SIDED_DOLPHIN_ADULT)), new PacificWhiteSidedDolphinModel.Child(context.bakeLayer(BioModelLayers.PACIFIC_WHITE_SIDED_DOLPHIN_CHILD)), 1.5F);
    }

    @Override
    protected void scale(PacificWhiteSidedDolphinEntity entity, PoseStack PoseStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.95F : 1.5F;
        PoseStack.scale(scale, scale, scale);
        super.scale(entity, PoseStack, partialTickTime);
    }
}

