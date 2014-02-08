package Redstone_Mod.Tools;

import Redstone_Mod.main;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
public class SynAxe extends ItemAxe {
public SynAxe(int ItemID, EnumToolMaterial material){
super(ItemID, material);
setCreativeTab(CreativeTabs.tabTools); }//Tells the game what creative mode tab it goes in
public void registerIcons(IconRegister iconregister) { // Make sure to import IconRegister!
if (itemID == main.RedstoneAxe.itemID) {
this.itemIcon = iconregister.registerIcon("redstone_mod:red.axe"); // You can also replace blockID and blockIcon with itemID and itemIcon
}
}
}