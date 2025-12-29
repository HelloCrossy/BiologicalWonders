package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.SquirrelfishEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class SquirrelfishModel extends SegmentedModel<SquirrelfishEntity> {
    public ModelPart Body;
    public ModelPart Tail;
    public ModelPart BackFin;
    public ModelPart head;
    public ModelPart UnderFinLeft;
    public ModelPart UnderFinRight;
    public ModelPart PectoralFinLeft;
    public ModelPart PectoralFinRight;
    public ModelPart TailFinTop;
    public ModelPart TailFinBottom;
    public ModelPart BackFin2;
    public ModelPart Mouth;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public SquirrelfishModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.texWidth = 64;
        this.texHeight = 32;

        this.Body.addChild(this.UnderFinLeft);
        this.Body.addChild(this.PectoralFinLeft);
        this.Body.addChild(this.BackFin);
        this.Body.addChild(this.PectoralFinRight);
        this.Tail.addChild(this.BackFin2);
        this.Tail.addChild(this.TailFinTop);
        this.Body.addChild(this.UnderFinRight);
        this.Tail.addChild(this.TailFinBottom);
        this.Body.addChild(this.Tail);
        this.Body.addChild(this.head);
        this.head.addChild(this.Mouth);
    }
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        this.UnderFinLeft = new ModelPart(this, 0, 28);
        this.UnderFinLeft.setPos(1.2F, 2.5F, -1.0F);
        this.UnderFinLeft.addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UnderFinLeft, -0.04555309164612875F, -0.18203784630933073F, 1.2747885016356248F);
        this.PectoralFinLeft = new ModelPart(this, 27, 13);
        this.PectoralFinLeft.setPos(2.3F, 2.7F, -2.5F);
        this.PectoralFinLeft.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinLeft, 0.0F, 0.3186971254089062F, 0.0F);
        this.BackFin = new ModelPart(this, 40, 19);
        this.BackFin.setPos(0.5F, -1.7F, 1.4F);
        this.BackFin.addBox(0.0F, -2.0F, -2.5F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.PectoralFinRight = new ModelPart(this, 40, 6);
        this.PectoralFinRight.setPos(-1.3F, 2.7F, -2.6F);
        this.PectoralFinRight.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinRight, 0.0F, -0.3186971254089062F, 0.0F);
        this.Body = new ModelPart(this, 0, 0);
        this.Body.setPos(0.0F, 19.0F, -1.8F);
        this.Body.addBox(-1.5F, -1.5F, -2.5F, 4.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.BackFin2 = new ModelPart(this, 4, 17);
        this.BackFin2.setPos(0.0F, -0.3F, 1.9F);
        this.BackFin2.addBox(0.0F, -4.0F, -1.0F, 0.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(BackFin2, -0.500909508638178F, 0.0F, 0.0F);
        this.TailFinTop = new ModelPart(this, 3, 10);
        this.TailFinTop.setPos(0.0F, 0.4F, 4.2F);
        this.TailFinTop.addBox(0.0F, -4.0F, -1.5F, 0.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinTop, -1.0016444470669013F, 0.0F, 0.0F);
        this.UnderFinRight = new ModelPart(this, 13, 15);
        this.UnderFinRight.setPos(-0.2F, 2.5F, -1.0F);
        this.UnderFinRight.addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UnderFinRight, -0.04555309164612875F, -0.18203784630933073F, 1.8212510478244721F);
        this.TailFinBottom = new ModelPart(this, 11, 10);
        this.TailFinBottom.setPos(0.0F, 0.6F, 3.4F);
        this.TailFinBottom.addBox(0.0F, -4.0F, -1.5F, 0.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinBottom, -2.048841998263499F, 0.0F, 0.0F);
        this.Tail = new ModelPart(this, 22, 0);
        this.Tail.setPos(0.5F, 1.0F, 2.4F);
        this.Tail.addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.head = new ModelPart(this, 38, 0);
        this.head.setPos(0.5F, 0.2F, -2.2F);
        this.head.addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.13665927909957545F, 0.0F, 0.0F);
        this.Mouth = new ModelPart(this, 50, 0);
        this.Mouth.setPos(0.0F, 0.5F, -2.4F);
        this.Mouth.addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Mouth, -0.500909508638178F, 0.0F, 0.0F);

        return LayerDefinition.create(meshDefinition, texWidth, texHeight);
    }
    @Override
    public void setupAnim(SquirrelfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelPart ModelPart, float x, float y, float z) {
        ModelPart.xRot = x;
        ModelPart.yRot = y;
        ModelPart.zRot = z;
    }
}
