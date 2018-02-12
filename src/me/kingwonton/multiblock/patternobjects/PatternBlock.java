package me.kingwonton.multiblock.patternobjects;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.util.Vector;
import org.eclipse.jdt.annotation.NonNull;

import me.kingwonton.multiblock.IMaterial;
import me.kingwonton.multiblock.MaterialWrapper;
import me.kingwonton.multiblock.PatternObject;

/**
 * Block pattern for the multiblock structure
 * 
 * @author ShaneCraft
 *
 */
public class PatternBlock extends PatternObject {

	private final IMaterial material;
	
	public PatternBlock(@NonNull Material blockMaterial, int x, int y, int z) {
		this(blockMaterial, new Vector(x, y, z));
	}
	
	public PatternBlock(@NonNull Material blockMaterial, Vector relativeVec) {
		super(relativeVec);
		
		if (!blockMaterial.isBlock()) {
			throw new IllegalArgumentException(String.format("The given blockMaterial %s is not a valid block material.", blockMaterial.toString()));
		}
		
		this.material = new MaterialWrapper(blockMaterial);
	}
	
	public PatternBlock(@NonNull IMaterial material, int x, int y, int z) {
		this(material, new Vector(x, y, z));
	}
	
	public PatternBlock(@NonNull IMaterial material, Vector relativeVec) {
		super(relativeVec);
		
		if (!material.getType().isBlock()) {
			throw new IllegalArgumentException(String.format("The given blockMaterial %s is not a valid block material.", material.getType().toString()));
		}
		
		this.material = material;
	}

	@Override
	protected PatternObject createRotatedClone(Vector vector) {
		return new PatternBlock(material, vector);
	}

	@Override
	public boolean isValid(Location location) {
		return material.isValidBlock(location.getBlock());
	}
	
	public Material getMaterial() {
		return material.getType();
	}
}
