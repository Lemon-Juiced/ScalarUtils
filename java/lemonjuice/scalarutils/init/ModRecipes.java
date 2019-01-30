package lemonjuice.scalarutils.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		//Scalar Arsenal
		GameRegistry.addSmelting(ModBlocks.FRUITILIZED_STONE_BLOCK, new ItemStack(ModItems.CITRINE_INGOT), 0.7F);
		
		//Scalar Custom Alloys
		GameRegistry.addSmelting(ModItems.RED_ALLOY_DUST, new ItemStack(ModItems.RED_ALLOY_INGOT), 1.0F);
		GameRegistry.addSmelting(ModItems.ORANGE_ALLOY_DUST, new ItemStack(ModItems.ORANGE_ALLOY_INGOT), 1.0F);
		GameRegistry.addSmelting(ModItems.YELLOW_ALLOY_DUST, new ItemStack(ModItems.YELLOW_ALLOY_INGOT), 1.0F);
		GameRegistry.addSmelting(ModItems.GREEN_ALLOY_DUST, new ItemStack(ModItems.GREEN_ALLOY_INGOT), 1.0F);
		GameRegistry.addSmelting(ModItems.BLUE_ALLOY_DUST, new ItemStack(ModItems.BLUE_ALLOY_INGOT), 1.0F);
		GameRegistry.addSmelting(ModItems.PURPLE_ALLOY_DUST, new ItemStack(ModItems.PURPLE_ALLOY_INGOT), 1.0F);
		GameRegistry.addSmelting(ModItems.BROWN_ALLOY_DUST, new ItemStack(ModItems.BROWN_ALLOY_INGOT), 1.0F);
		GameRegistry.addSmelting(ModItems.WHITE_ALLOY_DUST, new ItemStack(ModItems.WHITE_ALLOY_INGOT), 1.0F);
		GameRegistry.addSmelting(ModItems.GRAY_ALLOY_DUST, new ItemStack(ModItems.GRAY_ALLOY_INGOT), 1.0F);
		GameRegistry.addSmelting(ModItems.BLACK_ALLOY_DUST, new ItemStack(ModItems.BLACK_ALLOY_INGOT), 1.0F);
		
		//Scalar Chicken Nuggets
		GameRegistry.addSmelting(ModItems.RAW_CHICKEN_NUGGET, new ItemStack(ModItems.COOKED_CHICKEN_NUGGET), 0.7F);
		
		//Scalar Grilled Cheese
		GameRegistry.addSmelting(Items.MILK_BUCKET, new ItemStack(ModItems.CHEESE, 4), 0.5F);
		
		//Scalar Simple Toast
		GameRegistry.addSmelting(ModItems.FLOUR, new ItemStack(Items.BREAD), 0.7F);
		GameRegistry.addSmelting(Items.BREAD, new ItemStack(ModItems.TOAST), 0.7F);
		GameRegistry.addSmelting(Items.WHEAT_SEEDS, new ItemStack(ModItems.SESAMESEEDS), 0.7F);
		
		//Scalar Simple WorldGen
		GameRegistry.addSmelting(ModBlocks.QUARTZ_ORE_BLOCK, new ItemStack(ModItems.QUARTZ_SHARD, 8), 1.5F);
	}

}
