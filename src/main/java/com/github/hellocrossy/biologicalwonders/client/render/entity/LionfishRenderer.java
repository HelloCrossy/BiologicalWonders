package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.LionfishModel;
import com.github.hellocrossy.biologicalwonders.entity.LionfishEntity;
import com.github.hellocrossy.biologicalwonders.entity.NapoleonWrasseEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class LionfishRenderer extends ZawaMobRenderer<LionfishEntity, LionfishModel> {
    public LionfishRenderer(EntityRendererManager manager) {
        super(manager, new LionfishModel.Adult(), new LionfishModel.Child(), 0.6F);

    }
    protected void setupRotations(LionfishEntity entity, MatrixStack stack, float p_225621_3_, float p_225621_4_, float p_225621_5_) {
        super.setupRotations(entity, stack, p_225621_3_, p_225621_4_, p_225621_5_);
        float f = 4.3F * MathHelper.sin(0.6F * p_225621_3_);
        stack.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entity.isInWater()) {
            stack.translate(0.10000000149011612, 0.10000000149011612, -0.10000000149011612);
            stack.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }
    @Override
    protected void scale(LionfishEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

