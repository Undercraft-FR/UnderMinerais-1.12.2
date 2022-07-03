package fr.undercraft.underminerals.items;

import fr.undercraft.underminerals.UnderMinerals;
import fr.undercraft.underminerals.init.ItemInit;
import fr.undercraft.underminerals.init.ToolsInit;
import fr.undercraft.underminerals.utils.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

public class ItemShovelMod extends ItemSpade implements IHasModel
{

    public ItemShovelMod(String name, ToolMaterial material)
    {
        super(material);
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