package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.AlligatorGarModel;
import com.github.hellocrossy.biologicalwonders.entity.AlligatorGarEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.world.entity.ambient.ZawaSalmon;

public class AlligatorGarRenderer extends ZawaMobRenderer<AlligatorGarEntity, AlligatorGarModel> {
    public AlligatorGarRenderer(EntityRendererManager manager) {
        super(manager, new AlligatorGarModel.Adult(), new AlligatorGarModel.Child(), 0.6F);

    }

    protected void setupRotations(AlligatorGarEntity entity, MatrixStack stack, float p_225621_3_, float p_225621_4_, float p_225621_5_) {
        super.setupRotations(entity, stack, p_225621_3_, p_225621_4_, p_225621_5_);
        float f = 4.3F * MathHelper.sin(0.6F * p_225621_3_);
        stack.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entity.isInWater()) {
            stack.translate(0.10000000149011612, 0.10000000149011612, -0.10000000149011612);
            stack.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }
        @Override
        protected void scale (AlligatorGarEntity entity, MatrixStack matrixStack,float partialTickTime){
            float scale = entity.isBaby() ? 0.75F : 0.95F;
            matrixStack.scale(scale, scale, scale);
            super.scale(entity, matrixStack, partialTickTime);
        }
    }

