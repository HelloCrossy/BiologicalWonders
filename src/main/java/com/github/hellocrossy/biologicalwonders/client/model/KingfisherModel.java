package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.KingfisherEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class KingfisherModel extends ZawaBaseModel<KingfisherEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends KingfisherModel {
        public ModelPart TailBase;
        public ModelPart LeftWing;
        public ModelPart RightWing;
        public ModelPart Neck1;
        public ModelPart LeftLeg;
        public ModelPart RightLeg;
        public ModelPart TailMiddle;
        public ModelPart TailLeft;
        public ModelPart TailRight;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart Neck2Front;
        public ModelPart Forehead;
        public ModelPart Beak;
        public ModelPart Crest;
        public ModelPart Mouth;
        public ModelPart LeftFoot;
        public ModelPart LeftFootLeftToe;
        public ModelPart LeftFootRightToe;
        public ModelPart RightFoot;
        public ModelPart RightFootLeftToe;
        public ModelPart RightFootRightToe;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");

            this.LeftLeg = this.Body.getChild("LeftLeg");
            this.LeftFoot = this.LeftLeg.getChild("LeftFoot");
            this.LeftFootLeftToe = this.LeftFoot.getChild("LeftFootLeftToe");
            this.LeftFootRightToe = this.LeftFoot.getChild("LeftFootRightToe");

            this.RightWing = this.Body.getChild("RightWing");

            this.TailBase = this.Body.getChild("TailBase");
            this.TailMiddle = this.TailBase.getChild("TailMiddle");
            this.TailLeft = this.TailMiddle.getChild("TailLeft");
            this.TailRight = this.TailMiddle.getChild("TailRight");

            this.Neck1 = this.Body.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Neck2Front = this.Neck2.getChild("Neck2Front");
            this.Head = this.Neck2.getChild("Head");
            this.Crest = this.Head.getChild("Crest");
            this.Forehead = this.Head.getChild("Forehead");
            this.Beak = this.Head.getChild("Beak");
            this.Mouth = this.Beak.getChild("Mouth");

            this.LeftWing = this.Body.getChild("LeftWing");

            this.RightLeg = this.Body.getChild("RightLeg");
            this.RightFoot = this.RightLeg.getChild("RightFoot");
            this.RightFootLeftToe = this.RightFoot.getChild("RightFootLeftToe");
            this.RightFootRightToe = this.RightFoot.getChild("RightFootRightToe");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 20.3F, 0.0F, 0.5726425515477893F, 0.0F, 0.0F));

            PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.3F, 1.0F, -1.1F, 0.4825835315185294F, 0.0F, 0.0F));
            PartDefinition LeftFoot = LeftLeg.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.7F, 0.5384340808981534F, 0.0F, 0.0F));
            PartDefinition LeftFootLeftToe = LeftFoot.addOrReplaceChild("LeftFootLeftToe", CubeListBuilder.create().texOffs(4, 30).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));
            PartDefinition LeftFootRightToe = LeftFoot.addOrReplaceChild("LeftFootRightToe", CubeListBuilder.create().texOffs(4, 30).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));

            PartDefinition RightWing = Body.addOrReplaceChild("RightWing", CubeListBuilder.create().texOffs(12, 24).addBox(-0.8F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.6F, -1.4F, 1.1F, 0.09581857193974705F, 0.0911061832922575F, -0.0911061832922575F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(20, 28).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 1.0F, 0.27401668923415834F, 0.0F, 0.0F));
            PartDefinition TailMiddle = TailBase.addOrReplaceChild("TailMiddle", CubeListBuilder.create().texOffs(24, 22).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 1.0F, 0.99F));
            PartDefinition TailLeft = TailMiddle.addOrReplaceChild("TailLeft", CubeListBuilder.create().texOffs(25, 17).mirror(true).addBox(-1.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.4F, 0.0F, -0.1F, 0.0F, 0.0F, 0.04555309164612875F));
            PartDefinition TailRight = TailMiddle.addOrReplaceChild("TailRight", CubeListBuilder.create().texOffs(25, 17).addBox(0.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.4F, 0.0F, -0.1F, 0.0F, 0.0F, -0.04555309164612875F));

            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.9761626559667506F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.27035149713918F, 0.0F, 0.0F));
            PartDefinition Neck2Front = Neck2.addOrReplaceChild("Neck2Front", CubeListBuilder.create().texOffs(12, 6).addBox(-1.02F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, 3.2F, 0.6679375127277132F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 2.3F, 0.3909537457888271F, 0.0F, 0.0F));
            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, -0.7F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 1.5F, 0.05235987755982988F, 0.0F, 0.0F));
            PartDefinition Crest = Head.addOrReplaceChild("Crest", CubeListBuilder.create().texOffs(20, 0).addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.3F, 1.2487831330651644F, 0.0F, 0.0F));
            PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(8, 6).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.4F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition Mouth = Beak.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(8, 6).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, -1.0F, -0.10890854132970453F, 0.0F, 0.0F));

            PartDefinition LeftWing = Body.addOrReplaceChild("LeftWing", CubeListBuilder.create().texOffs(12, 24).mirror(true).addBox(-0.2F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.6F, -1.4F, 1.1F, 0.09581857193974705F, -0.0911061832922575F, 0.0911061832922575F));

            PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.3F, 1.0F, -1.1F, 0.48223445767864725F, 0.0F, 0.0F));
            PartDefinition RightFoot = RightLeg.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.7F, 0.5384340808981534F, 0.0F, 0.0F));
            PartDefinition RightFootLeftToe = RightFoot.addOrReplaceChild("RightFootLeftToe", CubeListBuilder.create().texOffs(4, 30).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));
            PartDefinition RightFootRightToe = RightFoot.addOrReplaceChild("RightFootRightToe", CubeListBuilder.create().texOffs(4, 30).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));
            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(KingfisherEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, entity.tickCount, 0.3F, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.39F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.976F;
            this.Neck2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.15F) * 0.5F - 0.27F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.39F;

            this.TailBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.274F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }
}

    public static class Flying extends KingfisherModel {
        public ModelPart TailBase;
        public ModelPart LeftLeg;
        public ModelPart RightLeg;
        public ModelPart LeftWing1;
        public ModelPart RightWing1;
        public ModelPart Neck1;
        public ModelPart TailMiddle;
        public ModelPart TailLeft;
        public ModelPart TailRight;
        public ModelPart LeftFoot;
        public ModelPart LeftFootLeftToe;
        public ModelPart LeftFootRightToe;
        public ModelPart RightFoot;
        public ModelPart RightFootLeftToe;
        public ModelPart RightFootRightToe;
        public ModelPart LeftWing2;
        public ModelPart LeftWingFeather1;
        public ModelPart LeftWingFeather2;
        public ModelPart LeftWingFeather3;
        public ModelPart LeftWingFeather4;
        public ModelPart LeftWingFeather5;
        public ModelPart LeftWingFeather6;
        public ModelPart LeftWingFeather7;
        public ModelPart LeftWingFeather8;
        public ModelPart RightWing2;
        public ModelPart RightWingFeather1;
        public ModelPart RightWingFeather2;
        public ModelPart RightWingFeather3;
        public ModelPart RightWingFeather4;
        public ModelPart RightWingFeather5;
        public ModelPart RightWingFeather6;
        public ModelPart RightWingFeather7;
        public ModelPart RightWingFeather8;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart Neck2Front;
        public ModelPart Forehead;
        public ModelPart Beak;
        public ModelPart Mouth;

        public Flying(ModelPart root) {
            this.Body = root.getChild("Body");

            this.RightWing1 = this.Body.getChild("RightWing1");
            this.RightWing2 = this.RightWing1.getChild("RightWing2");
            this.RightWingFeather1 = this.RightWing2.getChild("RightWingFeather1");
            this.RightWingFeather2 = this.RightWingFeather1.getChild("RightWingFeather2");
            this.RightWingFeather3 = this.RightWingFeather2.getChild("RightWingFeather3");
            this.RightWingFeather4 = this.RightWingFeather3.getChild("RightWingFeather4");
            this.RightWingFeather5 = this.RightWingFeather4.getChild("RightWingFeather5");
            this.RightWingFeather6 = this.RightWingFeather5.getChild("RightWingFeather6");
            this.RightWingFeather7 = this.RightWingFeather6.getChild("RightWingFeather7");
            this.RightWingFeather8 = this.RightWingFeather7.getChild("RightWingFeather8");

            this.LeftWing1 = this.Body.getChild("LeftWing1");
            this.LeftWing2 = this.LeftWing1.getChild("LeftWing2");
            this.LeftWingFeather1 = this.LeftWing2.getChild("LeftWingFeather1");
            this.LeftWingFeather2 = this.LeftWingFeather1.getChild("LeftWingFeather2");
            this.LeftWingFeather3 = this.LeftWingFeather2.getChild("LeftWingFeather3");
            this.LeftWingFeather4 = this.LeftWingFeather3.getChild("LeftWingFeather4");
            this.LeftWingFeather5 = this.LeftWingFeather4.getChild("LeftWingFeather5");
            this.LeftWingFeather6 = this.LeftWingFeather5.getChild("LeftWingFeather6");
            this.LeftWingFeather7 = this.LeftWingFeather6.getChild("LeftWingFeather7");
            this.LeftWingFeather8 = this.LeftWingFeather7.getChild("LeftWingFeather8");

            this.RightLeg = this.Body.getChild("RightLeg");
            this.RightFoot = this.RightLeg.getChild("RightFoot");
            this.RightFootLeftToe = this.RightFoot.getChild("RightFootLeftToe");
            this.RightFootRightToe = this.RightFoot.getChild("RightFootRightToe");

            this.LeftLeg = this.Body.getChild("LeftLeg");
            this.LeftFoot = this.LeftLeg.getChild("LeftFoot");
            this.LeftFootLeftToe = this.LeftFoot.getChild("LeftFootLeftToe");
            this.LeftFootRightToe = this.LeftFoot.getChild("LeftFootRightToe");

            this.Neck1 = this.Body.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Neck2Front = this.Neck2.getChild("Neck2Front");
            this.Head = this.Neck2.getChild("Head");
            this.Forehead = this.Head.getChild("Forehead");
            this.Beak = this.Head.getChild("Beak");
            this.Mouth = this.Beak.getChild("Mouth");

            this.TailBase = this.Body.getChild("TailBase");
            this.TailMiddle = this.TailBase.getChild("TailMiddle");
            this.TailLeft = this.TailMiddle.getChild("TailLeft");
            this.TailRight = this.TailMiddle.getChild("TailRight");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 20.5F, 0.0F, 1.3658947098950176F, 0.0F, 0.0F));
            PartDefinition RightWing1 = Body.addOrReplaceChild("RightWing1", CubeListBuilder.create().texOffs(58, 0).addBox(-2.0F, 0.0F, -0.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.9F, -1.9F, 1.0F, 0.0F, 0.0F, -0.18203784630933073F));
            PartDefinition RightWing2 = RightWing1.addOrReplaceChild("RightWing2", CubeListBuilder.create().texOffs(56, 6).addBox(-3.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-2.0F, 4.0F, -0.01F, 0.0F, 0.0F, 0.3642502295386026F));
            PartDefinition RightWingFeather1 = RightWing2.addOrReplaceChild("RightWingFeather1", CubeListBuilder.create().texOffs(52, 12).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-3.0F, -4.0F, -0.01F, 0.0F, 0.0F, -0.27314402127920984F));
            PartDefinition RightWingFeather2 = RightWingFeather1.addOrReplaceChild("RightWingFeather2", CubeListBuilder.create().texOffs(52, 12).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.01F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition RightWingFeather3 = RightWingFeather2.addOrReplaceChild("RightWingFeather3", CubeListBuilder.create().texOffs(52, 12).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.01F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition RightWingFeather4 = RightWingFeather3.addOrReplaceChild("RightWingFeather4", CubeListBuilder.create().texOffs(52, 12).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.01F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition RightWingFeather5 = RightWingFeather4.addOrReplaceChild("RightWingFeather5", CubeListBuilder.create().texOffs(52, 12).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.01F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition RightWingFeather6 = RightWingFeather5.addOrReplaceChild("RightWingFeather6", CubeListBuilder.create().texOffs(52, 12).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.01F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition RightWingFeather7 = RightWingFeather6.addOrReplaceChild("RightWingFeather7", CubeListBuilder.create().texOffs(52, 15).addBox(-4.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.01F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition RightWingFeather8 = RightWingFeather7.addOrReplaceChild("RightWingFeather8", CubeListBuilder.create().texOffs(52, 18).addBox(-4.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.01F, 0.0F, 0.0F, -0.2275909337942703F));

            PartDefinition LeftWing1 = Body.addOrReplaceChild("LeftWing1", CubeListBuilder.create().texOffs(39, 0).addBox(0.0F, 0.0F, -0.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.9F, -1.9F, 1.0F, 0.0F, 0.0F, 0.18203784630933073F));
            PartDefinition LeftWing2 = LeftWing1.addOrReplaceChild("LeftWing2", CubeListBuilder.create().texOffs(39, 6).addBox(0.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(2.0F, 4.0F, -0.01F, 0.0F, 0.0F, -0.4098033003787853F));
            PartDefinition LeftWingFeather1 = LeftWing2.addOrReplaceChild("LeftWingFeather1", CubeListBuilder.create().texOffs(39, 12).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(3.0F, -4.0F, -0.01F, 0.0F, 0.0F, 0.27314402127920984F));
            PartDefinition LeftWingFeather2 = LeftWingFeather1.addOrReplaceChild("LeftWingFeather2", CubeListBuilder.create().texOffs(39, 12).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.01F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition LeftWingFeather3 = LeftWingFeather2.addOrReplaceChild("LeftWingFeather3", CubeListBuilder.create().texOffs(39, 12).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.01F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition LeftWingFeather4 = LeftWingFeather3.addOrReplaceChild("LeftWingFeather4", CubeListBuilder.create().texOffs(39, 12).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.01F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition LeftWingFeather5 = LeftWingFeather4.addOrReplaceChild("LeftWingFeather5", CubeListBuilder.create().texOffs(39, 12).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.01F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition LeftWingFeather6 = LeftWingFeather5.addOrReplaceChild("LeftWingFeather6", CubeListBuilder.create().texOffs(39, 12).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.01F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition LeftWingFeather7 = LeftWingFeather6.addOrReplaceChild("LeftWingFeather7", CubeListBuilder.create().texOffs(41, 15).addBox(0.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.01F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition LeftWingFeather8 = LeftWingFeather7.addOrReplaceChild("LeftWingFeather8", CubeListBuilder.create().texOffs(41, 18).addBox(0.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.01F, 0.0F, 0.0F, 0.2275909337942703F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(20, 28).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 2.0F, 2.0F));
            PartDefinition TailMiddle = TailBase.addOrReplaceChild("TailMiddle", CubeListBuilder.create().texOffs(24, 22).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 1.0F, -0.01F));
            PartDefinition TailLeft = TailMiddle.addOrReplaceChild("TailLeft", CubeListBuilder.create().texOffs(25, 17).mirror(true).addBox(-1.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.4F, 0.0F, -0.1F, 0.0F, 0.0F, 0.04555309164612875F));
            PartDefinition TailRight = TailMiddle.addOrReplaceChild("TailRight", CubeListBuilder.create().texOffs(25, 17).addBox(0.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.4F, 0.0F, -0.1F, 0.0F, 0.0F, -0.04555309164612875F));

            PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.3F, 0.7F, -0.8F, 0.6373942508178124F, 0.0F, 0.0F));
            PartDefinition RightFoot = RightLeg.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.7F, 0.5384340808981534F, 0.0F, 0.0F));
            PartDefinition RightFootRightToe = RightFoot.addOrReplaceChild("RightFootRightToe", CubeListBuilder.create().texOffs(4, 30).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));
            PartDefinition RightFootLeftToe = RightFoot.addOrReplaceChild("RightFootLeftToe", CubeListBuilder.create().texOffs(4, 30).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));

            PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.3F, 0.7F, -0.8F, 0.6373942508178124F, 0.0F, 0.0F));
            PartDefinition LeftFoot = LeftLeg.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.7F, 0.5384340808981534F, 0.0F, 0.0F));
            PartDefinition LeftFootLeftToe = LeftFoot.addOrReplaceChild("LeftFootLeftToe", CubeListBuilder.create().texOffs(4, 30).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));
            PartDefinition LeftFootRightToe = LeftFoot.addOrReplaceChild("LeftFootRightToe", CubeListBuilder.create().texOffs(4, 30).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));

            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.9761626559667506F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.27035149713918F, 0.0F, 0.0F));
            PartDefinition Neck2Front = Neck2.addOrReplaceChild("Neck2Front", CubeListBuilder.create().texOffs(12, 6).addBox(-1.02F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, 3.2F, 0.6679375127277132F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 2.3F, -0.4300491170387584F, 0.0F, 0.0F));
            PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(8, 6).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.4F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition Mouth = Beak.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(8, 6).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, -1.0F, -0.10890854132970453F, 0.0F, 0.0F));
            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, -0.7F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 1.5F, 0.05235987755982988F, 0.0F, 0.0F));



              return LayerDefinition.create(meshDefinition, 64, 32);
        }
        @Override
        public void setupAnim(KingfisherEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) -0.43F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.976F;
            this.Neck2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.27F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.43F;
            this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.365F;
            this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 20.6F;
            this.TailBase.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F;
            this.LeftLeg.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.637F;
            this.RightLeg.xRot = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.637F;

            this.LeftWing1.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.LeftWing1.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F;
            this.RightWing1.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.RightWing1.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 2.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.976F;
            this.Neck2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.27F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.43F;
            this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.365F;
            this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 20.6F;
            this.TailBase.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F;
            this.LeftLeg.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.637F;
            this.RightLeg.xRot = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.637F;
            this.LeftWing1.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.LeftWing1.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F;
            this.RightWing1.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.RightWing1.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F;
        }
    }

