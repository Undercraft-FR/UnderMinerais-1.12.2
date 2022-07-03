package fr.undercraft.underminerals.items;

import com.google.common.collect.Sets;
import fr.undercraft.underminerals.UnderMinerals;
import fr.undercraft.underminerals.init.ItemInit;
import fr.undercraft.underminerals.init.ToolsInit;
import fr.undercraft.underminerals.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class ItemAxeMod extends ItemAxe implements IHasModel
{


    public ItemAxeMod(String name, ToolMaterial material)
    {
        super(material,material.getAttackDamage(),-3.0F);
        setRegistryName(name);
        setCreativeTab(UnderMinerals.TOOL_TAB);
        
        ToolsInit.TOOLS.add(this);
    }


    @Override
    public void registerModels() 
    {
        UnderMinerals.proxy.registerItemRenderer(this, 0);
    }

}