package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.RibbonSealEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class RibbonSealModel extends ZawaBaseModel<RibbonSealEntity> {
    public ModelRenderer Chest;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends RibbonSealModel {
        public ModelRenderer Body;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer Neck1;
        public ModelRenderer UpperArmRight;
        public ModelRenderer Body2;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer LegLeft;
        public ModelRenderer LegRight;
        public ModelRenderer Tail2;
        public ModelRenderer FootLeft;
        public ModelRenderer FootRight;
        public ModelRenderer LowerArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;
        public ModelRenderer Nose;
        public ModelRenderer LowerArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.UpperArmLeft = new ModelRenderer(this, 19, 46);
            this.UpperArmLeft.setPos(3.7F, -1.5F, -1.0F);
            this.UpperArmLeft.addBox(-3.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.0851720694946941F, -0.0911061832922575F, -0.6373942508178124F);
            this.LegRight = new ModelRenderer(this, 20, 55);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-2.5F, 3.0F, 1.6F);
            this.LegRight.addBox(0.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.0781907508222411F, -0.3909537457888271F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 31, 54);
            this.FootLeft.setPos(-1.2F, 1.0F, 2.5F);
            this.FootLeft.addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.0F, -0.3909537457888271F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 16);
            this.Body.setPos(0.0F, -4.0F, 4.0F);
            this.Body.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.11728612207217244F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 27, 0);
            this.Nose.setPos(0.0F, -0.01F, -2.51F);
            this.Nose.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 48, 48);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 2.7F, -0.3F);
            this.ArmRight.addBox(-3.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.0911061832922575F, 0.04555309164612875F, -0.4098033003787853F);
            this.Hips = new ModelRenderer(this, 0, 44);
            this.Hips.setPos(0.0F, 0.5F, 5.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 31, 54);
            this.FootRight.mirror = true;
            this.FootRight.setPos(1.2F, 1.0F, 2.5F);
            this.FootRight.addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.0F, 0.3909537457888271F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 20, 55);
            this.LegLeft.setPos(2.5F, 3.0F, 1.6F);
            this.LegLeft.addBox(-2.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.0781907508222411F, 0.3909537457888271F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 50, 42);
            this.HandLeft.setPos(3.0F, -0.5F, -2.0F);
            this.HandLeft.addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0F, -0.4098033003787853F, 0.0F);
            this.Mouth = new ModelRenderer(this, 32, 36);
            this.Mouth.setPos(0.0F, 2.8F, -0.6F);
            this.Mouth.addBox(-1.5F, 0.0F, -1.7F, 3.0F, 1.0F, 3.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.2275909337942703F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 19, 46);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(-3.7F, -1.5F, -1.0F);
            this.UpperArmRight.addBox(-1.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.0851720694946941F, 0.0911061832922575F, 0.6373942508178124F);
            this.Neck2 = new ModelRenderer(this, 35, 11);
            this.Neck2.setPos(0.0F, 0.2F, -3.1F);
            this.Neck2.addBox(-3.0F, -3.5F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, 0.19547687289441354F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 48, 48);
            this.ArmLeft.setPos(0.0F, 2.7F, -0.3F);
            this.ArmLeft.addBox(-1.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.0911061832922575F, -0.04555309164612875F, 0.4098033003787853F);
            this.Snout = new ModelRenderer(this, 32, 29);
            this.Snout.setPos(0.0F, -1.55F, -1.0F);
            this.Snout.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.10437068960215605F, 0.0F, 0.0F);
            this.LowerArmLeft = new ModelRenderer(this, 36, 47);
            this.LowerArmLeft.setPos(-1.0F, 2.0F, 0.0F);
            this.LowerArmLeft.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, 0.12217304763960307F, 0.0F, 0.2617993877991494F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 20.0F, -4.5F);
            this.Chest.addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.0781907508222411F, 1.7453292129831807E-4F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 55, 36);
            this.Tail2.setPos(0.0F, 0.0F, 1.8F);
            this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.46914448828868976F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 32, 0);
            this.Neck1.setPos(0.0F, 0.0F, -3.0F);
            this.Neck1.addBox(-3.5F, -3.5F, -3.0F, 7.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, -0.27366763203903305F, 0.0F, 0.0F);
            this.Body2 = new ModelRenderer(this, 0, 32);
            this.Body2.setPos(0.0F, 0.5F, 8.0F);
            this.Body2.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body2, -0.11728612207217244F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 45, 36);
            this.Tail1.setPos(0.0F, 1.0F, 3.0F);
            this.Tail1.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.5923647241584257F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 50, 42);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-3.0F, -0.5F, -2.0F);
            this.HandRight.addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0F, 0.4098033003787853F, 0.0F);
            this.LowerArmRight = new ModelRenderer(this, 36, 47);
            this.LowerArmRight.mirror = true;
            this.LowerArmRight.setPos(1.0F, 2.0F, 0.0F);
            this.LowerArmRight.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, 0.12217304763960307F, 0.0F, -0.2617993877991494F);
            this.Head = new ModelRenderer(this, 34, 19);
            this.Head.setPos(0.0F, -0.5F, -2.4F);
            this.Head.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.23457224414434488F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 45, 28);
            this.TopSnout.setPos(0.0F, 0.0F, -1.7F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.35779249665883756F, 0.0F, 0.0F);
            this.Chest.addChild(this.UpperArmLeft);
            this.Hips.addChild(this.LegRight);
            this.LegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.Body);
            this.Snout.addChild(this.Nose);
            this.LowerArmRight.addChild(this.ArmRight);
            this.Body2.addChild(this.Hips);
            this.LegRight.addChild(this.FootRight);
            this.Hips.addChild(this.LegLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.Snout.addChild(this.Mouth);
            this.Chest.addChild(this.UpperArmRight);
            this.Neck1.addChild(this.Neck2);
            this.LowerArmLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.Snout);
            this.UpperArmLeft.addChild(this.LowerArmLeft);
            this.Tail1.addChild(this.Tail2);
            this.Chest.addChild(this.Neck1);
            this.Body.addChild(this.Body2);
            this.Hips.addChild(this.Tail1);
            this.ArmRight.addChild(this.HandRight);
            this.UpperArmRight.addChild(this.LowerArmRight);
            this.Neck2.addChild(this.Head);
            this.Snout.addChild(this.TopSnout);
            this.saveBase();

        }

        @Override
        public void setupAnim(RibbonSealEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            float speed = 1.2F;
            float degree = 1.0F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 1.4F;
                degree = 0.8F;
            } else {

            }
        }
    }

    public static class Child extends RibbonSealModel {
        public ModelRenderer UpperArmLeft;
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Hips;
        public ModelRenderer LegLeft;
        public ModelRenderer Tail;
        public ModelRenderer LegRight;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer Nose;
        public ModelRenderer TopSnout;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.ArmLeft = new ModelRenderer(this, 30, 28);
            this.ArmLeft.setPos(-1.0F, 0.0F, 0.0F);
            this.ArmLeft.addBox(0.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.12217304763960307F, 0.0F, 0.2617993877991494F);
            this.HandRight = new ModelRenderer(this, 40, 28);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 2.1F, -0.5F);
            this.HandRight.addBox(-4.0F, -1.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.0911061832922575F, 0.04555309164612875F, -0.4098033003787853F);
            this.Body = new ModelRenderer(this, 0, 12);
            this.Body.setPos(0.0F, -3.0F, 3.0F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.11728612207217244F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 19, 27);
            this.UpperArmLeft.setPos(2.7F, -0.5F, 0.0F);
            this.UpperArmLeft.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.0851720694946941F, -0.0911061832922575F, -0.6373942508178124F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 22.2F, -4.5F);
            this.Chest.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.0781907508222411F, 1.7453292129831807E-4F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 40, 28);
            this.HandLeft.setPos(0.0F, 2.1F, -0.5F);
            this.HandLeft.addBox(0.0F, -1.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.0911061832922575F, -0.04555309164612875F, 0.4098033003787853F);
            this.Snout = new ModelRenderer(this, 32, 9);
            this.Snout.setPos(0.0F, -1.0F, -1.1F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.28658306450904947F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 32, 16);
            this.Mouth.setPos(0.0F, 1.6F, -1.1F);
            this.Mouth.addBox(-1.0F, 0.0F, -0.8F, 2.0F, 1.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.11030481172209784F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 24, 0);
            this.Neck.setPos(0.0F, -2.3F, -3.0F);
            this.Neck.addBox(-1.5F, -0.5F, -1.4F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.19547687289441354F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 40, 0);
            this.Head.setPos(0.0F, 1.4F, -1.0F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.19547687289441354F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 30, 28);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(1.0F, 0.0F, 0.0F);
            this.ArmRight.addBox(-2.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.12217304763960307F, 0.0F, -0.2617993877991494F);
            this.LegRight = new ModelRenderer(this, 19, 18);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-2.5F, 2.3F, 1.6F);
            this.LegRight.addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.1563815016444822F, -0.3909537457888271F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 19, 27);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(-2.7F, -0.5F, 0.0F);
            this.UpperArmRight.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.0851720694946941F, 0.0911061832922575F, 0.6373942508178124F);
            this.Hips = new ModelRenderer(this, 0, 23);
            this.Hips.setPos(0.0F, 0.5F, 5.0F);
            this.Hips.addBox(-2.0F, 0.0F, -0.5F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1563815016444822F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 31, 23);
            this.Tail.setPos(0.0F, 0.0F, 3.5F);
            this.Tail.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.8991936386169619F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 19, 18);
            this.LegLeft.setPos(2.5F, 2.3F, 1.6F);
            this.LegLeft.addBox(-1.0F, -1.5F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.1563815016444822F, 0.3909537457888271F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 44, 24);
            this.TopSnout.setPos(0.0F, 0.0F, -1.5F);
            this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.35779249665883756F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 25, 0);
            this.Nose.setPos(0.0F, -0.01F, -2.01F);
            this.Nose.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.ArmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Body);
            this.Chest.addChild(this.UpperArmLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Snout);
            this.Snout.addChild(this.Mouth);
            this.Chest.addChild(this.Neck);
            this.Neck.addChild(this.Head);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Hips.addChild(this.LegRight);
            this.Chest.addChild(this.UpperArmRight);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.Tail);
            this.Hips.addChild(this.LegLeft);
            this.Snout.addChild(this.TopSnout);
            this.Snout.addChild(this.Nose);
            this.saveBase();

        }

        @Override
        public void setupAnim(RibbonSealEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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