public static class Child extends KingfisherModel {
    public ModelPart TailBase;
    public ModelPart LegRight;
    public ModelPart LegLeft;
    public ModelPart WingLeft;
    public ModelPart WingRight;
    public ModelPart Neck1;
    public ModelPart FootRight;
    public ModelPart Toe2Right;
    public ModelPart Toe1Right;
    public ModelPart FootLeft;
    public ModelPart Toe1Left;
    public ModelPart Toe2Left;
    public ModelPart Head;
    public ModelPart UpperBill;
    public ModelPart LowerBill;

    public Child(ModelPart root) {
        this.Body = root.getChild("Body");
        this.TailBase = this.Body.getChild("TailBase");
        this.Neck1 = this.Body.getChild("Neck1");
        this.Head = this.Neck1.getChild("Head");
        this.LowerBill = this.Head.getChild("LowerBill");
        this.UpperBill = this.Head.getChild("UpperBill");
        this.WingLeft = this.Body.getChild("WingLeft");
        this.LegLeft = this.Body.getChild("LegLeft");
        this.FootLeft = this.LegLeft.getChild("FootLeft");
        this.WingRight = this.Body.getChild("WingRight");
        this.LegRight = this.Body.getChild("LegRight");
        this.FootRight = this.LegRight.getChild("FootRight");
        this.Toe1Left = this.FootLeft.getChild("Toe1Left");
        this.Toe2Right = this.FootRight.getChild("Toe2Right");
        this.Toe2Left = this.FootLeft.getChild("Toe2Left");
        this.Toe1Right = this.FootRight.getChild("Toe1Right");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 20.9F, 0.0F, 1.411447814024714F, 0.0F, 0.0F));
        PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(17, 28).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.0911061832922575F, 0.0F, 0.0F));

        PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -1.5F, 0.7285004590772052F, 0.0F, 0.0F));
        PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -0.7F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.6373942508178124F, 0.0F, 0.0F));
        PartDefinition LowerBill = Head.addOrReplaceChild("LowerBill", CubeListBuilder.create().texOffs(5, 1).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.6F, 0.3F, -0.489739378788545F, 0.0F, 0.0F));

        PartDefinition UpperBill = Head.addOrReplaceChild("UpperBill", CubeListBuilder.create().texOffs(0, 1).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, 0.5855579507282921F, 0.0F, 0.0F));

        PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(29, 0).addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.9F, -1.9F, 1.1F, -0.2275909337942703F, -0.0911061832922575F, 0.13665927909957545F));

        PartDefinition LegLeft = Body.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.3F, 0.9F, -1.4F, -0.500909508638178F, -0.04555309164612875F, 0.4098033003787853F));
        PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(13, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.6829473549475088F, 0.0F, 0.0F));

        PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(38, 0).addBox(-0.8F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.9F, -1.9F, 1.1F, -0.2275909337942703F, 0.0911061832922575F, -0.13665927909957545F));

        PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.3F, 0.9F, -1.4F, -0.500909508638178F, 0.04555309164612875F, -0.4098033003787853F));
        PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(20, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.6829473549475088F, 0.0F, 0.0F));

        PartDefinition Toe1Left = FootLeft.addOrReplaceChild("Toe1Left", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));
        PartDefinition Toe2Right = FootRight.addOrReplaceChild("Toe2Right", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));
        PartDefinition Toe2Left = FootLeft.addOrReplaceChild("Toe2Left", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));
        PartDefinition Toe1Right = FootRight.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.004537855888737689F, 0.0F, -0.591841146688116F));

        return LayerDefinition.create(meshDefinition, 64, 32);
    }

    @Override
    public void setupAnim(KingfisherEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
        this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
        this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.637F;
        this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
    }

    @Override
    public void playIdleAnimation(net.minecraft.world.entity.Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0F;
        float speed = 1.0F;
        this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.728F;
        this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.637F;
    }

    @Override
    public void playMovementAnimation(net.minecraft.world.entity.Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
       }
    }
}
