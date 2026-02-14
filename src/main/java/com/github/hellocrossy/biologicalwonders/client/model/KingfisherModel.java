package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.KingfisherEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class KingfisherModel extends ZawaBaseModel<KingfisherEntity> {
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

    public static class Adult extends KingfisherModel {
        public ModelRenderer TailBase;
        public ModelRenderer LeftWing;
        public ModelRenderer RightWing;
        public ModelRenderer Neck1;
        public ModelRenderer LeftLeg;
        public ModelRenderer RightLeg;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailLeft;
        public ModelRenderer TailRight;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer Neck2Front;
        public ModelRenderer Forehead;
        public ModelRenderer Beak;
        public ModelRenderer Crest;
        public ModelRenderer Mouth;
        public ModelRenderer LeftFoot;
        public ModelRenderer LeftFootLeftToe;
        public ModelRenderer LeftFootRightToe;
        public ModelRenderer RightFoot;
        public ModelRenderer RightFootLeftToe;
        public ModelRenderer RightFootRightToe;

        public Adult() {
            texWidth = 64;
            texHeight = 32;
            this.LeftLeg = new ModelRenderer(this, 0, 25);
            this.LeftLeg.setPos(1.3F, 1.0F, -1.1F);
            this.LeftLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, 0.4825835315185294F, 0.0F, 0.0F);
            this.TailLeft = new ModelRenderer(this, 25, 17);
            this.TailLeft.mirror = true;
            this.TailLeft.setPos(1.4F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, 0.04555309164612875F);
            this.Forehead = new ModelRenderer(this, 12, 0);
            this.Forehead.setPos(0.0F, -1.5F, 1.5F);
            this.Forehead.addBox(-1.0F, -0.7F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.05235987755982988F, 0.0F, 0.0F);
            this.LeftFootLeftToe = new ModelRenderer(this, 4, 30);
            this.LeftFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.Mouth = new ModelRenderer(this, 8, 6);
            this.Mouth.setPos(0.0F, -4.0F, -1.0F);
            this.Mouth.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.10890854132970453F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 0, 6);
            this.Neck2.setPos(0.0F, 0.0F, 1.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.27035149713918F, 0.0F, 0.0F);
            this.RightWing = new ModelRenderer(this, 12, 24);
            this.RightWing.setPos(-1.6F, -1.4F, 1.1F);
            this.RightWing.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWing, 0.09581857193974705F, 0.0911061832922575F, -0.0911061832922575F);
            this.RightFootLeftToe = new ModelRenderer(this, 4, 30);
            this.RightFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.RightFootRightToe = new ModelRenderer(this, 4, 30);
            this.RightFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootRightToe, 0.0F, 0.0F, -0.591841146688116F);
            this.LeftFootRightToe = new ModelRenderer(this, 4, 30);
            this.LeftFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootRightToe, 0.0F, 0.0F, -0.591841146688116F);
            this.RightFoot = new ModelRenderer(this, 0, 28);
            this.RightFoot.setPos(0.0F, 0.2F, -1.7F);
            this.RightFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.5384340808981534F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 16);
            this.Body.setPos(0.0F, 20.3F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.5726425515477893F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, 0.6F, 2.3F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3909537457888271F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 24, 22);
            this.TailMiddle.setPos(0.0F, 1.0F, 0.99F);
            this.TailMiddle.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 20, 28);
            this.TailBase.setPos(0.0F, 1.5F, 1.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.27401668923415834F, 0.0F, 0.0F);
            this.Neck2Front = new ModelRenderer(this, 12, 6);
            this.Neck2Front.setPos(0.0F, 1.8F, 3.2F);
            this.Neck2Front.addBox(-1.02F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2Front, 0.6679375127277132F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 12);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.9761626559667506F, 0.0F, 0.0F);
            this.TailRight = new ModelRenderer(this, 25, 17);
            this.TailRight.setPos(-1.4F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, -0.04555309164612875F);
            this.LeftWing = new ModelRenderer(this, 12, 24);
            this.LeftWing.mirror = true;
            this.LeftWing.setPos(1.6F, -1.4F, 1.1F);
            this.LeftWing.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWing, 0.09581857193974705F, -0.0911061832922575F, 0.0911061832922575F);
            this.Crest = new ModelRenderer(this, 20, 0);
            this.Crest.setPos(0.0F, 0.2F, 0.3F);
            this.Crest.addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest, 1.2487831330651644F, 0.0F, 0.0F);
            this.Beak = new ModelRenderer(this, 8, 6);
            this.Beak.setPos(0.0F, -0.7F, 0.4F);
            this.Beak.addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak, 0.19547687289441354F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 0, 25);
            this.RightLeg.setPos(-1.3F, 1.0F, -1.1F);
            this.RightLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, 0.48223445767864725F, 0.0F, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 0, 28);
            this.LeftFoot.setPos(0.0F, 0.2F, -1.7F);
            this.LeftFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFoot, 0.5384340808981534F, 0.0F, 0.0F);
            this.Body.addChild(this.LeftLeg);
            this.TailMiddle.addChild(this.TailLeft);
            this.Head.addChild(this.Forehead);
            this.LeftFoot.addChild(this.LeftFootLeftToe);
            this.Beak.addChild(this.Mouth);
            this.Neck1.addChild(this.Neck2);
            this.Body.addChild(this.RightWing);
            this.RightFoot.addChild(this.RightFootLeftToe);
            this.RightFoot.addChild(this.RightFootRightToe);
            this.LeftFoot.addChild(this.LeftFootRightToe);
            this.RightLeg.addChild(this.RightFoot);
            this.Neck2.addChild(this.Head);
            this.TailBase.addChild(this.TailMiddle);
            this.Body.addChild(this.TailBase);
            this.Neck2.addChild(this.Neck2Front);
            this.Body.addChild(this.Neck1);
            this.TailMiddle.addChild(this.TailRight);
            this.Body.addChild(this.LeftWing);
            this.Head.addChild(this.Crest);
            this.Head.addChild(this.Beak);
            this.Body.addChild(this.RightLeg);
            this.LeftLeg.addChild(this.LeftFoot);
            this.saveBase();
        }

        @Override
        public void setupAnim(KingfisherEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, entity.tickCount, 0.3F, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.39F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.976F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.15F) * 0.5F - 0.27F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.39F;

            this.TailBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.274F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }
    }

    public static class Flying extends KingfisherModel {
        public ModelRenderer TailBase;
        public ModelRenderer LeftLeg;
        public ModelRenderer RightLeg;
        public ModelRenderer LeftWing1;
        public ModelRenderer RightWing1;
        public ModelRenderer Neck1;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailLeft;
        public ModelRenderer TailRight;
        public ModelRenderer LeftFoot;
        public ModelRenderer LeftFootLeftToe;
        public ModelRenderer LeftFootRightToe;
        public ModelRenderer RightFoot;
        public ModelRenderer RightFootLeftToe;
        public ModelRenderer RightFootRightToe;
        public ModelRenderer LeftWing2;
        public ModelRenderer LeftWingFeather1;
        public ModelRenderer LeftWingFeather2;
        public ModelRenderer LeftWingFeather3;
        public ModelRenderer LeftWingFeather4;
        public ModelRenderer LeftWingFeather5;
        public ModelRenderer LeftWingFeather6;
        public ModelRenderer LeftWingFeather7;
        public ModelRenderer LeftWingFeather8;
        public ModelRenderer RightWing2;
        public ModelRenderer RightWingFeather1;
        public ModelRenderer RightWingFeather2;
        public ModelRenderer RightWingFeather3;
        public ModelRenderer RightWingFeather4;
        public ModelRenderer RightWingFeather5;
        public ModelRenderer RightWingFeather6;
        public ModelRenderer RightWingFeather7;
        public ModelRenderer RightWingFeather8;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer Neck2Front;
        public ModelRenderer Forehead;
        public ModelRenderer Beak;
        public ModelRenderer Mouth;

        public Flying() {
            texWidth = 64;
            texHeight = 32;
            this.LeftWingFeather6 = new ModelRenderer(this, 39, 12);
            this.LeftWingFeather6.setPos(0.0F, 0.0F, -0.01F);
            this.LeftWingFeather6.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather6, 0.0F, 0.0F, 0.2275909337942703F);
            this.Neck2 = new ModelRenderer(this, 0, 6);
            this.Neck2.setPos(0.0F, 0.0F, 1.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.27035149713918F, 0.0F, 0.0F);
            this.RightWingFeather5 = new ModelRenderer(this, 52, 12);
            this.RightWingFeather5.setPos(0.0F, 0.0F, -0.01F);
            this.RightWingFeather5.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather5, 0.0F, 0.0F, -0.2275909337942703F);
            this.LeftFootLeftToe = new ModelRenderer(this, 4, 30);
            this.LeftFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.LeftFootRightToe = new ModelRenderer(this, 4, 30);
            this.LeftFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootRightToe, 0.0F, 0.0F, -0.591841146688116F);
            this.Beak = new ModelRenderer(this, 8, 6);
            this.Beak.setPos(0.0F, -0.7F, 0.4F);
            this.Beak.addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak, 0.19547687289441354F, 0.0F, 0.0F);
            this.RightWing2 = new ModelRenderer(this, 56, 6);
            this.RightWing2.setPos(-2.0F, 4.0F, -0.01F);
            this.RightWing2.addBox(-3.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWing2, 0.0F, 0.0F, 0.3642502295386026F);
            this.RightWingFeather2 = new ModelRenderer(this, 52, 12);
            this.RightWingFeather2.setPos(0.0F, 0.0F, -0.01F);
            this.RightWingFeather2.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather2, 0.0F, 0.0F, -0.2275909337942703F);
            this.RightWing1 = new ModelRenderer(this, 58, 0);
            this.RightWing1.setPos(-1.9F, -1.9F, 1.0F);
            this.RightWing1.addBox(-2.0F, 0.0F, -0.1F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWing1, 0.0F, 0.0F, -0.18203784630933073F);
            this.LeftWingFeather8 = new ModelRenderer(this, 41, 18);
            this.LeftWingFeather8.setPos(0.0F, 0.0F, -0.01F);
            this.LeftWingFeather8.addBox(0.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather8, 0.0F, 0.0F, 0.2275909337942703F);
            this.RightWingFeather3 = new ModelRenderer(this, 52, 12);
            this.RightWingFeather3.setPos(0.0F, 0.0F, -0.01F);
            this.RightWingFeather3.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather3, 0.0F, 0.0F, -0.2275909337942703F);
            this.LeftWingFeather3 = new ModelRenderer(this, 39, 12);
            this.LeftWingFeather3.setPos(0.0F, 0.0F, -0.01F);
            this.LeftWingFeather3.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather3, 0.0F, 0.0F, 0.2275909337942703F);
            this.Body = new ModelRenderer(this, 0, 16);
            this.Body.setPos(0.0F, 20.5F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.3658947098950176F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 24, 22);
            this.TailMiddle.setPos(0.0F, 1.0F, -0.01F);
            this.TailMiddle.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.RightWingFeather1 = new ModelRenderer(this, 52, 12);
            this.RightWingFeather1.setPos(-3.0F, -4.0F, -0.01F);
            this.RightWingFeather1.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather1, 0.0F, 0.0F, -0.27314402127920984F);
            this.RightFootRightToe = new ModelRenderer(this, 4, 30);
            this.RightFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootRightToe, 0.0F, 0.0F, -0.591841146688116F);
            this.LeftWingFeather7 = new ModelRenderer(this, 41, 15);
            this.LeftWingFeather7.setPos(0.0F, 0.0F, -0.01F);
            this.LeftWingFeather7.addBox(0.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather7, 0.0F, 0.0F, 0.2275909337942703F);
            this.Neck2Front = new ModelRenderer(this, 12, 6);
            this.Neck2Front.setPos(0.0F, 1.8F, 3.2F);
            this.Neck2Front.addBox(-1.02F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2Front, 0.6679375127277132F, 0.0F, 0.0F);
            this.Forehead = new ModelRenderer(this, 12, 0);
            this.Forehead.setPos(0.0F, -1.5F, 1.5F);
            this.Forehead.addBox(-1.0F, -0.7F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.05235987755982988F, 0.0F, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 0, 28);
            this.LeftFoot.setPos(0.0F, 0.2F, -1.7F);
            this.LeftFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFoot, 0.5384340808981534F, 0.0F, 0.0F);
            this.LeftWingFeather4 = new ModelRenderer(this, 39, 12);
            this.LeftWingFeather4.setPos(0.0F, 0.0F, -0.01F);
            this.LeftWingFeather4.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather4, 0.0F, 0.0F, 0.2275909337942703F);
            this.LeftWing1 = new ModelRenderer(this, 39, 0);
            this.LeftWing1.setPos(1.9F, -1.9F, 1.0F);
            this.LeftWing1.addBox(0.0F, 0.0F, -0.1F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWing1, 0.0F, 0.0F, 0.18203784630933073F);
            this.RightLeg = new ModelRenderer(this, 0, 25);
            this.RightLeg.setPos(-1.3F, 0.7F, -0.8F);
            this.RightLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, 0.6373942508178124F, 0.0F, 0.0F);
            this.RightWingFeather4 = new ModelRenderer(this, 52, 12);
            this.RightWingFeather4.setPos(0.0F, 0.0F, -0.01F);
            this.RightWingFeather4.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather4, 0.0F, 0.0F, -0.2275909337942703F);
            this.LeftWingFeather2 = new ModelRenderer(this, 39, 12);
            this.LeftWingFeather2.setPos(0.0F, 0.0F, -0.01F);
            this.LeftWingFeather2.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather2, 0.0F, 0.0F, 0.2275909337942703F);
            this.RightWingFeather7 = new ModelRenderer(this, 52, 15);
            this.RightWingFeather7.setPos(0.0F, 0.0F, 0.01F);
            this.RightWingFeather7.addBox(-4.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather7, 0.0F, 0.0F, -0.2275909337942703F);
            this.TailLeft = new ModelRenderer(this, 25, 17);
            this.TailLeft.mirror = true;
            this.TailLeft.setPos(1.4F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, 0.04555309164612875F);
            this.RightFootLeftToe = new ModelRenderer(this, 4, 30);
            this.RightFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.LeftLeg = new ModelRenderer(this, 0, 25);
            this.LeftLeg.setPos(1.3F, 0.7F, -0.8F);
            this.LeftLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, 0.6373942508178124F, 0.0F, 0.0F);
            this.TailRight = new ModelRenderer(this, 25, 17);
            this.TailRight.setPos(-1.4F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, -0.04555309164612875F);
            this.Mouth = new ModelRenderer(this, 8, 6);
            this.Mouth.setPos(0.0F, -4.0F, -1.0F);
            this.Mouth.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.10890854132970453F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 0, 28);
            this.RightFoot.setPos(0.0F, 0.2F, -1.7F);
            this.RightFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.5384340808981534F, 0.0F, 0.0F);
            this.RightWingFeather6 = new ModelRenderer(this, 52, 12);
            this.RightWingFeather6.setPos(0.0F, 0.0F, -0.01F);
            this.RightWingFeather6.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather6, 0.0F, 0.0F, -0.2275909337942703F);
            this.LeftWingFeather5 = new ModelRenderer(this, 39, 12);
            this.LeftWingFeather5.setPos(0.0F, 0.0F, -0.01F);
            this.LeftWingFeather5.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather5, 0.0F, 0.0F, 0.2275909337942703F);
            this.Neck1 = new ModelRenderer(this, 0, 12);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.9761626559667506F, 0.0F, 0.0F);
            this.LeftWingFeather1 = new ModelRenderer(this, 39, 12);
            this.LeftWingFeather1.setPos(3.0F, -4.0F, -0.01F);
            this.LeftWingFeather1.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather1, 0.0F, 0.0F, 0.27314402127920984F);
            this.RightWingFeather8 = new ModelRenderer(this, 52, 18);
            this.RightWingFeather8.setPos(0.0F, 0.0F, 0.01F);
            this.RightWingFeather8.addBox(-4.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather8, 0.0F, 0.0F, -0.2275909337942703F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, 1.6F, 2.3F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.4300491170387584F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 20, 28);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.LeftWing2 = new ModelRenderer(this, 39, 6);
            this.LeftWing2.setPos(2.0F, 4.0F, -0.01F);
            this.LeftWing2.addBox(0.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWing2, 0.0F, 0.0F, -0.4098033003787853F);
            this.LeftWingFeather5.addChild(this.LeftWingFeather6);
            this.Neck1.addChild(this.Neck2);
            this.RightWingFeather4.addChild(this.RightWingFeather5);
            this.LeftFoot.addChild(this.LeftFootLeftToe);
            this.LeftFoot.addChild(this.LeftFootRightToe);
            this.Head.addChild(this.Beak);
            this.RightWing1.addChild(this.RightWing2);
            this.RightWingFeather1.addChild(this.RightWingFeather2);
            this.Body.addChild(this.RightWing1);
            this.LeftWingFeather7.addChild(this.LeftWingFeather8);
            this.RightWingFeather2.addChild(this.RightWingFeather3);
            this.LeftWingFeather2.addChild(this.LeftWingFeather3);
            this.TailBase.addChild(this.TailMiddle);
            this.RightWing2.addChild(this.RightWingFeather1);
            this.RightFoot.addChild(this.RightFootRightToe);
            this.LeftWingFeather6.addChild(this.LeftWingFeather7);
            this.Neck2.addChild(this.Neck2Front);
            this.Head.addChild(this.Forehead);
            this.LeftLeg.addChild(this.LeftFoot);
            this.LeftWingFeather3.addChild(this.LeftWingFeather4);
            this.Body.addChild(this.LeftWing1);
            this.Body.addChild(this.RightLeg);
            this.RightWingFeather3.addChild(this.RightWingFeather4);
            this.LeftWingFeather1.addChild(this.LeftWingFeather2);
            this.RightWingFeather6.addChild(this.RightWingFeather7);
            this.TailMiddle.addChild(this.TailLeft);
            this.RightFoot.addChild(this.RightFootLeftToe);
            this.Body.addChild(this.LeftLeg);
            this.TailMiddle.addChild(this.TailRight);
            this.Beak.addChild(this.Mouth);
            this.RightLeg.addChild(this.RightFoot);
            this.RightWingFeather5.addChild(this.RightWingFeather6);
            this.LeftWingFeather4.addChild(this.LeftWingFeather5);
            this.Body.addChild(this.Neck1);
            this.LeftWing2.addChild(this.LeftWingFeather1);
            this.RightWingFeather7.addChild(this.RightWingFeather8);
            this.Neck2.addChild(this.Head);
            this.Body.addChild(this.TailBase);
            this.LeftWing1.addChild(this.LeftWing2);
            this.saveBase();
        }
        @Override
        public void setupAnim(KingfisherEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) -0.43F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.976F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.27F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.43F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.365F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 20.6F;
            this.TailBase.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F;
            this.LeftLeg.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.637F;
            this.RightLeg.xRot = MathHelper.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.637F;

            this.LeftWing1.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.LeftWing1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F;
            this.RightWing1.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.RightWing1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 2.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.976F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.27F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.43F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.365F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 20.6F;
            this.TailBase.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F;
            this.LeftLeg.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.637F;
            this.RightLeg.xRot = MathHelper.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.637F;

            this.LeftWing1.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.LeftWing1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F;
            this.RightWing1.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.RightWing1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F;
        }
    }

    public static class Child extends KingfisherModel {
        public ModelRenderer TailBase;
        public ModelRenderer LegRight;
        public ModelRenderer LegLeft;
        public ModelRenderer WingLeft;
        public ModelRenderer WingRight;
        public ModelRenderer Neck1;
        public ModelRenderer FootRight;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe1Right;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer Head;
        public ModelRenderer UpperBill;
        public ModelRenderer LowerBill;

        public Child() {
            texWidth = 64;
            texHeight = 32;
            this.TailBase = new ModelRenderer(this, 17, 28);
            this.TailBase.setPos(0.0F, 2.0F, -1.0F);
            this.TailBase.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.0911061832922575F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 20.9F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.411447814024714F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 5, 1);
            this.LowerBill.setPos(0.0F, -0.6F, 0.3F);
            this.LowerBill.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, -0.489739378788545F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -1.5F);
            this.Neck1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.7285004590772052F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 13, 4);
            this.FootLeft.setPos(0.0F, 0.0F, -0.9F);
            this.FootLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.6829473549475088F, 0.0F, 0.0F);
            this.WingLeft = new ModelRenderer(this, 29, 0);
            this.WingLeft.setPos(1.9F, -1.9F, 1.1F);
            this.WingLeft.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, -0.2275909337942703F, -0.0911061832922575F, 0.13665927909957545F);
            this.UpperBill = new ModelRenderer(this, 0, 1);
            this.UpperBill.setPos(0.0F, -0.5F, 2.0F);
            this.UpperBill.addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.5855579507282921F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 13, 8);
            this.Toe1Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, 0.0F, 0.591841146688116F);
            this.LegLeft = new ModelRenderer(this, 13, 0);
            this.LegLeft.setPos(1.3F, 0.9F, -1.4F);
            this.LegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.500909508638178F, -0.04555309164612875F, 0.4098033003787853F);
            this.FootRight = new ModelRenderer(this, 20, 4);
            this.FootRight.setPos(0.0F, 0.0F, -0.9F);
            this.FootRight.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.6829473549475088F, 0.0F, 0.0F);
            this.WingRight = new ModelRenderer(this, 38, 0);
            this.WingRight.setPos(-1.9F, -1.9F, 1.1F);
            this.WingRight.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, -0.2275909337942703F, 0.0911061832922575F, -0.13665927909957545F);
            this.Toe2Right = new ModelRenderer(this, 20, 8);
            this.Toe2Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, 0.0F, 0.0F, 0.591841146688116F);
            this.Toe2Left = new ModelRenderer(this, 13, 8);
            this.Toe2Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.0F, -0.591841146688116F);
            this.Head = new ModelRenderer(this, 0, 5);
            this.Head.setPos(0.0F, 0.0F, 2.0F);
            this.Head.addBox(-1.5F, -0.7F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.6373942508178124F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 20, 8);
            this.Toe1Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.004537855888737689F, 0.0F, -0.591841146688116F);
            this.LegRight = new ModelRenderer(this, 20, 0);
            this.LegRight.setPos(-1.3F, 0.9F, -1.4F);
            this.LegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.500909508638178F, 0.04555309164612875F, -0.4098033003787853F);
            this.Body.addChild(this.TailBase);
            this.Head.addChild(this.LowerBill);
            this.Body.addChild(this.Neck1);
            this.LegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.WingLeft);
            this.Head.addChild(this.UpperBill);
            this.FootLeft.addChild(this.Toe1Left);
            this.Body.addChild(this.LegLeft);
            this.LegRight.addChild(this.FootRight);
            this.Body.addChild(this.WingRight);
            this.FootRight.addChild(this.Toe2Right);
            this.FootLeft.addChild(this.Toe2Left);
            this.Neck1.addChild(this.Head);
            this.FootRight.addChild(this.Toe1Right);
            this.Body.addChild(this.LegRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(KingfisherEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.637F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float degree = 1.0F;
            float speed = 1.0F;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.728F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.637F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}
