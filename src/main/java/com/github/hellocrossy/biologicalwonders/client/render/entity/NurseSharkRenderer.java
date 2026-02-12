package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.BioModelLayers;
import com.github.hellocrossy.biologicalwonders.client.model.NurseSharkModel;
import com.github.hellocrossy.biologicalwonders.entity.NurseSharkEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class NurseSharkRenderer extends ZawaMobRenderer<NurseSharkEntity, NurseSharkModel> {
    public NurseSharkRenderer(EntityRendererProvider.Context context) {
        super(context, new NurseSharkModel.Adult(context.bakeLayer(BioModelLayers.NURSE_SHARK_ADULT)), new NurseSharkModel.Child(context.bakeLayer(BioModelLayers.NURSE_SHARK_CHILD)), 0.6F);
    }

    @Override
    protected void scale(NurseSharkEntity entity, PoseStack PoseStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 1.0F;
        PoseStack.scale(scale, scale, scale);
        super.scale(entity, PoseStack, partialTickTime);
    }
}

