package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.NapoleonWrasseEntity;
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

public abstract class NapoleonWrasseModel extends ZawaBaseModel<NapoleonWrasseEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends NapoleonWrasseModel {
        public ModelPart Tail;
        public ModelPart BackFin;
        public ModelPart PectorialFinLeft;
        public ModelPart PectorialFinRight;
        public ModelPart UnderFinLeft;
        public ModelPart UnderFinRight;
        public ModelPart Head;
        public ModelPart TailFinTop;
        public ModelPart AnalFin;
        public ModelPart TailFinBottom;
        public ModelPart Hump;
        public ModelPart Mouth;
        public ModelPart Jaw;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.UnderFinRight = this.Body.getChild("UnderFinRight");

            this.Head = this.Body.getChild("Head");
            this.Jaw = this.Head.getChild("Jaw");

            this.Mouth = this.Head.getChild("Mouth");

            this.Hump = this.Head.getChild("Hump");

            this.PectorialFinLeft = this.Body.getChild("PectorialFinLeft");

            this.Tail = this.Body.getChild("Tail");
            this.AnalFin = this.Tail.getChild("AnalFin");

            this.TailFinTop = this.Tail.getChild("TailFinTop");
            this.TailFinBottom = this.TailFinTop.getChild("TailFinBottom");

            this.PectorialFinRight = this.Body.getChild("PectorialFinRight");

            this.BackFin = this.Body.getChild("BackFin");

            this.UnderFinLeft = this.Body.getChild("UnderFinLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -4.5F, -5.0F, 4.0F, 9.0F, 12.0F), PartPose.offset(0.0F, 17.0F, 0.0F));
            PartDefinition UnderFinRight = Body.addOrReplaceChild("UnderFinRight", CubeListBuilder.create().texOffs(21, 20).mirror(true).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.4F, 3.9F, -3.5F, 0.500909508638178F, -0.18203784630933073F, 0.0911061832922575F));

            PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(36, 0).addBox(-1.5F, -4.0F, -2.7F, 3.0F, 8.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.3F, -4.5F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.0F, -1.9F, -0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.3F, -1.8F, -0.500909508638178F, 0.0F, 0.0F));

            PartDefinition Hump = Head.addOrReplaceChild("Hump", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.7F, -1.0F, 2.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -3.4F, -2.2F, 0.18203784630933073F, 0.0F, 0.0F));

            PartDefinition PectorialFinLeft = Body.addOrReplaceChild("PectorialFinLeft", CubeListBuilder.create().texOffs(19, 28).addBox(-0.5F, -1.0F, 0.0F, 5.0F, 3.0F, 0.0F), PartPose.offsetAndRotation(1.3F, 1.0F, -3.5F, -0.0911061832922575F, -0.7740534966278743F, -0.27314402127920984F));

            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 5.0F, 5.0F), PartPose.offset(0.0F, 0.0F, 6.5F));
            PartDefinition AnalFin = Tail.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -1.5F, -0.5F, 0.0F, 4.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 2.3F, -2.6F, -0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition TailFinTop = Tail.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(32, 16).addBox(0.0F, -1.0F, -1.0F, 0.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -0.9F, 4.4F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition TailFinBottom = TailFinTop.addOrReplaceChild("TailFinBottom", CubeListBuilder.create().texOffs(32, 21).addBox(0.0F, 0.5F, -0.5F, 0.0F, 3.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, -0.3642502295386026F, 0.0F, 0.0F));

            PartDefinition PectorialFinRight = Body.addOrReplaceChild("PectorialFinRight", CubeListBuilder.create().texOffs(19, 28).mirror(true).addBox(-4.5F, -1.0F, 0.0F, 5.0F, 3.0F, 0.0F), PartPose.offsetAndRotation(-1.3F, 1.0F, -3.5F, -0.0911061832922575F, 0.7740534966278743F, 0.27314402127920984F));

            PartDefinition BackFin = Body.addOrReplaceChild("BackFin", CubeListBuilder.create().texOffs(36, 3).addBox(0.0F, -1.5F, -2.8F, 0.0F, 4.0F, 12.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 3.3F, 0.04555309164612875F, 0.0F, 0.0F));

            PartDefinition UnderFinLeft = Body.addOrReplaceChild("UnderFinLeft", CubeListBuilder.create().texOffs(21, 20).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.4F, 3.9F, -3.5F, 0.500909508638178F, 0.18203784630933073F, -0.0911061832922575F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(NapoleonWrasseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.25F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.25F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 2.0F;
            this.Head.yRot = Mth.cos((limbSwing * speed * 0.2F)) * (degree * 0.2F) * limbSwingAmount;
            //  this.Hips.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -0.4F) * limbSwingAmount;
            this.PectorialFinLeft.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount - 0.7F;
            this.PectorialFinRight.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -2.0F) * limbSwingAmount + 0.77F;
            this.Mouth.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.3F) * limbSwingAmount + -0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 1.0F;
                float degree = 2.0F;
                this.Head.yRot = Mth.cos((limbSwing * speed * 0.5F)) * (degree * 0.8F) * limbSwingAmount;
                //this.Hips.yRot = Mth.cos(1.0F + (limbSwing * speed * 1F)) * (degree * -0.9F) * limbSwingAmount;
                this.PectorialFinLeft.yRot = Mth.cos(1.0F + (limbSwing * speed * 1F)) * (degree * 1.0F) * limbSwingAmount - 0.77F;
                this.PectorialFinRight.yRot = Mth.cos(1.0F + (limbSwing * speed * 1F)) * (degree * -1.0F) * limbSwingAmount + 0.77F;
                this.Tail.yRot = Mth.cos(4.0F + (limbSwing * speed * 1F)) * (degree * 1.0F) * limbSwingAmount;
            }
        }
    }

    public static class Child extends NapoleonWrasseModel {
        public ModelPart Head;
        public ModelPart Tail;
        public ModelPart DorsalFin;
        public ModelPart AnalFin;
        public ModelPart PelvicFinLeft;
        public ModelPart PelvicFinRight;
        public ModelPart PectoralFinLeft;
        public ModelPart PectoralFinRight;
        public ModelPart Hump;
        public ModelPart Mouth;
        public ModelPart Jaw;
        public ModelPart TailFinTop;
        public ModelPart TailFinBottom;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Head = this.Body.getChild("Head");
            this.Mouth = this.Head.getChild("Mouth");
            this.Jaw = this.Mouth.getChild("Jaw");

            this.Hump = this.Head.getChild("Hump");

            this.AnalFin = this.Body.getChild("AnalFin");

            this.PelvicFinRight = this.Body.getChild("PelvicFinRight");

            this.Tail = this.Body.getChild("Tail");
            this.TailFinBottom = this.Tail.getChild("TailFinBottom");

            this.TailFinTop = this.Tail.getChild("TailFinTop");

            this.PectoralFinLeft = this.Body.getChild("PectoralFinLeft");

            this.PectoralFinRight = this.Body.getChild("PectoralFinRight");

            this.DorsalFin = this.Body.getChild("DorsalFin");

            this.PelvicFinLeft = this.Body.getChild("PelvicFinLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 7.0F), PartPose.offset(0.0F, 19.8F, -0.8F));
            PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 15).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -1.8F, 0.05410520514734854F, 0.0F, 0.0F));
            PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(8, 19).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.6F, -1.0F, -0.5347688721584182F, 0.0F, 0.0F));
            PartDefinition Jaw = Mouth.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.1F, 0.1F, 0.417133684568742F, 0.0F, 0.0F));

            PartDefinition Hump = Head.addOrReplaceChild("Hump", CubeListBuilder.create().texOffs(20, 10).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -0.2F, 0.27366763203903305F, 0.0F, 0.0F));

            PartDefinition AnalFin = Body.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(15, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 3.9F, -0.7819074915776542F, 0.0F, 0.0F));

            PartDefinition PelvicFinRight = Body.addOrReplaceChild("PelvicFinRight", CubeListBuilder.create().texOffs(4, 21).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, 1.7F, -1.9F, 0.19547687289441354F, -0.1563815016444822F, 0.23457224414434488F));

            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(11, 12).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offset(0.0F, 0.0F, 3.7F));
            PartDefinition TailFinBottom = Tail.addOrReplaceChild("TailFinBottom", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.6F, 2.6F, -0.27366763203903305F, 0.0F, 0.0F));

            PartDefinition TailFinTop = Tail.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(16, 16).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, -0.7F, 2.55F, 0.27366763203903305F, 0.0F, 0.0F));

            PartDefinition PectoralFinLeft = Body.addOrReplaceChild("PectoralFinLeft", CubeListBuilder.create().texOffs(16, 19).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.9F, -0.4F, -1.0F, 0.0F, 0.35185837453889574F, 0.0F));

            PartDefinition PectoralFinRight = Body.addOrReplaceChild("PectoralFinRight", CubeListBuilder.create().texOffs(16, 19).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.9F, -0.4F, -1.0F, 0.0F, -0.35185837453889574F, 0.0F));

            PartDefinition DorsalFin = Body.addOrReplaceChild("DorsalFin", CubeListBuilder.create().texOffs(0, 5).addBox(0.0F, -3.0F, -3.5F, 0.0F, 3.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition PelvicFinLeft = Body.addOrReplaceChild("PelvicFinLeft", CubeListBuilder.create().texOffs(4, 21).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.3F, 2.1F, -1.9F, 0.19547687289441354F, 0.1563815016444822F, -0.23457224414434488F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(NapoleonWrasseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
