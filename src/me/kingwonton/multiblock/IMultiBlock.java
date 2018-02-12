package me.kingwonton.multiblock;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.eclipse.jdt.annotation.NonNull;

/**
 * The multiblock structure holder, used to describe the pattern and 
 * what do to on activation
 * 
 * @author ShaneCraft
 *
 */
public interface IMultiBlock {

	void onActivate(Plugin plugin, Location location, Player player, MultiBlockActivationType activationType);
	
	@NonNull MultiBlockPattern getMultiBlockPattern();
}
