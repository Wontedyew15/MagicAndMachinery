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
		
		//Wand Icon
		ItemStack WandIcon = new ItemStack(Material.STICK, 1);
		ItemMeta WandMeta = WandIcon.getItemMeta();
		WandMeta.setDisplayName("§7Wands");
        	List<String> Wandlore = new ArrayList<String>();
       		Wandlore.add(" ");
        	Wandlore.add("§c> Click to open");
        	WandMeta.setLore(Wandlore);
        	WandIcon.setItemMeta(WandMeta);
		
		//Example Icon
		ItemStack ExampleIcon = new ItemStack(Material.STONE_AXE, 1);
		ItemMeta ExampleMeta = ExampleIcon.getItemMeta();
		ExampleMeta.setDisplayName("§7Example");
        	List<String> Examplelore = new ArrayList<String>();
        	Examplelore.add(" ");
        	Examplelore.add("§c> Click to open");
        	ExampleMeta.setLore(Examplelore);
        	ExampleIcon.setItemMeta(ExampleMeta);
		
		
		
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
		
		inv.setItem(9, WandIcon);
		inv.setItem(10, ExampleIcon);
		
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
