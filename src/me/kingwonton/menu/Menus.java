package me.kingwonton.menu;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.kingwonton.main.recipedetctor;

public class Menus {
	public static void setRow(ItemStack item, Inventory inv, int start, int end) {
		int amountLoops = end-start;
		for(int i=amountLoops; i>=0; i--) {
			int slot = start+i;
			inv.setItem(slot, item);
		}
	}
	public static void openMagic(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "§4Magic Manual");
		//Wand Icon
		ItemStack wandIcon = recipedetctor.ItemStack(Material.STICK, 1, (short) 0, false, "§7Wands", " ", "§c> Click to open");
		
		ItemStack glassIcon = recipedetctor.ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7, false, " ");
		
		setRow(glassIcon, inv, 0, 8);
		setRow(glassIcon, inv, 45, 53);
		
		inv.setItem(9, wandIcon);
		
		p.openInventory(inv);
		
		
	}
	public static void openMachinery(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "§9Machinery Manual");
		
		//Transportation Icon
		ItemStack transportationIcon = recipedetctor.ItemStack(Material.MINECART, 1, (short) 0, false, "§7Transportation", " ", "§c> Click to open");
        
        ItemStack glassIcon = recipedetctor.ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7, false, " ");
		
		setRow(glassIcon, inv, 0, 8);
		setRow(glassIcon, inv, 45, 53);
		
		inv.setItem(9, transportationIcon);
		
		p.openInventory(inv);
	}
	
	//Wand
	public static void openWands(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "§7Wands");
		
		//Novice Wand
		ItemStack noviceWandIcon = recipedetctor.ItemStack(Material.WOOD_HOE, 1, (short) 1, true, "§fNovice Wand", "§7Teir: I");	
		
		//Apprentice Wand
		ItemStack apprenticeWandIcon = recipedetctor.ItemStack(Material.WOOD_HOE, 1, (short) 2, true, "§aApprentice Wand", "§7Teir: II");
		
		//Adept Wand
		ItemStack adeptWandIcon = recipedetctor.ItemStack(Material.WOOD_HOE, 1, (short) 3, true, "§cAdept Wand", "§7Teir: III");

		//Expert Wand
		ItemStack expertWandIcon = recipedetctor.ItemStack(Material.WOOD_HOE, 1, (short) 4, true, "§fNovice Wand", "§7Teir: IV");

		//Master Wand
		ItemStack masterWandIcon = recipedetctor.ItemStack(Material.WOOD_HOE, 1, (short) 5, true, "§bMaster Wand", "§7Teir: V");
		
		//Legendary Wand
		ItemStack legendaryWandIcon = recipedetctor.ItemStack(Material.WOOD_HOE, 1, (short) 6, true, "§5Legendary Wand", "§7Teir: VI");
		
		ItemStack glassIcon = recipedetctor.ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7, false, " ");
		
		setRow(glassIcon, inv, 0, 8);
		setRow(glassIcon, inv, 45, 53);
		
		inv.setItem(9, noviceWandIcon);
		inv.setItem(10, apprenticeWandIcon);
		inv.setItem(11, adeptWandIcon);
		inv.setItem(12, expertWandIcon);
		inv.setItem(13, masterWandIcon);
		inv.setItem(14, legendaryWandIcon);
		
		p.openInventory(inv);
	}
	
	public static void openTransportation(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "§7Transportation");
		
		//Glass
		ItemStack glassIcon = recipedetctor.ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7, false, " ");
		
		setRow(glassIcon, inv, 0, 8);
		setRow(glassIcon, inv, 45, 53);
		
		p.openInventory(inv);
		
	}
	
	public static void openETL (Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "§7Enchiridion Translocator");
		
		//Glass
		ItemStack glassIcon = recipedetctor.ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7, false, " ");
		
		setRow(glassIcon, inv, 0, 8);
		setRow(glassIcon, inv, 45, 53);
		
		p.openInventory(inv);
	}

}
