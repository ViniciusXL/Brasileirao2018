package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class FluminenseExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Fluminense";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 12;
	}

	@Override
	public int getDraws() {
		return 9;
	}

	@Override
	public int getLosers() {
		return 17;
	}

	@Override
	public int getGoalsScored() {
		return 32;
	}

	@Override
	public int getGoalsConceded() {
		return 42;
	}

	@Override
	public int getPoints() {
		return 45;
	}

}
