package fr.undercraft.underminerals.utils;

import fr.undercraft.underminerals.init.ToolsInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ToolTab extends CreativeTabs {
    public ToolTab(String name) {
        super(name);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ToolsInit.BLACK_OPALE_PICKAXE);
    }
}
