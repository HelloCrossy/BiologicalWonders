package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.ButterflyfishEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class ButterflyfishModel extends ZawaBaseAmbientModel<ButterflyfishEntity> {
    public ModelPart Body;
    public ModelPart Head;
    public ModelPart Tail;
    public ModelPart PelvicFinRight;
    public ModelPart PelvicFinLeft;
    public ModelPart PectoralFinLeft;
    public ModelPart PectoralFinRight;
    public ModelPart AnalFin;
    public ModelPart DorsalFin;
    public ModelPart LowerMouth;
    public ModelPart UpperMouth;
    public ModelPart TailTop;
    public ModelPart TailBottom;
    public ModelPart Tail2;
    public ModelPart TailFinTop;
    public ModelPart TailFinBottom;

    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public ButterflyfishModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.PectoralFinLeft = this.Body.getChild("PectoralFinLeft");

        this.AnalFin = this.Body.getChild("AnalFin");

        this.Tail = this.Body.getChild("Tail");
        this.Tail2 = this.Tail.getChild("Tail2");
        this.TailFinTop = this.Tail2.getChild("TailFinTop");

        this.TailFinBottom = this.Tail2.getChild("TailFinBottom");

        this.TailTop = this.Tail.getChild("TailTop");

        this.TailBottom = this.Tail.getChild("TailBottom");

        this.PelvicFinRight = this.Body.getChild("PelvicFinRight");

        this.PectoralFinRight = this.Body.getChild("PectoralFinRight");

        this.Head = this.Body.getChild("Head");
        this.LowerMouth = this.Head.getChild("LowerMouth");

        this.UpperMouth = this.Head.getChild("UpperMouth");

        this.PelvicFinLeft = this.Body.getChild("PelvicFinLeft");

        this.DorsalFin = this.Body.getChild("DorsalFin");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -3.8F, -3.0F, 3.0F, 6.0F, 6.0F), PartPose.offset(0.0F, 21.7F, -0.4F));
        PartDefinition PectoralFinLeft = Body.addOrReplaceChild("PectoralFinLeft", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.5F, 0.4F, -1.7F, 0.0F, 0.20629791225940755F, 0.0F));

        PartDefinition AnalFin = Body.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(0, 11).addBox(0.0F, -2.0F, -3.3F, 0.0F, 4.0F, 5.0F), PartPose.offset(0.0F, 2.1F, 2.9F));

        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(18, 5).addBox(-1.0F, -1.5F, -0.8F, 2.0F, 3.0F, 2.0F), PartPose.offset(0.0F, -0.8F, 3.0F));
        PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 1.1F));
        PartDefinition TailFinTop = Tail2.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(15, 17).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, -0.2F, 0.25F, 0.3281218860591285F, 0.0F, 0.0F));

        PartDefinition TailFinBottom = Tail2.addOrReplaceChild("TailFinBottom", CubeListBuilder.create().texOffs(15, 17).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.28F, -0.3281218860591285F, 0.0F, 0.0F));

        PartDefinition TailTop = Tail.addOrReplaceChild("TailTop", CubeListBuilder.create().texOffs(18, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, -0.6258750804178109F, 0.0F, 0.0F));

        PartDefinition TailBottom = Tail.addOrReplaceChild("TailBottom", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 0.6258750804178109F, 0.0F, 0.0F));

        PartDefinition PelvicFinRight = Body.addOrReplaceChild("PelvicFinRight", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, 1.7F, -1.9F, 0.23457224414434488F, 0.0F, 0.27366763203903305F));

        PartDefinition PectoralFinRight = Body.addOrReplaceChild("PectoralFinRight", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.5F, 0.4F, -1.7F, 0.0F, -0.20629791225940755F, 0.0F));

        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(12, 12).addBox(-1.0F, -2.5F, -1.1F, 2.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.1F, -3.2F, -0.5480333784683167F, 0.0F, 0.0F));
        PartDefinition LowerMouth = Head.addOrReplaceChild("LowerMouth", CubeListBuilder.create().texOffs(16, 20).addBox(-0.5F, 0.0F, -3.2F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 2.3F, -0.2F, 0.38571777134864954F, 0.0F, 0.0F));

        PartDefinition UpperMouth = Head.addOrReplaceChild("UpperMouth", CubeListBuilder.create().texOffs(5, 21).addBox(-0.5F, -0.5F, -2.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F, -0.02F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.2F, -0.87F, 0.6269222353584302F, 0.0F, 0.0F));

        PartDefinition PelvicFinLeft = Body.addOrReplaceChild("PelvicFinLeft", CubeListBuilder.create().texOffs(19, 8).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.3F, 1.7F, -1.9F, 0.23457224414434488F, 0.0F, -0.27366763203903305F));

        PartDefinition DorsalFin = Body.addOrReplaceChild("DorsalFin", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, -2.0F, -4.4F, 0.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -3.8F, 3.0F, 0.0F, 0.0F, 0.001745329278001762F));

        return LayerDefinition.create(meshDefinition, 32, 32);
    }

    @Override
    public void setupAnim(ButterflyfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
