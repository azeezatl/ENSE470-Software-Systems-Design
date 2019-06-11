package ense470lab3;

public class Observer2 implements GameObserver {

	@Override
	public void doUpdate(int homeGameID, int visitorGameID, int homeScore, int visitorScore, int currentPeriod) {
		// TODO Auto-generated method stub
		System.out.println("-> Observer 2 has been notified.\n" + "Current period: " + currentPeriod + "\n"
				+ "Home score: " + homeScore + " | Visitor score: " + visitorScore);
			}
}
