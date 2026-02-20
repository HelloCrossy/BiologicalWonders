package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.NurseSharkModel;
import com.github.hellocrossy.biologicalwonders.entity.NapoleonWrasseEntity;
import com.github.hellocrossy.biologicalwonders.entity.NurseSharkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class NurseSharkRenderer extends ZawaMobRenderer<NurseSharkEntity, NurseSharkModel> {
    public NurseSharkRenderer(EntityRendererManager manager) {
        super(manager, new NurseSharkModel.Adult(), new NurseSharkModel.Child(), 0.6F);

    }
    @Override
    protected void scale(NurseSharkEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.85F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

