package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.WSDolphinEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class WSDolphinModel extends ZawaBaseModel<WSDolphinEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends WSDolphinModel {
        public ModelPart Chest;
        public ModelPart Tail1;
        public ModelPart TopFin1Right;
        public ModelPart ChestConnection;
        public ModelPart PectoralFinRight1;
        public ModelPart Head;
        public ModelPart PectoralFinLeft1;
        public ModelPart PectoralFinRight2;
        public ModelPart PectoralFinRight3;
        public ModelPart PectoralFinRight4;
        public ModelPart HeadUnder;
        public ModelPart Snout1;
        public ModelPart HeadConnection;
        public ModelPart Mouth1;
        public ModelPart Mouth2;
        public ModelPart Snout2;
        public ModelPart TopSnout1;
        public ModelPart TopSnout2;
        public ModelPart PectoralFinLeft2;
        public ModelPart PectoralFinleft3;
        public ModelPart PectoralFinLeft4;
        public ModelPart Tail2;
        public ModelPart Tail1Connection;
        public ModelPart Tail3;
        public ModelPart Tail2Connection;
        public ModelPart TailFinRight1;
        public ModelPart TailFinLeft1;
        public ModelPart TailFinRight2;
        public ModelPart TailFinLeft2;
        public ModelPart TopFin2;
        public ModelPart TopFin1Left;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Tail1 = this.Body.getChild("Tail1");
            this.Tail1Connection = this.Tail1.getChild("Tail1Connection");

            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.TailFinLeft1 = this.Tail3.getChild("TailFinLeft1");
            this.TailFinLeft2 = this.TailFinLeft1.getChild("TailFinLeft2");

            this.TailFinRight1 = this.Tail3.getChild("TailFinRight1");
            this.TailFinRight2 = this.TailFinRight1.getChild("TailFinRight2");

            this.Tail2Connection = this.Tail2.getChild("Tail2Connection");

            this.TopFin1Right = this.Body.getChild("TopFin1Right");
            this.TopFin1Left = this.TopFin1Right.getChild("TopFin1Left");

            this.TopFin2 = this.TopFin1Right.getChild("TopFin2");

            this.Chest = this.Body.getChild("Chest");
            this.ChestConnection = this.Chest.getChild("ChestConnection");

            this.PectoralFinRight1 = this.Chest.getChild("PectoralFinRight1");
            this.PectoralFinRight2 = this.PectoralFinRight1.getChild("PectoralFinRight2");
            this.PectoralFinRight3 = this.PectoralFinRight2.getChild("PectoralFinRight3");
            this.PectoralFinRight4 = this.PectoralFinRight3.getChild("PectoralFinRight4");

            this.PectoralFinLeft1 = this.Chest.getChild("PectoralFinLeft1");
            this.PectoralFinLeft2 = this.PectoralFinLeft1.getChild("PectoralFinLeft2");
            this.PectoralFinleft3 = this.PectoralFinLeft2.getChild("PectoralFinleft3");
            this.PectoralFinLeft4 = this.PectoralFinleft3.getChild("PectoralFinLeft4");

            this.Head = this.Chest.getChild("Head");
            this.HeadConnection = this.Head.getChild("HeadConnection");

            this.Snout1 = this.Head.getChild("Snout1");
            this.Snout2 = this.Snout1.getChild("Snout2");

            this.TopSnout1 = this.Snout1.getChild("TopSnout1");
            this.TopSnout2 = this.TopSnout1.getChild("TopSnout2");

            this.HeadUnder = this.Head.getChild("HeadUnder");
            this.Mouth1 = this.HeadUnder.getChild("Mouth1");
            this.Mouth2 = this.Mouth1.getChild("Mouth2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 17).addBox(-4.5F, -5.0F, -5.5F, 9.0F, 10.0F, 10.0F), PartPose.offset(0.0F, 20.5F, 0.0F));
            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 37).addBox(-4.0F, -4.5F, 0.0F, 8.0F, 8.0F, 11.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 4.0F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition Tail1Connection = Tail1.addOrReplaceChild("Tail1Connection", CubeListBuilder.create().texOffs(28, 28).addBox(-3.99F, -0.4F, 0.0F, 8.0F, 1.0F, 10.0F), PartPose.offsetAndRotation(0.0F, 3.6F, 0.5F, 0.07539822668221126F, 0.0F, 0.0F));

            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 56).addBox(-3.0F, -4.5F, -0.5F, 6.0F, 6.0F, 9.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 11.0F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 71).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 9.0F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition TailFinLeft1 = Tail3.addOrReplaceChild("TailFinLeft1", CubeListBuilder.create().texOffs(0, 84).addBox(0.0F, -0.5F, -1.0F, 6.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.5F, 0.5F, 2.5F, 0.0F, -0.6736970646382003F, 0.45099308137849586F));
            PartDefinition TailFinLeft2 = TailFinLeft1.addOrReplaceChild("TailFinLeft2", CubeListBuilder.create().texOffs(0, 80).addBox(-7.0F, -0.51F, 0.0F, 7.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(7.0F, 0.0F, -0.7F, 0.0F, -0.2708751078990032F, 0.0F));

            PartDefinition TailFinRight1 = Tail3.addOrReplaceChild("TailFinRight1", CubeListBuilder.create().texOffs(0, 84).addBox(-6.0F, -0.5F, -1.0F, 6.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.5F, 0.5F, 2.5F, 0.0F, 0.6736970646382003F, -0.45099308137849586F));
            PartDefinition TailFinRight2 = TailFinRight1.addOrReplaceChild("TailFinRight2", CubeListBuilder.create().texOffs(0, 80).addBox(0.0F, -0.51F, 0.0F, 7.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-7.0F, 0.0F, -0.7F, 0.0F, 0.2708751078990032F, 0.0F));

            PartDefinition Tail2Connection = Tail2.addOrReplaceChild("Tail2Connection", CubeListBuilder.create().texOffs(31, 50).addBox(-3.0F, -0.4F, 0.0F, 6.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(0.02F, 2.0F, -0.4F, 0.1926843487543837F, 0.0F, 0.0F));

            PartDefinition TopFin1Right = Body.addOrReplaceChild("TopFin1Right", CubeListBuilder.create().texOffs(54, 0).mirror(true).addBox(-0.6F, -5.8F, -2.5F, 1.0F, 9.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -5.5F, 4.0F, -0.701971446457408F, 0.0F, 0.0F));
            PartDefinition TopFin1Left = TopFin1Right.addOrReplaceChild("TopFin1Left", CubeListBuilder.create().texOffs(54, 0).addBox(-0.4F, -5.8F, -2.5F, 1.0F, 9.0F, 4.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition TopFin2 = TopFin1Right.addOrReplaceChild("TopFin2", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5F, -0.8F, -2.7F, 1.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 1.1F, 0.9044296130571394F, 0.0F, 0.0F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.5F, -4.5F, 8.0F, 9.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -0.2F, -8.0F, 0.07958701289225602F, 0.0F, 0.0F));
            PartDefinition ChestConnection = Chest.addOrReplaceChild("ChestConnection", CubeListBuilder.create().texOffs(32, 10).addBox(-4.0F, -0.9F, 0.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.3F, -3.5F, -0.15917402578451204F, 0.0F, 0.0F));

            PartDefinition PectoralFinRight1 = Chest.addOrReplaceChild("PectoralFinRight1", CubeListBuilder.create().texOffs(30, 100).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(-4.5F, 2.7F, -1.5F, -0.038222711617361224F, 0.31066859353918524F, -0.77841681975786F));
            PartDefinition PectoralFinRight2 = PectoralFinRight1.addOrReplaceChild("PectoralFinRight2", CubeListBuilder.create().texOffs(30, 106).addBox(-5.0F, -0.49F, -0.5F, 5.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-1.3F, 0.5F, -1.5F, 0.0F, 0.19547687289441354F, 0.0F));
            PartDefinition PectoralFinRight3 = PectoralFinRight2.addOrReplaceChild("PectoralFinRight3", CubeListBuilder.create().texOffs(20, 102).addBox(-2.0F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.3F, 0.04F, 3.2F, 0.0F, 0.1563815016444822F, 0.0F));
            PartDefinition PectoralFinRight4 = PectoralFinRight3.addOrReplaceChild("PectoralFinRight4", CubeListBuilder.create().texOffs(19, 107).addBox(-2.8F, -0.51F, -1.5F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.8F, 0.0F, 0.0F, 0.0F, -0.7407177105779437F, 0.0F));

            PartDefinition PectoralFinLeft1 = Chest.addOrReplaceChild("PectoralFinLeft1", CubeListBuilder.create().texOffs(30, 100).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(4.5F, 2.7F, -1.9F, -0.038222711617361224F, -0.31066859353918524F, 0.77841681975786F));
            PartDefinition PectoralFinLeft2 = PectoralFinLeft1.addOrReplaceChild("PectoralFinLeft2", CubeListBuilder.create().texOffs(30, 106).mirror(true).addBox(0.0F, -0.49F, -0.5F, 5.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(1.3F, 0.5F, -1.5F, 0.0F, -0.19547687289441354F, 0.0F));
            PartDefinition PectoralFinleft3 = PectoralFinLeft2.addOrReplaceChild("PectoralFinleft3", CubeListBuilder.create().texOffs(20, 102).mirror(true).addBox(0.0F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.3F, 0.04F, 3.2F, 0.0F, -0.1563815016444822F, 0.0F));
            PartDefinition PectoralFinLeft4 = PectoralFinleft3.addOrReplaceChild("PectoralFinLeft4", CubeListBuilder.create().texOffs(19, 107).mirror(true).addBox(-0.2F, -0.51F, -1.5F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.8F, 0.0F, 0.0F, 0.0F, 0.7407177105779437F, 0.0F));

            PartDefinition Head = Chest.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(40, 60).addBox(-3.5F, -3.0F, -4.0F, 7.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -4.5F, 0.07749261978723364F, 0.0F, 0.0F));
            PartDefinition HeadConnection = Head.addOrReplaceChild("HeadConnection", CubeListBuilder.create().texOffs(40, 60).addBox(-3.5F, -0.9F, 0.0F, 7.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -2.2F, -4.0F, 0.15358897750445236F, 0.0F, 0.0F));

            PartDefinition Snout1 = Head.addOrReplaceChild("Snout1", CubeListBuilder.create().texOffs(46, 79).addBox(-2.5F, -1.0F, -4.0F, 5.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -3.5F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Snout2 = Snout1.addOrReplaceChild("Snout2", CubeListBuilder.create().texOffs(52, 85).addBox(-1.5F, -1.0F, -2.8F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, -3.6F, -0.27366763203903305F, 0.0F, 0.0F));

            PartDefinition TopSnout1 = Snout1.addOrReplaceChild("TopSnout1", CubeListBuilder.create().texOffs(34, 85).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -4.9F, -0.8F, 0.3127630032889644F, 0.0F, 0.0F));
            PartDefinition TopSnout2 = TopSnout1.addOrReplaceChild("TopSnout2", CubeListBuilder.create().texOffs(30, 78).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.6681120163581407F, 0.0F, 0.0F));

            PartDefinition HeadUnder = Head.addOrReplaceChild("HeadUnder", CubeListBuilder.create().texOffs(42, 71).addBox(-3.0F, -0.2F, -4.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Mouth1 = HeadUnder.addOrReplaceChild("Mouth1", CubeListBuilder.create().texOffs(46, 93).addBox(-2.5F, -1.0F, -4.0F, 5.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.01F, 1.5F, -3.7F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition Mouth2 = Mouth1.addOrReplaceChild("Mouth2", CubeListBuilder.create().texOffs(50, 100).addBox(-1.5F, -1.0F, -2.8F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.1F, -3.9F, -0.19547687289441354F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 128);
        }

        @Override
        public void setupAnim(WSDolphinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Body.yRot = (float) Math.toRadians(netHeadYaw) * 0.25F;
            this.Body.xRot = (float) Math.toRadians(headPitch);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.25F;
            this.Head.xRot = (float) Math.toRadians(headPitch) * 0.25F - 0.10F;

            if (entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-7D) {
//                this.Body.xRot += -0.05F + -0.05F * Mth.cos(ageInTicks * 0.3F);
                this.Body.xRot += Mth.cos(limbSwing * 0.3F + (float) Math.PI) * 0.5F * limbSwingAmount * 0.5F;
            }
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 1.0F;
                float degree = 1.0F;
                this.Body.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F;
                this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F + -0.1F;
                this.Tail2.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F;
                this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.15F;
                this.Tail3.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -0.6F * limbSwingAmount * 0.5F + -0.2F;
            }
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 2.5F;
            float degree = 1.0F;
            if (entity.isInWater()) {
                this.Body.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F;
                this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.9F * limbSwingAmount * 0.5F + -0.1F;
                this.Tail2.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F;
                this.Chest.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.25F * limbSwingAmount * 0.5F + 0.15F;
                this.Tail3.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F + -0.2F;
                this.PectoralFinRight1.yRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.05F * limbSwingAmount * 0.5F + 0.1F;
                this.PectoralFinLeft1.yRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.05F * limbSwingAmount * 0.5F + -0.1F;
            }
        }
    }

    public static class Child extends WSDolphinModel {
        public ModelPart Chest;
        public ModelPart Tail1;
        public ModelPart TopFin1Right;
        public ModelPart Head;
        public ModelPart ChestConnection;
        public ModelPart PectoralFinLeft1;
        public ModelPart PectoralFinRight;
        public ModelPart Snout1;
        public ModelPart Mouth1;
        public ModelPart Snout2;
        public ModelPart TopSnout1;
        public ModelPart TopSnout2;
        public ModelPart Mouth2;
        public ModelPart Tail1Connection;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail2Connection;
        public ModelPart TailFinLeft1;
        public ModelPart TailFinRight1;
        public ModelPart TailFinLeft2;
        public ModelPart TailFinRight2;
        public ModelPart TopFin2;
        public ModelPart TopFin1Right_1;
        public ModelPart TopFin2_1;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Tail1 = this.Body.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail2Connection = this.Tail2.getChild("Tail2Connection");

            this.Tail3 = this.Tail2.getChild("Tail3");
            this.TailFinRight1 = this.Tail3.getChild("TailFinRight1");
            this.TailFinRight2 = this.TailFinRight1.getChild("TailFinRight2");

            this.TailFinLeft1 = this.Tail3.getChild("TailFinLeft1");
            this.TailFinLeft2 = this.TailFinLeft1.getChild("TailFinLeft2");

            this.Tail1Connection = this.Tail1.getChild("Tail1Connection");

            this.Chest = this.Body.getChild("Chest");
            this.ChestConnection = this.Chest.getChild("ChestConnection");

            this.Head = this.Chest.getChild("Head");
            this.Mouth1 = this.Head.getChild("Mouth1");
            this.Mouth2 = this.Mouth1.getChild("Mouth2");

            this.Snout1 = this.Head.getChild("Snout1");
            this.TopSnout1 = this.Snout1.getChild("TopSnout1");
            this.TopSnout2 = this.TopSnout1.getChild("TopSnout2");

            this.Snout2 = this.Snout1.getChild("Snout2");

            this.PectoralFinLeft1 = this.Chest.getChild("PectoralFinLeft1");

            this.PectoralFinRight = this.Chest.getChild("PectoralFinRight");

            this.TopFin1Right = this.Body.getChild("TopFin1Right");
            this.TopFin2 = this.TopFin1Right.getChild("TopFin2");

            this.TopFin1Right_1 = this.TopFin1Right.getChild("TopFin1Right_1");
            this.TopFin2_1 = this.TopFin1Right_1.getChild("TopFin2_1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -3.6F, -3.0F, 6.0F, 7.0F, 7.0F), PartPose.offset(0.0F, 21.5F, 0.0F));
            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 25).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 5.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 37).addBox(-2.0F, -2.5F, -0.5F, 4.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Tail2Connection = Tail2.addOrReplaceChild("Tail2Connection", CubeListBuilder.create().texOffs(13, 40).addBox(-2.0F, -0.4F, 0.0F, 4.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.02F, 1.0F, -0.4F, 0.1926843487543837F, 0.0F, 0.0F));

            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 45).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.5F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition TailFinRight1 = Tail3.addOrReplaceChild("TailFinRight1", CubeListBuilder.create().texOffs(0, 50).mirror(true).addBox(-3.0F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.3F, -0.5F, 1.5F, 0.0F, 0.6736970646382003F, -0.45099308137849586F));
            PartDefinition TailFinRight2 = TailFinRight1.addOrReplaceChild("TailFinRight2", CubeListBuilder.create().texOffs(0, 54).mirror(true).addBox(0.0F, -0.51F, 0.0F, 4.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-4.0F, 0.0F, -0.7F, 0.0F, 0.2708751078990032F, 0.0F));

            PartDefinition TailFinLeft1 = Tail3.addOrReplaceChild("TailFinLeft1", CubeListBuilder.create().texOffs(0, 50).addBox(0.0F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.3F, -0.5F, 1.5F, 0.0F, -0.6736970646382003F, 0.45099308137849586F));
            PartDefinition TailFinLeft2 = TailFinLeft1.addOrReplaceChild("TailFinLeft2", CubeListBuilder.create().texOffs(0, 54).addBox(-4.0F, -0.51F, 0.0F, 4.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(4.0F, 0.0F, -0.7F, 0.0F, -0.2708751078990032F, 0.0F));

            PartDefinition Tail1Connection = Tail1.addOrReplaceChild("Tail1Connection", CubeListBuilder.create().texOffs(17, 30).addBox(-2.49F, -0.4F, 0.0F, 5.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.07539822668221126F, 0.0F, 0.0F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -3.5F, 6.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.01F, -0.2F, -4.0F, 0.07958701289225602F, 0.0F, 0.0F));
            PartDefinition ChestConnection = Chest.addOrReplaceChild("ChestConnection", CubeListBuilder.create().texOffs(19, 10).addBox(-3.0F, -0.9F, 0.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.9F, -2.4F, -0.15917402578451204F, 0.0F, 0.0F));

            PartDefinition Head = Chest.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(40, 10).addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.07749261978723364F, 0.0F, 0.0F));
            PartDefinition Mouth1 = Head.addOrReplaceChild("Mouth1", CubeListBuilder.create().texOffs(50, 30).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 2.5F, -1.6F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Mouth2 = Mouth1.addOrReplaceChild("Mouth2", CubeListBuilder.create().texOffs(50, 34).addBox(-1.0F, -1.0F, -1.8F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.1F, -2.0F, -0.19547687289441354F, 0.0F, 0.0F));

            PartDefinition Snout1 = Head.addOrReplaceChild("Snout1", CubeListBuilder.create().texOffs(39, 30).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -2.0F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition TopSnout1 = Snout1.addOrReplaceChild("TopSnout1", CubeListBuilder.create().texOffs(44, 20).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.6F, 0.0F, 0.3127630032889644F, 0.0F, 0.0F));
            PartDefinition TopSnout2 = TopSnout1.addOrReplaceChild("TopSnout2", CubeListBuilder.create().texOffs(45, 25).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.8F, 0.6681120163581407F, 0.0F, 0.0F));

            PartDefinition Snout2 = Snout1.addOrReplaceChild("Snout2", CubeListBuilder.create().texOffs(41, 33).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.1F, -0.27366763203903305F, 0.0F, 0.0F));

            PartDefinition PectoralFinLeft1 = Chest.addOrReplaceChild("PectoralFinLeft1", CubeListBuilder.create().texOffs(20, 50).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(2.9F, 1.7F, -2.4F, -0.038222711617361224F, -0.31066859353918524F, 0.77841681975786F));

            PartDefinition PectoralFinRight = Chest.addOrReplaceChild("PectoralFinRight", CubeListBuilder.create().texOffs(20, 50).mirror(true).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-3.0F, 1.7F, -2.4F, 0.038222711617361224F, 0.31066859353918524F, -0.77841681975786F));

            PartDefinition TopFin1Right = Body.addOrReplaceChild("TopFin1Right", CubeListBuilder.create().texOffs(54, 0).mirror(true).addBox(-0.6F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 3.0F, -0.701971446457408F, 0.0F, 0.0F));
            PartDefinition TopFin2 = TopFin1Right.addOrReplaceChild("TopFin2", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5F, -0.7F, -2.5F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 1.1F, 0.9044296130571394F, 0.0F, 0.0F));

            PartDefinition TopFin1Right_1 = TopFin1Right.addOrReplaceChild("TopFin1Right_1", CubeListBuilder.create().texOffs(54, 0).mirror(true).addBox(-0.4F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            PartDefinition TopFin2_1 = TopFin1Right_1.addOrReplaceChild("TopFin2_1", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5F, -0.7F, -2.5F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 1.1F, 0.9044296130571394F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(WSDolphinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Body.yRot = (float) Math.toRadians(netHeadYaw) * 0.25F;
            this.Body.xRot = (float) Math.toRadians(headPitch);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.25F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 1.0F;
                float degree = 1.0F;
                this.Body.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F;
                this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F + -0.1F;
                this.Tail2.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F;
                this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.15F;
                this.Tail3.xRot = Mth.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -0.6F * limbSwingAmount * 0.5F + -0.2F;
            }
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.5F;
            float degree = 1.0F;
            if (entity.isInWater()) {
                this.Body.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F;
                this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.9F * limbSwingAmount * 0.5F + -0.1F;
                this.Tail2.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F;
                this.Chest.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F + 0.15F;
                this.Tail3.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F + -0.2F;
                this.PectoralFinRight.yRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.05F * limbSwingAmount * 0.5F + 0.1F;
                this.PectoralFinLeft1.yRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.05F * limbSwingAmount * 0.5F + -0.1F;
            }

        }
    }
}
