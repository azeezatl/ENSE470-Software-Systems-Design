package ense470lab4;

public class Cream extends ReservoirDecorator{
	public Cream(Reservoir newReservoir) {
		//The superclass has a constructor so we need one.
		super(newReservoir); 

	System.out.println("Adding your cream...");
	}

	public String getName(){
		return tempReservoir.getName() + ", Cream";
	}

	public double getPrice(){
		return tempReservoir.getPrice() + 0.35;
	}
	
	public int getLevel(){
		return tempReservoir.getLevel() + 30;
	}
}
