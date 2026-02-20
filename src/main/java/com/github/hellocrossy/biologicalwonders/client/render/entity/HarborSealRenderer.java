package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.HarborSealModel;
import com.github.hellocrossy.biologicalwonders.entity.HarborSealEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class HarborSealRenderer extends ZawaMobRenderer<HarborSealEntity, HarborSealModel> {
    public HarborSealRenderer(EntityRendererManager manager) {
        super(manager, new HarborSealModel.Adult(), new HarborSealModel.Child(), 0.6F);

    }

    @Override
    protected void scale(HarborSealEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

