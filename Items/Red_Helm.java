package Redstone_Mod.Items;

import Redstone_Mod.main;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Red_Helm extends Item {

public Red_Helm(int par1) {
super(par1); //Returns super constructor: par1 is ID
setCreativeTab(CreativeTabs.tabCombat); }//Tells the game what creative mode tab it goes in
public void registerIcons(IconRegister iconRegister) {
if (itemID == main.Red_Helm.itemID) {
this.itemIcon = iconRegister.registerIcon("redstone_mod:red.helmet"); // You can also replace blockID and blockIcon with itemID and itemIcon
}
}
}
