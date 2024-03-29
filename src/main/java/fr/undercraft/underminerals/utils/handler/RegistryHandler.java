package fr.undercraft.underminerals.utils.handler;

import fr.undercraft.underminerals.init.ArmorInit;
import fr.undercraft.underminerals.init.BlockInit;
import fr.undercraft.underminerals.init.ItemInit;
import fr.undercraft.underminerals.init.ToolsInit;
import fr.undercraft.underminerals.items.ArmorMod;
import fr.undercraft.underminerals.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler
{

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
        event.getRegistry().registerAll(ToolsInit.TOOLS.toArray(new Item[0]));
        event.getRegistry().registerAll(ArmorInit.ARMORS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Item item : ItemInit.ITEMS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        }
        for(Item item : ToolsInit.TOOLS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        }for(Item item : ArmorInit.ARMORS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        }

        for(Block block : BlockInit.BLOCKS)
        {
            if(block instanceof IHasModel)
            {
                ((IHasModel)block).registerModels();
            }
        }
    }



    public static void preInitRegistries() {

    }
    public static void initRegistries() {

    }

}