package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.BlacktipSharkModel;
import com.github.hellocrossy.biologicalwonders.entity.BlacktipSharkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BlacktipSharkRenderer extends ZawaMobRenderer<BlacktipSharkEntity, BlacktipSharkModel> {
    public BlacktipSharkRenderer(EntityRendererManager manager) {
        super(manager, new BlacktipSharkModel.Adult(), new BlacktipSharkModel.Child(), 0.6F);

    }

    @Override
    protected void scale(BlacktipSharkEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.455F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

