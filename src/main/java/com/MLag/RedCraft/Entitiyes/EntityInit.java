package com.MLag.RedCraft.Entitiyes;

import com.MLag.RedCraft.Entitiyes.Entity.BoyKisserMobMale;
import com.MLag.RedCraft.Main;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import javax.swing.text.html.parser.Entity;

import static com.MLag.RedCraft.Constants.ENTITY_BOYKISSER;
import static com.MLag.RedCraft.Constants.MODIDS;

public class EntityInit {
    public static void registerEnitiyes(){
        registerEntity("boykisser_male_entity", BoyKisserMobMale.class,ENTITY_BOYKISSER,50,16777215,000000);
    }
    private static void registerEntity(String name, Class<? extends EntityMob> entity, int id, int range, int color1, int color2){
        EntityRegistry.registerModEntity(new ResourceLocation(MODIDS+":"+name), entity,name,id, Main.instance,range,1,true,color1,color2);
    }
}
