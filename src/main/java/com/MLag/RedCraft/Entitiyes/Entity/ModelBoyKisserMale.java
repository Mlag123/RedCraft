package com.MLag.RedCraft.Entitiyes.Entity;

import com.MLag.RedCraft.Main;
import com.MLag.RedCraft.utils.Handlers.TextureLoader;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.timeconqueror.timecore.api.client.obj.ObjModelLoader;
import ru.timeconqueror.timecore.api.client.obj.model.AbstractObjModel;
import ru.timeconqueror.timecore.api.client.obj.model.ObjModelBase;
import ru.timeconqueror.timecore.api.client.obj.model.ObjModelRenderer;

import static com.MLag.RedCraft.Constants.MODIDS;

public class ModelBoyKisserMale extends ObjModelBase {


    private ObjModelRenderer head;
    //    private ObjModelRenderer body;
//    private ObjModelRenderer leftArm;
//    private ObjModelRenderer RightArm;
//    private ObjModelRenderer LeftLeg;
//    private ObjModelRenderer RightLeg;
//    private ObjModelRenderer Tail;
    ResourceLocation modelOBJ = TextureLoader.modelBoyKisserOBJ;
    Logger log = LogManager.getLogger();

    public ModelBoyKisserMale() {
        super(ObjModelLoader.load(Main.reca));

        for (ObjModelRenderer renderer : model.getParts()) {
            head = renderer;
//           switch (renderer.getName()) {
//                case "ph_head":
//                    head = renderer;
//          }
        }
        model.clearDuplications();

    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        GlStateManager.pushMatrix();
        model.renderAll(1);
        GlStateManager.popMatrix();
        super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
    }
}
