/**
 * Recipe.java version 1.0 Jan 20, 2011
 * @author Trevor Douglas
 *
 * @version
 */
package ense470lab4;

/**
 * @author tdouglas
 *
 */
public class Recipe {
    private String recipeName;
    private int milkLevel;
    private int creamLevel;
    private int coffeeLevel;
    private int cinnamonLevel;

    /**
     * Recipe constructor representing a Recipe for our
     * CoffeeMaker.
     * @param recipeName may not be null.
     * @param milkLevel must be non negative and less than or equal to
     * the MAX_INVENTORY.  If not true will be set to MAX_INVENTORY
     * @param sugarLevel must be non negative and less than or equal to
     * the MAX_INVENTORY.  If not true will be set to MAX_INVENTORY
     * @param coffeeLevel must be non negative and less than or equal to
     * the MAX_INVENTORY.  If not true will be set to MAX_INVENTORY
     *
     */
    public Recipe(String recipeName, int milkLevel, int creamLevel, int coffeeLevel, int cinnamonLevel)
    {
    	this.recipeName = recipeName;
    	this.milkLevel = milkLevel;
    	this.creamLevel = creamLevel;
    	this.coffeeLevel = coffeeLevel;
    	this.cinnamonLevel = cinnamonLevel;
    	
    }
    /**
     * Getter of the property <tt>Name</tt>
     *
     * @return Returns the Name.
     *
     */
    public String getRecipeName() {
    	return recipeName;
    }

    /**
     * Getter of the property <tt>milkLevel</tt>
     *
     * @return Returns the milkLevel.
     *
     */
    public int getMilkLevel() {
    	return milkLevel;
    }

    /**
     * Getter of the property <tt>sugarLevel</tt>
     *
     * @return Returns the sugarLevel.
     *
     */
    public int getCreamLevel() {
    	return creamLevel;
    }

    /**
     * Getter of the property <tt>coffeeLevel</tt>
     *
     * @return Returns the coffeeLevel.
     *
     */
    public int getCoffeeLevel() {
    	return coffeeLevel;
    }
    
    public int getCinnamonLevel() {
    	return cinnamonLevel;
    }

    
}

