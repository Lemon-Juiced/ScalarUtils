package lemonjuice.scalarutils.items;

import lemonjuice.scalarutils.Main;
import lemonjuice.scalarutils.init.ModItems;
import lemonjuice.scalarutils.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemCustomFood extends ItemFood implements IHasModel{

	public ItemCustomFood(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.scalartab);
		
		ModItems.ITEMS.add(this);
	}	

	@Override
	public void regsiterModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
