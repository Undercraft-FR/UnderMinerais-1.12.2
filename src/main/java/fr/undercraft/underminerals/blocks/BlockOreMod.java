package fr.undercraft.underminerals.blocks;

import fr.undercraft.underminerals.UnderMinerals;
import fr.undercraft.underminerals.init.BlockInit;
import fr.undercraft.underminerals.init.ItemInit;
import fr.undercraft.underminerals.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.ArrayList;
import java.util.List;

public class BlockOreMod extends Block implements IHasModel
{
    Item drop;
    public BlockOreMod(String name, Material material,Item drop)
    {
        super(material);
        setRegistryName(name);
        setCreativeTab(UnderMinerals.TAB);
        setHardness(8.0F);
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
        this.drop = drop;
    }
    
    @Override
    public void registerModels()
    {
        UnderMinerals.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }
    
    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        List<ItemStack> list = new ArrayList<>();
        list.add(new ItemStack(drop, (fortune < 2 ? 1 : 3)));
        return list;
    }
}