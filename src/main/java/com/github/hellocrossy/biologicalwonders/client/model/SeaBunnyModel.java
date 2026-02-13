package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.SeaBunnyEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class SeaBunnyModel extends ZawaBaseAmbientModel<SeaBunnyEntity> {
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
        this.Hips = this.Body.getChild("Hips");
        this.HipsTuft = this.Hips.getChild("HipsTuft");
        this.HipsTuft2 = this.HipsTuft.getChild("HipsTuft2");

        this.Hips2 = this.Hips.getChild("Hips2");

        this.Head = this.Body.getChild("Head");
        this.Ear1 = this.Head.getChild("Ear1");
        this.EarTuft1 = this.Ear1.getChild("EarTuft1");

        this.Head2 = this.Head.getChild("Head2");

        this.Ear2 = this.Head.getChild("Ear2");
        this.EarTuft2 = this.Ear2.getChild("EarTuft2");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 22.0F, 0.0F, 0.0F, -1.5774285300155755F, 0.0F));
        PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(11, 9).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.27366763203903305F));
        PartDefinition HipsTuft = Hips.addOrReplaceChild("HipsTuft", CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, -1.8F, 0.0F));
        PartDefinition HipsTuft2 = HipsTuft.addOrReplaceChild("HipsTuft2", CubeListBuilder.create().texOffs(18, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, -0.8F, 0.0F));

        PartDefinition Hips2 = Hips.addOrReplaceChild("Hips2", CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -1.1F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F, 0.0F, -0.01F)), PartPose.offsetAndRotation(-1.0F, 0.4F, 0.0F, 0.0F, 0.0F, -0.27366763203903305F));

        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(9, 15).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-3.9F, -0.3F, 0.0F, 0.0F, 0.0F, -0.1563815016444822F));
        PartDefinition Ear1 = Head.addOrReplaceChild("Ear1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.6F, -1.3F, 0.9F, -0.23457224414434488F, 0.0F, 0.0F));
        PartDefinition EarTuft1 = Ear1.addOrReplaceChild("EarTuft1", CubeListBuilder.create().texOffs(12, 19).addBox(0.0F, -3.0F, -1.0F, 0.0F, 3.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Head2 = Head.addOrReplaceChild("Head2", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.01F)), PartPose.offsetAndRotation(1.5F, 1.6F, 0.0F, 0.0F, 0.0F, 0.1563815016444822F));

        PartDefinition Ear2 = Head.addOrReplaceChild("Ear2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.6F, -1.3F, -0.9F, 0.23457224414434488F, 0.0F, 0.0F));
        PartDefinition EarTuft2 = Ear2.addOrReplaceChild("EarTuft2", CubeListBuilder.create().texOffs(12, 19).addBox(0.0F, -3.0F, -1.0F, 0.0F, 3.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 32, 32);
    }

    @Override
    public void setupAnim(SeaBunnyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
