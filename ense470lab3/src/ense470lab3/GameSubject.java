package ense470lab3;

public interface GameSubject {
	public void addObserver(GameObserver gameObserver);
	public void removeObserver(GameObserver gameObserver);
	public void doNotify();
}
