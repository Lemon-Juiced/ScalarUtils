package lemonjuice.scalarutils.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LemonHeadBlock extends BlockBase{

	public LemonHeadBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.PLANT);
		setHardness(1.5F);
		setResistance(15.0F);
		setHarvestLevel("axe", 1);
		setLightLevel(1.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
}
