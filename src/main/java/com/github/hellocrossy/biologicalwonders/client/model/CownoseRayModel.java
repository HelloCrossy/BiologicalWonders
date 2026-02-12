package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.CownoseRayEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class CownoseRayModel extends ZawaBaseModel<CownoseRayEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends CownoseRayModel {
        public ModelPart Head;
        public ModelPart LeftForearm;
        public ModelPart RightForearm;
        public ModelPart RightFlap;
        public ModelPart LeftFlap;
        public ModelPart Tail1;
        public ModelPart LeftNose;
        public ModelPart RightNose;
        public ModelPart LeftElbow;
        public ModelPart LeftFlipper;
        public ModelPart RightElbow;
        public ModelPart RightFlipper;
        public ModelPart Tail2;
        public ModelPart TailSpike;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Head = this.Body.getChild("Head");
            this.RightNose = this.Head.getChild("RightNose");

            this.LeftNose = this.Head.getChild("LeftNose");

            this.RightForearm = this.Body.getChild("RightForearm");
            this.RightElbow = this.RightForearm.getChild("RightElbow");

            this.RightFlipper = this.RightForearm.getChild("RightFlipper");

            this.LeftFlap = this.Body.getChild("LeftFlap");

            this.LeftForearm = this.Body.getChild("LeftForearm");
            this.LeftElbow = this.LeftForearm.getChild("LeftElbow");

            this.LeftFlipper = this.LeftForearm.getChild("LeftFlipper");

            this.Tail1 = this.Body.getChild("Tail1");
            this.TailSpike = this.Tail1.getChild("TailSpike");

            this.Tail2 = this.Tail1.getChild("Tail2");

            this.RightFlap = this.Body.getChild("RightFlap");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -1.5F, -4.5F, 6.0F, 3.0F, 9.0F), PartPose.offset(0.0F, 22.0F, 0.0F));
            PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 13).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.5F, -4.5F, 0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition RightNose = Head.addOrReplaceChild("RightNose", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.2F, -2.2F, 0.0F, -0.2617993877991494F, 0.0F));

            PartDefinition LeftNose = Head.addOrReplaceChild("LeftNose", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.2F, -2.2F, 0.0F, 0.2617993877991494F, 0.0F));

            PartDefinition RightForearm = Body.addOrReplaceChild("RightForearm", CubeListBuilder.create().texOffs(12, 14).addBox(-7.0F, -1.0F, -1.0F, 8.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(-2.5F, 0.0F, -4.5F, 0.0F, 0.3490658503988659F, 0.0F));
            PartDefinition RightElbow = RightForearm.addOrReplaceChild("RightElbow", CubeListBuilder.create().texOffs(0, 23).mirror(true).addBox(-4.0F, -0.5F, 0.0F, 6.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-2.0F, 0.0F, 5.0F, 0.0F, -0.7222172631173811F, 0.0F));

            PartDefinition RightFlipper = RightForearm.addOrReplaceChild("RightFlipper", CubeListBuilder.create().texOffs(14, 24).mirror(true).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-6.5F, 0.0F, -0.3F, 0.0F, 0.40142572795869574F, 0.0F));

            PartDefinition LeftFlap = Body.addOrReplaceChild("LeftFlap", CubeListBuilder.create().texOffs(31, 8).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.1F, 3.2F, -0.2617993877991494F, 0.10471975511965977F, 0.08726646259971647F));

            PartDefinition LeftForearm = Body.addOrReplaceChild("LeftForearm", CubeListBuilder.create().texOffs(12, 14).mirror(true).addBox(-1.0F, -1.0F, -1.0F, 8.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(2.5F, 0.0F, -4.5F, 0.0F, -0.3490658503988659F, 0.0F));
            PartDefinition LeftElbow = LeftForearm.addOrReplaceChild("LeftElbow", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0F, -0.5F, 0.0F, 6.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(2.0F, 0.0F, 5.0F, 0.0F, 0.7222172631173811F, 0.0F));

            PartDefinition LeftFlipper = LeftForearm.addOrReplaceChild("LeftFlipper", CubeListBuilder.create().texOffs(14, 24).addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(6.5F, 0.0F, -0.3F, 0.0F, -0.40142572795869574F, 0.0F));

            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(23, 1).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offset(0.0F, -1.2F, 3.5F));
            PartDefinition TailSpike = Tail1.addOrReplaceChild("TailSpike", CubeListBuilder.create().texOffs(38, 2).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.9F, 0.3743731378685891F, 0.0F, 0.0F));

            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(36, 5).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 9.0F), PartPose.offset(0.0F, 0.5F, 3.9F));

            PartDefinition RightFlap = Body.addOrReplaceChild("RightFlap", CubeListBuilder.create().texOffs(31, 8).mirror(true).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.1F, 3.2F, -0.2617993877991494F, -0.10471975511965977F, -0.08726646259971647F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(CownoseRayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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

    public static class Child extends CownoseRayModel {
        public ModelPart Head;
        public ModelPart LeftForearm;
        public ModelPart RightForearm;
        public ModelPart Tail;
        public ModelPart LeftNose;
        public ModelPart RightNose;
        public ModelPart LeftFlipper;
        public ModelPart RightFlipper;
        public ModelPart TailSpike;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Head = this.Body.getChild("Head");
            this.RightNose = this.Head.getChild("RightNose");

            this.LeftNose = this.Head.getChild("LeftNose");

            this.LeftForearm = this.Body.getChild("LeftForearm");
            this.LeftFlipper = this.LeftForearm.getChild("LeftFlipper");

            this.Tail = this.Body.getChild("Tail");
            this.TailSpike = this.Tail.getChild("TailSpike");

            this.RightForearm = this.Body.getChild("RightForearm");
            this.RightFlipper = this.RightForearm.getChild("RightFlipper");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F), PartPose.offset(0.0F, 22.0F, 0.0F));
            PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -2.5F, 0.05235987755982988F, 0.0F, 0.0F));
            PartDefinition RightNose = Head.addOrReplaceChild("RightNose", CubeListBuilder.create().texOffs(19, 11).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.6F, 0.1F, -1.2F, 0.0F, -0.12217304763960307F, 0.0F));

            PartDefinition LeftNose = Head.addOrReplaceChild("LeftNose", CubeListBuilder.create().texOffs(10, 20).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.6F, 0.1F, -1.2F, 0.0F, 0.12217304763960307F, 0.0F));

            PartDefinition LeftForearm = Body.addOrReplaceChild("LeftForearm", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -0.5F, 5.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(1.3F, 0.0F, -2.5F, 0.0F, -0.23474678106428595F, 0.0F));
            PartDefinition LeftFlipper = LeftForearm.addOrReplaceChild("LeftFlipper", CubeListBuilder.create().texOffs(15, 6).addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(3.9F, 0.1F, 0.4F, 0.0F, -0.12217304763960307F, 0.0F));

            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(12, 13).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 6.0F), PartPose.offset(0.0F, -0.7F, 2.5F));
            PartDefinition TailSpike = Tail.addOrReplaceChild("TailSpike", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363323129985824F, 0.0F, 0.0F));

            PartDefinition RightForearm = Body.addOrReplaceChild("RightForearm", CubeListBuilder.create().texOffs(0, 6).addBox(-4.5F, -0.5F, -0.5F, 5.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-1.3F, 0.0F, -2.5F, 0.0F, 0.23474678106428595F, 0.0F));
            PartDefinition RightFlipper = RightForearm.addOrReplaceChild("RightFlipper", CubeListBuilder.create().texOffs(15, 0).addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(-3.9F, 0.1F, 0.4F, 0.0F, 0.12217304763960307F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(CownoseRayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
