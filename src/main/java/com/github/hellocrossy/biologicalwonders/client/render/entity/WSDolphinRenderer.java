package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.WSDolphinModel;
import com.github.hellocrossy.biologicalwonders.entity.WSDolphinEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WSDolphinRenderer extends ZawaMobRenderer<WSDolphinEntity, WSDolphinModel> {
    public WSDolphinRenderer(EntityRendererProvider.Context manager) {
        super(manager, new WSDolphinModel.Adult(), new WSDolphinModel.Child(), 1.5F);

    }
    @Override
    protected void scale(WSDolphinEntity entity, PoseStack PoseStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.95F : 1.5F;
        PoseStack.scale(scale, scale, scale);
        super.scale(entity, PoseStack, partialTickTime);
    }
}

