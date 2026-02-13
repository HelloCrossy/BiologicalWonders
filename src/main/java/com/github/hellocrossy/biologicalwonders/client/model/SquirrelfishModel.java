package com.github.hellocrossy.biologicalwonders.client.model;

import com.github.hellocrossy.biologicalwonders.entity.SquirrelfishEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class SquirrelfishModel extends ZawaBaseAmbientModel<SquirrelfishEntity> {
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
        this.UnderFinLeft = this.Body.getChild("UnderFinLeft");

        this.PectoralFinLeft = this.Body.getChild("PectoralFinLeft");

        this.BackFin = this.Body.getChild("BackFin");

        this.PectoralFinRight = this.Body.getChild("PectoralFinRight");

        this.UnderFinRight = this.Body.getChild("UnderFinRight");

        this.Tail = this.Body.getChild("Tail");
        this.BackFin2 = this.Tail.getChild("BackFin2");

        this.TailFinTop = this.Tail.getChild("TailFinTop");

        this.TailFinBottom = this.Tail.getChild("TailFinBottom");

        this.head = this.Body.getChild("head");
        this.Mouth = this.head.getChild("Mouth");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -2.5F, 4.0F, 5.0F, 7.0F), PartPose.offset(0.0F, 19.0F, -1.8F));
        PartDefinition UnderFinLeft = Body.addOrReplaceChild("UnderFinLeft", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 3.0F), PartPose.offsetAndRotation(1.2F, 2.5F, -1.0F, -0.04555309164612875F, -0.18203784630933073F, 1.2747885016356248F));

        PartDefinition PectoralFinLeft = Body.addOrReplaceChild("PectoralFinLeft", CubeListBuilder.create().texOffs(27, 13).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(2.3F, 2.7F, -2.5F, 0.0F, 0.3186971254089062F, 0.0F));

        PartDefinition BackFin = Body.addOrReplaceChild("BackFin", CubeListBuilder.create().texOffs(40, 19).addBox(0.0F, -2.0F, -2.5F, 0.0F, 3.0F, 5.0F), PartPose.offset(0.5F, -1.7F, 1.4F));

        PartDefinition PectoralFinRight = Body.addOrReplaceChild("PectoralFinRight", CubeListBuilder.create().texOffs(40, 6).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(-1.3F, 2.7F, -2.6F, 0.0F, -0.3186971254089062F, 0.0F));

        PartDefinition UnderFinRight = Body.addOrReplaceChild("UnderFinRight", CubeListBuilder.create().texOffs(13, 15).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 3.0F), PartPose.offsetAndRotation(-0.2F, 2.5F, -1.0F, -0.04555309164612875F, -0.18203784630933073F, 1.8212510478244721F));

        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(22, 0).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 5.0F), PartPose.offset(0.5F, 1.0F, 2.4F));
        PartDefinition BackFin2 = Tail.addOrReplaceChild("BackFin2", CubeListBuilder.create().texOffs(4, 17).addBox(0.0F, -4.0F, -1.0F, 0.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.3F, 1.9F, -0.500909508638178F, 0.0F, 0.0F));

        PartDefinition TailFinTop = Tail.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(3, 10).addBox(0.0F, -4.0F, -1.5F, 0.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 4.2F, -1.0016444470669013F, 0.0F, 0.0F));

        PartDefinition TailFinBottom = Tail.addOrReplaceChild("TailFinBottom", CubeListBuilder.create().texOffs(11, 10).addBox(0.0F, -4.0F, -1.5F, 0.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.6F, 3.4F, -2.048841998263499F, 0.0F, 0.0F));

        PartDefinition head = Body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(38, 0).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.5F, 0.2F, -2.2F, 0.13665927909957545F, 0.0F, 0.0F));
        PartDefinition Mouth = head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -2.4F, -0.500909508638178F, 0.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 64, 32);
    }

    @Override
    public void setupAnim(SquirrelfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
