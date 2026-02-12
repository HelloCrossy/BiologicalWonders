package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.BioModelLayers;
import com.github.hellocrossy.biologicalwonders.client.model.GreySealModel;
import com.github.hellocrossy.biologicalwonders.entity.GreySealEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GreySealRenderer extends ZawaMobRenderer<GreySealEntity, GreySealModel> {
    public GreySealRenderer(EntityRendererProvider.Context context) {
        super(context, new GreySealModel.Adult(context.bakeLayer(BioModelLayers.GREY_SEAL_ADULT)), new GreySealModel.Child(context.bakeLayer(BioModelLayers.GREY_SEAL_CHILD)), 0.6F);
    }

    @Override
    protected void scale(GreySealEntity entity, PoseStack PoseStack, float partialTickTime) {
        float scale = entity.isBaby() ? 1.1F : 1.1F;
        PoseStack.scale(scale, scale, scale);
        super.scale(entity, PoseStack, partialTickTime);
    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }

}

