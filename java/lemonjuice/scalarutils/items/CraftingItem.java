package lemonjuice.scalarutils.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CraftingItem extends ItemBase{

	public CraftingItem(String name) {
		super(name);
		
		setNoRepair();
		setMaxStackSize(1);
	}
	
	@Override
	public boolean hasContainerItem(ItemStack stack){
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack){
		return itemStack.getItemDamage() < itemStack.getMaxDamage() ? new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage() + 1) : ItemStack.EMPTY;
	}

}
