package me.kingwonton.main;

import java.io.File;

import org.bukkit.entity.Player;

public class unlockfunctions {
	public static boolean isunlocked(Player player, String recipename) {
		String title = "unlocked."+recipename;
		File folder = new File(Main.getInstance().getDataFolder(), "userdata");
		Config c = new Config(folder, player.getUniqueId().toString(), Main.getInstance());
		boolean unlocked = c.getConfig().getBoolean(title);
		return unlocked;		
	}
	//this is used in the unlocker method but can be called for itself, this is what acuttly sets the value in the config
	//player = the player the method should check/ do its code on
	//recipename = the name of the item/recipe that is gona be set
	//bolean = true or false, true to unlock the item/reciper, false to lock it(will probally never be used but hey its there). ofcouser its also locked if it isen´t set
	public static void setunlocked(Player player, String recipename, Boolean bolean) {
		String title = "unlocked."+recipename;
		File folder = new File(Main.getInstance().getDataFolder(), "userdata");
		Config c = new Config(folder, player.getUniqueId().toString(), Main.getInstance());
		c.set(title, bolean);
		c.save();
	}
	//so this needs to be inside a if statmen like this if(unlocker(e.getPlayer, "portal", 10) {you code here if you need any most of the time you won´t}
	//player = the player the method should check/ do its code on
	//recipename = the name of the item/recipe to see if player can unlocker and if he can it will do it!
	//level = the required level to unlock this recipe also removes that amount
	public static boolean unlocker(Player player, String recipename, int level) {
		if (isunlocked(player, recipename)) {
			player.sendMessage("§4You already unlocked this recipe");
			return false;
		}
		else if (player.getLevel() <= level) {
			int finallevel = player.getLevel()-level;
			player.setLevel(finallevel);
			setunlocked(player, recipename, true);
			player.sendMessage("§4You unlocked " + recipename + "Congratz!");
			return true;
		}
		else {
			player.sendMessage("§4You don´t have enough levels");
			return false;
		}
	}
}
