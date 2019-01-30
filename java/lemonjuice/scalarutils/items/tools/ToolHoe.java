package lemonjuice.scalarutils.items.tools;

import lemonjuice.scalarutils.Main;
import lemonjuice.scalarutils.init.ModItems;
import lemonjuice.scalarutils.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolHoe extends ItemHoe implements IHasModel{

	public ToolHoe (String name, ToolMaterial material){
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void regsiterModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
