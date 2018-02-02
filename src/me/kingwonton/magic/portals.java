package me.kingwonton.magic;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Dispenser;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import me.kingwonton.menu.Menus;

public class portals implements Listener {
	//function for seeing if the struture is constructed right
	@SuppressWarnings("deprecation")
	public static boolean multiblockportals(Block block) {
		Block block1 = block.getRelative(0, 1, 0);
		Block block2 = block.getRelative(0, -3, 0);
		Dispenser d = (Dispenser) block.getState();
		String title = d.getInventory().getName();
        if (block.getType() == Material.DISPENSER && title.equals("§7Translocator Controller") && block1.getType() == Material.END_ROD && block2.getType() == Material.END_ROD) {
        		return true;
        }
        else {
        	return false;
        }
        
		
	}
	//event for opning the portal gui
	@EventHandler
	public static void onInteract(PlayerInteractEvent e) {
		if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			ItemStack item = e.getItem();
			Block block = e.getClickedBlock();
			if (item.getType().equals(Material.ENCHANTED_BOOK) && item.hasItemMeta() && item.getItemMeta().hasDisplayName()) {
				if (item.getItemMeta().getDisplayName().equals("§4Portal destanitions")) {
					e.setCancelled(true);
					if(multiblockportals(block)) {
						Player p = e.getPlayer();
						Menus.openMagic(p);
			            }
		            }
				}
			}
		}
	}
