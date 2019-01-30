package lemonjuice.scalarutils.tabs;

import lemonjuice.scalarutils.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ScalarTab extends CreativeTabs{
	public ScalarTab(String label) {super("scalartab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.PLACEHOLDER);
	}
}
