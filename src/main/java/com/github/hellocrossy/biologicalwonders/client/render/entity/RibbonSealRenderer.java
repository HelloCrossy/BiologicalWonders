package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.RibbonSealModel;
import com.github.hellocrossy.biologicalwonders.entity.RibbonSealEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RibbonSealRenderer extends ZawaMobRenderer<RibbonSealEntity, RibbonSealModel> {
    public RibbonSealRenderer(EntityRendererProvider.Context manager) {
        super(manager, new RibbonSealModel.Adult(), new RibbonSealModel.Child(), 0.6F);

    }

    @Override
    protected void scale(RibbonSealEntity entity, PoseStack PoseStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 0.8F;
        PoseStack.scale(scale, scale, scale);
        super.scale(entity, PoseStack, partialTickTime);
    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}

