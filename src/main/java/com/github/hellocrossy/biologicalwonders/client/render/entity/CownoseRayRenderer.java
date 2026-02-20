package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.CownoseRayModel;
import com.github.hellocrossy.biologicalwonders.entity.CownoseRayEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CownoseRayRenderer extends ZawaMobRenderer<CownoseRayEntity, CownoseRayModel> {
    public CownoseRayRenderer(EntityRendererManager manager) {
        super(manager, new CownoseRayModel.Adult(), new CownoseRayModel.Child(), 0.6F);

    }

    @Override
    protected void scale(CownoseRayEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
