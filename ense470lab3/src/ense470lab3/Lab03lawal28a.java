package ense470lab3;

public class Lab03lawal28a {
	public static void main(String[] args) {
		
		GameCenter gameCenter = new GameCenter(1, 2, 0, 0, 1);
		
		Observer1 user1 = new Observer1();
		Observer2 user2 = new Observer2();
		gameCenter.addObserver(user1);
		gameCenter.addObserver(user2);
		
		gameCenter.setHomeID(1);
		gameCenter.setVisitorID(2);
		
		gameCenter.setHomeScore(3);
		gameCenter.setVisitorScore(4);
		
		gameCenter.removeObserver(user2);
		
		gameCenter.setCurrentPeriod(2);
		
		gameCenter.setHomeScore(7);
		gameCenter.setVisitorScore(6);
					
	}
}
