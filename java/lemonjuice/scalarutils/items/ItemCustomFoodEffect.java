package lemonjuice.scalarutils.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCustomFoodEffect extends ItemCustomFood{
	
	PotionEffect effect;
	
	public ItemCustomFoodEffect(String name, int amount, float saturation, boolean isAnimalFood, PotionEffect affect){
		super(name, amount, saturation, isAnimalFood);
		setAlwaysEdible();
		
		this.effect = affect;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
		if(! worldIn.isRemote){
			player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack){
		return true;
	}
}
