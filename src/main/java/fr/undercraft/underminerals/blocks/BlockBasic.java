package fr.undercraft.underminerals.blocks;

import fr.undercraft.underminerals.UnderMinerals;
import fr.undercraft.underminerals.init.BlockInit;
import fr.undercraft.underminerals.init.ItemInit;
import fr.undercraft.underminerals.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBasic extends Block implements IHasModel
{
    public BlockBasic(String name, Material material)
    {
        super(material);
        setRegistryName(name);
        setCreativeTab(UnderMinerals.TAB);
        setHardness(8.0F);
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }
    
    @Override
    public void registerModels()
    {
        UnderMinerals.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }
    

} 