package com.MLag.RedCraft.utils;

import com.MLag.RedCraft.Main;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

import static com.MLag.RedCraft.Main.MODID;

@Mod.EventBusSubscriber
public class Sound {

    public static final SoundEvent MAXWELL_SOUND = new SoundEvent(new ResourceLocation(MODID, "maxwell_sound"))
            .setRegistryName(MODID, "maxwell_sound");

    public static final SoundEvent MAXWELL_MEOW = new SoundEvent(new ResourceLocation(MODID,"maxwell_meow")).setRegistryName(MODID,"maxwell_sound");

    @SubscribeEvent
    public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
      event.getRegistry().register(MAXWELL_SOUND);
    }
}
