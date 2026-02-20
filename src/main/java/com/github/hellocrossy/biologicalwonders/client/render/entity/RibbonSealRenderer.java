package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.RibbonSealModel;
import com.github.hellocrossy.biologicalwonders.entity.RibbonSealEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RibbonSealRenderer extends ZawaMobRenderer<RibbonSealEntity, RibbonSealModel> {
    public RibbonSealRenderer(EntityRendererManager manager) {
        super(manager, new RibbonSealModel.Adult(), new RibbonSealModel.Child(), 0.6F);

    }

    @Override
    protected void scale(RibbonSealEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}

