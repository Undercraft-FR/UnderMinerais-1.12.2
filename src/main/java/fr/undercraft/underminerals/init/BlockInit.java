package fr.undercraft.underminerals.init;

import fr.undercraft.underminerals.blocks.BlockOreMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static List<Block> BLOCKS = new ArrayList<>();

    //public static final Block BLOCK_TUTO = new BlockBasic("block_tuto", Material.ROCK);
    
    //Ores
    public static final Block ORE_GRENA = new BlockOreMod("ore_grena", Material.ROCK,ItemInit.GRENA);
    public static final Block ORE_BLUE_GRENA = new BlockOreMod("ore_blue_grena", Material.ROCK,ItemInit.BLUE_GRENA);
    public static final Block ORE_ECO = new BlockOreMod("ore_eco", Material.ROCK,ItemInit.ECO);
    public static final Block ORE_JADE = new BlockOreMod("ore_jade", Material.ROCK,ItemInit.JADE);
    public static final Block ORE_RED_DIAMOND = new BlockOreMod("ore_red_diamond", Material.ROCK,ItemInit.RED_DIAMOND);
    public static final Block ORE_RED_RUBY = new BlockOreMod("ore_grena", Material.ROCK,ItemInit.RED_RUBY);
    public static final Block ORE_GREEN_RUBY = new BlockOreMod("ore_grena", Material.ROCK,ItemInit.GREEN_RUBY);
    public static final Block ORE_BLUE_RUBY = new BlockOreMod("ore_grena", Material.ROCK,ItemInit.BLUE_RUBY);
    public static final Block ORE_BLACK_OPALE = new BlockOreMod("ore_grena", Material.ROCK,ItemInit.BLACK_OPALE);

}