package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.LionfishEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class LionfishModel extends ZawaBaseModel<LionfishEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends LionfishModel {
        public ModelPart Hips;
        public ModelPart Chest;
        public ModelPart DorsalFin1;
        public ModelPart PectoralFinRight;
        public ModelPart PectoralFinLeft;
        public ModelPart Tail1;
        public ModelPart DorsalFin2;
        public ModelPart Tail2;
        public ModelPart TailFin;
        public ModelPart AnalFin;
        public ModelPart Head;
        public ModelPart RightEye;
        public ModelPart LeftEye;
        public ModelPart Mouth1;
        public ModelPart EyelashRight;
        public ModelPart EyelashLeft;
        public ModelPart Mouth2;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Chest = this.Body.getChild("Chest");
            this.Head = this.Chest.getChild("Head");
            this.RightEye = this.Head.getChild("RightEye");
            this.EyelashRight = this.RightEye.getChild("EyelashRight");

            this.Mouth1 = this.Head.getChild("Mouth1");
            this.Mouth2 = this.Mouth1.getChild("Mouth2");

            this.LeftEye = this.Head.getChild("LeftEye");
            this.EyelashLeft = this.LeftEye.getChild("EyelashLeft");

            this.PectoralFinLeft = this.Body.getChild("PectoralFinLeft");

            this.PectoralFinRight = this.Body.getChild("PectoralFinRight");

            this.Hips = this.Body.getChild("Hips");
            this.DorsalFin2 = this.Hips.getChild("DorsalFin2");
            this.AnalFin = this.DorsalFin2.getChild("AnalFin");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.TailFin = this.Tail2.getChild("TailFin");

            this.DorsalFin1 = this.Body.getChild("DorsalFin1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.5F, -3.0F, 4.0F, 5.0F, 5.0F), PartPose.offset(0.0F, 18.21F, 0.4F));
            PartDefinition Chest = Body.addOrReplaceChild("RightEye", CubeListBuilder.create().texOffs(29, 0).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 0.5F, -2.8F, 0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition Head = Chest.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.2F, 0.5F, -0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition RightEye = Head.addOrReplaceChild("PectoralFinLeft", CubeListBuilder.create().texOffs(-1, 13).mirror(true).addBox(0.0F, -4.5F, 0.0F, 0.0F, 9.0F, 8.0F), PartPose.offsetAndRotation(1.9F, 0.5F, -2.5F, -0.23457224414434488F, 0.5462880425584197F, 0.0F));
            PartDefinition EyelashRight = RightEye.addOrReplaceChild("DorsalFin1", CubeListBuilder.create().texOffs(34, 7).mirror(true).addBox(0.0F, -6.0F, -4.5F, 0.0F, 7.0F, 9.0F), PartPose.offsetAndRotation(0.0F, -1.4F, 0.6F, 0.0781907508222411F, 0.0F, 0.0F));

            PartDefinition Mouth1 = Head.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, -0.1F, 2.0F));
            PartDefinition Mouth2 = Mouth1.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(20, 7).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.21F, -1.05F, -0.8196066007575706F, 0.0F, 0.0F));

            PartDefinition LeftEye = Head.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(32, 0).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.3F, -2.4F, 0.27366763203903305F, 0.0F, 0.0F));
            PartDefinition EyelashLeft = LeftEye.addOrReplaceChild("EyelashLeft", CubeListBuilder.create().texOffs(0, 17).mirror(true).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.0F, 0.0F, -0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition PectoralFinLeft = Body.addOrReplaceChild("LeftEye", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.0F, 0.5F, -2.8F, 0.8196066007575706F, 0.0F, 0.0F));

            PartDefinition PectoralFinRight = Body.addOrReplaceChild("Mouth1", CubeListBuilder.create().texOffs(30, 7).addBox(-0.8F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, -1.2747885016356248F, 0.0F, 0.0F));

            PartDefinition Hips = Body.addOrReplaceChild("DorsalFin2", CubeListBuilder.create().texOffs(7, 13).mirror(true).addBox(0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 3.0F), PartPose.offset(0.0F, -1.5F, 3.5F));
            PartDefinition DorsalFin2 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 2.2F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition AnalFin = DorsalFin2.addOrReplaceChild("EyelashRight", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 0.0F, 0.0F, -0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Mouth2", CubeListBuilder.create().texOffs(30, 7).addBox(-0.2F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("TailFin", CubeListBuilder.create().texOffs(17, 12).mirror(true).addBox(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 4.0F), PartPose.offset(0.0F, 0.0F, 1.0F));
            PartDefinition TailFin = Tail2.addOrReplaceChild("PectoralFinRight", CubeListBuilder.create().texOffs(-1, 13).addBox(0.0F, -4.5F, 0.0F, 0.0F, 9.0F, 8.0F), PartPose.offsetAndRotation(-1.9F, 0.5F, -2.5F, -0.23457224414434488F, -0.5462880425584197F, 0.0F));

            PartDefinition DorsalFin1 = Body.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(7, 10).mirror(true).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.5F, -1.4F, 0.5473352640780661F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(LionfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Body.yRot = (float) Math.toRadians(netHeadYaw) * 0.25F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.25F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 2.0F;
            float degree = 1.5F;
            this.Head.yRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * 0.2F) * limbSwingAmount;
            this.Hips.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -0.4F) * limbSwingAmount;
            this.PectoralFinLeft.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount - 0.49F;
            this.PectoralFinRight.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -2.0F) * limbSwingAmount + 0.49F;
            this.Mouth1.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.3F) * limbSwingAmount + -1.274F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 1.0F;
                float degree = 1.0F;
                this.Head.yRot = Mth.cos((limbSwing * speed * 0.5F)) * (degree * 0.8F) * limbSwingAmount;
                this.Hips.yRot = Mth.cos(1.0F + (limbSwing * speed * 1F)) * (degree * -0.9F) * limbSwingAmount;
                this.PectoralFinLeft.yRot = Mth.cos(1.0F + (limbSwing * speed * 1F)) * (degree * 1.0F) * limbSwingAmount - 0.49F;
                this.PectoralFinRight.yRot = Mth.cos(1.0F + (limbSwing * speed * 1F)) * (degree * -1.0F) * limbSwingAmount + 0.49F;
                this.Tail1.yRot = Mth.cos(4.0F + (limbSwing * speed * 1F)) * (degree * 1.0F) * limbSwingAmount;
            }
        }
    }

    public static class Child extends LionfishModel {
        public ModelPart Hips;
        public ModelPart Chest;
        public ModelPart DorsalFin1;
        public ModelPart PectoralFinRight;
        public ModelPart PectoralFinLeft;
        public ModelPart Tail1;
        public ModelPart DorsalFin2;
        public ModelPart Tail2;
        public ModelPart TailFin;
        public ModelPart AnalFin;
        public ModelPart Head;
        public ModelPart RightEye;
        public ModelPart LeftEye;
        public ModelPart Mouth1;
        public ModelPart EyelashRight;
        public ModelPart EyelashLeft;
        public ModelPart Mouth2;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.PectoralFinLeft = this.Body.getChild("PectoralFinLeft");

            this.DorsalFin1 = this.Body.getChild("DorsalFin1");

            this.Hips = this.Body.getChild("Hips");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.TailFin = this.Tail2.getChild("TailFin");

            this.DorsalFin2 = this.Hips.getChild("DorsalFin2");
            this.AnalFin = this.DorsalFin2.getChild("AnalFin");

            this.Chest = this.Body.getChild("Chest");
            this.Head = this.Chest.getChild("Head");
            this.RightEye = this.Head.getChild("RightEye");
            this.EyelashRight = this.RightEye.getChild("EyelashRight");

            this.LeftEye = this.Head.getChild("LeftEye");
            this.EyelashLeft = this.LeftEye.getChild("EyelashLeft");

            this.Mouth1 = this.Head.getChild("Mouth1");
            this.Mouth2 = this.Mouth1.getChild("Mouth2");

            this.PectoralFinRight = this.Body.getChild("PectoralFinRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.5F, -3.0F, 4.0F, 5.0F, 5.0F), PartPose.offset(0.0F, 18.21F, 0.4F));
            PartDefinition PectoralFinLeft = Body.addOrReplaceChild("PectoralFinLeft", CubeListBuilder.create().texOffs(-1, 13).mirror(true).addBox(0.0F, -4.5F, 0.0F, 0.0F, 9.0F, 8.0F), PartPose.offsetAndRotation(1.9F, 0.5F, -2.5F, -0.23457224414434488F, 0.5462880425584197F, 0.0F));

            PartDefinition DorsalFin1 = Body.addOrReplaceChild("DorsalFin1", CubeListBuilder.create().texOffs(34, 7).mirror(true).addBox(0.0F, -6.0F, -4.5F, 0.0F, 7.0F, 9.0F), PartPose.offsetAndRotation(0.0F, -1.4F, 0.6F, 0.0781907508222411F, 0.0F, 0.0F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.2F, 0.5F, -0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 2.2F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, -0.1F, 2.0F));
            PartDefinition TailFin = Tail2.addOrReplaceChild("TailFin", CubeListBuilder.create().texOffs(17, 12).mirror(true).addBox(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 4.0F), PartPose.offset(0.0F, 0.0F, 1.0F));

            PartDefinition DorsalFin2 = Hips.addOrReplaceChild("DorsalFin2", CubeListBuilder.create().texOffs(7, 13).mirror(true).addBox(0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 3.0F), PartPose.offset(0.0F, -1.5F, 3.5F));
            PartDefinition AnalFin = DorsalFin2.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(7, 10).mirror(true).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.5F, -1.4F, 0.5473352640780661F, 0.0F, 0.0F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(32, 0).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.3F, -2.4F, 0.27366763203903305F, 0.0F, 0.0F));
            PartDefinition Head = Chest.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(20, 7).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.21F, -1.05F, -0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition RightEye = Head.addOrReplaceChild("RightEye", CubeListBuilder.create().texOffs(29, 0).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 0.5F, -2.8F, 0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition EyelashRight = RightEye.addOrReplaceChild("EyelashRight", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 0.0F, 0.0F, -0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition LeftEye = Head.addOrReplaceChild("LeftEye", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.0F, 0.5F, -2.8F, 0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition EyelashLeft = LeftEye.addOrReplaceChild("EyelashLeft", CubeListBuilder.create().texOffs(0, 17).mirror(true).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.0F, 0.0F, -0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition Mouth1 = Head.addOrReplaceChild("Mouth1", CubeListBuilder.create().texOffs(30, 7).addBox(-0.8F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, -1.2747885016356248F, 0.0F, 0.0F));
            PartDefinition Mouth2 = Mouth1.addOrReplaceChild("Mouth2", CubeListBuilder.create().texOffs(30, 7).addBox(-0.2F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition PectoralFinRight = Body.addOrReplaceChild("PectoralFinRight", CubeListBuilder.create().texOffs(-1, 13).addBox(0.0F, -4.5F, 0.0F, 0.0F, 9.0F, 8.0F), PartPose.offsetAndRotation(-1.9F, 0.5F, -2.5F, -0.23457224414434488F, -0.5462880425584197F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
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
            float degree = 1.5F;
            this.Head.yRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * 0.2F) * limbSwingAmount;
            this.Hips.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -0.4F) * limbSwingAmount;
            this.PectoralFinLeft.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount + 0.409F;
            this.PectoralFinRight.yRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * -2.0F) * limbSwingAmount + -0.409F;
            this.Mouth2.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.3F) * limbSwingAmount;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 2.0F;
                float degree = 1.5F;
                this.Head.yRot = Mth.cos((limbSwing * speed * 0.5F)) * (degree * 0.8F) * limbSwingAmount;
                this.Hips.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.5F)) * (degree * -0.9F) * limbSwingAmount;
                this.Tail1.yRot = Mth.cos(4.0F + (limbSwing * speed * 0.5F)) * (degree * 2.5F) * limbSwingAmount;
            }
        }
    }
}
