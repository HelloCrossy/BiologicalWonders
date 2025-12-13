package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.ElephantSealEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class ElephantSealModel extends ZawaBaseModel<ElephantSealEntity> {
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

    public static class AdultMale extends ElephantSealModel {
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
        public ModelRenderer Neck3;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer SnoutTop;
        public ModelRenderer Nose;
        public ModelRenderer Forehead;
        public ModelRenderer LowerArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public AdultMale() {
            this.texWidth = 64;
            this.texHeight = 128;
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 17.0F, -5.0F);
            this.Chest.addBox(-6.0F, -6.5F, -6.0F, 12.0F, 13.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.3134611176792151F, 1.7453292129831807E-4F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 62);
            this.Hips.setPos(0.0F, 0.5F, 6.0F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 9.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 46, 49);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 2.7F, -0.3F);
            this.ArmRight.addBox(-3.0F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.0911061832922575F, 0.04555309164612875F, -0.4098033003787853F);
            this.Head = new ModelRenderer(this, 16, 77);
            this.Head.setPos(0.0F, -1.0F, -2.0F);
            this.Head.addBox(-3.0F, -3.0F, -4.0F, 6.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.46216317793861517F, 0.0F, 0.0F);
            this.LowerArmLeft = new ModelRenderer(this, 36, 47);
            this.LowerArmLeft.setPos(-1.0F, 2.0F, 0.0F);
            this.LowerArmLeft.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, 0.12217304763960307F, 0.0F, 0.2617993877991494F);
            this.Tail1 = new ModelRenderer(this, 45, 36);
            this.Tail1.setPos(0.0F, 1.0F, 3.0F);
            this.Tail1.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.5923647241584257F, 0.0F, 0.0F);
            this.Body2 = new ModelRenderer(this, 0, 46);
            this.Body2.setPos(0.0F, 1.0F, 7.0F);
            this.Body2.addBox(-4.5F, 0.0F, 0.0F, 9.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body2, -0.11728612207217244F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 31, 66);
            this.FootLeft.setPos(-1.2F, 1.0F, 2.5F);
            this.FootLeft.addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.0F, -0.3909537457888271F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 34, 56);
            this.UpperArmLeft.setPos(5.5F, 2.0F, -1.0F);
            this.UpperArmLeft.addBox(-3.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, 0.4230678066886838F, -0.0911061832922575F, -0.6373942508178124F);
            this.FootRight = new ModelRenderer(this, 31, 66);
            this.FootRight.mirror = true;
            this.FootRight.setPos(1.2F, 1.0F, 2.5F);
            this.FootRight.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.0F, 0.3909537457888271F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 25);
            this.Body.setPos(0.0F, -6.0F, 5.5F);
            this.Body.addBox(-5.5F, 0.0F, -2.0F, 11.0F, 12.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.23457224414434488F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 46, 49);
            this.ArmLeft.setPos(0.0F, 2.7F, -0.3F);
            this.ArmLeft.addBox(-1.0F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.0911061832922575F, -0.04555309164612875F, 0.4098033003787853F);
            this.Neck3 = new ModelRenderer(this, 30, 111);
            this.Neck3.setPos(0.0F, 0.0F, -4.0F);
            this.Neck3.addBox(-3.5F, -4.6F, -2.5F, 7.0F, 9.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck3, 0.33841933130905616F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 42, 40);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-3.0F, -0.5F, -2.0F);
            this.HandRight.addBox(-6.0F, 0.0F, 0.0F, 6.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0F, 0.4098033003787853F, 0.0F);
            this.Forehead = new ModelRenderer(this, 12, 76);
            this.Forehead.setPos(0.0F, -1.0F, -0.2F);
            this.Forehead.addBox(-1.0F, -2.3F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.5077162820683115F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 42, 40);
            this.HandLeft.setPos(3.0F, -0.5F, -2.0F);
            this.HandLeft.addBox(0.0F, 0.0F, 0.0F, 6.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0F, -0.4098033003787853F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 78);
            this.Snout.setPos(0.0F, -0.2F, -4.0F);
            this.Snout.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.0911061832922575F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 22, 65);
            this.LegLeft.setPos(3.5F, 4.5F, 1.6F);
            this.LegLeft.addBox(-2.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.0781907508222411F, 0.3909537457888271F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 84);
            this.Mouth.setPos(0.0F, 3.0F, 0.0F);
            this.Mouth.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.2275909337942703F, 0.0F, 0.0F);
            this.SnoutTop = new ModelRenderer(this, 46, 75);
            this.SnoutTop.setPos(0.0F, -1.0F, 0.6F);
            this.SnoutTop.addBox(-1.5F, -2.0F, -4.5F, 3.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutTop, 0.3904301683185175F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 55, 36);
            this.Tail2.setPos(0.0F, 0.0F, 1.8F);
            this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.46914448828868976F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 0, 107);
            this.Neck2.setPos(0.0F, 0.0F, -3.5F);
            this.Neck2.addBox(-4.0F, -5.0F, -4.0F, 8.0F, 10.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, 0.20193458912942175F, 0.0F, 0.0F);
            this.LowerArmRight = new ModelRenderer(this, 36, 47);
            this.LowerArmRight.mirror = true;
            this.LowerArmRight.setPos(1.0F, 2.0F, 0.0F);
            this.LowerArmRight.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, 0.12217304763960307F, 0.0F, -0.2617993877991494F);
            this.Neck1 = new ModelRenderer(this, 0, 90);
            this.Neck1.setPos(0.0F, 0.0F, -5.0F);
            this.Neck1.addBox(-4.5F, -5.5F, -3.0F, 9.0F, 11.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, -0.5012585491885465F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 22, 65);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-3.5F, 4.5F, 1.6F);
            this.LegRight.addBox(0.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.0781907508222411F, -0.3909537457888271F, 0.0F);
            this.Nose = new ModelRenderer(this, 49, 84);
            this.Nose.setPos(0.0F, 0.4F, -3.0F);
            this.Nose.addBox(-1.0F, -2.5F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.6373942508178124F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 34, 56);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(-5.5F, 2.0F, -1.0F);
            this.UpperArmRight.addBox(-1.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, 0.4230678066886838F, 0.0911061832922575F, 0.6373942508178124F);
            this.Body2.addChild(this.Hips);
            this.LowerArmRight.addChild(this.ArmRight);
            this.Neck3.addChild(this.Head);
            this.UpperArmLeft.addChild(this.LowerArmLeft);
            this.Hips.addChild(this.Tail1);
            this.Body.addChild(this.Body2);
            this.LegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.UpperArmLeft);
            this.LegRight.addChild(this.FootRight);
            this.Chest.addChild(this.Body);
            this.LowerArmLeft.addChild(this.ArmLeft);
            this.Neck2.addChild(this.Neck3);
            this.ArmRight.addChild(this.HandRight);
            this.SnoutTop.addChild(this.Forehead);
            this.ArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.LegLeft);
            this.Snout.addChild(this.Mouth);
            this.Snout.addChild(this.SnoutTop);
            this.Tail1.addChild(this.Tail2);
            this.Neck1.addChild(this.Neck2);
            this.UpperArmRight.addChild(this.LowerArmRight);
            this.Chest.addChild(this.Neck1);
            this.Hips.addChild(this.LegRight);
            this.SnoutTop.addChild(this.Nose);
            this.Chest.addChild(this.UpperArmRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(ElephantSealEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
    public static class AdultFemale extends ElephantSealModel {
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

        public AdultFemale() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.LegRight = new ModelRenderer(this, 20, 55);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-2.5F, 3.0F, 1.6F);
            this.LegRight.addBox(0.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.0781907508222411F, -0.3909537457888271F, 0.0F);
            this.Head = new ModelRenderer(this, 34, 19);
            this.Head.setPos(0.0F, -0.5F, -2.4F);
            this.Head.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.23457224414434488F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 55, 36);
            this.Tail2.setPos(0.0F, 0.0F, 1.8F);
            this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.46914448828868976F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 31, 54);
            this.FootRight.mirror = true;
            this.FootRight.setPos(1.2F, 1.0F, 2.5F);
            this.FootRight.addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.0F, 0.3909537457888271F, 0.0F);
            this.Snout = new ModelRenderer(this, 32, 29);
            this.Snout.setPos(0.0F, -1.7F, -2.2F);
            this.Snout.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.2474876932591181F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 50, 42);
            this.HandLeft.setPos(3.0F, -0.5F, -2.0F);
            this.HandLeft.addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0F, -0.4098033003787853F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 16);
            this.Body.setPos(0.0F, -4.0F, 4.0F);
            this.Body.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.11728612207217244F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 35, 11);
            this.Neck2.setPos(0.0F, 0.2F, -3.1F);
            this.Neck2.addBox(-3.0F, -3.5F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, 0.19547687289441354F, 0.0F, 0.0F);
            this.Body2 = new ModelRenderer(this, 0, 32);
            this.Body2.setPos(0.0F, 0.5F, 8.0F);
            this.Body2.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body2, -0.11728612207217244F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 45, 28);
            this.TopSnout.setPos(0.0F, 0.0F, -1.5F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.35779249665883756F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 48, 48);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 2.7F, -0.3F);
            this.ArmRight.addBox(-3.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.0911061832922575F, 0.04555309164612875F, -0.4098033003787853F);
            this.Mouth = new ModelRenderer(this, 32, 36);
            this.Mouth.setPos(0.0F, 2.8F, -0.6F);
            this.Mouth.addBox(-1.5F, 0.0F, -1.7F, 3.0F, 1.0F, 3.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.2275909337942703F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 19, 46);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(-3.7F, -1.5F, -1.0F);
            this.UpperArmRight.addBox(-1.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.0851720694946941F, 0.0911061832922575F, 0.6373942508178124F);
            this.Nose = new ModelRenderer(this, 27, 0);
            this.Nose.setPos(0.0F, -0.01F, -2.51F);
            this.Nose.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 20.0F, -4.5F);
            this.Chest.addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.0781907508222411F, 1.7453292129831807E-4F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 45, 36);
            this.Tail1.setPos(0.0F, 1.0F, 3.0F);
            this.Tail1.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.5923647241584257F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 31, 54);
            this.FootLeft.setPos(-1.2F, 1.0F, 2.5F);
            this.FootLeft.addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.0F, -0.3909537457888271F, 0.0F);
            this.HandRight = new ModelRenderer(this, 50, 42);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-3.0F, -0.5F, -2.0F);
            this.HandRight.addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0F, 0.4098033003787853F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 32, 0);
            this.Neck1.setPos(0.0F, 0.0F, -3.0F);
            this.Neck1.addBox(-3.5F, -3.5F, -3.0F, 7.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, -0.27366763203903305F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 20, 55);
            this.LegLeft.setPos(2.5F, 3.0F, 1.6F);
            this.LegLeft.addBox(-2.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.0781907508222411F, 0.3909537457888271F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 48, 48);
            this.ArmLeft.setPos(0.0F, 2.7F, -0.3F);
            this.ArmLeft.addBox(-1.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.0911061832922575F, -0.04555309164612875F, 0.4098033003787853F);
            this.Hips = new ModelRenderer(this, 0, 44);
            this.Hips.setPos(0.0F, 0.5F, 5.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.LowerArmLeft = new ModelRenderer(this, 36, 47);
            this.LowerArmLeft.setPos(-1.0F, 2.0F, 0.0F);
            this.LowerArmLeft.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, 0.12217304763960307F, 0.0F, 0.2617993877991494F);
            this.LowerArmRight = new ModelRenderer(this, 36, 47);
            this.LowerArmRight.mirror = true;
            this.LowerArmRight.setPos(1.0F, 2.0F, 0.0F);
            this.LowerArmRight.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, 0.12217304763960307F, 0.0F, -0.2617993877991494F);
            this.UpperArmLeft = new ModelRenderer(this, 19, 46);
            this.UpperArmLeft.setPos(3.7F, -1.5F, -1.0F);
            this.UpperArmLeft.addBox(-3.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.0851720694946941F, -0.0911061832922575F, -0.6373942508178124F);
            this.Hips.addChild(this.LegRight);
            this.Neck2.addChild(this.Head);
            this.Tail1.addChild(this.Tail2);
            this.LegRight.addChild(this.FootRight);
            this.Head.addChild(this.Snout);
            this.ArmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.Body);
            this.Neck1.addChild(this.Neck2);
            this.Body.addChild(this.Body2);
            this.Snout.addChild(this.TopSnout);
            this.LowerArmRight.addChild(this.ArmRight);
            this.Snout.addChild(this.Mouth);
            this.Chest.addChild(this.UpperArmRight);
            this.Snout.addChild(this.Nose);
            this.Hips.addChild(this.Tail1);
            this.LegLeft.addChild(this.FootLeft);
            this.ArmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Neck1);
            this.Hips.addChild(this.LegLeft);
            this.LowerArmLeft.addChild(this.ArmLeft);
            this.Body2.addChild(this.Hips);
            this.UpperArmLeft.addChild(this.LowerArmLeft);
            this.UpperArmRight.addChild(this.LowerArmRight);
            this.Chest.addChild(this.UpperArmLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(ElephantSealEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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

    public static class Child extends ElephantSealModel {
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
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.LegRight = new ModelRenderer(this, 19, 18);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-2.5F, 2.3F, 1.6F);
            this.LegRight.addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.1563815016444822F, -0.3909537457888271F, 0.0F);
            this.HandRight = new ModelRenderer(this, 40, 28);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 2.1F, -0.5F);
            this.HandRight.addBox(-4.0F, -1.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.0911061832922575F, 0.04555309164612875F, -0.4098033003787853F);
            this.Nose = new ModelRenderer(this, 25, 0);
            this.Nose.setPos(0.0F, -0.01F, -2.01F);
            this.Nose.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 22.2F, -4.5F);
            this.Chest.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.0781907508222411F, 1.7453292129831807E-4F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 40, 28);
            this.HandLeft.setPos(0.0F, 2.1F, -0.5F);
            this.HandLeft.addBox(0.0F, -1.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.0911061832922575F, -0.04555309164612875F, 0.4098033003787853F);
            this.ArmLeft = new ModelRenderer(this, 30, 28);
            this.ArmLeft.setPos(-1.0F, 0.0F, 0.0F);
            this.ArmLeft.addBox(0.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.12217304763960307F, 0.0F, 0.2617993877991494F);
            this.Tail = new ModelRenderer(this, 31, 23);
            this.Tail.setPos(0.0F, 0.0F, 4.0F);
            this.Tail.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.8991936386169619F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 19, 27);
            this.UpperArmLeft.setPos(2.7F, -0.5F, 0.0F);
            this.UpperArmLeft.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.0851720694946941F, -0.0911061832922575F, -0.6373942508178124F);
            this.Hips = new ModelRenderer(this, 0, 23);
            this.Hips.setPos(0.0F, 0.5F, 5.0F);
            this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1563815016444822F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 19, 18);
            this.LegLeft.setPos(2.5F, 2.3F, 1.6F);
            this.LegLeft.addBox(-1.0F, -1.5F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.1563815016444822F, 0.3909537457888271F, 0.0F);
            this.Snout = new ModelRenderer(this, 31, 8);
            this.Snout.setPos(0.0F, -1.2F, -2.1F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.4820599540482198F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 19, 27);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(-2.7F, -0.5F, 0.0F);
            this.UpperArmRight.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.0851720694946941F, 0.0911061832922575F, 0.6373942508178124F);
            this.Mouth = new ModelRenderer(this, 32, 16);
            this.Mouth.setPos(0.0F, 1.6F, -0.9F);
            this.Mouth.addBox(-1.0F, 0.0F, -0.8F, 2.0F, 1.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.5012585491885465F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 12);
            this.Body.setPos(0.0F, -3.0F, 3.0F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.11728612207217244F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 40, 0);
            this.Head.setPos(0.0F, 1.6F, -1.0F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5473352640780661F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 30, 28);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(1.0F, 0.0F, 0.0F);
            this.ArmRight.addBox(-2.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.12217304763960307F, 0.0F, -0.2617993877991494F);
            this.Neck = new ModelRenderer(this, 24, 0);
            this.Neck.setPos(0.0F, -3.0F, -3.0F);
            this.Neck.addBox(-1.5F, -0.5F, -1.4F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.46914448828868976F, 0.0F, 0.0F);
            this.Hips.addChild(this.LegRight);
            this.ArmRight.addChild(this.HandRight);
            this.Snout.addChild(this.Nose);
            this.ArmLeft.addChild(this.HandLeft);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Hips.addChild(this.Tail);
            this.Chest.addChild(this.UpperArmLeft);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.LegLeft);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.UpperArmRight);
            this.Snout.addChild(this.Mouth);
            this.Chest.addChild(this.Body);
            this.Neck.addChild(this.Head);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Chest.addChild(this.Neck);
            this.saveBase();

        }

        @Override
        public void setupAnim(ElephantSealEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
