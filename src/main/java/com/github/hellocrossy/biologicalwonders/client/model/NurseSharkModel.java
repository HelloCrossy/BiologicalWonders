package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.NurseSharkEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class NurseSharkModel extends ZawaBaseModel<NurseSharkEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends NurseSharkModel {
        public ModelPart Hips;
        public ModelPart PectoralFinLeft1;
        public ModelPart PectoralFinRight1;
        public ModelPart Neck;
        public ModelPart Tail1;
        public ModelPart BackTailFin1;
        public ModelPart Tail2;
        public ModelPart UnderFinLeft;
        public ModelPart UnderfinRight;
        public ModelPart Tail3;
        public ModelPart BackTailFin3;
        public ModelPart TailFinTop;
        public ModelPart UnderFin1;
        public ModelPart TailFinLower;
        public ModelPart TailFinLower2;
        public ModelPart BackTailFin4;
        public ModelPart BackTailFin2;
        public ModelPart PectoralFinLeft2;
        public ModelPart PectoralFinLeft3;
        public ModelPart PectoralFinRight2;
        public ModelPart PectoralFinRight3;
        public ModelPart HeadConnection;
        public ModelPart Head;
        public ModelPart Jaw1;
        public ModelPart Snout;
        public ModelPart WhiskerLeft;
        public ModelPart WhiskerRight;
        public ModelPart Jaw2;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.PectoralFinLeft1 = this.Body.getChild("PectoralFinLeft1");
            this.PectoralFinLeft2 = this.PectoralFinLeft1.getChild("PectoralFinLeft2");

            this.PectoralFinLeft3 = this.PectoralFinLeft1.getChild("PectoralFinLeft3");

            this.Hips = this.Body.getChild("Hips");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.UnderFinLeft = this.Tail1.getChild("UnderFinLeft");

            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.TailFinTop = this.Tail3.getChild("TailFinTop");
            this.TailFinLower2 = this.TailFinTop.getChild("TailFinLower2");

            this.TailFinLower = this.TailFinTop.getChild("TailFinLower");

            this.UnderFin1 = this.Tail3.getChild("UnderFin1");

            this.BackTailFin3 = this.Tail2.getChild("BackTailFin3");
            this.BackTailFin4 = this.BackTailFin3.getChild("BackTailFin4");

            this.UnderfinRight = this.Tail1.getChild("UnderfinRight");

            this.BackTailFin1 = this.Hips.getChild("BackTailFin1");
            this.BackTailFin2 = this.BackTailFin1.getChild("BackTailFin2");

            this.Neck = this.Body.getChild("Neck");
            this.HeadConnection = this.Neck.getChild("HeadConnection");
            this.Jaw1 = this.HeadConnection.getChild("Jaw1");
            this.Jaw2 = this.Jaw1.getChild("Jaw2");

            this.Head = this.HeadConnection.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.WhiskerRight = this.Snout.getChild("WhiskerRight");

            this.WhiskerLeft = this.Snout.getChild("WhiskerLeft");

            this.PectoralFinRight1 = this.Body.getChild("PectoralFinRight1");
            this.PectoralFinRight3 = this.PectoralFinRight1.getChild("PectoralFinRight3");

            this.PectoralFinRight2 = this.PectoralFinRight1.getChild("PectoralFinRight2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 49).addBox(-4.0F, -2.5F, -4.5F, 8.0F, 6.0F, 9.0F), PartPose.offset(0.0F, 17.0F, -5.0F));
            PartDefinition PectoralFinLeft1 = Body.addOrReplaceChild("PectoralFinLeft1", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, -0.5F, -2.5F, 3.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(4.0F, 2.5F, -1.0F, 0.0F, 0.03909537541112055F, 0.6646214111173737F));
            PartDefinition PectoralFinLeft2 = PectoralFinLeft1.addOrReplaceChild("PectoralFinLeft2", CubeListBuilder.create().texOffs(52, 6).addBox(0.0F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F), PartPose.offset(2.5F, 0.0F, 2.0F));

            PartDefinition PectoralFinLeft3 = PectoralFinLeft1.addOrReplaceChild("PectoralFinLeft3", CubeListBuilder.create().texOffs(37, 0).addBox(0.0F, -0.5F, -0.5F, 5.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(2.2F, 0.01F, -2.1F, 0.0F, -0.46914448828868976F, 0.0F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 37).addBox(-3.5F, -0.5F, -0.5F, 7.0F, 6.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -1.9F, 4.5F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 25).addBox(-3.0F, -0.1F, -1.0F, 6.0F, 5.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition UnderFinLeft = Tail1.addOrReplaceChild("UnderFinLeft", CubeListBuilder.create().texOffs(54, 39).mirror(true).addBox(0.0F, 0.5F, -1.0F, 1.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(1.6F, 4.5F, 4.0F, 0.5473352640780661F, 0.0F, -0.8600982340775168F));

            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 15).addBox(-2.0F, 0.5F, 0.0F, 4.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.5F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 6).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 5.0F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition TailFinTop = Tail3.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(36, 50).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 12.0F), PartPose.offsetAndRotation(0.0F, -0.7F, 4.2F, 0.6255260065779288F, 0.0F, 0.0F));
            PartDefinition TailFinLower2 = TailFinTop.addOrReplaceChild("TailFinLower2", CubeListBuilder.create().texOffs(58, 56).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.0F, -1.0F, 0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition TailFinLower = TailFinTop.addOrReplaceChild("TailFinLower", CubeListBuilder.create().texOffs(38, 37).addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.01F, -0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, 0.1F, 0.19547687289441354F, 0.0F, 0.0F));

            PartDefinition UnderFin1 = Tail3.addOrReplaceChild("UnderFin1", CubeListBuilder.create().texOffs(52, 53).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, 1.0F, 0.46914448828868976F, 0.0F, 0.0F));

            PartDefinition BackTailFin3 = Tail2.addOrReplaceChild("BackTailFin3", CubeListBuilder.create().texOffs(35, 53).addBox(-0.5F, -5.2F, -0.9F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.2F)), PartPose.offsetAndRotation(0.0F, 1.2F, 1.0F, -0.9773843811168246F, 0.0F, 0.0F));
            PartDefinition BackTailFin4 = BackTailFin3.addOrReplaceChild("BackTailFin4", CubeListBuilder.create().texOffs(41, 54).addBox(-0.5F, -4.6F, 0.55F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F, 0.0F, -0.05F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.5F, 0.6255260065779288F, 0.0F, 0.0F));

            PartDefinition UnderfinRight = Tail1.addOrReplaceChild("UnderfinRight", CubeListBuilder.create().texOffs(54, 39).addBox(-1.0F, 0.5F, -1.0F, 1.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(-1.6F, 4.5F, 4.0F, 0.5473352640780661F, 0.0F, 0.8600982340775168F));

            PartDefinition BackTailFin1 = Hips.addOrReplaceChild("BackTailFin1", CubeListBuilder.create().texOffs(28, 43).addBox(-0.5F, -6.0F, -1.2F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.8210028961170991F, 0.0F, 0.0F));
            PartDefinition BackTailFin2 = BackTailFin1.addOrReplaceChild("BackTailFin2", CubeListBuilder.create().texOffs(40, 39).addBox(-0.5F, -5.3F, -0.25F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.5F, 0.6255260065779288F, 0.0F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(18, 1).addBox(-3.5F, 0.0F, -3.5F, 7.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -4.5F, 0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition HeadConnection = Neck.addOrReplaceChild("HeadConnection", CubeListBuilder.create().texOffs(22, 10).addBox(-3.0F, -0.55F, -0.9F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F, -0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.4F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition Jaw1 = HeadConnection.addOrReplaceChild("Jaw1", CubeListBuilder.create().texOffs(23, 23).addBox(-2.5F, -2.5F, -2.7F, 5.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.9F, -0.5F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition Jaw2 = Jaw1.addOrReplaceChild("Jaw2", CubeListBuilder.create().texOffs(30, 30).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.3F, -0.15620696472454113F, 0.0F, 0.0F));

            PartDefinition Head = HeadConnection.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(21, 16).addBox(-3.0F, -0.5F, -2.4F, 6.0F, 3.0F, 2.0F), PartPose.offset(0.0F, 0.05F, -0.5F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(37, 11).addBox(-2.5F, -0.5F, -2.0F, 5.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.1F, 0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition WhiskerRight = Snout.addOrReplaceChild("WhiskerRight", CubeListBuilder.create().texOffs(40, 20).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F), PartPose.offsetAndRotation(-1.5F, 2.0F, -2.0F, 0.0F, 0.3127630032889644F, 0.4300491170387584F));

            PartDefinition WhiskerLeft = Snout.addOrReplaceChild("WhiskerLeft", CubeListBuilder.create().texOffs(40, 20).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F), PartPose.offsetAndRotation(1.5F, 2.0F, -2.0F, 0.0F, -0.3127630032889644F, -0.4300491170387584F));

            PartDefinition PectoralFinRight1 = Body.addOrReplaceChild("PectoralFinRight1", CubeListBuilder.create().texOffs(48, 0).mirror(true).addBox(-2.5F, -0.5F, -2.5F, 3.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-4.0F, 2.5F, -1.0F, 0.0F, -0.03909537541112055F, -0.6646214111173737F));
            PartDefinition PectoralFinRight3 = PectoralFinRight1.addOrReplaceChild("PectoralFinRight3", CubeListBuilder.create().texOffs(37, 0).addBox(-5.0F, -0.5F, -0.5F, 5.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-2.2F, 0.01F, -2.1F, 0.0F, 0.46914448828868976F, 0.0F));

            PartDefinition PectoralFinRight2 = PectoralFinRight1.addOrReplaceChild("PectoralFinRight2", CubeListBuilder.create().texOffs(52, 6).addBox(-3.0F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F), PartPose.offset(-2.5F, 0.0F, 2.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(NurseSharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
                float speed = 1.0F;
                float degree = 1.0F;
        }
    }

    public static class Child extends NurseSharkModel {
        public ModelPart Hips;
        public ModelPart PectoralFinLeft;
        public ModelPart DorsalFinFront;
        public ModelPart Head;
        public ModelPart PectoralFinRight;
        public ModelPart Tail;
        public ModelPart DorsalFinBack;
        public ModelPart UnderFinLeft;
        public ModelPart UnderFinRight;
        public ModelPart TailFinTop;
        public ModelPart UnderFin1;
        public ModelPart TailFinLower2;
        public ModelPart Snout;
        public ModelPart Mouth;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.DorsalFinFront = this.Body.getChild("DorsalFinFront");

            this.PectoralFinLeft = this.Body.getChild("PectoralFinLeft");

            this.PectoralFinRight = this.Body.getChild("PectoralFinRight");

            this.Hips = this.Body.getChild("Hips");
            this.UnderFinLeft = this.Hips.getChild("UnderFinLeft");

            this.Tail = this.Hips.getChild("Tail");
            this.TailFinTop = this.Tail.getChild("TailFinTop");
            this.TailFinLower2 = this.TailFinTop.getChild("TailFinLower2");

            this.UnderFin1 = this.Tail.getChild("UnderFin1");

            this.DorsalFinBack = this.Hips.getChild("DorsalFinBack");

            this.UnderFinRight = this.Hips.getChild("UnderFinRight");

            this.Head = this.Body.getChild("Head");
            this.Snout = this.Head.getChild("Snout");

            this.Mouth = this.Head.getChild("Mouth");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 3.0F, 4.0F), PartPose.offset(0.0F, 20.5F, -2.0F));
            PartDefinition DorsalFinFront = Body.addOrReplaceChild("DorsalFinFront", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5F, -2.5F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.547160727158125F, 0.0F, 0.0F));

            PartDefinition PectoralFinLeft = Body.addOrReplaceChild("PectoralFinLeft", CubeListBuilder.create().texOffs(22, 12).addBox(-0.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.5F, 0.5F, -0.5F, 0.0F, -0.4300491170387584F, 0.6646214111173737F));

            PartDefinition PectoralFinRight = Body.addOrReplaceChild("PectoralFinRight", CubeListBuilder.create().texOffs(22, 12).mirror(true).addBox(-2.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, 0.5F, -0.5F, 0.0F, 0.4300491170387584F, -0.6646214111173737F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 1.9F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition UnderFinLeft = Hips.addOrReplaceChild("UnderFinLeft", CubeListBuilder.create().texOffs(27, 8).addBox(0.0F, 0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.8F, 2.8F, 0.5473352640780661F, 0.0F, -0.8600982340775168F));

            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.7F, -0.07836527941980377F, 0.0F, 0.0F));
            PartDefinition TailFinTop = Tail.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 2.9F, 0.6255260065779288F, 0.0F, 0.0F));
            PartDefinition TailFinLower2 = TailFinTop.addOrReplaceChild("TailFinLower2", CubeListBuilder.create().texOffs(22, 8).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.9F, -1.0F, 0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition UnderFin1 = Tail.addOrReplaceChild("UnderFin1", CubeListBuilder.create().texOffs(22, 8).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.6F, 1.0F, 0.46914448828868976F, 0.0F, 0.0F));

            PartDefinition DorsalFinBack = Hips.addOrReplaceChild("DorsalFinBack", CubeListBuilder.create().texOffs(16, 0).addBox(-0.5F, -1.4F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3127630032889644F, 0.0F, 0.0F));

            PartDefinition UnderFinRight = Hips.addOrReplaceChild("UnderFinRight", CubeListBuilder.create().texOffs(27, 8).mirror(true).addBox(-1.0F, 0.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.8F, 2.8F, 0.5473352640780661F, 0.0F, 0.8600982340775168F));

            PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -2.8F, 0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(11, 19).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -0.8F, 0.4300491170387584F, 0.0F, 0.0F));

            PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, 0.0F, -1.8F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, -0.23457224414434488F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(NurseSharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            float speed = 1.0F;
            float degree = 1.0F;
        }
    }
}
