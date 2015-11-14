package QuantumStorage.block.qst;

import QuantumStorage.QuantumStorage;
import QuantumStorage.client.GuiHandler;
import QuantumStorage.init.ModBlocks;
import QuantumStorage.tile.qst.TileQuantumTankMk1;
import QuantumStorage.tile.qsu.TileQuantumDsuMk1;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockQuantumTankMk1 extends BlockQuantumTank
{
	public BlockQuantumTankMk1(Material material) 
	{
		super(material);
		setBlockName("quantumtankmk1");
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) 
	{
		if (!player.isSneaking())
			player.openGui(QuantumStorage.INSTANCE, GuiHandler.tankMk1, world, x, y, z);
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int p_149915_2_) 
	{
		return new TileQuantumTankMk1();
	}
	
	@Override
	public void breakBlock(World world, int x, int y, int z, Block blockId, int meta)
	{
		TileEntity te = world.getTileEntity(x, y, z);
		if(te instanceof TileQuantumTankMk1)
		{
			if (((TileQuantumTankMk1) te).tank.getFluid() != null)
			{
				float xOffset = world.rand.nextFloat() * 0.8F + 0.1F;
				float yOffset = world.rand.nextFloat() * 0.8F + 0.1F;
				float zOffset = world.rand.nextFloat() * 0.8F + 0.1F;
						
				ItemStack stacknbt = ((TileQuantumTankMk1) te).getDropWithNBT();
				int amountToDrop = Math.min(world.rand.nextInt(21) + 10, stacknbt.stackSize);

				EntityItem entityitem = new EntityItem(world,
						x + xOffset, y + yOffset, z + zOffset,
						stacknbt.splitStack(amountToDrop));
				world.spawnEntityInWorld(entityitem);
			}
			else 
			{
				float xOffset = world.rand.nextFloat() * 0.8F + 0.1F;
				float yOffset = world.rand.nextFloat() * 0.8F + 0.1F;
				float zOffset = world.rand.nextFloat() * 0.8F + 0.1F;
				ItemStack stack = new ItemStack(ModBlocks.QuantumTankMk1);
				
				EntityItem entityitem = new EntityItem(world,
						x + xOffset, y + yOffset, z + zOffset, stack);
				world.spawnEntityInWorld(entityitem);
			}
		}
	}
}
