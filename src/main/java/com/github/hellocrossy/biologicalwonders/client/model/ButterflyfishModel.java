package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.ButterflyfishEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class ButterflyfishModel extends SegmentedModel<ButterflyfishEntity> {
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
        this.texWidth = 32;
        this.texHeight = 32;

        this.Body.addChild(this.PectoralFinLeft);
        this.Tail2.addChild(this.TailFinTop);
        this.Body.addChild(this.AnalFin);
        this.Body.addChild(this.Tail);
        this.Head.addChild(this.LowerMouth);
        this.Head.addChild(this.UpperMouth);
        this.Body.addChild(this.PelvicFinRight);
        this.Body.addChild(this.PectoralFinRight);
        this.Tail.addChild(this.Tail2);
        this.Body.addChild(this.Head);
        this.Tail.addChild(this.TailTop);
        this.Tail.addChild(this.TailBottom);
        this.Tail2.addChild(this.TailFinBottom);
        this.Body.addChild(this.PelvicFinLeft);
        this.Body.addChild(this.DorsalFin);
    }
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        this.PectoralFinLeft = new ModelPart(this, 0, 17);
        this.PectoralFinLeft.setPos(1.5F, 0.4F, -1.7F);
        this.PectoralFinLeft.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinLeft, 0.0F, 0.20629791225940755F, 0.0F);
        this.TailFinTop = new ModelPart(this, 15, 17);
        this.TailFinTop.setPos(0.01F, -0.2F, 0.25F);
        this.TailFinTop.addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinTop, 0.3281218860591285F, 0.0F, 0.0F);
        this.Body = new ModelPart(this, 0, 0);
        this.Body.setPos(0.0F, 21.7F, -0.4F);
        this.Body.addBox(-1.5F, -3.8F, -3.0F, 3.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.AnalFin = new ModelPart(this, 0, 11);
        this.AnalFin.setPos(0.0F, 2.1F, 2.9F);
        this.AnalFin.addBox(0.0F, -2.0F, -3.3F, 0.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.Tail = new ModelPart(this, 18, 5);
        this.Tail.setPos(0.0F, -0.8F, 3.0F);
        this.Tail.addBox(-1.0F, -1.5F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.LowerMouth = new ModelPart(this, 16, 20);
        this.LowerMouth.setPos(0.0F, 2.3F, -0.2F);
        this.LowerMouth.addBox(-0.5F, 0.0F, -3.2F, 1.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LowerMouth, 0.38571777134864954F, 0.0F, 0.0F);
        this.UpperMouth = new ModelPart(this, 5, 21);
        this.UpperMouth.setPos(0.0F, 2.2F, -0.87F);
        this.UpperMouth.addBox(-0.5F, -0.5F, -2.7F, 1.0F, 1.0F, 4.0F, 0.0F, -0.02F, 0.0F);
        this.setRotateAngle(UpperMouth, 0.6269222353584302F, 0.0F, 0.0F);
        this.PelvicFinRight = new ModelPart(this, 0, 20);
        this.PelvicFinRight.setPos(-1.3F, 1.7F, -1.9F);
        this.PelvicFinRight.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PelvicFinRight, 0.23457224414434488F, 0.0F, 0.27366763203903305F);
        this.PectoralFinRight = new ModelPart(this, 0, 0);
        this.PectoralFinRight.setPos(-1.5F, 0.4F, -1.7F);
        this.PectoralFinRight.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinRight, 0.0F, -0.20629791225940755F, 0.0F);
        this.Tail2 = new ModelPart(this, 13, 0);
        this.Tail2.setPos(0.0F, 0.0F, 1.1F);
        this.Tail2.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.Head = new ModelPart(this, 12, 12);
        this.Head.setPos(0.0F, -1.1F, -3.2F);
        this.Head.addBox(-1.0F, -2.5F, -1.1F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.5480333784683167F, 0.0F, 0.0F);
        this.TailTop = new ModelPart(this, 18, 0);
        this.TailTop.setPos(0.0F, -1.6F, 0.0F);
        this.TailTop.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailTop, -0.6258750804178109F, 0.0F, 0.0F);
        this.TailBottom = new ModelPart(this, 0, 0);
        this.TailBottom.setPos(0.0F, 1.5F, 0.0F);
        this.TailBottom.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailBottom, 0.6258750804178109F, 0.0F, 0.0F);
        this.TailFinBottom = new ModelPart(this, 15, 17);
        this.TailFinBottom.setPos(0.0F, 0.1F, 0.28F);
        this.TailFinBottom.addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinBottom, -0.3281218860591285F, 0.0F, 0.0F);
        this.PelvicFinLeft = new ModelPart(this, 19, 8);
        this.PelvicFinLeft.setPos(1.3F, 1.7F, -1.9F);
        this.PelvicFinLeft.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PelvicFinLeft, 0.23457224414434488F, 0.0F, -0.27366763203903305F);
        this.DorsalFin = new ModelPart(this, 0, 6);
        this.DorsalFin.setPos(0.0F, -3.8F, 3.0F);
        this.DorsalFin.addBox(0.0F, -2.0F, -4.4F, 0.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(DorsalFin, 0.0F, 0.0F, 0.001745329278001762F);

        return LayerDefinition.create(meshDefinition, texWidth, texHeight);
    }
    @Override
    public void setupAnim(ButterflyfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelPart ModelPart, float x, float y, float z) {
        ModelPart.xRot = x;
        ModelPart.yRot = y;
        ModelPart.zRot = z;
    }
}
