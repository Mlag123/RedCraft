package com.MLag.RedCraft;

import com.MLag.RedCraft.Entitiyes.EntityInit;
import com.MLag.RedCraft.Entitiyes.InitEntity;
import com.MLag.RedCraft.Proxy.CommonProxy;
import com.MLag.RedCraft.client.GUI.GUITest;
import com.MLag.RedCraft.utils.FurnanceRegistrarion;
import com.MLag.RedCraft.utils.Handlers.TextureLoader;
import com.MLag.RedCraft.utils.Sound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.MLag.RedCraft.Constants.MODIDS;
import static com.MLag.RedCraft.client.GUI.GUITest.initTexrute;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "red_crafting";
    public static final String NAME = "Red Crafting";
    public static final String VERSION = "1.0";

    private static Logger logger;
    public static final String CLIENT = "com.MLag.RedCraft.Proxy.ClientProxy";
    public static final String COMMON = "com.MLag.RedCraft.Proxy.CommonProxy";

    @SidedProxy(clientSide = CLIENT, serverSide = COMMON)
    public static CommonProxy proxy;

    BlockRegistationHandler BlockReg = new BlockRegistationHandler();
    CraftingRegister regCraft = new CraftingRegister();
    //главный класс
    @Deprecated
    public static ResourceLocation GUITexture;
  //  public static Sound sound;

    @Mod.Instance(MODID)
    public static Main instance;
    Logger log = LogManager.getLogger();
 //   public static ResourceLocation reca = new ResourceLocation(MODIDS + ":models/entity/boyKisserModel.obj");


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        log.info(new ResourceLocation(MODIDS + ":models/entity/boyKisserModel.obj").getResourcePath());

        //  GUITest.SetTextureTest(new ResourceLocation(MODIDS+":textures/block/boykisser_block.png"));
        TextureLoader textureLoader = new TextureLoader();
        EntityInit.registerEnitiyes();

       // sound = new Sound();
        // FIXME: 21.01.2024    InitEntity i = new InitEntity();
        BlockReg.register();

        BlockReg.registerRender();
        FurnanceRegistrarion.FurnanceRegistarion();
        regCraft.register();
        GameRegistry.registerWorldGenerator(new GeneratorOre(), 0);
        initTexrute(); // FIXME: 22.10.2023

    }


    @EventHandler
    public void init(FMLInitializationEvent event) {


    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
