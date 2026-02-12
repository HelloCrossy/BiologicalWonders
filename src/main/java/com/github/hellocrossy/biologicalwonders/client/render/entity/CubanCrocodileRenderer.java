package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.BioModelLayers;
import com.github.hellocrossy.biologicalwonders.client.model.CubanCrocodileModel;
import com.github.hellocrossy.biologicalwonders.entity.CubanCrocodileEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CubanCrocodileRenderer extends ZawaMobRenderer<CubanCrocodileEntity, CubanCrocodileModel> {
    public CubanCrocodileRenderer(EntityRendererProvider.Context context) {
        super(context, new CubanCrocodileModel.Adult(context.bakeLayer(BioModelLayers.CUBAN_CROCODILE_ADULT)), new CubanCrocodileModel.Child(context.bakeLayer(BioModelLayers.CUBAN_CROCODILE_CHILD)), 0.75F);
    }

    @Override
    protected void scale(CubanCrocodileEntity entity, PoseStack PoseStack, float partialTickTime) {
        float scale = entity.isBaby() ? 1.0F : 1.0F;
        PoseStack.scale(scale, scale, scale);
        super.scale(entity, PoseStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(CubanCrocodileEntity entity) {
        return false;
    }
}
