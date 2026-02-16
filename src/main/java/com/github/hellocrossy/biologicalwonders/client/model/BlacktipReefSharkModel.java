package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.BlacktipReefSharkEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class BlacktipReefSharkModel extends ZawaBaseModel<BlacktipReefSharkEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends BlacktipReefSharkModel {
        public ModelPart PectoralFinLeft1;
        public ModelPart Hips;
        public ModelPart PectoralFinRight1;
        public ModelPart BackTailFin1;
        public ModelPart Head;
        public ModelPart PectoralFinLeft2;
        public ModelPart PectoralFinLeft3;
        public ModelPart Tail1;
        public ModelPart UnderFinLeft;
        public ModelPart Tail2;
        public ModelPart UnderfinRight;
        public ModelPart Tail3;
        public ModelPart BackTailFin3;
        public ModelPart UnderFin1;
        public ModelPart TailFinTop;
        public ModelPart TailFinLower2;
        public ModelPart TailFinLower;
        public ModelPart BackTailFin4;
        public ModelPart PectoralFinRight3;
        public ModelPart PectoralFinRight2;
        public ModelPart BackTailFin2;
        public ModelPart HeadConnection;
        public ModelPart Snout1;
        public ModelPart HeadUnder;
        public ModelPart Snout2;
        public ModelPart TopSnout1;
        public ModelPart TopSnout2;
        public ModelPart Mouth1;
        public ModelPart Mouth2;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");

            this.BackTailFin1 = this.Body.getChild("BackTailFin1");
            this.BackTailFin2 = this.BackTailFin1.getChild("BackTailFin2");

            this.PectoralFinRight1 = this.Body.getChild("PectoralFinRight1");
            this.PectoralFinRight3 = this.PectoralFinRight1.getChild("PectoralFinRight3");
            this.PectoralFinRight2 = this.PectoralFinRight1.getChild("PectoralFinRight2");

            this.Hips = this.Body.getChild("Hips");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.TailFinTop = this.Tail3.getChild("TailFinTop");
            this.TailFinLower = this.TailFinTop.getChild("TailFinLower");
            this.TailFinLower2 = this.TailFinTop.getChild("TailFinLower2");

            this.UnderFin1 = this.Tail2.getChild("UnderFin1");
            this.BackTailFin3 = this.Tail2.getChild("BackTailFin3");
            this.BackTailFin4 = this.BackTailFin3.getChild("BackTailFin4");

            this.UnderFinLeft = this.Tail1.getChild("UnderFinLeft");
            this.UnderfinRight = this.Tail1.getChild("UnderfinRight");

            this.Head = this.Body.getChild("Head");
            this.HeadUnder = this.Head.getChild("HeadUnder");
            this.HeadConnection = this.Head.getChild("HeadConnection");
            this.Mouth1 = this.HeadUnder.getChild("Mouth1");
            this.Mouth2 = this.Mouth1.getChild("Mouth2");

            this.Snout1 = this.Head.getChild("Snout1");
            this.TopSnout1 = this.Snout1.getChild("TopSnout1");
            this.TopSnout2 = this.TopSnout1.getChild("TopSnout2");
            this.Snout2 = this.Snout1.getChild("Snout2");

            this.PectoralFinLeft1 = this.Body.getChild("PectoralFinLeft1");
            this.PectoralFinLeft3 = this.PectoralFinLeft1.getChild("PectoralFinLeft3");
            this.PectoralFinLeft2 = this.PectoralFinLeft1.getChild("PectoralFinLeft2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 51).addBox(-3.5F, -2.5F, -1.5F, 7.0F, 7.0F, 6.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 16.2F, -5.0F));

            PartDefinition BackTailFin1 = Body.addOrReplaceChild("BackTailFin1", CubeListBuilder.create().texOffs(28, 43).addBox(-0.5F, -7.0F, -1.2F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.2F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.6646214111173737F, 0.0F, 0.0F));
            PartDefinition BackTailFin2 = BackTailFin1.addOrReplaceChild("BackTailFin2", CubeListBuilder.create().texOffs(40, 39).addBox(-0.5F, -6.3F, -0.25F, 1.0F, 6.0F, 3.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 3.0F, 0.6255260065779288F, 0.0F, 0.0F));

            PartDefinition PectoralFinRight1 = Body.addOrReplaceChild("PectoralFinRight1", CubeListBuilder.create().texOffs(48, 0).mirror(true).addBox(-2.5F, -0.5F, -1.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-3.0F, 3.5F, -1.0F, 0.0F, 0.22218040578939488F, -0.7819074915776542F));
            PartDefinition PectoralFinRight3 = PectoralFinRight1.addOrReplaceChild("PectoralFinRight3", CubeListBuilder.create().texOffs(37, 0).mirror(true).addBox(-5.0F, -0.5F, 0.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-2.4F, 0.01F, -1.5F, 0.0F, 0.4300491170387584F, 0.0F));
            PartDefinition PectoralFinRight2 = PectoralFinRight1.addOrReplaceChild("PectoralFinRight2", CubeListBuilder.create().texOffs(52, 6).mirror(true).addBox(-4.0F, -0.5F, -1.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-2.5F, 0.0F, 2.0F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 39).addBox(-3.0F, -0.5F, -0.5F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 4.5F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 25).addBox(-2.5F, -0.1F, -1.0F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.004188790111159634F, 0.03246312433676588F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 15).addBox(-2.0F, 0.5F, 0.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 5.5F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition UnderFin1 = Tail2.addOrReplaceChild("UnderFin1", CubeListBuilder.create().texOffs(52, 53).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, 2.8F, 0.9382889765773795F, 0.0F, 0.0F));
            PartDefinition BackTailFin3 = Tail2.addOrReplaceChild("BackTailFin3", CubeListBuilder.create().texOffs(29, 53).addBox(-0.5F, -4.2F, -0.9F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.2F)), PartPose.offsetAndRotation(0.0F, 1.2F, 2.0F, -0.9773843811168246F, 0.0F, 0.0F));
            PartDefinition BackTailFin4 = BackTailFin3.addOrReplaceChild("BackTailFin4", CubeListBuilder.create().texOffs(35, 53).addBox(-0.5F, -3.6F, 0.55F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F, 0.0F, -0.05F)), PartPose.offsetAndRotation(0.0F, 0.2F, 1.0F, 0.6255260065779288F, 0.0F, 0.0F));

            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 6).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 5.0F, -0.03490658503988659F, 0.0F, 0.0F));
            PartDefinition TailFinTop = Tail3.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(33, 52).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 4.4F, 0.6646214111173737F, 0.0F, 0.0F));
            PartDefinition TailFinLower = TailFinTop.addOrReplaceChild("TailFinLower", CubeListBuilder.create().texOffs(39, 40).addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.01F, -0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, 0.3F, 0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition TailFinLower2 = TailFinTop.addOrReplaceChild("TailFinLower2", CubeListBuilder.create().texOffs(56, 55).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.6F, -2.0F, 0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition UnderFinLeft = Tail1.addOrReplaceChild("UnderFinLeft", CubeListBuilder.create().texOffs(54, 39).mirror(true).addBox(0.0F, 0.5F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.1F, 5.5F, 1.0F, 0.5473352640780661F, 0.0F, -0.8600982340775168F));
            PartDefinition UnderfinRight = Tail1.addOrReplaceChild("UnderfinRight", CubeListBuilder.create().texOffs(54, 39).addBox(-1.0F, 0.5F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.1F, 5.5F, 1.0F, 0.5473352640780661F, 0.0F, 0.8600982340775168F));

            PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(40, 17).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, -3.7F, 0.1171115934746098F, 0.0F, 0.0F));
            PartDefinition HeadUnder = Head.addOrReplaceChild("HeadUnder", CubeListBuilder.create().texOffs(42, 26).addBox(-3.0F, -0.2F, -4.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 2.3F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Mouth1 = HeadUnder.addOrReplaceChild("Mouth1", CubeListBuilder.create().texOffs(26, 24).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 1.7F, -3.4F));
            PartDefinition Mouth2 = Mouth1.addOrReplaceChild("Mouth2", CubeListBuilder.create().texOffs(23, 37).addBox(-1.5F, -0.5F, -2.4F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.9F, 1.7453292129831807E-4F, 0.0F, 0.0F));

            PartDefinition Snout1 = Head.addOrReplaceChild("Snout1", CubeListBuilder.create().texOffs(24, 18).addBox(-2.5F, -2.0F, -3.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.2F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition TopSnout1 = Snout1.addOrReplaceChild("TopSnout1", CubeListBuilder.create().texOffs(24, 11).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -1.0F, 0.27366763203903305F, 0.0F, 0.0F));
            PartDefinition Snout2 = Snout1.addOrReplaceChild("Snout2", CubeListBuilder.create().texOffs(24, 32).addBox(-2.0F, -2.0F, -2.7F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-0.0F, 0.5F, -2.7F));
            PartDefinition TopSnout2 = TopSnout1.addOrReplaceChild("TopSnout2", CubeListBuilder.create().texOffs(30, 28).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.6F, 0.19879300779426656F, 0.003490658556003524F, 0.0F));

            PartDefinition HeadConnection = Head.addOrReplaceChild("HeadConnection", CubeListBuilder.create().texOffs(40, 9).addBox(-3.0F, -0.9F, 0.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -2.1F, 0.03630284710990151F, 0.0F, 0.0F));

            PartDefinition PectoralFinLeft1 = Body.addOrReplaceChild("PectoralFinLeft1", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, -0.5F, -1.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(3.0F, 3.5F, -1.0F, 0.0F, -0.22218040578939488F, 0.7819074915776542F));
            PartDefinition PectoralFinLeft3 = PectoralFinLeft1.addOrReplaceChild("PectoralFinLeft3", CubeListBuilder.create().texOffs(37, 0).addBox(0.0F, -0.5F, 0.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(2.5F, 0.01F, -1.5F, 0.0F, -0.4300491170387584F, 0.0F));
            PartDefinition PectoralFinLeft2 = PectoralFinLeft1.addOrReplaceChild("PectoralFinLeft2", CubeListBuilder.create().texOffs(52, 6).addBox(0.0F, -0.5F, -2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(2.5F, 0.0F, 3.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(BlacktipReefSharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Tail2.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            this.loadBase();
            float speed = 1.5F;
            float degree = 1.0F;
            this.Head.yRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.Tail2.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F;
//            this.LeftPectoralFin1.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.409F;
//            this.RightPectoralFin1.yRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.409F;
            this.Mouth1.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.3F) * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 1.5F;
                float degree = 1.0F;
                this.Head.yRot = Mth.cos((limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
                this.Tail2.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * -0.9F) * limbSwingAmount * 0.5F;
                this.Tail3.yRot = Mth.cos(4.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 2.5F) * limbSwingAmount * 0.5F;
            }
        }
    }

    public static class Child extends BlacktipReefSharkModel {
        public ModelPart Tail1;
        public ModelPart BackFin1;
        public ModelPart LeftPectoralFin1;
        public ModelPart RightPectoralFin1;
        public ModelPart Neck;
        public ModelPart Tail2;
        public ModelPart UnderFin2;
        public ModelPart UnderFin3;
        public ModelPart Tail3;
        public ModelPart UnderFin1;
        public ModelPart BackFin5;
        public ModelPart TailFinTop1;
        public ModelPart TailFinTop3;
        public ModelPart LeftPectoralFin2;
        public ModelPart LeftPectoralFin3;
        public ModelPart RightPectoralFin2;
        public ModelPart RightPectoralFin3;
        public ModelPart Mouth1;
        public ModelPart Head;
        public ModelPart Mouth2;
        public ModelPart Nose;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Tail1 = this.Body.getChild("Tail1");
            this.UnderFin3 = this.Tail1.getChild("UnderFin3");

            this.UnderFin2 = this.Tail1.getChild("UnderFin2");

            this.Tail2 = this.Tail1.getChild("Tail2");
            this.BackFin5 = this.Tail2.getChild("BackFin5");

            this.Tail3 = this.Tail2.getChild("Tail3");
            this.TailFinTop1 = this.Tail3.getChild("TailFinTop1");
            this.TailFinTop3 = this.TailFinTop1.getChild("TailFinTop3");

            this.UnderFin1 = this.Tail2.getChild("UnderFin1");

            this.BackFin1 = this.Body.getChild("BackFin1");

            this.Neck = this.Body.getChild("Neck");
            this.Mouth1 = this.Neck.getChild("Mouth1");
            this.Mouth2 = this.Mouth1.getChild("Mouth2");

            this.Head = this.Neck.getChild("Head");
            this.Nose = this.Head.getChild("Nose");

            this.RightPectoralFin1 = this.Body.getChild("RightPectoralFin1");
            this.RightPectoralFin3 = this.RightPectoralFin1.getChild("RightPectoralFin3");

            this.RightPectoralFin2 = this.RightPectoralFin1.getChild("RightPectoralFin2");

            this.LeftPectoralFin1 = this.Body.getChild("LeftPectoralFin1");
            this.LeftPectoralFin3 = this.LeftPectoralFin1.getChild("LeftPectoralFin3");

            this.LeftPectoralFin2 = this.LeftPectoralFin1.getChild("LeftPectoralFin2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -3.5F, -5.5F, 8.0F, 7.0F, 11.0F), PartPose.offset(0.0F, 20.5F, -0.6F));
            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(38, 0).addBox(-3.5F, -3.5F, 0.0F, 7.0F, 7.0F, 12.0F), PartPose.offset(0.0F, 0.3F, -2.8F));
            PartDefinition UnderFin3 = Tail1.addOrReplaceChild("UnderFin3", CubeListBuilder.create().texOffs(76, 0).addBox(-0.5F, -0.0F, 0.0F, 1.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(-2.3F, 2.2F, 8.0F, -0.500909508638178F, -0.591841146688116F, 0.0F));

            PartDefinition UnderFin2 = Tail1.addOrReplaceChild("UnderFin2", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, -0.0F, 0.0F, 1.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(2.3F, 2.2F, 8.0F, -0.500909508638178F, 0.591841146688116F, 0.0F));

            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(64, 13).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 12.0F), PartPose.offset(0.0F, 0.0F, 3.7F));
            PartDefinition BackFin5 = Tail2.addOrReplaceChild("BackFin5", CubeListBuilder.create().texOffs(64, 0).addBox(-1.0F, -7.1F, 0.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 6.6F, -0.6829473549475088F, 0.0F, 0.0F));

            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(88, 13).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 6.0F), PartPose.offset(0.0F, 0.0F, 10.2F));
            PartDefinition TailFinTop1 = Tail3.addOrReplaceChild("TailFinTop1", CubeListBuilder.create().texOffs(112, 0).addBox(-1.0F, -7.0F, 0.0F, 2.0F, 8.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.6F, 4.5F, -0.8651597048872669F, 0.0F, 0.0F));
            PartDefinition TailFinTop3 = TailFinTop1.addOrReplaceChild("TailFinTop3", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -1.0F, -4.0F, 2.0F, 7.0F, 3.0F), PartPose.offsetAndRotation(-0.5F, -0.8F, 2.5F, 1.5481069932557485F, 0.0F, 0.0F));

            PartDefinition UnderFin1 = Tail2.addOrReplaceChild("UnderFin1", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 9.4F, 0.591841146688116F, 0.0F, 0.0F));

            PartDefinition BackFin1 = Body.addOrReplaceChild("BackFin1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -7.1F, 0.0F, 2.0F, 7.0F, 3.0F), PartPose.offsetAndRotation(0.5F, -1.6F, -1.8F, -0.591841146688116F, 0.0F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(84, 0).addBox(-3.5F, -3.5F, -7.0F, 7.0F, 6.0F, 7.0F), PartPose.offset(0.0F, 0.4F, -0.6F));
            PartDefinition Mouth1 = Neck.addOrReplaceChild("Mouth1", CubeListBuilder.create().texOffs(105, 23).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.01F, -0.21F, -5.1F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition Mouth2 = Mouth1.addOrReplaceChild("Mouth2", CubeListBuilder.create().texOffs(49, 19).addBox(-2.5F, -0.5F, -4.0F, 4.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.5F, 0.4F, -3.3F, -0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(15, 26).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -3.2F, -5.5F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Nose = Head.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(37, 27).addBox(-2.5F, 0.0F, -4.0F, 5.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.3F, -4.0F, -0.04555309164612875F, 0.0F, 0.0F));

            PartDefinition RightPectoralFin1 = Body.addOrReplaceChild("RightPectoralFin1", CubeListBuilder.create().texOffs(64, 0).addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 8.0F), PartPose.offsetAndRotation(-2.5F, 2.1F, -4.8F, 0.18203784630933073F, 1.1838568635856868F, 2.458645232063257F));
            PartDefinition RightPectoralFin3 = RightPectoralFin1.addOrReplaceChild("RightPectoralFin3", CubeListBuilder.create().texOffs(37, 19).addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(-1.31F, 0.01F, 2.0F, 0.0F, 0.3431317282789241F, 0.0F));

            PartDefinition RightPectoralFin2 = RightPectoralFin1.addOrReplaceChild("RightPectoralFin2", CubeListBuilder.create().texOffs(32, 19).addBox(-2.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offset(-1.01F, 0.01F, 1.4F));

            PartDefinition LeftPectoralFin1 = Body.addOrReplaceChild("LeftPectoralFin1", CubeListBuilder.create().texOffs(27, 0).addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 8.0F), PartPose.offsetAndRotation(3.4F, 2.1F, -4.8F, 0.0911061832922575F, 1.1838568635856868F, 0.956091342937205F));
            PartDefinition LeftPectoralFin3 = LeftPectoralFin1.addOrReplaceChild("LeftPectoralFin3", CubeListBuilder.create().texOffs(21, 18).addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(-1.31F, -0.02F, 2.0F, 0.0F, 0.3431317282789241F, 0.0F));

            PartDefinition LeftPectoralFin2 = LeftPectoralFin1.addOrReplaceChild("LeftPectoralFin2", CubeListBuilder.create().texOffs(16, 18).addBox(-2.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offset(-1.01F, -0.01F, 1.4F));

            return LayerDefinition.create(meshDefinition, 128, 44);
        }

        @Override
        public void setupAnim(BlacktipReefSharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
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
