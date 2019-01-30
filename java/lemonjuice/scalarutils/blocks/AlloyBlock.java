package lemonjuice.scalarutils.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AlloyBlock extends BlockBase{

	public AlloyBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
		//setLightLevel(1.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
