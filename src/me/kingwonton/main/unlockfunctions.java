package me.kingwonton.main;

import java.io.File;

import org.bukkit.entity.Player;

public class unlockfunctions {
	public static boolean isunlocked(Player player, String recipename) {
		String title = "unlocked."+recipename;
		Main plugin = new Main();
		File f = new File(plugin.getDataFolder() + "/userdata/");
		Config c = new Config(f, player.getUniqueId().toString(), plugin);
		boolean unlocked = c.getConfig().getBoolean(title);
		return unlocked;		
	}
	public static void setunlocked(Player player, String recipename, Boolean bolean) {
		String title = "unlocked."+recipename;
		Main plugin = new Main();
		File f = new File(plugin.getDataFolder() + "/userdata/");
		Config c = new Config(f, player.getUniqueId().toString(), plugin);
		c.set(title, bolean);	
	}
	public static boolean unlocker(Player player, String recipename, Boolean bolean, int level) {
		if (player.getLevel() <= level) {
			int finallevel = player.getLevel()-level;
			player.setLevel(finallevel);
			setunlocked(player, recipename, bolean);
			return true;
		}
		else {
			return false;
		}
	}
}
