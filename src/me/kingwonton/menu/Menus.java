package me.kingwonton.menu;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Menus {
	public static void openMagic(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "§4Magic Manual");
		
		ItemStack MagicIcon = new ItemStack(Material.BOOK, 1);
		ItemMeta MagicMeta = MagicIcon.getItemMeta();
		MagicMeta.setDisplayName("Example");
		MagicIcon.setItemMeta(MagicMeta);
		
		ItemStack GlassIcon = new ItemStack (Material.STAINED_GLASS_PANE, 1, (byte)7);
		ItemMeta GlassMeta = GlassIcon.getItemMeta();
		GlassMeta.setDisplayName(" ");
		GlassIcon.setItemMeta(GlassMeta);
		
		inv.setItem(0, GlassIcon);
		inv.setItem(1, GlassIcon);
		inv.setItem(2, GlassIcon);
		inv.setItem(3, GlassIcon);
		inv.setItem(4, GlassIcon);
		inv.setItem(5, GlassIcon);
		inv.setItem(6, GlassIcon);
		inv.setItem(7, GlassIcon);
		inv.setItem(8, GlassIcon);
		
		inv.setItem(45, GlassIcon);
		inv.setItem(46, GlassIcon);
		inv.setItem(47, GlassIcon);
		inv.setItem(48, GlassIcon);
		inv.setItem(49, GlassIcon);
		inv.setItem(50, GlassIcon);
		inv.setItem(51, GlassIcon);
		inv.setItem(52, GlassIcon);
		inv.setItem(53, GlassIcon);
		
		inv.setItem(9, MagicIcon);
		
		p.openInventory(inv);
		
		
	}
	public static void openMachinery(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "§9Machinery Manual");
		
		ItemStack MachineryIcon = new ItemStack(Material.BOOK, 1);
		ItemMeta MachineryMeta = MachineryIcon.getItemMeta();
		MachineryMeta.setDisplayName("Example");
		
		ItemStack GlassIcon = new ItemStack (Material.STAINED_GLASS_PANE, 1, (byte)7);
		ItemMeta GlassMeta = GlassIcon.getItemMeta();
		GlassMeta.setDisplayName(" ");
		GlassIcon.setItemMeta(GlassMeta);
		
		inv.setItem(0, GlassIcon);
		inv.setItem(1, GlassIcon);
		inv.setItem(2, GlassIcon);
		inv.setItem(3, GlassIcon);
		inv.setItem(4, GlassIcon);
		inv.setItem(5, GlassIcon);
		inv.setItem(6, GlassIcon);
		inv.setItem(7, GlassIcon);
		inv.setItem(8, GlassIcon);
		
		inv.setItem(45, GlassIcon);
		inv.setItem(46, GlassIcon);
		inv.setItem(47, GlassIcon);
		inv.setItem(48, GlassIcon);
		inv.setItem(49, GlassIcon);
		inv.setItem(50, GlassIcon);
		inv.setItem(51, GlassIcon);
		inv.setItem(52, GlassIcon);
		inv.setItem(53, GlassIcon);
		
		inv.setItem(9, MachineryIcon);
		
		p.openInventory(inv);
	}

}
