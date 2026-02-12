package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.HarborSealEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class HarborSealModel extends ZawaBaseModel<HarborSealEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends HarborSealModel {
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
        public ModelPart Nose;
        public ModelPart LowerArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.LowerArmLeft = this.UpperArmLeft.getChild("LowerArmLeft");
            this.ArmLeft = this.LowerArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.LowerArmRight = this.UpperArmRight.getChild("LowerArmRight");
            this.ArmRight = this.LowerArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Neck1 = this.Chest.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Head = this.Neck2.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Nose = this.Snout.getChild("Nose");

            this.Mouth = this.Snout.getChild("Mouth");

            this.Body = this.Chest.getChild("Body");
            this.Body2 = this.Body.getChild("Body2");
            this.Hips = this.Body2.getChild("Hips");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");

            this.LegLeft = this.Hips.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.LegRight = this.Hips.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 20.0F, -4.5F, 0.0781907508222411F, 1.7453292129831807E-4F, 0.0F));
            PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(19, 46).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(3.7F, -1.5F, -1.0F, -0.0851720694946941F, -0.0911061832922575F, -0.6373942508178124F));
            PartDefinition LowerArmLeft = UpperArmLeft.addOrReplaceChild("LowerArmLeft", CubeListBuilder.create().texOffs(36, 47).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-1.0F, 2.0F, 0.0F, 0.12217304763960307F, 0.0F, 0.2617993877991494F));
            PartDefinition ArmLeft = LowerArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(48, 48).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.7F, -0.3F, -0.0911061832922575F, -0.04555309164612875F, 0.4098033003787853F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(50, 42).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(3.0F, -0.5F, -2.0F, 0.0F, -0.4098033003787853F, 0.0F));

            PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(19, 46).mirror(true).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(-3.7F, -1.5F, -1.0F, -0.0851720694946941F, 0.0911061832922575F, 0.6373942508178124F));
            PartDefinition LowerArmRight = UpperArmRight.addOrReplaceChild("LowerArmRight", CubeListBuilder.create().texOffs(36, 47).mirror(true).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(1.0F, 2.0F, 0.0F, 0.12217304763960307F, 0.0F, -0.2617993877991494F));
            PartDefinition ArmRight = LowerArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(48, 48).mirror(true).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.7F, -0.3F, -0.0911061832922575F, 0.04555309164612875F, -0.4098033003787853F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(50, 42).mirror(true).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(-3.0F, -0.5F, -2.0F, 0.0F, 0.4098033003787853F, 0.0F));

            PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(32, 0).addBox(-3.5F, -3.5F, -3.0F, 7.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.27366763203903305F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(35, 11).addBox(-3.0F, -3.5F, -1.0F, 6.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -3.1F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(34, 19).addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -2.4F, 0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(32, 29).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.5F, -1.9F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F), PartPose.offset(0.0F, -0.01F, -2.51F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(32, 36).addBox(-1.5F, 0.0F, -1.7F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.8F, -0.6F, -0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 4.0F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 8.0F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Hips = Body2.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 44).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 4.0F), PartPose.offset(0.0F, 0.5F, 5.0F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(45, 36).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 3.0F, -0.5923647241584257F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(55, 36).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 1.8F, -0.46914448828868976F, 0.0F, 0.0F));

            PartDefinition LegLeft = Hips.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(20, 55).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(2.5F, 3.0F, 1.6F, 0.0781907508222411F, 0.3909537457888271F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(31, 54).addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(-1.2F, 1.0F, 2.5F, 0.0F, -0.3909537457888271F, 0.0F));

            PartDefinition LegRight = Hips.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(20, 55).mirror(true).addBox(0.0F, -0.5F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-2.5F, 3.0F, 1.6F, 0.0781907508222411F, -0.3909537457888271F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(31, 54).mirror(true).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(1.2F, 1.0F, 2.5F, 0.0F, 0.3909537457888271F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(HarborSealEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Neck1.xRot = (float) Math.toRadians(headPitch) * 0.5F + (isSwimming ? 0F : -0.27F);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.xRot = (float) Math.toRadians(headPitch) * 0.5F + (isSwimming ? 0F : 0.13F);

            if (isSwimming && entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-7D) {
                this.Chest.xRot += Mth.cos(limbSwing * 0.3F) * 0.25F * limbSwingAmount;
            }
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck1.xRot = Mth.cos((limbSwing * speed * 0.1F)) * (degree * 0.1F) * limbSwingAmount - 0.27F;
            this.Neck2.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.1F)) * (degree * 0.2F) * limbSwingAmount + 0.20F;
            this.Head.xRot = Mth.cos(2.0F + (limbSwing * speed * 0.1F)) * (degree * -0.2F) * limbSwingAmount + 0.23F;
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
                this.UpperArmRight.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 0.5F;
                this.LowerArmRight.xRot = Mth.cos(4.0F + (limbSwing * speed * 0.1F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.ArmRight.zRot = Mth.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * -0.8F) * limbSwingAmount - 1.4F;
                this.ArmRight.xRot = -0.09F;
                this.HandRight.yRot = Mth.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 1.0F) * limbSwingAmount + 0.409F;

                this.UpperArmLeft.y = 1.0F;
                this.UpperArmLeft.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 0.5F;
                this.LowerArmLeft.xRot = Mth.cos(4.0F + (limbSwing * speed * 0.1F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.ArmLeft.zRot = Mth.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 1.4F;
                this.ArmLeft.xRot = -0.09F;
                this.HandLeft.yRot = Mth.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * -1.0F) * limbSwingAmount - 0.409F;

                this.Head.xRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount;
                this.Neck2.xRot = Mth.cos(-1F + (limbSwing * speed * 0.2F)) * (degree * -0.25F) * limbSwingAmount;
                this.Neck1.xRot = Mth.cos(-1F + (limbSwing * speed * 0.2F)) * (degree * -0.45F) * limbSwingAmount;
                this.Chest.xRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * 0.25F) * limbSwingAmount;
                this.Body.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -0.25F) * limbSwingAmount;
                this.Body2.xRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * -0.1F) * limbSwingAmount;
                this.Hips.xRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * -0.1F) * limbSwingAmount;

                this.LegRight.xRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * -0.25F) * limbSwingAmount + 0.07F;
                this.FootRight.xRot = 0F;
                this.FootRight.yRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * 0.6F) * limbSwingAmount + 0.3F;
                this.LegLeft.xRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * -0.25F) * limbSwingAmount + 0.07F;
                this.FootLeft.xRot = 0F;
                this.FootLeft.yRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * 0.6F) * limbSwingAmount - 0.3F;

            } else if (entity.onGround()) {
                this.UpperArmRight.y = Mth.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount + -1.5F;
                this.UpperArmRight.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount + 0.0F;
                this.LowerArmRight.xRot = Mth.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.ArmRight.zRot = -0.41F;
                this.ArmRight.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * -1.2F) * limbSwingAmount - 0.09F;
                this.HandRight.yRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 1.0F) * limbSwingAmount + 0.409F;

                this.UpperArmLeft.y = Mth.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount + -1.5F;
                this.UpperArmLeft.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount + 0.0F;
                this.LowerArmLeft.xRot = Mth.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.ArmLeft.zRot = 0.41F;
                this.ArmLeft.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * -1.2F) * limbSwingAmount - 0.09F;
                this.HandLeft.yRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * -1.0F) * limbSwingAmount - 0.409F;

                this.Neck1.xRot = Mth.cos(-1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.2F) * limbSwingAmount - 0.27F;
                this.Neck2.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.2F) * limbSwingAmount + 0.20F;
                this.Head.xRot = Mth.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.4F) * limbSwingAmount + 0.13F;

                this.Chest.y = Mth.cos((limbSwing * speed * 0.2F)) * (degree * 3F) * limbSwingAmount + 20.0F;
                this.Chest.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.3F) * limbSwingAmount + 0.07F;
                this.Body.xRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * -0.4F) * limbSwingAmount + -0.12F;
                this.Body2.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -0.2F) * limbSwingAmount - 0.12F;
                this.Hips.xRot = Mth.cos(1.5F + (limbSwing * speed * 0.2F)) * (degree * -0.2F) * limbSwingAmount - 0.2F;

                this.LegRight.xRot = Mth.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.3F) * limbSwingAmount + 0.2F;
                this.FootRight.xRot = Mth.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.5F) * limbSwingAmount + 0.3F;
                this.FootRight.yRot = 0.39F;
                this.LegLeft.xRot = Mth.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.3F) * limbSwingAmount + 0.2F;
                this.FootLeft.xRot = Mth.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.5F) * limbSwingAmount + 0.3F;
                this.FootLeft.yRot = -0.39F;
            }
        }
    }

    public static class Child extends HarborSealModel {
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
        public ModelPart TopSnout;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Nose = this.Snout.getChild("Nose");

            this.Mouth = this.Snout.getChild("Mouth");

            this.TopSnout = this.Snout.getChild("TopSnout");

            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.LegLeft = this.Hips.getChild("LegLeft");

            this.Tail = this.Hips.getChild("Tail");

            this.LegRight = this.Hips.getChild("LegRight");

            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 22.2F, -4.5F, 0.0781907508222411F, 1.7453292129831807E-4F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(24, 0).addBox(-1.5F, -0.5F, -1.4F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -3.0F, -3.0F, -0.46914448828868976F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(40, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.6F, -1.0F, 0.5473352640780661F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(32, 9).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -1.8F, 0.16929693411449862F, 0.0F, 0.0F));
            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, -0.01F, -2.01F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(32, 16).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, -1.1F, -0.11030481172209784F, 0.0F, 0.0F));

            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(44, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.35779249665883756F, 0.0F, 0.0F));

            PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(19, 27).mirror(true).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-2.7F, -0.5F, 0.0F, -0.0851720694946941F, 0.0911061832922575F, 0.6373942508178124F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(30, 28).mirror(true).addBox(-2.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.12217304763960307F, 0.0F, -0.2617993877991494F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(40, 28).mirror(true).addBox(-4.0F, -1.0F, -1.5F, 4.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.1F, -0.5F, -0.0911061832922575F, 0.04555309164612875F, -0.4098033003787853F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 12).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 3.0F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 5.0F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition LegLeft = Hips.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(19, 18).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(2.5F, 2.3F, 1.6F, 0.1563815016444822F, 0.3909537457888271F, 0.0F));

            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(31, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.8991936386169619F, 0.0F, 0.0F));

            PartDefinition LegRight = Hips.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(19, 18).mirror(true).addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(-2.5F, 2.3F, 1.6F, 0.1563815016444822F, -0.3909537457888271F, 0.0F));

            PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(19, 27).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(2.7F, -0.5F, 0.0F, -0.0851720694946941F, -0.0911061832922575F, -0.6373942508178124F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(30, 28).addBox(0.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.12217304763960307F, 0.0F, 0.2617993877991494F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(40, 28).addBox(0.0F, -1.0F, -1.5F, 4.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.1F, -0.5F, -0.0911061832922575F, -0.04555309164612875F, 0.4098033003787853F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(HarborSealEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Neck.xRot = (float) Math.toRadians(headPitch) * 0.5F + (isSwimming ? 0F : -0.47F);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.xRot = (float) Math.toRadians(headPitch) * 0.5F + (isSwimming ? 0F : 0.55F);

            if (isSwimming && entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-7D) {
                this.Chest.xRot += Mth.cos(limbSwing * 0.3F) * 0.25F * limbSwingAmount;
            }
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos((limbSwing * speed * 0.1F)) * (degree * 0.2F) * limbSwingAmount - 0.47F;
            this.Head.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.1F)) * (degree * -0.2F) * limbSwingAmount + 0.55F;
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

                this.UpperArmRight.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 0.5F;
                this.ArmRight.xRot = Mth.cos(4.0F + (limbSwing * speed * 0.1F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.HandRight.yRot = Mth.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 1.0F) * limbSwingAmount + 0.05F;
                this.HandRight.zRot = Mth.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * -0.8F) * limbSwingAmount - 1.4F;

                this.UpperArmLeft.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 0.5F;
                this.ArmLeft.xRot = Mth.cos(4.0F + (limbSwing * speed * 0.1F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.HandLeft.yRot = Mth.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * -1.0F) * limbSwingAmount - 0.05F;
                this.HandLeft.zRot = Mth.cos(3.0F + (limbSwing * speed * 0.1F)) * (degree * 0.8F) * limbSwingAmount + 1.4F;

                this.Head.xRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount;
                this.Neck.xRot = Mth.cos(-1F + (limbSwing * speed * 0.2F)) * (degree * -0.45F) * limbSwingAmount;
                this.Chest.xRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * 0.25F) * limbSwingAmount;
                this.Body.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -0.25F) * limbSwingAmount;
                this.Hips.xRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * -0.1F) * limbSwingAmount;

                this.LegRight.yRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * 0.6F) * limbSwingAmount - 0.4F;
                this.LegLeft.yRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * 0.6F) * limbSwingAmount + 0.4F;

            } else if (entity.onGround()) {
                this.UpperArmRight.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount + -0.085F;
                this.ArmRight.xRot = Mth.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.HandRight.yRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 1.0F) * limbSwingAmount + 0.05F;
                this.HandRight.zRot = -0.41F;

                this.UpperArmLeft.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount + -0.085F;
                this.ArmLeft.xRot = Mth.cos(4.0F + (limbSwing * speed * 0.2F)) * (degree * 0.5F) * limbSwingAmount + 0.12F;
                this.HandLeft.yRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F)) * (degree * -1.0F) * limbSwingAmount - 0.05F;
                this.HandLeft.zRot = 0.41F;

                this.Neck.xRot = Mth.cos(-1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.2F) * limbSwingAmount - 0.47F;
                this.Head.xRot = Mth.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.4F) * limbSwingAmount + 0.55F;

                this.Chest.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.3F) * limbSwingAmount + 0.08F;
                this.Body.xRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * -0.4F) * limbSwingAmount + -0.12F;
                this.Hips.xRot = Mth.cos(1.5F + (limbSwing * speed * 0.2F)) * (degree * -0.2F) * limbSwingAmount - 0.16F;

                this.LegRight.xRot = Mth.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.5F) * limbSwingAmount + 0.16F;
                this.LegRight.yRot = -0.39F;
                this.LegLeft.xRot = Mth.cos(2.0F + (limbSwing * speed * 0.2F)) * (degree * -0.5F) * limbSwingAmount + 0.16F;
                this.LegLeft.yRot = 0.39F;
            }
        }
    }
}
