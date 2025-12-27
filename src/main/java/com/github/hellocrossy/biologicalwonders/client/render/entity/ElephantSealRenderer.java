package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.client.model.ElephantSealModel;
import com.github.hellocrossy.biologicalwonders.entity.ElephantSealEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ElephantSealRenderer extends ZawaMobRenderer<ElephantSealEntity, ElephantSealModel> {
    public ElephantSealRenderer(EntityRendererProvider.Context manager) {
        super(manager, new ElephantSealModel.AdultMale(), new ElephantSealModel.Child(), 2.25F);
        adultFemaleModel = new ElephantSealModel.AdultFemale();
    }

    @Override
    protected void scale(ElephantSealEntity entity, PoseStack PoseStack, float partialTickTime) {
        float scale = entity.isBaby() ? 1.3F : 1.7F;
        PoseStack.scale(scale, scale, scale);
        super.scale(entity, PoseStack, partialTickTime);
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


