package QuantumStorage.init;

import QuantumStorage.config.ConfigQuantumStorage;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import reborncore.common.util.RebornCraftingHelper;

/**
 * Created by Gigabit101 on 07/03/2017.
 */
public class ModRecipes
{
    public static void init()
    {
        RebornCraftingHelper.addShapedOreRecipe(new ItemStack(ModItems.CRATE, 16),
                " W ",
                "WPW",
                " W ",
                'W', "plankWood",
                'P', new ItemStack(Items.PAPER));

        RebornCraftingHelper.addShapedOreRecipe(new ItemStack(ModItems.UPGRADE, 1, 3),
                " W ",
                "WPW",
                " W ",
                'W', new ItemStack(Items.PAPER),
                'P', new ItemStack(Items.WATER_BUCKET));

        if(!ConfigQuantumStorage.disableQuantumBattery)
        {
            RebornCraftingHelper.addShapedOreRecipe(new ItemStack(ModItems.BATTERY, 1),
                    " I ",
                    "IRI",
                    "IRI",
                    'I', new ItemStack(Items.IRON_INGOT),
                    'R', new ItemStack(Blocks.REDSTONE_BLOCK));
        }

        //TODO config
        RebornCraftingHelper.addShapedRecipe(new ItemStack(ModItems.BAG), "WSW", "WCW", "WWW", 'S', Items.STRING, 'C', new ItemStack(ModBlocks.CHEST_DIAMOND), 'W', new ItemStack(Blocks.WOOL, 1, OreDictionary.WILDCARD_VALUE));
        addColourRecipes();
    }

    public static void addColourRecipes()
    {
        ItemStack bags = new ItemStack(ModItems.BAG, 1, OreDictionary.WILDCARD_VALUE);

        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 0), bags, "dyeWhite");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 1), bags, "dyeOrange");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 2), bags, "dyeMagenta");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 3), bags, "dyeLightBlue");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 4), bags, "dyeYellow");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 5), bags, "dyeLime");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 6), bags, "dyePink");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 7), bags, "dyeGray");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 8), bags, "dyeLightGray");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 9), bags, "dyeCyan");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 10), bags, "dyePurple");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 11), bags, "dyeBlue");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 12), bags, "dyeBrown");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 13), bags, "dyeGreen");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 14), bags, "dyeRed");
        RebornCraftingHelper.addShapelessOreRecipe(new ItemStack(ModItems.BAG, 1, 15), bags, "dyeBlack");
    }
}
