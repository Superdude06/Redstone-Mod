package Redstone_Mod; //Package directory
/*
* Basic importing
*/
import Redstone_Mod.Items.Red_ingot;
import Redstone_Mod.Tools.SynAxe;
import Redstone_Mod.Tools.SynHoe;
import Redstone_Mod.Tools.SynPaxel;
import Redstone_Mod.Tools.SynPickaxe;
import Redstone_Mod.Tools.SynShovel;
import Redstone_Mod.Tools.SynSword;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.item.EnumArmorMaterial;
/*
* Basic needed forge stuff
*/
@Mod(modid="Redstone_Mod",name="Redstone Mod",version="version 1.0")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)
public class main {
/*
* ToolMaterial
*/
//Telling forge that we are creating these
//items
public static Item Red_ingot;
public static Item RedstoneAxe;
public static Item RedstoneShovel;
public static Item RedstonePickaxe;
public static Item RedstoneHoe;
public static Item RedstoneSword;
public static Item RedstonePaxel;
public static Item Red_Helm;
public static Item Red_Chest;
public static Item Red_Leg;
public static Item Red_Boot;
//blocks
//tools
public static EnumToolMaterial RedstoneTool = EnumHelper.addToolMaterial("RedstoneTool", 2, 250, 6.0F, 2.0F, 14);
//armor
public static EnumArmorMaterial AmethystArmor = EnumHelper.addArmorMaterial("RedstoneArmor", 8, new int[] { 3, 7, 6, 3 }, 30);
//Declaring Init
@Init
public void load(FMLInitializationEvent event){
// Define items
Red_ingot = new Red_ingot(6050).setUnlocalizedName("Ob.ingot");
Red_Helm = new Redstone_Mod.Items.Red_Helm(5051).setUnlocalizedName("Ob_Helm");
Red_Chest = new Redstone_Mod.Items.Red_Chest(5052).setUnlocalizedName("Ob_Chest");
Red_Leg = new Redstone_Mod.Items.Red_Leg(5053).setUnlocalizedName("Ob_Leg");
Red_Boot = new Redstone_Mod.Items.Red_Boot(5054).setUnlocalizedName("Ob_Boot");
	// Tools

RedstoneAxe = new SynAxe(5055, RedstoneTool).setUnlocalizedName("redstone_axe");
RedstoneShovel = new SynShovel(5056, RedstoneTool).setUnlocalizedName("redstone_shovel");
RedstonePickaxe = new SynPickaxe(5057, RedstoneTool).setUnlocalizedName("redstone_pickaxe");
RedstoneHoe = new SynHoe(5058, RedstoneTool).setUnlocalizedName("redstone_hoe");
RedstoneSword = new SynSword(5059, RedstoneTool).setUnlocalizedName("redstone_sword");
RedstonePaxel = new SynPaxel(5060, RedstoneTool).setUnlocalizedName("redstone_paxel");

	// Armor
  // define blocks
//adding names
LanguageRegistry.addName(Red_ingot, "Redstone Ingot");
LanguageRegistry.addName(RedstoneAxe, "Redstone Axe");
LanguageRegistry.addName(RedstoneShovel, "Redstone Shovel");
LanguageRegistry.addName(RedstonePickaxe, "Redstone Pickaxe");
LanguageRegistry.addName(RedstoneSword, "Redstone Sword");
LanguageRegistry.addName(RedstoneHoe, "Redstone Hoe");
LanguageRegistry.addName(RedstonePaxel, "Redstone Paxel");
LanguageRegistry.addName(Red_Helm, "Redstone Helmet");
LanguageRegistry.addName(Red_Chest, "Redstone Chestplate");
LanguageRegistry.addName(Red_Leg, "Redstone Leggings");
LanguageRegistry.addName(Red_Boot, "Redstone Boots");
//crafting
GameRegistry.addRecipe(new ItemStack(RedstonePickaxe,1), new Object[]{
"TTT"," Y "," Y ",'T',Red_ingot,'Y',Item.stick
});
GameRegistry.addRecipe(new ItemStack(RedstoneSword,1), new Object[]{
" T "," T "," Y ",'T',Red_ingot,'Y',Item.stick
});
GameRegistry.addRecipe(new ItemStack(RedstoneAxe,1), new Object[]{
"TT ","TY "," Y ",'T',Red_ingot,'Y',Item.stick
});
GameRegistry.addRecipe(new ItemStack(RedstoneHoe,1), new Object[]{
"TT "," Y "," Y ",'T',Red_ingot,'Y',Item.stick
});
GameRegistry.addRecipe(new ItemStack(RedstoneShovel,1), new Object[]{
" T "," Y "," Y ",'T',Red_ingot,'Y',Item.stick
});
GameRegistry.addRecipe(new ItemStack(RedstonePaxel,1), new Object[]{
"RTE"," Y "," Y ",'T',RedstoneShovel,'Y',Item.stick,'R',RedstoneAxe,'E',RedstonePickaxe
});
GameRegistry.addSmelting(Block.blockRedstone.blockID, new ItemStack(Red_ingot, 1), 0.5F);
//Smelting
//World Gen
}
}
