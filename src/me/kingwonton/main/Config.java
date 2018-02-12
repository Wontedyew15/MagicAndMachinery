package me.kingwonton.main;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
//this one is easy to explain how to use then what the diffrent things do
//so to make a new config og find a already made one you need to use this
//Config c = new Config(folder, nameofconfig, plugin); 
//this will check if the folder and config is already made if they arent it will make them. it also sets the vairbal for refence
//folder is optinal and if you remove it so you only have Config c = new Config(nameofconfig, plugin); 
//it will just create it in the getdatafolder(in other words the standart one)
//also you can change the c to anything just make sure to change it in the other methods, so if you changed it to menuconfig
//you would need to change c.set(path, value) to menuconfig.set(path, value)
//now that you have the config made/found it you can easylige set, get and save values to it
//simply use:
//c.set(path, value); 
//path could be menu.invsize also it must be in string format!(aka it needs to be surrond by "")
//value is well the value you wan save to that path
//c.save(); saves the config, use after setting youre values
//c.getConfig(); Return the config so that you can use it for example to get a boolean like this
//boolean unlocked = c.getConfig().getBoolean(path);
//if you have any qustions ask mathias0903
public class Config {
	private final Plugin PLUGIN;
	private final String FILENAME;
	private final File FOLDER;
	private FileConfiguration config;
	private File configFile;
 
	public Config(String filename, Main instance) {
		if(!filename.endsWith(".yml")) {
			filename += ".yml";
		}
		this.FILENAME = filename;
		this.PLUGIN = instance;
		this.FOLDER = this.PLUGIN.getDataFolder();
		this.config = null;
		this.configFile = null;
		reload();
	}
 
	public Config(File folder, String filename, Main instance) {
		if(!filename.endsWith(".yml")) {
			filename += ".yml";
		}
		this.FILENAME = filename;
		this.PLUGIN = instance;
		this.FOLDER = folder;
		this.config = null;
		this.configFile = null;
		reload();
	}
 
	public FileConfiguration getConfig() {
		if(config == null) {
			reload();
		}
		return config;
	}
 
	public void reload() {
		if(!this.FOLDER.exists()) {
			try {
				if(this.FOLDER.mkdir()) {
					this.PLUGIN.getLogger().log(Level.INFO, "Folder " + this.FOLDER.getName() + " created.");
				} 
				else {
					this.PLUGIN.getLogger().log(Level.WARNING, "Unable to create folder " + this.FOLDER.getName() + ".");
				}
			} 
			catch(Exception e) {
 
			}
		}
		configFile = new File(this.FOLDER, this.FILENAME);
		if(!configFile.exists()) {
			try {
				configFile.createNewFile();
			} 
			catch(IOException e) {
 
			}
		}
		config = YamlConfiguration.loadConfiguration(configFile);
	}
 
	public void saveDefaultConfig() {
		if (configFile == null) {
			configFile = new File(this.PLUGIN.getDataFolder(), this.FILENAME);
		}

		if (!configFile.exists()) {
			this.PLUGIN.saveResource(this.FILENAME, false);
		}
	}
 
	public void save() {
		if (config == null || configFile == null) {
			return;
		}
		try {
			getConfig().save(configFile);
		} 
		catch (IOException ex) {
			this.PLUGIN.getLogger().log(Level.WARNING, "Could not save config to " + configFile.getName(), ex);
		}
	}
 
	public void set(String path, Object o) {
		getConfig().set(path, o);
	}
}