package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.CubanCrocodileModel;
import com.github.hellocrossy.biologicalwonders.entity.CubanCrocodileEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CubanCrocodileRenderer extends ZawaMobRenderer<CubanCrocodileEntity, CubanCrocodileModel> {
    public CubanCrocodileRenderer(EntityRendererManager manager) {
        super(manager, new CubanCrocodileModel.Adult(), new CubanCrocodileModel.Child(), 0.75F);

    }

    @Override
    protected void scale(CubanCrocodileEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(CubanCrocodileEntity entity) {
        return false;
    }
}
