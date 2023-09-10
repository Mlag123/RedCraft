package com.MLag.RedCraft.Events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber
public class EventsHandler {
    static Logger log = LogManager.getLogger();
    //Класс с событиями.
    @SubscribeEvent
    public static void onJoin(EntityJoinWorldEvent e ){



       // EntityPlayer player = (EntityPlayer) e.getEntity();
       // player.sendMessage(new TextComponentString("Hello, %p!".replace("%p", player.getName())));

    }
}
