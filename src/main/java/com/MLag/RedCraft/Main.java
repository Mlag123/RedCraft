package com.MLag.RedCraft;


import com.MLag.RedCraft.GUI.GUIProxy;
import com.MLag.RedCraft.Proxy.CommonProxy;
import com.MLag.RedCraft.Tiles.TestTileBlock;
import com.MLag.RedCraft.utils.FurnanceRegistrarion;
import com.MLag.RedCraft.utils.Handlers.TextureLoader;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "red_crafting";
    public static final String NAME = "Red Crafting";
    public static final String VERSION = "1.0";

    public static final String CLIENT = "com.MLag.RedCraft.Proxy.ClientProxy";
    public static final String COMMON = "com.MLag.RedCraft.Proxy.CommonProxy";

    @SidedProxy(clientSide = CLIENT, serverSide = COMMON)
    public static CommonProxy proxy;

    BlockRegistationHandler BlockReg = new BlockRegistationHandler();
    CraftingRegister regCraft = new CraftingRegister();
    //главный класс
    @Deprecated
    public static ResourceLocation GUITexture;


    /// sounds

    @Mod.Instance(MODID)
    public static Main instance;
   public static Logger log = LogManager.getLogger();
 //   public static ResourceLocation reca = new ResourceLocation(MODIDS + ":models/entity/boyKisserModel.obj");


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance,new GUIProxy());

        GameRegistry.registerTileEntity(TestTileBlock.class,"red_crafting_testtileblock");
        proxy.preInit(event);

        TextureLoader textureLoader = new TextureLoader();
        BlockReg.register();
        BlockReg.registerRender();
        FurnanceRegistrarion.FurnanceRegistarion();
        regCraft.register();
        GameRegistry.registerWorldGenerator(new GeneratorOre(), 0);
      ///  initTexrute(); // FIXME: 22.10.2023

    }


    @EventHandler
    public void init(FMLInitializationEvent event) {


    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
