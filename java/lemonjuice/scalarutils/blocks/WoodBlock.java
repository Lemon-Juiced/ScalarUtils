package lemonjuice.scalarutils.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class WoodBlock extends BlockBase{
	
	public WoodBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.WOOD);
		setHardness(1.0F);
		setResistance(5.0F);
		setHarvestLevel("axe", 0);
		//setLightLevel(1.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
