package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class SportRecifeExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Sport Refice";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 11;
	}

	@Override
	public int getDraws() {
		return 9;
	}

	@Override
	public int getLosers() {
		return 18;
	}

	@Override
	public int getGoalsScored() {
		return 35;
	}

	@Override
	public int getGoalsConceded() {
		return 57;
	}

	@Override
	public int getPoints() {
		return 42;
	}

}
