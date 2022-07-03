package fr.undercraft.underminerals.items;

import fr.undercraft.underminerals.UnderMinerals;
import fr.undercraft.underminerals.init.ItemInit;
import fr.undercraft.underminerals.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setRegistryName(name);
        setCreativeTab(UnderMinerals.TAB);
        ItemInit.ITEMS.add(this);
    }
    
    @Override
    public void registerModels()
    {
        UnderMinerals.proxy.registerItemRenderer(this, 0);
    }

}