package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.TulipSnailEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class TulipSnailModel extends ZawaBaseAmbientModel<TulipSnailEntity> {
    public ModelPart Body;
    public ModelPart Tail;
    public ModelPart Head;
    public ModelPart Shell1;
    public ModelPart StalkLeft;
    public ModelPart StalkRight;
    public ModelPart Shell2;
    public ModelPart Shell5;
    public ModelPart Shell3;
    public ModelPart Shell4;
    public ModelPart Shell6;
    public ModelPart Shell7;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public TulipSnailModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.Tail = this.Body.getChild("Tail");

        this.Shell1 = this.Body.getChild("Shell1");
        this.Shell2 = this.Shell1.getChild("Shell2");
        this.Shell3 = this.Shell2.getChild("Shell3");
        this.Shell4 = this.Shell3.getChild("Shell4");

        this.Shell5 = this.Shell1.getChild("Shell5");
        this.Shell6 = this.Shell5.getChild("Shell6");
        this.Shell7 = this.Shell6.getChild("Shell7");

        this.Head = this.Body.getChild("Head");
        this.StalkLeft = this.Head.getChild("StalkLeft");

        this.StalkRight = this.Head.getChild("StalkRight");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F), PartPose.offset(0.0F, 22.0F, 0.0F));
        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(13, 10).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F, -0.01F, -0.01F)), PartPose.offset(0.0F, 1.0F, 3.3F));

        PartDefinition Shell1 = Body.addOrReplaceChild("Shell1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -1.8F, 0.67F, -0.3944444176086212F, 0.0F, 0.0F));
        PartDefinition Shell2 = Shell1.addOrReplaceChild("Shell2", CubeListBuilder.create().texOffs(14, 15).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(-0.3F, -2.0F, 1.2F, -0.35779249665883756F, -0.09075711777475377F, 0.0F));
        PartDefinition Shell3 = Shell2.addOrReplaceChild("Shell3", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.2F, -1.5F, 0.0F, 0.0F, -0.06981317007977318F, -0.19547687289441354F));
        PartDefinition Shell4 = Shell3.addOrReplaceChild("Shell4", CubeListBuilder.create().texOffs(22, 6).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, -1.5F, 0.0F, 0.0F, -0.2768092133741882F, -0.11728612207217244F));

        PartDefinition Shell5 = Shell1.addOrReplaceChild("Shell5", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.2F, -2.6F, 1.2510520131558576F, 0.0F, 0.0F));
        PartDefinition Shell6 = Shell5.addOrReplaceChild("Shell6", CubeListBuilder.create().texOffs(9, 21).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.9F, -1.6F, -0.5626941801377437F, 0.0F, 0.0F));
        PartDefinition Shell7 = Shell6.addOrReplaceChild("Shell7", CubeListBuilder.create().texOffs(19, 21).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.4F, -0.2F, -2.0F, -0.1672025410094762F, 0.35185837453889574F, 0.0F));

        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 24).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.9F, -2.6F, -0.29007373632884353F, 0.0F, 0.0F));
        PartDefinition StalkLeft = Head.addOrReplaceChild("StalkLeft", CubeListBuilder.create().texOffs(-1, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.5F, -1.1F, -0.5F, -0.35185837453889574F, 0.15707963267948966F, -0.20071286397934787F));

        PartDefinition StalkRight = Head.addOrReplaceChild("StalkRight", CubeListBuilder.create().texOffs(0, 2).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.4F, -1.1F, -0.5F, -0.35185837453889574F, 0.0F, 0.20071286397934787F));

        return LayerDefinition.create(meshDefinition, 32, 32);
    }

    @Override
    public void setupAnim(TulipSnailEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
