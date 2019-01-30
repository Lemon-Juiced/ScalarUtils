package lemonjuice.scalarutils.init;

import java.util.ArrayList;
import java.util.List;

import lemonjuice.scalarutils.blocks.AlloyBlock;
import lemonjuice.scalarutils.blocks.AntiBlock;
import lemonjuice.scalarutils.blocks.CamoBlock;
import lemonjuice.scalarutils.blocks.FlaxPlantBlock;
import lemonjuice.scalarutils.blocks.LemonHeadBlock;
import lemonjuice.scalarutils.blocks.OreBlock;
import lemonjuice.scalarutils.blocks.PlaceholderBlock;
import lemonjuice.scalarutils.blocks.RockBlock;
import lemonjuice.scalarutils.blocks.WoodBlock;
//import lemonjuice.scalarutils.blocks.machines.crystallizer.Crystallizer_Block;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Scalar Anti-Blocks
	public static final Block WHITE_ANTI_BLOCK = new AntiBlock("white_anti_block", Material.ROCK);
	public static final Block BLACK_ANTI_BLOCK = new AntiBlock("black_anti_block", Material.ROCK);
	public static final Block GRAY_ANTI_BLOCK = new AntiBlock("gray_anti_block", Material.ROCK);
	public static final Block LIGHT_GRAY_ANTI_BLOCK = new AntiBlock("light_gray_anti_block", Material.ROCK);
	public static final Block RED_ANTI_BLOCK = new AntiBlock("red_anti_block", Material.ROCK);
	public static final Block ORANGE_ANTI_BLOCK = new AntiBlock("orange_anti_block", Material.ROCK);
	public static final Block PINK_ANTI_BLOCK = new AntiBlock("pink_anti_block", Material.ROCK);
	public static final Block YELLOW_ANTI_BLOCK = new AntiBlock("yellow_anti_block", Material.ROCK);
	public static final Block LIME_ANTI_BLOCK = new AntiBlock("lime_anti_block", Material.ROCK);
	public static final Block GREEN_ANTI_BLOCK = new AntiBlock("green_anti_block", Material.ROCK);
	public static final Block LIGHT_BLUE_ANTI_BLOCK = new AntiBlock("light_blue_anti_block", Material.ROCK);
	public static final Block CYAN_ANTI_BLOCK = new AntiBlock("cyan_anti_block", Material.ROCK);
	public static final Block BLUE_ANTI_BLOCK = new AntiBlock("blue_anti_block", Material.ROCK);
	public static final Block MAGENTA_ANTI_BLOCK = new AntiBlock("magenta_anti_block", Material.ROCK);
	public static final Block PURPLE_ANTI_BLOCK = new AntiBlock("purple_anti_block", Material.ROCK);
	public static final Block BROWN_ANTI_BLOCK = new AntiBlock("brown_anti_block", Material.ROCK);
	
	//Scalar Arsenal
	 //Blocks
	public static final Block FRUITILIZED_STONE_BLOCK = new RockBlock("fruitilized_stone_block", Material.ROCK);
	
	//Scalar Camo-Lighting
	 //Stones
	  //Andesite
	  //Cobble
	  //Diorite
	  //Granite
	  //Stone
	public static final Block CAMO_STONE_BLOCK = new CamoBlock("camo_stone_block", Material.ROCK);
	public static final Block CAMO_STONE_BRICK_BLOCK = new CamoBlock("camo_stone_brick_block", Material.ROCK);
	public static final Block CAMO_CHISELED_STONE_BRICK_BLOCK = new CamoBlock("camo_chiseled_stone_brick_block", Material.ROCK);
	public static final Block CAMO_CRACKED_STONE_BRICK_BLOCK = new CamoBlock("camo_cracked_stone_brick_block", Material.ROCK);
	public static final Block CAMO_MOSSY_STONE_BRICK_BLOCK = new CamoBlock("camo_mossy_stone_brick_block", Material.ROCK);
	 //Wood
	  //Bark
	public static final Block CAMO_OAK_BARK_BLOCK = new CamoBlock("camo_oak_bark_block", Material.WOOD);
	public static final Block CAMO_SPRUCE_BARK_BLOCK = new CamoBlock("camo_spruce_bark_block", Material.WOOD);
	public static final Block CAMO_BIRCH_BARK_BLOCK = new CamoBlock("camo_birch_bark_block", Material.WOOD);
	public static final Block CAMO_JUNGLE_BARK_BLOCK = new CamoBlock("camo_jungle_bark_block", Material.WOOD);
	public static final Block CAMO_ACACIA_BARK_BLOCK = new CamoBlock("camo_acacia_bark_block", Material.WOOD);
	public static final Block CAMO_DARKOAK_BARK_BLOCK = new CamoBlock("camo_darkoak_bark_block", Material.WOOD);
	  //Logs
	public static final Block CAMO_OAK_LOG_BLOCK = new CamoBlock("camo_oak_log_block", Material.WOOD);
	public static final Block CAMO_SPRUCE_LOG_BLOCK = new CamoBlock("camo_spruce_log_block", Material.WOOD);
	public static final Block CAMO_BIRCH_LOG_BLOCK = new CamoBlock("camo_birch_log_block", Material.WOOD);
	public static final Block CAMO_JUNGLE_LOG_BLOCK = new CamoBlock("camo_jungle_log_block", Material.WOOD);
	public static final Block CAMO_ACACIA_LOG_BLOCK = new CamoBlock("camo_acacia_log_block", Material.WOOD);
	public static final Block CAMO_DARKOAK_LOG_BLOCK = new CamoBlock("camo_darkoak_log_block", Material.WOOD);
	  //Planks
	public static final Block CAMO_OAK_PLANK_BLOCK = new CamoBlock("camo_oak_plank_block", Material.WOOD);
	public static final Block CAMO_SPRUCE_PLANK_BLOCK = new CamoBlock("camo_spruce_plank_block", Material.WOOD);
	public static final Block CAMO_BIRCH_PLANK_BLOCK = new CamoBlock("camo_birch_plank_block", Material.WOOD);
	public static final Block CAMO_JUNGLE_PLANK_BLOCK = new CamoBlock("camo_jungle_plank_block", Material.WOOD);
	public static final Block CAMO_ACACIA_PLANK_BLOCK = new CamoBlock("camo_acacia_plank_block", Material.WOOD);
	public static final Block CAMO_DARKOAK_PLANK_BLOCK = new CamoBlock("camo_darkoak_plank_block", Material.WOOD);
	
	//Scalar Crops
	public static final Block FLAX_PLANT = new FlaxPlantBlock("flax_plant");
	
	//Scalar Crystallization
	//public static final Block CRYSTALLIZER = new Crystallizer_Block("crystallizer_block");
	
	//Scalar Custom Alloys
	public static final Block RED_ALLOY_BLOCK = new AlloyBlock("red_alloy_block", Material.IRON);
	public static final Block ORANGE_ALLOY_BLOCK = new AlloyBlock("orange_alloy_block", Material.IRON);
	public static final Block YELLOW_ALLOY_BLOCK = new AlloyBlock("yellow_alloy_block", Material.IRON);
	public static final Block GREEN_ALLOY_BLOCK = new AlloyBlock("green_alloy_block", Material.IRON);
	public static final Block BLUE_ALLOY_BLOCK = new AlloyBlock("blue_alloy_block", Material.IRON);
	public static final Block PURPLE_ALLOY_BLOCK = new AlloyBlock("purple_alloy_block", Material.IRON);
	public static final Block BROWN_ALLOY_BLOCK = new AlloyBlock("brown_alloy_block", Material.IRON);
	public static final Block WHITE_ALLOY_BLOCK = new AlloyBlock("white_alloy_block", Material.IRON);
	public static final Block GRAY_ALLOY_BLOCK = new AlloyBlock("gray_alloy_block", Material.IRON);
	public static final Block BLACK_ALLOY_BLOCK = new AlloyBlock("black_alloy_block", Material.IRON);
	
	//Scalar Lumber
	 //Paperwall
	public static final Block PAPERWALL_BLOCK = new WoodBlock("paperwall_block", Material.WOOD);
	 //Timber Frames
	  //Horizontal
	public static final Block OAK_HORIZONTAL_TIMBER_FRAME_BLOCK = new WoodBlock("oak_horizontal_timber_frame_block", Material.WOOD);
	public static final Block SPRUCE_HORIZONTAL_TIMBER_FRAME_BLOCK = new WoodBlock("spruce_horizontal_timber_frame_block", Material.WOOD);
	public static final Block BIRCH_HORIZONTAL_TIMBER_FRAME_BLOCK = new WoodBlock("birch_horizontal_timber_frame_block", Material.WOOD);
	public static final Block JUNGLE_HORIZONTAL_TIMBER_FRAME_BLOCK = new WoodBlock("jungle_horizontal_timber_frame_block", Material.WOOD);
	public static final Block ACACIA_HORIZONTAL_TIMBER_FRAME_BLOCK = new WoodBlock("acacia_horizontal_timber_frame_block", Material.WOOD);
	public static final Block DARKOAK_HORIZONTAL_TIMBER_FRAME_BLOCK = new WoodBlock("darkoak_horizontal_timber_frame_block", Material.WOOD);
	  //Vertical
	public static final Block OAK_VERTICAL_TIMBER_FRAME_BLOCK = new WoodBlock("oak_vertical_timber_frame_block", Material.WOOD);
	public static final Block SPRUCE_VERTICAL_TIMBER_FRAME_BLOCK = new WoodBlock("spruce_vertical_timber_frame_block", Material.WOOD);
	public static final Block BIRCH_VERTICAL_TIMBER_FRAME_BLOCK = new WoodBlock("birch_vertical_timber_frame_block", Material.WOOD);
	public static final Block JUNGLE_VERTICAL_TIMBER_FRAME_BLOCK = new WoodBlock("jungle_vertical_timber_frame_block", Material.WOOD);
	public static final Block ACACIA_VERTICAL_TIMBER_FRAME_BLOCK = new WoodBlock("acacia_vertical_timber_frame_block", Material.WOOD);
	public static final Block DARKOAK_VERTICAL_TIMBER_FRAME_BLOCK = new WoodBlock("darkoak_vertical_timber_frame_block", Material.WOOD);
	 //Wall
	public static final Block WALL_BLOCK = new WoodBlock("wall_block", Material.WOOD);
	
	//Scalar Masonry
	 //Reinforced Stones
	  //Cobblestone
	public static final Block REINFORCED_COBBLESTONE_BLOCK = new RockBlock("reinforced_cobblestone_block", Material.ROCK);
	   //Encased
	public static final Block ENCASED_REINFORCED_COBBLESTONE_BLOCK = new RockBlock("encased_reinforced_cobblestone_block", Material.ROCK);
	  //Stone
	public static final Block REINFORCED_STONE_BLOCK = new RockBlock("reinforced_stone_block", Material.ROCK); 
	 //Tiles
	public static final Block ANDESITE_DIORITE_TILES_BLOCK = new RockBlock("andesite_diorite_tiles_block", Material.ROCK);
	public static final Block ANDESITE_GRANITE_TILES_BLOCK = new RockBlock("andesite_granite_tiles_block", Material.ROCK);
	public static final Block DIORITE_GRANITE_TILES_BLOCK = new RockBlock("diorite_granite_tiles_block", Material.ROCK);
	
	//Scalar Shenanigans
		public static final Block LEMON_HEAD_BLOCK = new LemonHeadBlock("lemon_head_block", Material.ROCK);
		public static final Block SCALAR_BLOCK = new PlaceholderBlock("scalar_block", Material.ROCK);
		
	//Scalar Simple Utility Creator (Blocks)
	public static final Block PLACEHOLDER_BLOCK = new PlaceholderBlock("placeholder_block", Material.IRON);
	 //Scalar Civilization
	public static final Block BASIC_MACHINE_CASE_BLOCK = new PlaceholderBlock("basic_machine_case_block", Material.CIRCUITS);
	public static final Block ADVANCED_MACHINE_CASE_BLOCK = new PlaceholderBlock("advanced_machine_case_block", Material.CIRCUITS);
		
	//Scalar Simple WorldGen
	 //Derivative
	public static final Block SMOOTH_MARBLE_BLOCK = new RockBlock("smooth_marble_block", Material.ROCK);
	public static final Block SMOOTH_MARBLE_BRICK_BLOCK = new RockBlock("smooth_marble_brick_block", Material.ROCK);
	public static final Block BASALT_BRICK_BLOCK = new RockBlock("basalt_brick_block", Material.ROCK);
	 //World
	public static final Block MARBLE_BLOCK = new RockBlock("marble_block", Material.ROCK);
	public static final Block BASALT_BLOCK = new RockBlock("basalt_block", Material.ROCK);
	public static final Block QUARTZ_ORE_BLOCK = new OreBlock("quartz_ore_block", Material.ROCK);
	
};
