package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.BlacktipSharkEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class BlacktipSharkModel extends ZawaBaseModel<BlacktipSharkEntity> {
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

    public static class Adult extends BlacktipSharkModel {
        public ModelRenderer Tail1;
        public ModelRenderer BackFin1;
        public ModelRenderer LeftPectoralFin1;
        public ModelRenderer RightPectoralFin1;
        public ModelRenderer Neck;
        public ModelRenderer Tail2;
        public ModelRenderer UnderFin2;
        public ModelRenderer UnderFin3;
        public ModelRenderer Tail3;
        public ModelRenderer UnderFin1;
        public ModelRenderer BackFin5;
        public ModelRenderer TailFinTop1;
        public ModelRenderer TailFinTop2;
        public ModelRenderer TailFinTop3;
        public ModelRenderer BackFin3;
        public ModelRenderer LeftPectoralFin2;
        public ModelRenderer LeftPectoralFin3;
        public ModelRenderer RightPectoralFin2;
        public ModelRenderer RightPectoralFin3;
        public ModelRenderer Mouth1;
        public ModelRenderer Head;
        public ModelRenderer Mouth2;
        public ModelRenderer Nose;

        public Adult() {
            this.texWidth = 128;
            this.texHeight = 44;
            this.Tail1 = new ModelRenderer(this, 38, 0);
            this.Tail1.setPos(0.5F, 0.3F, -2.4F);
            this.Tail1.addBox(-3.5F, -3.0F, 0.0F, 7.0F, 6.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.LeftPectoralFin3 = new ModelRenderer(this, 21, 18);
            this.LeftPectoralFin3.setPos(-1.31F, -0.02F, 2.0F);
            this.LeftPectoralFin3.addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftPectoralFin3, 0.0F, 0.3431317282789241F, 0.0F);
            this.RightPectoralFin1 = new ModelRenderer(this, 64, 0);
            this.RightPectoralFin1.setPos(-2.5F, 1.5F, -4.8F);
            this.RightPectoralFin1.addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightPectoralFin1, 0.18203784630933073F, 1.1838568635856868F, 2.458645232063257F);
            this.UnderFin3 = new ModelRenderer(this, 76, 0);
            this.UnderFin3.setPos(-2.3F, 1.2F, 8.0F);
            this.UnderFin3.addBox(-0.5F, -0.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFin3, -0.500909508638178F, -0.591841146688116F, 0.0F);
            this.Mouth1 = new ModelRenderer(this, 105, 23);
            this.Mouth1.setPos(0.01F, -0.21F, -5.0F);
            this.Mouth1.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth1, 0.04555309164612875F, 0.0F, 0.0F);
            this.UnderFin1 = new ModelRenderer(this, 27, 0);
            this.UnderFin1.setPos(0.0F, 1.5F, 9.4F);
            this.UnderFin1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFin1, 0.591841146688116F, 0.0F, 0.0F);
            this.TailFinTop3 = new ModelRenderer(this, 0, 18);
            this.TailFinTop3.setPos(-0.5F, 0.5F, 1.9F);
            this.TailFinTop3.addBox(-0.5F, -1.0F, -4.0F, 2.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop3, 1.5481069932557485F, 0.0F, 0.0F);
            this.RightPectoralFin3 = new ModelRenderer(this, 37, 19);
            this.RightPectoralFin3.setPos(-1.31F, 0.01F, 2.0F);
            this.RightPectoralFin3.addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightPectoralFin3, 0.0F, 0.3431317282789241F, 0.0F);
            this.RightPectoralFin2 = new ModelRenderer(this, 32, 19);
            this.RightPectoralFin2.setPos(-1.01F, 0.01F, 1.4F);
            this.RightPectoralFin2.addBox(-2.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.LeftPectoralFin1 = new ModelRenderer(this, 27, 0);
            this.LeftPectoralFin1.setPos(3.4F, 1.6F, -4.8F);
            this.LeftPectoralFin1.addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftPectoralFin1, 0.0911061832922575F, 1.1838568635856868F, 0.956091342937205F);
            this.Tail2 = new ModelRenderer(this, 64, 13);
            this.Tail2.setPos(0.0F, 0.0F, 4.6F);
            this.Tail2.addBox(-3.0F, -2.5F, 0.0F, 6.0F, 5.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.BackFin5 = new ModelRenderer(this, 64, 0);
            this.BackFin5.setPos(0.0F, 0.2F, 6.6F);
            this.BackFin5.addBox(-1.0F, -7.1F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFin5, -0.6829473549475088F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 37, 27);
            this.Nose.setPos(0.0F, 0.3F, -3.9F);
            this.Nose.addBox(-2.5F, 0.0F, -4.0F, 5.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 21.0F, 0.0F);
            this.Body.addBox(-3.5F, -3.0F, -5.5F, 8.0F, 6.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.UnderFin2 = new ModelRenderer(this, 39, 0);
            this.UnderFin2.setPos(2.3F, 1.2F, 8.0F);
            this.UnderFin2.addBox(-0.5F, -0.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFin2, -0.500909508638178F, 0.591841146688116F, 0.0F);
            this.BackFin1 = new ModelRenderer(this, 0, 0);
            this.BackFin1.setPos(0.5F, -2.2F, -2.4F);
            this.BackFin1.addBox(-1.0F, -7.1F, 0.0F, 2.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFin1, -0.591841146688116F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 84, 0);
            this.Neck.setPos(0.5F, 0.4F, -1.9F);
            this.Neck.addBox(-3.5F, -3.5F, -7.0F, 7.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 88, 13);
            this.Tail3.setPos(0.0F, 0.0F, 10.2F);
            this.Tail3.addBox(-2.5F, -2.0F, 0.0F, 5.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.TailFinTop1 = new ModelRenderer(this, 112, 0);
            this.TailFinTop1.setPos(0.0F, -2.7F, 5.5F);
            this.TailFinTop1.addBox(-1.0F, -5.9F, 0.0F, 2.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop1, -0.8651597048872669F, 0.0F, 0.0F);
            this.TailFinTop2 = new ModelRenderer(this, 119, 10);
            this.TailFinTop2.setPos(0.0F, -0.6F, 1.2F);
            this.TailFinTop2.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop2, 0.13665927909957545F, 0.0F, 0.0F);
            this.LeftPectoralFin2 = new ModelRenderer(this, 16, 18);
            this.LeftPectoralFin2.setPos(-1.01F, -0.01F, 1.4F);
            this.LeftPectoralFin2.addBox(-2.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.BackFin3 = new ModelRenderer(this, 110, 13);
            this.BackFin3.setPos(0.0F, -0.8F, 6.4F);
            this.BackFin3.addBox(-0.5F, -7.0F, -4.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFin3, 0.3642502295386026F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 15, 26);
            this.Head.setPos(0.0F, -3.2F, -6.0F);
            this.Head.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.0911061832922575F, 0.0F, 0.0F);
            this.Mouth2 = new ModelRenderer(this, 49, 19);
            this.Mouth2.setPos(0.5F, 0.4F, -3.3F);
            this.Mouth2.addBox(-2.5F, -0.5F, -4.0F, 4.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth2, -0.2275909337942703F, 0.0F, 0.0F);
            this.Body.addChild(this.Tail1);
            this.LeftPectoralFin1.addChild(this.LeftPectoralFin3);
            this.Body.addChild(this.RightPectoralFin1);
            this.Tail1.addChild(this.UnderFin3);
            this.Neck.addChild(this.Mouth1);
            this.Tail2.addChild(this.UnderFin1);
            this.TailFinTop1.addChild(this.TailFinTop3);
            this.RightPectoralFin1.addChild(this.RightPectoralFin3);
            this.RightPectoralFin1.addChild(this.RightPectoralFin2);
            this.Body.addChild(this.LeftPectoralFin1);
            this.Tail1.addChild(this.Tail2);
            this.Tail2.addChild(this.BackFin5);
            this.Head.addChild(this.Nose);
            this.Tail1.addChild(this.UnderFin2);
            this.Body.addChild(this.BackFin1);
            this.Body.addChild(this.Neck);
            this.Tail2.addChild(this.Tail3);
            this.Tail3.addChild(this.TailFinTop1);
            this.TailFinTop1.addChild(this.TailFinTop2);
            this.LeftPectoralFin1.addChild(this.LeftPectoralFin2);
            this.BackFin1.addChild(this.BackFin3);
            this.Neck.addChild(this.Head);
            this.Mouth1.addChild(this.Mouth2);
            this.saveBase();

        }

        @Override
        public void setupAnim(BlacktipSharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Tail2.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            this.loadBase();
            float speed = 1.5F;
            float degree = 1.0F;
            this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.Tail2.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F;
            this.LeftPectoralFin1.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.409F;
            this.RightPectoralFin1.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.409F;
            this.Mouth1.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.3F) * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 1.5F;
                float degree = 1.0F;
                this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
                this.Tail2.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * -0.9F) * limbSwingAmount * 0.5F;
                this.Tail3.yRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 2.5F) * limbSwingAmount * 0.5F;
            }
        }
    }

    public static class Child extends BlacktipSharkModel {
        public ModelRenderer Tail1;
        public ModelRenderer BackFin1;
        public ModelRenderer LeftPectoralFin1;
        public ModelRenderer RightPectoralFin1;
        public ModelRenderer Neck;
        public ModelRenderer Tail2;
        public ModelRenderer UnderFin2;
        public ModelRenderer UnderFin3;
        public ModelRenderer Tail3;
        public ModelRenderer UnderFin1;
        public ModelRenderer BackFin5;
        public ModelRenderer TailFinTop1;
        public ModelRenderer TailFinTop3;
        public ModelRenderer LeftPectoralFin2;
        public ModelRenderer LeftPectoralFin3;
        public ModelRenderer RightPectoralFin2;
        public ModelRenderer RightPectoralFin3;
        public ModelRenderer Mouth1;
        public ModelRenderer Head;
        public ModelRenderer Mouth2;
        public ModelRenderer Nose;

        public Child() {
            this.texWidth = 128;
            this.texHeight = 44;
            this.Mouth1 = new ModelRenderer(this, 105, 23);
            this.Mouth1.setPos(0.01F, -0.21F, -5.1F);
            this.Mouth1.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth1, 0.04555309164612875F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 38, 0);
            this.Tail1.setPos(0.0F, 0.3F, -2.8F);
            this.Tail1.addBox(-3.5F, -3.5F, 0.0F, 7.0F, 7.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.TailFinTop3 = new ModelRenderer(this, 0, 18);
            this.TailFinTop3.setPos(-0.5F, -0.8F, 2.5F);
            this.TailFinTop3.addBox(-0.5F, -1.0F, -4.0F, 2.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop3, 1.5481069932557485F, 0.0F, 0.0F);
            this.RightPectoralFin3 = new ModelRenderer(this, 37, 19);
            this.RightPectoralFin3.setPos(-1.31F, 0.01F, 2.0F);
            this.RightPectoralFin3.addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightPectoralFin3, 0.0F, 0.3431317282789241F, 0.0F);
            this.BackFin1 = new ModelRenderer(this, 0, 0);
            this.BackFin1.setPos(0.5F, -1.6F, -1.8F);
            this.BackFin1.addBox(-1.0F, -7.1F, 0.0F, 2.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFin1, -0.591841146688116F, 0.0F, 0.0F);
            this.BackFin5 = new ModelRenderer(this, 64, 0);
            this.BackFin5.setPos(0.0F, 0.2F, 6.6F);
            this.BackFin5.addBox(-1.0F, -7.1F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFin5, -0.6829473549475088F, 0.0F, 0.0F);
            this.RightPectoralFin2 = new ModelRenderer(this, 32, 19);
            this.RightPectoralFin2.setPos(-1.01F, 0.01F, 1.4F);
            this.RightPectoralFin2.addBox(-2.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 84, 0);
            this.Neck.setPos(0.0F, 0.4F, -0.6F);
            this.Neck.addBox(-3.5F, -3.5F, -7.0F, 7.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth2 = new ModelRenderer(this, 49, 19);
            this.Mouth2.setPos(0.5F, 0.4F, -3.3F);
            this.Mouth2.addBox(-2.5F, -0.5F, -4.0F, 4.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth2, -0.2275909337942703F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 88, 13);
            this.Tail3.setPos(0.0F, 0.0F, 10.2F);
            this.Tail3.addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 20.5F, -0.6F);
            this.Body.addBox(-4.0F, -3.5F, -5.5F, 8.0F, 7.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 37, 27);
            this.Nose.setPos(0.0F, 0.3F, -4.0F);
            this.Nose.addBox(-2.5F, 0.0F, -4.0F, 5.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, -0.04555309164612875F, 0.0F, 0.0F);
            this.RightPectoralFin1 = new ModelRenderer(this, 64, 0);
            this.RightPectoralFin1.setPos(-2.5F, 2.1F, -4.8F);
            this.RightPectoralFin1.addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightPectoralFin1, 0.18203784630933073F, 1.1838568635856868F, 2.458645232063257F);
            this.LeftPectoralFin3 = new ModelRenderer(this, 21, 18);
            this.LeftPectoralFin3.setPos(-1.31F, -0.02F, 2.0F);
            this.LeftPectoralFin3.addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftPectoralFin3, 0.0F, 0.3431317282789241F, 0.0F);
            this.TailFinTop1 = new ModelRenderer(this, 112, 0);
            this.TailFinTop1.setPos(0.0F, -2.6F, 4.5F);
            this.TailFinTop1.addBox(-1.0F, -7.0F, 0.0F, 2.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop1, -0.8651597048872669F, 0.0F, 0.0F);
            this.UnderFin3 = new ModelRenderer(this, 76, 0);
            this.UnderFin3.setPos(-2.3F, 2.2F, 8.0F);
            this.UnderFin3.addBox(-0.5F, -0.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFin3, -0.500909508638178F, -0.591841146688116F, 0.0F);
            this.LeftPectoralFin2 = new ModelRenderer(this, 16, 18);
            this.LeftPectoralFin2.setPos(-1.01F, -0.01F, 1.4F);
            this.LeftPectoralFin2.addBox(-2.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.LeftPectoralFin1 = new ModelRenderer(this, 27, 0);
            this.LeftPectoralFin1.setPos(3.4F, 2.1F, -4.8F);
            this.LeftPectoralFin1.addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftPectoralFin1, 0.0911061832922575F, 1.1838568635856868F, 0.956091342937205F);
            this.UnderFin2 = new ModelRenderer(this, 39, 0);
            this.UnderFin2.setPos(2.3F, 2.2F, 8.0F);
            this.UnderFin2.addBox(-0.5F, -0.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFin2, -0.500909508638178F, 0.591841146688116F, 0.0F);
            this.UnderFin1 = new ModelRenderer(this, 27, 0);
            this.UnderFin1.setPos(0.0F, 1.5F, 9.4F);
            this.UnderFin1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFin1, 0.591841146688116F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 64, 13);
            this.Tail2.setPos(0.0F, 0.0F, 3.7F);
            this.Tail2.addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 15, 26);
            this.Head.setPos(0.0F, -3.2F, -5.5F);
            this.Head.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.0911061832922575F, 0.0F, 0.0F);
            this.Neck.addChild(this.Mouth1);
            this.Body.addChild(this.Tail1);
            this.TailFinTop1.addChild(this.TailFinTop3);
            this.RightPectoralFin1.addChild(this.RightPectoralFin3);
            this.Body.addChild(this.BackFin1);
            this.Tail2.addChild(this.BackFin5);
            this.RightPectoralFin1.addChild(this.RightPectoralFin2);
            this.Body.addChild(this.Neck);
            this.Mouth1.addChild(this.Mouth2);
            this.Tail2.addChild(this.Tail3);
            this.Head.addChild(this.Nose);
            this.Body.addChild(this.RightPectoralFin1);
            this.LeftPectoralFin1.addChild(this.LeftPectoralFin3);
            this.Tail3.addChild(this.TailFinTop1);
            this.Tail1.addChild(this.UnderFin3);
            this.LeftPectoralFin1.addChild(this.LeftPectoralFin2);
            this.Body.addChild(this.LeftPectoralFin1);
            this.Tail1.addChild(this.UnderFin2);
            this.Tail2.addChild(this.UnderFin1);
            this.Tail1.addChild(this.Tail2);
            this.Neck.addChild(this.Head);
            this.saveBase();

        }

        @Override
        public void setupAnim(BlacktipSharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
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
