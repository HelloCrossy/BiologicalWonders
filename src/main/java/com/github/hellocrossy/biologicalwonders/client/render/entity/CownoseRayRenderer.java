package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.BioModelLayers;
import com.github.hellocrossy.biologicalwonders.client.model.CownoseRayModel;
import com.github.hellocrossy.biologicalwonders.entity.CownoseRayEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CownoseRayRenderer extends ZawaMobRenderer<CownoseRayEntity, CownoseRayModel> {
    public CownoseRayRenderer(EntityRendererProvider.Context context) {
        super(context, new CownoseRayModel.Adult(context.bakeLayer(BioModelLayers.COWNOSE_RAY_ADULT)), new CownoseRayModel.Child(context.bakeLayer(BioModelLayers.COWNOSE_RAY_CHILD)), 0.6F);
    }

    @Override
    protected void scale(CownoseRayEntity entity, PoseStack PoseStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 0.95F;
        PoseStack.scale(scale, scale, scale);
        super.scale(entity, PoseStack, partialTickTime);
    }
}
