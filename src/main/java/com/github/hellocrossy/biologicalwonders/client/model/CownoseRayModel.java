package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.CownoseRayEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class CownoseRayModel extends ZawaBaseModel<CownoseRayEntity> {
    public ModelRenderer Body;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends CownoseRayModel {
        public ModelRenderer Head;
        public ModelRenderer LeftForearm;
        public ModelRenderer RightForearm;
        public ModelRenderer RightFlap;
        public ModelRenderer LeftFlap;
        public ModelRenderer Tail1;
        public ModelRenderer LeftNose;
        public ModelRenderer RightNose;
        public ModelRenderer LeftElbow;
        public ModelRenderer LeftFlipper;
        public ModelRenderer RightElbow;
        public ModelRenderer RightFlipper;
        public ModelRenderer Tail2;
        public ModelRenderer TailSpike;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.Head = new ModelRenderer(this, 0, 13);
            this.Head.setPos(0.0F, -1.5F, -4.5F);
            this.Head.addBox(-2.5F, 0.0F, -3.0F, 5.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.08726646259971647F, 0.0F, 0.0F);
            this.RightForearm = new ModelRenderer(this, 12, 14);
            this.RightForearm.setPos(-2.5F, 0.0F, -4.5F);
            this.RightForearm.addBox(-7.0F, -1.0F, -1.0F, 8.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightForearm, 0.0F, 0.3490658503988659F, 0.0F);
            this.LeftElbow = new ModelRenderer(this, 0, 23);
            this.LeftElbow.setPos(2.0F, 0.0F, 5.0F);
            this.LeftElbow.addBox(-2.0F, -0.5F, 0.0F, 6.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftElbow, 0.0F, 0.7222172631173811F, 0.0F);
            this.RightNose = new ModelRenderer(this, 0, 0);
            this.RightNose.setPos(0.5F, 0.2F, -2.2F);
            this.RightNose.addBox(-3.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightNose, 0.0F, -0.2617993877991494F, 0.0F);
            this.RightElbow = new ModelRenderer(this, 0, 23);
            this.RightElbow.mirror = true;
            this.RightElbow.setPos(-2.0F, 0.0F, 5.0F);
            this.RightElbow.addBox(-4.0F, -0.5F, 0.0F, 6.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightElbow, 0.0F, -0.7222172631173811F, 0.0F);
            this.RightFlipper = new ModelRenderer(this, 14, 24);
            this.RightFlipper.mirror = true;
            this.RightFlipper.setPos(-6.5F, 0.0F, -0.3F);
            this.RightFlipper.addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFlipper, 0.0F, 0.40142572795869574F, 0.0F);
            this.TailSpike = new ModelRenderer(this, 38, 2);
            this.TailSpike.setPos(0.0F, 0.2F, 0.9F);
            this.TailSpike.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailSpike, 0.3743731378685891F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 22.0F, 0.0F);
            this.Body.addBox(-3.0F, -1.5F, -4.5F, 6.0F, 3.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.LeftNose = new ModelRenderer(this, 0, 0);
            this.LeftNose.setPos(-0.5F, 0.2F, -2.2F);
            this.LeftNose.addBox(0.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftNose, 0.0F, 0.2617993877991494F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 36, 5);
            this.Tail2.setPos(0.0F, 0.5F, 3.9F);
            this.Tail2.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.LeftFlap = new ModelRenderer(this, 31, 8);
            this.LeftFlap.setPos(0.0F, -0.1F, 3.2F);
            this.LeftFlap.addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFlap, -0.2617993877991494F, 0.10471975511965977F, 0.08726646259971647F);
            this.LeftForearm = new ModelRenderer(this, 12, 14);
            this.LeftForearm.mirror = true;
            this.LeftForearm.setPos(2.5F, 0.0F, -4.5F);
            this.LeftForearm.addBox(-1.0F, -1.0F, -1.0F, 8.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftForearm, 0.0F, -0.3490658503988659F, 0.0F);
            this.LeftFlipper = new ModelRenderer(this, 14, 24);
            this.LeftFlipper.setPos(6.5F, 0.0F, -0.3F);
            this.LeftFlipper.addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFlipper, 0.0F, -0.40142572795869574F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 23, 1);
            this.Tail1.setPos(0.0F, -1.2F, 3.5F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.RightFlap = new ModelRenderer(this, 31, 8);
            this.RightFlap.mirror = true;
            this.RightFlap.setPos(0.0F, -0.1F, 3.2F);
            this.RightFlap.addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFlap, -0.2617993877991494F, -0.10471975511965977F, -0.08726646259971647F);
            this.Body.addChild(this.Head);
            this.Body.addChild(this.RightForearm);
            this.LeftForearm.addChild(this.LeftElbow);
            this.Head.addChild(this.RightNose);
            this.RightForearm.addChild(this.RightElbow);
            this.RightForearm.addChild(this.RightFlipper);
            this.Tail1.addChild(this.TailSpike);
            this.Head.addChild(this.LeftNose);
            this.Tail1.addChild(this.Tail2);
            this.Body.addChild(this.LeftFlap);
            this.Body.addChild(this.LeftForearm);
            this.LeftForearm.addChild(this.LeftFlipper);
            this.Body.addChild(this.Tail1);
            this.Body.addChild(this.RightFlap);
            this.saveBase();

        }

        @Override
        public void setupAnim(CownoseRayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
        }
    }

    public static class Child extends CownoseRayModel {
        public ModelRenderer Head;
        public ModelRenderer LeftForearm;
        public ModelRenderer RightForearm;
        public ModelRenderer Tail;
        public ModelRenderer LeftNose;
        public ModelRenderer RightNose;
        public ModelRenderer LeftFlipper;
        public ModelRenderer RightFlipper;
        public ModelRenderer TailSpike;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.Body = new ModelRenderer(this, 0, 12);
            this.Body.setPos(0.0F, 22.0F, 0.0F);
            this.Body.addBox(-2.0F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.RightFlipper = new ModelRenderer(this, 15, 0);
            this.RightFlipper.setPos(-3.9F, 0.1F, 0.4F);
            this.RightFlipper.addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFlipper, 0.0F, 0.12217304763960307F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 19);
            this.Head.setPos(0.0F, -1.0F, -2.5F);
            this.Head.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.05235987755982988F, 0.0F, 0.0F);
            this.LeftForearm = new ModelRenderer(this, 0, 0);
            this.LeftForearm.setPos(1.3F, 0.0F, -2.5F);
            this.LeftForearm.addBox(-0.5F, -0.5F, -0.5F, 5.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftForearm, 0.0F, -0.23474678106428595F, 0.0F);
            this.TailSpike = new ModelRenderer(this, 0, 0);
            this.TailSpike.setPos(0.0F, 0.0F, 0.0F);
            this.TailSpike.addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailSpike, -0.4363323129985824F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 12, 13);
            this.Tail.setPos(0.0F, -0.7F, 2.5F);
            this.Tail.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.RightNose = new ModelRenderer(this, 19, 11);
            this.RightNose.setPos(0.6F, 0.1F, -1.2F);
            this.RightNose.addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightNose, 0.0F, -0.12217304763960307F, 0.0F);
            this.RightForearm = new ModelRenderer(this, 0, 6);
            this.RightForearm.setPos(-1.3F, 0.0F, -2.5F);
            this.RightForearm.addBox(-4.5F, -0.5F, -0.5F, 5.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightForearm, 0.0F, 0.23474678106428595F, 0.0F);
            this.LeftNose = new ModelRenderer(this, 10, 20);
            this.LeftNose.setPos(-0.6F, 0.1F, -1.2F);
            this.LeftNose.addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftNose, 0.0F, 0.12217304763960307F, 0.0F);
            this.LeftFlipper = new ModelRenderer(this, 15, 6);
            this.LeftFlipper.setPos(3.9F, 0.1F, 0.4F);
            this.LeftFlipper.addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFlipper, 0.0F, -0.12217304763960307F, 0.0F);
            this.RightForearm.addChild(this.RightFlipper);
            this.Body.addChild(this.Head);
            this.Body.addChild(this.LeftForearm);
            this.Tail.addChild(this.TailSpike);
            this.Body.addChild(this.Tail);
            this.Head.addChild(this.RightNose);
            this.Body.addChild(this.RightForearm);
            this.Head.addChild(this.LeftNose);
            this.LeftForearm.addChild(this.LeftFlipper);
            this.saveBase();

        }

        @Override
        public void setupAnim(CownoseRayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
        }
    }
}
