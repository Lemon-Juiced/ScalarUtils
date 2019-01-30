package lemonjuice.scalarutils.blocks;

import lemonjuice.scalarutils.Main;
import lemonjuice.scalarutils.init.ModBlocks;
import lemonjuice.scalarutils.init.ModItems;
import lemonjuice.scalarutils.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockDoublePlant.EnumPlantType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FlaxPlantBlock extends BlockCrops implements IHasModel{
	
	private int returnMeta;
	
	public FlaxPlantBlock(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.scalartab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public void doStuff(int returnMeta){
		this.returnMeta = returnMeta;
	}

	  @Override
	    public int damageDropped(IBlockState state){
	        return this.getMetaFromState(state) >= 7 ? this.returnMeta : 0;
	    }
	
	int max = 4;
	int min = 1;
	int randomyield = (int)(Math.random() * 4+1); //Random Amount That Could Be Received (Between 1-4)
	int randomyield2 = (int)(Math.random() * 2+1); //Random (2-3)
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote){
			if(this.isMaxAge(state)){
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getY(), new ItemStack(ModItems.FLAX, randomyield)));
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getY(), new ItemStack(ModItems.FLAX_SEEDS, randomyield2)));
				worldIn.setBlockState(pos, this.withAge(0));
				return(true);
			}
		}
		return false;
	}
	
	@Override
	protected Item getSeed() {
		return ModItems.FLAX_SEEDS;
	}
	
	@Override
	protected Item getCrop() {
		return ModItems.FLAX;
	}
	
	@Override
	public void regsiterModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	
}
