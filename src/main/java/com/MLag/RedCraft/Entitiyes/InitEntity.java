package com.MLag.RedCraft.Entitiyes;


import com.MLag.RedCraft.Entitiyes.Entity.BoyKisserMobMale;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;

public class InitEntity {
    private  static int ID = 0;
    public static EntityEntry BOY_KISSER_MALE = EntityEntryBuilder
            .create()
            .entity(BoyKisserMobMale.class)
            .id("boykisser_entity",ID++)
            .egg(0xff4040,0xff4040)
            .tracker(64,20,false)
            .build();

    @SubscribeEvent
    public static void registryEntity(RegistryEvent.Register<EntityEntry> event){
        event.getRegistry().register(BOY_KISSER_MALE);
    }
}
