package com.MLag.RedCraft.utils;

import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import javax.swing.*;

import static com.MLag.RedCraft.Main.MODID;


public class Sound {
//Класс для регистрации звуков.
    public static  SoundEvent  maxwell_sound;

    @SubscribeEvent
    public void registerSound(RegistryEvent.Register<SoundEvent> e){
        maxwell_sound = regisrty("maxwell_sound");


    }
    //"red_crafting/"+
    private static SoundEvent regisrty(String name){
        ResourceLocation uniqueName = new ResourceLocation("red_crafting/"+name);
        SoundEvent event = new SoundEvent(uniqueName);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);

        return event;
    }
}
