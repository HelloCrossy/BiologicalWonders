package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.WSDolphinModel;
import com.github.hellocrossy.biologicalwonders.entity.WSDolphinEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WSDolphinRenderer extends ZawaMobRenderer<WSDolphinEntity, WSDolphinModel> {
    public WSDolphinRenderer(EntityRendererManager manager) {
        super(manager, new WSDolphinModel.Adult(), new WSDolphinModel.Child(), 0.6F);

    }
    @Override
    protected void scale(WSDolphinEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.95F : 1.5F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

