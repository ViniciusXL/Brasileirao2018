package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class SportRecifeExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Sport Refice";
	}

	@Override
	public int getGames() {
		return 32;
	}

	@Override
	public int getWins() {
		return 10;
	}

	@Override
	public int getDraws() {
		return 6;
	}

	@Override
	public int getLosers() {
		return 16;
	}

	@Override
	public int getGoalsScored() {
		return 32;
	}

	@Override
	public int getGoalsConceded() {
		return 53;
	}

	@Override
	public int getPoints() {
		return 36;
	}

}
