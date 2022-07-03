package fr.undercraft.underminerals;

import fr.undercraft.underminerals.proxy.CommonProxy;
import fr.undercraft.underminerals.utils.MineralsTab;
import fr.undercraft.underminerals.utils.Reference;
import fr.undercraft.underminerals.utils.ToolTab;
import fr.undercraft.underminerals.utils.handler.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = Reference.MODID,
        name = Reference.NAME,
        version = Reference.VERSION
)
public class UnderMinerals {

    @Mod.Instance(Reference.MODID)
    public static UnderMinerals INSTANCE;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    public static final CreativeTabs TAB = new MineralsTab("mineral_tab");
    public static final CreativeTabs TOOL_TAB = new ToolTab("tool_tab");
    public static final CreativeTabs ARMOR_TAB = new ToolTab("armor_tab");

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        proxy.preInit();

        RegistryHandler.preInitRegistries();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        RegistryHandler.initRegistries();
    }


    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }




}
