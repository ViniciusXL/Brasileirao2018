package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class FluminenseExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Fluminense";
	}

	@Override
	public int getGames() {
		return 32;
	}

	@Override
	public int getWins() {
		return 11;
	}

	@Override
	public int getDraws() {
		return 7;
	}

	@Override
	public int getLosers() {
		return 14;
	}

	@Override
	public int getGoalsScored() {
		return 31;
	}

	@Override
	public int getGoalsConceded() {
		return 39;
	}

	@Override
	public int getPoints() {
		return 40;
	}

}
