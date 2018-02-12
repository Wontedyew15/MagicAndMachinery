package me.kingwonton.main;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class recipedetctor {
	private static ArrayList<ArrayList<ItemStack>> arcaneRecipes = new ArrayList<ArrayList<ItemStack>>();
	public static void registerArcaneRecipe(ItemStack item0, ItemStack item1, ItemStack item2,
			ItemStack item3, ItemStack item4, ItemStack item5,
			ItemStack item6, ItemStack item7, ItemStack item8, ItemStack finalitem) {
		ArrayList<ItemStack> recipe = new ArrayList<ItemStack>();
		recipe.add(item0);
		recipe.add(item1);
		recipe.add(item2);
		recipe.add(item3);
		recipe.add(item4);
		recipe.add(item5);
		recipe.add(item6);
		recipe.add(item7);
		recipe.add(item8);
		recipe.add(finalitem);
		arcaneRecipes.add(recipe);
		
	}
	public static ArrayList<ArrayList<ItemStack>> getArcaneRecipe() {
		return arcaneRecipes;
	}
	public static ItemStack ItemStack(Material item, int amount, short damage, Boolean unbreakable, String display) {
		ItemStack customitem = new ItemStack(item, amount, damage);
		ItemMeta custommeta = customitem.getItemMeta();
		custommeta.setDisplayName(display);
		custommeta.setUnbreakable(unbreakable);
        customitem.setItemMeta(custommeta);
        return customitem;
	}
	public static ItemStack ItemStack(Material item, int amount, short damage, Boolean unbreakable, String display, String... lore) {
		ItemStack customitem = new ItemStack(item, amount, damage);
		ItemMeta custommeta = customitem.getItemMeta();
		custommeta.setDisplayName(display);
		custommeta.setLore(Arrays.asList(lore));
		custommeta.setUnbreakable(unbreakable);
        customitem.setItemMeta(custommeta);
        return customitem;
	}
	public static boolean isSimilar(ItemStack first,ItemStack second){

        boolean similar = false;
        if(first == null && second == null){
        	similar = true;
            return similar;
        }
        if(first == null || second == null){
            return similar;
        }

        boolean sameTypeId = (first.getType() == second.getType());
        boolean sameDurability = (first.getDurability() == second.getDurability());
        boolean sameAmount = (first.getAmount() == second.getAmount());
        boolean sameHasItemMeta = (first.hasItemMeta() == second.hasItemMeta());
        boolean sameEnchantments = (first.getEnchantments().equals(second.getEnchantments()));
        boolean sameItemMeta = true;

        if(sameHasItemMeta) {
            sameItemMeta = Bukkit.getItemFactory().equals(first.getItemMeta(), second.getItemMeta());
        }

        if(sameTypeId && sameDurability && sameAmount && sameHasItemMeta && sameEnchantments && sameItemMeta){
            similar = true;
        }

        return similar;

    }
	public static void checkrecipe(ItemStack item0, ItemStack item1, ItemStack item2,
										ItemStack item3, ItemStack item4, ItemStack item5,
										ItemStack item6, ItemStack item7, ItemStack item8,
										ItemStack finalitem, Inventory inv) {
		if (isSimilar(inv.getItem(0), item0) && isSimilar(inv.getItem(1), item1) && isSimilar(inv.getItem(2), item2) &&
				isSimilar(inv.getItem(3), item3) && isSimilar(inv.getItem(4), item4) && isSimilar(inv.getItem(5), item5) &&
				isSimilar(inv.getItem(6), item6) && isSimilar(inv.getItem(7), item7) && isSimilar(inv.getItem(8), item8)) {
			inv.clear();
			inv.setItem(4, finalitem);
		
		}
	}
}
