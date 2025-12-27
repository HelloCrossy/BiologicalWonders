package com.github.hellocrossy.biologicalwonders.client.render.entity;

import com.github.hellocrossy.biologicalwonders.BiologicalWonders;
import com.github.hellocrossy.biologicalwonders.client.model.ButterflyfishModel;
import com.github.hellocrossy.biologicalwonders.entity.ButterflyfishEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class ButterflyfishRenderer extends ZawaMobRenderer<ButterflyfishEntity, ButterflyfishModel> {
    public ButterflyfishRenderer(EntityRendererProvider.Context manager) {
        super(manager, new ButterflyfishModel(), 0.2F);
    }

    @Override
    protected void scale(ButterflyfishEntity entity, PoseStack PoseStack, float partialTickTime) {
        PoseStack.scale(0.5F, 0.5F, 0.5F);
        super.scale(entity, PoseStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(ButterflyfishEntity entity, int variant) {
        if (variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(BiologicalWonders.MOD_ID, "textures/entity/butterflyfish/butterflyfish_" + variantName + ".png");
        } else return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }
}
