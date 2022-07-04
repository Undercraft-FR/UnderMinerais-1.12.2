package fr.undercraft.underminerals.init;

import fr.undercraft.underminerals.items.ArmorMod;
import fr.undercraft.underminerals.items.ArmorMod;
import fr.undercraft.underminerals.items.ArmorMod;
import fr.undercraft.underminerals.items.ArmorMod;
import fr.undercraft.underminerals.utils.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ArmorInit {

    public static List<Item> ARMORS = new ArrayList<>();

    //ArmorMaterials
    public static final ItemArmor.ArmorMaterial ARMOR_GRENA = EnumHelper.addArmorMaterial("armor_grena", Reference.MODID + ":grena", 75, new int[] {5, 7, 6, 4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f);
    public static final ItemArmor.ArmorMaterial ARMOR_BLUE_GRENA = EnumHelper.addArmorMaterial("armor_blue_grena", Reference.MODID + ":blue_grena", 75, new int[] {5, 7, 6, 4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f);
    public static final ItemArmor.ArmorMaterial ARMOR_ECO = EnumHelper.addArmorMaterial("armor_jade", Reference.MODID + ":eco", 85, new int[] {7, 9, 8, 6}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5f);
    public static final ItemArmor.ArmorMaterial ARMOR_JADE = EnumHelper.addArmorMaterial("armor_jade", Reference.MODID + ":jade", 95, new int[] {9, 11, 10, 8}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0f);
    public static final ItemArmor.ArmorMaterial ARMOR_RED_DIAMOND = EnumHelper.addArmorMaterial("armor_red_diamond", Reference.MODID + ":red_diamond", 105, new int[] {11, 13, 12, 10}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.5f);
    public static final ItemArmor.ArmorMaterial ARMOR_RED_RUBY = EnumHelper.addArmorMaterial("armor_red_ruby", Reference.MODID + ":red_ruby", 115, new int[] {13, 15, 14, 12}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0f);
    public static final ItemArmor.ArmorMaterial ARMOR_GREEN_RUBY = EnumHelper.addArmorMaterial("armor_green_ruby", Reference.MODID + ":green_ruby", 115, new int[] {13, 15, 14, 12}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0f);
    public static final ItemArmor.ArmorMaterial ARMOR_BLUE_RUBY = EnumHelper.addArmorMaterial("armor_blue_ruby", Reference.MODID + ":blue_ruby", 115, new int[] {13, 15, 14, 12}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0f);
    public static final ItemArmor.ArmorMaterial ARMOR_BLACK_OPAL = EnumHelper.addArmorMaterial("armor_black_opal", Reference.MODID + ":black_opal", 125, new int[] {15, 17, 16, 14}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.5f);

    public static final Item GRENA_HELMET = new ArmorMod("grena_helmet", ARMOR_GRENA,1, EntityEquipmentSlot.HEAD);
    public static final Item GRENA_CHESTPLATE = new ArmorMod("grena_chestplate", ARMOR_GRENA,1,EntityEquipmentSlot.CHEST);
    public static final Item GRENA_LEGGINGS = new ArmorMod("grena_leggings", ARMOR_GRENA,2,EntityEquipmentSlot.LEGS);
    public static final Item GRENA_BOOTS = new ArmorMod("grena_boots", ARMOR_GRENA,1,EntityEquipmentSlot.FEET);
    public static final Item BLUE_GRENA_HELMET = new ArmorMod("blue_grena_helmet", ARMOR_BLUE_GRENA,1, EntityEquipmentSlot.HEAD);
    public static final Item BLUE_GRENA_CHESTPLATE = new ArmorMod("blue_grena_chestplate", ARMOR_BLUE_GRENA,1,EntityEquipmentSlot.CHEST);
    public static final Item BLUE_GRENA_LEGGINGS = new ArmorMod("blue_grena_leggings", ARMOR_BLUE_GRENA,2,EntityEquipmentSlot.LEGS);
    public static final Item BLUE_GRENA_BOOTS = new ArmorMod("blue_grena_boots", ARMOR_BLUE_GRENA,1,EntityEquipmentSlot.FEET);
    public static final Item ECO_HELMET = new ArmorMod("eco_helmet", ARMOR_ECO,1, EntityEquipmentSlot.HEAD);
    public static final Item ECO_CHESTPLATE = new ArmorMod("eco_chestplate", ARMOR_ECO,1,EntityEquipmentSlot.CHEST);
    public static final Item ECO_LEGGINGS = new ArmorMod("eco_leggings", ARMOR_ECO,2,EntityEquipmentSlot.LEGS);
    public static final Item ECO_BOOTS = new ArmorMod("eco_boots", ARMOR_ECO,1,EntityEquipmentSlot.FEET);
    public static final Item RED_DIAMOND_HELMET = new ArmorMod("red_diamond_helmet", ARMOR_RED_DIAMOND,1, EntityEquipmentSlot.HEAD);
    public static final Item RED_DIAMOND_CHESTPLATE = new ArmorMod("red_diamond_chestplate", ARMOR_RED_DIAMOND,1,EntityEquipmentSlot.CHEST);
    public static final Item RED_DIAMOND_LEGGINGS = new ArmorMod("red_diamond_leggings", ARMOR_RED_DIAMOND,2,EntityEquipmentSlot.LEGS);
    public static final Item RED_DIAMOND_BOOTS = new ArmorMod("red_diamond_boots", ARMOR_RED_DIAMOND,1,EntityEquipmentSlot.FEET);
    public static final Item RED_RUBY_HELMET = new ArmorMod("red_ruby_helmet", ARMOR_RED_RUBY,1, EntityEquipmentSlot.HEAD);
    public static final Item RED_RUBY_CHESTPLATE = new ArmorMod("red_ruby_chestplate", ARMOR_RED_RUBY,1,EntityEquipmentSlot.CHEST);
    public static final Item RED_RUBY_LEGGINGS = new ArmorMod("red_ruby_leggings", ARMOR_RED_RUBY,2,EntityEquipmentSlot.LEGS);
    public static final Item RED_RUBY_BOOTS = new ArmorMod("red_ruby_boots", ARMOR_RED_RUBY,1,EntityEquipmentSlot.FEET);
    public static final Item GREEN_RUBY_HELMET = new ArmorMod("green_ruby_helmet", ARMOR_GREEN_RUBY,1, EntityEquipmentSlot.HEAD);
    public static final Item GREEN_RUBY_CHESTPLATE = new ArmorMod("green_ruby_chestplate", ARMOR_GREEN_RUBY,1,EntityEquipmentSlot.CHEST);
    public static final Item GREEN_RUBY_LEGGINGS = new ArmorMod("green_ruby_leggings", ARMOR_GREEN_RUBY,2,EntityEquipmentSlot.LEGS);
    public static final Item GREEN_RUBY_BOOTS = new ArmorMod("red_ruby_boots", ARMOR_GREEN_RUBY,1,EntityEquipmentSlot.FEET);
    public static final Item BLUE_RUBY_HELMET = new ArmorMod("blue_ruby_helmet", ARMOR_BLUE_RUBY,1, EntityEquipmentSlot.HEAD);
    public static final Item BLUE_RUBY_CHESTPLATE = new ArmorMod("blue_ruby_chestplate", ARMOR_BLUE_RUBY,1,EntityEquipmentSlot.CHEST);
    public static final Item BLUE_RUBY_LEGGINGS = new ArmorMod("blue_ruby_leggings", ARMOR_BLUE_RUBY,2,EntityEquipmentSlot.LEGS);
    public static final Item BLUE_RUBY_BOOTS = new ArmorMod("blue_ruby_boots", ARMOR_BLUE_RUBY,1,EntityEquipmentSlot.FEET);
    public static final Item BLACK_OPAL_HELMET = new ArmorMod("black_opal_helmet", ARMOR_BLACK_OPAL,1, EntityEquipmentSlot.HEAD);
    public static final Item BLACK_OPAL_CHESTPLATE = new ArmorMod("black_opal_chestplate", ARMOR_BLACK_OPAL,1,EntityEquipmentSlot.CHEST);
    public static final Item BLACK_OPAL_LEGGINGS = new ArmorMod("black_opal_leggings", ARMOR_BLACK_OPAL,2,EntityEquipmentSlot.LEGS);
    public static final Item BLACK_OPAL_BOOTS = new ArmorMod("black_opal_boots", ARMOR_BLACK_OPAL,1,EntityEquipmentSlot.FEET);
    
}
