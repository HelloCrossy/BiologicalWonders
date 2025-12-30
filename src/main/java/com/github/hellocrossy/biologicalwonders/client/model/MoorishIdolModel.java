package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.MoorishIdolEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class MoorishIdolModel extends SegmentedModel<MoorishIdolEntity> {
    public ModelRenderer MainBody;
    public ModelRenderer Head;
    public ModelRenderer RightPelvicFin;
    public ModelRenderer LeftPelvicFin;
    public ModelRenderer LeftPectoralFin;
    public ModelRenderer RightPectoralFin;
    public ModelRenderer AnalFin;
    public ModelRenderer DorsalFin4;
    public ModelRenderer DorsalFin1;
    public ModelRenderer TailBase;
    public ModelRenderer UpperMouth;
    public ModelRenderer LowerMouth;
    public ModelRenderer Head_1;
    public ModelRenderer DorsalFin2;
    public ModelRenderer DorsalFin3;
    public ModelRenderer DorsalFin4_1;
    public ModelRenderer Tail;
    public ModelRenderer TailTop;
    public ModelRenderer TailBottom;
    public ModelRenderer Tail2;
    public ModelRenderer UpperTailFin;
    public ModelRenderer LowerTailFin;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.MainBody);
        }

        return this.parts;
    }

    public MoorishIdolModel() {
        this.texWidth = 32;
        this.texHeight = 32;
        this.DorsalFin3 = new ModelRenderer(this, 14, 13);
        this.DorsalFin3.setPos(0.0F, -2.6F, 0.0F);
        this.DorsalFin3.addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(DorsalFin3, -0.1563815016444822F, 0.0F, 0.0F);
        this.Head_1 = new ModelRenderer(this, 21, 0);
        this.Head_1.setPos(0.0F, 3.4F, -0.4F);
        this.Head_1.addBox(-1.0F, -2.5F, -1.1F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head_1, -0.5480333784683167F, 0.0F, 0.0F);
        this.DorsalFin4_1 = new ModelRenderer(this, 14, 12);
        this.DorsalFin4_1.setPos(0.0F, -2.7F, -0.05F);
        this.DorsalFin4_1.addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(DorsalFin4_1, -0.23457224414434488F, 0.0F, 0.0F);
        this.UpperMouth = new ModelRenderer(this, 0, 25);
        this.UpperMouth.setPos(0.0F, 1.2F, -0.3F);
        this.UpperMouth.addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperMouth, 0.4639085138485122F, 0.0F, 0.0F);
        this.AnalFin = new ModelRenderer(this, 17, 19);
        this.AnalFin.setPos(0.0F, 3.4F, 2.8F);
        this.AnalFin.addBox(0.0F, -2.0F, -3.3F, 0.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.DorsalFin2 = new ModelRenderer(this, 13, 25);
        this.DorsalFin2.setPos(0.0F, -2.6F, -0.3F);
        this.DorsalFin2.addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(DorsalFin2, -0.23457224414434488F, 0.0F, 0.0F);
        this.DorsalFin1 = new ModelRenderer(this, 22, 20);
        this.DorsalFin1.setPos(0.0F, -2.8F, -1.9F);
        this.DorsalFin1.addBox(-1.0F, -3.0F, -1.1F, 2.0F, 3.0F, 2.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(DorsalFin1, -0.6185446629383405F, 0.0F, 0.0F);
        this.TailBottom = new ModelRenderer(this, 0, 0);
        this.TailBottom.setPos(0.0F, 1.5F, 0.0F);
        this.TailBottom.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailBottom, 0.3665191429188092F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 24, 17);
        this.Tail2.setPos(0.0F, 0.0F, 1.1F);
        this.Tail2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 14, 14);
        this.Head.setPos(0.0F, -0.7F, -2.8F);
        this.Head.addBox(-1.0F, -2.5F, -1.1F, 2.0F, 5.0F, 3.0F, 0.01F, 0.01F, 0.01F);
        this.setRotateAngle(Head, -0.35255652221866F, 0.0F, 0.0F);
        this.TailTop = new ModelRenderer(this, 18, 0);
        this.TailTop.setPos(0.0F, -1.4F, 0.0F);
        this.TailTop.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailTop, -0.3731513794290017F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 21, 12);
        this.Tail.setPos(0.0F, 0.0F, 2.7F);
        this.Tail.addBox(-1.0F, -1.5F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.LowerTailFin = new ModelRenderer(this, 13, 0);
        this.LowerTailFin.setPos(0.01F, 0.2F, 0.3F);
        this.LowerTailFin.addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LowerTailFin, -0.43807764890847944F, 0.0F, 0.0F);
        this.LeftPelvicFin = new ModelRenderer(this, 10, 27);
        this.LeftPelvicFin.setPos(1.3F, 2.6F, -1.5F);
        this.LeftPelvicFin.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftPelvicFin, 0.23457224414434488F, 0.0F, -0.27366763203903305F);
        this.RightPectoralFin = new ModelRenderer(this, 0, 2);
        this.RightPectoralFin.setPos(-1.5F, 0.4F, -1.7F);
        this.RightPectoralFin.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightPectoralFin, 0.0F, -0.20629791225940755F, 0.0F);
        this.LowerMouth = new ModelRenderer(this, 13, 0);
        this.LowerMouth.setPos(0.0F, 2.8F, 0.33F);
        this.LowerMouth.addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, -0.02F, -0.02F, 0.0F);
        this.setRotateAngle(LowerMouth, 0.11868239246456576F, 0.0F, 0.0F);
        this.RightPelvicFin = new ModelRenderer(this, 10, 27);
        this.RightPelvicFin.setPos(-1.3F, 2.6F, -1.5F);
        this.RightPelvicFin.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightPelvicFin, 0.23457224414434488F, 0.0F, 0.27366763203903305F);
        this.DorsalFin4 = new ModelRenderer(this, 0, 12);
        this.DorsalFin4.setPos(0.0F, -3.3F, 4.0F);
        this.DorsalFin4.addBox(0.0F, -3.4F, -4.4F, 0.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(DorsalFin4, 0.0F, 0.0F, 0.001745329278001762F);
        this.TailBase = new ModelRenderer(this, 20, 5);
        this.TailBase.setPos(0.0F, 0.0F, 3.4F);
        this.TailBase.addBox(-1.0F, -2.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.01F, 0.01F, 0.01F);
        this.LeftPectoralFin = new ModelRenderer(this, 0, 2);
        this.LeftPectoralFin.setPos(1.5F, 0.4F, -1.7F);
        this.LeftPectoralFin.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftPectoralFin, 0.0F, 0.20629791225940755F, 0.0F);
        this.UpperTailFin = new ModelRenderer(this, 14, 18);
        this.UpperTailFin.setPos(0.0F, -0.3F, 0.3F);
        this.UpperTailFin.addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperTailFin, 0.40491639977848987F, 0.0F, 0.0F);
        this.MainBody = new ModelRenderer(this, 0, 0);
        this.MainBody.setPos(0.0F, 0.0F, -0.4F);
        this.MainBody.addBox(-1.5F, -3.5F, -3.0F, 3.0F, 7.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.DorsalFin2.addChild(this.DorsalFin3);
        this.Head.addChild(this.Head_1);
        this.DorsalFin3.addChild(this.DorsalFin4_1);
        this.Head.addChild(this.UpperMouth);
        this.MainBody.addChild(this.AnalFin);
        this.DorsalFin1.addChild(this.DorsalFin2);
        this.MainBody.addChild(this.DorsalFin1);
        this.Tail.addChild(this.TailBottom);
        this.Tail.addChild(this.Tail2);
        this.MainBody.addChild(this.Head);
        this.Tail.addChild(this.TailTop);
        this.TailBase.addChild(this.Tail);
        this.Tail2.addChild(this.LowerTailFin);
        this.MainBody.addChild(this.LeftPelvicFin);
        this.MainBody.addChild(this.RightPectoralFin);
        this.Head.addChild(this.LowerMouth);
        this.MainBody.addChild(this.RightPelvicFin);
        this.MainBody.addChild(this.DorsalFin4);
        this.MainBody.addChild(this.TailBase);
        this.MainBody.addChild(this.LeftPectoralFin);
        this.Tail2.addChild(this.UpperTailFin);
    }

    @Override
    public void setupAnim(MoorishIdolEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
