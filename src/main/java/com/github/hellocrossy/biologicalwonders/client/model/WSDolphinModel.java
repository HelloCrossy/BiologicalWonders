package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.WSDolphinEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class WSDolphinModel extends ZawaBaseModel<WSDolphinEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    @MethodsReturnNonnullByDefault
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
            this.texWidth = 64;
            this.texHeight = 128;
            this.PectoralFinRight2.addChild(this.PectoralFinRight3);
            this.Tail1.addChild(this.Tail1Connection);
            this.Tail3.addChild(this.TailFinLeft1);
            this.PectoralFinRight3.addChild(this.PectoralFinRight4);
            this.Chest.addChild(this.ChestConnection);
            this.TopSnout1.addChild(this.TopSnout2);
            this.HeadUnder.addChild(this.Mouth1);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.HeadConnection);
            this.PectoralFinLeft2.addChild(this.PectoralFinleft3);
            this.Body.addChild(this.Tail1);
            this.Chest.addChild(this.PectoralFinRight1);
            this.Snout1.addChild(this.Snout2);
            this.Body.addChild(this.TopFin1Right);
            this.Tail2.addChild(this.Tail3);
            this.Snout1.addChild(this.TopSnout1);
            this.Head.addChild(this.Snout1);
            this.TailFinLeft1.addChild(this.TailFinLeft2);
            this.PectoralFinleft3.addChild(this.PectoralFinLeft4);
            this.Chest.addChild(this.PectoralFinLeft1);
            this.TailFinRight1.addChild(this.TailFinRight2);
            this.Tail3.addChild(this.TailFinRight1);
            this.Tail2.addChild(this.Tail2Connection);
            this.TopFin1Right.addChild(this.TopFin1Left);
            this.Body.addChild(this.Chest);
            this.PectoralFinRight1.addChild(this.PectoralFinRight2);
            this.Chest.addChild(this.Head);
            this.Head.addChild(this.HeadUnder);
            this.Mouth1.addChild(this.Mouth2);
            this.TopFin1Right.addChild(this.TopFin2);
            this.PectoralFinLeft1.addChild(this.PectoralFinLeft2);

        }
        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            this.PectoralFinRight3 = new ModelPart(this, 20, 102);
            this.PectoralFinRight3.setPos(0.3F, 0.04F, 3.2F);
            this.PectoralFinRight3.addBox(-2.0F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight3, 0.0F, 0.1563815016444822F, 0.0F);
            this.Tail1Connection = new ModelPart(this, 28, 28);
            this.Tail1Connection.setPos(0.0F, 3.6F, 0.5F);
            this.Tail1Connection.addBox(-3.99F, -0.4F, 0.0F, 8.0F, 1.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1Connection, 0.07539822668221126F, 0.0F, 0.0F);
            this.TailFinLeft1 = new ModelPart(this, 0, 84);
            this.TailFinLeft1.setPos(0.5F, 0.5F, 2.5F);
            this.TailFinLeft1.addBox(0.0F, -0.5F, -1.0F, 6.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinLeft1, 0.0F, -0.6736970646382003F, 0.45099308137849586F);
            this.PectoralFinRight4 = new ModelPart(this, 19, 107);
            this.PectoralFinRight4.setPos(-1.8F, 0.0F, 0.0F);
            this.PectoralFinRight4.addBox(-2.8F, -0.51F, -1.5F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight4, 0.0F, -0.7407177105779437F, 0.0F);
            this.ChestConnection = new ModelPart(this, 32, 10);
            this.ChestConnection.setPos(0.0F, 4.3F, -3.5F);
            this.ChestConnection.addBox(-4.0F, -0.9F, 0.0F, 8.0F, 1.0F, 6.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(ChestConnection, -0.15917402578451204F, 0.0F, 0.0F);
            this.Body = new ModelPart(this, 0, 17);
            this.Body.setPos(0.0F, 20.5F, 0.0F);
            this.Body.addBox(-4.5F, -5.0F, -5.5F, 9.0F, 10.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.TopSnout2 = new ModelPart(this, 30, 78);
            this.TopSnout2.setPos(0.0F, 0.0F, -3.0F);
            this.TopSnout2.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout2, 0.6681120163581407F, 0.0F, 0.0F);
            this.Mouth1 = new ModelPart(this, 46, 93);
            this.Mouth1.setPos(0.01F, 1.5F, -3.7F);
            this.Mouth1.addBox(-2.5F, -1.0F, -4.0F, 5.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth1, -0.03909537541112055F, 0.0F, 0.0F);
            this.Tail2 = new ModelPart(this, 0, 56);
            this.Tail2.setPos(0.0F, 0.5F, 11.0F);
            this.Tail2.addBox(-3.0F, -4.5F, -0.5F, 6.0F, 6.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.11728612207217244F, 0.0F, 0.0F);
            this.HeadConnection = new ModelPart(this, 40, 60);
            this.HeadConnection.setPos(0.0F, -2.2F, -4.0F);
            this.HeadConnection.addBox(-3.5F, -0.9F, 0.0F, 7.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HeadConnection, 0.15358897750445236F, 0.0F, 0.0F);
            this.PectoralFinleft3 = new ModelPart(this, 20, 102);
            this.PectoralFinleft3.mirror = true;
            this.PectoralFinleft3.setPos(-0.3F, 0.04F, 3.2F);
            this.PectoralFinleft3.addBox(0.0F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinleft3, 0.0F, -0.1563815016444822F, 0.0F);
            this.Tail1 = new ModelPart(this, 0, 37);
            this.Tail1.setPos(0.0F, 0.5F, 4.0F);
            this.Tail1.addBox(-4.0F, -4.5F, 0.0F, 8.0F, 8.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.0781907508222411F, 0.0F, 0.0F);
            this.PectoralFinRight1 = new ModelPart(this, 30, 100);
            this.PectoralFinRight1.setPos(-4.5F, 2.7F, -1.5F);
            this.PectoralFinRight1.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight1, -0.038222711617361224F, 0.31066859353918524F, -0.77841681975786F);
            this.Snout2 = new ModelPart(this, 52, 85);
            this.Snout2.setPos(-0.01F, 0.0F, -3.6F);
            this.Snout2.addBox(-1.5F, -1.0F, -2.8F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout2, -0.27366763203903305F, 0.0F, 0.0F);
            this.TopFin1Right = new ModelPart(this, 54, 0);
            this.TopFin1Right.mirror = true;
            this.TopFin1Right.setPos(0.0F, -5.5F, 4.0F);
            this.TopFin1Right.addBox(-0.6F, -5.8F, -2.5F, 1.0F, 9.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopFin1Right, -0.701971446457408F, 0.0F, 0.0F);
            this.Tail3 = new ModelPart(this, 0, 71);
            this.Tail3.setPos(0.0F, -2.0F, 9.0F);
            this.Tail3.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, -0.1563815016444822F, 0.0F, 0.0F);
            this.TopSnout1 = new ModelPart(this, 34, 85);
            this.TopSnout1.setPos(0.0F, -4.9F, -0.8F);
            this.TopSnout1.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout1, 0.3127630032889644F, 0.0F, 0.0F);
            this.Snout1 = new ModelPart(this, 46, 79);
            this.Snout1.setPos(0.0F, 2.0F, -3.5F);
            this.Snout1.addBox(-2.5F, -1.0F, -4.0F, 5.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout1, -0.11728612207217244F, 0.0F, 0.0F);
            this.TailFinLeft2 = new ModelPart(this, 0, 80);
            this.TailFinLeft2.setPos(7.0F, 0.0F, -0.7F);
            this.TailFinLeft2.addBox(-7.0F, -0.51F, 0.0F, 7.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinLeft2, 0.0F, -0.2708751078990032F, 0.0F);
            this.PectoralFinLeft4 = new ModelPart(this, 19, 107);
            this.PectoralFinLeft4.mirror = true;
            this.PectoralFinLeft4.setPos(1.8F, 0.0F, 0.0F);
            this.PectoralFinLeft4.addBox(-0.2F, -0.51F, -1.5F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft4, 0.0F, 0.7407177105779437F, 0.0F);
            this.PectoralFinLeft1 = new ModelPart(this, 30, 100);
            this.PectoralFinLeft1.mirror = true;
            this.PectoralFinLeft1.setPos(4.5F, 2.7F, -1.9F);
            this.PectoralFinLeft1.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft1, -0.038222711617361224F, -0.31066859353918524F, 0.77841681975786F);
            this.TailFinRight2 = new ModelPart(this, 0, 80);
            this.TailFinRight2.setPos(-7.0F, 0.0F, -0.7F);
            this.TailFinRight2.addBox(0.0F, -0.51F, 0.0F, 7.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinRight2, 0.0F, 0.2708751078990032F, 0.0F);
            this.TailFinRight1 = new ModelPart(this, 0, 84);
            this.TailFinRight1.setPos(-0.5F, 0.5F, 2.5F);
            this.TailFinRight1.addBox(-6.0F, -0.5F, -1.0F, 6.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinRight1, 0.0F, 0.6736970646382003F, -0.45099308137849586F);
            this.Tail2Connection = new ModelPart(this, 31, 50);
            this.Tail2Connection.setPos(0.02F, 2.0F, -0.4F);
            this.Tail2Connection.addBox(-3.0F, -0.4F, 0.0F, 6.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2Connection, 0.1926843487543837F, 0.0F, 0.0F);
            this.TopFin1Left = new ModelPart(this, 54, 0);
            this.TopFin1Left.setPos(0.0F, 0.0F, 0.0F);
            this.TopFin1Left.addBox(-0.4F, -5.8F, -2.5F, 1.0F, 9.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelPart(this, 0, 0);
            this.Chest.setPos(0.0F, -0.2F, -8.0F);
            this.Chest.addBox(-4.0F, -4.5F, -4.5F, 8.0F, 9.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.07958701289225602F, 0.0F, 0.0F);
            this.PectoralFinRight2 = new ModelPart(this, 30, 106);
            this.PectoralFinRight2.setPos(-1.3F, 0.5F, -1.5F);
            this.PectoralFinRight2.addBox(-5.0F, -0.49F, -0.5F, 5.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight2, 0.0F, 0.19547687289441354F, 0.0F);
            this.Head = new ModelPart(this, 40, 60);
            this.Head.setPos(0.0F, -0.5F, -4.5F);
            this.Head.addBox(-3.5F, -3.0F, -4.0F, 7.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.07749261978723364F, 0.0F, 0.0F);
            this.HeadUnder = new ModelPart(this, 42, 71);
            this.HeadUnder.setPos(0.0F, 3.0F, 0.0F);
            this.HeadUnder.addBox(-3.0F, -0.2F, -4.0F, 6.0F, 2.0F, 5.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(HeadUnder, -0.1563815016444822F, 0.0F, 0.0F);
            this.Mouth2 = new ModelPart(this, 50, 100);
            this.Mouth2.setPos(0.0F, -0.1F, -3.9F);
            this.Mouth2.addBox(-1.5F, -1.0F, -2.8F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth2, -0.19547687289441354F, 0.0F, 0.0F);
            this.TopFin2 = new ModelPart(this, 46, 0);
            this.TopFin2.setPos(0.0F, -2.5F, 1.1F);
            this.TopFin2.addBox(-0.5F, -0.8F, -2.7F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopFin2, 0.9044296130571394F, 0.0F, 0.0F);
            this.PectoralFinLeft2 = new ModelPart(this, 30, 106);
            this.PectoralFinLeft2.mirror = true;
            this.PectoralFinLeft2.setPos(1.3F, 0.5F, -1.5F);
            this.PectoralFinLeft2.addBox(0.0F, -0.49F, -0.5F, 5.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft2, 0.0F, -0.19547687289441354F, 0.0F);

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }
        @Override
        public void setupAnim(WSDolphinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Body.yRot = (float) Math.toRadians(netHeadYaw) * 0.25F;
            this.Body.xRot = (float) Math.toRadians(headPitch);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.25F;
            this.Head.xRot = (float) Math.toRadians(headPitch) * 0.25F - 0.10F;

            if (Entity.getHorizontalDistanceSqr(entity.getDeltaMovement()) > 1.0E-7D) {
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
                this.Chest.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.25F * limbSwingAmount * 0.5F + 0.15F;
                this.Tail3.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F + -0.2F;
                this.PectoralFinRight1.yRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.05F * limbSwingAmount * 0.5F + 0.1F;
                this.PectoralFinLeft1.yRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.05F * limbSwingAmount * 0.5F + -0.1F;
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
            this.texWidth = 64;
            this.texHeight = 64;
            this.TailFinRight1.addChild(this.TailFinRight2);
            this.Body.addChild(this.Tail1);
            this.Tail3.addChild(this.TailFinRight1);
            this.Chest.addChild(this.ChestConnection);
            this.Tail2.addChild(this.Tail2Connection);
            this.TopFin1Right_1.addChild(this.TopFin2_1);
            this.Head.addChild(this.Mouth1);
            this.Head.addChild(this.Snout1);
            this.Chest.addChild(this.Head);
            this.Snout1.addChild(this.TopSnout1);
            this.Tail3.addChild(this.TailFinLeft1);
            this.TopFin1Right.addChild(this.TopFin2);
            this.Tail1.addChild(this.Tail2);
            this.TopSnout1.addChild(this.TopSnout2);
            this.Body.addChild(this.Chest);
            this.Body.addChild(this.TopFin1Right);
            this.Chest.addChild(this.PectoralFinLeft1);
            this.Tail2.addChild(this.Tail3);
            this.TailFinLeft1.addChild(this.TailFinLeft2);
            this.Chest.addChild(this.PectoralFinRight);
            this.Tail1.addChild(this.Tail1Connection);
            this.Mouth1.addChild(this.Mouth2);
            this.Snout1.addChild(this.Snout2);
            this.TopFin1Right.addChild(this.TopFin1Right_1);

        }
        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            this.TailFinRight2 = new ModelPart(this, 0, 54);
            this.TailFinRight2.mirror = true;
            this.TailFinRight2.setPos(-4.0F, 0.0F, -0.7F);
            this.TailFinRight2.addBox(0.0F, -0.51F, 0.0F, 4.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinRight2, 0.0F, 0.2708751078990032F, 0.0F);
            this.Tail1 = new ModelPart(this, 0, 25);
            this.Tail1.setPos(0.0F, 0.0F, 3.0F);
            this.Tail1.addBox(-2.5F, -3.0F, 0.0F, 5.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.0781907508222411F, 0.0F, 0.0F);
            this.TailFinRight1 = new ModelPart(this, 0, 50);
            this.TailFinRight1.mirror = true;
            this.TailFinRight1.setPos(-0.3F, -0.5F, 1.5F);
            this.TailFinRight1.addBox(-3.0F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinRight1, 0.0F, 0.6736970646382003F, -0.45099308137849586F);
            this.ChestConnection = new ModelPart(this, 19, 10);
            this.ChestConnection.setPos(0.0F, 2.9F, -2.4F);
            this.ChestConnection.addBox(-3.0F, -0.9F, 0.0F, 6.0F, 1.0F, 4.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(ChestConnection, -0.15917402578451204F, 0.0F, 0.0F);
            this.Tail2Connection = new ModelPart(this, 13, 40);
            this.Tail2Connection.setPos(0.02F, 1.0F, -0.4F);
            this.Tail2Connection.addBox(-2.0F, -0.4F, 0.0F, 4.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2Connection, 0.1926843487543837F, 0.0F, 0.0F);
            this.TopFin2_1 = new ModelPart(this, 46, 0);
            this.TopFin2_1.setPos(0.0F, -2.5F, 1.1F);
            this.TopFin2_1.addBox(-0.5F, -0.7F, -2.5F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopFin2_1, 0.9044296130571394F, 0.0F, 0.0F);
            this.Mouth1 = new ModelPart(this, 50, 30);
            this.Mouth1.setPos(0.01F, 2.5F, -1.6F);
            this.Mouth1.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth1, -0.11728612207217244F, 0.0F, 0.0F);
            this.Snout1 = new ModelPart(this, 39, 30);
            this.Snout1.setPos(0.0F, 0.5F, -2.0F);
            this.Snout1.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout1, -0.03909537541112055F, 0.0F, 0.0F);
            this.Head = new ModelPart(this, 40, 10);
            this.Head.setPos(0.0F, 0.0F, -4.0F);
            this.Head.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.07749261978723364F, 0.0F, 0.0F);
            this.TopSnout1 = new ModelPart(this, 44, 20);
            this.TopSnout1.setPos(0.0F, -2.6F, 0.0F);
            this.TopSnout1.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout1, 0.3127630032889644F, 0.0F, 0.0F);
            this.TailFinLeft1 = new ModelPart(this, 0, 50);
            this.TailFinLeft1.setPos(0.3F, -0.5F, 1.5F);
            this.TailFinLeft1.addBox(0.0F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinLeft1, 0.0F, -0.6736970646382003F, 0.45099308137849586F);
            this.TopFin2 = new ModelPart(this, 46, 0);
            this.TopFin2.setPos(0.0F, -2.5F, 1.1F);
            this.TopFin2.addBox(-0.5F, -0.7F, -2.5F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopFin2, 0.9044296130571394F, 0.0F, 0.0F);
            this.Tail2 = new ModelPart(this, 0, 37);
            this.Tail2.setPos(0.0F, 0.0F, 7.0F);
            this.Tail2.addBox(-2.0F, -2.5F, -0.5F, 4.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.11728612207217244F, 0.0F, 0.0F);
            this.TopSnout2 = new ModelPart(this, 45, 25);
            this.TopSnout2.setPos(0.0F, 0.0F, -1.8F);
            this.TopSnout2.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout2, 0.6681120163581407F, 0.0F, 0.0F);
            this.Chest = new ModelPart(this, 0, 0);
            this.Chest.setPos(0.01F, -0.2F, -4.0F);
            this.Chest.addBox(-3.0F, -3.0F, -3.5F, 6.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.07958701289225602F, 0.0F, 0.0F);
            this.TopFin1Right = new ModelPart(this, 54, 0);
            this.TopFin1Right.mirror = true;
            this.TopFin1Right.setPos(0.0F, -3.0F, 3.0F);
            this.TopFin1Right.addBox(-0.6F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopFin1Right, -0.701971446457408F, 0.0F, 0.0F);
            this.PectoralFinLeft1 = new ModelPart(this, 20, 50);
            this.PectoralFinLeft1.setPos(2.9F, 1.7F, -2.4F);
            this.PectoralFinLeft1.addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft1, -0.038222711617361224F, -0.31066859353918524F, 0.77841681975786F);
            this.Tail3 = new ModelPart(this, 0, 45);
            this.Tail3.setPos(0.0F, 0.0F, 4.5F);
            this.Tail3.addBox(-1.5F, -1.5F, -0.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, -0.1563815016444822F, 0.0F, 0.0F);
            this.TailFinLeft2 = new ModelPart(this, 0, 54);
            this.TailFinLeft2.setPos(4.0F, 0.0F, -0.7F);
            this.TailFinLeft2.addBox(-4.0F, -0.51F, 0.0F, 4.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinLeft2, 0.0F, -0.2708751078990032F, 0.0F);
            this.PectoralFinRight = new ModelPart(this, 20, 50);
            this.PectoralFinRight.mirror = true;
            this.PectoralFinRight.setPos(-3.0F, 1.7F, -2.4F);
            this.PectoralFinRight.addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight, 0.038222711617361224F, 0.31066859353918524F, -0.77841681975786F);
            this.Body = new ModelPart(this, 0, 11);
            this.Body.setPos(0.0F, 21.5F, 0.0F);
            this.Body.addBox(-3.0F, -3.6F, -3.0F, 6.0F, 7.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1Connection = new ModelPart(this, 17, 30);
            this.Tail1Connection.setPos(0.0F, 2.0F, 0.0F);
            this.Tail1Connection.addBox(-2.49F, -0.4F, 0.0F, 5.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1Connection, 0.07539822668221126F, 0.0F, 0.0F);
            this.Mouth2 = new ModelPart(this, 50, 34);
            this.Mouth2.setPos(0.0F, -0.1F, -2.0F);
            this.Mouth2.addBox(-1.0F, -1.0F, -1.8F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth2, -0.19547687289441354F, 0.0F, 0.0F);
            this.Snout2 = new ModelPart(this, 41, 33);
            this.Snout2.setPos(0.0F, 0.0F, -1.1F);
            this.Snout2.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout2, -0.27366763203903305F, 0.0F, 0.0F);
            this.TopFin1Right_1 = new ModelPart(this, 54, 0);
            this.TopFin1Right_1.mirror = true;
            this.TopFin1Right_1.setPos(0.0F, 0.0F, 0.0F);
            this.TopFin1Right_1.addBox(-0.4F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }
        @Override
        public void setupAnim(WSDolphinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Body.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.25F;
            this.Body.xRot = (float) Math.toRadians((double) headPitch);
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.25F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 1.0F;
                float degree = 1.0F;
                this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F;
                this.Tail1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -0.2F * limbSwingAmount * 0.5F + -0.1F;
                this.Tail2.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F;
                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F + 3.1415927F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.15F;
                this.Tail3.xRot = MathHelper.cos(limbSwing * speed * 0.2F + 3.1415927F) * degree * -0.6F * limbSwingAmount * 0.5F + -0.2F;
            }
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.5F;
            float degree = 1.0F;
            if (entity.isInWater()) {
                this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.5F * limbSwingAmount * 0.5F;
                this.Tail1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.9F * limbSwingAmount * 0.5F + -0.1F;
                this.Tail2.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F;
                this.Chest.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.5F * limbSwingAmount * 0.5F + 0.15F;
                this.Tail3.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.0F * limbSwingAmount * 0.5F + -0.2F;
                this.PectoralFinRight.yRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.05F * limbSwingAmount * 0.5F + 0.1F;
                this.PectoralFinLeft1.yRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.05F * limbSwingAmount * 0.5F + -0.1F;
            }

        }
    }
}
