package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.ElephantSealEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class ElephantSealModel extends ZawaBaseModel<ElephantSealEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    @Override
    public void prepareMobModel(ElephantSealEntity entity, float speed, float walkSpeed, float partialTick) {
        super.prepareMobModel(entity, speed, walkSpeed, partialTick);
        this.isSwimming = entity.isUnderWater() || (entity.isInWater() && entity.level.getBlockState(entity.blockPosition().below()).getMaterial().isLiquid());
    }

    public static class AdultMale extends ElephantSealModel {
        public ModelPart Body;
        public ModelPart UpperArmLeft;
        public ModelPart Neck1;
        public ModelPart UpperArmRight;
        public ModelPart Body2;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart LegLeft;
        public ModelPart LegRight;
        public ModelPart Tail2;
        public ModelPart FootLeft;
        public ModelPart FootRight;
        public ModelPart LowerArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart Neck2;
        public ModelPart Neck3;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart SnoutTop;
        public ModelPart Nose;
        public ModelPart Forehead;
        public ModelPart LowerArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public AdultMale(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.texWidth = 64;
            this.texHeight = 128;
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
            
        }
        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            this.Chest = new ModelPart(this, 0, 0);
            this.Chest.setPos(0.0F, 17.0F, -5.0F);
            this.Chest.addBox(-6.0F, -6.5F, -6.0F, 12.0F, 13.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.3134611176792151F, 1.7453292129831807E-4F, 0.0F);
            this.Hips = new ModelPart(this, 0, 62);
            this.Hips.setPos(0.0F, 0.5F, 6.0F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 9.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelPart(this, 46, 49);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 2.7F, -0.3F);
            this.ArmRight.addBox(-3.0F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.0911061832922575F, 0.04555309164612875F, -0.4098033003787853F);
            this.Head = new ModelPart(this, 16, 77);
            this.Head.setPos(0.0F, -1.0F, -2.0F);
            this.Head.addBox(-3.0F, -3.0F, -4.0F, 6.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.46216317793861517F, 0.0F, 0.0F);
            this.LowerArmLeft = new ModelPart(this, 36, 47);
            this.LowerArmLeft.setPos(-1.0F, 2.0F, 0.0F);
            this.LowerArmLeft.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, 0.12217304763960307F, 0.0F, 0.2617993877991494F);
            this.Tail1 = new ModelPart(this, 45, 36);
            this.Tail1.setPos(0.0F, 1.0F, 3.0F);
            this.Tail1.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.5923647241584257F, 0.0F, 0.0F);
            this.Body2 = new ModelPart(this, 0, 46);
            this.Body2.setPos(0.0F, 1.0F, 7.0F);
            this.Body2.addBox(-4.5F, 0.0F, 0.0F, 9.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body2, -0.11728612207217244F, 0.0F, 0.0F);
            this.FootLeft = new ModelPart(this, 31, 66);
            this.FootLeft.setPos(-1.2F, 1.0F, 2.5F);
            this.FootLeft.addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.0F, -0.3909537457888271F, 0.0F);
            this.UpperArmLeft = new ModelPart(this, 34, 56);
            this.UpperArmLeft.setPos(5.5F, 2.0F, -3.0F);
            this.UpperArmLeft.addBox(-3.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, 0.4230678066886838F, -0.0911061832922575F, -0.6373942508178124F);
            this.FootRight = new ModelPart(this, 31, 66);
            this.FootRight.mirror = true;
            this.FootRight.setPos(1.2F, 1.0F, 2.5F);
            this.FootRight.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.0F, 0.3909537457888271F, 0.0F);
            this.Body = new ModelPart(this, 0, 25);
            this.Body.setPos(0.0F, -6.0F, 5.5F);
            this.Body.addBox(-5.5F, 0.0F, -2.0F, 11.0F, 12.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.23457224414434488F, 0.0F, 0.0F);
            this.ArmLeft = new ModelPart(this, 46, 49);
            this.ArmLeft.setPos(0.0F, 2.7F, -0.3F);
            this.ArmLeft.addBox(-1.0F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.0911061832922575F, -0.04555309164612875F, 0.4098033003787853F);
            this.Neck3 = new ModelPart(this, 30, 111);
            this.Neck3.setPos(0.0F, 0.0F, -4.0F);
            this.Neck3.addBox(-3.5F, -4.6F, -2.5F, 7.0F, 9.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck3, 0.33841933130905616F, 0.0F, 0.0F);
            this.HandRight = new ModelPart(this, 42, 40);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-3.0F, -0.5F, -2.0F);
            this.HandRight.addBox(-6.0F, 0.0F, 0.0F, 6.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0F, 0.4098033003787853F, 0.0F);
            this.Forehead = new ModelPart(this, 12, 76);
            this.Forehead.setPos(0.0F, -1.0F, -0.2F);
            this.Forehead.addBox(-1.0F, -2.3F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.5077162820683115F, 0.0F, 0.0F);
            this.HandLeft = new ModelPart(this, 42, 40);
            this.HandLeft.setPos(3.0F, -0.5F, -2.0F);
            this.HandLeft.addBox(0.0F, 0.0F, 0.0F, 6.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0F, -0.4098033003787853F, 0.0F);
            this.Snout = new ModelPart(this, 0, 78);
            this.Snout.setPos(0.0F, -0.2F, -4.0F);
            this.Snout.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.0911061832922575F, 0.0F, 0.0F);
            this.LegLeft = new ModelPart(this, 22, 65);
            this.LegLeft.setPos(3.5F, 4.5F, 1.6F);
            this.LegLeft.addBox(-2.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.0781907508222411F, 0.3909537457888271F, 0.0F);
            this.Mouth = new ModelPart(this, 0, 84);
            this.Mouth.setPos(0.0F, 3.0F, 0.0F);
            this.Mouth.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.2275909337942703F, 0.0F, 0.0F);
            this.SnoutTop = new ModelPart(this, 46, 75);
            this.SnoutTop.setPos(0.0F, -1.0F, 0.6F);
            this.SnoutTop.addBox(-1.5F, -2.0F, -4.5F, 3.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutTop, 0.3904301683185175F, 0.0F, 0.0F);
            this.Tail2 = new ModelPart(this, 55, 36);
            this.Tail2.setPos(0.0F, 0.0F, 1.8F);
            this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.46914448828868976F, 0.0F, 0.0F);
            this.Neck2 = new ModelPart(this, 0, 107);
            this.Neck2.setPos(0.0F, 0.0F, -3.5F);
            this.Neck2.addBox(-4.0F, -5.0F, -4.0F, 8.0F, 10.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, 0.20193458912942175F, 0.0F, 0.0F);
            this.LowerArmRight = new ModelPart(this, 36, 47);
            this.LowerArmRight.mirror = true;
            this.LowerArmRight.setPos(1.0F, 2.0F, 0.0F);
            this.LowerArmRight.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, 0.12217304763960307F, 0.0F, -0.2617993877991494F);
            this.Neck1 = new ModelPart(this, 0, 90);
            this.Neck1.setPos(0.0F, 0.0F, -5.0F);
            this.Neck1.addBox(-4.5F, -5.5F, -3.0F, 9.0F, 11.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, -0.5012585491885465F, 0.0F, 0.0F);
            this.LegRight = new ModelPart(this, 22, 65);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-3.5F, 4.5F, 1.6F);
            this.LegRight.addBox(0.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.0781907508222411F, -0.3909537457888271F, 0.0F);
            this.Nose = new ModelPart(this, 49, 84);
            this.Nose.setPos(0.0F, 0.4F, -3.0F);
            this.Nose.addBox(-1.0F, -2.5F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.6373942508178124F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelPart(this, 34, 56);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(-5.5F, 2.0F, -3.0F);
            this.UpperArmRight.addBox(-1.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, 0.4230678066886838F, 0.0911061832922575F, 0.6373942508178124F);


            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }
        @Override
        public void setupAnim(ElephantSealEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Neck1.xRot = (float) Math.toRadians(headPitch) * 0.5F + (isSwimming ? 0F : -0.50F);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.xRot = (float) Math.toRadians(headPitch) * 0.5F + (isSwimming ? 0F : 0.46F);

            if (isSwimming && Entity.getHorizontalDistanceSqr(entity.getDeltaMovement()) > 1.0E-7D) {
                this.Chest.xRot += Mth.cos(limbSwing * 0.3F) * 0.25F * limbSwingAmount;
            }
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck1.xRot = Mth.cos((limbSwing * speed * 0.1F)) * (degree * 0.1F) * limbSwingAmount - 0.50F;
            this.Neck2.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.1F)) * (degree * 0.2F) * limbSwingAmount + 0.20F;
            this.Neck3.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.1F)) * (degree * 0.1F) * limbSwingAmount + 0.30F;
            this.Head.xRot = Mth.cos(2.0F + (limbSwing * speed * 0.1F)) * (degree * -0.2F) * limbSwingAmount + 0.46F;
            this.SnoutTop.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * -0.3F) * limbSwingAmount + 0.39F;
            this.Nose.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.1F)) * (degree * 0.2F) * limbSwingAmount + 0.64F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 5.0F;
            float degree = 1.0F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 1.0F;

                this.UpperArmRight.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 0.5F;
                this.LowerArmRight.xRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.1F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.ArmRight.zRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * -0.8F) * limbSwingAmount - 1.4F;
                this.ArmRight.xRot = -0.09F;
                this.HandRight.yRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 1.0F) * limbSwingAmount + 0.409F;

                this.UpperArmLeft.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 0.5F;
                this.LowerArmLeft.xRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.1F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.ArmLeft.zRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 1.4F;
                this.ArmLeft.xRot = -0.09F;
                this.HandLeft.yRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * -1.0F) * limbSwingAmount - 0.409F;

                this.Head.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount;
                this.Neck3.xRot = MathHelper.cos(-1F + (limbSwing * speed * 0.2F)) * (degree * -0.25F) * limbSwingAmount;
                this.Neck2.xRot = MathHelper.cos(-1F + (limbSwing * speed * 0.2F)) * (degree * -0.25F) * limbSwingAmount;
                this.Neck1.xRot = MathHelper.cos(-1F + (limbSwing * speed * 0.2F)) * (degree * -0.45F) * limbSwingAmount;
                this.Chest.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.25F) * limbSwingAmount;
                this.Body.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -0.25F) * limbSwingAmount;
                this.Body2.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * -0.1F) * limbSwingAmount;
                this.Hips.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * -0.1F) * limbSwingAmount;
                this.SnoutTop.xRot = 0.39F;
                this.Nose.xRot = 0.64F;

                this.LegRight.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.25F) * limbSwingAmount;
                this.FootRight.yRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.6F) * limbSwingAmount + 0.2F;
                this.LegLeft.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.25F) * limbSwingAmount;
                this.FootLeft.yRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.6F) * limbSwingAmount - 0.2F;

            } else if (entity.isOnGround()) {
                this.UpperArmRight.y = MathHelper.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount + 2.0F;
                this.UpperArmRight.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount + 0.0F;
                this.LowerArmRight.xRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.ArmRight.zRot = -0.41F;
                this.ArmRight.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * -1.2F) * limbSwingAmount - 0.09F;
                this.HandRight.yRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 1.0F) * limbSwingAmount + 0.409F;

                this.UpperArmLeft.y = MathHelper.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount + 2.0F;
                this.UpperArmLeft.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount + 0.0F;
                this.LowerArmLeft.xRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.ArmLeft.zRot = 0.41F;
                this.ArmLeft.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * -1.2F) * limbSwingAmount - 0.09F;
                this.HandLeft.yRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * -1.0F) * limbSwingAmount - 0.409F;

                this.Neck1.xRot = MathHelper.cos(-1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.2F) * limbSwingAmount - 0.50F;
                this.Neck2.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.2F) * limbSwingAmount + 0.20F;
                this.Neck3.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.1F) * limbSwingAmount + 0.34F;
                this.Head.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.4F) * limbSwingAmount + 0.46F;
                this.SnoutTop.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * -0.3F) * limbSwingAmount + 0.39F;
                this.Nose.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.2F) * limbSwingAmount + 0.64F;

                this.Chest.y = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 3F) * limbSwingAmount + 17.0F;
                this.Chest.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.6F) * limbSwingAmount - 0.1F;
                this.Body.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * -0.5F) * limbSwingAmount;
                this.Body2.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -0.3F) * limbSwingAmount - 0.1F;
                this.Hips.xRot = MathHelper.cos(1.5F + (limbSwing * speed * 0.2F)) * (degree * -0.3F) * limbSwingAmount - 0.2F;

                this.LegRight.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.6F) * limbSwingAmount;
                this.FootRight.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -1.0F) * limbSwingAmount + 0.2F;
                this.FootRight.yRot = 0.2F;
                this.LegLeft.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.6F) * limbSwingAmount;
                this.FootLeft.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -1.0F) * limbSwingAmount + 0.2F;
                this.FootLeft.yRot = -0.2F;
            }
        }
    }

    public static class AdultFemale extends ElephantSealModel {
        public ModelPart Body;
        public ModelPart UpperArmLeft;
        public ModelPart Neck1;
        public ModelPart UpperArmRight;
        public ModelPart Body2;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart LegLeft;
        public ModelPart LegRight;
        public ModelPart Tail2;
        public ModelPart FootLeft;
        public ModelPart FootRight;
        public ModelPart LowerArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart TopSnout;
        public ModelPart Nose;
        public ModelPart LowerArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public AdultFemale(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.texWidth = 64;
            this.texHeight = 64;
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
            

        }
        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            this.LegRight = new ModelPart(this, 20, 55);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-2.5F, 3.0F, 1.6F);
            this.LegRight.addBox(0.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.0781907508222411F, -0.3909537457888271F, 0.0F);
            this.Head = new ModelPart(this, 34, 19);
            this.Head.setPos(0.0F, -0.5F, -2.4F);
            this.Head.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.23457224414434488F, 0.0F, 0.0F);
            this.Tail2 = new ModelPart(this, 55, 36);
            this.Tail2.setPos(0.0F, 0.0F, 1.8F);
            this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.46914448828868976F, 0.0F, 0.0F);
            this.FootRight = new ModelPart(this, 31, 54);
            this.FootRight.mirror = true;
            this.FootRight.setPos(1.2F, 1.0F, 2.5F);
            this.FootRight.addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.0F, 0.3909537457888271F, 0.0F);
            this.Snout = new ModelPart(this, 32, 29);
            this.Snout.setPos(0.0F, -1.7F, -2.2F);
            this.Snout.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.2474876932591181F, 0.0F, 0.0F);
            this.HandLeft = new ModelPart(this, 50, 42);
            this.HandLeft.setPos(3.0F, -0.5F, -2.0F);
            this.HandLeft.addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0F, -0.4098033003787853F, 0.0F);
            this.Body = new ModelPart(this, 0, 16);
            this.Body.setPos(0.0F, -4.0F, 4.0F);
            this.Body.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.11728612207217244F, 0.0F, 0.0F);
            this.Neck2 = new ModelPart(this, 35, 11);
            this.Neck2.setPos(0.0F, 0.2F, -3.1F);
            this.Neck2.addBox(-3.0F, -3.5F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, 0.19547687289441354F, 0.0F, 0.0F);
            this.Body2 = new ModelPart(this, 0, 32);
            this.Body2.setPos(0.0F, 0.5F, 8.0F);
            this.Body2.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body2, -0.11728612207217244F, 0.0F, 0.0F);
            this.TopSnout = new ModelPart(this, 45, 28);
            this.TopSnout.setPos(0.0F, 0.0F, -1.5F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.35779249665883756F, 0.0F, 0.0F);
            this.ArmRight = new ModelPart(this, 48, 48);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 2.7F, -0.3F);
            this.ArmRight.addBox(-3.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.0911061832922575F, 0.04555309164612875F, -0.4098033003787853F);
            this.Mouth = new ModelPart(this, 32, 36);
            this.Mouth.setPos(0.0F, 2.8F, -0.6F);
            this.Mouth.addBox(-1.5F, 0.0F, -1.7F, 3.0F, 1.0F, 3.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.2275909337942703F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelPart(this, 19, 46);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(-3.7F, -1.5F, -1.0F);
            this.UpperArmRight.addBox(-1.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.0851720694946941F, 0.0911061832922575F, 0.6373942508178124F);
            this.Nose = new ModelPart(this, 27, 0);
            this.Nose.setPos(0.0F, -0.01F, -2.51F);
            this.Nose.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelPart(this, 0, 0);
            this.Chest.setPos(0.0F, 20.0F, -4.5F);
            this.Chest.addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.0781907508222411F, 1.7453292129831807E-4F, 0.0F);
            this.Tail1 = new ModelPart(this, 45, 36);
            this.Tail1.setPos(0.0F, 1.0F, 3.0F);
            this.Tail1.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.5923647241584257F, 0.0F, 0.0F);
            this.FootLeft = new ModelPart(this, 31, 54);
            this.FootLeft.setPos(-1.2F, 1.0F, 2.5F);
            this.FootLeft.addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.0F, -0.3909537457888271F, 0.0F);
            this.HandRight = new ModelPart(this, 50, 42);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-3.0F, -0.5F, -2.0F);
            this.HandRight.addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0F, 0.4098033003787853F, 0.0F);
            this.Neck1 = new ModelPart(this, 32, 0);
            this.Neck1.setPos(0.0F, 0.0F, -3.0F);
            this.Neck1.addBox(-3.5F, -3.5F, -3.0F, 7.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, -0.27366763203903305F, 0.0F, 0.0F);
            this.LegLeft = new ModelPart(this, 20, 55);
            this.LegLeft.setPos(2.5F, 3.0F, 1.6F);
            this.LegLeft.addBox(-2.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.0781907508222411F, 0.3909537457888271F, 0.0F);
            this.ArmLeft = new ModelPart(this, 48, 48);
            this.ArmLeft.setPos(0.0F, 2.7F, -0.3F);
            this.ArmLeft.addBox(-1.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.0911061832922575F, -0.04555309164612875F, 0.4098033003787853F);
            this.Hips = new ModelPart(this, 0, 44);
            this.Hips.setPos(0.0F, 0.5F, 5.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.LowerArmLeft = new ModelPart(this, 36, 47);
            this.LowerArmLeft.setPos(-1.0F, 2.0F, 0.0F);
            this.LowerArmLeft.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, 0.12217304763960307F, 0.0F, 0.2617993877991494F);
            this.LowerArmRight = new ModelPart(this, 36, 47);
            this.LowerArmRight.mirror = true;
            this.LowerArmRight.setPos(1.0F, 2.0F, 0.0F);
            this.LowerArmRight.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, 0.12217304763960307F, 0.0F, -0.2617993877991494F);
            this.UpperArmLeft = new ModelPart(this, 19, 46);
            this.UpperArmLeft.setPos(3.7F, -1.5F, -1.0F);
            this.UpperArmLeft.addBox(-3.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.0851720694946941F, -0.0911061832922575F, -0.6373942508178124F);


            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }
        @Override
        public void setupAnim(ElephantSealEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Neck1.xRot = (float) Math.toRadians(headPitch) * 0.5F + (isSwimming ? 0F : -0.27F);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.xRot = (float) Math.toRadians(headPitch) * 0.5F + (isSwimming ? 0F : 0.13F);

            if (isSwimming && Entity.getHorizontalDistanceSqr(entity.getDeltaMovement()) > 1.0E-7D) {
                this.Chest.xRot += MathHelper.cos(limbSwing * 0.3F) * 0.25F * limbSwingAmount;
            }
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck1.xRot = MathHelper.cos((limbSwing * speed * 0.1F)) * (degree * 0.1F) * limbSwingAmount - 0.27F;
            this.Neck2.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.1F)) * (degree * 0.2F) * limbSwingAmount + 0.20F;
            this.Head.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.1F)) * (degree * -0.2F) * limbSwingAmount + 0.23F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 5.0F;
            float degree = 1.0F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 1.0F;

                this.UpperArmRight.y = 1.0F;
                this.UpperArmRight.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 0.5F;
                this.LowerArmRight.xRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.1F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.ArmRight.zRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * -0.8F) * limbSwingAmount - 1.4F;
                this.ArmRight.xRot = -0.09F;
                this.HandRight.yRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 1.0F) * limbSwingAmount + 0.409F;

                this.UpperArmLeft.y = 1.0F;
                this.UpperArmLeft.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 0.5F;
                this.LowerArmLeft.xRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.1F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.ArmLeft.zRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 1.4F;
                this.ArmLeft.xRot = -0.09F;
                this.HandLeft.yRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * -1.0F) * limbSwingAmount - 0.409F;

                this.Head.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount;
                this.Neck2.xRot = MathHelper.cos(-1F + (limbSwing * speed * 0.2F)) * (degree * -0.25F) * limbSwingAmount;
                this.Neck1.xRot = MathHelper.cos(-1F + (limbSwing * speed * 0.2F)) * (degree * -0.45F) * limbSwingAmount;
                this.Chest.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.25F) * limbSwingAmount;
                this.Body.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -0.25F) * limbSwingAmount;
                this.Body2.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * -0.1F) * limbSwingAmount;
                this.Hips.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * -0.1F) * limbSwingAmount;

                this.LegRight.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * -0.25F) * limbSwingAmount + 0.07F;
                this.FootRight.xRot = 0F;
                this.FootRight.yRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.6F) * limbSwingAmount + 0.3F;
                this.LegLeft.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * -0.25F) * limbSwingAmount + 0.07F;
                this.FootLeft.xRot = 0F;
                this.FootLeft.yRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.6F) * limbSwingAmount - 0.3F;

            } else if (entity.isOnGround()) {
                this.UpperArmRight.y = MathHelper.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount + -1.5F;
                this.UpperArmRight.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount + 0.0F;
                this.LowerArmRight.xRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.ArmRight.zRot = -0.41F;
                this.ArmRight.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * -1.2F) * limbSwingAmount - 0.09F;
                this.HandRight.yRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 1.0F) * limbSwingAmount + 0.409F;

                this.UpperArmLeft.y = MathHelper.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount + -1.5F;
                this.UpperArmLeft.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount + 0.0F;
                this.LowerArmLeft.xRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.ArmLeft.zRot = 0.41F;
                this.ArmLeft.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * -1.2F) * limbSwingAmount - 0.09F;
                this.HandLeft.yRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * -1.0F) * limbSwingAmount - 0.409F;

                this.Neck1.xRot = MathHelper.cos(-1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.2F) * limbSwingAmount - 0.27F;
                this.Neck2.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.2F) * limbSwingAmount + 0.20F;
                this.Head.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.4F) * limbSwingAmount + 0.13F;

                this.Chest.y = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 3F) * limbSwingAmount + 20.0F;
                this.Chest.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.3F) * limbSwingAmount + 0.07F;
                this.Body.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * -0.4F) * limbSwingAmount + -0.12F;
                this.Body2.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -0.2F) * limbSwingAmount - 0.12F;
                this.Hips.xRot = MathHelper.cos(1.5F + (limbSwing * speed * 0.2F)) * (degree * -0.2F) * limbSwingAmount - 0.2F;

                this.LegRight.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.3F) * limbSwingAmount + 0.2F;
                this.FootRight.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.5F) * limbSwingAmount + 0.3F;
                this.FootRight.yRot = 0.39F;
                this.LegLeft.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.3F) * limbSwingAmount + 0.2F;
                this.FootLeft.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.5F) * limbSwingAmount + 0.3F;
                this.FootLeft.yRot = -0.39F;
            }
        }
    }

    public static class Child extends ElephantSealModel {
        public ModelPart UpperArmLeft;
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart UpperArmRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart Hips;
        public ModelPart LegLeft;
        public ModelPart Tail;
        public ModelPart LegRight;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart Nose;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.texWidth = 64;
            this.texHeight = 32;

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
            

        }
        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            this.LegRight = new ModelPart(this, 19, 18);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-2.5F, 2.3F, 1.6F);
            this.LegRight.addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.1563815016444822F, -0.3909537457888271F, 0.0F);
            this.HandRight = new ModelPart(this, 40, 28);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 2.1F, -0.5F);
            this.HandRight.addBox(-4.0F, -1.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.0911061832922575F, 0.04555309164612875F, -0.4098033003787853F);
            this.Nose = new ModelPart(this, 25, 0);
            this.Nose.setPos(0.0F, -0.01F, -2.01F);
            this.Nose.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelPart(this, 0, 0);
            this.Chest.setPos(0.0F, 22.2F, -4.5F);
            this.Chest.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.0781907508222411F, 1.7453292129831807E-4F, 0.0F);
            this.HandLeft = new ModelPart(this, 40, 28);
            this.HandLeft.setPos(0.0F, 2.1F, -0.5F);
            this.HandLeft.addBox(0.0F, -1.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.0911061832922575F, -0.04555309164612875F, 0.4098033003787853F);
            this.ArmLeft = new ModelPart(this, 30, 28);
            this.ArmLeft.setPos(-1.0F, 0.0F, 0.0F);
            this.ArmLeft.addBox(0.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.12217304763960307F, 0.0F, 0.2617993877991494F);
            this.Tail = new ModelPart(this, 31, 23);
            this.Tail.setPos(0.0F, 0.0F, 4.0F);
            this.Tail.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.8991936386169619F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelPart(this, 19, 27);
            this.UpperArmLeft.setPos(2.7F, -0.5F, 0.0F);
            this.UpperArmLeft.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.0851720694946941F, -0.0911061832922575F, -0.6373942508178124F);
            this.Hips = new ModelPart(this, 0, 23);
            this.Hips.setPos(0.0F, 0.5F, 5.0F);
            this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1563815016444822F, 0.0F, 0.0F);
            this.LegLeft = new ModelPart(this, 19, 18);
            this.LegLeft.setPos(2.5F, 2.3F, 1.6F);
            this.LegLeft.addBox(-1.0F, -1.5F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.1563815016444822F, 0.3909537457888271F, 0.0F);
            this.Snout = new ModelPart(this, 31, 8);
            this.Snout.setPos(0.0F, -1.2F, -2.1F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.4820599540482198F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelPart(this, 19, 27);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(-2.7F, -0.5F, 0.0F);
            this.UpperArmRight.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.0851720694946941F, 0.0911061832922575F, 0.6373942508178124F);
            this.Mouth = new ModelPart(this, 32, 16);
            this.Mouth.setPos(0.0F, 1.6F, -0.9F);
            this.Mouth.addBox(-1.0F, 0.0F, -0.8F, 2.0F, 1.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.5012585491885465F, 0.0F, 0.0F);
            this.Body = new ModelPart(this, 0, 12);
            this.Body.setPos(0.0F, -3.0F, 3.0F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.11728612207217244F, 0.0F, 0.0F);
            this.Head = new ModelPart(this, 40, 0);
            this.Head.setPos(0.0F, 1.6F, -1.0F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5473352640780661F, 0.0F, 0.0F);
            this.ArmRight = new ModelPart(this, 30, 28);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(1.0F, 0.0F, 0.0F);
            this.ArmRight.addBox(-2.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.12217304763960307F, 0.0F, -0.2617993877991494F);
            this.Neck = new ModelPart(this, 24, 0);
            this.Neck.setPos(0.0F, -3.0F, -3.0F);
            this.Neck.addBox(-1.5F, -0.5F, -1.4F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.46914448828868976F, 0.0F, 0.0F);

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }
        @Override
        public void setupAnim(ElephantSealEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Neck.xRot = (float) Math.toRadians(headPitch) * 0.5F + (isSwimming ? 0F : -0.47F);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.xRot = (float) Math.toRadians(headPitch) * 0.5F + (isSwimming ? 0F : 0.55F);

            if (isSwimming && Entity.getHorizontalDistanceSqr(entity.getDeltaMovement()) > 1.0E-7D) {
                this.Chest.xRot += MathHelper.cos(limbSwing * 0.3F) * 0.25F * limbSwingAmount;
            }
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = MathHelper.cos((limbSwing * speed * 0.1F)) * (degree * 0.2F) * limbSwingAmount - 0.47F;
            this.Head.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.1F)) * (degree * -0.2F) * limbSwingAmount + 0.55F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 3.0F;
            float degree = 1.0F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 1.0F;

                this.UpperArmRight.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 0.5F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.1F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.HandRight.yRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 1.0F) * limbSwingAmount + 0.05F;
                this.HandRight.zRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * -0.8F) * limbSwingAmount - 1.4F;

                this.UpperArmLeft.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 0.5F;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.1F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.HandLeft.yRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * -1.0F) * limbSwingAmount - 0.05F;
                this.HandLeft.zRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 1.4F;

                this.Head.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount;
                this.Neck.xRot = MathHelper.cos(-1F + (limbSwing * speed * 0.2F)) * (degree * -0.45F) * limbSwingAmount;
                this.Chest.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.25F) * limbSwingAmount;
                this.Body.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -0.25F) * limbSwingAmount;
                this.Hips.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * -0.1F) * limbSwingAmount;

                this.LegRight.yRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.6F) * limbSwingAmount - 0.4F;
                this.LegLeft.yRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.6F) * limbSwingAmount + 0.4F;

            } else if (entity.isOnGround()) {
                this.UpperArmRight.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount + -0.085F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.HandRight.yRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 1.0F) * limbSwingAmount + 0.05F;
                this.HandRight.zRot = -0.41F;

                this.UpperArmLeft.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount + -0.085F;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.HandLeft.yRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * -1.0F) * limbSwingAmount - 0.05F;
                this.HandLeft.zRot = 0.41F;

                this.Neck.xRot = MathHelper.cos(-1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.2F) * limbSwingAmount - 0.47F;
                this.Head.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.4F) * limbSwingAmount + 0.55F;

                this.Chest.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.3F) * limbSwingAmount + 0.08F;
                this.Body.xRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * -0.4F) * limbSwingAmount + -0.12F;
                this.Hips.xRot = MathHelper.cos(1.5F + (limbSwing * speed * 0.2F)) * (degree * -0.2F) * limbSwingAmount - 0.16F;

                this.LegRight.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.5F) * limbSwingAmount + 0.16F;
                this.LegRight.yRot = -0.39F;
                this.LegLeft.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.5F) * limbSwingAmount + 0.16F;
                this.LegLeft.yRot = 0.39F;
            }
        }
    }
}
