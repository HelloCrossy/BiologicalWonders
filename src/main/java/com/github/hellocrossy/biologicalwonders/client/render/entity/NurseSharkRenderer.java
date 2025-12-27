package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.NurseSharkModel;
import com.github.hellocrossy.biologicalwonders.entity.NapoleonWrasseEntity;
import com.github.hellocrossy.biologicalwonders.entity.NurseSharkEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class NurseSharkRenderer extends ZawaMobRenderer<NurseSharkEntity, NurseSharkModel> {
    public NurseSharkRenderer(EntityRendererProvider.Context manager) {
        super(manager, new NurseSharkModel.Adult(), new NurseSharkModel.Child(), 0.6F);

    }
    @Override
    protected void scale(NurseSharkEntity entity, PoseStack PoseStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 1.0F;
        PoseStack.scale(scale, scale, scale);
        super.scale(entity, PoseStack, partialTickTime);
    }
}

