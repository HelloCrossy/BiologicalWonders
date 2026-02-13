package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.PacificWhiteSidedDolphinModel;
import com.github.hellocrossy.biologicalwonders.entity.PacificWhiteSidedDolphinEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PacificWhiteSidedDolphinRenderer extends ZawaMobRenderer<PacificWhiteSidedDolphinEntity, PacificWhiteSidedDolphinModel> {
    public PacificWhiteSidedDolphinRenderer(EntityRendererManager manager) {
        super(manager, new PacificWhiteSidedDolphinModel.Adult(), new PacificWhiteSidedDolphinModel.Child(), 1.5F);
    }

    @Override
    protected void scale(PacificWhiteSidedDolphinEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.95F : 1.5F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

