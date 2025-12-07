package com.MLag.RedCraft.Items;

import com.MLag.RedCraft.Blocks.BlocksRegisters;
import com.MLag.RedCraft.Items.IceItems.*;
import com.MLag.RedCraft.Items.NaturalItems.*;
import com.MLag.RedCraft.Items.SpecificityItems.*;
import com.MLag.RedCraft.utils.CreativeTabsRegister;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;

public class ItemsRegisters {

    //Класс с динамическим массивом предметов, и обьявления их статической переменной типа Item;
    /*
    Пример:
    public static final Item item = new CustomItem("тут тип аргументы"); С блоками так же.
         */
    //materials
    public static final Item.ToolMaterial RED_MATERIAL = EnumHelper.addToolMaterial("red_material", 5, 2000, 15.0F, 4.0F, 12);
    public static final Item.ToolMaterial FIRE_MATERIAL = EnumHelper.addToolMaterial("fire_material", 5, 25000, 15.0F, 4.0F, 12);
    public static final Item.ToolMaterial ICE_MATERIAL = EnumHelper.addToolMaterial("ice_material",4,1000,8f,3f,12);
    public static final Item.ToolMaterial NATURAL_MATERIAL = EnumHelper.addToolMaterial("natural_material",4,2000,10f,4f,12);

    public static final ItemArmor.ArmorMaterial RED_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("red_crafting:red_armor", "red_crafting:red_armor", 15, new int[]{2, 6, 5, 3}, 7, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);



    //Item.ToolMaterial AXE_RED_MATERIAL = EnumHelper.addToolMaterial("red_crafting",5,2000,15.0F,8.0F,10);
    public static final ArrayList<Item> Items_Arrays = new ArrayList<Item>();
    public static    Item red_nugget = new ItemCreate("red_nugget", CreativeTabsRegister.MATERIALS);
    public static Item red_ingot = new ItemCreate("red_ingot", CreativeTabsRegister.MATERIALS);
    public static Item Red_Pickaxe = new ItemsPickCreate("red_pickaxe", RED_MATERIAL);
    public static  Item Red_Coin = new ItemCreate("red_coin", CreativeTabsRegister.MATERIALS);
    public static   Item Red_Axe = new ItemAxeCreate("red_axe", RED_MATERIAL, 15.0f, 8.0f);
    public static Item red_Sword = new ItemCreateSword("red_sword", RED_MATERIAL);
    public static  Item red_spade = new ItemCreateSpade("red_spade", RED_MATERIAL);
    public static Item red_hoe = new ItemCreateHoe("red_hoe", RED_MATERIAL);

    public static Item Stone_stick = new ItemCreate("stone_stick", CreativeTabsRegister.MATERIALS);
    //Matterials
    public static Item EmeraldNugget = new ItemCreate("emerald_nugget", CreativeTabsRegister.MATERIALS);
    public static Item PressedStickWooden = new ItemCreate("pressed_wooden_stick", CreativeTabsRegister.MATERIALS);
    public static Item NaturalIngot = new ItemCreate("natural_ingot", CreativeTabsRegister.MATERIALS);
    public static  Item natural_amulet = new NaturalAmuletItem("natural_amuelt", CreativeTabsRegister.TOOL);
    //armor fixme
    public static Item BOOTS = new com.MLag.RedCraft.Armor.ItemArmor("red_boots", RED_ARMOR_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static  Item LEGGS = new com.MLag.RedCraft.Armor.ItemArmor("red_leggs", RED_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static Item Chestplate = new com.MLag.RedCraft.Armor.ItemArmor("red_chestplate", RED_ARMOR_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static Item HEAD = new com.MLag.RedCraft.Armor.ItemArmor("red_head", RED_ARMOR_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static Item semenItem = new SemenItem("semen_item", CreativeTabsRegister.MATERIALS,1,50f,true);
    public static Item capsuleItem = new CapsuleItem("capsule_item", CreativeTabsRegister.MATERIALS);
    public static Item semenInCapsule = new SemenInCapsuleItem("semen_in_capsule", CreativeTabsRegister.MATERIALS);
    public static Item cleaner_cat = new CleanerCatItem("cleaner_cat",RED_MATERIAL);
    public static Item fire_pickaxe = new FirePickaxeItem("fire_pickaxe",FIRE_MATERIAL);

    public static Item ice_pickaxe = new IcePickaxe("ice_pickaxe", ICE_MATERIAL);
    public static Item ice_axe = new IceAxe("ice_axe", ICE_MATERIAL,8f,5f);
    public static Item ice_shovel = new IceShovel("ice_shovel", ICE_MATERIAL);
    public static Item ice_sword = new IceSword("ice_sword", ICE_MATERIAL);
    public static Item ice_hoe = new IceHoe("ice_hoe", ICE_MATERIAL);


    public static Item natural_pickaxe = new NaturalPickaxe("natural_pickaxe", NATURAL_MATERIAL);
    public static Item natural_axe = new NaturalAxe("natural_axe",NATURAL_MATERIAL,10f,10f);
    public static Item natual_shovel = new NaturalShovel("natural_shovel", NATURAL_MATERIAL);
    public static Item natural_sword = new NaturalSword("natural_sword", NATURAL_MATERIAL);
    public static Item natural_hoe = new NaturalHoe("natural_hoe", NATURAL_MATERIAL);


//fixme textures for armor

}
