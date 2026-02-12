package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.BioModelLayers;
import com.github.hellocrossy.biologicalwonders.client.model.BlacktipSharkModel;
import com.github.hellocrossy.biologicalwonders.entity.BlacktipSharkEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BlacktipSharkRenderer extends ZawaMobRenderer<BlacktipSharkEntity, BlacktipSharkModel> {
    public BlacktipSharkRenderer(EntityRendererProvider.Context context) {
        super(context, new BlacktipSharkModel.Adult(context.bakeLayer(BioModelLayers.BLACKTIP_SHARK_ADULT)), new BlacktipSharkModel.Child(context.bakeLayer(BioModelLayers.BLACKTIP_SHARK_CHILD)), 0.6F);
    }

    protected void setupRotations(BlacktipSharkEntity entity, PoseStack stack, float p_225621_3_, float p_225621_4_, float p_225621_5_) {
        super.setupRotations(entity, stack, p_225621_3_, p_225621_4_, p_225621_5_);
        float f = 4.3F * Mth.sin(0.6F * p_225621_3_);
        stack.mulPose(Axis.YP.rotationDegrees(f));
        if (!entity.isInWater()) {
            stack.translate(0.1, 0.1, -0.1);
            stack.mulPose(Axis.ZP.rotationDegrees(90.0F));
        }
    }

    @Override
    protected void scale(BlacktipSharkEntity entity, PoseStack PoseStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 1.0F;
        PoseStack.scale(scale, scale, scale);
        super.scale(entity, PoseStack, partialTickTime);
    }
}

