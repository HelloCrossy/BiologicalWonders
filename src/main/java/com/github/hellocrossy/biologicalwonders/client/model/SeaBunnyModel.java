package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.SeaBunnyEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class SeaBunnyModel extends SegmentedModel<SeaBunnyEntity> {
    public ModelPart Body;
    public ModelPart Head;
    public ModelPart Hips;
    public ModelPart Head2;
    public ModelPart Ear1;
    public ModelPart Ear2;
    public ModelPart EarTuft1;
    public ModelPart EarTuft2;
    public ModelPart Hips2;
    public ModelPart HipsTuft;
    public ModelPart HipsTuft2;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public SeaBunnyModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.texWidth = 32;
        this.texHeight = 32;

        this.Body.addChild(this.Hips);
        this.Hips.addChild(this.HipsTuft);
        this.Ear2.addChild(this.EarTuft2);
        this.Hips.addChild(this.Hips2);
        this.Body.addChild(this.Head);
        this.Head.addChild(this.Ear1);
        this.Head.addChild(this.Head2);
        this.HipsTuft.addChild(this.HipsTuft2);
        this.Ear1.addChild(this.EarTuft1);
        this.Head.addChild(this.Ear2);
    }
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        this.Hips = new ModelPart(this, 11, 9);
        this.Hips.setPos(4.0F, 0.0F, 0.0F);
        this.Hips.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, 0.0F, 0.0F, 0.27366763203903305F);
        this.HipsTuft = new ModelPart(this, 20, 10);
        this.HipsTuft.setPos(0.0F, -1.8F, 0.0F);
        this.HipsTuft.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.EarTuft2 = new ModelPart(this, 12, 19);
        this.EarTuft2.setPos(0.0F, 0.0F, 0.0F);
        this.EarTuft2.addBox(0.0F, -3.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.Hips2 = new ModelPart(this, 0, 12);
        this.Hips2.setPos(-1.0F, 0.4F, 0.0F);
        this.Hips2.addBox(0.0F, -1.1F, -1.5F, 3.0F, 3.0F, 3.0F, -0.01F, 0.0F, -0.01F);
        this.setRotateAngle(Hips2, 0.0F, 0.0F, -0.27366763203903305F);
        this.Head = new ModelPart(this, 9, 15);
        this.Head.setPos(-3.9F, -0.3F, 0.0F);
        this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.0F, -0.1563815016444822F);
        this.Ear1 = new ModelPart(this, 0, 0);
        this.Ear1.setPos(0.6F, -1.3F, 0.9F);
        this.Ear1.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Ear1, -0.23457224414434488F, 0.0F, 0.0F);
        this.Body = new ModelPart(this, 0, 0);
        this.Body.setPos(0.0F, 22.0F, 0.0F);
        this.Body.addBox(-3.0F, -2.0F, -2.0F, 6.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.Head2 = new ModelPart(this, 0, 18);
        this.Head2.setPos(1.5F, 1.6F, 0.0F);
        this.Head2.addBox(-3.0F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, -0.01F);
        this.setRotateAngle(Head2, 0.0F, 0.0F, 0.1563815016444822F);
        this.HipsTuft2 = new ModelPart(this, 18, 0);
        this.HipsTuft2.setPos(0.0F, -0.8F, 0.0F);
        this.HipsTuft2.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.EarTuft1 = new ModelPart(this, 12, 19);
        this.EarTuft1.setPos(0.0F, 0.0F, 0.0F);
        this.EarTuft1.addBox(0.0F, -3.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.Ear2 = new ModelPart(this, 0, 0);
        this.Ear2.setPos(0.6F, -1.3F, -0.9F);
        this.Ear2.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Ear2, 0.23457224414434488F, 0.0F, 0.0F);

        return LayerDefinition.create(meshDefinition, texWidth, texHeight);
    }
    @Override
    public void setupAnim(SeaBunnyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelPart ModelPart, float x, float y, float z) {
        ModelPart.xRot = x;
        ModelPart.yRot = y;
        ModelPart.zRot = z;
    }
}
