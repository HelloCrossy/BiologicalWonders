package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.CowfishEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class CowfishModel extends SegmentedModel<CowfishEntity> {
    public ModelPart Body;
    public ModelPart Tail;
    public ModelPart head;
    public ModelPart UnderFinLeft;
    public ModelPart UnderFinRight;
    public ModelPart PectoralFinLeft;
    public ModelPart PectoralFinRight;
    public ModelPart BackFin2;
    public ModelPart Thorn1;
    public ModelPart TailFinTop;
    public ModelPart TailFinBottom;
    public ModelPart Mouth;
    public ModelPart HornLeft;
    public ModelPart HornRight;
    public ModelPart Thorn2;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
        this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public CowfishModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.texWidth = 64;
        this.texHeight = 32;

        this.Tail.addChild(this.TailFinBottom);
        this.head.addChild(this.Mouth);
        this.Tail.addChild(this.TailFinTop);
        this.Body.addChild(this.PectoralFinRight);
        this.Body.addChild(this.UnderFinLeft);
        this.Body.addChild(this.head);
        this.head.addChild(this.HornLeft);
        this.Body.addChild(this.Tail);
        this.Body.addChild(this.Thorn1);
        this.Body.addChild(this.PectoralFinLeft);
        this.Body.addChild(this.UnderFinRight);
        this.head.addChild(this.HornRight);
        this.Thorn1.addChild(this.Thorn2);
        this.Body.addChild(this.BackFin2);
    }
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        this.TailFinBottom = new ModelPart(this, 11, 10);
        this.TailFinBottom.setPos(0.0F, 0.2F, 3.7F);
        this.TailFinBottom.addBox(0.0F, -4.0F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinBottom, -1.8668041519541685F, 0.0F, 0.0F);
        this.Mouth = new ModelPart(this, 50, 0);
        this.Mouth.setPos(0.0F, 1.5F, -1.9F);
        this.Mouth.addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Mouth, -0.2275909337942703F, 0.0F, 0.0F);
        this.TailFinTop = new ModelPart(this, 0, 10);
        this.TailFinTop.setPos(0.01F, -0.6F, 3.7F);
        this.TailFinTop.addBox(0.0F, -4.0F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinTop, -1.3658947098950176F, 0.0F, 0.0F);
        this.PectoralFinRight = new ModelPart(this, 35, 16);
        this.PectoralFinRight.setPos(-1.7F, 0.3F, -2.1F);
        this.PectoralFinRight.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinRight, -1.0016444470669013F, -0.3186971254089062F, 0.500909508638178F);
        this.UnderFinLeft = new ModelPart(this, 16, 18);
        this.UnderFinLeft.setPos(0.7F, 1.6F, 2.0F);
        this.UnderFinLeft.addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UnderFinLeft, -0.04555309164612875F, -1.411447814024714F, 1.2747885016356248F);
        this.Body = new ModelPart(this, 0, 0);
        this.Body.setPos(0.0F, 21.5F, 0.0F);
        this.Body.addBox(-2.0F, -2.5F, -3.5F, 4.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.head = new ModelPart(this, 38, 0);
        this.head.setPos(0.0F, -0.9F, -2.4F);
        this.head.addBox(-1.5F, -1.5F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.13665927909957545F, 0.0F, 0.0F);
        this.HornLeft = new ModelPart(this, 0, 25);
        this.HornLeft.setPos(0.6F, -2.6F, -4.0F);
        this.HornLeft.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(HornLeft, -0.27314402127920984F, 0.0F, 0.27314402127920984F);
        this.Tail = new ModelPart(this, 22, 0);
        this.Tail.setPos(0.5F, -0.7F, 1.6F);
        this.Tail.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.Thorn1 = new ModelPart(this, 0, 0);
        this.Thorn1.setPos(0.0F, -2.1F, -1.1F);
        this.Thorn1.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Thorn1, -0.3127630032889644F, 0.0F, 0.0F);
        this.PectoralFinLeft = new ModelPart(this, 25, 16);
        this.PectoralFinLeft.setPos(1.7F, 0.3F, -2.1F);
        this.PectoralFinLeft.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinLeft, -1.0016444470669013F, 0.3186971254089062F, -0.591841146688116F);
        this.UnderFinRight = new ModelPart(this, 20, 23);
        this.UnderFinRight.setPos(-0.8F, 1.6F, 2.0F);
        this.UnderFinRight.addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UnderFinRight, -0.04555309164612875F, -1.411447814024714F, 1.8212510478244721F);
        this.HornRight = new ModelPart(this, 11, 25);
        this.HornRight.setPos(-1.5F, -2.3F, -4.0F);
        this.HornRight.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(HornRight, -0.27314402127920984F, 0.0F, -0.27314402127920984F);
        this.Thorn2 = new ModelPart(this, 0, 0);
        this.Thorn2.setPos(0.0F, -1.9F, -0.54F);
        this.Thorn2.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Thorn2, -0.5082398928281348F, 0.0F, 0.0F);
        this.BackFin2 = new ModelPart(this, 4, 17);
        this.BackFin2.setPos(0.5F, -1.9F, 2.8F);
        this.BackFin2.addBox(0.0F, -4.0F, -1.0F, 0.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(BackFin2, -0.591841146688116F, 0.0F, 0.0F);

        return LayerDefinition.create(meshDefinition, texWidth, texHeight);
    }
    @Override
    public void setupAnim(CowfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelPart ModelPart, float x, float y, float z) {
        ModelPart.xRot = x;
        ModelPart.yRot = y;
        ModelPart.zRot = z;
    }
}