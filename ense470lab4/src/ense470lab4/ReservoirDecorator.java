package ense470lab4;

public abstract class ReservoirDecorator implements Reservoir{
	protected Reservoir tempReservoir;

	public ReservoirDecorator(Reservoir newReservoir){
		tempReservoir = newReservoir;
	}		

	public String getName(){
		return tempReservoir.getName();
	}

	public double getPrice(){
		return tempReservoir.getPrice();
	}
	
	public int getLevel(){
		return tempReservoir.getLevel();
	}

}