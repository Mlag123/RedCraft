package com.MLag.RedCraft.utils;

import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;



public class Sound {

    public static final SoundEvent  maxwell_sound = regisrty("maxwell_sound");

    @SubscribeEvent
    public void registerSound(RegistryEvent.Register<SoundEvent> e){
        ForgeRegistries.SOUND_EVENTS.register(maxwell_sound);


    }

    private static SoundEvent regisrty(String name){
        ResourceLocation uniqueName = new ResourceLocation("red_crafting/"+name);

        return new SoundEvent(uniqueName).setRegistryName(uniqueName);
    }
}
