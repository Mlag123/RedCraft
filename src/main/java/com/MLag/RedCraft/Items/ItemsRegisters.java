package com.MLag.RedCraft.Items;

import com.MLag.RedCraft.CreativeTabsRegister;
import com.MLag.RedCraft.Items.SpecificityItems.NaturalAmuletItem;
import com.MLag.RedCraft.Items.SpecificityItems.Wrench;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;

public class ItemsRegisters {

    //так же, как и в BlocksRehisters
    //materials
    public static final Item.ToolMaterial RED_MATERIAL = EnumHelper.addToolMaterial("red_crafting", 5, 2000, 15.0F, 4.0F, 12);
    //Item.ToolMaterial AXE_RED_MATERIAL = EnumHelper.addToolMaterial("red_crafting",5,2000,15.0F,8.0F,10);
    public static final ArrayList<Item> Items_Arrays = new ArrayList<Item>();
    Item red_nugget = new ItemCreate("red_nugget", CreativeTabsRegister.MATERIALS);
    public static Item red_ingot = new ItemCreate("red_ingot", CreativeTabsRegister.MATERIALS);
    public static Item Red_Pickaxe = new ItemsPickCreate("red_pickaxe", RED_MATERIAL);
    Item Red_Coin = new ItemCreate("red_coin", CreativeTabsRegister.MATERIALS);
    Item Red_Axe = new ItemAxeCreate("red_axe", RED_MATERIAL, 15.0f, 8.0f);
    Item Red_Sword = new ItemCreateSword("red_sword", RED_MATERIAL);
    Item red_spade = new ItemCreateSpade("red_spade", RED_MATERIAL);
    Item red_hoe = new ItemCreateHoe("red_hoe", RED_MATERIAL);

    Item Stone_stick = new ItemCreate("stone_stick", CreativeTabsRegister.MATERIALS);
    //Matterials
    Item EmeraldNugget = new ItemCreate("emerald_nugget", CreativeTabsRegister.MATERIALS);
    Item PressedStickWooden = new ItemCreate("pressed_wooden_stick", CreativeTabsRegister.MATERIALS);
    public static Item NaturalIngot = new ItemCreate("natural_ingot", CreativeTabsRegister.MATERIALS);
    Item wrench = new Wrench("wrench",CreativeTabsRegister.TOOL);
    Item natural_amulet = new NaturalAmuletItem("natural_amuelt",CreativeTabsRegister.TOOL);



}
