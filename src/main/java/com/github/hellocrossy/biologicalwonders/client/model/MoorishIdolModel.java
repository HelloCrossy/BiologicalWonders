package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.MoorishIdolEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class MoorishIdolModel extends ZawaBaseAmbientModel<MoorishIdolEntity> {
    public ModelPart MainBody;
    public ModelPart Head;
    public ModelPart RightPelvicFin;
    public ModelPart LeftPelvicFin;
    public ModelPart LeftPectoralFin;
    public ModelPart RightPectoralFin;
    public ModelPart AnalFin;
    public ModelPart DorsalFin4;
    public ModelPart DorsalFin1;
    public ModelPart TailBase;
    public ModelPart UpperMouth;
    public ModelPart LowerMouth;
    public ModelPart Head_1;
    public ModelPart DorsalFin2;
    public ModelPart DorsalFin3;
    public ModelPart DorsalFin4_1;
    public ModelPart Tail;
    public ModelPart TailTop;
    public ModelPart TailBottom;
    public ModelPart Tail2;
    public ModelPart UpperTailFin;
    public ModelPart LowerTailFin;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.MainBody);
        }

        return this.parts;
    }

    public MoorishIdolModel(ModelPart root) {
        this.MainBody = root.getChild("MainBody");
        this.AnalFin = this.MainBody.getChild("AnalFin");

        this.DorsalFin1 = this.MainBody.getChild("DorsalFin1");
        this.DorsalFin2 = this.DorsalFin1.getChild("DorsalFin2");
        this.DorsalFin3 = this.DorsalFin2.getChild("DorsalFin3");
        this.DorsalFin4_1 = this.DorsalFin3.getChild("DorsalFin4_1");

        this.Head = this.MainBody.getChild("Head");
        this.Head_1 = this.Head.getChild("Head_1");

        this.UpperMouth = this.Head.getChild("UpperMouth");

        this.LowerMouth = this.Head.getChild("LowerMouth");

        this.LeftPelvicFin = this.MainBody.getChild("LeftPelvicFin");

        this.RightPectoralFin = this.MainBody.getChild("RightPectoralFin");

        this.RightPelvicFin = this.MainBody.getChild("RightPelvicFin");

        this.DorsalFin4 = this.MainBody.getChild("DorsalFin4");

        this.TailBase = this.MainBody.getChild("TailBase");
        this.Tail = this.TailBase.getChild("Tail");
        this.TailBottom = this.Tail.getChild("TailBottom");

        this.Tail2 = this.Tail.getChild("Tail2");
        this.LowerTailFin = this.Tail2.getChild("LowerTailFin");

        this.UpperTailFin = this.Tail2.getChild("UpperTailFin");

        this.TailTop = this.Tail.getChild("TailTop");

        this.LeftPectoralFin = this.MainBody.getChild("LeftPectoralFin");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition MainBody = partDefinition.addOrReplaceChild("MainBody", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -3.5F, -3.0F, 3.0F, 7.0F, 7.0F), PartPose.offset(0.0F, 0.0F, -0.4F));
        PartDefinition AnalFin = MainBody.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(17, 19).addBox(0.0F, -2.0F, -3.3F, 0.0F, 6.0F, 7.0F), PartPose.offset(0.0F, 3.4F, 2.8F));

        PartDefinition DorsalFin1 = MainBody.addOrReplaceChild("DorsalFin1", CubeListBuilder.create().texOffs(22, 20).addBox(-1.0F, -3.0F, -1.1F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.01F, 0.01F, 0.01F)), PartPose.offsetAndRotation(0.0F, -2.8F, -1.9F, -0.6185446629383405F, 0.0F, 0.0F));
        PartDefinition DorsalFin2 = DorsalFin1.addOrReplaceChild("DorsalFin2", CubeListBuilder.create().texOffs(13, 25).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F, 0.01F, 0.01F)), PartPose.offsetAndRotation(0.0F, -2.6F, -0.3F, -0.23457224414434488F, 0.0F, 0.0F));
        PartDefinition DorsalFin3 = DorsalFin2.addOrReplaceChild("DorsalFin3", CubeListBuilder.create().texOffs(14, 13).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.01F, 0.01F, 0.01F)), PartPose.offsetAndRotation(0.0F, -2.6F, 0.0F, -0.1563815016444822F, 0.0F, 0.0F));
        PartDefinition DorsalFin4_1 = DorsalFin3.addOrReplaceChild("DorsalFin4_1", CubeListBuilder.create().texOffs(14, 12).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.01F, 0.01F, 0.01F)), PartPose.offsetAndRotation(0.0F, -2.7F, -0.05F, -0.23457224414434488F, 0.0F, 0.0F));

        PartDefinition Head = MainBody.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(14, 14).addBox(-1.0F, -2.5F, -1.1F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.01F, 0.01F, 0.01F)), PartPose.offsetAndRotation(0.0F, -0.7F, -2.8F, -0.35255652221866F, 0.0F, 0.0F));
        PartDefinition Head_1 = Head.addOrReplaceChild("Head_1", CubeListBuilder.create().texOffs(21, 0).addBox(-1.0F, -2.5F, -1.1F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.4F, -0.4F, -0.5480333784683167F, 0.0F, 0.0F));

        PartDefinition UpperMouth = Head.addOrReplaceChild("UpperMouth", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.2F, -0.3F, 0.4639085138485122F, 0.0F, 0.0F));

        PartDefinition LowerMouth = Head.addOrReplaceChild("LowerMouth", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F, -0.02F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.8F, 0.33F, 0.11868239246456576F, 0.0F, 0.0F));

        PartDefinition LeftPelvicFin = MainBody.addOrReplaceChild("LeftPelvicFin", CubeListBuilder.create().texOffs(10, 27).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.3F, 2.6F, -1.5F, 0.23457224414434488F, 0.0F, -0.27366763203903305F));

        PartDefinition RightPectoralFin = MainBody.addOrReplaceChild("RightPectoralFin", CubeListBuilder.create().texOffs(0, 2).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.5F, 0.4F, -1.7F, 0.0F, -0.20629791225940755F, 0.0F));

        PartDefinition RightPelvicFin = MainBody.addOrReplaceChild("RightPelvicFin", CubeListBuilder.create().texOffs(10, 27).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, 2.6F, -1.5F, 0.23457224414434488F, 0.0F, 0.27366763203903305F));

        PartDefinition DorsalFin4 = MainBody.addOrReplaceChild("DorsalFin4", CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -3.4F, -4.4F, 0.0F, 6.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -3.3F, 4.0F, 0.0F, 0.0F, 0.001745329278001762F));

        PartDefinition TailBase = MainBody.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(20, 5).addBox(-1.0F, -2.5F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F, 0.01F, 0.01F)), PartPose.offset(0.0F, 0.0F, 3.4F));
        PartDefinition Tail = TailBase.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(21, 12).addBox(-1.0F, -1.5F, -0.8F, 2.0F, 3.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 2.7F));
        PartDefinition TailBottom = Tail.addOrReplaceChild("TailBottom", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 0.3665191429188092F, 0.0F, 0.0F));

        PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(24, 17).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 1.1F));
        PartDefinition LowerTailFin = Tail2.addOrReplaceChild("LowerTailFin", CubeListBuilder.create().texOffs(13, 0).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.01F, 0.2F, 0.3F, -0.43807764890847944F, 0.0F, 0.0F));

        PartDefinition UpperTailFin = Tail2.addOrReplaceChild("UpperTailFin", CubeListBuilder.create().texOffs(14, 18).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.3F, 0.3F, 0.40491639977848987F, 0.0F, 0.0F));

        PartDefinition TailTop = Tail.addOrReplaceChild("TailTop", CubeListBuilder.create().texOffs(18, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.4F, 0.0F, -0.3731513794290017F, 0.0F, 0.0F));

        PartDefinition LeftPectoralFin = MainBody.addOrReplaceChild("LeftPectoralFin", CubeListBuilder.create().texOffs(0, 2).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.5F, 0.4F, -1.7F, 0.0F, 0.20629791225940755F, 0.0F));

        return LayerDefinition.create(meshDefinition, 32, 32);
    }

    @Override
    public void setupAnim(MoorishIdolEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
