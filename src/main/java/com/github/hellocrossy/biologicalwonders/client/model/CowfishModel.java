package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.CowfishEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class CowfishModel extends ZawaBaseAmbientModel<CowfishEntity> {
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
        this.PectoralFinRight = this.Body.getChild("PectoralFinRight");

        this.UnderFinLeft = this.Body.getChild("UnderFinLeft");

        this.head = this.Body.getChild("head");
        this.Mouth = this.head.getChild("Mouth");

        this.HornLeft = this.head.getChild("HornLeft");

        this.HornRight = this.head.getChild("HornRight");

        this.Tail = this.Body.getChild("Tail");
        this.TailFinBottom = this.Tail.getChild("TailFinBottom");

        this.TailFinTop = this.Tail.getChild("TailFinTop");

        this.Thorn1 = this.Body.getChild("Thorn1");
        this.Thorn2 = this.Thorn1.getChild("Thorn2");

        this.PectoralFinLeft = this.Body.getChild("PectoralFinLeft");

        this.UnderFinRight = this.Body.getChild("UnderFinRight");

        this.BackFin2 = this.Body.getChild("BackFin2");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.5F, -3.5F, 4.0F, 5.0F, 7.0F), PartPose.offset(0.0F, 21.5F, 0.0F));
        PartDefinition PectoralFinRight = Body.addOrReplaceChild("PectoralFinRight", CubeListBuilder.create().texOffs(35, 16).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.7F, 0.3F, -2.1F, -1.0016444470669013F, -0.3186971254089062F, 0.500909508638178F));

        PartDefinition UnderFinLeft = Body.addOrReplaceChild("UnderFinLeft", CubeListBuilder.create().texOffs(16, 18).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F), PartPose.offsetAndRotation(0.7F, 1.6F, 2.0F, -0.04555309164612875F, -1.411447814024714F, 1.2747885016356248F));

        PartDefinition head = Body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(38, 0).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.9F, -2.4F, 0.13665927909957545F, 0.0F, 0.0F));
        PartDefinition Mouth = head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -1.9F, -0.2275909337942703F, 0.0F, 0.0F));

        PartDefinition HornLeft = head.addOrReplaceChild("HornLeft", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.6F, -2.6F, -4.0F, -0.27314402127920984F, 0.0F, 0.27314402127920984F));

        PartDefinition HornRight = head.addOrReplaceChild("HornRight", CubeListBuilder.create().texOffs(11, 25).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-1.5F, -2.3F, -4.0F, -0.27314402127920984F, 0.0F, -0.27314402127920984F));

        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(22, 0).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 5.0F), PartPose.offset(0.5F, -0.7F, 1.6F));
        PartDefinition TailFinBottom = Tail.addOrReplaceChild("TailFinBottom", CubeListBuilder.create().texOffs(11, 10).addBox(0.0F, -4.0F, -1.5F, 0.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 3.7F, -1.8668041519541685F, 0.0F, 0.0F));

        PartDefinition TailFinTop = Tail.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, -4.0F, -1.5F, 0.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.01F, -0.6F, 3.7F, -1.3658947098950176F, 0.0F, 0.0F));

        PartDefinition Thorn1 = Body.addOrReplaceChild("Thorn1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.1F, -1.1F, -0.3127630032889644F, 0.0F, 0.0F));
        PartDefinition Thorn2 = Thorn1.addOrReplaceChild("Thorn2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.9F, -0.54F, -0.5082398928281348F, 0.0F, 0.0F));

        PartDefinition PectoralFinLeft = Body.addOrReplaceChild("PectoralFinLeft", CubeListBuilder.create().texOffs(25, 16).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.7F, 0.3F, -2.1F, -1.0016444470669013F, 0.3186971254089062F, -0.591841146688116F));

        PartDefinition UnderFinRight = Body.addOrReplaceChild("UnderFinRight", CubeListBuilder.create().texOffs(20, 23).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F), PartPose.offsetAndRotation(-0.8F, 1.6F, 2.0F, -0.04555309164612875F, -1.411447814024714F, 1.8212510478244721F));

        PartDefinition BackFin2 = Body.addOrReplaceChild("BackFin2", CubeListBuilder.create().texOffs(4, 17).addBox(0.0F, -4.0F, -1.0F, 0.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.5F, -1.9F, 2.8F, -0.591841146688116F, 0.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 64, 32);
    }

    @Override
    public void setupAnim(CowfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}