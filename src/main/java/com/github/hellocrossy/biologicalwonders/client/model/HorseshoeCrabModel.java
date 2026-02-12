package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.HorseshoeCrabEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class HorseshoeCrabModel extends ZawaBaseAmbientModel<HorseshoeCrabEntity> {
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
        this.Hips = this.BodyTop.getChild("Hips");
        this.TelsonEmbayment = this.Hips.getChild("TelsonEmbayment");
        this.Telson = this.TelsonEmbayment.getChild("Telson");

        this.LeftShellConnector = this.BodyTop.getChild("LeftShellConnector");
        this.LeftShell4 = this.LeftShellConnector.getChild("LeftShell4");
        this.LeftFlange = this.LeftShell4.getChild("LeftFlange");
        this.LeftSpines = this.LeftFlange.getChild("LeftSpines");

        this.LeftFlangeConnector = this.LeftShell4.getChild("LeftFlangeConnector");

        this.LeftShell3 = this.LeftShell4.getChild("LeftShell3");

        this.RightShellConnector = this.BodyTop.getChild("RightShellConnector");
        this.RightShell4 = this.RightShellConnector.getChild("RightShell4");
        this.RightFlangeConnector = this.RightShell4.getChild("RightFlangeConnector");

        this.RightFlange = this.RightShell4.getChild("RightFlange");
        this.RightSpines = this.RightFlange.getChild("RightSpines");

        this.RightShell3 = this.RightShell4.getChild("RightShell3");

        this.Body = this.BodyTop.getChild("Body");
        this.part19 = this.Body.getChild("part19");
        this.RightLeg5 = this.part19.getChild("RightLeg5");

        this.LeftLeg3 = this.part19.getChild("LeftLeg3");

        this.LeftLeg2 = this.part19.getChild("LeftLeg2");

        this.RightLet1 = this.part19.getChild("RightLet1");

        this.LeftLeg1 = this.part19.getChild("LeftLeg1");

        this.LeftLeg5 = this.part19.getChild("LeftLeg5");

        this.RightLeg4 = this.part19.getChild("RightLeg4");

        this.RightLeg2 = this.part19.getChild("RightLeg2");

        this.RightLeg3 = this.part19.getChild("RightLeg3");

        this.LeftLeg4 = this.part19.getChild("LeftLeg4");

        this.FrontalShellConnector = this.BodyTop.getChild("FrontalShellConnector");
        this.FrontalShell = this.FrontalShellConnector.getChild("FrontalShell");
        this.RightShell2 = this.FrontalShell.getChild("RightShell2");
        this.RightShell1 = this.RightShell2.getChild("RightShell1");

        this.LeftShell2 = this.FrontalShell.getChild("LeftShell2");
        this.LeftShell1 = this.LeftShell2.getChild("LeftShell1");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition BodyTop = partDefinition.addOrReplaceChild("BodyTop", CubeListBuilder.create().texOffs(0, 13).addBox(-2.0F, -1.0F, -3.5F, 4.0F, 2.0F, 7.0F), PartPose.offset(0.0F, 22.0F, 0.0F));
        PartDefinition Hips = BodyTop.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(18, 24).addBox(-2.5F, -1.0F, 0.0F, 5.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 2.9F, -0.11972958901707696F, 0.0F, 0.0F));
        PartDefinition TelsonEmbayment = Hips.addOrReplaceChild("TelsonEmbayment", CubeListBuilder.create().texOffs(32, 22).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.3F, 2.2F, 0.11972958901707696F, 0.0F, 0.0F));
        PartDefinition Telson = TelsonEmbayment.addOrReplaceChild("Telson", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 12.0F), PartPose.offset(0.0F, 1.5F, 2.0F));

        PartDefinition LeftShellConnector = BodyTop.addOrReplaceChild("LeftShellConnector", CubeListBuilder.create().texOffs(30, 14).addBox(-1.5F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(2.7F, 1.0F, 0.8F, 0.0F, 0.0F, 0.7735299191575646F));
        PartDefinition LeftShell4 = LeftShellConnector.addOrReplaceChild("LeftShell4", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -1.0F, -3.0F, 3.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(-0.2F, 0.3F, 0.0F, 0.0F, 0.0F, -0.7735299191575646F));
        PartDefinition LeftFlange = LeftShell4.addOrReplaceChild("LeftFlange", CubeListBuilder.create().texOffs(10, 30).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(1.6F, 0.5F, 2.3F, 0.0F, -0.4300491170387584F, 0.0F));
        PartDefinition LeftSpines = LeftFlange.addOrReplaceChild("LeftSpines", CubeListBuilder.create().texOffs(22, 14).addBox(0.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F), PartPose.offset(-0.5F, 0.0F, 3.0F));

        PartDefinition LeftFlangeConnector = LeftShell4.addOrReplaceChild("LeftFlangeConnector", CubeListBuilder.create().texOffs(34, 10).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.1F, -0.5F, 2.7F, -0.5098106585285771F, 0.0F, 0.0F));

        PartDefinition LeftShell3 = LeftShell4.addOrReplaceChild("LeftShell3", CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.0F, 0.0F, -3.6F, 0.0F, -1.107935001176517F, 0.0F));

        PartDefinition RightShellConnector = BodyTop.addOrReplaceChild("RightShellConnector", CubeListBuilder.create().texOffs(30, 14).addBox(-0.5F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(-2.9F, 1.0F, 1.0F, 0.0F, 0.0F, -0.7735299191575646F));
        PartDefinition RightShell4 = RightShellConnector.addOrReplaceChild("RightShell4", CubeListBuilder.create().texOffs(0, 22).mirror(true).addBox(-3.0F, -1.0F, -3.0F, 3.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.2F, 0.3F, 0.0F, 0.0F, 0.0F, 0.7735299191575646F));
        PartDefinition RightFlangeConnector = RightShell4.addOrReplaceChild("RightFlangeConnector", CubeListBuilder.create().texOffs(34, 10).mirror(true).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.0F, -0.55F, 2.7F, -0.5098106585285771F, 0.0F, 0.0F));

        PartDefinition RightFlange = RightShell4.addOrReplaceChild("RightFlange", CubeListBuilder.create().texOffs(10, 30).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-1.6F, 0.5F, 2.3F, 0.0F, 0.4300491170387584F, 0.0F));
        PartDefinition RightSpines = RightFlange.addOrReplaceChild("RightSpines", CubeListBuilder.create().texOffs(20, 8).addBox(-4.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F), PartPose.offset(0.5F, 0.0F, 3.0F));

        PartDefinition RightShell3 = RightShell4.addOrReplaceChild("RightShell3", CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.0F, 0.0F, -3.6F, 0.0F, 1.107935001176517F, 0.0F));

        PartDefinition Body = BodyTop.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(14, 0).addBox(-2.5F, -1.0F, -3.0F, 5.0F, 2.0F, 6.0F), PartPose.offset(0.0F, 0.1F, 0.0F));
        PartDefinition part19 = Body.addOrReplaceChild("part19", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.7F, -0.1F));
        PartDefinition RightLeg5 = part19.addOrReplaceChild("RightLeg5", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 0.7F, 0.8F, 0.0F, 0.19547687289441354F, 0.0F));

        PartDefinition LeftLeg3 = part19.addOrReplaceChild("LeftLeg3", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F), PartPose.offset(0.1F, 0.7F, 0.0F));

        PartDefinition LeftLeg2 = part19.addOrReplaceChild("LeftLeg2", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 0.7F, -0.4F, 0.0F, 0.09075711777475377F, 0.0F));

        PartDefinition RightLet1 = part19.addOrReplaceChild("RightLet1", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 0.7F, -0.8F, 0.0F, -0.19547687289441354F, 0.0F));

        PartDefinition LeftLeg1 = part19.addOrReplaceChild("LeftLeg1", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 0.7F, -0.8F, 0.0F, 0.19547687289441354F, 0.0F));

        PartDefinition LeftLeg5 = part19.addOrReplaceChild("LeftLeg5", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 0.7F, 0.8F, 0.0F, -0.19547687289441354F, 0.0F));

        PartDefinition RightLeg4 = part19.addOrReplaceChild("RightLeg4", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 0.7F, 0.4F, 0.0F, 0.09075711777475377F, 0.0F));

        PartDefinition RightLeg2 = part19.addOrReplaceChild("RightLeg2", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 0.7F, -0.4F, 0.0F, -0.09075711777475377F, 0.0F));

        PartDefinition RightLeg3 = part19.addOrReplaceChild("RightLeg3", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F), PartPose.offset(-0.1F, 0.7F, 0.0F));

        PartDefinition LeftLeg4 = part19.addOrReplaceChild("LeftLeg4", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 0.7F, 0.4F, 0.0F, -0.09075711777475377F, 0.0F));

        PartDefinition FrontalShellConnector = BodyTop.addOrReplaceChild("FrontalShellConnector", CubeListBuilder.create().texOffs(14, 8).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.2F, -2.8F, 0.7735299191575646F, 0.0F, 0.0F));
        PartDefinition FrontalShell = FrontalShellConnector.addOrReplaceChild("FrontalShell", CubeListBuilder.create().texOffs(21, 30).addBox(-2.5F, -1.0F, -3.0F, 5.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.6F, -1.2F, -0.7735299191575646F, 0.0F, 0.0F));
        PartDefinition RightShell2 = FrontalShell.addOrReplaceChild("RightShell2", CubeListBuilder.create().texOffs(12, 24).mirror(true).addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-3.4F, 0.0F, -2.1F, 0.0F, -0.8129743975368917F, 0.0F));
        PartDefinition RightShell1 = RightShell2.addOrReplaceChild("RightShell1", CubeListBuilder.create().texOffs(14, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.52F, 0.0F, -0.8F, 0.0F, 1.526464947815274F, 0.0F));

        PartDefinition LeftShell2 = FrontalShell.addOrReplaceChild("LeftShell2", CubeListBuilder.create().texOffs(12, 24).addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(2.0F, 0.0F, -0.8F, 0.0F, 0.8087855780373333F, 0.0F));
        PartDefinition LeftShell1 = LeftShell2.addOrReplaceChild("LeftShell1", CubeListBuilder.create().texOffs(14, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.3F, 0.0F, -1.0F, 0.0F, 0.8210028961170991F, 0.0F));

        return LayerDefinition.create(meshDefinition, 64, 64);
    }

    @Override
    public void setupAnim(HorseshoeCrabEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
