package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.NapoleonWrasseModel;
import com.github.hellocrossy.biologicalwonders.entity.NapoleonWrasseEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class NapoleonWrasseRenderer extends ZawaMobRenderer<NapoleonWrasseEntity, NapoleonWrasseModel> {
    public NapoleonWrasseRenderer(EntityRendererManager manager) {
        super(manager, new NapoleonWrasseModel.Adult(), new NapoleonWrasseModel.Child(), 0.6F);

    }

    @Override
    protected void scale(NapoleonWrasseEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.455F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

