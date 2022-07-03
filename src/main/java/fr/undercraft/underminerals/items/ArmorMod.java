package fr.undercraft.underminerals.items;

import fr.undercraft.underminerals.UnderMinerals;
import fr.undercraft.underminerals.init.ArmorInit;
import fr.undercraft.underminerals.init.ItemInit;
import fr.undercraft.underminerals.utils.interfaces.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ArmorMod extends ItemArmor implements IHasModel
{

    public ArmorMod(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setRegistryName(name);
        setCreativeTab(UnderMinerals.ARMOR_TAB);
        ArmorInit.ARMORS.add(this);
    }

    @Override
    public void registerModels()
    {
        UnderMinerals.proxy.registerItemRenderer(this, 0);
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        super.onArmorTick(world, player, itemStack);
    }
    
}