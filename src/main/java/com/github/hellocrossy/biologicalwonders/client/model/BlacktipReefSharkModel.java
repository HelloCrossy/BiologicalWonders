package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.BlacktipReefSharkEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class BlacktipReefSharkModel extends ZawaBaseModel<BlacktipReefSharkEntity> {
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

    public static class Adult extends BlacktipReefSharkModel {
        public ModelRenderer PectoralFinLeft1;
        public ModelRenderer Hips;
        public ModelRenderer PectoralFinRight1;
        public ModelRenderer BackTailFin1;
        public ModelRenderer Head;
        public ModelRenderer PectoralFinLeft2;
        public ModelRenderer PectoralFinLeft3;
        public ModelRenderer Tail1;
        public ModelRenderer UnderFinLeft;
        public ModelRenderer Tail2;
        public ModelRenderer UnderfinRight;
        public ModelRenderer Tail3;
        public ModelRenderer BackTailFin3;
        public ModelRenderer UnderFin1;
        public ModelRenderer TailFinTop;
        public ModelRenderer TailFinLower2;
        public ModelRenderer TailFinLower;
        public ModelRenderer BackTailFin4;
        public ModelRenderer PectoralFinRight3;
        public ModelRenderer PectoralFinRight2;
        public ModelRenderer BackTailFin2;
        public ModelRenderer HeadConnection;
        public ModelRenderer Snout1;
        public ModelRenderer HeadUnder;
        public ModelRenderer Snout2;
        public ModelRenderer TopSnout1;
        public ModelRenderer TopSnout2;
        public ModelRenderer Mouth1;
        public ModelRenderer Mouth2;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.TailFinLower = new ModelRenderer(this, 39, 40);
            this.TailFinLower.setPos(0.0F, 1.9F, 0.3F);
            this.TailFinLower.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 9.0F, -0.01F, -0.1F, 0.0F);
            this.setRotateAngle(TailFinLower, 0.23457224414434488F, 0.0F, 0.0F);
            this.PectoralFinRight3 = new ModelRenderer(this, 37, 0);
            this.PectoralFinRight3.mirror = true;
            this.PectoralFinRight3.setPos(-2.4F, 0.01F, -1.5F);
            this.PectoralFinRight3.addBox(-5.0F, -0.5F, 0.0F, 5.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight3, 0.0F, 0.4300491170387584F, 0.0F);
            this.HeadUnder = new ModelRenderer(this, 42, 26);
            this.HeadUnder.setPos(0.0F, 0.8F, 2.3F);
            this.HeadUnder.addBox(-3.0F, -0.2F, -4.0F, 6.0F, 2.0F, 5.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(HeadUnder, -0.1563815016444822F, 0.0F, 0.0F);
            this.BackTailFin1 = new ModelRenderer(this, 28, 43);
            this.BackTailFin1.setPos(0.0F, -1.0F, 1.0F);
            this.BackTailFin1.addBox(-0.5F, -7.0F, -1.2F, 1.0F, 7.0F, 3.0F, 0.0F, 0.0F, -0.2F);
            this.setRotateAngle(BackTailFin1, -0.6646214111173737F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 25);
            this.Tail1.setPos(0.0F, 0.0F, 4.0F);
            this.Tail1.addBox(-2.5F, -0.1F, -1.0F, 5.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.004188790111159634F, 0.03246312433676588F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 15);
            this.Tail2.setPos(0.0F, 0.1F, 5.5F);
            this.Tail2.addBox(-2.0F, 0.5F, 0.0F, 4.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.03909537541112055F, 0.0F, 0.0F);
            this.Mouth1 = new ModelRenderer(this, 26, 24);
            this.Mouth1.setPos(0.0F, 1.7F, -3.4F);
            this.Mouth1.addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 3.0F, -0.0F, 0.0F, 0.0F);
            this.BackTailFin2 = new ModelRenderer(this, 40, 39);
            this.BackTailFin2.setPos(0.0F, -0.3F, 3.0F);
            this.BackTailFin2.addBox(-0.5F, -6.3F, -0.25F, 1.0F, 6.0F, 3.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(BackTailFin2, 0.6255260065779288F, 0.0F, 0.0F);
            this.PectoralFinLeft3 = new ModelRenderer(this, 37, 0);
            this.PectoralFinLeft3.setPos(2.5F, 0.01F, -1.5F);
            this.PectoralFinLeft3.addBox(0.0F, -0.5F, 0.0F, 5.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft3, 0.0F, -0.4300491170387584F, 0.0F);
            this.TailFinLower2 = new ModelRenderer(this, 56, 55);
            this.TailFinLower2.setPos(0.0F, 2.6F, -2.0F);
            this.TailFinLower2.addBox(-0.5F, 0.0F, -0.6F, 1.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinLower2, 0.03909537541112055F, 0.0F, 0.0F);
            this.Snout1 = new ModelRenderer(this, 24, 18);
            this.Snout1.setPos(0.0F, 0.2F, -1.2F);
            this.Snout1.addBox(-2.5F, -2.0F, -3.0F, 5.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout1, -0.03909537541112055F, 0.0F, 0.0F);
            this.PectoralFinRight1 = new ModelRenderer(this, 48, 0);
            this.PectoralFinRight1.mirror = true;
            this.PectoralFinRight1.setPos(-3.0F, 3.5F, -1.0F);
            this.PectoralFinRight1.addBox(-2.5F, -0.5F, -1.5F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight1, 0.0F, 0.22218040578939488F, -0.7819074915776542F);
            this.Mouth2 = new ModelRenderer(this, 23, 37);
            this.Mouth2.setPos(0.0F, -0.6F, -2.9F);
            this.Mouth2.addBox(-1.5F, -0.5F, -2.4F, 3.0F, 1.0F, 3.0F, -0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth2, 1.7453292129831807E-4F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 39);
            this.Hips.setPos(0.0F, -2.0F, 4.5F);
            this.Hips.addBox(-3.0F, -0.5F, -0.5F, 6.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.03909537541112055F, 0.0F, 0.0F);
            this.TopSnout1 = new ModelRenderer(this, 24, 11);
            this.TopSnout1.setPos(0.0F, -3.0F, -1.0F);
            this.TopSnout1.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 2.0F, 4.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout1, 0.27366763203903305F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 51);
            this.Body.setPos(0.0F, 16.2F, -5.0F);
            this.Body.addBox(-3.5F, -2.5F, -1.5F, 7.0F, 7.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.UnderFinLeft = new ModelRenderer(this, 54, 39);
            this.UnderFinLeft.mirror = true;
            this.UnderFinLeft.setPos(1.1F, 5.5F, 1.0F);
            this.UnderFinLeft.addBox(0.0F, 0.5F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFinLeft, 0.5473352640780661F, 0.0F, -0.8600982340775168F);
            this.TopSnout2 = new ModelRenderer(this, 30, 28);
            this.TopSnout2.setPos(0.0F, 0.0F, -3.6F);
            this.TopSnout2.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, -0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout2, 0.19879300779426656F, 0.003490658556003524F, 0.0F);
            this.HeadConnection = new ModelRenderer(this, 40, 9);
            this.HeadConnection.setPos(0.0F, -2.1F, -2.1F);
            this.HeadConnection.addBox(-3.0F, -0.9F, 0.0F, 6.0F, 2.0F, 5.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(HeadConnection, 0.03630284710990151F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 0, 6);
            this.Tail3.setPos(0.0F, 1.0F, 5.0F);
            this.Tail3.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, -0.03490658503988659F, 0.0F, 0.0F);
            this.TailFinTop = new ModelRenderer(this, 33, 52);
            this.TailFinTop.setPos(0.0F, -0.7F, 4.4F);
            this.TailFinTop.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop, 0.6646214111173737F, 0.0F, 0.0F);
            this.UnderFin1 = new ModelRenderer(this, 52, 53);
            this.UnderFin1.setPos(0.0F, 3.5F, 2.8F);
            this.UnderFin1.addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFin1, 0.9382889765773795F, 0.0F, 0.0F);
            this.PectoralFinRight2 = new ModelRenderer(this, 52, 6);
            this.PectoralFinRight2.mirror = true;
            this.PectoralFinRight2.setPos(-2.5F, 0.0F, 2.0F);
            this.PectoralFinRight2.addBox(-4.0F, -0.5F, -1.5F, 4.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Snout2 = new ModelRenderer(this, 24, 32);
            this.Snout2.setPos(-0.0F, 0.5F, -2.7F);
            this.Snout2.addBox(-2.0F, -2.0F, -2.7F, 4.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.BackTailFin4 = new ModelRenderer(this, 35, 53);
            this.BackTailFin4.setPos(0.0F, 0.2F, 1.0F);
            this.BackTailFin4.addBox(-0.5F, -3.6F, 0.55F, 1.0F, 4.0F, 2.0F, -0.01F, 0.0F, -0.05F);
            this.setRotateAngle(BackTailFin4, 0.6255260065779288F, 0.0F, 0.0F);
            this.UnderfinRight = new ModelRenderer(this, 54, 39);
            this.UnderfinRight.setPos(-1.1F, 5.5F, 1.0F);
            this.UnderfinRight.addBox(-1.0F, 0.5F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderfinRight, 0.5473352640780661F, 0.0F, 0.8600982340775168F);
            this.Head = new ModelRenderer(this, 40, 17);
            this.Head.setPos(0.0F, 1.3F, -3.7F);
            this.Head.addBox(-3.0F, -2.0F, -2.0F, 6.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.1171115934746098F, 0.0F, 0.0F);
            this.PectoralFinLeft2 = new ModelRenderer(this, 52, 6);
            this.PectoralFinLeft2.setPos(2.5F, 0.0F, 3.0F);
            this.PectoralFinLeft2.addBox(0.0F, -0.5F, -2.5F, 4.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.PectoralFinLeft1 = new ModelRenderer(this, 48, 0);
            this.PectoralFinLeft1.setPos(3.0F, 3.5F, -1.0F);
            this.PectoralFinLeft1.addBox(-0.5F, -0.5F, -1.5F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft1, 0.0F, -0.22218040578939488F, 0.7819074915776542F);
            this.BackTailFin3 = new ModelRenderer(this, 29, 53);
            this.BackTailFin3.setPos(0.0F, 1.2F, 2.0F);
            this.BackTailFin3.addBox(-0.5F, -4.2F, -0.9F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, -0.2F);
            this.setRotateAngle(BackTailFin3, -0.9773843811168246F, 0.0F, 0.0F);
            this.TailFinTop.addChild(this.TailFinLower);
            this.PectoralFinRight1.addChild(this.PectoralFinRight3);
            this.Head.addChild(this.HeadUnder);
            this.Body.addChild(this.BackTailFin1);
            this.Hips.addChild(this.Tail1);
            this.Tail1.addChild(this.Tail2);
            this.HeadUnder.addChild(this.Mouth1);
            this.BackTailFin1.addChild(this.BackTailFin2);
            this.PectoralFinLeft1.addChild(this.PectoralFinLeft3);
            this.TailFinTop.addChild(this.TailFinLower2);
            this.Head.addChild(this.Snout1);
            this.Body.addChild(this.PectoralFinRight1);
            this.Mouth1.addChild(this.Mouth2);
            this.Body.addChild(this.Hips);
            this.Snout1.addChild(this.TopSnout1);
            this.Tail1.addChild(this.UnderFinLeft);
            this.TopSnout1.addChild(this.TopSnout2);
            this.Head.addChild(this.HeadConnection);
            this.Tail2.addChild(this.Tail3);
            this.Tail3.addChild(this.TailFinTop);
            this.Tail2.addChild(this.UnderFin1);
            this.PectoralFinRight1.addChild(this.PectoralFinRight2);
            this.Snout1.addChild(this.Snout2);
            this.BackTailFin3.addChild(this.BackTailFin4);
            this.Tail1.addChild(this.UnderfinRight);
            this.Body.addChild(this.Head);
            this.PectoralFinLeft1.addChild(this.PectoralFinLeft2);
            this.Body.addChild(this.PectoralFinLeft1);
            this.Tail2.addChild(this.BackTailFin3);
            this.saveBase();

        }

        @Override
        public void setupAnim(BlacktipReefSharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
           super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Tail2.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            this.loadBase();
            float speed = 1.5F;
            float degree = 1.0F;
            this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.Tail2.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F;
         //   this.LeftPectoralFin1.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.409F;
           // this.RightPectoralFin1.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.409F;
            this.Mouth1.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.3F) * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 1.0F;
                float degree = 1.0F;
                this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
                this.Tail2.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * -0.9F) * limbSwingAmount * 0.5F;
                this.Tail3.yRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 2.5F) * limbSwingAmount * 0.5F;
            }
        }
    }

    public static class Child extends BlacktipReefSharkModel {
        public ModelRenderer Tail1;
        public ModelRenderer BackFin1;
        public ModelRenderer LeftPectoralFin1;
        public ModelRenderer RightPectoralFin1;
        public ModelRenderer Neck;
        public ModelRenderer Tail2;
        public ModelRenderer UnderFin2;
        public ModelRenderer UnderFin3;
        public ModelRenderer Tail3;
        public ModelRenderer UnderFin1;
        public ModelRenderer BackFin5;
        public ModelRenderer TailFinTop1;
        public ModelRenderer TailFinTop3;
        public ModelRenderer LeftPectoralFin2;
        public ModelRenderer LeftPectoralFin3;
        public ModelRenderer RightPectoralFin2;
        public ModelRenderer RightPectoralFin3;
        public ModelRenderer Mouth1;
        public ModelRenderer Head;
        public ModelRenderer Mouth2;
        public ModelRenderer Nose;

        public Child() {
            this.texWidth = 128;
            this.texHeight = 44;
            this.Neck = new ModelRenderer(this, 84, 0);
            this.Neck.setPos(0.0F, 0.4F, -0.6F);
            this.Neck.addBox(-3.5F, -3.5F, -7.0F, 7.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 38, 0);
            this.Tail1.setPos(0.0F, 0.3F, -2.8F);
            this.Tail1.addBox(-3.5F, -3.5F, 0.0F, 7.0F, 7.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.RightPectoralFin1 = new ModelRenderer(this, 64, 0);
            this.RightPectoralFin1.setPos(-2.5F, 2.1F, -4.8F);
            this.RightPectoralFin1.addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightPectoralFin1, 0.18203784630933073F, 1.1838568635856868F, 2.458645232063257F);
            this.LeftPectoralFin3 = new ModelRenderer(this, 21, 18);
            this.LeftPectoralFin3.setPos(-1.31F, -0.02F, 2.0F);
            this.LeftPectoralFin3.addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftPectoralFin3, 0.0F, 0.3431317282789241F, 0.0F);
            this.RightPectoralFin3 = new ModelRenderer(this, 37, 19);
            this.RightPectoralFin3.setPos(-1.31F, 0.01F, 2.0F);
            this.RightPectoralFin3.addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightPectoralFin3, 0.0F, 0.3431317282789241F, 0.0F);
            this.UnderFin1 = new ModelRenderer(this, 27, 0);
            this.UnderFin1.setPos(0.0F, 1.5F, 9.4F);
            this.UnderFin1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFin1, 0.591841146688116F, 0.0F, 0.0F);
            this.Mouth1 = new ModelRenderer(this, 106, 24);
            this.Mouth1.setPos(0.51F, -0.21F, -5.1F);
            this.Mouth1.addBox(-3.0F, 0.0F, -5.0F, 5.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth1, 0.04555309164612875F, 0.0F, 0.0F);
            this.LeftPectoralFin1 = new ModelRenderer(this, 27, 0);
            this.LeftPectoralFin1.setPos(3.4F, 2.1F, -4.8F);
            this.LeftPectoralFin1.addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftPectoralFin1, 0.0911061832922575F, 1.1838568635856868F, 0.956091342937205F);
            this.LeftPectoralFin2 = new ModelRenderer(this, 16, 18);
            this.LeftPectoralFin2.setPos(-1.01F, -0.01F, 1.4F);
            this.LeftPectoralFin2.addBox(-2.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 15, 26);
            this.Head.setPos(0.0F, -3.2F, -5.5F);
            this.Head.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.0911061832922575F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 37, 27);
            this.Nose.setPos(0.0F, 0.3F, -4.0F);
            this.Nose.addBox(-2.5F, 0.0F, -4.0F, 5.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.22811452790933667F, 0.0F, 0.0F);
            this.TailFinTop1 = new ModelRenderer(this, 112, 0);
            this.TailFinTop1.setPos(0.0F, -2.6F, 4.5F);
            this.TailFinTop1.addBox(-1.0F, -7.0F, 0.0F, 2.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop1, -0.8651597048872669F, 0.0F, 0.0F);
            this.TailFinTop3 = new ModelRenderer(this, 0, 18);
            this.TailFinTop3.setPos(-0.5F, -0.8F, 2.5F);
            this.TailFinTop3.addBox(-0.5F, -1.0F, -4.0F, 2.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop3, 1.5481069932557485F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 64, 13);
            this.Tail2.setPos(0.0F, 0.0F, 3.7F);
            this.Tail2.addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.UnderFin2 = new ModelRenderer(this, 39, 0);
            this.UnderFin2.setPos(2.3F, 2.2F, 8.0F);
            this.UnderFin2.addBox(-0.5F, -0.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFin2, -0.500909508638178F, 0.591841146688116F, 0.0F);
            this.RightPectoralFin2 = new ModelRenderer(this, 32, 19);
            this.RightPectoralFin2.setPos(-1.01F, 0.01F, 1.4F);
            this.RightPectoralFin2.addBox(-2.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.BackFin5 = new ModelRenderer(this, 64, 0);
            this.BackFin5.setPos(0.0F, 0.2F, 6.6F);
            this.BackFin5.addBox(-1.0F, -7.1F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFin5, -0.6829473549475088F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 0.0F, -0.6F);
            this.Body.addBox(-4.0F, -3.5F, -5.5F, 8.0F, 7.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.UnderFin3 = new ModelRenderer(this, 76, 0);
            this.UnderFin3.setPos(-2.3F, 2.2F, 8.0F);
            this.UnderFin3.addBox(-0.5F, -0.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFin3, -0.500909508638178F, -0.591841146688116F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 88, 13);
            this.Tail3.setPos(0.0F, 0.0F, 10.2F);
            this.Tail3.addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.BackFin1 = new ModelRenderer(this, 0, 0);
            this.BackFin1.setPos(0.5F, -1.6F, -1.8F);
            this.BackFin1.addBox(-1.0F, -7.1F, 0.0F, 2.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFin1, -0.591841146688116F, 0.0F, 0.0F);
            this.Mouth2 = new ModelRenderer(this, 49, 19);
            this.Mouth2.setPos(0.0F, 0.4F, -3.1F);
            this.Mouth2.addBox(-2.5F, -0.5F, -4.0F, 4.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth2, -0.1494001912944076F, 0.0F, 0.0F);
            this.Body.addChild(this.Neck);
            this.Body.addChild(this.Tail1);
            this.Body.addChild(this.RightPectoralFin1);
            this.LeftPectoralFin1.addChild(this.LeftPectoralFin3);
            this.RightPectoralFin1.addChild(this.RightPectoralFin3);
            this.Tail2.addChild(this.UnderFin1);
            this.Neck.addChild(this.Mouth1);
            this.Body.addChild(this.LeftPectoralFin1);
            this.LeftPectoralFin1.addChild(this.LeftPectoralFin2);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.Nose);
            this.Tail3.addChild(this.TailFinTop1);
            this.TailFinTop1.addChild(this.TailFinTop3);
            this.Tail1.addChild(this.Tail2);
            this.Tail1.addChild(this.UnderFin2);
            this.RightPectoralFin1.addChild(this.RightPectoralFin2);
            this.Tail2.addChild(this.BackFin5);
            this.Tail1.addChild(this.UnderFin3);
            this.Tail2.addChild(this.Tail3);
            this.Body.addChild(this.BackFin1);
            this.Mouth1.addChild(this.Mouth2);
            this.saveBase();

        }

        @Override
        public void setupAnim(BlacktipReefSharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            this.loadBase();
            limbSwing *= 2.0F;
            limbSwingAmount = 0.15F;
        }
    }
}
