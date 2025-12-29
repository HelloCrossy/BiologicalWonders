package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.NapoleonWrasseEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class NapoleonWrasseModel extends ZawaBaseModel<NapoleonWrasseEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends NapoleonWrasseModel {
        public ModelPart Tail;
        public ModelPart BackFin;
        public ModelPart PectorialFinLeft;
        public ModelPart PectorialFinRight;
        public ModelPart UnderFinLeft;
        public ModelPart UnderFinRight;
        public ModelPart Head;
        public ModelPart TailFinTop;
        public ModelPart AnalFin;
        public ModelPart TailFinBottom;
        public ModelPart Hump;
        public ModelPart Mouth;
        public ModelPart Jaw;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.texWidth = 64;
            this.texHeight = 32;

            this.Head.addChild(this.Jaw);
            this.Head.addChild(this.Mouth);
            this.Head.addChild(this.Hump);
            this.Body.addChild(this.UnderFinRight);
            this.TailFinTop.addChild(this.TailFinBottom);
            this.Body.addChild(this.Head);
            this.Tail.addChild(this.AnalFin);
            this.Body.addChild(this.PectorialFinLeft);
            this.Body.addChild(this.Tail);
            this.Body.addChild(this.PectorialFinRight);
            this.Body.addChild(this.BackFin);
            this.Tail.addChild(this.TailFinTop);
            this.Body.addChild(this.UnderFinLeft);
            

        }
        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            this.Jaw = new ModelPart(this, 0, 7);
            this.Jaw.setPos(0.0F, 3.0F, -1.9F);
            this.Jaw.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.2275909337942703F, 0.0F, 0.0F);
            this.Mouth = new ModelPart(this, 50, 0);
            this.Mouth.setPos(0.0F, 0.3F, -1.8F);
            this.Mouth.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.500909508638178F, 0.0F, 0.0F);
            this.Hump = new ModelPart(this, 0, 0);
            this.Hump.setPos(0.0F, -3.4F, -2.2F);
            this.Hump.addBox(-1.0F, -0.7F, -1.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hump, 0.18203784630933073F, 0.0F, 0.0F);
            this.UnderFinRight = new ModelPart(this, 21, 20);
            this.UnderFinRight.mirror = true;
            this.UnderFinRight.setPos(-1.4F, 3.9F, -3.5F);
            this.UnderFinRight.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFinRight, 0.500909508638178F, -0.18203784630933073F, 0.0911061832922575F);
            this.TailFinBottom = new ModelPart(this, 32, 21);
            this.TailFinBottom.setPos(0.0F, 0.6F, 0.0F);
            this.TailFinBottom.addBox(0.0F, 0.5F, -0.5F, 0.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinBottom, -0.3642502295386026F, 0.0F, 0.0F);
            this.Head = new ModelPart(this, 36, 0);
            this.Head.setPos(0.0F, 0.3F, -4.5F);
            this.Head.addBox(-1.5F, -4.0F, -2.7F, 3.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.04555309164612875F, 0.0F, 0.0F);
            this.AnalFin = new ModelPart(this, 0, 20);
            this.AnalFin.setPos(0.0F, 2.3F, -2.6F);
            this.AnalFin.addBox(0.0F, -1.5F, -0.5F, 0.0F, 4.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(AnalFin, -0.27314402127920984F, 0.0F, 0.0F);
            this.PectorialFinLeft = new ModelPart(this, 19, 28);
            this.PectorialFinLeft.setPos(1.3F, 1.0F, -3.5F);
            this.PectorialFinLeft.addBox(-0.5F, -1.0F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectorialFinLeft, -0.0911061832922575F, -0.7740534966278743F, -0.27314402127920984F);
            this.Tail = new ModelPart(this, 20, 0);
            this.Tail.setPos(0.0F, 0.0F, 6.5F);
            this.Tail.addBox(-1.5F, -2.0F, 0.0F, 3.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.PectorialFinRight = new ModelPart(this, 19, 28);
            this.PectorialFinRight.mirror = true;
            this.PectorialFinRight.setPos(-1.3F, 1.0F, -3.5F);
            this.PectorialFinRight.addBox(-4.5F, -1.0F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectorialFinRight, -0.0911061832922575F, 0.7740534966278743F, 0.27314402127920984F);
            this.BackFin = new ModelPart(this, 36, 3);
            this.BackFin.setPos(0.0F, -4.0F, 3.3F);
            this.BackFin.addBox(0.0F, -1.5F, -2.8F, 0.0F, 4.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFin, 0.04555309164612875F, 0.0F, 0.0F);
            this.TailFinTop = new ModelPart(this, 32, 16);
            this.TailFinTop.setPos(0.0F, -0.9F, 4.4F);
            this.TailFinTop.addBox(0.0F, -1.0F, -1.0F, 0.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop, 0.13665927909957545F, 0.0F, 0.0F);
            this.Body = new ModelPart(this, 0, 0);
            this.Body.setPos(0.0F, 17.0F, 0.0F);
            this.Body.addBox(-2.0F, -4.5F, -5.0F, 4.0F, 9.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.UnderFinLeft = new ModelPart(this, 21, 20);
            this.UnderFinLeft.setPos(1.4F, 3.9F, -3.5F);
            this.UnderFinLeft.addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UnderFinLeft, 0.500909508638178F, 0.18203784630933073F, -0.0911061832922575F);

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }
        @Override
        public void setupAnim(NapoleonWrasseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) *  0.25F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.25F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 2.0F;
            this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.2F)) * (degree * 0.2F) * limbSwingAmount;
          //  this.Hips.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -0.4F) * limbSwingAmount;
            this.PectorialFinLeft.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 2.0F) * limbSwingAmount - 0.7F;
            this.PectorialFinRight.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * -2.0F) * limbSwingAmount + 0.77F;
            this.Mouth.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F)) * (degree * 0.3F) * limbSwingAmount + -0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isInWater()) {
                float speed = 1.0F;
                float degree = 2.0F;
                this.Head.yRot = MathHelper.cos((limbSwing * speed * 0.5F)) * (degree * 0.8F) * limbSwingAmount;
                //this.Hips.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 1F)) * (degree * -0.9F) * limbSwingAmount;
                this.PectorialFinLeft.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 1F)) * (degree * 1.0F) * limbSwingAmount - 0.77F;
                this.PectorialFinRight.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 1F)) * (degree * -1.0F) * limbSwingAmount + 0.77F;
                this.Tail.yRot = MathHelper.cos(4.0F + (limbSwing * speed * 1F)) * (degree * 1.0F) * limbSwingAmount;
            }
        }
    }

    public static class Child extends NapoleonWrasseModel {
        public ModelPart Head;
        public ModelPart Tail;
        public ModelPart DorsalFin;
        public ModelPart AnalFin;
        public ModelPart PelvicFinLeft;
        public ModelPart PelvicFinRight;
        public ModelPart PectoralFinLeft;
        public ModelPart PectoralFinRight;
        public ModelPart Hump;
        public ModelPart Mouth;
        public ModelPart Jaw;
        public ModelPart TailFinTop;
        public ModelPart TailFinBottom;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.texWidth = 32;
            this.texHeight = 32;

            this.Tail.addChild(this.TailFinBottom);
            this.Tail.addChild(this.TailFinTop);
            this.Body.addChild(this.Head);
            this.Body.addChild(this.AnalFin);
            this.Mouth.addChild(this.Jaw);
            this.Body.addChild(this.PelvicFinRight);
            this.Head.addChild(this.Mouth);
            this.Body.addChild(this.Tail);
            this.Head.addChild(this.Hump);
            this.Body.addChild(this.PectoralFinLeft);
            this.Body.addChild(this.PectoralFinRight);
            this.Body.addChild(this.DorsalFin);
            this.Body.addChild(this.PelvicFinLeft);
            

        }
        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            this.TailFinBottom = new ModelPart(this, 0, 0);
            this.TailFinBottom.setPos(0.0F, 0.6F, 2.6F);
            this.TailFinBottom.addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinBottom, -0.27366763203903305F, 0.0F, 0.0F);
            this.TailFinTop = new ModelPart(this, 16, 16);
            this.TailFinTop.setPos(-0.01F, -0.7F, 2.55F);
            this.TailFinTop.addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFinTop, 0.27366763203903305F, 0.0F, 0.0F);
            this.Head = new ModelPart(this, 0, 15);
            this.Head.setPos(0.0F, 0.4F, -1.8F);
            this.Head.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.05410520514734854F, 0.0F, 0.0F);
            this.Body = new ModelPart(this, 0, 0);
            this.Body.setPos(0.0F, 19.8F, -0.8F);
            this.Body.addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.AnalFin = new ModelPart(this, 15, 0);
            this.AnalFin.setPos(0.0F, 0.3F, 3.9F);
            this.AnalFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(AnalFin, -0.7819074915776542F, 0.0F, 0.0F);
            this.Jaw = new ModelPart(this, 15, 0);
            this.Jaw.setPos(0.0F, 1.1F, 0.1F);
            this.Jaw.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, 0.417133684568742F, 0.0F, 0.0F);
            this.PelvicFinRight = new ModelPart(this, 4, 21);
            this.PelvicFinRight.setPos(-1.3F, 1.7F, -1.9F);
            this.PelvicFinRight.addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PelvicFinRight, 0.19547687289441354F, -0.1563815016444822F, 0.23457224414434488F);
            this.Mouth = new ModelPart(this, 8, 19);
            this.Mouth.setPos(0.0F, 0.6F, -1.0F);
            this.Mouth.addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.5347688721584182F, 0.0F, 0.0F);
            this.Tail = new ModelPart(this, 11, 12);
            this.Tail.setPos(0.0F, 0.0F, 3.7F);
            this.Tail.addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Hump = new ModelPart(this, 20, 10);
            this.Hump.setPos(0.0F, -2.0F, -0.2F);
            this.Hump.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hump, 0.27366763203903305F, 0.0F, 0.0F);
            this.PectoralFinLeft = new ModelPart(this, 16, 19);
            this.PectoralFinLeft.setPos(1.9F, -0.4F, -1.0F);
            this.PectoralFinLeft.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinLeft, 0.0F, 0.35185837453889574F, 0.0F);
            this.PectoralFinRight = new ModelPart(this, 16, 19);
            this.PectoralFinRight.setPos(-1.9F, -0.4F, -1.0F);
            this.PectoralFinRight.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PectoralFinRight, 0.0F, -0.35185837453889574F, 0.0F);
            this.DorsalFin = new ModelPart(this, 0, 5);
            this.DorsalFin.setPos(0.0F, -1.0F, 2.5F);
            this.DorsalFin.addBox(0.0F, -3.0F, -3.5F, 0.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(DorsalFin, 0.11728612207217244F, 0.0F, 0.0F);
            this.PelvicFinLeft = new ModelPart(this, 4, 21);
            this.PelvicFinLeft.setPos(1.3F, 2.1F, -1.9F);
            this.PelvicFinLeft.addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(PelvicFinLeft, 0.19547687289441354F, 0.1563815016444822F, -0.23457224414434488F);

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
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
