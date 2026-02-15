package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.BioModelLayers;
import com.github.hellocrossy.biologicalwonders.client.model.KingfisherModel;
import com.github.hellocrossy.biologicalwonders.entity.KingfisherEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KingfisherRenderer extends ZawaMobRenderer<KingfisherEntity, KingfisherModel> {
    public KingfisherRenderer(EntityRendererProvider.Context context) {
        super(context, new KingfisherModel.Adult(context.bakeLayer(BioModelLayers.KINGFISHER_ADULT)), new KingfisherModel.Flying(context.bakeLayer(BioModelLayers.KINGFISHER_FLYING)), new KingfisherModel.Child(context.bakeLayer(BioModelLayers.KINGFISHER_CHILD)), 0.2F);
    }

    @Override
    protected void scale(KingfisherEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.75F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean hasBabyVariants(KingfisherEntity entity) {
        return false;
    }
}