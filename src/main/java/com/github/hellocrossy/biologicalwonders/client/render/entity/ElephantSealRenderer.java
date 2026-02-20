package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.ElephantSealModel;
import com.github.hellocrossy.biologicalwonders.entity.ElephantSealEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ElephantSealRenderer extends ZawaMobRenderer<ElephantSealEntity, ElephantSealModel> {
    public ElephantSealRenderer(EntityRendererManager manager) {
        super(manager, new ElephantSealModel.AdultMale(), new ElephantSealModel.Child(), 1.75F);
        adultFemaleModel = new ElephantSealModel.AdultFemale();
    }

    @Override
    protected void scale(ElephantSealEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 1.3F : 1.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(ElephantSealEntity entity) {
        return true;
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}


