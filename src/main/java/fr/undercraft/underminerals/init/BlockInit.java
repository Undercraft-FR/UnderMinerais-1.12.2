package fr.undercraft.underminerals.init;

import fr.undercraft.underminerals.blocks.BlockBasic;
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
    public static final Block ORE_RED_RUBY = new BlockOreMod("ore_red_ruby", Material.ROCK,ItemInit.RED_RUBY);
    public static final Block ORE_GREEN_RUBY = new BlockOreMod("ore_green_ruby", Material.ROCK,ItemInit.GREEN_RUBY);
    public static final Block ORE_BLUE_RUBY = new BlockOreMod("ore_blue_ruby", Material.ROCK,ItemInit.BLUE_RUBY);
    public static final Block ORE_BLACK_OPAL = new BlockOreMod("ore_black_opal", Material.ROCK,ItemInit.BLACK_OPAL);

    //Blocks
    public static final Block BLOCK_GRENA = new BlockBasic("block_grena", Material.ROCK);
    public static final Block BLOCK_BLUE_GRENA = new BlockBasic("block_blue_grena", Material.ROCK);
    public static final Block BLOCK_ECO = new BlockBasic("block_eco", Material.ROCK);
    public static final Block BLOCK_JADE = new BlockBasic("block_jade", Material.ROCK);
    public static final Block BLOCK_RED_DIAMOND = new BlockBasic("block_red_diamond", Material.ROCK);
    public static final Block BLOCK_RED_RUBY = new BlockBasic("block_red_ruby", Material.ROCK);
    public static final Block BLOCK_GREEN_RUBY = new BlockBasic("block_green_ruby", Material.ROCK);
    public static final Block BLOCK_BLUE_RUBY = new BlockBasic("block_blue_ruby", Material.ROCK);
    public static final Block BLOCK_BLACK_OPAL = new BlockBasic("block_black_opal", Material.ROCK);

}