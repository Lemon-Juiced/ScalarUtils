package lemonjuice.scalarutils.handlers;

import lemonjuice.scalarutils.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == ModItems.TINY_COAL)
			return 201;
		if(fuel.getItem() == ModItems.TINY_CHARCOAL)
			return 201;
		return 0;
	}

}
