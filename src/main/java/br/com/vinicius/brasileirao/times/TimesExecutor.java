package br.com.vinicius.brasileirao.times;

import javax.swing.JFrame;

public abstract class TimesExecutor {
	
	public abstract String getName();
	
	public abstract int getGames();
	
	public abstract int getWins();
	
	public abstract int getDraws();
	
	public abstract int getLosers();
	
	public abstract int getGoalsScored();
	
	public abstract int getGoalsConceded();
	
	public int getGoalsDifference() {
		return this.getGoalsScored() - this.getGoalsConceded();
	}
	
	public abstract int getPoints();
	
	public abstract void setInformation(JFrame frame);
}
