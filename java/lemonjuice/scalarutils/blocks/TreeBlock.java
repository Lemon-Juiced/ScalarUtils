package lemonjuice.scalarutils.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TreeBlock extends BlockBase{

	public TreeBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.WOOD);
		setHardness(1.5F);
		setResistance(8.0F);
		setHarvestLevel("axe", 0);
		//setLightLevel(0.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
}
