package lemonjuice.scalarutils.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RockBlock extends BlockBase{
	
	public RockBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 0);
		//setLightLevel(0.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
}
