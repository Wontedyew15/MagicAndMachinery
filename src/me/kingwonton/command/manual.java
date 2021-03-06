package me.kingwonton.command;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class manual implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String command, String[] args) {
		Player p = (Player) sender;
	//Adds command /manual for both magic and machinery manuals
        if(cmd.getName().equalsIgnoreCase("Manual")) {
            if(sender.hasPermission("mm.Manual")) {
            	String plugin = "[§bMagic And Machinery§f] ";
                p.sendMessage(plugin + "§aYou have been given both Magic and Machinery manuals.");    
                Material book = Material.ENCHANTED_BOOK;
		//Magic manual
                ItemStack magicManual = new ItemStack(book, 1);
                ItemMeta magicmeta = magicManual.getItemMeta();
                magicmeta.setDisplayName("§4Magic Manual");
                List<String> Magiclore = new ArrayList<String>();
                Magiclore.add("§cRight Click §8⇨ §7Browse Items");
                magicmeta.setLore(Magiclore);
                magicManual.setItemMeta(magicmeta);
                p.getInventory().addItem(magicManual);
                
		//Machinery manual
                ItemStack machineryManual = new ItemStack(book, 1);
                ItemMeta machinerymeta = machineryManual.getItemMeta();
                machinerymeta.setDisplayName("§9Machinery Manual");
                List<String> Machinerylore = new ArrayList<String>();
                Machinerylore.add("§bRight Click §8⇨ §7Browse Items");
                machinerymeta.setLore(Machinerylore);
                machineryManual.setItemMeta(machinerymeta);
                p.getInventory().addItem(machineryManual);
            }
        return true;
    }
       
    return false;
    }
}
