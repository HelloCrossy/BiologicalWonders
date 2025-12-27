package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.BiologicalWonders;
import com.github.hellocrossy.biologicalwonders.client.model.HorseshoeCrabModel;
import com.github.hellocrossy.biologicalwonders.entity.HorseshoeCrabEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class HorseshoeCrabRenderer extends ZawaMobRenderer<HorseshoeCrabEntity, HorseshoeCrabModel> {
    public HorseshoeCrabRenderer(EntityRendererManager manager) {
        super(manager, new HorseshoeCrabModel(), 0.2F);
    }

    @Override
    protected void scale(HorseshoeCrabEntity entity, MatrixStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.5F, 0.5F, 0.5F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(HorseshoeCrabEntity entity, int variant) {
        if (variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(BiologicalWonders.MOD_ID, "textures/entity/horseshoe_crab/horseshoe_crab_" + variantName + ".png");
        } else return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }
}
