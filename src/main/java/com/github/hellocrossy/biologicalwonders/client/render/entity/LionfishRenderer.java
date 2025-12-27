package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.LionfishModel;
import com.github.hellocrossy.biologicalwonders.entity.LionfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class LionfishRenderer extends ZawaMobRenderer<LionfishEntity, LionfishModel> {
    public LionfishRenderer(EntityRendererManager manager) {
        super(manager, new LionfishModel.Adult(), new LionfishModel.Child(), 0.6F);
    }

    @Override
    protected void scale(LionfishEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

