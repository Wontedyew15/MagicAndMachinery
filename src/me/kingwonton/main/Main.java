package me.kingwonton.main;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.kingwonton.command.manual;
import me.kingwonton.magic.ArcaneCraftingTable;
import me.kingwonton.magic.portal;
import me.kingwonton.menu.ListenerClass;
import me.kingwonton.multiblock.MultiBlockFactory;
 
 
public class Main extends JavaPlugin
{
    //When server starts / reloads
	private static Main instance;
	
    public void onEnable() {
    	this.getLogger().info("The Plugin is Loading");
    	PluginManager pm = Bukkit.getServer().getPluginManager();
    	pm.registerEvents(new ListenerClass(), this);
    	super.onEnable();
    	this.getLogger().info("registrering Multiblocks:");
    	MultiBlockFactory.INSTANCE.register(this, portal.class);
    	MultiBlockFactory.INSTANCE.register(this, ArcaneCraftingTable.class);
    	instance = this;
    	this.getLogger().info("registrering recipes for Arcane Crafting Table");
		ItemStack stick = new ItemStack(Material.STICK);
    	ItemStack stone = new ItemStack(Material.STONE);
    	recipedetctor.registerArcaneRecipe(stick, stick, stick, stick, stick, stick, stick, stick, stick, stone);
    	recipedetctor.registerArcaneRecipe(stone, stone, stone, stone, stone, stone, stone, stone, stone, stick);
    	this.getLogger().info("recipes done");
    	this.getLogger().info("setting up commands:");
    	this.getCommand("manual").setExecutor(new manual());
    	this.getLogger().info("finshed command /manuel");
    	this.getLogger().info("setting up config");
    	Config c = new Config("Config", this);
		c.set("enabled.portal", true);
		c.save();
		this.getLogger().info("done");
    	this.getLogger().info("Plugin has been started.");
    }
 
    //when server stops / reloads
    public void onDisable() {
    	this.getLogger().info("Plugin has shut down.");
    }
    public static Main getInstance() {
    	return instance;
    	}
}
