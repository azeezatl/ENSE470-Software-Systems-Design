package ense470lab4;

public class Cinnamon extends ReservoirDecorator{
	public Cinnamon(Reservoir newReservoir) {
		//The superclass has a constructor so we need one.
		super(newReservoir); 

	System.out.println("Adding your cinnamon...");
	}

	public String getName(){
		return tempReservoir.getName() + ", Cinnamon";
	}

	public double getPrice(){
		return tempReservoir.getPrice() + 0.50;
	}
	
	public int getLevel(){
		return tempReservoir.getLevel() + 30;
	}
}
