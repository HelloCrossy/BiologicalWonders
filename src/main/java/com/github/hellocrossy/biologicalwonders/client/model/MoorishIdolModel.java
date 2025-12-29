package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.MoorishIdolEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class MoorishIdolModel extends SegmentedModel<MoorishIdolEntity> {
    public ModelPart MainBody;
    public ModelPart RightPectoralFin;
    public ModelPart Head;
    public ModelPart RightPelvicFin;
    public ModelPart LeftPelvicFin;
    public ModelPart LeftPectoralFin;
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
    public ModelPart TailFinTop;
    public ModelPart TailFinBottom;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.MainBody);
        }

        return this.parts;
    }

    public MoorishIdolModel(ModelPart root) {
        this.MainBody = root.getChild("MainBody");
        this.texWidth = 32;
        this.texHeight = 32;

        this.MainBody.addChild(this.TailBase);
        this.Tail.addChild(this.TailBottom);
        this.Tail.addChild(this.Tail2);
        this.MainBody.addChild(this.DorsalFin1);
        this.MainBody.addChild(this.AnalFin);
        this.DorsalFin1.addChild(this.DorsalFin2);
        this.Head.addChild(this.LowerMouth);
        this.TailBase.addChild(this.Tail);
        this.MainBody.addChild(this.RightPelvicFin);
        this.MainBody.addChild(this.LeftPelvicFin);
        this.MainBody.addChild(this.RightPectoralFin);
        this.DorsalFin2.addChild(this.DorsalFin3);
        this.Tail2.addChild(this.TailFinTop);
        this.DorsalFin3.addChild(this.DorsalFin4_1);
        this.Head.addChild(this.Head_1);
        this.MainBody.addChild(this.Head);
        this.MainBody.addChild(this.DorsalFin4);
        this.Tail.addChild(this.TailTop);
        this.Tail2.addChild(this.TailFinBottom);
        this.MainBody.addChild(this.LeftPectoralFin);
        this.Head.addChild(this.UpperMouth);
    }
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        this.TailBase = new ModelPart(this, 0, 0);
        this.TailBase.setPos(0.0F, 0.0F, 3.4F);
        this.TailBase.addBox(-1.0F, -2.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.01F, 0.01F, 0.01F);
        this.TailBottom = new ModelPart(this, 0, 0);
        this.TailBottom.setPos(0.0F, 1.5F, 0.0F);
        this.TailBottom.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailBottom, 0.3665191429188092F, 0.0F, 0.0F);
        this.Tail2 = new ModelPart(this, 13, 0);
        this.Tail2.setPos(0.0F, 0.0F, 1.1F);
        this.Tail2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.MainBody = new ModelPart(this, 0, 0);
        this.MainBody.setPos(0.0F, 16.6F, -0.4F);
        this.MainBody.addBox(-1.5F, -3.5F, -3.0F, 3.0F, 7.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.DorsalFin1 = new ModelPart(this, 12, 12);
        this.DorsalFin1.setPos(0.0F, -2.8F, -1.9F);
        this.DorsalFin1.addBox(-1.0F, -3.0F, -1.1F, 2.0F, 3.0F, 2.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(DorsalFin1, -0.6185446629383405F, 0.0F, 0.0F);
        this.AnalFin = new ModelPart(this, 0, 11);
        this.AnalFin.setPos(0.0F, 3.4F, 2.8F);
        this.AnalFin.addBox(0.0F, -2.0F, -3.3F, 0.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.DorsalFin2 = new ModelPart(this, 12, 12);
        this.DorsalFin2.setPos(0.0F, -2.6F, -0.3F);
        this.DorsalFin2.addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(DorsalFin2, -0.23457224414434488F, 0.0F, 0.0F);
        this.LowerMouth = new ModelPart(this, 5, 21);
        this.LowerMouth.setPos(0.0F, 2.8F, 0.33F);
        this.LowerMouth.addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, -0.02F, -0.02F, 0.0F);
        this.setRotateAngle(LowerMouth, 0.11868239246456576F, 0.0F, 0.0F);
        this.Tail = new ModelPart(this, 18, 5);
        this.Tail.setPos(0.0F, 0.0F, 2.7F);
        this.Tail.addBox(-1.0F, -1.5F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.RightPelvicFin = new ModelPart(this, 0, 20);
        this.RightPelvicFin.setPos(-1.3F, 2.6F, -1.5F);
        this.RightPelvicFin.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightPelvicFin, 0.23457224414434488F, 0.0F, 0.27366763203903305F);
        this.LeftPelvicFin = new ModelPart(this, 19, 8);
        this.LeftPelvicFin.setPos(1.3F, 2.6F, -1.5F);
        this.LeftPelvicFin.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftPelvicFin, 0.23457224414434488F, 0.0F, -0.27366763203903305F);
        this.RightPectoralFin = new ModelPart(this, 0, 0);
        this.RightPectoralFin.setPos(-1.5F, 0.4F, -1.7F);
        this.RightPectoralFin.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightPectoralFin, 0.0F, -0.20629791225940755F, 0.0F);
        this.DorsalFin3 = new ModelPart(this, 12, 12);
        this.DorsalFin3.setPos(0.0F, -2.6F, 0.0F);
        this.DorsalFin3.addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(DorsalFin3, -0.1563815016444822F, 0.0F, 0.0F);
        this.TailFinTop = new ModelPart(this, 14, 18);
        this.TailFinTop.setPos(0.0F, -0.3F, 0.3F);
        this.TailFinTop.addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinTop, 0.40491639977848987F, 0.0F, 0.0F);
        this.DorsalFin4_1 = new ModelPart(this, 12, 12);
        this.DorsalFin4_1.setPos(0.0F, -2.7F, -0.05F);
        this.DorsalFin4_1.addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(DorsalFin4_1, -0.23457224414434488F, 0.0F, 0.0F);
        this.Head_1 = new ModelPart(this, 12, 12);
        this.Head_1.setPos(0.0F, 3.4F, -0.4F);
        this.Head_1.addBox(-1.0F, -2.5F, -1.1F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head_1, -0.5480333784683167F, 0.0F, 0.0F);
        this.Head = new ModelPart(this, 12, 12);
        this.Head.setPos(0.0F, -0.7F, -2.8F);
        this.Head.addBox(-1.0F, -2.5F, -1.1F, 2.0F, 5.0F, 3.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(Head, -0.35255652221866F, 0.0F, 0.0F);
        this.DorsalFin4 = new ModelPart(this, 0, 6);
        this.DorsalFin4.setPos(0.0F, -3.3F, 4.0F);
        this.DorsalFin4.addBox(0.0F, -3.4F, -4.4F, 0.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(DorsalFin4, 0.0F, 0.0F, 0.001745329278001762F);
        this.TailTop = new ModelPart(this, 18, 0);
        this.TailTop.setPos(0.0F, -1.4F, 0.0F);
        this.TailTop.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailTop, -0.3731513794290017F, 0.0F, 0.0F);
        this.TailFinBottom = new ModelPart(this, 13, 0);
        this.TailFinBottom.setPos(0.0F, 0.2F, 0.3F);
        this.TailFinBottom.addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinBottom, -0.43807764890847944F, 0.0F, 0.0F);
        this.LeftPectoralFin = new ModelPart(this, 0, 17);
        this.LeftPectoralFin.setPos(1.5F, 0.4F, -1.7F);
        this.LeftPectoralFin.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftPectoralFin, 0.0F, 0.20629791225940755F, 0.0F);
        this.UpperMouth = new ModelPart(this, 16, 20);
        this.UpperMouth.setPos(0.0F, 1.2F, -0.3F);
        this.UpperMouth.addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperMouth, 0.4639085138485122F, 0.0F, 0.0F);

        return LayerDefinition.create(meshDefinition, texWidth, texHeight);
    }
    @Override
    public void setupAnim(MoorishIdolEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelPart ModelPart, float x, float y, float z) {
        ModelPart.xRot = x;
        ModelPart.yRot = y;
        ModelPart.zRot = z;
    }
}
