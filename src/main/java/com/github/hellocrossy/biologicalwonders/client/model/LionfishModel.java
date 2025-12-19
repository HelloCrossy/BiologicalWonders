package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.LionfishEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class LionfishModel extends ZawaBaseModel<LionfishEntity> {
    public ModelRenderer Body;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends LionfishModel {
        public ModelRenderer Hips;
        public ModelRenderer Chest;
        public ModelRenderer DorsalFin1;
        public ModelRenderer PectoralFinRight;
        public ModelRenderer PectoralFinLeft;
        public ModelRenderer Tail1;
        public ModelRenderer DorsalFin2;
        public ModelRenderer Tail2;
        public ModelRenderer TailFin;
        public ModelRenderer AnalFin;
        public ModelRenderer Head;
        public ModelRenderer RightEye;
        public ModelRenderer LeftEye;
        public ModelRenderer Mouth1;
        public ModelRenderer EyelashRight;
        public ModelRenderer EyelashLeft;
        public ModelRenderer Mouth2;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.RightEye = new ModelRenderer(this, 29, 0);
            this.RightEye.mirror = true;
            this.RightEye.setPos(-1.0F, 0.5F, -2.8F);
            this.RightEye.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEye, 0.8196066007575706F, 0.0F, 0.0F);
            this.TailFin = new ModelRenderer(this, 17, 12);
            this.TailFin.mirror = true;
            this.TailFin.setPos(0.0F, 0.0F, 1.0F);
            this.TailFin.addBox(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.PectoralFinLeft = new ModelRenderer(this, -1, 13);
            this.PectoralFinLeft.mirror = true;
            this.PectoralFinLeft.setPos(1.9F, 0.5F, -2.5F);
            this.PectoralFinLeft.addBox(0.0F, -4.5F, 0.0F, 0.0F, 9.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft, -0.23457224414434488F, 0.5462880425584197F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 0);
            this.Tail2.setPos(0.0F, -0.1F, 2.0F);
            this.Tail2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 44, 0);
            this.Tail1.setPos(0.0F, 0.2F, 2.2F);
            this.Tail1.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.19547687289441354F, 0.0F, 0.0F);
            this.LeftEye = new ModelRenderer(this, 29, 0);
            this.LeftEye.setPos(1.0F, 0.5F, -2.8F);
            this.LeftEye.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEye, 0.8196066007575706F, 0.0F, 0.0F);
            this.Mouth1 = new ModelRenderer(this, 30, 7);
            this.Mouth1.setPos(0.0F, 1.1F, 0.0F);
            this.Mouth1.addBox(-0.8F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth1, -1.2747885016356248F, 0.0F, 0.0F);
            this.DorsalFin1 = new ModelRenderer(this, 34, 7);
            this.DorsalFin1.mirror = true;
            this.DorsalFin1.setPos(0.0F, -1.4F, 0.6F);
            this.DorsalFin1.addBox(0.0F, -6.0F, -4.5F, 0.0F, 7.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(DorsalFin1, 0.0781907508222411F, 0.0F, 0.0F);
            this.Mouth2 = new ModelRenderer(this, 30, 7);
            this.Mouth2.setPos(0.0F, 0.0F, 0.0F);
            this.Mouth2.addBox(-0.2F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 20, 7);
            this.Head.setPos(0.0F, 1.21F, -1.05F);
            this.Head.addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.8196066007575706F, 0.0F, 0.0F);
            this.DorsalFin2 = new ModelRenderer(this, 7, 13);
            this.DorsalFin2.mirror = true;
            this.DorsalFin2.setPos(0.0F, -1.5F, 3.5F);
            this.DorsalFin2.addBox(0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 20, 0);
            this.Hips.setPos(0.0F, -0.2F, 0.5F);
            this.Hips.addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.19547687289441354F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 18.21F, 0.4F);
            this.Body.addBox(-2.0F, -2.5F, -3.0F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 32, 0);
            this.Chest.setPos(0.0F, -0.3F, -2.4F);
            this.Chest.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.27366763203903305F, 0.0F, 0.0F);
            this.AnalFin = new ModelRenderer(this, 7, 10);
            this.AnalFin.mirror = true;
            this.AnalFin.setPos(0.0F, 3.5F, -1.4F);
            this.AnalFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(AnalFin, 0.5473352640780661F, 0.0F, 0.0F);
            this.EyelashRight = new ModelRenderer(this, 0, 17);
            this.EyelashRight.setPos(-0.1F, 0.0F, 0.0F);
            this.EyelashRight.addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EyelashRight, -0.27314402127920984F, 0.0F, 0.0F);
            this.PectoralFinRight = new ModelRenderer(this, -1, 13);
            this.PectoralFinRight.setPos(-1.9F, 0.5F, -2.5F);
            this.PectoralFinRight.addBox(0.0F, -4.5F, 0.0F, 0.0F, 9.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight, -0.23457224414434488F, -0.5462880425584197F, 0.0F);
            this.EyelashLeft = new ModelRenderer(this, 0, 17);
            this.EyelashLeft.mirror = true;
            this.EyelashLeft.setPos(0.1F, 0.0F, 0.0F);
            this.EyelashLeft.addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EyelashLeft, -0.27314402127920984F, 0.0F, 0.0F);
            this.Head.addChild(this.RightEye);
            this.Tail2.addChild(this.TailFin);
            this.Body.addChild(this.PectoralFinLeft);
            this.Tail1.addChild(this.Tail2);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.LeftEye);
            this.Head.addChild(this.Mouth1);
            this.Body.addChild(this.DorsalFin1);
            this.Mouth1.addChild(this.Mouth2);
            this.Chest.addChild(this.Head);
            this.Hips.addChild(this.DorsalFin2);
            this.Body.addChild(this.Hips);
            this.Body.addChild(this.Chest);
            this.DorsalFin2.addChild(this.AnalFin);
            this.RightEye.addChild(this.EyelashRight);
            this.Body.addChild(this.PectoralFinRight);
            this.LeftEye.addChild(this.EyelashLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(LionfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Tail1.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 2.0F;
            float degree = 3.0F;
            this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.Hips.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F;
            this.PectoralFinLeft.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.409F;
            this.PectoralFinRight.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.409F;
            this.Mouth2.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.3F) * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 2.0F;
                float degree = 3.0F;
                this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
                this.Hips.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * -0.9F) * limbSwingAmount * 0.5F;
                this.Tail1.yRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 2.5F) * limbSwingAmount * 0.5F;
            }
        }
    }

    public static class Child extends LionfishModel {
        public ModelRenderer Hips;
        public ModelRenderer Chest;
        public ModelRenderer DorsalFin1;
        public ModelRenderer PectoralFinRight;
        public ModelRenderer PectoralFinLeft;
        public ModelRenderer Tail1;
        public ModelRenderer DorsalFin2;
        public ModelRenderer Tail2;
        public ModelRenderer TailFin;
        public ModelRenderer AnalFin;
        public ModelRenderer Head;
        public ModelRenderer RightEye;
        public ModelRenderer LeftEye;
        public ModelRenderer Mouth1;
        public ModelRenderer EyelashRight;
        public ModelRenderer EyelashLeft;
        public ModelRenderer Mouth2;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.RightEye = new ModelRenderer(this, 29, 0);
            this.RightEye.mirror = true;
            this.RightEye.setPos(-1.0F, 0.5F, -2.8F);
            this.RightEye.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEye, 0.8196066007575706F, 0.0F, 0.0F);
            this.TailFin = new ModelRenderer(this, 17, 12);
            this.TailFin.mirror = true;
            this.TailFin.setPos(0.0F, 0.0F, 1.0F);
            this.TailFin.addBox(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.PectoralFinLeft = new ModelRenderer(this, -1, 13);
            this.PectoralFinLeft.mirror = true;
            this.PectoralFinLeft.setPos(1.9F, 0.5F, -2.5F);
            this.PectoralFinLeft.addBox(0.0F, -4.5F, 0.0F, 0.0F, 9.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft, -0.23457224414434488F, 0.5462880425584197F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 0);
            this.Tail2.setPos(0.0F, -0.1F, 2.0F);
            this.Tail2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 44, 0);
            this.Tail1.setPos(0.0F, 0.2F, 2.2F);
            this.Tail1.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.19547687289441354F, 0.0F, 0.0F);
            this.LeftEye = new ModelRenderer(this, 29, 0);
            this.LeftEye.setPos(1.0F, 0.5F, -2.8F);
            this.LeftEye.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEye, 0.8196066007575706F, 0.0F, 0.0F);
            this.Mouth1 = new ModelRenderer(this, 30, 7);
            this.Mouth1.setPos(0.0F, 1.1F, 0.0F);
            this.Mouth1.addBox(-0.8F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth1, -1.2747885016356248F, 0.0F, 0.0F);
            this.DorsalFin1 = new ModelRenderer(this, 34, 7);
            this.DorsalFin1.mirror = true;
            this.DorsalFin1.setPos(0.0F, -1.4F, 0.6F);
            this.DorsalFin1.addBox(0.0F, -6.0F, -4.5F, 0.0F, 7.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(DorsalFin1, 0.0781907508222411F, 0.0F, 0.0F);
            this.Mouth2 = new ModelRenderer(this, 30, 7);
            this.Mouth2.setPos(0.0F, 0.0F, 0.0F);
            this.Mouth2.addBox(-0.2F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 20, 7);
            this.Head.setPos(0.0F, 1.21F, -1.05F);
            this.Head.addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.8196066007575706F, 0.0F, 0.0F);
            this.DorsalFin2 = new ModelRenderer(this, 7, 13);
            this.DorsalFin2.mirror = true;
            this.DorsalFin2.setPos(0.0F, -1.5F, 3.5F);
            this.DorsalFin2.addBox(0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 20, 0);
            this.Hips.setPos(0.0F, -0.2F, 0.5F);
            this.Hips.addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.19547687289441354F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 18.21F, 0.4F);
            this.Body.addBox(-2.0F, -2.5F, -3.0F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 32, 0);
            this.Chest.setPos(0.0F, -0.3F, -2.4F);
            this.Chest.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.27366763203903305F, 0.0F, 0.0F);
            this.AnalFin = new ModelRenderer(this, 7, 10);
            this.AnalFin.mirror = true;
            this.AnalFin.setPos(0.0F, 3.5F, -1.4F);
            this.AnalFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(AnalFin, 0.5473352640780661F, 0.0F, 0.0F);
            this.EyelashRight = new ModelRenderer(this, 0, 17);
            this.EyelashRight.setPos(-0.1F, 0.0F, 0.0F);
            this.EyelashRight.addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EyelashRight, -0.27314402127920984F, 0.0F, 0.0F);
            this.PectoralFinRight = new ModelRenderer(this, -1, 13);
            this.PectoralFinRight.setPos(-1.9F, 0.5F, -2.5F);
            this.PectoralFinRight.addBox(0.0F, -4.5F, 0.0F, 0.0F, 9.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight, -0.23457224414434488F, -0.5462880425584197F, 0.0F);
            this.EyelashLeft = new ModelRenderer(this, 0, 17);
            this.EyelashLeft.mirror = true;
            this.EyelashLeft.setPos(0.1F, 0.0F, 0.0F);
            this.EyelashLeft.addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EyelashLeft, -0.27314402127920984F, 0.0F, 0.0F);
            this.Head.addChild(this.RightEye);
            this.Tail2.addChild(this.TailFin);
            this.Body.addChild(this.PectoralFinLeft);
            this.Tail1.addChild(this.Tail2);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.LeftEye);
            this.Head.addChild(this.Mouth1);
            this.Body.addChild(this.DorsalFin1);
            this.Mouth1.addChild(this.Mouth2);
            this.Chest.addChild(this.Head);
            this.Hips.addChild(this.DorsalFin2);
            this.Body.addChild(this.Hips);
            this.Body.addChild(this.Chest);
            this.DorsalFin2.addChild(this.AnalFin);
            this.RightEye.addChild(this.EyelashRight);
            this.Body.addChild(this.PectoralFinRight);
            this.LeftEye.addChild(this.EyelashLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(LionfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Tail1.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 2.0F;
            float degree = 3.0F;
            this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.Hips.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F;
            this.PectoralFinLeft.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.409F;
            this.PectoralFinRight.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.409F;
            this.Mouth2.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.3F) * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 2.0F;
                float degree = 3.0F;
                this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
                this.Hips.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * -0.9F) * limbSwingAmount * 0.5F;
                this.Tail1.yRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 2.5F) * limbSwingAmount * 0.5F;
            }
        }
    }
}
