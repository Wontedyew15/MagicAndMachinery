package me.kingwonton.magic;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.block.Dispenser;
import org.bukkit.plugin.Plugin;

import me.kingwonton.multiblock.MultiBlockActivationType;
import me.kingwonton.multiblock.MultiBlockPattern;
import me.kingwonton.multiblock.patternobjects.PatternBlock;
import me.kingwonton.multiblock.IMultiBlock;
import me.kingwonton.main.recipedetctor;
import me.kingwonton.main.unlockfunctions;

public class ArcaneCraftingTable implements IMultiBlock {
    
    @Override
    public void onActivate(Plugin plugin, Location location, Player player, MultiBlockActivationType activationType) {
        if (activationType == MultiBlockActivationType.CORE_PLACED) {
            // when all pattern blocks are present and the last block placed
            // is the core material block of the multiblock pattern, this block will run
            player.sendMessage(ChatColor.GREEN + "Example multiblock constructed");
        } else if (activationType == MultiBlockActivationType.CORE_INTERACTED) {
            // when all pattern blocks, including the core material, are present
            // and the user interacts with the core material block
            int radius = 1;
            for (int x = -(radius); x <= radius; x ++){
                for (int z = -(radius); z <= radius; z ++) {
                	Location loc = location.getBlock().getRelative(x, 0, z).getLocation();
                    if(loc.getBlock().getType() == Material.DISPENSER){
                    	Block block = loc.getBlock();
                    	Dispenser dispenser = (Dispenser)block.getState();
                    	Inventory inv = dispenser.getInventory();
                    	ArrayList<ArrayList<ItemStack>> arcaneRecipes = recipedetctor.getArcaneRecipe();
                    	for (List<ItemStack> recipe : arcaneRecipes) {
                    		recipedetctor.checkrecipe(recipe.get(0), recipe.get(1), recipe.get(2), recipe.get(3), recipe.get(4), recipe.get(5), recipe.get(6), recipe.get(7), recipe.get(8), recipe.get(9), inv);
                    	}
                    }
              }
            }
           
        	if(unlockfunctions.isunlocked(player, "ArcaneCrafting")) {
        		player.sendMessage(ChatColor.RED + "Interacted with example multiblock and is unlocked");
        	}
        	else {
        		player.sendMessage(ChatColor.RED + "Interacted with example multiblock and is not unlocked");	
        	}
            // Optionally you could check for a certain item to be used
            if (player.getInventory().getItemInMainHand().getType() == Material.LEVER) {
                // e.g. load custom gui
            }
        }
    }
 
    @Override
    public MultiBlockPattern getMultiBlockPattern() {
        return new MultiBlockPattern(Material.WORKBENCH, // optional parameter [patternFacing: {default: CARDINAL} ]
            // the cardinal parameter allows to check the pattern in any direction
            // or strict the pattern to face a certain one
 
            // pattern objects are relative to the core block (WOOL Material)
            // NORTH:    negative on Z-axis
            // EAST:     positive on X-axis
            // SOUTH:    positive on Z-axis
            // WEST:     negative on X-axis
            new PatternBlock(Material.ENCHANTMENT_TABLE, 1, 0, 0),    // WEST - Y - NORTH
            new PatternBlock(Material.DISPENSER, -1, 0, 0)     // EAST - Y - NORTH
        );
    }
}
