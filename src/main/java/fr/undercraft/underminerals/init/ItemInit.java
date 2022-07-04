package fr.undercraft.underminerals.init;

import fr.undercraft.underminerals.items.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit
{
    public static List<Item> ITEMS = new ArrayList<>();


    //Materiaux
    public static final Item GRENA = new ItemBase("grena");
    public static final Item BLUE_GRENA = new ItemBase("blue_grena");
    public static final Item ECO = new ItemBase("eco");
    public static final Item JADE = new ItemBase("jade");
    public static final Item RED_DIAMOND = new ItemBase("red_diamond");
    public static final Item RED_RUBY = new ItemBase("red_ruby");
    public static final Item GREEN_RUBY = new ItemBase("green_ruby");
    public static final Item BLUE_RUBY = new ItemBase("blue_ruby");
    public static final Item BLACK_OPAL = new ItemBase("black_opal");


    
}