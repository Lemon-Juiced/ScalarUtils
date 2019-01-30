package lemonjuice.scalarutils;

import lemonjuice.scalarutils.handlers.FuelHandler;
import lemonjuice.scalarutils.init.ModItems;
import lemonjuice.scalarutils.init.ModRecipes;
import lemonjuice.scalarutils.proxy.CommonProxy;
import lemonjuice.scalarutils.tabs.ScalarTab;
import lemonjuice.scalarutils.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	public static final CreativeTabs scalartab = new ScalarTab("scalartab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	//Event Handlers
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event){
		OreDictionary.registerOre("shakinator", new ItemStack(ModItems.SHAKINATOR, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("slimeball", new ItemStack(ModItems.ARTIFICIAL_SLIMEBALL, 1, OreDictionary.WILDCARD_VALUE));

	}
	
	@SubscribeEvent
	public void FlaxSeedsDrop(HarvestDropsEvent event)
	{
		int randomyield = (int)(Math.random() * 1+1);
		if(event.getState().getBlock() == Blocks.TALLGRASS)
		{
			event.getDrops().add(new ItemStack(ModItems.FLAX_SEEDS, randomyield));
		}
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event){
		ModRecipes.init();
		GameRegistry.registerFuelHandler(new FuelHandler());
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event){
		
	}
	
}
