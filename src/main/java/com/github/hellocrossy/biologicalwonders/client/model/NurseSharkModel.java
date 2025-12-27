package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.NurseSharkEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class NurseSharkModel extends ZawaBaseModel<NurseSharkEntity> {
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

    public static class Adult extends NurseSharkModel {
        public ModelRenderer Hips;
        public ModelRenderer PectoralFinLeft1;
        public ModelRenderer PectoralFinRight1;
        public ModelRenderer Neck;
        public ModelRenderer Tail1;
        public ModelRenderer BackTailFin1;
        public ModelRenderer Tail2;
        public ModelRenderer UnderFinLeft;
        public ModelRenderer UnderfinRight;
        public ModelRenderer Tail3;
        public ModelRenderer BackTailFin3;
        public ModelRenderer TailFinTop;
        public ModelRenderer UnderFin1;
        public ModelRenderer TailFinLower;
        public ModelRenderer TailFinLower2;
        public ModelRenderer BackTailFin4;
        public ModelRenderer BackTailFin2;
        public ModelRenderer PectoralFinLeft2;
        public ModelRenderer PectoralFinLeft3;
        public ModelRenderer PectoralFinRight2;
        public ModelRenderer PectoralFinRight3;
        public ModelRenderer HeadConnection;
        public ModelRenderer Head;
        public ModelRenderer Jaw1;
        public ModelRenderer Snout;
        public ModelRenderer WhiskerLeft;
        public ModelRenderer WhiskerRight;
        public ModelRenderer Jaw2;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.HeadConnection = new ModelRenderer(this, 22, 10);
            this.HeadConnection.setPos(0.0F, 0.5F, -3.4F);
            this.HeadConnection.addBox(-3.0F, -0.55F, -0.9F, 6.0F, 5.0F, 1.0F, 0.0F, -0.1F, 0.0F);
            this.setRotateAngle(HeadConnection, 0.19547687289441354F, 0.0F, 0.0F);
            this.UnderFinLeft = new ModelRenderer(this, 54, 39);
            this.UnderFinLeft.mirror = true;
            this.UnderFinLeft.setPos(1.6F, 4.5F, 4.0F);
            this.UnderFinLeft.addBox(0.0F, 0.5F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFinLeft, 0.5473352640780661F, 0.0F, -0.8600982340775168F);
            this.WhiskerRight = new ModelRenderer(this, 40, 20);
            this.WhiskerRight.setPos(-1.5F, 2.0F, -2.0F);
            this.WhiskerRight.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WhiskerRight, 0.0F, 0.3127630032889644F, 0.4300491170387584F);
            this.Tail1 = new ModelRenderer(this, 0, 25);
            this.Tail1.setPos(0.0F, 0.0F, 5.0F);
            this.Tail1.addBox(-3.0F, -0.1F, -1.0F, 6.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.0781907508222411F, 0.0F, 0.0F);
            this.TailFinLower2 = new ModelRenderer(this, 58, 56);
            this.TailFinLower2.setPos(0.0F, 3.0F, -1.0F);
            this.TailFinLower2.addBox(-0.5F, 0.0F, -0.6F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinLower2, 0.03909537541112055F, 0.0F, 0.0F);
            this.TailFinLower = new ModelRenderer(this, 38, 37);
            this.TailFinLower.setPos(0.0F, 1.9F, 0.1F);
            this.TailFinLower.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 11.0F, -0.01F, -0.1F, 0.0F);
            this.setRotateAngle(TailFinLower, 0.19547687289441354F, 0.0F, 0.0F);
            this.PectoralFinLeft1 = new ModelRenderer(this, 48, 0);
            this.PectoralFinLeft1.setPos(4.0F, 2.5F, -1.0F);
            this.PectoralFinLeft1.addBox(-0.5F, -0.5F, -2.5F, 3.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft1, 0.0F, 0.03909537541112055F, 0.6646214111173737F);
            this.WhiskerLeft = new ModelRenderer(this, 40, 20);
            this.WhiskerLeft.setPos(1.5F, 2.0F, -2.0F);
            this.WhiskerLeft.addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WhiskerLeft, 0.0F, -0.3127630032889644F, -0.4300491170387584F);
            this.Snout = new ModelRenderer(this, 37, 11);
            this.Snout.setPos(0.0F, 0.0F, -2.1F);
            this.Snout.addBox(-2.5F, -0.5F, -2.0F, 5.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.11728612207217244F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 37);
            this.Hips.setPos(0.0F, -1.9F, 4.5F);
            this.Hips.addBox(-3.5F, -0.5F, -0.5F, 7.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.03909537541112055F, 0.0F, 0.0F);
            this.Jaw1 = new ModelRenderer(this, 23, 23);
            this.Jaw1.setPos(0.0F, 3.9F, -0.5F);
            this.Jaw1.addBox(-2.5F, -2.5F, -2.7F, 5.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw1, -0.23457224414434488F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 0, 6);
            this.Tail3.setPos(0.0F, 1.0F, 5.0F);
            this.Tail3.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, -0.0781907508222411F, 0.0F, 0.0F);
            this.BackTailFin4 = new ModelRenderer(this, 41, 54);
            this.BackTailFin4.setPos(0.0F, 0.0F, 1.5F);
            this.BackTailFin4.addBox(-0.5F, -4.6F, 0.55F, 1.0F, 5.0F, 2.0F, -0.01F, 0.0F, -0.05F);
            this.setRotateAngle(BackTailFin4, 0.6255260065779288F, 0.0F, 0.0F);
            this.BackTailFin3 = new ModelRenderer(this, 35, 53);
            this.BackTailFin3.setPos(0.0F, 1.2F, 1.0F);
            this.BackTailFin3.addBox(-0.5F, -5.2F, -0.9F, 1.0F, 6.0F, 2.0F, 0.0F, 0.0F, -0.2F);
            this.setRotateAngle(BackTailFin3, -0.9773843811168246F, 0.0F, 0.0F);
            this.PectoralFinLeft2 = new ModelRenderer(this, 52, 6);
            this.PectoralFinLeft2.setPos(2.5F, 0.0F, 2.0F);
            this.PectoralFinLeft2.addBox(0.0F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.PectoralFinRight3 = new ModelRenderer(this, 37, 0);
            this.PectoralFinRight3.setPos(-2.2F, 0.01F, -2.1F);
            this.PectoralFinRight3.addBox(-5.0F, -0.5F, -0.5F, 5.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight3, 0.0F, 0.46914448828868976F, 0.0F);
            this.PectoralFinLeft3 = new ModelRenderer(this, 37, 0);
            this.PectoralFinLeft3.setPos(2.2F, 0.01F, -2.1F);
            this.PectoralFinLeft3.addBox(0.0F, -0.5F, -0.5F, 5.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft3, 0.0F, -0.46914448828868976F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 15);
            this.Tail2.setPos(0.0F, 0.0F, 5.5F);
            this.Tail2.addBox(-2.0F, 0.5F, 0.0F, 4.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.03909537541112055F, 0.0F, 0.0F);
            this.BackTailFin1 = new ModelRenderer(this, 28, 43);
            this.BackTailFin1.setPos(0.0F, 0.0F, 4.0F);
            this.BackTailFin1.addBox(-0.5F, -6.0F, -1.2F, 1.0F, 7.0F, 3.0F, 0.0F, 0.0F, -0.2F);
            this.setRotateAngle(BackTailFin1, -0.8210028961170991F, 0.0F, 0.0F);
            this.TailFinTop = new ModelRenderer(this, 36, 50);
            this.TailFinTop.setPos(0.0F, -0.7F, 4.2F);
            this.TailFinTop.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop, 0.6255260065779288F, 0.0F, 0.0F);
            this.BackTailFin2 = new ModelRenderer(this, 40, 39);
            this.BackTailFin2.setPos(0.0F, 0.0F, 2.5F);
            this.BackTailFin2.addBox(-0.5F, -5.3F, -0.25F, 1.0F, 5.0F, 3.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(BackTailFin2, 0.6255260065779288F, 0.0F, 0.0F);
            this.PectoralFinRight2 = new ModelRenderer(this, 52, 6);
            this.PectoralFinRight2.setPos(-2.5F, 0.0F, 2.0F);
            this.PectoralFinRight2.addBox(-3.0F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.UnderfinRight = new ModelRenderer(this, 54, 39);
            this.UnderfinRight.setPos(-1.6F, 4.5F, 4.0F);
            this.UnderfinRight.addBox(-1.0F, 0.5F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderfinRight, 0.5473352640780661F, 0.0F, 0.8600982340775168F);
            this.Jaw2 = new ModelRenderer(this, 30, 30);
            this.Jaw2.setPos(0.0F, 0.0F, -2.3F);
            this.Jaw2.addBox(-2.0F, -1.5F, -2.0F, 4.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw2, -0.15620696472454113F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 21, 16);
            this.Head.setPos(0.0F, 0.05F, -0.5F);
            this.Head.addBox(-3.0F, -0.5F, -2.4F, 6.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 18, 1);
            this.Neck.setPos(0.0F, -2.0F, -4.5F);
            this.Neck.addBox(-3.5F, 0.0F, -3.5F, 7.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.11728612207217244F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 49);
            this.Body.setPos(0.0F, 17.0F, -5.0F);
            this.Body.addBox(-4.0F, -2.5F, -4.5F, 8.0F, 6.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.PectoralFinRight1 = new ModelRenderer(this, 48, 0);
            this.PectoralFinRight1.mirror = true;
            this.PectoralFinRight1.setPos(-4.0F, 2.5F, -1.0F);
            this.PectoralFinRight1.addBox(-2.5F, -0.5F, -2.5F, 3.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight1, 0.0F, -0.03909537541112055F, -0.6646214111173737F);
            this.UnderFin1 = new ModelRenderer(this, 52, 53);
            this.UnderFin1.setPos(0.0F, 2.5F, 1.0F);
            this.UnderFin1.addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFin1, 0.46914448828868976F, 0.0F, 0.0F);
            this.Neck.addChild(this.HeadConnection);
            this.Tail1.addChild(this.UnderFinLeft);
            this.Snout.addChild(this.WhiskerRight);
            this.Hips.addChild(this.Tail1);
            this.TailFinTop.addChild(this.TailFinLower2);
            this.TailFinTop.addChild(this.TailFinLower);
            this.Body.addChild(this.PectoralFinLeft1);
            this.Snout.addChild(this.WhiskerLeft);
            this.Head.addChild(this.Snout);
            this.Body.addChild(this.Hips);
            this.HeadConnection.addChild(this.Jaw1);
            this.Tail2.addChild(this.Tail3);
            this.BackTailFin3.addChild(this.BackTailFin4);
            this.Tail2.addChild(this.BackTailFin3);
            this.PectoralFinLeft1.addChild(this.PectoralFinLeft2);
            this.PectoralFinRight1.addChild(this.PectoralFinRight3);
            this.PectoralFinLeft1.addChild(this.PectoralFinLeft3);
            this.Tail1.addChild(this.Tail2);
            this.Hips.addChild(this.BackTailFin1);
            this.Tail3.addChild(this.TailFinTop);
            this.BackTailFin1.addChild(this.BackTailFin2);
            this.PectoralFinRight1.addChild(this.PectoralFinRight2);
            this.Tail1.addChild(this.UnderfinRight);
            this.Jaw1.addChild(this.Jaw2);
            this.HeadConnection.addChild(this.Head);
            this.Body.addChild(this.Neck);
            this.Body.addChild(this.PectoralFinRight1);
            this.Tail3.addChild(this.UnderFin1);
            this.saveBase();

        }

        @Override
        public void setupAnim(NurseSharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Tail2 .yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.Tail1.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F;
            this.PectoralFinLeft1.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.409F;
            this.PectoralFinRight1.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.409F;
            this.Jaw2.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.3F) * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 1.0F;
                float degree = 1.0F;
                this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
                this.Tail1.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * -0.9F) * limbSwingAmount * 0.5F;
                this.Tail2.yRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 2.5F) * limbSwingAmount * 0.5F;
            }
        }
    }

    public static class Child extends NurseSharkModel {
        public ModelRenderer Hips;
        public ModelRenderer PectoralFinLeft;
        public ModelRenderer DorsalFinFront;
        public ModelRenderer Head;
        public ModelRenderer PectoralFinRight;
        public ModelRenderer Tail;
        public ModelRenderer DorsalFinBack;
        public ModelRenderer UnderFinLeft;
        public ModelRenderer UnderFinRight;
        public ModelRenderer TailFinTop;
        public ModelRenderer UnderFin1;
        public ModelRenderer TailFinLower2;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.UnderFinLeft = new ModelRenderer(this, 27, 8);
            this.UnderFinLeft.setPos(0.0F, 1.8F, 2.8F);
            this.UnderFinLeft.addBox(0.0F, 0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFinLeft, 0.5473352640780661F, 0.0F, -0.8600982340775168F);
            this.TailFinTop = new ModelRenderer(this, 17, 0);
            this.TailFinTop.setPos(0.0F, -0.5F, 2.9F);
            this.TailFinTop.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop, 0.6255260065779288F, 0.0F, 0.0F);
            this.DorsalFinFront = new ModelRenderer(this, 26, 0);
            this.DorsalFinFront.setPos(0.0F, -1.0F, 0.0F);
            this.DorsalFinFront.addBox(-0.5F, -2.5F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(DorsalFinFront, -0.547160727158125F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 11, 19);
            this.Snout.setPos(0.0F, -1.0F, -0.8F);
            this.Snout.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.4300491170387584F, 0.0F, 0.0F);
            this.PectoralFinLeft = new ModelRenderer(this, 22, 12);
            this.PectoralFinLeft.setPos(1.5F, 0.5F, -0.5F);
            this.PectoralFinLeft.addBox(-0.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft, 0.0F, -0.4300491170387584F, 0.6646214111173737F);
            this.Tail = new ModelRenderer(this, 0, 14);
            this.Tail.setPos(0.0F, 0.0F, 3.7F);
            this.Tail.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.07836527941980377F, 0.0F, 0.0F);
            this.PectoralFinRight = new ModelRenderer(this, 22, 12);
            this.PectoralFinRight.mirror = true;
            this.PectoralFinRight.setPos(-1.5F, 0.5F, -0.5F);
            this.PectoralFinRight.addBox(-2.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight, 0.0F, 0.4300491170387584F, -0.6646214111173737F);
            this.DorsalFinBack = new ModelRenderer(this, 16, 0);
            this.DorsalFinBack.setPos(0.0F, 0.0F, 2.0F);
            this.DorsalFinBack.addBox(-0.5F, -1.4F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(DorsalFinBack, -0.3127630032889644F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 7);
            this.Hips.setPos(0.0F, -1.0F, 1.9F);
            this.Hips.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.11728612207217244F, 0.0F, 0.0F);
            this.UnderFinRight = new ModelRenderer(this, 27, 8);
            this.UnderFinRight.mirror = true;
            this.UnderFinRight.setPos(0.0F, 1.8F, 2.8F);
            this.UnderFinRight.addBox(-1.0F, 0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFinRight, 0.5473352640780661F, 0.0F, 0.8600982340775168F);
            this.TailFinLower2 = new ModelRenderer(this, 22, 8);
            this.TailFinLower2.setPos(0.0F, 1.9F, -1.0F);
            this.TailFinLower2.addBox(-0.5F, 0.0F, -0.6F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinLower2, 0.03909537541112055F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 19);
            this.Head.setPos(0.0F, 0.1F, -2.8F);
            this.Head.addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.11728612207217244F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 20.5F, -2.0F);
            this.Body.addBox(-2.0F, -1.5F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.UnderFin1 = new ModelRenderer(this, 22, 8);
            this.UnderFin1.setPos(0.0F, 1.6F, 1.0F);
            this.UnderFin1.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFin1, 0.46914448828868976F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 24);
            this.Mouth.setPos(0.0F, 0.7F, 0.0F);
            this.Mouth.addBox(-1.0F, 0.0F, -1.8F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.23457224414434488F, 0.0F, 0.0F);
            this.Hips.addChild(this.UnderFinLeft);
            this.Tail.addChild(this.TailFinTop);
            this.Body.addChild(this.DorsalFinFront);
            this.Head.addChild(this.Snout);
            this.Body.addChild(this.PectoralFinLeft);
            this.Hips.addChild(this.Tail);
            this.Body.addChild(this.PectoralFinRight);
            this.Hips.addChild(this.DorsalFinBack);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.UnderFinRight);
            this.TailFinTop.addChild(this.TailFinLower2);
            this.Body.addChild(this.Head);
            this.Tail.addChild(this.UnderFin1);
            this.Head.addChild(this.Mouth);
            this.saveBase();

        }

        @Override
        public void setupAnim(NurseSharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            limbSwing *= 2.0F;
            limbSwingAmount = 0.15F;
            float speed = 1.2F;
            float degree = 1.0F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 0.7F;
            } else {
            }
        }
    }
}
