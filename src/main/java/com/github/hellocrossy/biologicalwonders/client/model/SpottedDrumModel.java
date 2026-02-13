package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.SpottedDrumEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class SpottedDrumModel extends ZawaBaseAmbientModel<SpottedDrumEntity> {
    public ModelPart MainBody;
    public ModelPart Head;
    public ModelPart PelvicFinRight;
    public ModelPart PelvicFinLeft;
    public ModelPart PectoralFinLeft;
    public ModelPart PectoralFinRight;
    public ModelPart AnalFin;
    public ModelPart DorsalFin4;
    public ModelPart DorsalFin1;
    public ModelPart TailBase;
    public ModelPart LowerHead;
    public ModelPart Mouth;
    public ModelPart DorsalFin2;
    public ModelPart DorsalFin3;
    public ModelPart Tail1;
    public ModelPart UpperTail;
    public ModelPart LowerTail;
    public ModelPart Tail2;
    public ModelPart TailFinTop;
    public ModelPart TailFinBottom;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.MainBody);
        }

        return this.parts;
    }

    public SpottedDrumModel(ModelPart root) {
        this.MainBody = root.getChild("MainBody");
        this.PectoralFinRight = this.MainBody.getChild("PectoralFinRight");

        this.AnalFin = this.MainBody.getChild("AnalFin");

        this.PectoralFinLeft = this.MainBody.getChild("PectoralFinLeft");

        this.TailBase = this.MainBody.getChild("TailBase");
        this.Tail1 = this.TailBase.getChild("Tail1");
        this.UpperTail = this.Tail1.getChild("UpperTail");

        this.LowerTail = this.Tail1.getChild("LowerTail");

        this.Tail2 = this.Tail1.getChild("Tail2");
        this.TailFinTop = this.Tail2.getChild("TailFinTop");

        this.TailFinBottom = this.Tail2.getChild("TailFinBottom");

        this.DorsalFin1 = this.MainBody.getChild("DorsalFin1");
        this.DorsalFin2 = this.DorsalFin1.getChild("DorsalFin2");
        this.DorsalFin3 = this.DorsalFin2.getChild("DorsalFin3");

        this.DorsalFin4 = this.MainBody.getChild("DorsalFin4");

        this.PelvicFinRight = this.MainBody.getChild("PelvicFinRight");

        this.PelvicFinLeft = this.MainBody.getChild("PelvicFinLeft");

        this.Head = this.MainBody.getChild("Head");
        this.LowerHead = this.Head.getChild("LowerHead");
        this.Mouth = this.LowerHead.getChild("Mouth");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition MainBody = partDefinition.addOrReplaceChild("MainBody", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.5F, -3.0F, 3.0F, 5.0F, 7.0F), PartPose.offset(0.0F, 19.3F, -1.8F));
        PartDefinition PectoralFinRight = MainBody.addOrReplaceChild("PectoralFinRight", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.5F, 0.4F, -1.7F, 0.0F, -0.20629791225940755F, 0.0F));

        PartDefinition AnalFin = MainBody.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(22, 21).addBox(0.0F, -1.0F, -1.5F, 0.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.5F, 2.8F, 0.5864306020384839F, 0.0F, 0.0F));

        PartDefinition PectoralFinLeft = MainBody.addOrReplaceChild("PectoralFinLeft", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.5F, 0.4F, -1.7F, 0.0F, 0.20629791225940755F, 0.0F));

        PartDefinition TailBase = MainBody.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(6, 17).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F, 0.01F, 0.01F)), PartPose.offset(0.0F, 0.0F, 3.4F));
        PartDefinition Tail1 = TailBase.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(20, 7).addBox(-1.0F, -1.5F, -0.8F, 2.0F, 3.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 2.7F));
        PartDefinition UpperTail = Tail1.addOrReplaceChild("UpperTail", CubeListBuilder.create().texOffs(18, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.2F, 0.0F, -0.17767452317934493F, 0.0F, 0.0F));

        PartDefinition LowerTail = Tail1.addOrReplaceChild("LowerTail", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.2F, 0.0F, 0.17767452317934493F, 0.0F, 0.0F));

        PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(22, 21).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 1.1F));
        PartDefinition TailFinTop = Tail2.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 0.6F, 0.20943951023931953F, 0.0F, 0.0F));

        PartDefinition TailFinBottom = Tail2.addOrReplaceChild("TailFinBottom", CubeListBuilder.create().texOffs(22, 8).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 0.7F, -0.24260075936930908F, 0.0F, 0.0F));

        PartDefinition DorsalFin1 = MainBody.addOrReplaceChild("DorsalFin1", CubeListBuilder.create().texOffs(14, 20).addBox(-1.0F, -3.0F, -1.1F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.01F, 0.01F, 0.01F)), PartPose.offsetAndRotation(0.0F, -2.1F, -1.8F, -0.26668630504420165F, 0.0F, 0.0F));
        PartDefinition DorsalFin2 = DorsalFin1.addOrReplaceChild("DorsalFin2", CubeListBuilder.create().texOffs(22, 17).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F, 0.01F, 0.01F)), PartPose.offsetAndRotation(0.0F, -2.6F, -0.3F, -0.23457224414434488F, 0.0F, 0.0F));
        PartDefinition DorsalFin3 = DorsalFin2.addOrReplaceChild("DorsalFin3", CubeListBuilder.create().texOffs(12, 22).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.01F, 0.01F, 0.01F)), PartPose.offsetAndRotation(0.0F, -2.6F, 0.0F, -0.1563815016444822F, 0.0F, 0.0F));

        PartDefinition DorsalFin4 = MainBody.addOrReplaceChild("DorsalFin4", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -2.3F, -4.4F, 0.0F, 4.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 3.3F, 0.0F, 0.0F, 0.001745329278001762F));

        PartDefinition PelvicFinRight = MainBody.addOrReplaceChild("PelvicFinRight", CubeListBuilder.create().texOffs(7, 23).addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.3F, 2.1F, -1.1F, 0.23457224414434488F, 0.0F, 0.46914448828868976F));

        PartDefinition PelvicFinLeft = MainBody.addOrReplaceChild("PelvicFinLeft", CubeListBuilder.create().texOffs(7, 23).addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.3F, 2.1F, -1.1F, 0.23457224414434488F, 0.0F, -0.46914448828868976F));

        PartDefinition Head = MainBody.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(13, 0).addBox(-1.0F, -2.0F, -1.1F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.01F, 0.01F, 0.01F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.0F, -1.0953686092568693F, 0.0F, 0.0F));
        PartDefinition LowerHead = Head.addOrReplaceChild("LowerHead", CubeListBuilder.create().texOffs(13, 13).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.4F, 1.2F, -2.230007126683611F, 0.0F, 0.0F));
        PartDefinition Mouth = LowerHead.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.9F, 1.5F, -0.1350884801096195F, 0.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 32, 32);
    }

    @Override
    public void setupAnim(SpottedDrumEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
