package ense470lab4;

public class Coffee extends ReservoirDecorator{
	public Coffee(Reservoir newReservoir) {
		//The superclass has a constructor so we need one.
		super(newReservoir); 

	System.out.println("Adding your coffee...");
	}

	public String getName(){
		return tempReservoir.getName() + ", Coffee";
	}

	public double getPrice(){
		return tempReservoir.getPrice() + 0.65;
	}
	
	public int getLevel(){
		return tempReservoir.getLevel() + 30;
	}
}
