package ense470lab4;

import java.util.ArrayList;

public class CoffeeMaker implements Reservoir{
	int MAX_INVENTORY = 20;
	int MAX_NUM_RECIPES = 4;
	
	//private Recipe[] recipe();
	private ArrayList<Recipe> recipe;
	private Inventory inventory;
	
	//boolean recipeName = false;
	String Name = "";
	
	public CoffeeMaker(){
		this.inventory = new Inventory();
		inventory.setMilk(MAX_INVENTORY);
		inventory.setCoffee(MAX_INVENTORY);
		inventory.setCream(MAX_INVENTORY);
		inventory.setCinnamon(MAX_INVENTORY);
		recipe = new ArrayList<Recipe>();
	}
	
	public Inventory getInventory(){
		return this.inventory;
	}
	
	//method to add recipes if possible, max 4
	public boolean addRecipe(Recipe rAdd){
		boolean already_exist = false; //chooses if recipe already exists
		if (this.recipe.size() < MAX_NUM_RECIPES) {//if less than max num recipes
			for (Recipe index: this.recipe) {// to look through the list
				if (index == rAdd) {//loops through list of recipe, index each recipe
					already_exist = true;
				}
			}
		} else {
			already_exist = true;// else of size > max
		}
		return already_exist ? false : this.recipe.add(rAdd);//add if conditions met
	}
	
	//if you want to add more recipes and already >4, delete; check how many first
	public boolean deleteRecipe(String recipeName){
		boolean valid = false;
		for (Recipe index: this.recipe) {// to look through the list
			if (index.equals(this.getRecipe(recipeName))) {//loops through list of recipe, index each recipe
				index = null;
				valid = true;
			}
		}
		return valid;
	}
	
	public Recipe getRecipe(String recipeName){
		Recipe recipe = null;
		for (Recipe index: this.recipe) {
			if (index.getRecipeName() == recipeName) {
				recipe = index;
			}
		}
		return recipe;
	}
	
	public boolean makeCoffee(String recipeName){
		Recipe rep = this.getRecipe(recipeName);
		boolean make = false;
		
		int coffee = this.inventory.getCoffee() - rep.getCoffeeLevel();
		int milk = this.inventory.getMilk() - rep.getMilkLevel();
		int cream = this.inventory.getCream() - rep.getCreamLevel();
		int cinnamon = this.inventory.getCinnamon() - rep.getCinnamonLevel();
		if ((coffee >= 0) && (milk >= 0) && (cream >= 0)) {
			this.inventory.setCoffee(coffee);
			this.inventory.setMilk(milk);
			this.inventory.setCream(cream);
			this.inventory.setCinnamon(cinnamon);
			make = true;
		}
		return make;
	}
	
	//tops up each product in the inventory
	public boolean addInventory(Inventory inventory){
		boolean topup = false; //chooses if recipe already exists
		int coffee = this.inventory.getCoffee();
		int milk = this.inventory.getMilk();
		int cream = this.inventory.getCream();
		int cinnamon = this.inventory.getCinnamon();
		
		while (coffee <20)
			coffee++;
		while (milk <20)
			milk++;
		while (cream <20)
			cream++;
		while (cinnamon <20)
			cinnamon++;
		
		if ((coffee == 20) && (milk == 20) && (cream == 20) && (cinnamon == 20)) {
			this.inventory.setCoffee(coffee);
			this.inventory.setMilk(milk);
			this.inventory.setCream(cream);
			this.inventory.setCinnamon(cinnamon);
			topup = true;
		}
		return topup;
	}
	
	public boolean editRecipe(Recipe recipe){
		boolean change = false; //chooses if recipe already exists
		String recipeName = "";
		for (Recipe index: this.recipe) {// to look through the list
			if (index.equals(this.getRecipe(recipeName))) {//loops through list of recipe, index each recipe
				index = null;
				change = true;
			}
		}
		return change ? false : this.recipe.add(recipe);//add if conditions met*/
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Your coffee includes";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

}
