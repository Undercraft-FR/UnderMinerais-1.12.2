package fr.undercraft.underminerals.init;

import fr.undercraft.underminerals.items.ItemAxeMod;
import fr.undercraft.underminerals.items.ItemPickaxeMod;
import fr.undercraft.underminerals.items.ItemShovelMod;
import fr.undercraft.underminerals.items.ItemSwordMod;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ToolsInit {

    public static List<Item> TOOLS = new ArrayList<>();

    //ToolMaterials
    public static final Item.ToolMaterial TOOL_GRENA = EnumHelper.addToolMaterial("grena_tool", 5, 2500, 25.0f, 1.0f, 18);
    public static final Item.ToolMaterial SWORD_TOOL_GRENA = EnumHelper.addToolMaterial("grena_tool", 5, 2500, 25.0f, 10.0f, 18);
    public static final Item.ToolMaterial TOOL_BLUE_GRENA = EnumHelper.addToolMaterial("blue_grena_tool", 5, 2500, 25.0f, 1.0f, 18);
    public static final Item.ToolMaterial SWORD_TOOL_BLUE_GRENA = EnumHelper.addToolMaterial("blue_grena_tool", 5, 2500, 25.0f, 10.0f, 18);
    public static final Item.ToolMaterial TOOL_ECO = EnumHelper.addToolMaterial("eco_tool", 5, 3000, 30.0f, 1.0f, 18);
    public static final Item.ToolMaterial SWORD_TOOL_ECO = EnumHelper.addToolMaterial("eco_tool", 5, 3000, 30.0f, 15.0f, 18);
    public static final Item.ToolMaterial TOOL_RED_DIAMOND = EnumHelper.addToolMaterial("red_diamond_tool", 5, 3500, 35.0f, 1.0f, 18);
    public static final Item.ToolMaterial SWORD_TOOL_RED_DIAMOND = EnumHelper.addToolMaterial("red_diamond_tool", 5, 3500, 35.0f, 20.0f, 18);
    public static final Item.ToolMaterial TOOL_RED_RUBY = EnumHelper.addToolMaterial("red_ruby_tool", 5, 4000, 40.0f, 1.0f, 18);
    public static final Item.ToolMaterial SWORD_TOOL_RED_RUBY = EnumHelper.addToolMaterial("red_ruby_tool", 5, 4000, 40.0f, 25.0f, 18);
    public static final Item.ToolMaterial TOOL_GREEN_RUBY = EnumHelper.addToolMaterial("green_ruby_tool", 5, 4000, 40.0f, 1.0f, 18);
    public static final Item.ToolMaterial SWORD_TOOL_GREEN_RUBY = EnumHelper.addToolMaterial("green_ruby_tool", 5, 4000, 40.0f, 25.0f, 18);
    public static final Item.ToolMaterial TOOL_BLUE_RUBY = EnumHelper.addToolMaterial("blue_ruby_tool", 5, 4000, 40.0f, 1.0f, 18);
    public static final Item.ToolMaterial SWORD_TOOL_BLUE_RUBY = EnumHelper.addToolMaterial("blue_ruby_tool", 5, 4000, 40.0f, 25.0f, 18);
    public static final Item.ToolMaterial TOOL_BLACK_OPALE = EnumHelper.addToolMaterial("black_opale_tool", 5, 4500, 45.0f, 1.0f, 18);
    public static final Item.ToolMaterial SWORD_TOOL_BLACK_OPALE = EnumHelper.addToolMaterial("black_opale_tool", 5, 4500, 45.0f, 30.0f, 18);


    //Tools
    public static final Item GRENA_PICKAXE = new ItemPickaxeMod("grena_pickaxe", TOOL_GRENA);
    public static final Item GRENA_SHOVEL = new ItemShovelMod("grena_shovel", TOOL_GRENA);
    public static final Item GRENA_SWORD = new ItemSwordMod("grena_sword", SWORD_TOOL_GRENA);
    public static final Item GRENA_AXE = new ItemAxeMod("grena_axe", SWORD_TOOL_GRENA);
    public static final Item BLUE_GRENA_PICKAXE = new ItemPickaxeMod("blue_grena_pickaxe", TOOL_BLUE_GRENA);
    public static final Item BLUE_GRENA_SHOVEL = new ItemShovelMod("blue_grena_shovel", TOOL_BLUE_GRENA);
    public static final Item BLUE_GRENA_SWORD = new ItemSwordMod("blue_grena_sword", SWORD_TOOL_BLUE_GRENA);
    public static final Item BLUE_GRENA_AXE = new ItemAxeMod("blue_grena_axe", SWORD_TOOL_BLUE_GRENA);
    public static final Item ECO_PICKAXE = new ItemPickaxeMod("eco_pickaxe", TOOL_ECO);
    public static final Item ECO_SHOVEL = new ItemShovelMod("eco_shovel", TOOL_ECO);
    public static final Item ECO_SWORD = new ItemSwordMod("eco_sword", SWORD_TOOL_ECO);
    public static final Item ECO_AXE = new ItemAxeMod("eco_axe", SWORD_TOOL_ECO);
    public static final Item RED_DIAMOND_PICKAXE = new ItemPickaxeMod("red_diamond_pickaxe", TOOL_RED_DIAMOND);
    public static final Item RED_DIAMOND_SHOVEL = new ItemShovelMod("red_diamond_shovel", TOOL_RED_DIAMOND);
    public static final Item RED_DIAMOND_SWORD = new ItemSwordMod("red_diamond_sword", SWORD_TOOL_RED_DIAMOND);
    public static final Item RED_DIAMOND_AXE = new ItemAxeMod("red_diamond_axe", SWORD_TOOL_RED_DIAMOND);
    public static final Item RED_RUBY_PICKAXE = new ItemPickaxeMod("red_ruby_pickaxe", TOOL_RED_RUBY);
    public static final Item RED_RUBY_SHOVEL = new ItemShovelMod("red_ruby_shovel", TOOL_RED_RUBY);
    public static final Item RED_RUBY_SWORD = new ItemSwordMod("red_ruby_sword", SWORD_TOOL_RED_RUBY);
    public static final Item RED_RUBY_AXE = new ItemAxeMod("red_ruby_axe", SWORD_TOOL_RED_RUBY);
    public static final Item GREEN_RUBY_PICKAXE = new ItemPickaxeMod("green_ruby_pickaxe", TOOL_GREEN_RUBY);
    public static final Item GREEN_RUBY_SHOVEL = new ItemShovelMod("green_ruby_shovel", TOOL_GREEN_RUBY);
    public static final Item GREEN_RUBY_SWORD = new ItemSwordMod("green_ruby_sword", SWORD_TOOL_GREEN_RUBY);
    public static final Item GREEN_RUBY_AXE = new ItemAxeMod("green_ruby_axe", SWORD_TOOL_GREEN_RUBY);
    public static final Item BLUE_RUBY_PICKAXE = new ItemPickaxeMod("blue_ruby_pickaxe", TOOL_BLUE_RUBY);
    public static final Item BLUE_RUBY_SHOVEL = new ItemShovelMod("blue_ruby_shovel", TOOL_BLUE_RUBY);
    public static final Item BLUE_RUBY_SWORD = new ItemSwordMod("blue_ruby_sword", SWORD_TOOL_BLUE_RUBY);
    public static final Item BLUE_RUBY_AXE = new ItemAxeMod("blue_ruby_axe", SWORD_TOOL_BLUE_RUBY);
    public static final Item BLACK_OPALE_PICKAXE = new ItemPickaxeMod("black_opale_pickaxe", TOOL_BLACK_OPALE);
    public static final Item BLACK_OPALE_SHOVEL = new ItemShovelMod("black_opale_shovel", TOOL_BLACK_OPALE);
    public static final Item BLACK_OPALE_SWORD = new ItemSwordMod("black_opale_sword", SWORD_TOOL_BLACK_OPALE);
    public static final Item BLACK_OPALE_AXE = new ItemAxeMod("black_opale_axe", SWORD_TOOL_BLACK_OPALE);


}
