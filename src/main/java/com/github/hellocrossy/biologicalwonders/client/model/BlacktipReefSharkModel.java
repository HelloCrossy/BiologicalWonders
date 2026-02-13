package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.BlacktipReefSharkEntity;
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
        public ModelPart TailFinTop2;
        public ModelPart TailFinTop3;
        public ModelPart BackFin3;
        public ModelPart LeftPectoralFin2;
        public ModelPart LeftPectoralFin3;
        public ModelPart RightPectoralFin2;
        public ModelPart RightPectoralFin3;
        public ModelPart Mouth1;
        public ModelPart Head;
        public ModelPart Mouth2;
        public ModelPart Nose;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Tail1 = this.Body.getChild("Tail1");
            this.UnderFin3 = this.Tail1.getChild("UnderFin3");

            this.Tail2 = this.Tail1.getChild("Tail2");
            this.UnderFin1 = this.Tail2.getChild("UnderFin1");

            this.BackFin5 = this.Tail2.getChild("BackFin5");

            this.Tail3 = this.Tail2.getChild("Tail3");
            this.TailFinTop1 = this.Tail3.getChild("TailFinTop1");
            this.TailFinTop3 = this.TailFinTop1.getChild("TailFinTop3");

            this.TailFinTop2 = this.TailFinTop1.getChild("TailFinTop2");

            this.UnderFin2 = this.Tail1.getChild("UnderFin2");

            this.RightPectoralFin1 = this.Body.getChild("RightPectoralFin1");
            this.RightPectoralFin3 = this.RightPectoralFin1.getChild("RightPectoralFin3");

            this.RightPectoralFin2 = this.RightPectoralFin1.getChild("RightPectoralFin2");

            this.LeftPectoralFin1 = this.Body.getChild("LeftPectoralFin1");
            this.LeftPectoralFin3 = this.LeftPectoralFin1.getChild("LeftPectoralFin3");

            this.LeftPectoralFin2 = this.LeftPectoralFin1.getChild("LeftPectoralFin2");

            this.BackFin1 = this.Body.getChild("BackFin1");
            this.BackFin3 = this.BackFin1.getChild("BackFin3");

            this.Neck = this.Body.getChild("Neck");
            this.Mouth1 = this.Neck.getChild("Mouth1");
            this.Mouth2 = this.Mouth1.getChild("Mouth2");

            this.Head = this.Neck.getChild("Head");
            this.Nose = this.Head.getChild("Nose");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -3.0F, -5.5F, 8.0F, 6.0F, 11.0F), PartPose.offset(0.0F, 21.0F, 0.0F));
            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(38, 0).addBox(-3.5F, -3.0F, 0.0F, 7.0F, 6.0F, 12.0F), PartPose.offset(0.5F, 0.3F, -2.4F));
            PartDefinition UnderFin3 = Tail1.addOrReplaceChild("UnderFin3", CubeListBuilder.create().texOffs(76, 0).addBox(-0.5F, -0.0F, 0.0F, 1.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(-2.3F, 1.2F, 8.0F, -0.500909508638178F, -0.591841146688116F, 0.0F));

            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(64, 13).addBox(-3.0F, -2.5F, 0.0F, 6.0F, 5.0F, 12.0F), PartPose.offset(0.0F, 0.0F, 4.6F));
            PartDefinition UnderFin1 = Tail2.addOrReplaceChild("UnderFin1", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 9.4F, 0.591841146688116F, 0.0F, 0.0F));

            PartDefinition BackFin5 = Tail2.addOrReplaceChild("BackFin5", CubeListBuilder.create().texOffs(64, 0).addBox(-1.0F, -7.1F, 0.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 6.6F, -0.6829473549475088F, 0.0F, 0.0F));

            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(88, 13).addBox(-2.5F, -2.0F, 0.0F, 5.0F, 4.0F, 6.0F), PartPose.offset(0.0F, 0.0F, 10.2F));
            PartDefinition TailFinTop1 = Tail3.addOrReplaceChild("TailFinTop1", CubeListBuilder.create().texOffs(112, 0).addBox(-1.0F, -5.9F, 0.0F, 2.0F, 8.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.7F, 5.5F, -0.8651597048872669F, 0.0F, 0.0F));
            PartDefinition TailFinTop3 = TailFinTop1.addOrReplaceChild("TailFinTop3", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -1.0F, -4.0F, 2.0F, 7.0F, 3.0F), PartPose.offsetAndRotation(-0.5F, 0.5F, 1.9F, 1.5481069932557485F, 0.0F, 0.0F));

            PartDefinition TailFinTop2 = TailFinTop1.addOrReplaceChild("TailFinTop2", CubeListBuilder.create().texOffs(119, 10).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 8.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.6F, 1.2F, 0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition UnderFin2 = Tail1.addOrReplaceChild("UnderFin2", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, -0.0F, 0.0F, 1.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(2.3F, 1.2F, 8.0F, -0.500909508638178F, 0.591841146688116F, 0.0F));

            PartDefinition RightPectoralFin1 = Body.addOrReplaceChild("RightPectoralFin1", CubeListBuilder.create().texOffs(64, 0).addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 8.0F), PartPose.offsetAndRotation(-2.5F, 1.5F, -4.8F, 0.18203784630933073F, 1.1838568635856868F, 2.458645232063257F));
            PartDefinition RightPectoralFin3 = RightPectoralFin1.addOrReplaceChild("RightPectoralFin3", CubeListBuilder.create().texOffs(37, 19).addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(-1.31F, 0.01F, 2.0F, 0.0F, 0.3431317282789241F, 0.0F));

            PartDefinition RightPectoralFin2 = RightPectoralFin1.addOrReplaceChild("RightPectoralFin2", CubeListBuilder.create().texOffs(32, 19).addBox(-2.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offset(-1.01F, 0.01F, 1.4F));

            PartDefinition LeftPectoralFin1 = Body.addOrReplaceChild("LeftPectoralFin1", CubeListBuilder.create().texOffs(27, 0).addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 8.0F), PartPose.offsetAndRotation(3.4F, 1.6F, -4.8F, 0.0911061832922575F, 1.1838568635856868F, 0.956091342937205F));
            PartDefinition LeftPectoralFin3 = LeftPectoralFin1.addOrReplaceChild("LeftPectoralFin3", CubeListBuilder.create().texOffs(21, 18).addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(-1.31F, -0.02F, 2.0F, 0.0F, 0.3431317282789241F, 0.0F));

            PartDefinition LeftPectoralFin2 = LeftPectoralFin1.addOrReplaceChild("LeftPectoralFin2", CubeListBuilder.create().texOffs(16, 18).addBox(-2.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offset(-1.01F, -0.01F, 1.4F));

            PartDefinition BackFin1 = Body.addOrReplaceChild("BackFin1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -7.1F, 0.0F, 2.0F, 7.0F, 3.0F), PartPose.offsetAndRotation(0.5F, -2.2F, -2.4F, -0.591841146688116F, 0.0F, 0.0F));
            PartDefinition BackFin3 = BackFin1.addOrReplaceChild("BackFin3", CubeListBuilder.create().texOffs(110, 13).addBox(-0.5F, -7.0F, -4.0F, 1.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.8F, 6.4F, 0.3642502295386026F, 0.0F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(84, 0).addBox(-3.5F, -3.5F, -7.0F, 7.0F, 6.0F, 7.0F), PartPose.offset(0.5F, 0.4F, -1.9F));
            PartDefinition Mouth1 = Neck.addOrReplaceChild("Mouth1", CubeListBuilder.create().texOffs(105, 23).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.01F, -0.21F, -5.0F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition Mouth2 = Mouth1.addOrReplaceChild("Mouth2", CubeListBuilder.create().texOffs(49, 19).addBox(-2.5F, -0.5F, -4.0F, 4.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.5F, 0.4F, -3.3F, -0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(15, 26).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -3.2F, -6.0F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Nose = Head.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(37, 27).addBox(-2.5F, 0.0F, -4.0F, 5.0F, 3.0F, 5.0F), PartPose.offset(0.0F, 0.3F, -3.9F));

            return LayerDefinition.create(meshDefinition, 128, 44);
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
