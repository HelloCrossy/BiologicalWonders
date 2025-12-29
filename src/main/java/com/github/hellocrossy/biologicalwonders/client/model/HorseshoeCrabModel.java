package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.HorseshoeCrabEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class HorseshoeCrabModel extends SegmentedModel<HorseshoeCrabEntity> {
    public ModelPart BodyTop;
    public ModelPart RightShellConnector;
    public ModelPart LeftShellConnector;
    public ModelPart FrontalShellConnector;
    public ModelPart Body;
    public ModelPart Hips;
    public ModelPart RightShell4;
    public ModelPart RightShell3;
    public ModelPart RightFlange;
    public ModelPart RightFlangeConnector;
    public ModelPart RightSpines;
    public ModelPart LeftShell4;
    public ModelPart LeftShell3;
    public ModelPart LeftFlange;
    public ModelPart LeftFlangeConnector;
    public ModelPart LeftSpines;
    public ModelPart FrontalShell;
    public ModelPart LeftShell2;
    public ModelPart RightShell2;
    public ModelPart LeftShell1;
    public ModelPart RightShell1;
    public ModelPart part19;
    public ModelPart LeftLeg5;
    public ModelPart LeftLeg4;
    public ModelPart LeftLeg3;
    public ModelPart LeftLeg2;
    public ModelPart LeftLeg1;
    public ModelPart RightLeg5;
    public ModelPart RightLeg2;
    public ModelPart RightLet1;
    public ModelPart RightLeg3;
    public ModelPart RightLeg4;
    public ModelPart TelsonEmbayment;
    public ModelPart Telson;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.BodyTop);
        }

        return this.parts;
    }

    public HorseshoeCrabModel(ModelPart root) {
        this.BodyTop = root.getChild("BodyTop");
        this.texWidth = 64;
        this.texHeight = 64;

        this.part19.addChild(this.RightLeg5);
        this.BodyTop.addChild(this.Hips);
        this.LeftShell4.addChild(this.LeftFlange);
        this.Hips.addChild(this.TelsonEmbayment);
        this.part19.addChild(this.LeftLeg3);
        this.part19.addChild(this.LeftLeg2);
        this.RightShell2.addChild(this.RightShell1);
        this.BodyTop.addChild(this.LeftShellConnector);
        this.FrontalShellConnector.addChild(this.FrontalShell);
        this.RightShell4.addChild(this.RightFlangeConnector);
        this.part19.addChild(this.RightLet1);
        this.part19.addChild(this.LeftLeg1);
        this.part19.addChild(this.LeftLeg5);
        this.part19.addChild(this.RightLeg4);
        this.RightShellConnector.addChild(this.RightShell4);
        this.part19.addChild(this.RightLeg2);
        this.BodyTop.addChild(this.RightShellConnector);
        this.TelsonEmbayment.addChild(this.Telson);
        this.LeftFlange.addChild(this.LeftSpines);
        this.BodyTop.addChild(this.Body);
        this.Body.addChild(this.part19);
        this.part19.addChild(this.RightLeg3);
        this.LeftShell4.addChild(this.LeftFlangeConnector);
        this.FrontalShell.addChild(this.RightShell2);
        this.RightShell4.addChild(this.RightFlange);
        this.part19.addChild(this.LeftLeg4);
        this.LeftShell4.addChild(this.LeftShell3);
        this.RightFlange.addChild(this.RightSpines);
        this.FrontalShell.addChild(this.LeftShell2);
        this.LeftShell2.addChild(this.LeftShell1);
        this.LeftShellConnector.addChild(this.LeftShell4);
        this.BodyTop.addChild(this.FrontalShellConnector);
        this.RightShell4.addChild(this.RightShell3);
    }
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        this.RightLeg5 = new ModelPart(this, 0, 10);
        this.RightLeg5.setPos(-0.1F, 0.7F, 0.8F);
        this.RightLeg5.addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightLeg5, 0.0F, 0.19547687289441354F, 0.0F);
        this.BodyTop = new ModelPart(this, 0, 13);
        this.BodyTop.setPos(0.0F, 22.0F, 0.0F);
        this.BodyTop.addBox(-2.0F, -1.0F, -3.5F, 4.0F, 2.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.Hips = new ModelPart(this, 18, 24);
        this.Hips.setPos(0.0F, 0.1F, 2.9F);
        this.Hips.addBox(-2.5F, -1.0F, 0.0F, 5.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, -0.11972958901707696F, 0.0F, 0.0F);
        this.LeftFlange = new ModelPart(this, 10, 30);
        this.LeftFlange.setPos(1.6F, 0.5F, 2.3F);
        this.LeftFlange.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftFlange, 0.0F, -0.4300491170387584F, 0.0F);
        this.TelsonEmbayment = new ModelPart(this, 32, 22);
        this.TelsonEmbayment.setPos(0.0F, -0.3F, 2.2F);
        this.TelsonEmbayment.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TelsonEmbayment, 0.11972958901707696F, 0.0F, 0.0F);
        this.LeftLeg3 = new ModelPart(this, 0, 10);
        this.LeftLeg3.setPos(0.1F, 0.7F, 0.0F);
        this.LeftLeg3.addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.LeftLeg2 = new ModelPart(this, 0, 10);
        this.LeftLeg2.setPos(0.1F, 0.7F, -0.4F);
        this.LeftLeg2.addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftLeg2, 0.0F, 0.09075711777475377F, 0.0F);
        this.RightShell1 = new ModelPart(this, 14, 0);
        this.RightShell1.setPos(0.52F, 0.0F, -0.8F);
        this.RightShell1.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightShell1, 0.0F, 1.526464947815274F, 0.0F);
        this.LeftShellConnector = new ModelPart(this, 30, 14);
        this.LeftShellConnector.setPos(2.7F, 1.0F, 0.8F);
        this.LeftShellConnector.addBox(-1.5F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftShellConnector, 0.0F, 0.0F, 0.7735299191575646F);
        this.FrontalShell = new ModelPart(this, 21, 30);
        this.FrontalShell.setPos(0.0F, 0.6F, -1.2F);
        this.FrontalShell.addBox(-2.5F, -1.0F, -3.0F, 5.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FrontalShell, -0.7735299191575646F, 0.0F, 0.0F);
        this.RightFlangeConnector = new ModelPart(this, 34, 10);
        this.RightFlangeConnector.mirror = true;
        this.RightFlangeConnector.setPos(-1.0F, -0.55F, 2.7F);
        this.RightFlangeConnector.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightFlangeConnector, -0.5098106585285771F, 0.0F, 0.0F);
        this.RightLet1 = new ModelPart(this, 0, 10);
        this.RightLet1.setPos(-0.1F, 0.7F, -0.8F);
        this.RightLet1.addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightLet1, 0.0F, -0.19547687289441354F, 0.0F);
        this.LeftLeg1 = new ModelPart(this, 0, 10);
        this.LeftLeg1.setPos(0.1F, 0.7F, -0.8F);
        this.LeftLeg1.addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftLeg1, 0.0F, 0.19547687289441354F, 0.0F);
        this.LeftLeg5 = new ModelPart(this, 0, 10);
        this.LeftLeg5.setPos(0.1F, 0.7F, 0.8F);
        this.LeftLeg5.addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftLeg5, 0.0F, -0.19547687289441354F, 0.0F);
        this.RightLeg4 = new ModelPart(this, 0, 10);
        this.RightLeg4.setPos(-0.1F, 0.7F, 0.4F);
        this.RightLeg4.addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightLeg4, 0.0F, 0.09075711777475377F, 0.0F);
        this.RightShell4 = new ModelPart(this, 0, 22);
        this.RightShell4.mirror = true;
        this.RightShell4.setPos(0.2F, 0.3F, 0.0F);
        this.RightShell4.addBox(-3.0F, -1.0F, -3.0F, 3.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightShell4, 0.0F, 0.0F, 0.7735299191575646F);
        this.RightLeg2 = new ModelPart(this, 0, 10);
        this.RightLeg2.setPos(-0.1F, 0.7F, -0.4F);
        this.RightLeg2.addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightLeg2, 0.0F, -0.09075711777475377F, 0.0F);
        this.RightShellConnector = new ModelPart(this, 30, 14);
        this.RightShellConnector.setPos(-2.9F, 1.0F, 1.0F);
        this.RightShellConnector.addBox(-0.5F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightShellConnector, 0.0F, 0.0F, -0.7735299191575646F);
        this.Telson = new ModelPart(this, 0, 0);
        this.Telson.setPos(0.0F, 1.5F, 2.0F);
        this.Telson.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 12.0F, 0.0F, 0.0F, 0.0F);
        this.LeftSpines = new ModelPart(this, 22, 14);
        this.LeftSpines.setPos(-0.5F, 0.0F, 3.0F);
        this.LeftSpines.addBox(0.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.Body = new ModelPart(this, 14, 0);
        this.Body.setPos(0.0F, 0.1F, 0.0F);
        this.Body.addBox(-2.5F, -1.0F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.part19 = new ModelPart(this, 0, 13);
        this.part19.setPos(0.0F, 0.7F, -0.1F);
        this.part19.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.RightLeg3 = new ModelPart(this, 0, 10);
        this.RightLeg3.setPos(-0.1F, 0.7F, 0.0F);
        this.RightLeg3.addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.LeftFlangeConnector = new ModelPart(this, 34, 10);
        this.LeftFlangeConnector.setPos(1.1F, -0.5F, 2.7F);
        this.LeftFlangeConnector.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftFlangeConnector, -0.5098106585285771F, 0.0F, 0.0F);
        this.RightShell2 = new ModelPart(this, 12, 24);
        this.RightShell2.mirror = true;
        this.RightShell2.setPos(-3.4F, 0.0F, -2.1F);
        this.RightShell2.addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightShell2, 0.0F, -0.8129743975368917F, 0.0F);
        this.RightFlange = new ModelPart(this, 10, 30);
        this.RightFlange.setPos(-1.6F, 0.5F, 2.3F);
        this.RightFlange.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightFlange, 0.0F, 0.4300491170387584F, 0.0F);
        this.LeftLeg4 = new ModelPart(this, 0, 10);
        this.LeftLeg4.setPos(0.1F, 0.7F, 0.4F);
        this.LeftLeg4.addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftLeg4, 0.0F, -0.09075711777475377F, 0.0F);
        this.LeftShell3 = new ModelPart(this, 0, 5);
        this.LeftShell3.setPos(1.0F, 0.0F, -3.6F);
        this.LeftShell3.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftShell3, 0.0F, -1.107935001176517F, 0.0F);
        this.RightSpines = new ModelPart(this, 20, 8);
        this.RightSpines.setPos(0.5F, 0.0F, 3.0F);
        this.RightSpines.addBox(-4.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.LeftShell2 = new ModelPart(this, 12, 24);
        this.LeftShell2.setPos(2.0F, 0.0F, -0.8F);
        this.LeftShell2.addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftShell2, 0.0F, 0.8087855780373333F, 0.0F);
        this.LeftShell1 = new ModelPart(this, 14, 0);
        this.LeftShell1.setPos(1.3F, 0.0F, -1.0F);
        this.LeftShell1.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftShell1, 0.0F, 0.8210028961170991F, 0.0F);
        this.LeftShell4 = new ModelPart(this, 0, 22);
        this.LeftShell4.setPos(-0.2F, 0.3F, 0.0F);
        this.LeftShell4.addBox(0.0F, -1.0F, -3.0F, 3.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftShell4, 0.0F, 0.0F, -0.7735299191575646F);
        this.FrontalShellConnector = new ModelPart(this, 14, 8);
        this.FrontalShellConnector.setPos(0.0F, -0.2F, -2.8F);
        this.FrontalShellConnector.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FrontalShellConnector, 0.7735299191575646F, 0.0F, 0.0F);
        this.RightShell3 = new ModelPart(this, 0, 5);
        this.RightShell3.setPos(-1.0F, 0.0F, -3.6F);
        this.RightShell3.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightShell3, 0.0F, 1.107935001176517F, 0.0F);

        return LayerDefinition.create(meshDefinition, texWidth, texHeight);
    }
    @Override
    public void setupAnim(HorseshoeCrabEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelPart ModelPart, float x, float y, float z) {
        ModelPart.xRot = x;
        ModelPart.yRot = y;
        ModelPart.zRot = z;
    }
}
