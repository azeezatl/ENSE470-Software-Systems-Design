package ense470lab3;

public interface GameObserver {
	public void doUpdate(int homeGameID, int visitorGameID, int homeScore, int visitorScore, int currentPeriod);
}