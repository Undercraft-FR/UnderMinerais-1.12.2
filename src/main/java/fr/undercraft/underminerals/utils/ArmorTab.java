package fr.undercraft.underminerals.utils;

import fr.undercraft.underminerals.init.ArmorInit;
import fr.undercraft.underminerals.init.ToolsInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ArmorTab extends CreativeTabs {
    public ArmorTab(String name) {
        super(name);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ArmorInit.BLACK_OPALE_HELMET);
    }
}
