package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.SpottedDrumEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class SpottedDrumModel extends SegmentedModel<SpottedDrumEntity> {
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
        this.texWidth = 32;
        this.texHeight = 32;

        this.DorsalFin1.addChild(this.DorsalFin2);
        this.Tail1.addChild(this.UpperTail);
        this.MainBody.addChild(this.PectoralFinRight);
        this.Head.addChild(this.LowerHead);
        this.MainBody.addChild(this.AnalFin);
        this.MainBody.addChild(this.PectoralFinLeft);
        this.MainBody.addChild(this.TailBase);
        this.Tail1.addChild(this.LowerTail);
        this.MainBody.addChild(this.DorsalFin1);
        this.Tail1.addChild(this.Tail2);
        this.MainBody.addChild(this.DorsalFin4);
        this.LowerHead.addChild(this.Mouth);
        this.Tail2.addChild(this.TailFinTop);
        this.DorsalFin2.addChild(this.DorsalFin3);
        this.Tail2.addChild(this.TailFinBottom);
        this.MainBody.addChild(this.PelvicFinRight);
        this.MainBody.addChild(this.PelvicFinLeft);
        this.MainBody.addChild(this.Head);
        this.TailBase.addChild(this.Tail1);
    }

    @Override
    public void setupAnim(SpottedDrumEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    public static LayerDefinition createBodyLayer() {
         MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        this.DorsalFin2 = new ModelPart(this, 22, 17);
        this.DorsalFin2.setPos(0.0F, -2.6F, -0.3F);
        this.DorsalFin2.addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(DorsalFin2, -0.23457224414434488F, 0.0F, 0.0F);
        this.UpperTail = new ModelPart(this, 18, 0);
        this.UpperTail.setPos(0.0F, -1.2F, 0.0F);
        this.UpperTail.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperTail, -0.17767452317934493F, 0.0F, 0.0F);
        this.PectoralFinRight = new ModelPart(this, 0, 0);
        this.PectoralFinRight.setPos(-1.5F, 0.4F, -1.7F);
        this.PectoralFinRight.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinRight, 0.0F, -0.20629791225940755F, 0.0F);
        this.LowerHead = new ModelPart(this, 13, 13);
        this.LowerHead.setPos(0.0F, -0.4F, 1.2F);
        this.LowerHead.addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LowerHead, -2.230007126683611F, 0.0F, 0.0F);
        this.AnalFin = new ModelPart(this, 22, 21);
        this.AnalFin.setPos(0.0F, 2.5F, 2.8F);
        this.AnalFin.addBox(0.0F, -1.0F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(AnalFin, 0.5864306020384839F, 0.0F, 0.0F);
        this.PectoralFinLeft = new ModelPart(this, 0, 0);
        this.PectoralFinLeft.setPos(1.5F, 0.4F, -1.7F);
        this.PectoralFinLeft.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinLeft, 0.0F, 0.20629791225940755F, 0.0F);
        this.TailBase = new ModelPart(this, 6, 17);
        this.TailBase.setPos(0.0F, 0.0F, 3.4F);
        this.TailBase.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.01F, 0.01F, 0.01F);
        this.LowerTail = new ModelPart(this, 0, 0);
        this.LowerTail.setPos(0.0F, 1.2F, 0.0F);
        this.LowerTail.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LowerTail, 0.17767452317934493F, 0.0F, 0.0F);
        this.DorsalFin1 = new ModelPart(this, 14, 20);
        this.DorsalFin1.setPos(0.0F, -2.1F, -1.8F);
        this.DorsalFin1.addBox(-1.0F, -3.0F, -1.1F, 2.0F, 3.0F, 2.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(DorsalFin1, -0.26668630504420165F, 0.0F, 0.0F);
        this.Tail2 = new ModelPart(this, 22, 21);
        this.Tail2.setPos(0.0F, 0.0F, 1.1F);
        this.Tail2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.DorsalFin4 = new ModelPart(this, 0, 4);
        this.DorsalFin4.setPos(0.0F, -2.5F, 3.3F);
        this.DorsalFin4.addBox(0.0F, -2.3F, -4.4F, 0.0F, 4.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(DorsalFin4, 0.0F, 0.0F, 0.001745329278001762F);
        this.Mouth = new ModelPart(this, 0, 25);
        this.Mouth.setPos(0.0F, -1.9F, 1.5F);
        this.Mouth.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Mouth, -0.1350884801096195F, 0.0F, 0.0F);
        this.TailFinTop = new ModelPart(this, 0, 12);
        this.TailFinTop.setPos(0.0F, -0.5F, 0.6F);
        this.TailFinTop.addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinTop, 0.20943951023931953F, 0.0F, 0.0F);
        this.DorsalFin3 = new ModelPart(this, 12, 22);
        this.DorsalFin3.setPos(0.0F, -2.6F, 0.0F);
        this.DorsalFin3.addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(DorsalFin3, -0.1563815016444822F, 0.0F, 0.0F);
        this.TailFinBottom = new ModelPart(this, 22, 8);
        this.TailFinBottom.setPos(0.0F, 0.3F, 0.7F);
        this.TailFinBottom.addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinBottom, -0.24260075936930908F, 0.0F, 0.0F);
        this.PelvicFinRight = new ModelPart(this, 7, 23);
        this.PelvicFinRight.setPos(-1.3F, 2.1F, -1.1F);
        this.PelvicFinRight.addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PelvicFinRight, 0.23457224414434488F, 0.0F, 0.46914448828868976F);
        this.PelvicFinLeft = new ModelPart(this, 7, 23);
        this.PelvicFinLeft.setPos(1.3F, 2.1F, -1.1F);
        this.PelvicFinLeft.addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PelvicFinLeft, 0.23457224414434488F, 0.0F, -0.46914448828868976F);
        this.Head = new ModelPart(this, 13, 0);
        this.Head.setPos(0.0F, -0.6F, -4.0F);
        this.Head.addBox(-1.0F, -2.0F, -1.1F, 2.0F, 4.0F, 3.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(Head, -1.0953686092568693F, 0.0F, 0.0F);
        this.MainBody = new ModelPart(this, 0, 0);
        this.MainBody.setPos(0.0F, 19.3F, -1.8F);
        this.MainBody.addBox(-1.5F, -2.5F, -3.0F, 3.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.Tail1 = new ModelPart(this, 20, 7);
        this.Tail1.setPos(0.0F, 0.0F, 2.7F);
        this.Tail1.addBox(-1.0F, -1.5F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);

        return LayerDefinition.create(meshDefinition, texWidth, texHeight);
    }
    public void setRotateAngle(ModelPart ModelPart, float x, float y, float z) {
        ModelPart.xRot = x;
        ModelPart.yRot = y;
        ModelPart.zRot = z;
    }
}
