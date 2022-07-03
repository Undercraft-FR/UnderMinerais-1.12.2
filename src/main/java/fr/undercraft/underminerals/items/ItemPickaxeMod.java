package fr.undercraft.underminerals.items;

import fr.undercraft.underminerals.UnderMinerals;
import fr.undercraft.underminerals.init.ItemInit;
import fr.undercraft.underminerals.init.ToolsInit;
import fr.undercraft.underminerals.utils.interfaces.IHasModel;
import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeMod extends ItemPickaxe implements IHasModel
{

    public ItemPickaxeMod(String name, ToolMaterial material)
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