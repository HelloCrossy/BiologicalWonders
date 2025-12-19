package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.AlligatorGarEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class AlligatorGarModel extends ZawaBaseModel<AlligatorGarEntity> {
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

    public static class Adult extends AlligatorGarModel {
        public ModelRenderer Hips;
        public ModelRenderer Head;
        public ModelRenderer PectoralFinRight;
        public ModelRenderer PectoralFinLeft;
        public ModelRenderer BodyTop;
        public ModelRenderer Tail1;
        public ModelRenderer PelvicFinLeft;
        public ModelRenderer PelvicFinRight;
        public ModelRenderer Tail2;
        public ModelRenderer DorsalFin;
        public ModelRenderer AnalFin;
        public ModelRenderer TailFinTop;
        public ModelRenderer TailFinBottom;
        public ModelRenderer Forehead;
        public ModelRenderer Face;
        public ModelRenderer NoseL;
        public ModelRenderer Mouth;
        public ModelRenderer NoseR;
        public ModelRenderer Snout;
        public ModelRenderer Teeth;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.DorsalFin = new ModelRenderer(this, 50, 34);
            this.DorsalFin.setPos(0.0F, 1.2F, 3.1F);
            this.DorsalFin.addBox(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(DorsalFin, 1.8018778824746906F, 0.0F, 0.0F);
            this.BodyTop = new ModelRenderer(this, 0, 0);
            this.BodyTop.setPos(0.0F, -3.0F, -3.3F);
            this.BodyTop.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BodyTop, 0.0781907508222411F, 0.0F, 0.0F);
            this.TailFinBottom = new ModelRenderer(this, 17, 5);
            this.TailFinBottom.setPos(0.0F, 0.5F, 4.5F);
            this.TailFinBottom.addBox(0.0F, 0.0F, -2.5F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinBottom, 1.4440853858158529F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 13, 24);
            this.Mouth.setPos(0.0F, 0.9F, 0.1F);
            this.Mouth.addBox(-0.5F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.0781907508222411F, 0.0F, 0.0F);
            this.TailFinTop = new ModelRenderer(this, 0, 4);
            this.TailFinTop.setPos(0.0F, -0.5F, 4.4F);
            this.TailFinTop.addBox(0.0F, 0.0F, -1.5F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop, 1.6845917354353828F, 0.0F, 0.0F);
            this.Teeth = new ModelRenderer(this, 13, 44);
            this.Teeth.setPos(0.0F, 0.5F, 0.2F);
            this.Teeth.addBox(-0.5F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, 0.1F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 10, 15);
            this.Snout.setPos(0.0F, 0.0F, -3.2F);
            this.Snout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.1563815016444822F, 0.0F, 0.0F);
            this.PelvicFinLeft = new ModelRenderer(this, 34, 42);
            this.PelvicFinLeft.setPos(1.7F, 2.4F, 3.2F);
            this.PelvicFinLeft.addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PelvicFinLeft, 0.7285004590772052F, 0.0F, 0.0F);
            this.NoseL = new ModelRenderer(this, 0, 20);
            this.NoseL.setPos(0.0F, 0.8F, -4.8F);
            this.NoseL.addBox(-0.3F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NoseL, -0.11728612207217244F, 0.0F, 0.0F);
            this.PelvicFinRight = new ModelRenderer(this, 34, 42);
            this.PelvicFinRight.setPos(-1.7F, 2.4F, 3.2F);
            this.PelvicFinRight.addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PelvicFinRight, 0.7285004590772052F, 0.0F, 0.0F);
            this.PectoralFinLeft = new ModelRenderer(this, 0, 43);
            this.PectoralFinLeft.setPos(1.5F, 0.3F, -2.4F);
            this.PectoralFinLeft.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft, -0.3642502295386026F, 0.4098033003787853F, 0.0F);
            this.AnalFin = new ModelRenderer(this, 50, 39);
            this.AnalFin.setPos(0.0F, 4.0F, 4.0F);
            this.AnalFin.addBox(0.0F, 0.0F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(AnalFin, 1.1372566045153711F, 0.0F, 0.0F);
            this.NoseR = new ModelRenderer(this, 0, 20);
            this.NoseR.setPos(0.0F, 0.0F, 0.0F);
            this.NoseR.addBox(-0.7F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 20, 46);
            this.Hips.setPos(0.0F, -0.8F, 2.7F);
            this.Hips.addBox(-2.0F, -3.0F, 0.0F, 4.0F, 6.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.0781907508222411F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 24, 12);
            this.Head.setPos(0.0F, -1.9F, -2.5F);
            this.Head.addBox(-1.0F, 0.0F, -5.0F, 2.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.11030481172209784F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 45, 15);
            this.Tail2.setPos(0.0F, 1.8F, 7.0F);
            this.Tail2.addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.03490658503988659F, 0.0F, 0.0F);
            this.Face = new ModelRenderer(this, 24, 20);
            this.Face.setPos(0.0F, 0.1F, -4.3F);
            this.Face.addBox(-0.5F, 0.0F, -3.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Face, 1.4014994426146683F, 0.0F, 0.0F);
            this.PectoralFinRight = new ModelRenderer(this, 0, 43);
            this.PectoralFinRight.setPos(-1.5F, 0.3F, -2.4F);
            this.PectoralFinRight.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight, -0.3642502295386026F, -0.4098033003787853F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 31);
            this.Body.setPos(0.0F, 20.37F, -8.4F);
            this.Body.addBox(-1.5F, -3.0F, -3.5F, 3.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.0781907508222411F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 44, 25);
            this.Tail1.setPos(0.0F, -2.7F, 12.0F);
            this.Tail1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.03490658503988659F, 0.0F, 0.0F);
            this.Forehead = new ModelRenderer(this, 24, 5);
            this.Forehead.setPos(0.0F, 0.0F, -4.5F);
            this.Forehead.addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, -1.3208651832356306F, 0.0F, 0.0F);
            this.Tail1.addChild(this.DorsalFin);
            this.Body.addChild(this.BodyTop);
            this.Tail2.addChild(this.TailFinBottom);
            this.NoseL.addChild(this.Mouth);
            this.Tail2.addChild(this.TailFinTop);
            this.NoseL.addChild(this.Teeth);
            this.NoseL.addChild(this.Snout);
            this.Hips.addChild(this.PelvicFinLeft);
            this.Head.addChild(this.NoseL);
            this.Hips.addChild(this.PelvicFinRight);
            this.Body.addChild(this.PectoralFinLeft);
            this.Tail1.addChild(this.AnalFin);
            this.NoseL.addChild(this.NoseR);
            this.Body.addChild(this.Hips);
            this.Body.addChild(this.Head);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.Face);
            this.Body.addChild(this.PectoralFinRight);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.Forehead);
            this.saveBase();

        }

        @Override
        public void setupAnim(AlligatorGarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Tail1.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.5F;
            this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.Tail1.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F;
            this.PectoralFinLeft.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.409F;
            this.PectoralFinRight.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.409F;
            this.Mouth.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.3F) * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 1.0F;
                float degree = 1.5F;
                this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
                this.Tail1.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * -0.9F) * limbSwingAmount * 0.5F;
                this.Tail2.yRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 2.5F) * limbSwingAmount * 0.5F;

              }
        }
    }

    public static class Child extends AlligatorGarModel {
        public ModelRenderer Tail;
        public ModelRenderer PelvicFinLeft;
        public ModelRenderer PectoralFinLeft;
        public ModelRenderer Head;
        public ModelRenderer PectoralFinRight;
        public ModelRenderer PelvicFinRight;
        public ModelRenderer TailFinTop;
        public ModelRenderer TailFinBottom;
        public ModelRenderer DorsalFin;
        public ModelRenderer AnalFin;
        public ModelRenderer Snout;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 16;
            this.PectoralFinRight = new ModelRenderer(this, 0, 0);
            this.PectoralFinRight.mirror = true;
            this.PectoralFinRight.setPos(-1.0F, 0.3F, -3.0F);
            this.PectoralFinRight.addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight, -0.3642502295386026F, -0.4098033003787853F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 21.4F, 0.0F);
            this.Body.addBox(-1.0F, -1.5F, -3.5F, 2.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 22, 5);
            this.Snout.setPos(0.0F, 0.2F, -1.5F);
            this.Snout.addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, -0.2F, 0.0F, 0.0F);
            this.PelvicFinRight = new ModelRenderer(this, 0, -1);
            this.PelvicFinRight.setPos(-0.8F, 0.5F, 0.0F);
            this.PelvicFinRight.addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PelvicFinRight, 0.7285004590772052F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 24, 0);
            this.Head.setPos(0.0F, 0.0F, -3.3F);
            this.Head.addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 2.0F, -0.1F, -0.1F, 0.0F);
            this.setRotateAngle(Head, 0.11728612207217244F, 0.0F, 0.0F);
            this.TailFinBottom = new ModelRenderer(this, 4, 11);
            this.TailFinBottom.setPos(0.0F, 0.5F, 2.5F);
            this.TailFinBottom.addBox(0.0F, 0.0F, -1.5F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinBottom, 1.4440853858158529F, 0.0F, 0.0F);
            this.PelvicFinLeft = new ModelRenderer(this, 0, -1);
            this.PelvicFinLeft.setPos(0.8F, 0.5F, 0.0F);
            this.PelvicFinLeft.addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PelvicFinLeft, 0.7285004590772052F, 0.0F, 0.0F);
            this.DorsalFin = new ModelRenderer(this, 0, 10);
            this.DorsalFin.setPos(0.0F, -0.9F, -1.9F);
            this.DorsalFin.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(DorsalFin, 1.8018778824746906F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 22, 9);
            this.TopSnout.setPos(0.0F, 0.0F, -2.8F);
            this.TopSnout.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.23457224414434488F, 0.0F, 0.0F);
            this.PectoralFinLeft = new ModelRenderer(this, 0, 0);
            this.PectoralFinLeft.setPos(1.0F, 0.3F, -3.0F);
            this.PectoralFinLeft.addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft, -0.3642502295386026F, 0.4098033003787853F, 0.0F);
            this.Mouth = new ModelRenderer(this, 16, 12);
            this.Mouth.setPos(0.0F, 0.8F, 0.0F);
            this.Mouth.addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, -0.1F, 0.0F);
            this.setRotateAngle(Mouth, -0.23457224414434488F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 13, 0);
            this.Tail.setPos(0.0F, 0.0F, 3.5F);
            this.Tail.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.AnalFin = new ModelRenderer(this, 0, 2);
            this.AnalFin.setPos(0.0F, 0.6F, -1.0F);
            this.AnalFin.addBox(0.0F, 0.0F, -1.5F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(AnalFin, 1.1372566045153711F, 0.0F, 0.0F);
            this.TailFinTop = new ModelRenderer(this, 8, 11);
            this.TailFinTop.setPos(0.0F, -0.7F, 2.5F);
            this.TailFinTop.addBox(0.0F, 0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop, 1.6845917354353828F, 0.0F, 0.0F);
            this.Body.addChild(this.PectoralFinRight);
            this.Head.addChild(this.Snout);
            this.Body.addChild(this.PelvicFinRight);
            this.Body.addChild(this.Head);
            this.Tail.addChild(this.TailFinBottom);
            this.Body.addChild(this.PelvicFinLeft);
            this.Tail.addChild(this.DorsalFin);
            this.Snout.addChild(this.TopSnout);
            this.Body.addChild(this.PectoralFinLeft);
            this.Snout.addChild(this.Mouth);
            this.Body.addChild(this.Tail);
            this.Tail.addChild(this.AnalFin);
            this.Tail.addChild(this.TailFinTop);
            this.saveBase();

        }

        @Override
        public void setupAnim(AlligatorGarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            limbSwing *= 2.0F;
            limbSwingAmount = 0.15F;
            float speed = 1.2F;
            float degree = 1.0F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 0.7F;
                  } else {
             }
        }
    }
}
