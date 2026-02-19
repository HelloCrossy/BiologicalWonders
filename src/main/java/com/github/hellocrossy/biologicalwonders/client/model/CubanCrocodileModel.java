package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.CubanCrocodileEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class CubanCrocodileModel extends ZawaBaseModel<CubanCrocodileEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends CubanCrocodileModel {
        public ModelPart Neck;
        public ModelPart UpperArmRight;
        public ModelPart UpperArmLeft;
        public ModelPart RightNeckScutes;
        public ModelPart LeftNeckScutes;
        public ModelPart Body;
        public ModelPart Head;
        public ModelPart BottomJaw1;
        public ModelPart TopJaw3;
        public ModelPart TopJaw1;
        public ModelPart TopJaw4;
        public ModelPart LeftEye;
        public ModelPart RightEye;
        public ModelPart LeftHorn;
        public ModelPart LeftHorn_1;
        public ModelPart TopJaw2;
        public ModelPart TopTeeth1;
        public ModelPart Nose;
        public ModelPart TopTeeth2;
        public ModelPart BottomJaw4;
        public ModelPart LeftBottomJaw5;
        public ModelPart RightBottomJaw5;
        public ModelPart BottomJaw2;
        public ModelPart BottomJaw3;
        public ModelPart BottomJaw2_1;
        public ModelPart BottomJaw3_1;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart RightFrontFootLeftToes;
        public ModelPart RightFrontFootRightToes;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart LeftFrontFootLeftToes;
        public ModelPart LeftFrontFootRightToes;
        public ModelPart Hips;
        public ModelPart FarLeftBodyScutes;
        public ModelPart FarRightBodyScutes;
        public ModelPart LeftBodyScutes;
        public ModelPart RightBodyScutes;
        public ModelPart Belly;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart RightWaistScutes;
        public ModelPart LeftWaistScutes;
        public ModelPart Tail2;
        public ModelPart Tail11;
        public ModelPart Tail3;
        public ModelPart Tail21;
        public ModelPart Tail4;
        public ModelPart Tail31;
        public ModelPart Tail41;
        public ModelPart Tail42;
        public ModelPart Tail4Scutes;
        public ModelPart Tail3Scutes;
        public ModelPart RightTail2Scutes;
        public ModelPart LeftTail2Scutes;
        public ModelPart RightTail1Scutes;
        public ModelPart LeftTail1Scutes;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LeftBackFootLeftToes;
        public ModelPart LeftBackFootRightToes;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart RightBackFootToesLeft;
        public ModelPart RightBackFootRightToes;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.TopJaw3 = this.Head.getChild("TopJaw3");
            this.TopJaw4 = this.TopJaw3.getChild("TopJaw4");
            this.LeftHorn_1 = this.TopJaw4.getChild("LeftHorn_1");
            this.LeftHorn = this.TopJaw4.getChild("LeftHorn");
            this.LeftEye = this.TopJaw3.getChild("LeftEye");
            this.RightEye = this.TopJaw3.getChild("RightEye");
            this.BottomJaw1 = this.Head.getChild("BottomJaw1");
            this.BottomJaw2 = this.BottomJaw1.getChild("BottomJaw2");
            this.BottomJaw2_1 = this.BottomJaw2.getChild("BottomJaw2_1");
            this.BottomJaw4 = this.BottomJaw1.getChild("BottomJaw4");
            this.RightBottomJaw5 = this.BottomJaw1.getChild("RightBottomJaw5");
            this.BottomJaw3 = this.BottomJaw2.getChild("BottomJaw3");
            this.BottomJaw3_1 = this.BottomJaw3.getChild("BottomJaw3_1");
            this.LeftBottomJaw5 = this.BottomJaw1.getChild("LeftBottomJaw5");

            this.TopJaw1 = this.Head.getChild("TopJaw1");
            this.TopTeeth1 = this.TopJaw1.getChild("TopTeeth1");
            this.TopJaw2 = this.TopJaw1.getChild("TopJaw2");
            this.TopTeeth2 = this.TopJaw2.getChild("TopTeeth2");
            this.Nose = this.TopJaw2.getChild("Nose");

            this.LeftNeckScutes = this.Chest.getChild("LeftNeckScutes");
            this.Body = this.Chest.getChild("Body");
            this.RightBodyScutes = this.Body.getChild("RightBodyScutes");
            this.FarLeftBodyScutes = this.Body.getChild("FarLeftBodyScutes");
            this.Hips = this.Body.getChild("Hips");
            this.LeftWaistScutes = this.Hips.getChild("LeftWaistScutes");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail11 = this.Tail1.getChild("Tail11");
            this.LeftTail1Scutes = this.Tail11.getChild("LeftTail1Scutes");
            this.RightTail1Scutes = this.Tail11.getChild("RightTail1Scutes");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail21 = this.Tail2.getChild("Tail21");
            this.LeftTail2Scutes = this.Tail21.getChild("LeftTail2Scutes");
            this.RightTail2Scutes = this.Tail21.getChild("RightTail2Scutes");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Tail31 = this.Tail3.getChild("Tail31");
            this.Tail3Scutes = this.Tail31.getChild("Tail3Scutes");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.Tail41 = this.Tail4.getChild("Tail41");
            this.Tail4Scutes = this.Tail41.getChild("Tail4Scutes");
            this.Tail42 = this.Tail41.getChild("Tail42");
            this.RightWaistScutes = this.Hips.getChild("RightWaistScutes");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.RightBackFootToesLeft = this.FootRight.getChild("RightBackFootToesLeft");
            this.RightBackFootRightToes = this.FootRight.getChild("RightBackFootRightToes");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.LeftBackFootRightToes = this.FootLeft.getChild("LeftBackFootRightToes");
            this.LeftBackFootLeftToes = this.FootLeft.getChild("LeftBackFootLeftToes");
            this.LeftBodyScutes = this.Body.getChild("LeftBodyScutes");
            this.Belly = this.Body.getChild("Belly");
            this.FarRightBodyScutes = this.Body.getChild("FarRightBodyScutes");
            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.LeftFrontFootLeftToes = this.HandLeft.getChild("LeftFrontFootLeftToes");
            this.LeftFrontFootRightToes = this.HandLeft.getChild("LeftFrontFootRightToes");

            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.RightFrontFootLeftToes = this.HandRight.getChild("RightFrontFootLeftToes");
            this.RightFrontFootRightToes = this.HandRight.getChild("RightFrontFootRightToes");

            this.RightNeckScutes = this.Chest.getChild("RightNeckScutes");


        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 30).addBox(-3.5F, 0.0F, -6.0F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 14.5F, -4.0F, 0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 18).addBox(-2.5F, -2.5F, -5.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.7F, -4.5F, -0.1599999885518433F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(22, 19).addBox(-2.5F, -0.3F, -0.5F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.00999999F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -4.7F, -1.2357588105960775F, 0.0F, 0.0F));
            PartDefinition TopJaw3 = Head.addOrReplaceChild("TopJaw3", CubeListBuilder.create().texOffs(42, 36).addBox(-2.0F, 0.0F, -0.5F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, -0.35F, -0.63F));
            PartDefinition LeftEye = TopJaw3.addOrReplaceChild("LeftEye", CubeListBuilder.create().texOffs(42, 28).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.7F, 4.1F, -0.2F, 0.13072515697963366F, 0.2275909337942703F, 0.0F));
            PartDefinition RightEye = TopJaw3.addOrReplaceChild("RightEye", CubeListBuilder.create().texOffs(42, 28).mirror(true).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.7F, 4.1F, -0.2F, 0.13072515697963366F, -0.2275909337942703F, 0.0F));
            PartDefinition TopJaw4 = TopJaw3.addOrReplaceChild("TopJaw4", CubeListBuilder.create().texOffs(42, 31).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.8F, 0.0F, 0.12374384662955905F, 0.0F, 0.0F));
            PartDefinition LeftHorn = TopJaw4.addOrReplaceChild("LeftHorn", CubeListBuilder.create().texOffs(39, 25).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.11728612207217244F, 0.0F, 0.23457224414434488F));
            PartDefinition LeftHorn_1 = TopJaw4.addOrReplaceChild("LeftHorn_1", CubeListBuilder.create().texOffs(39, 25).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.11728612207217244F, 0.0F, -0.23457224414434488F));

            PartDefinition TopJaw1 = Head.addOrReplaceChild("TopJaw1", CubeListBuilder.create().texOffs(22, 26).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.6F, 0.0F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition TopTeeth1 = TopJaw1.addOrReplaceChild("TopTeeth1", CubeListBuilder.create().texOffs(37, 19).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 1.5F));
            PartDefinition TopJaw2 = TopJaw1.addOrReplaceChild("TopJaw2", CubeListBuilder.create().texOffs(27, 33).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.45F, 1.5F, -0.10437068960215605F, 0.0F, 0.0F));
            PartDefinition TopTeeth2 = TopJaw2.addOrReplaceChild("TopTeeth2", CubeListBuilder.create().texOffs(37, 16).addBox(-1.5F, -0.1F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
            PartDefinition Nose = TopJaw2.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(27, 37).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.05F, -1.9F, 0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition BottomJaw1 = Head.addOrReplaceChild("BottomJaw1", CubeListBuilder.create().texOffs(44, 54).addBox(-2.0F, -2.4F, -0.5F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 2.3F, -0.09529497782468066F, 0.0F, 0.0F));
            PartDefinition BottomJaw2 = BottomJaw1.addOrReplaceChild("BottomJaw2", CubeListBuilder.create().texOffs(57, 58).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.4F, 0.0F, -0.09756390784964411F, 0.0F, 0.0F));
            PartDefinition LeftBottomJaw5 = BottomJaw1.addOrReplaceChild("LeftBottomJaw5", CubeListBuilder.create().texOffs(67, 56).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.3F, 1.2F, 0.1F, 1.631533843353843F, 0.0F, 0.0F));
            PartDefinition RightBottomJaw5 = BottomJaw1.addOrReplaceChild("RightBottomJaw5", CubeListBuilder.create().texOffs(67, 56).mirror(true).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.3F, 1.2F, 0.1F, 1.631533843353843F, 0.0F, 0.0F));

            PartDefinition BottomJaw4 = BottomJaw1.addOrReplaceChild("BottomJaw4", CubeListBuilder.create().texOffs(56, 45).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.57F, 0.2F, 2.9267426652798685F, 0.0F, 0.0F));
            PartDefinition BottomJaw2_1 = BottomJaw2.addOrReplaceChild("BottomJaw2_1", CubeListBuilder.create().texOffs(48, 48).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, -0.5F, -0.5F));
            PartDefinition BottomJaw3 = BottomJaw2.addOrReplaceChild("BottomJaw3", CubeListBuilder.create().texOffs(57, 53).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.45F, 0.0F, 0.05201081204232616F, 0.0F, 0.0F));
            PartDefinition BottomJaw3_1 = BottomJaw3.addOrReplaceChild("BottomJaw3_1", CubeListBuilder.create().texOffs(42, 51).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, -0.5F));

            PartDefinition LeftNeckScutes = Chest.addOrReplaceChild("LeftNeckScutes", CubeListBuilder.create().texOffs(0, 59).addBox(0.0F, -1.0F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(1.7F, 0.5F, 0.0F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 44).addBox(-4.5F, 0.0F, 0.0F, 9.0F, 6.0F, 12.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, -0.3F));
            PartDefinition RightBodyScutes = Body.addOrReplaceChild("RightBodyScutes", CubeListBuilder.create().texOffs(50, 68).addBox(0.0F, -1.0F, -6.0F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-1.7F, 0.2F, 5.5F));
            PartDefinition FarLeftBodyScutes = Body.addOrReplaceChild("FarLeftBodyScutes", CubeListBuilder.create().texOffs(0, 68).addBox(0.0F, -1.0F, -6.0F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(3.6F, 0.5F, 5.5F));
            PartDefinition Belly = Body.addOrReplaceChild("Belly", CubeListBuilder.create().texOffs(0, 82).addBox(-4.0F, 0.0F, -5.5F, 8.0F, 1.0F, 11.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 6.0F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition LeftBodyScutes = Body.addOrReplaceChild("LeftBodyScutes", CubeListBuilder.create().texOffs(25, 68).addBox(0.0F, -1.0F, -6.0F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(1.7F, 0.2F, 5.5F));
            PartDefinition FarRightBodyScutes = Body.addOrReplaceChild("FarRightBodyScutes", CubeListBuilder.create().texOffs(75, 68).addBox(0.0F, -1.0F, -6.0F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-3.6F, 0.5F, 5.5F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(102, 0).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 7.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 12.0F, -0.13665927909957545F, -0.0F, 0.0F));
            PartDefinition LeftWaistScutes = Hips.addOrReplaceChild("LeftWaistScutes", CubeListBuilder.create().texOffs(0, 74).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(1.7F, 0.3F, 0.0F));
            PartDefinition RightWaistScutes = Hips.addOrReplaceChild("RightWaistScutes", CubeListBuilder.create().texOffs(9, 74).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-1.7F, 0.3F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(84, 38).mirror(true).addBox(-3.5F, -2.5F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-4.5F, 3.6F, 1.4F, 0.0F, -0.41800636916844736F, -0.8719664783174005F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(84, 47).mirror(true).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-2.2F, 0.0F, 0.1F, -0.519235452468313F, -0.2792526803190927F, 0.31398472843903824F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(84, 55).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 4.8F, -0.5443682030180952F, 0.18779743150933148F, 0.8726646259971648F));
            PartDefinition RightBackFootToesLeft = FootRight.addOrReplaceChild("RightBackFootToesLeft", CubeListBuilder.create().texOffs(80, 55).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.6F, 0.0F, 0.0F, -0.3490658503988659F));
            PartDefinition RightBackFootRightToes = FootRight.addOrReplaceChild("RightBackFootRightToes", CubeListBuilder.create().texOffs(92, 55).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.6F, 0.0F, 0.0F, 0.3490658503988659F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(84, 38).addBox(-1.5F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(4.5F, 3.6F, 1.4F, 0.0F, 0.41800636916844736F, 0.8719664783174005F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(84, 47).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(2.2F, 0.0F, 0.1F, -0.519235452468313F, 0.2792526803190927F, -0.31398472843903824F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(84, 55).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 4.8F, -0.5443682030180952F, -0.18779743150933148F, -0.8726646259971648F));
            PartDefinition LeftBackFootRightToes = FootLeft.addOrReplaceChild("LeftBackFootRightToes", CubeListBuilder.create().texOffs(80, 55).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.6F, 0.0F, 0.0F, 0.3490658503988659F));
            PartDefinition LeftBackFootLeftToes = FootLeft.addOrReplaceChild("LeftBackFootLeftToes", CubeListBuilder.create().texOffs(92, 55).addBox(-0.9F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.9F, 0.5F, 0.6F, 0.0F, 0.0F, -0.3490658503988659F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(73, 0).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.2F, 4.4F, -0.3000000035018414F, 0.01248242744390474F, 0.0F));
            PartDefinition Tail11 = Tail1.addOrReplaceChild("Tail11", CubeListBuilder.create().texOffs(77, 27).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition LeftTail1Scutes = Tail11.addOrReplaceChild("LeftTail1Scutes", CubeListBuilder.create().texOffs(0, 68).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.7F, 0.2F, 0.0F, 0.0F, -0.04555309164612875F, 0.0F));
            PartDefinition RightTail1Scutes = Tail11.addOrReplaceChild("RightTail1Scutes", CubeListBuilder.create().texOffs(17, 68).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.7F, 0.2F, 0.0F, 0.0F, 0.04555309164612875F, 0.0F));

            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(46, 0).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 7.1F, 0.2689552350691651F, -0.03001966363364517F, 0.0F));
            PartDefinition Tail21 = Tail2.addOrReplaceChild("Tail21", CubeListBuilder.create().texOffs(104, 27).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition LeftTail2Scutes = Tail21.addOrReplaceChild("LeftTail2Scutes", CubeListBuilder.create().texOffs(0, 66).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.3F, 0.0F, 0.0F, 0.0F, -0.04555309164612875F, 0.0F));
            PartDefinition RightTail2Scutes = Tail21.addOrReplaceChild("RightTail2Scutes", CubeListBuilder.create().texOffs(17, 66).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.3F, 0.0F, 0.0F, 0.0F, 0.04555309164612875F, 0.0F));

            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(21, 0).addBox(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.01F, 7.6F, 0.0911061832922575F, -0.04450589509361756F, 0.0F));
            PartDefinition Tail31 = Tail3.addOrReplaceChild("Tail31", CubeListBuilder.create().texOffs(58, 16).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -3.6F, 0.0F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition Tail3Scutes = Tail31.addOrReplaceChild("Tail3Scutes", CubeListBuilder.create().texOffs(0, 61).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(104, 13).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 9.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.5F, 7.8F));
            PartDefinition Tail41 = Tail4.addOrReplaceChild("Tail41", CubeListBuilder.create().texOffs(81, 15).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -3.6F, 0.0F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition Tail42 = Tail41.addOrReplaceChild("Tail42", CubeListBuilder.create().texOffs(95, 15).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, -0.6373942508178124F, 0.0F, 0.0F));
            PartDefinition Tail4Scutes = Tail41.addOrReplaceChild("Tail4Scutes", CubeListBuilder.create().texOffs(0, 57).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(103, 56).addBox(-1.0F, -2.0F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(3.5F, 4.2F, -3.0F, 0.17400933108436656F, -0.12199851071966199F, 0.767944870877505F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(107, 63).addBox(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(2.3F, -0.8F, 0.6F, 0.6279694568780765F, -0.7670722195673133F, -0.08726646259971647F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(103, 69).addBox(-1.02F, -0.5F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -1.1667525783265984F, 0.004188790111159634F, -0.819083023287261F));
            PartDefinition LeftFrontFootLeftToes = HandLeft.addOrReplaceChild("LeftFrontFootLeftToes", CubeListBuilder.create().texOffs(94, 70).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, -0.1F, 0.0F, -0.3642502295386026F, 0.0F));
            PartDefinition LeftFrontFootRightToes = HandLeft.addOrReplaceChild("LeftFrontFootRightToes", CubeListBuilder.create().texOffs(116, 70).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1F, -0.1F, 0.0F, 0.3642502295386026F, 0.0F));

            PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(103, 56).mirror(true).addBox(-3.0F, -2.0F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-3.5F, 4.2F, -3.0F, 0.17400933108436656F, 0.12199851071966199F, -0.767944870877505F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(107, 63).mirror(true).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-2.3F, -0.8F, 0.6F, 0.6279694568780765F, 0.7670722195673133F, 0.08726646259971647F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(103, 69).mirror(true).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -1.1967722627661896F, 0.004188790111159634F, 0.819083023287261F));
            PartDefinition RightFrontFootLeftToes = HandRight.addOrReplaceChild("RightFrontFootLeftToes", CubeListBuilder.create().texOffs(116, 70).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, -0.1F, 0.0F, -0.3642502295386026F, 0.0F));
            PartDefinition RightFrontFootRightToes = HandRight.addOrReplaceChild("RightFrontFootRightToes", CubeListBuilder.create().texOffs(94, 70).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1F, -0.1F, 0.0F, 0.3642502295386026F, 0.0F));

            PartDefinition RightNeckScutes = Chest.addOrReplaceChild("RightNeckScutes", CubeListBuilder.create().texOffs(11, 59).addBox(0.0F, -1.0F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-1.7F, 0.5F, 0.0F));

            return LayerDefinition.create(meshDefinition, 128, 96);
        }

        @Override
        public void setupAnim(CubanCrocodileEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            super.setupAnim(entity, entity.tickCount, 0.3F, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.159F;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F - 1.235F;
            this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;
            this.Tail2.yRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;
            this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.3F * limbSwingAmount * 0.5F;
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

                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.159F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 1.235F;

                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount;
                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount;
                this.Chest.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount;
                this.Hips.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount;

                this.UpperArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount + 0.174F;
                this.UpperArmLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount - 0.122F;
                this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount - 3.9F;
                this.ArmLeft.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 5.3F;
                this.HandLeft.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 1.0F;
                this.UpperArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount + 0.174F;
                this.UpperArmRight.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount + 0.122F;
                this.ArmRight.xRot = Mth.cos(2.2F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount - 3.9F;
                this.ArmRight.yRot = Mth.cos(2.2F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount + 5.3F;
                this.HandRight.zRot = Mth.cos(2.2F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount + 1.0F;

                this.ThighLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.5F;
                this.ThighLeft.zRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.9F * limbSwingAmount + 1.6F;
                this.ThighLeft.y = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 2.8F;
                this.LegLeft.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 1.8F;
                this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 1.1F;
                this.ThighRight.yRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount + 0.5F;
                this.ThighRight.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.9F * limbSwingAmount - 1.6F;
                this.ThighRight.y = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 2.8F;
                this.LegRight.zRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 1.8F;
                this.FootRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 1.1F;

                this.Tail1.xRot = 0F;
                this.Tail2.xRot = 0F;
                this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -1.9F * limbSwingAmount;
                this.Tail2.yRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * -2.1F * limbSwingAmount;
                this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 1.9F * limbSwingAmount;

            } else {
                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.9F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.159F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.9F) * degree * -0.05F * limbSwingAmount * 0.5F - 1.235F;

                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 0.9F * limbSwingAmount * 0.5F;
                this.Chest.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -0.9F * limbSwingAmount * 0.5F;
                this.Hips.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 0.9F * limbSwingAmount * 0.5F;

                this.LegLeft.zRot = - 0.414F;
                this.LegRight.zRot = 0.414F;
                this.ThighLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F + 0.418F;
                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F;
                this.ThighLeft.zRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.872F;
                this.ThighLeft.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -15.0F * limbSwingAmount * 0.5F + 1.2F;
                this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.519F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.544F;
                this.FootLeft.zRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.872F;
                this.ThighRight.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F - 0.418F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -1.2F * limbSwingAmount * 0.5F;
                this.ThighRight.zRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.872F;
                this.ThighRight.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 15.0F * limbSwingAmount * 0.5F + 1.2F;
                this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.519F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.544F;
                this.FootRight.zRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.872F;

                this.UpperArmLeft.xRot = 0.174F;
                this.UpperArmLeft.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 10.0F * limbSwingAmount * 0.5F - 3.0F;
                this.UpperArmLeft.yRot = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.122F;
                this.ArmLeft.yRot = - 0.767F;
                this.ArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.628F;
                this.HandLeft.zRot = - 0.819F;
                this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 1.284F;
                this.UpperArmRight.xRot  = 0.174F;
                this.UpperArmRight.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 10.0F * limbSwingAmount * 0.5F - 3.0F;
                this.UpperArmRight.yRot = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.122F;
                this.ArmRight.yRot = 0.767F;
                this.ArmRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.628F;
                this.HandRight.zRot = 0.819F;
                this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 1.275F;

                this.Tail1.xRot = - 0.078F;
                this.Tail2.xRot = 0.156F;
                this.Tail1.yRot = Mth.cos(5.0F + limbSwing * speed * 0.45F) * degree * -1.1F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F;
                this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -1.5F * limbSwingAmount * 0.5F;
            }
        }
    }

    public static class Child extends CubanCrocodileModel {
        public ModelPart Body;
        public ModelPart LeftNeckScutes;
        public ModelPart UpperArmLeft;
        public ModelPart Neck;
        public ModelPart UpperArmRight;
        public ModelPart LeftNeckScutes_1;
        public ModelPart Hips;
        public ModelPart LeftNeckScutes_2;
        public ModelPart LeftNeckScutes_3;
        public ModelPart LeftNeckScutes_4;
        public ModelPart LeftNeckScutes_5;
        public ModelPart Tail1;
        public ModelPart LeftNeckScutes_6;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart LeftNeckScutes_7;
        public ModelPart Tail2;
        public ModelPart LeftNeckScutes_8;
        public ModelPart LeftNeckScutes_9;
        public ModelPart Tail3;
        public ModelPart LeftNeckScutes_10;
        public ModelPart LeftNeckScutes_11;
        public ModelPart TailScute;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart ToeLeft1;
        public ModelPart ToeLeft2;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ToeRight1;
        public ModelPart ToeRight2;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart FingerLeft1;
        public ModelPart FingerLeft2;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EyeLeft;
        public ModelPart LeftHorn;
        public ModelPart RightHorn;
        public ModelPart EyeRight;
        public ModelPart SnoutTop;
        public ModelPart Mouth;
        public ModelPart Nose;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart FingerRight1;
        public ModelPart FingerRight2;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.FingerLeft2 = this.HandLeft.getChild("FingerLeft2");
            this.FingerLeft1 = this.HandLeft.getChild("FingerLeft1");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.RightHorn = this.Head.getChild("RightHorn");
            this.EyeRight = this.Head.getChild("EyeRight");
            this.EyeLeft = this.Head.getChild("EyeLeft");
            this.LeftHorn = this.Head.getChild("LeftHorn");
            this.Snout = this.Head.getChild("Snout");
            this.SnoutTop = this.Snout.getChild("SnoutTop");
            this.Mouth = this.Snout.getChild("Mouth");
            this.Nose = this.Snout.getChild("Nose");
            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.FingerRight1 = this.HandRight.getChild("FingerRight1");
            this.FingerRight2 = this.HandRight.getChild("FingerRight2");
            this.LeftNeckScutes_1 = this.Chest.getChild("LeftNeckScutes_1");
            this.Body = this.Chest.getChild("Body");
            this.LeftNeckScutes_3 = this.Body.getChild("LeftNeckScutes_3");
            this.LeftNeckScutes_2 = this.Body.getChild("LeftNeckScutes_2");
            this.LeftNeckScutes_5 = this.Body.getChild("LeftNeckScutes_5");
            this.LeftNeckScutes_4 = this.Body.getChild("LeftNeckScutes_4");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ToeLeft1 = this.FootLeft.getChild("ToeLeft1");
            this.ToeLeft2 = this.FootLeft.getChild("ToeLeft2");
            this.LeftNeckScutes_7 = this.Hips.getChild("LeftNeckScutes_7");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.LeftNeckScutes_9 = this.Tail1.getChild("LeftNeckScutes_9");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.LeftNeckScutes_11 = this.Tail2.getChild("LeftNeckScutes_11");
            this.LeftNeckScutes_10 = this.Tail2.getChild("LeftNeckScutes_10");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.TailScute = this.Tail3.getChild("TailScute");
            this.LeftNeckScutes_6 = this.Hips.getChild("LeftNeckScutes_6");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ToeRight1 = this.FootRight.getChild("ToeRight1");
            this.ToeRight2 = this.FootRight.getChild("ToeRight2");
            this.LeftNeckScutes = this.Chest.getChild("LeftNeckScutes");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();
            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 21.0F, -5.0F, 0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(20, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.7F, 0.5F, 0.5F, 0.2617993877991494F, -0.08726646259971647F, -0.8726646259971648F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(20, 25).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, -0.3490658503988659F, 0.0F, 0.6981317007977318F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(25, 18).mirror(true).addBox(-0.5F, -0.01F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.4F)), PartPose.offsetAndRotation(0.1F, 1.4F, -0.5F, 0.19198621771937624F, 0.0F, 0.17453292519943295F));
            PartDefinition FingerLeft2 = HandLeft.addOrReplaceChild("FingerLeft2", CubeListBuilder.create().texOffs(25, 18).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));
            PartDefinition FingerLeft1 = HandLeft.addOrReplaceChild("FingerLeft1", CubeListBuilder.create().texOffs(25, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(20, 7).addBox(-1.0F, -0.5F, -1.6F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.2F)), PartPose.offsetAndRotation(0.0F, -1.2F, -1.5F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(30, 8).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -1.7F, 0.3186971254089062F, 0.0F, 0.0F));
            PartDefinition RightHorn = Head.addOrReplaceChild("RightHorn", CubeListBuilder.create().texOffs(50, 14).mirror(true).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -2.0F, 0.3909537457888271F, 0.0F, -0.23457224414434488F));
            PartDefinition EyeRight = Head.addOrReplaceChild("EyeRight", CubeListBuilder.create().texOffs(45, 15).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2F, -1.0F, 0.11728612207217244F, -0.19547687289441354F, 0.0F));
            PartDefinition EyeLeft = Head.addOrReplaceChild("EyeLeft", CubeListBuilder.create().texOffs(45, 15).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.5F, -1.2F, -1.0F, 0.11728612207217244F, 0.19547687289441354F, 0.0F));
            PartDefinition LeftHorn = Head.addOrReplaceChild("LeftHorn", CubeListBuilder.create().texOffs(50, 14).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.5F, -0.8F, -2.0F, 0.3909537457888271F, 0.0F, 0.23457224414434488F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(20, 13).addBox(-1.0F, -0.6F, -3.2F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.18901915665940536F, 0.0F, 0.0F));
            PartDefinition SnoutTop = Snout.addOrReplaceChild("SnoutTop", CubeListBuilder.create().texOffs(41, 10).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.3380702907586876F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(34, 14).addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.8F, -0.21485003824419496F, 0.0F, 0.0F));
            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(30, 14).addBox(-1.0F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.46914448828868976F, 0.0F, 0.0F));

            PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(20, 22).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.7F, 0.5F, 0.5F, 0.2617993877991494F, 0.08726646259971647F, 0.8726646259971648F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(20, 25).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, -0.3490658503988659F, 0.0F, -0.6981317007977318F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(25, 18).mirror(true).addBox(-0.5F, -0.01F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.4F)), PartPose.offsetAndRotation(-0.1F, 1.4F, -0.5F, 0.19198621771937624F, 0.0F, -0.17453292519943295F));
            PartDefinition FingerRight1 = HandRight.addOrReplaceChild("FingerRight1", CubeListBuilder.create().texOffs(25, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));
            PartDefinition FingerRight2 = HandRight.addOrReplaceChild("FingerRight2", CubeListBuilder.create().texOffs(25, 18).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition LeftNeckScutes_1 = Chest.addOrReplaceChild("LeftNeckScutes_1", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -1.0F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-1.7F, -1.0F, 0.0F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 7).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.1F, 0.1F, 0.0F)), PartPose.offset(0.0F, -1.0F, 1.5F));
            PartDefinition LeftNeckScutes_3 = Body.addOrReplaceChild("LeftNeckScutes_3", CubeListBuilder.create().texOffs(0, 19).mirror(true).addBox(0.0F, -1.0F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(1.0F, -0.3F, 2.5F));
            PartDefinition LeftNeckScutes_2 = Body.addOrReplaceChild("LeftNeckScutes_2", CubeListBuilder.create().texOffs(0, 19).mirror(true).addBox(0.0F, -1.0F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(2.0F, 0.0F, 2.5F));
            PartDefinition LeftNeckScutes_5 = Body.addOrReplaceChild("LeftNeckScutes_5", CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -1.0F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-1.0F, -0.3F, 2.5F));
            PartDefinition LeftNeckScutes_4 = Body.addOrReplaceChild("LeftNeckScutes_4", CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -1.0F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-2.0F, 0.0F, 2.5F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 15).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(26, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.5F, 2.0F, 1.5F, 0.3790855015489435F, -0.08726646259971647F, -0.8726646259971648F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(26, 25).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, 0.3490658503988659F, 0.0F, 0.6981317007977318F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(25, 18).mirror(true).addBox(-0.5F, -0.01F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.4F)), PartPose.offsetAndRotation(0.2F, 1.3F, -0.4F, -0.35534904635868986F, 0.0F, 0.17453292519943295F));
            PartDefinition ToeLeft1 = FootLeft.addOrReplaceChild("ToeLeft1", CubeListBuilder.create().texOffs(25, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));
            PartDefinition ToeLeft2 = FootLeft.addOrReplaceChild("ToeLeft2", CubeListBuilder.create().texOffs(25, 18).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition LeftNeckScutes_7 = Hips.addOrReplaceChild("LeftNeckScutes_7", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -1.0F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-1.7F, 0.5F, 1.5F));
            PartDefinition LeftNeckScutes_6 = Hips.addOrReplaceChild("LeftNeckScutes_6", CubeListBuilder.create().texOffs(0, 20).mirror(true).addBox(0.0F, -1.0F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(1.7F, 0.5F, 1.5F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(14, 0).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F, -0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 2.8F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition LeftNeckScutes_9 = Tail1.addOrReplaceChild("LeftNeckScutes_9", CubeListBuilder.create().texOffs(0, 21).addBox(0.0F, -1.0F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-1.0F, 0.0F, 2.0F));
            PartDefinition LeftNeckScutes_8 = Tail1.addOrReplaceChild("LeftNeckScutes_8", CubeListBuilder.create().texOffs(0, 21).mirror(true).addBox(0.0F, -1.0F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(1.0F, 0.0F, 2.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition LeftNeckScutes_11 = Tail2.addOrReplaceChild("LeftNeckScutes_11", CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -1.0F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-0.5F, 0.5F, 2.7F));
            PartDefinition LeftNeckScutes_10 = Tail2.addOrReplaceChild("LeftNeckScutes_10", CubeListBuilder.create().texOffs(0, 19).mirror(true).addBox(0.0F, -1.0F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.5F, 0.5F, 2.7F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 5.0F, 0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition TailScute = Tail3.addOrReplaceChild("TailScute", CubeListBuilder.create().texOffs(0, 21).mirror(true).addBox(0.0F, -2.5F, -2.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.5F, 2.2F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(26, 22).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.5F, 2.0F, 1.5F, 0.3790855015489435F, 0.08726646259971647F, 0.8726646259971648F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(26, 25).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, 0.3490658503988659F, 0.0F, -0.6981317007977318F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(25, 18).mirror(true).addBox(-0.5F, -0.01F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.4F)), PartPose.offsetAndRotation(-0.2F, 1.3F, -0.4F, -0.35534904635868986F, 0.0F, -0.17453292519943295F));
            PartDefinition ToeRight1 = FootRight.addOrReplaceChild("ToeRight1", CubeListBuilder.create().texOffs(25, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));
            PartDefinition ToeRight2 = FootRight.addOrReplaceChild("ToeRight2", CubeListBuilder.create().texOffs(25, 18).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

            PartDefinition LeftNeckScutes = Chest.addOrReplaceChild("LeftNeckScutes", CubeListBuilder.create().texOffs(0, 20).mirror(true).addBox(0.0F, -1.0F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(1.7F, -1.0F, 0.0F));
            return LayerDefinition.create(meshDefinition, 64, 32);
        }


        @Override
        public void setupAnim(CubanCrocodileEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            super.setupAnim(entity, entity.tickCount, 0.3F, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F -0.227F;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.318F;
            this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;
            this.Tail2.yRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;
            this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.3F * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 4.0f;
            float degree = 0.7f;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 4.0F;
                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.227F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.318F;

                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F;
                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F;
                this.Chest.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount * 0.5F;
                this.Hips.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;

                this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -1.9F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * -2.1F * limbSwingAmount * 0.5F;
                this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 1.9F * limbSwingAmount * 0.5F;

            } else {
                this.UpperArmLeft.xRot = 1.7F;
                this.UpperArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.26F;
                this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.35F;
                this.ArmLeft.yRot = + 1.1F;
                this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.2F;
                this.HandLeft.zRot = - 0.0F;
                this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.03F;
                this.LegLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.87F;
                this.FootLeft.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.23F;
                this.UpperArmRight.xRot = - 1.7F;
                this.UpperArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.26F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.35F;
                this.ArmRight.yRot = - 1.1F;
                this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.2F;
                this.HandLeft.zRot = - 0.0F;
                this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.03F;
                this.LegRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.87F;
                this.FootRight.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.23F;
                this.Body.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
                this.Neck.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
                this.Head.yRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
                this.Hips.yRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
                this.Chest.yRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
                this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
                this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
                this.Tail3.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
            }
        }
    }
}