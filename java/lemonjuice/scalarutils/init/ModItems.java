package lemonjuice.scalarutils.init;

import java.util.ArrayList;
import java.util.List;

import lemonjuice.scalarutils.items.AlloyItem;
import lemonjuice.scalarutils.items.CraftingItem;
import lemonjuice.scalarutils.items.FlaxItem;
import lemonjuice.scalarutils.items.ItemCustomFood;
import lemonjuice.scalarutils.items.ItemCustomFoodEffect;
import lemonjuice.scalarutils.items.MiscItem;
import lemonjuice.scalarutils.items.armor.ArmorBase;
import lemonjuice.scalarutils.items.tools.ToolAxe;
import lemonjuice.scalarutils.items.tools.ToolHoe;
import lemonjuice.scalarutils.items.tools.ToolPickaxe;
import lemonjuice.scalarutils.items.tools.ToolSpade;
import lemonjuice.scalarutils.items.tools.ToolSword;
import lemonjuice.scalarutils.util.Reference;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_PLACEHOLDER = EnumHelper.addToolMaterial("material_placeholder", 100, 1000000, 10.0F, 100, 50);
	public static final ToolMaterial MATERIAL_SCALAR = EnumHelper.addToolMaterial("material_scalar", 5, 64000, 4.0F, 8, 20);
	//Armor Materials
	public static final ArmorMaterial ARMOR_MATERIAL_PLACEHOLDER = EnumHelper.addArmorMaterial("armor_material_placeholder", Reference.MOD_ID + ":placeholder", 100, new int[] {100, 100, 100, 100}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 10.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SHELLMET = EnumHelper.addArmorMaterial("armor_material_shellmet", Reference.MOD_ID + ":shellmet", 15, new int[] {1, 1, 1, 1}, 5, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 0.1F);
	public static final ArmorMaterial ARMOR_MATERIAL_ENDER = EnumHelper.addArmorMaterial("armor_material_ender", Reference.MOD_ID + ":ender", 15, new int[] {5, 10, 8, 5}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 7.0F);
	
	//Food
	 //Scalar Arsenal
	public static final Item LEMON_HEADS = new ItemCustomFoodEffect("lemon_heads", 2, 1, true, new PotionEffect(MobEffects.REGENERATION, (10*20), 4, false, true));
	 //Scalar Chicken Nuggets
	public static final Item RAW_CHICKEN_NUGGET = new ItemCustomFood("raw_chicken_nugget", 1, 0, true);
	public static final Item COOKED_CHICKEN_NUGGET = new ItemCustomFood("cooked_chicken_nugget", 2, 1, false);
	 //Scalar Grilled Cheese
	public static final Item CHEESE = new ItemCustomFood("cheese", 2, 2, false);
	public static final Item GRILLED_CHEESE = new ItemCustomFood("grilled_cheese", 16, 5, false);
	 //Scalar Simple Toast
	public static final Item FLOUR = new MiscItem("flour");
	public static final Item TOAST = new ItemCustomFood("toast", 6, 3, false);
	public static final Item SESAMESEEDS = new ItemCustomFood("sesameseeds", 1, 1, false);
	public static final Item SESAMESEEDTOAST = new ItemCustomFood("sesameseedtoast", 8, 4, false);
	
	//Scalar Anti-Blocks (Items)
	public static final Item ANTI_MESH = new MiscItem("anti_mesh");
	
	//Scalar Arsenal
	 //Armor
	public static final Item SHELLMET_BOOTS = new ArmorBase("shellmet_boots", ARMOR_MATERIAL_SHELLMET, 1, EntityEquipmentSlot.FEET);	
	 //Items
	public static final Item ARSENIC = new ItemCustomFoodEffect("arsenic", 1, 0, true, new PotionEffect(MobEffects.POISON, (15*20), 3, false, true));
	public static final Item CITRINE_INGOT = new AlloyItem("citrine_ingot");
	public static final Item ENERGIZED_CITRINE_INGOT = new AlloyItem("energized_citrine_ingot");
	public static final Item CONGLOMERATE = new MiscItem("conglomerate");
	public static final Item HILT = new MiscItem("hilt");
	public static final Item BEJEWELD_HILT= new MiscItem("bejeweled_hilt");
	 //Weapons
	public static final Item CITRUS_CLAYMORE = new ToolSword("citrus_claymore", MATERIAL_SCALAR);
	public static final Item FROST_FALCHION = new ToolSword("frost_falchion", MATERIAL_SCALAR);
	public static final Item TURTLE_TRIDENT = new ToolSword("turtle_trident", MATERIAL_SCALAR);
	public static final Item BROWN_BLADE = new ToolSword("little_brown_blade", MATERIAL_SCALAR);
	
	//Scalar Crops
	 //Flax
	public static final Item FLAX_SEEDS = new FlaxItem("flax_seeds");
	public static final Item FLAX = new FlaxItem("flax");
	
	//Scalar Custom Alloys
	 //Dusts
	public static final Item RED_ALLOY_DUST = new AlloyItem("red_alloy_dust");
	public static final Item ORANGE_ALLOY_DUST = new AlloyItem("orange_alloy_dust");
	public static final Item YELLOW_ALLOY_DUST = new AlloyItem("yellow_alloy_dust");
	public static final Item GREEN_ALLOY_DUST = new AlloyItem("green_alloy_dust");
	public static final Item BLUE_ALLOY_DUST = new AlloyItem("blue_alloy_dust");
	public static final Item PURPLE_ALLOY_DUST = new AlloyItem("purple_alloy_dust");
	public static final Item BROWN_ALLOY_DUST = new AlloyItem("brown_alloy_dust");
	public static final Item WHITE_ALLOY_DUST = new AlloyItem("white_alloy_dust");
	public static final Item GRAY_ALLOY_DUST = new AlloyItem("gray_alloy_dust");
	public static final Item BLACK_ALLOY_DUST = new AlloyItem("black_alloy_dust");
	 //Ingots
	public static final Item RED_ALLOY_INGOT = new AlloyItem("red_alloy_ingot");
	public static final Item ORANGE_ALLOY_INGOT = new AlloyItem("orange_alloy_ingot");
	public static final Item YELLOW_ALLOY_INGOT = new AlloyItem("yellow_alloy_ingot");
	public static final Item GREEN_ALLOY_INGOT = new AlloyItem("green_alloy_ingot");
	public static final Item BLUE_ALLOY_INGOT = new AlloyItem("blue_alloy_ingot");
	public static final Item PURPLE_ALLOY_INGOT = new AlloyItem("purple_alloy_ingot");
	public static final Item BROWN_ALLOY_INGOT = new AlloyItem("brown_alloy_ingot");
	public static final Item WHITE_ALLOY_INGOT = new AlloyItem("white_alloy_ingot");
	public static final Item GRAY_ALLOY_INGOT = new AlloyItem("gray_alloy_ingot");
	public static final Item BLACK_ALLOY_INGOT = new AlloyItem("black_alloy_ingot");
	 //Nuggets
	public static final Item RED_ALLOY_NUGGET = new AlloyItem("red_alloy_nugget");
	public static final Item ORANGE_ALLOY_NUGGET = new AlloyItem("orange_alloy_nugget");
	public static final Item YELLOW_ALLOY_NUGGET = new AlloyItem("yellow_alloy_nugget");
	public static final Item GREEN_ALLOY_NUGGET = new AlloyItem("green_alloy_nugget");
	public static final Item BLUE_ALLOY_NUGGET = new AlloyItem("blue_alloy_nugget");
	public static final Item PURPLE_ALLOY_NUGGET = new AlloyItem("purple_alloy_nugget");
	public static final Item BROWN_ALLOY_NUGGET = new AlloyItem("brown_alloy_nugget");
	public static final Item WHITE_ALLOY_NUGGET = new AlloyItem("white_alloy_nugget");
	public static final Item GRAY_ALLOY_NUGGET = new AlloyItem("gray_alloy_nugget");
	public static final Item BLACK_ALLOY_NUGGET = new AlloyItem("black_alloy_nugget");
	 //Plates
	public static final Item RED_ALLOY_PLATE = new AlloyItem("red_alloy_plate");
	public static final Item ORANGE_ALLOY_PLATE = new AlloyItem("orange_alloy_plate");
	public static final Item YELLOW_ALLOY_PLATE = new AlloyItem("yellow_alloy_plate");
	public static final Item GREEN_ALLOY_PLATE = new AlloyItem("green_alloy_plate");
	public static final Item BLUE_ALLOY_PLATE = new AlloyItem("blue_alloy_plate");
	public static final Item PURPLE_ALLOY_PLATE = new AlloyItem("purple_alloy_plate");
	public static final Item BROWN_ALLOY_PLATE = new AlloyItem("brown_alloy_plate");
	public static final Item WHITE_ALLOY_PLATE = new AlloyItem("white_alloy_plate");
	public static final Item GRAY_ALLOY_PLATE = new AlloyItem("gray_alloy_plate");
	public static final Item BLACK_ALLOY_PLATE = new AlloyItem("black_alloy_plate");
	
	//Scalar End-Game Arsenal
	 //Items
	public static final Item ENDERSTAR = new MiscItem("enderstar");
	public static final Item DRAGONSTAR = new MiscItem("dragonstar");
	 //Armor
	  //Ender
	public static final Item ENDER_HELMET = new ArmorBase("ender_helmet", ARMOR_MATERIAL_ENDER, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENDER_CHESTPLATE = new ArmorBase("ender_chestplate", ARMOR_MATERIAL_ENDER, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENDER_LEGGINGS = new ArmorBase("ender_leggings", ARMOR_MATERIAL_ENDER, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENDER_BOOTS = new ArmorBase("ender_boots", ARMOR_MATERIAL_ENDER, 1, EntityEquipmentSlot.FEET);
	  //Shellmet
	public static final Item SHELLMET_HELMET = new ArmorBase("shellmet_helmet", ARMOR_MATERIAL_SHELLMET, 1, EntityEquipmentSlot.HEAD);
	
	//Scalar Grilled Cheese
	public static final Item SHAKINATOR = new CraftingItem("shakinator");
	
	//Scalar Oddities
	public static final Item ARTIFICIAL_SLIMEBALL = new CraftingItem("artificial_slimeball");
	
	//Scalar Simple Utility Creator (Items)
	 //Items
	public static final Item PLACEHOLDER = new MiscItem("placeholder");
	 //Tools
	public static final ItemSword PLACEHOLDER_SWORD = new ToolSword("placeholder_sword", MATERIAL_PLACEHOLDER);
	public static final ItemPickaxe PLACEHOLDER_PICKAXE = new ToolPickaxe("placeholder_pickaxe", MATERIAL_PLACEHOLDER);
	public static final ItemAxe PLACEHOLDER_AXE = new ToolAxe("placeholder_axe", MATERIAL_PLACEHOLDER);
	public static final ItemSpade PLACEHOLDER_SHOVEL = new ToolSpade("placeholder_spade", MATERIAL_PLACEHOLDER);
	public static final ItemHoe PLACEHOLDER_HOE = new ToolHoe("placeholder_hoe", MATERIAL_PLACEHOLDER);
	 //Armor
	public static final Item PLACEHOLDER_HELMET = new ArmorBase("placeholder_helmet", ARMOR_MATERIAL_PLACEHOLDER, 1, EntityEquipmentSlot.HEAD);
	public static final Item PLACEHOLDER_CHESTPLATE = new ArmorBase("placeholder_chestplate", ARMOR_MATERIAL_PLACEHOLDER, 1, EntityEquipmentSlot.CHEST);
	public static final Item PLACEHOLDER_LEGGINGS = new ArmorBase("placeholder_leggings", ARMOR_MATERIAL_PLACEHOLDER, 2, EntityEquipmentSlot.LEGS);
	public static final Item PLACEHOLDER_BOOTS = new ArmorBase("placeholder_boots", ARMOR_MATERIAL_PLACEHOLDER, 1, EntityEquipmentSlot.FEET);
	
	//Scalar Simple WorldGen
	 //Derivative
	public static final Item QUARTZ_SHARD = new MiscItem("quartz_shard");
	
    //Scalar Tiny Coal
	public static final Item TINY_COAL = new MiscItem("tiny_coal");
	public static final Item TINY_CHARCOAL = new MiscItem("tiny_charcoal");
		
}
