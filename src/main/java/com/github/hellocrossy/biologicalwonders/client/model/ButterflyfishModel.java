package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.ButterflyfishEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ButterflyfishModel extends SegmentedModel<ButterflyfishEntity> {
    public ModelRenderer MainBody;
    public ModelRenderer Head;
    public ModelRenderer Tail;
    public ModelRenderer part10;
    public ModelRenderer part10_1;
    public ModelRenderer part11;
    public ModelRenderer part11_1;
    public ModelRenderer part6;
    public ModelRenderer part6_1;
    public ModelRenderer LowerMouth;
    public ModelRenderer UpperMouth;
    public ModelRenderer part7;
    public ModelRenderer part7_1;
    public ModelRenderer part9;
    public ModelRenderer part8;
    public ModelRenderer part8_1;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.MainBody);
        }

        return this.parts;
    }

    public ButterflyfishModel() {
        this.texWidth = 32;
        this.texHeight = 32;
        this.part9 = new ModelRenderer(this, 13, 0);
        this.part9.setPos(0.0F, 0.0F, 1.1F);
        this.part9.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.part8_1 = new ModelRenderer(this, 15, 17);
        this.part8_1.setPos(0.0F, 0.1F, 0.28F);
        this.part8_1.addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(part8_1, -0.3281218860591285F, 0.0F, 0.0F);
        this.part6 = new ModelRenderer(this, 0, 11);
        this.part6.setPos(0.0F, 2.1F, 2.9F);
        this.part6.addBox(0.0F, -2.0F, -3.3F, 0.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.part11_1 = new ModelRenderer(this, 0, 0);
        this.part11_1.setPos(-1.5F, 0.4F, -1.7F);
        this.part11_1.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(part11_1, 0.0F, -0.20629791225940755F, 0.0F);
        this.MainBody = new ModelRenderer(this, 0, 0);
        this.MainBody.setPos(0.0F, 0.0F, -0.4F);
        this.MainBody.addBox(-1.5F, -3.8F, -3.0F, 3.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.part11 = new ModelRenderer(this, 0, 17);
        this.part11.setPos(1.5F, 0.4F, -1.7F);
        this.part11.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(part11, 0.0F, 0.20629791225940755F, 0.0F);
        this.UpperMouth = new ModelRenderer(this, 5, 21);
        this.UpperMouth.setPos(0.0F, 2.2F, -0.87F);
        this.UpperMouth.addBox(-0.5F, -0.5F, -2.7F, 1.0F, 1.0F, 4.0F, 0.0F, -0.02F, 0.0F);
        this.setRotateAngle(UpperMouth, 0.6269222353584302F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 12, 12);
        this.Head.setPos(0.0F, -1.1F, -3.2F);
        this.Head.addBox(-1.0F, -2.5F, -1.1F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.5480333784683167F, 0.0F, 0.0F);
        this.part10 = new ModelRenderer(this, 0, 20);
        this.part10.setPos(-1.3F, 1.7F, -1.9F);
        this.part10.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(part10, 0.23457224414434488F, 0.0F, 0.27366763203903305F);
        this.part10_1 = new ModelRenderer(this, 19, 8);
        this.part10_1.setPos(1.3F, 1.7F, -1.9F);
        this.part10_1.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(part10_1, 0.23457224414434488F, 0.0F, -0.27366763203903305F);
        this.LowerMouth = new ModelRenderer(this, 16, 20);
        this.LowerMouth.setPos(0.0F, 2.3F, -0.2F);
        this.LowerMouth.addBox(-0.5F, 0.0F, -3.2F, 1.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LowerMouth, 0.38571777134864954F, 0.0F, 0.0F);
        this.part8 = new ModelRenderer(this, 15, 17);
        this.part8.setPos(0.01F, -0.2F, 0.25F);
        this.part8.addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(part8, 0.3281218860591285F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 18, 5);
        this.Tail.setPos(0.0F, -0.8F, 3.0F);
        this.Tail.addBox(-1.0F, -1.5F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.part7 = new ModelRenderer(this, 18, 0);
        this.part7.setPos(0.0F, -1.6F, 0.0F);
        this.part7.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(part7, -0.6258750804178109F, 0.0F, 0.0F);
        this.part6_1 = new ModelRenderer(this, 0, 6);
        this.part6_1.setPos(0.0F, -3.8F, 3.0F);
        this.part6_1.addBox(0.0F, -2.0F, -4.4F, 0.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(part6_1, 0.0F, 0.0F, 0.001745329278001762F);
        this.part7_1 = new ModelRenderer(this, 0, 0);
        this.part7_1.setPos(0.0F, 1.5F, 0.0F);
        this.part7_1.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(part7_1, 0.6258750804178109F, 0.0F, 0.0F);
        this.Tail.addChild(this.part9);
        this.part9.addChild(this.part8_1);
        this.MainBody.addChild(this.part6);
        this.MainBody.addChild(this.part11_1);
        this.MainBody.addChild(this.part11);
        this.Head.addChild(this.UpperMouth);
        this.MainBody.addChild(this.Head);
        this.MainBody.addChild(this.part10);
        this.MainBody.addChild(this.part10_1);
        this.Head.addChild(this.LowerMouth);
        this.part9.addChild(this.part8);
        this.MainBody.addChild(this.Tail);
        this.Tail.addChild(this.part7);
        this.MainBody.addChild(this.part6_1);
        this.Tail.addChild(this.part7_1);
    }

    @Override
    public void setupAnim(ButterflyfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
