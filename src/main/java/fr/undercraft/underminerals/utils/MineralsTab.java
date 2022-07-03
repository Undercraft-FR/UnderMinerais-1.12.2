package fr.undercraft.underminerals.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MineralsTab extends CreativeTabs {
    public MineralsTab(String name) {
        super(name);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.DIAMOND);
    }
}
