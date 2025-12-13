package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.AlligatorGarModel;
import com.github.hellocrossy.biologicalwonders.entity.AlligatorGarEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AlligatorGarRenderer extends ZawaMobRenderer<AlligatorGarEntity, AlligatorGarModel> {
    public AlligatorGarRenderer(EntityRendererManager manager) {
        super(manager, new AlligatorGarModel.Adult(), new AlligatorGarModel.Child(), 0.6F);

    }

    @Override
    protected void scale(AlligatorGarEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.455F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
