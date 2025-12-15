package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.NapoleonWrasseEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class NapoleonWrasseModel extends ZawaBaseModel<NapoleonWrasseEntity> {
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

    public static class Adult extends NapoleonWrasseModel {
        public ModelRenderer Tail;
        public ModelRenderer BackFin;
        public ModelRenderer PectorialFinLeft;
        public ModelRenderer PectorialFinRight;
        public ModelRenderer UnderFinLeft;
        public ModelRenderer UnderFinRight;
        public ModelRenderer Head;
        public ModelRenderer TailFinTop;
        public ModelRenderer AnalFin;
        public ModelRenderer TailFinBottom;
        public ModelRenderer Hump;
        public ModelRenderer Mouth;
        public ModelRenderer Jaw;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.Tail = new ModelRenderer(this, 20, 0);
            this.Tail.setPos(0.0F, 0.0F, 6.5F);
            this.Tail.addBox(-1.5F, -2.0F, 0.0F, 3.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.PectorialFinRight = new ModelRenderer(this, 19, 28);
            this.PectorialFinRight.mirror = true;
            this.PectorialFinRight.setPos(-1.3F, 1.0F, -3.5F);
            this.PectorialFinRight.addBox(-4.5F, -1.0F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectorialFinRight, -0.0911061832922575F, 0.7740534966278743F, 0.27314402127920984F);
            this.PectorialFinLeft = new ModelRenderer(this, 19, 28);
            this.PectorialFinLeft.setPos(1.3F, 1.0F, -3.5F);
            this.PectorialFinLeft.addBox(-0.5F, -1.0F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectorialFinLeft, -0.0911061832922575F, -0.7740534966278743F, -0.27314402127920984F);
            this.UnderFinRight = new ModelRenderer(this, 21, 20);
            this.UnderFinRight.mirror = true;
            this.UnderFinRight.setPos(-1.4F, 3.9F, -3.5F);
            this.UnderFinRight.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFinRight, 0.500909508638178F, -0.18203784630933073F, 0.0911061832922575F);
            this.TailFinTop = new ModelRenderer(this, 32, 16);
            this.TailFinTop.setPos(0.0F, -0.9F, 4.4F);
            this.TailFinTop.addBox(0.0F, -1.0F, -1.0F, 0.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop, 0.13665927909957545F, 0.0F, 0.0F);
            this.BackFin = new ModelRenderer(this, 36, 3);
            this.BackFin.setPos(0.0F, -4.0F, 3.3F);
            this.BackFin.addBox(0.0F, -1.5F, -2.8F, 0.0F, 4.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFin, 0.04555309164612875F, 0.0F, 0.0F);
            this.UnderFinLeft = new ModelRenderer(this, 21, 20);
            this.UnderFinLeft.setPos(1.4F, 3.9F, -3.5F);
            this.UnderFinLeft.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFinLeft, 0.500909508638178F, 0.18203784630933073F, -0.0911061832922575F);
            this.AnalFin = new ModelRenderer(this, 0, 20);
            this.AnalFin.setPos(0.0F, 2.3F, -2.6F);
            this.AnalFin.addBox(0.0F, -1.5F, -0.5F, 0.0F, 4.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(AnalFin, -0.27314402127920984F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 0.0F, 0.0F);
            this.Body.addBox(-2.0F, -4.5F, -5.0F, 4.0F, 9.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.Hump = new ModelRenderer(this, 0, 0);
            this.Hump.setPos(0.0F, -3.4F, -2.2F);
            this.Hump.addBox(-1.0F, -0.7F, -1.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hump, 0.18203784630933073F, 0.0F, 0.0F);
            this.Jaw = new ModelRenderer(this, 0, 7);
            this.Jaw.setPos(0.0F, 3.0F, -1.9F);
            this.Jaw.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.2275909337942703F, 0.0F, 0.0F);
            this.TailFinBottom = new ModelRenderer(this, 32, 21);
            this.TailFinBottom.setPos(0.0F, 0.6F, 0.0F);
            this.TailFinBottom.addBox(0.0F, 0.5F, -0.5F, 0.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinBottom, -0.3642502295386026F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 50, 0);
            this.Mouth.setPos(0.0F, 0.3F, -1.8F);
            this.Mouth.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.500909508638178F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 36, 0);
            this.Head.setPos(0.0F, 0.3F, -4.5F);
            this.Head.addBox(-1.5F, -4.0F, -2.7F, 3.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.04555309164612875F, 0.0F, 0.0F);
            this.Body.addChild(this.Tail);
            this.Body.addChild(this.PectorialFinRight);
            this.Body.addChild(this.PectorialFinLeft);
            this.Body.addChild(this.UnderFinRight);
            this.Tail.addChild(this.TailFinTop);
            this.Body.addChild(this.BackFin);
            this.Body.addChild(this.UnderFinLeft);
            this.Tail.addChild(this.AnalFin);
            this.Head.addChild(this.Hump);
            this.Head.addChild(this.Jaw);
            this.TailFinTop.addChild(this.TailFinBottom);
            this.Head.addChild(this.Mouth);
            this.Body.addChild(this.Head);
            this.saveBase();

        }

        @Override
        public void setupAnim(NapoleonWrasseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Tail.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 2.0F;
            float degree = 3.0F;
            this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.Tail.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F;
            this.PectorialFinLeft.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.409F;
            this.PectorialFinRight.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.409F;
            this.Mouth.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.3F) * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 2.0F;
                float degree = 3.0F;
                this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
                this.Tail.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * -0.9F) * limbSwingAmount * 0.5F;
                this.TailFinTop.yRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 2.5F) * limbSwingAmount * 0.5F;
            }
        }
    }

    public static class Child extends NapoleonWrasseModel {
        public ModelRenderer Head;
        public ModelRenderer Tail;
        public ModelRenderer DorsalFin;
        public ModelRenderer AnalFin;
        public ModelRenderer PelvicFinLeft;
        public ModelRenderer PelvicFinRight;
        public ModelRenderer PectoralFinLeft;
        public ModelRenderer PectoralFinRight;
        public ModelRenderer Hump;
        public ModelRenderer Mouth;
        public ModelRenderer Jaw;
        public ModelRenderer TailFinTop;
        public ModelRenderer TailFinBottom;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.PectoralFinRight = new ModelRenderer(this, 16, 19);
            this.PectoralFinRight.setPos(-1.9F, -0.4F, -1.0F);
            this.PectoralFinRight.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight, 0.0F, -0.35185837453889574F, 0.0F);
            this.TailFinBottom = new ModelRenderer(this, 0, 0);
            this.TailFinBottom.setPos(0.0F, 0.6F, 2.6F);
            this.TailFinBottom.addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinBottom, -0.27366763203903305F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 8, 19);
            this.Mouth.setPos(0.0F, 0.6F, -1.0F);
            this.Mouth.addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.5347688721584182F, 0.0F, 0.0F);
            this.PelvicFinRight = new ModelRenderer(this, 4, 21);
            this.PelvicFinRight.setPos(-1.3F, 1.7F, -1.9F);
            this.PelvicFinRight.addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PelvicFinRight, 0.19547687289441354F, -0.1563815016444822F, 0.23457224414434488F);
            this.DorsalFin = new ModelRenderer(this, 0, 5);
            this.DorsalFin.setPos(0.0F, -1.0F, 2.5F);
            this.DorsalFin.addBox(0.0F, -3.0F, -3.5F, 0.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(DorsalFin, 0.11728612207217244F, 0.0F, 0.0F);
            this.AnalFin = new ModelRenderer(this, 15, 0);
            this.AnalFin.setPos(0.0F, 0.3F, 3.9F);
            this.AnalFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(AnalFin, -0.7819074915776542F, 0.0F, 0.0F);
            this.Jaw = new ModelRenderer(this, 15, 0);
            this.Jaw.setPos(0.0F, 1.1F, 0.1F);
            this.Jaw.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, 0.417133684568742F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 11, 12);
            this.Tail.setPos(0.0F, 0.0F, 3.7F);
            this.Tail.addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.TailFinTop = new ModelRenderer(this, 16, 16);
            this.TailFinTop.setPos(-0.01F, -0.7F, 2.55F);
            this.TailFinTop.addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop, 0.27366763203903305F, 0.0F, 0.0F);
            this.PectoralFinLeft = new ModelRenderer(this, 16, 19);
            this.PectoralFinLeft.setPos(1.9F, -0.4F, -1.0F);
            this.PectoralFinLeft.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft, 0.0F, 0.35185837453889574F, 0.0F);
            this.Hump = new ModelRenderer(this, 20, 10);
            this.Hump.setPos(0.0F, -2.0F, -0.2F);
            this.Hump.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hump, 0.27366763203903305F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 15);
            this.Head.setPos(0.0F, 0.4F, -1.8F);
            this.Head.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.05410520514734854F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 0.0F, 0.0F);
            this.Body.addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.PelvicFinLeft = new ModelRenderer(this, 4, 21);
            this.PelvicFinLeft.setPos(1.3F, 2.1F, -1.9F);
            this.PelvicFinLeft.addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PelvicFinLeft, 0.19547687289441354F, 0.1563815016444822F, -0.23457224414434488F);
            this.Body.addChild(this.PectoralFinRight);
            this.Tail.addChild(this.TailFinBottom);
            this.Head.addChild(this.Mouth);
            this.Body.addChild(this.PelvicFinRight);
            this.Body.addChild(this.DorsalFin);
            this.Body.addChild(this.AnalFin);
            this.Mouth.addChild(this.Jaw);
            this.Body.addChild(this.Tail);
            this.Tail.addChild(this.TailFinTop);
            this.Body.addChild(this.PectoralFinLeft);
            this.Head.addChild(this.Hump);
            this.Body.addChild(this.Head);
            this.Body.addChild(this.PelvicFinLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(NapoleonWrasseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
