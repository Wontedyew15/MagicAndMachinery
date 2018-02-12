package me.kingwonton.menu;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ListenerClass implements Listener {
	
	@EventHandler
	public static void onInteract(PlayerInteractEvent e) {
		if (e.getAction() != null) {
			if (e.getAction()==(Action.RIGHT_CLICK_AIR) || e.getAction()==(Action.RIGHT_CLICK_BLOCK)) {
				ItemStack item = e.getItem();
				if (e.getItem() != null) {
				if (item.getType().equals(Material.ENCHANTED_BOOK) && item.hasItemMeta() && item.getItemMeta().hasDisplayName()) {
					if (item.getItemMeta().getDisplayName().equals("§4Magic Manual")) {
						Player p = e.getPlayer();
						Menus.openMagic(p);
					}
				}
				if (item.getType().equals(Material.ENCHANTED_BOOK) && item.hasItemMeta() && item.getItemMeta().hasDisplayName()) {
					if (item.getItemMeta().getDisplayName().equals("§9Machinery Manual")) {
						Player p = e.getPlayer();
						Menus.openMachinery(p);
					}
				}
			}
			}
			if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
				ItemStack item = e.getItem();
				if (e.getItem() != null) {
				if (item.getType().equals(Material.BOOK_AND_QUILL) && item.hasItemMeta() && item.getItemMeta().hasDisplayName()) {
					if (item.getItemMeta().getDisplayName().equals("§7Enchiridion Translocator")) {
						Player p = e.getPlayer();
						Menus.openETL(p);
					}
				}	
			}
			}
		}
	}
	
	@EventHandler
	public void invDragEvent(InventoryDragEvent e) {
		Inventory inv = e.getInventory();
		String name = inv.getName();
		if (name.equals("§4Magic Manual") || name.equals("§9Machinery Manual") || name.equals("§7Wands") || name.equals("§7Construction Bench")) {
			e.setCancelled(true);
			return;
		}
		
	}
	
	@EventHandler
	public void invClickEvent(InventoryClickEvent e) {
		Inventory inv = e.getInventory();
		Player p = (Player) e.getWhoClicked();
		String name = inv.getName();
		if (name.equals("§4Magic Manual")) {
			e.setCancelled(true);
			int slot = e.getSlot();
			if (slot < 0) {
				return;
			}
			if (slot == 9) {
				Menus.openWands(p);
				return;
			}
			else if (slot == 14) {
				//if you added more slots inside magic then you would carry on this.
				return;
			}
			else {
				return;
			}
		}
		else if (name.equals("§9Machinery Manual")) {
			e.setCancelled(true);
			int slot = e.getSlot();
			if (slot < 0) {
				return;
			}
			if (slot == 9) {
				Menus.openTransportation(p);
				return;
			}
			else if (slot == 14) {
				//if you added more slots inside machinery then you would carry on this.
				return;
			}
			else {
				return;
			}
			
		}
		else if (name.equals("§7Wands")) {
			e.setCancelled(true);
			int slot = e.getSlot();
			if (slot < 0) {
				return;
			}
			if (slot == 9) {
				return;
			}
			else if (slot == 14) {
				//if you added more slots inside machinery then you would carry on this.
				return;
			}
			else {
				return;
			}
			
		}
	}
}

