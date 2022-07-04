package fr.undercraft.underminerals.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ToolTab extends CreativeTabs {
    public ToolTab(String name) {
        super(name);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.DIAMOND_PICKAXE);
    }
}
