package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.HarborSealModel;
import com.github.hellocrossy.biologicalwonders.entity.HarborSealEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class HarborSealRenderer extends ZawaMobRenderer<HarborSealEntity, HarborSealModel> {
    public HarborSealRenderer(EntityRendererProvider.Context manager) {
        super(manager, new HarborSealModel.Adult(), new HarborSealModel.Child(), 0.6F);

    }

    @Override
    protected void scale(HarborSealEntity entity, PoseStack PoseStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 0.85F;
        PoseStack.scale(scale, scale, scale);
        super.scale(entity, PoseStack, partialTickTime);
    }
}

