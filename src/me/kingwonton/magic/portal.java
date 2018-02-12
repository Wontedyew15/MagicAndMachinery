package me.kingwonton.magic;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import me.kingwonton.multiblock.MultiBlockActivationType;
import me.kingwonton.multiblock.MultiBlockPattern;
import me.kingwonton.multiblock.patternobjects.PatternBlock;
import me.kingwonton.multiblock.IMultiBlock;
import me.kingwonton.main.unlockfunctions;

public class portal implements IMultiBlock {
    
    @Override
    public void onActivate(Plugin plugin, Location location, Player player, MultiBlockActivationType activationType) {
        if (activationType == MultiBlockActivationType.CORE_PLACED) {
            // when all pattern blocks are present and the last block placed
            // is the core material block of the multiblock pattern, this block will run
            player.sendMessage(ChatColor.GREEN + "Example multiblock constructed");
        } else if (activationType == MultiBlockActivationType.CORE_INTERACTED) {
            // when all pattern blocks, including the core material, are present
            // and the user interacts with the core material block
            
        	if(unlockfunctions.isunlocked(player, "portal")) {
        		player.sendMessage(ChatColor.RED + "Interacted with example multiblock");
        	}
        	else {
        		player.sendMessage(ChatColor.RED + "Interacted with example multiblock1");	
        	}
            // Optionally you could check for a certain item to be used
            if (player.getInventory().getItemInMainHand().getType() == Material.LEVER) {
                // e.g. load custom gui
            }
        }
    }
 
    @Override
    public MultiBlockPattern getMultiBlockPattern() {
        return new MultiBlockPattern(Material.DISPENSER, // optional parameter [patternFacing: {default: CARDINAL} ]
            // the cardinal parameter allows to check the pattern in any direction
            // or strict the pattern to face a certain one
 
            // pattern objects are relative to the core block (WOOL Material)
            // NORTH:    negative on Z-axis
            // EAST:     positive on X-axis
            // SOUTH:    positive on Z-axis
            // WEST:     negative on X-axis
            new PatternBlock(Material.BEACON, 0, -3, 0),    // WEST - Y - NORTH
            new PatternBlock(Material.END_ROD, 0, 1, 0)     // EAST - Y - NORTH
        );
    }
}
 


