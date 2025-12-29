package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.NapoleonWrasseModel;
import com.github.hellocrossy.biologicalwonders.entity.NapoleonWrasseEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class NapoleonWrasseRenderer extends ZawaMobRenderer<NapoleonWrasseEntity, NapoleonWrasseModel> {
    public NapoleonWrasseRenderer(EntityRendererProvider.Context manager) {
        super(manager, new NapoleonWrasseModel.Adult(), new NapoleonWrasseModel.Child(), 0.6F);

    }
    protected void setupRotations(NapoleonWrasseEntity entity, PoseStack stack, float p_225621_3_, float p_225621_4_, float p_225621_5_) {
        super.setupRotations(entity, stack, p_225621_3_, p_225621_4_, p_225621_5_);
        float f = 4.3F * MathHelper.sin(0.6F * p_225621_3_);
        stack.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entity.isInWater()) {
            stack.translate(0.10000000149011612, 0.10000000149011612, -0.10000000149011612);
            stack.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }
    @Override
    protected void scale(NapoleonWrasseEntity entity, PoseStack PoseStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 1.4F;
        PoseStack.scale(scale, scale, scale);
        super.scale(entity, PoseStack, partialTickTime);
    }
}

