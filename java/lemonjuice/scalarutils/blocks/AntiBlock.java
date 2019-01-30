package lemonjuice.scalarutils.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AntiBlock extends BlockBase{

	public AntiBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0.3F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
