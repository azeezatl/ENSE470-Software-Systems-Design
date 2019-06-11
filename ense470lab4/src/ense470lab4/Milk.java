package ense470lab4;

public class Milk extends ReservoirDecorator{
	public Milk(Reservoir newReservoir) {
		//The superclass has a constructor so we need one.
		super(newReservoir); 

	System.out.println("Adding your milk...");
	}

	public String getName(){
		return tempReservoir.getName() + ", Milk";
	}

	public double getPrice(){
		return tempReservoir.getPrice() + 0.25;
	}
	
	public int getLevel(){
		return tempReservoir.getLevel() + 30;
	}
}
