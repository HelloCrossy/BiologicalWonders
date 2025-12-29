package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.TriggerfishEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class TriggerfishModel extends SegmentedModel<TriggerfishEntity> {
    public ModelPart Body;
    public ModelPart UnderBelly;
    public ModelPart Back;
    public ModelPart Head;
    public ModelPart Spike1;
    public ModelPart PectoralFinRight;
    public ModelPart PectoralFinLeft;
    public ModelPart AnalFin;
    public ModelPart Tail1;
    public ModelPart TailConnect;
    public ModelPart DorsalFin;
    public ModelPart Tail2;
    public ModelPart TailFinBottom;
    public ModelPart TailFinTop;
    public ModelPart Jaw;
    public ModelPart Mouth;
    public ModelPart Spike2;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public TriggerfishModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.texWidth = 64;
        this.texHeight = 64;

        this.Tail1.addChild(this.Tail2);
        this.Back.addChild(this.Tail1);
        this.Head.addChild(this.Mouth);
        this.Body.addChild(this.Back);
        this.Body.addChild(this.PectoralFinRight);
        this.Tail2.addChild(this.TailFinTop);
        this.Body.addChild(this.UnderBelly);
        this.Head.addChild(this.Jaw);
        this.UnderBelly.addChild(this.AnalFin);
        this.Tail2.addChild(this.TailFinBottom);
        this.Body.addChild(this.Spike1);
        this.Body.addChild(this.PectoralFinLeft);
        this.Spike1.addChild(this.Spike2);
        this.Body.addChild(this.Head);
        this.Back.addChild(this.TailConnect);
        this.Back.addChild(this.DorsalFin);
    }
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        this.Tail2 = new ModelPart(this, 22, 39);
        this.Tail2.setPos(0.0F, 0.0F, 3.7F);
        this.Tail2.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.Tail1 = new ModelPart(this, 38, 27);
        this.Tail1.setPos(0.0F, 0.9F, 2.6F);
        this.Tail1.addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.23457224414434488F, 0.0F, 0.0F);
        this.Mouth = new ModelPart(this, 0, 38);
        this.Mouth.setPos(0.0F, 1.5F, -1.6F);
        this.Mouth.addBox(-1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 5.0F, -0.01F, 0.0F, 0.0F);
        this.setRotateAngle(Mouth, 0.11728612207217244F, 0.0F, 0.0F);
        this.Back = new ModelPart(this, 0, 29);
        this.Back.setPos(0.0F, -1.0F, 4.4F);
        this.Back.addBox(-2.0F, -2.0F, 0.0F, 4.0F, 5.0F, 4.0F, -0.01F, 0.0F, 0.0F);
        this.setRotateAngle(Back, -0.23457224414434488F, 0.0F, 0.0F);
        this.PectoralFinRight = new ModelPart(this, 22, 39);
        this.PectoralFinRight.setPos(-1.7F, 1.0F, -1.4F);
        this.PectoralFinRight.addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinRight, 0.23457224414434488F, -0.3909537457888271F, 0.0F);
        this.TailFinTop = new ModelPart(this, 14, 38);
        this.TailFinTop.setPos(0.0F, -0.6F, 1.3F);
        this.TailFinTop.addBox(0.0F, -3.5F, 0.0F, 0.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinTop, 0.19530233597447247F, 0.0F, 0.0F);
        this.UnderBelly = new ModelPart(this, 24, 14);
        this.UnderBelly.setPos(0.0F, 1.6F, 0.0F);
        this.UnderBelly.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 9.0F, -0.01F, 0.0F, 0.0F);
        this.setRotateAngle(UnderBelly, 0.38117991129872264F, 0.0F, 0.0F);
        this.Jaw = new ModelPart(this, 0, 0);
        this.Jaw.setPos(0.0F, 4.8F, -2.5F);
        this.Jaw.addBox(-1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 11.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, -0.6646214111173737F, 0.0F, 0.0F);
        this.AnalFin = new ModelPart(this, 26, 0);
        this.AnalFin.setPos(0.0F, 3.5F, 4.5F);
        this.AnalFin.addBox(0.0F, 0.0F, -4.5F, 0.0F, 5.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.Body = new ModelPart(this, 0, 14);
        this.Body.setPos(0.0F, 18.6F, -1.3F);
        this.Body.addBox(-2.0F, -3.5F, -3.0F, 4.0F, 7.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.TailFinBottom = new ModelPart(this, 16, 29);
        this.TailFinBottom.setPos(0.0F, 0.6F, 1.3F);
        this.TailFinBottom.addBox(0.0F, -1.5F, 0.0F, 0.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinBottom, -0.19547687289441354F, 0.0F, 0.0F);
        this.Spike1 = new ModelPart(this, 44, 8);
        this.Spike1.setPos(0.0F, -2.7F, 0.3F);
        this.Spike1.addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Spike1, 0.7819074915776542F, 0.0F, 0.0F);
        this.PectoralFinLeft = new ModelPart(this, 30, 39);
        this.PectoralFinLeft.setPos(1.7F, 1.0F, -1.4F);
        this.PectoralFinLeft.addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinLeft, 0.23457224414434488F, 0.3909537457888271F, 0.0F);
        this.Spike2 = new ModelPart(this, 38, 43);
        this.Spike2.setPos(0.0F, -0.8F, 0.0F);
        this.Spike2.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Spike2, 0.3127630032889644F, 0.0F, 0.0F);
        this.Head = new ModelPart(this, 38, 34);
        this.Head.setPos(0.0F, -3.4F, -2.8F);
        this.Head.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 6.0F, 3.0F, -0.01F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.3050835452591255F, 0.0F, 0.0F);
        this.TailConnect = new ModelPart(this, 30, 39);
        this.TailConnect.setPos(0.0F, -2.0F, 3.7F);
        this.TailConnect.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailConnect, -0.35185837453889574F, 0.0F, 0.0F);
        this.DorsalFin = new ModelPart(this, 24, 27);
        this.DorsalFin.setPos(0.0F, -0.8F, 2.2F);
        this.DorsalFin.addBox(0.0F, -5.0F, -3.5F, 0.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);

        return LayerDefinition.create(meshDefinition, texWidth, texHeight);
    }
    @Override
    public void setupAnim(TriggerfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelPart ModelPart, float x, float y, float z) {
        ModelPart.xRot = x;
        ModelPart.yRot = y;
        ModelPart.zRot = z;
    }
}
