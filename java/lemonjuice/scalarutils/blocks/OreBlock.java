package lemonjuice.scalarutils.blocks;

import java.util.Random;

import lemonjuice.scalarutils.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OreBlock extends BlockBase{

	public OreBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 0);
		//setLightLevel(0.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return ModItems.QUARTZ_SHARD;
	}
	
	@Override
	public int quantityDropped(Random rand){
		int max = 3;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}
