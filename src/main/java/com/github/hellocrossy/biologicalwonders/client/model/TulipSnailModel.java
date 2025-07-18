package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.TulipSnailEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class TulipSnailModel extends SegmentedModel<TulipSnailEntity> {
    public ModelRenderer Body;
    public ModelRenderer Tail;
    public ModelRenderer Head;
    public ModelRenderer Shell1;
    public ModelRenderer StalkLeft;
    public ModelRenderer StalkRight;
    public ModelRenderer Shell2;
    public ModelRenderer Shell5;
    public ModelRenderer Shell3;
    public ModelRenderer Shell4;
    public ModelRenderer Shell6;
    public ModelRenderer Shell7;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public TulipSnailModel() {
        this.texWidth = 32;
        this.texHeight = 32;
        this.Shell6 = new ModelRenderer(this, 9, 21);
        this.Shell6.setPos(0.0F, -0.9F, -1.6F);
        this.Shell6.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Shell6, -0.5626941801377437F, 0.0F, 0.0F);
        this.StalkLeft = new ModelRenderer(this, -1, 0);
        this.StalkLeft.setPos(0.5F, -1.1F, -0.5F);
        this.StalkLeft.addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(StalkLeft, -0.35185837453889574F, 0.15707963267948966F, -0.20071286397934787F);
        this.Shell7 = new ModelRenderer(this, 19, 21);
        this.Shell7.setPos(-0.4F, -0.2F, -2.0F);
        this.Shell7.addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Shell7, -0.1672025410094762F, 0.35185837453889574F, 0.0F);
        this.Shell4 = new ModelRenderer(this, 22, 6);
        this.Shell4.setPos(-0.1F, -1.5F, 0.0F);
        this.Shell4.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Shell4, 0.0F, -0.2768092133741882F, -0.11728612207217244F);
        this.Body = new ModelRenderer(this, 0, 10);
        this.Body.setPos(0.0F, 22.0F, 0.0F);
        this.Body.addBox(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 13, 10);
        this.Tail.setPos(0.0F, 1.0F, 3.3F);
        this.Tail.addBox(-2.0F, -1.0F, -1.5F, 4.0F, 2.0F, 3.0F, -0.01F, -0.01F, -0.01F);
        this.Shell2 = new ModelRenderer(this, 14, 15);
        this.Shell2.setPos(-0.3F, -2.0F, 1.2F);
        this.Shell2.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Shell2, -0.35779249665883756F, -0.09075711777475377F, 0.0F);
        this.StalkRight = new ModelRenderer(this, 0, 2);
        this.StalkRight.setPos(-0.4F, -1.1F, -0.5F);
        this.StalkRight.addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(StalkRight, -0.35185837453889574F, 0.0F, 0.20071286397934787F);
        this.Shell5 = new ModelRenderer(this, 16, 0);
        this.Shell5.setPos(0.0F, 1.2F, -2.6F);
        this.Shell5.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Shell5, 1.2510520131558576F, 0.0F, 0.0F);
        this.Shell1 = new ModelRenderer(this, 0, 0);
        this.Shell1.setPos(0.0F, -1.8F, 0.67F);
        this.Shell1.addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Shell1, -0.3944444176086212F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 24);
        this.Head.setPos(0.0F, 0.9F, -2.6F);
        this.Head.addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.29007373632884353F, 0.0F, 0.0F);
        this.Shell3 = new ModelRenderer(this, 0, 19);
        this.Shell3.setPos(-0.2F, -1.5F, 0.0F);
        this.Shell3.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Shell3, 0.0F, -0.06981317007977318F, -0.19547687289441354F);
        this.Shell5.addChild(this.Shell6);
        this.Head.addChild(this.StalkLeft);
        this.Shell6.addChild(this.Shell7);
        this.Shell3.addChild(this.Shell4);
        this.Body.addChild(this.Tail);
        this.Shell1.addChild(this.Shell2);
        this.Head.addChild(this.StalkRight);
        this.Shell1.addChild(this.Shell5);
        this.Body.addChild(this.Shell1);
        this.Body.addChild(this.Head);
        this.Shell2.addChild(this.Shell3);
    }

    @Override
    public void setupAnim(TulipSnailEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
