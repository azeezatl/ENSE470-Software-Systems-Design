package ense470lab4;
import ense470lab4.CoffeeMaker;
//import ense470lab4.Inventory;
//import ense470lab4.Recipe;
public class Lab04lawal28a extends CoffeeMaker{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoffeeMaker coffeeM = new CoffeeMaker();
		Inventory inventory = new Inventory();
		
		int milk = coffeeM.getInventory().getMilk();
		int coffee = coffeeM.getInventory().getCoffee();
		int cream = coffeeM.getInventory().getCream();
		int cinnamon = coffeeM.getInventory().getCinnamon();
	
		recipe1();
		System.out.println("The inventory has been topped up. The units are as follows: Coffee: " + coffee 
				+ ", Milk: " + milk + ", Cream: " + cream + ", Cinnamon: " + cinnamon);
	}

	public static void recipe1(){
	Reservoir res = new Cream(new Cinnamon(new Cinnamon(new Coffee(new CoffeeMaker()))));
	System.out.println();
	System.out.println(res.getName());
	System.out.println("The total cost of the coffee is $" + res.getPrice());
	}

	
}