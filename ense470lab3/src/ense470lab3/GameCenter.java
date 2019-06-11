package ense470lab3;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * @author trevordouglas
 *
 */

public class GameCenter implements GameSubject {
	
	Set <GameObserver> observers; 
	
	private int homeGameID;
	private int visitorGameID;
	private int homeScore;
	private int visitorScore;
	private int currentPeriod;
	private Hashtable<String, Integer> teams;
	
	public GameCenter(int homeGameID, int visitorGameID, int homeScore, 
						int visitorScore, int currentPeriod) {
		
		observers = new HashSet<GameObserver>();
		
		this.homeGameID = homeGameID;
		this.visitorGameID = visitorGameID;
		this.homeScore = homeScore;
		this.visitorScore = visitorScore;
		this.currentPeriod = currentPeriod;
		
		teams  = new Hashtable<String, Integer>();
		teams.put("Toronto Maple Leafs", 1);
		teams.put("Montreal Canadiens", 2);
		teams.put("Edmonton Oilers", 3);	
		teams.put("Vancouver Canucks", 4);
		teams.put("Calgary Flames",  5);
		teams.put("Ottawa Senators", 6);
		}
	
	
	@Override
	public void addObserver(GameObserver gameObserver) {
		observers.add(gameObserver);
		System.out.println("New observer added...");
	}
	
	@Override
	public void removeObserver(GameObserver gameObserver) {
		observers.remove(gameObserver);
		System.out.println("Observer removed...");
	}

	@Override
	public void doNotify() {
		Iterator<GameObserver> iterator = observers.iterator();
		
		while (iterator.hasNext()) {
			GameObserver gameObserver = iterator.next();
			gameObserver.doUpdate(homeGameID, visitorGameID, homeScore, visitorScore, currentPeriod);
		}
	}

	public void setHomeID(int newHomeID) {
		System.out.println("Home Team: The Toronto Maple Leafs, ID: " + newHomeID);
		homeScore = newHomeID;
		doNotify();
		System.out.println("\n");
	}
	
	public void setVisitorID(int newVisitorID) {
		System.out.println("Visitor Team: The Montreal Canadiens, ID: " + newVisitorID);
		visitorScore = newVisitorID;
		doNotify();
		System.out.println("\n");
	}
	
	public void setHomeScore(int newHomeScore) {
		System.out.println("Updating Home Team Score to " + newHomeScore);
		homeScore = newHomeScore;
		doNotify();
		System.out.println("\n");
	}
	
	public void setVisitorScore(int newVisitorScore) {
		System.out.println("Updating Visitor Team Score to " + newVisitorScore);
		visitorScore = newVisitorScore;
		doNotify();
		System.out.println("\n");
	}
	
	public void setCurrentPeriod(int newCurrentPeriod) {
		System.out.println("Updating Current Period to " + newCurrentPeriod);
		currentPeriod = newCurrentPeriod;
		doNotify();
		System.out.println("\n");
	}

}
