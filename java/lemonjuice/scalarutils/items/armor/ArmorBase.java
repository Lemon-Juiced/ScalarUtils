package lemonjuice.scalarutils.items.armor;

import lemonjuice.scalarutils.Main;
import lemonjuice.scalarutils.init.ModItems;
import lemonjuice.scalarutils.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorBase extends ItemArmor implements IHasModel{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if(stack.getItem() == ModItems.SHELLMET_HELMET){
			effectPlayer(player, Potion.getPotionById(25), 1);
		}
		super.onArmorTick(world, player, stack);
	}
	
	private void effectPlayer(EntityPlayer entity, Potion potion, int amplifier){
		if (entity.getActivePotionEffect(potion) == null || entity.getActivePotionEffect(potion).getDuration() <= 1)
			entity.addPotionEffect(new PotionEffect(potion, 159, amplifier, true, true));
	}
	
	@Override
	public void regsiterModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
