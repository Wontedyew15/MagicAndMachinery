package me.kingwonton.main;

import java.util.ArrayList;
import java.util.List;

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
		
		//Transportation Icon
		ItemStack TransportationIcon = new ItemStack(Material.MINECART, 1);
		ItemMeta TransportationMeta = TransportationIcon.getItemMeta();
		TransportationMeta.setDisplayName("§7Transportation");
        	List<String> Transportationlore = new ArrayList<String>();
        	Transportationlore.add(" ");
        	Transportationlore.add("§c> Click to open");
        	TransportationMeta.setLore(Transportationlore);
        	TransportationIcon.setItemMeta(TransportationMeta);
		
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
		
		inv.setItem(9, TransportationIcon);
		
		p.openInventory(inv);
	}
	
	//Wand
	public static void openWands(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "§7Wands");
		
		//Novice Wand
		ItemStack NoviceWandIcon = new ItemStack(Material.STICK, 1);
		ItemMeta NoviceWandMeta = NoviceWandIcon.getItemMeta();
		NoviceWandMeta.setDisplayName("§fNovice Wand");
		List<String> NoviceWandlore = new ArrayList<String>();
		NoviceWandlore.add("§7Teir: I");
		NoviceWandMeta.setLore(NoviceWandlore);
		NoviceWandIcon.setItemMeta(NoviceWandMeta);		
		
		//Apprentice Wand
		ItemStack ApprenticeWandIcon = new ItemStack(Material.STICK, 1);
		ItemMeta ApprenticeWandMeta = ApprenticeWandIcon.getItemMeta();
		ApprenticeWandMeta.setDisplayName("§aApprentice Wand");
		List<String> ApprenticeWandlore = new ArrayList<String>();
		ApprenticeWandlore.add("§7Teir: II");
		ApprenticeWandMeta.setLore(ApprenticeWandlore);
		ApprenticeWandIcon.setItemMeta(ApprenticeWandMeta);
		
		//Adept Wand
		ItemStack AdeptWandIcon = new ItemStack(Material.STICK, 1);
		ItemMeta AdeptWandMeta = AdeptWandIcon.getItemMeta();
		AdeptWandMeta.setDisplayName("§cAdept Wand");
		List<String> AdeptWandlore = new ArrayList<String>();
		AdeptWandlore.add("§7Teir: III");
		AdeptWandMeta.setLore(AdeptWandlore);
		AdeptWandIcon.setItemMeta(AdeptWandMeta);

		//Expert Wand
		ItemStack ExpertWandIcon = new ItemStack(Material.STICK, 1);
		ItemMeta ExpertWandMeta = ExpertWandIcon.getItemMeta();
		ExpertWandMeta.setDisplayName("§cExpert Wand");
		List<String> ExpertWandlore = new ArrayList<String>();
		ExpertWandlore.add("§7Teir: IV");
		ExpertWandMeta.setLore(ExpertWandlore);
		ExpertWandIcon.setItemMeta(ExpertWandMeta);

		//Master Wand
		ItemStack MasterWandIcon = new ItemStack(Material.STICK, 1);
		ItemMeta MasterWandMeta = MasterWandIcon.getItemMeta();
		MasterWandMeta.setDisplayName("§bMaster Wand");
		List<String> MasterWandlore = new ArrayList<String>();
		MasterWandlore.add("§7Teir: V");
		MasterWandMeta.setLore(MasterWandlore);
		MasterWandIcon.setItemMeta(MasterWandMeta);
		
		//Legendary Wand
		ItemStack LegendaryWandIcon = new ItemStack(Material.STICK, 1);
		ItemMeta LegendaryWandMeta = LegendaryWandIcon.getItemMeta();
		LegendaryWandMeta.setDisplayName("§5Legendary Wand");
		List<String> LegendaryWandlore = new ArrayList<String>();
		LegendaryWandlore.add("§7Teir: VI");
		LegendaryWandMeta.setLore(LegendaryWandlore);
		LegendaryWandIcon.setItemMeta(LegendaryWandMeta);
		
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
		
		inv.setItem(9, NoviceWandIcon);
		inv.setItem(10, ApprenticeWandIcon);
		inv.setItem(11, AdeptWandIcon);
		inv.setItem(12, ExpertWandIcon);
		inv.setItem(13, MasterWandIcon);
		inv.setItem(14, LegendaryWandIcon);
		
		p.openInventory(inv);
	}
	public static void openCrafting(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "§7Construction Bench");
		
		//Glass
		ItemStack GlassIcon = new ItemStack (Material.STAINED_GLASS_PANE, 1, (byte)0);
		ItemMeta GlassMeta = GlassIcon.getItemMeta();
		GlassMeta.setDisplayName(" ");
		GlassIcon.setItemMeta(GlassMeta);
		
		//Input
		ItemStack InputIcon = new ItemStack (Material.STAINED_GLASS_PANE, 1, (byte)9);
		ItemMeta InputMeta = InputIcon.getItemMeta();
		InputMeta.setDisplayName("§7Input");
		InputIcon.setItemMeta(InputMeta);
		
		//Output
		ItemStack OutputIcon = new ItemStack (Material.STAINED_GLASS_PANE, 1, (byte)14);
		ItemMeta OutputMeta = OutputIcon.getItemMeta();
		OutputMeta.setDisplayName("§7Output");
		OutputIcon.setItemMeta(OutputMeta);
		
		//ConstructionBench
		ItemStack ConstructionBenchIcon = new ItemStack(Material.WORKBENCH, 1);
		ItemMeta ConstructionBenchMeta = ConstructionBenchIcon.getItemMeta();
		ConstructionBenchMeta.setDisplayName("§7Construction Bench");
		ConstructionBenchIcon.setItemMeta(ConstructionBenchMeta);
		
		inv.setItem(0, GlassIcon);
		inv.setItem(1, GlassIcon);
		inv.setItem(2, GlassIcon);
		inv.setItem(3, GlassIcon);
		inv.setItem(4, GlassIcon);
		inv.setItem(5, GlassIcon);
		inv.setItem(6, GlassIcon);
		inv.setItem(7, GlassIcon);
		inv.setItem(8, GlassIcon);
		inv.setItem(9, GlassIcon);
		inv.setItem(10, GlassIcon);
		inv.setItem(11, InputIcon);
		inv.setItem(12, GlassIcon);
		inv.setItem(13, GlassIcon);
		inv.setItem(14, GlassIcon);
		inv.setItem(15, OutputIcon);
		inv.setItem(16, GlassIcon);
		inv.setItem(17, GlassIcon);
		inv.setItem(18, GlassIcon);
		inv.setItem(22, GlassIcon);
		inv.setItem(26, GlassIcon);
		inv.setItem(27, GlassIcon);
		inv.setItem(31, ConstructionBenchIcon);
		inv.setItem(35, GlassIcon);
		inv.setItem(36, GlassIcon);
		inv.setItem(40, GlassIcon);
		inv.setItem(44, GlassIcon);
		inv.setItem(45, GlassIcon);
		inv.setItem(46, GlassIcon);
		inv.setItem(47, GlassIcon);
		inv.setItem(48, GlassIcon);
		inv.setItem(49, GlassIcon);
		inv.setItem(50, GlassIcon);
		inv.setItem(51, GlassIcon);
		inv.setItem(52, GlassIcon);
		inv.setItem(53, GlassIcon);
		
		
		
		
		p.openInventory(inv);
	}
	
	public static void openTransportation(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "§7Transportation");
		
		//Glass
		ItemStack GlassItem = new ItemStack (Material.STAINED_GLASS_PANE, 1, (byte)7);
		ItemMeta GlassMeta = GlassItem.getItemMeta();
		GlassMeta.setDisplayName(" ");
		GlassItem.setItemMeta(GlassMeta);
		
		
		inv.setItem(0, GlassItem);
		inv.setItem(1, GlassItem);
		inv.setItem(2, GlassItem);
		inv.setItem(3, GlassItem);
		inv.setItem(4, GlassItem);
		inv.setItem(5, GlassItem);
		inv.setItem(6, GlassItem);
		inv.setItem(7, GlassItem);
		inv.setItem(8, GlassItem);
		inv.setItem(45, GlassItem);
		inv.setItem(46, GlassItem);
		inv.setItem(47, GlassItem);
		inv.setItem(48, GlassItem);
		inv.setItem(49, GlassItem);
		inv.setItem(50, GlassItem);
		inv.setItem(51, GlassItem);
		inv.setItem(52, GlassItem);
		inv.setItem(53, GlassItem);
		
		p.openInventory(inv);
		
	}
	
	public static void openETL (Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "§7Enchiridion Translocator");
		
		//Glass
		ItemStack GlassItem = new ItemStack (Material.STAINED_GLASS_PANE, 1, (byte)7);
		ItemMeta GlassMeta = GlassItem.getItemMeta();
		GlassMeta.setDisplayName(" ");
		GlassItem.setItemMeta(GlassMeta);
		
		inv.setItem(0, GlassItem);
		inv.setItem(1, GlassItem);
		inv.setItem(2, GlassItem);
		inv.setItem(3, GlassItem);
		inv.setItem(4, GlassItem);
		inv.setItem(5, GlassItem);
		inv.setItem(6, GlassItem);
		inv.setItem(7, GlassItem);
		inv.setItem(8, GlassItem);
		inv.setItem(45, GlassItem);
		inv.setItem(46, GlassItem);
		inv.setItem(47, GlassItem);
		inv.setItem(48, GlassItem);
		inv.setItem(49, GlassItem);
		inv.setItem(50, GlassItem);
		inv.setItem(51, GlassItem);
		inv.setItem(52, GlassItem);
		inv.setItem(53, GlassItem);
		
		p.openInventory(inv);
	}

}
