package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.AlligatorGarEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class AlligatorGarModel extends ZawaBaseModel<AlligatorGarEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends AlligatorGarModel {
        public ModelPart Hips;
        public ModelPart Head;
        public ModelPart PectoralFinRight;
        public ModelPart PectoralFinLeft;
        public ModelPart BodyTop;
        public ModelPart Tail1;
        public ModelPart PelvicFinLeft;
        public ModelPart PelvicFinRight;
        public ModelPart Tail2;
        public ModelPart DorsalFin;
        public ModelPart AnalFin;
        public ModelPart TailFinTop;
        public ModelPart TailFinBottom;
        public ModelPart Forehead;
        public ModelPart Face;
        public ModelPart NoseL;
        public ModelPart Mouth;
        public ModelPart NoseR;
        public ModelPart Snout;
        public ModelPart Teeth;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.BodyTop = this.Body.getChild("BodyTop");

            this.PectoralFinLeft = this.Body.getChild("PectoralFinLeft");

            this.Hips = this.Body.getChild("Hips");
            this.PelvicFinLeft = this.Hips.getChild("PelvicFinLeft");

            this.PelvicFinRight = this.Hips.getChild("PelvicFinRight");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.DorsalFin = this.Tail1.getChild("DorsalFin");

            this.AnalFin = this.Tail1.getChild("AnalFin");

            this.Tail2 = this.Tail1.getChild("Tail2");
            this.TailFinBottom = this.Tail2.getChild("TailFinBottom");

            this.TailFinTop = this.Tail2.getChild("TailFinTop");

            this.Head = this.Body.getChild("Head");
            this.NoseL = this.Head.getChild("NoseL");
            this.Mouth = this.NoseL.getChild("Mouth");

            this.Teeth = this.NoseL.getChild("Teeth");

            this.Snout = this.NoseL.getChild("Snout");

            this.NoseR = this.NoseL.getChild("NoseR");

            this.Face = this.Head.getChild("Face");

            this.Forehead = this.Head.getChild("Forehead");

            this.PectoralFinRight = this.Body.getChild("PectoralFinRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, -3.0F, -3.5F, 3.0F, 5.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 20.37F, -8.4F, 0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition BodyTop = Body.addOrReplaceChild("BodyTop", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -3.0F, -3.3F, 0.0781907508222411F, 0.0F, 0.0F));

            PartDefinition PectoralFinLeft = Body.addOrReplaceChild("PectoralFinLeft", CubeListBuilder.create().texOffs(0, 43).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(1.5F, 0.3F, -2.4F, -0.3642502295386026F, 0.4098033003787853F, 0.0F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(20, 46).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 6.0F, 12.0F), PartPose.offsetAndRotation(0.0F, -0.8F, 2.7F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition PelvicFinLeft = Hips.addOrReplaceChild("PelvicFinLeft", CubeListBuilder.create().texOffs(34, 42).addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.7F, 2.4F, 3.2F, 0.7285004590772052F, 0.0F, 0.0F));

            PartDefinition PelvicFinRight = Hips.addOrReplaceChild("PelvicFinRight", CubeListBuilder.create().texOffs(34, 42).addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.7F, 2.4F, 3.2F, 0.7285004590772052F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(44, 25).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -2.7F, 12.0F, -0.03490658503988659F, 0.0F, 0.0F));
            PartDefinition DorsalFin = Tail1.addOrReplaceChild("DorsalFin", CubeListBuilder.create().texOffs(50, 34).addBox(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.2F, 3.1F, 1.8018778824746906F, 0.0F, 0.0F));

            PartDefinition AnalFin = Tail1.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(50, 39).addBox(0.0F, 0.0F, -1.5F, 0.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 4.0F, 1.1372566045153711F, 0.0F, 0.0F));

            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(45, 15).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 1.8F, 7.0F, 0.03490658503988659F, 0.0F, 0.0F));
            PartDefinition TailFinBottom = Tail2.addOrReplaceChild("TailFinBottom", CubeListBuilder.create().texOffs(17, 5).addBox(0.0F, 0.0F, -2.5F, 0.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 4.5F, 1.4440853858158529F, 0.0F, 0.0F));

            PartDefinition TailFinTop = Tail2.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, 0.0F, -1.5F, 0.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 4.4F, 1.6845917354353828F, 0.0F, 0.0F));

            PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(24, 12).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -1.9F, -2.5F, 0.11030481172209784F, 0.0F, 0.0F));
            PartDefinition NoseL = Head.addOrReplaceChild("NoseL", CubeListBuilder.create().texOffs(0, 20).addBox(-0.3F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 0.8F, -4.8F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Mouth = NoseL.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(13, 24).addBox(-0.5F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 0.9F, 0.1F, -0.0781907508222411F, 0.0F, 0.0F));

            PartDefinition Teeth = NoseL.addOrReplaceChild("Teeth", CubeListBuilder.create().texOffs(13, 44).addBox(-0.5F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.5F, 0.2F));

            PartDefinition Snout = NoseL.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(10, 15).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -3.2F, 0.1563815016444822F, 0.0F, 0.0F));

            PartDefinition NoseR = NoseL.addOrReplaceChild("NoseR", CubeListBuilder.create().texOffs(0, 20).addBox(-0.7F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Face = Head.addOrReplaceChild("Face", CubeListBuilder.create().texOffs(24, 20).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -4.3F, 1.4014994426146683F, 0.0F, 0.0F));

            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(24, 5).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -4.5F, -1.3208651832356306F, 0.0F, 0.0F));

            PartDefinition PectoralFinRight = Body.addOrReplaceChild("PectoralFinRight", CubeListBuilder.create().texOffs(0, 43).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(-1.5F, 0.3F, -2.4F, -0.3642502295386026F, -0.4098033003787853F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(AlligatorGarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Tail1.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.5F;
            this.Head.yRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.Tail1.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F;
            this.PectoralFinLeft.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.409F;
            this.PectoralFinRight.yRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.409F;
            this.Mouth.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.3F) * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 1.0F;
                float degree = 1.5F;
                this.Head.yRot = Mth.cos((limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
                this.Tail1.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * -0.9F) * limbSwingAmount * 0.5F;
                this.Tail2.yRot = Mth.cos(4.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 2.5F) * limbSwingAmount * 0.5F;

            }
        }
    }

    public static class Child extends AlligatorGarModel {
        public ModelPart Tail;
        public ModelPart PelvicFinLeft;
        public ModelPart PectoralFinLeft;
        public ModelPart Head;
        public ModelPart PectoralFinRight;
        public ModelPart PelvicFinRight;
        public ModelPart TailFinTop;
        public ModelPart TailFinBottom;
        public ModelPart DorsalFin;
        public ModelPart AnalFin;
        public ModelPart Snout;
        public ModelPart TopSnout;
        public ModelPart Mouth;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.PectoralFinRight = this.Body.getChild("PectoralFinRight");

            this.PelvicFinRight = this.Body.getChild("PelvicFinRight");

            this.Head = this.Body.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Mouth = this.Snout.getChild("Mouth");

            this.PelvicFinLeft = this.Body.getChild("PelvicFinLeft");

            this.PectoralFinLeft = this.Body.getChild("PectoralFinLeft");

            this.Tail = this.Body.getChild("Tail");
            this.TailFinBottom = this.Tail.getChild("TailFinBottom");

            this.DorsalFin = this.Tail.getChild("DorsalFin");

            this.AnalFin = this.Tail.getChild("AnalFin");

            this.TailFinTop = this.Tail.getChild("TailFinTop");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.5F, -3.5F, 2.0F, 3.0F, 7.0F), PartPose.offset(0.0F, 21.4F, 0.0F));
            PartDefinition PectoralFinRight = Body.addOrReplaceChild("PectoralFinRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.0F, 0.3F, -3.0F, -0.3642502295386026F, -0.4098033003787853F, 0.0F));

            PartDefinition PelvicFinRight = Body.addOrReplaceChild("PelvicFinRight", CubeListBuilder.create().texOffs(0, -1).addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.8F, 0.5F, 0.0F, 0.7285004590772052F, 0.0F, 0.0F));

            PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F, -0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.3F, 0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(22, 5).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.2F, -1.5F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(22, 9).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.8F, 0.23457224414434488F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(16, 12).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, -0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, -0.23457224414434488F, 0.0F, 0.0F));

            PartDefinition PelvicFinLeft = Body.addOrReplaceChild("PelvicFinLeft", CubeListBuilder.create().texOffs(0, -1).addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.8F, 0.5F, 0.0F, 0.7285004590772052F, 0.0F, 0.0F));

            PartDefinition PectoralFinLeft = Body.addOrReplaceChild("PectoralFinLeft", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.0F, 0.3F, -3.0F, -0.3642502295386026F, 0.4098033003787853F, 0.0F));

            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F), PartPose.offset(0.0F, 0.0F, 3.5F));
            PartDefinition TailFinBottom = Tail.addOrReplaceChild("TailFinBottom", CubeListBuilder.create().texOffs(4, 11).addBox(0.0F, 0.0F, -1.5F, 0.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 2.5F, 1.4440853858158529F, 0.0F, 0.0F));

            PartDefinition DorsalFin = Tail.addOrReplaceChild("DorsalFin", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.9F, -1.9F, 1.8018778824746906F, 0.0F, 0.0F));

            PartDefinition AnalFin = Tail.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(0, 2).addBox(0.0F, 0.0F, -1.5F, 0.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.6F, -1.0F, 1.1372566045153711F, 0.0F, 0.0F));

            PartDefinition TailFinTop = Tail.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(8, 11).addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.7F, 2.5F, 1.6845917354353828F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 16);
        }

        @Override
        public void setupAnim(AlligatorGarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
