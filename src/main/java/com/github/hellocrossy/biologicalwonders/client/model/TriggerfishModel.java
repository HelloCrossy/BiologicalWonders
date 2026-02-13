package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.TriggerfishEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class TriggerfishModel extends ZawaBaseAmbientModel<TriggerfishEntity> {
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
        this.Back = this.Body.getChild("Back");
        this.Tail1 = this.Back.getChild("Tail1");
        this.Tail2 = this.Tail1.getChild("Tail2");
        this.TailFinTop = this.Tail2.getChild("TailFinTop");

        this.TailFinBottom = this.Tail2.getChild("TailFinBottom");

        this.TailConnect = this.Back.getChild("TailConnect");

        this.DorsalFin = this.Back.getChild("DorsalFin");

        this.PectoralFinRight = this.Body.getChild("PectoralFinRight");

        this.UnderBelly = this.Body.getChild("UnderBelly");
        this.AnalFin = this.UnderBelly.getChild("AnalFin");

        this.Spike1 = this.Body.getChild("Spike1");
        this.Spike2 = this.Spike1.getChild("Spike2");

        this.PectoralFinLeft = this.Body.getChild("PectoralFinLeft");

        this.Head = this.Body.getChild("Head");
        this.Mouth = this.Head.getChild("Mouth");

        this.Jaw = this.Head.getChild("Jaw");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F, -3.5F, -3.0F, 4.0F, 7.0F, 8.0F), PartPose.offset(0.0F, 18.6F, -1.3F));
        PartDefinition Back = Body.addOrReplaceChild("Back", CubeListBuilder.create().texOffs(0, 29).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 4.4F, -0.23457224414434488F, 0.0F, 0.0F));
        PartDefinition Tail1 = Back.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(38, 27).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.9F, 2.6F, 0.23457224414434488F, 0.0F, 0.0F));
        PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(22, 39).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 3.7F));
        PartDefinition TailFinTop = Tail2.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(14, 38).addBox(0.0F, -3.5F, 0.0F, 0.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.6F, 1.3F, 0.19530233597447247F, 0.0F, 0.0F));

        PartDefinition TailFinBottom = Tail2.addOrReplaceChild("TailFinBottom", CubeListBuilder.create().texOffs(16, 29).addBox(0.0F, -1.5F, 0.0F, 0.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.6F, 1.3F, -0.19547687289441354F, 0.0F, 0.0F));

        PartDefinition TailConnect = Back.addOrReplaceChild("TailConnect", CubeListBuilder.create().texOffs(30, 39).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 3.7F, -0.35185837453889574F, 0.0F, 0.0F));

        PartDefinition DorsalFin = Back.addOrReplaceChild("DorsalFin", CubeListBuilder.create().texOffs(24, 27).addBox(0.0F, -5.0F, -3.5F, 0.0F, 5.0F, 7.0F), PartPose.offset(0.0F, -0.8F, 2.2F));

        PartDefinition PectoralFinRight = Body.addOrReplaceChild("PectoralFinRight", CubeListBuilder.create().texOffs(22, 39).addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(-1.7F, 1.0F, -1.4F, 0.23457224414434488F, -0.3909537457888271F, 0.0F));

        PartDefinition UnderBelly = Body.addOrReplaceChild("UnderBelly", CubeListBuilder.create().texOffs(24, 14).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 9.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 0.0F, 0.38117991129872264F, 0.0F, 0.0F));
        PartDefinition AnalFin = UnderBelly.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(26, 0).addBox(0.0F, 0.0F, -4.5F, 0.0F, 5.0F, 9.0F), PartPose.offset(0.0F, 3.5F, 4.5F));

        PartDefinition Spike1 = Body.addOrReplaceChild("Spike1", CubeListBuilder.create().texOffs(44, 8).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.7F, 0.3F, 0.7819074915776542F, 0.0F, 0.0F));
        PartDefinition Spike2 = Spike1.addOrReplaceChild("Spike2", CubeListBuilder.create().texOffs(38, 43).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.3127630032889644F, 0.0F, 0.0F));

        PartDefinition PectoralFinLeft = Body.addOrReplaceChild("PectoralFinLeft", CubeListBuilder.create().texOffs(30, 39).addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(1.7F, 1.0F, -1.4F, 0.23457224414434488F, 0.3909537457888271F, 0.0F));

        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(38, 34).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -2.8F, 0.3050835452591255F, 0.0F, 0.0F));
        PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -1.6F, 0.11728612207217244F, 0.0F, 0.0F));

        PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 11.0F), PartPose.offsetAndRotation(0.0F, 4.8F, -2.5F, -0.6646214111173737F, 0.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 64, 64);
    }

    @Override
    public void setupAnim(TriggerfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
