/**
 * Inventory.java version 1.0 Jan 20, 2011
 * @author Trevor Douglas
 *
 * @version
 */

package ense470lab4;

/**
 * @author tdouglas
 *
 */
public class Inventory {
    private int milk;
    private int coffee;
    private int cream;
    private int cinnamon;

    /**
     * Constructor
     */
    public Inventory(){
    	
    	milk =0;
    	coffee =0;
    	cream = 0;
    	cinnamon =0;
    }

    
    /**
     * Getter of the property <tt>milk</tt>
     *
     * @return Returns the milk.
     *
     */
    public int getMilk() {
    	return milk;
    }

    /**
     * Setter of the property <tt>milk</tt>
     *
     * @param milk
     *                The milk to set.
     *
     */
    public void setMilk(int milk) {
    	this.milk = milk;
    }


    /**
     * Getter of the property <tt>coffee</tt>
     *
     * @return Returns the coffee.
     *
     */
    public int getCoffee() {
    	return coffee;
    }

    /**
     * Setter of the property <tt>coffee</tt>
     *
     * @param coffee
     *                The coffee to set.
     *
     */
    public void setCoffee(int coffee) {
    	this.coffee = coffee;
    }


    /**
     * Getter of the property <tt>sugar</tt>
     *
     * @return Returns the sugar.
     *
     */
    public int getCream() {
    	return cream;
    }

    /**
     * Setter of the property <tt>sugar</tt>
     *
     * @param sugar
     *                The sugar to set.
     *
     */
    public void setCream(int cream) {
    	this.cream = cream;
    }
    
    public int getCinnamon() {
    	return cinnamon;
    }

    /**
     * Setter of the property <tt>sugar</tt>
     *
     * @param sugar
     *                The sugar to set.
     *
     */
    public void setCinnamon(int cinnamon) {
    	this.cinnamon = cinnamon;
    }
}
