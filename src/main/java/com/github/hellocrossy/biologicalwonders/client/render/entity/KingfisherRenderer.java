package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.KingfisherModel;
import com.github.hellocrossy.biologicalwonders.entity.KingfisherEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KingfisherRenderer extends ZawaMobRenderer<KingfisherEntity, KingfisherModel> {
    public KingfisherRenderer(EntityRendererManager manager) {
        super(manager, new KingfisherModel.Adult(), new KingfisherModel.Flying(), new KingfisherModel.Child(), 0.2F);
    }

    @Override
    protected void scale(KingfisherEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.35F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(KingfisherEntity entity) {
        return false;
    }
}