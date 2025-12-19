package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.SpottedDrumEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class SpottedDrumModel extends SegmentedModel<SpottedDrumEntity> {
    public ModelRenderer MainBody;
    public ModelRenderer Head;
    public ModelRenderer PelvicFinRight;
    public ModelRenderer PelvicFinLeft;
    public ModelRenderer PectoralFinLeft;
    public ModelRenderer PectoralFinRight;
    public ModelRenderer AnalFin;
    public ModelRenderer DorsalFin4;
    public ModelRenderer DorsalFin1;
    public ModelRenderer TailBase;
    public ModelRenderer LowerHead;
    public ModelRenderer Mouth;
    public ModelRenderer DorsalFin2;
    public ModelRenderer DorsalFin3;
    public ModelRenderer Tail1;
    public ModelRenderer UpperTail;
    public ModelRenderer LowerTail;
    public ModelRenderer Tail2;
    public ModelRenderer TailFinTop;
    public ModelRenderer TailFinBottom;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.MainBody);
        }

        return this.parts;
    }

    public SpottedDrumModel() {
        this.texWidth = 32;
        this.texHeight = 32;
        this.DorsalFin2 = new ModelRenderer(this, 22, 17);
        this.DorsalFin2.setPos(0.0F, -2.6F, -0.3F);
        this.DorsalFin2.addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(DorsalFin2, -0.23457224414434488F, 0.0F, 0.0F);
        this.UpperTail = new ModelRenderer(this, 18, 0);
        this.UpperTail.setPos(0.0F, -1.2F, 0.0F);
        this.UpperTail.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperTail, -0.17767452317934493F, 0.0F, 0.0F);
        this.PectoralFinRight = new ModelRenderer(this, 0, 0);
        this.PectoralFinRight.setPos(-1.5F, 0.4F, -1.7F);
        this.PectoralFinRight.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinRight, 0.0F, -0.20629791225940755F, 0.0F);
        this.LowerHead = new ModelRenderer(this, 13, 13);
        this.LowerHead.setPos(0.0F, -0.4F, 1.2F);
        this.LowerHead.addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LowerHead, -2.230007126683611F, 0.0F, 0.0F);
        this.AnalFin = new ModelRenderer(this, 22, 21);
        this.AnalFin.setPos(0.0F, 2.5F, 2.8F);
        this.AnalFin.addBox(0.0F, -1.0F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(AnalFin, 0.5864306020384839F, 0.0F, 0.0F);
        this.PectoralFinLeft = new ModelRenderer(this, 0, 0);
        this.PectoralFinLeft.setPos(1.5F, 0.4F, -1.7F);
        this.PectoralFinLeft.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinLeft, 0.0F, 0.20629791225940755F, 0.0F);
        this.TailBase = new ModelRenderer(this, 6, 17);
        this.TailBase.setPos(0.0F, 0.0F, 3.4F);
        this.TailBase.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.01F, 0.01F, 0.01F);
        this.LowerTail = new ModelRenderer(this, 0, 0);
        this.LowerTail.setPos(0.0F, 1.2F, 0.0F);
        this.LowerTail.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LowerTail, 0.17767452317934493F, 0.0F, 0.0F);
        this.DorsalFin1 = new ModelRenderer(this, 14, 20);
        this.DorsalFin1.setPos(0.0F, -2.1F, -1.8F);
        this.DorsalFin1.addBox(-1.0F, -3.0F, -1.1F, 2.0F, 3.0F, 2.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(DorsalFin1, -0.26668630504420165F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 22, 21);
        this.Tail2.setPos(0.0F, 0.0F, 1.1F);
        this.Tail2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.DorsalFin4 = new ModelRenderer(this, 0, 4);
        this.DorsalFin4.setPos(0.0F, -2.5F, 3.3F);
        this.DorsalFin4.addBox(0.0F, -2.3F, -4.4F, 0.0F, 4.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(DorsalFin4, 0.0F, 0.0F, 0.001745329278001762F);
        this.Mouth = new ModelRenderer(this, 0, 25);
        this.Mouth.setPos(0.0F, -1.9F, 1.5F);
        this.Mouth.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Mouth, -0.1350884801096195F, 0.0F, 0.0F);
        this.TailFinTop = new ModelRenderer(this, 0, 12);
        this.TailFinTop.setPos(0.0F, -0.5F, 0.6F);
        this.TailFinTop.addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinTop, 0.20943951023931953F, 0.0F, 0.0F);
        this.DorsalFin3 = new ModelRenderer(this, 12, 22);
        this.DorsalFin3.setPos(0.0F, -2.6F, 0.0F);
        this.DorsalFin3.addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(DorsalFin3, -0.1563815016444822F, 0.0F, 0.0F);
        this.TailFinBottom = new ModelRenderer(this, 22, 8);
        this.TailFinBottom.setPos(0.0F, 0.3F, 0.7F);
        this.TailFinBottom.addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinBottom, -0.24260075936930908F, 0.0F, 0.0F);
        this.PelvicFinRight = new ModelRenderer(this, 7, 23);
        this.PelvicFinRight.setPos(-1.3F, 2.1F, -1.1F);
        this.PelvicFinRight.addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PelvicFinRight, 0.23457224414434488F, 0.0F, 0.46914448828868976F);
        this.PelvicFinLeft = new ModelRenderer(this, 7, 23);
        this.PelvicFinLeft.setPos(1.3F, 2.1F, -1.1F);
        this.PelvicFinLeft.addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PelvicFinLeft, 0.23457224414434488F, 0.0F, -0.46914448828868976F);
        this.Head = new ModelRenderer(this, 13, 0);
        this.Head.setPos(0.0F, -0.6F, -4.0F);
        this.Head.addBox(-1.0F, -2.0F, -1.1F, 2.0F, 4.0F, 3.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(Head, -1.0953686092568693F, 0.0F, 0.0F);
        this.MainBody = new ModelRenderer(this, 0, 0);
        this.MainBody.setPos(0.0F, 19.3F, -1.8F);
        this.MainBody.addBox(-1.5F, -2.5F, -3.0F, 3.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 20, 7);
        this.Tail1.setPos(0.0F, 0.0F, 2.7F);
        this.Tail1.addBox(-1.0F, -1.5F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
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

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
