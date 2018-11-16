package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class AmericaMGExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "América-MG";
	}

	@Override
	public int getGames() {
		return 33;
	}

	@Override
	public int getWins() {
		return 8;
	}

	@Override
	public int getDraws() {
		return 10;
	}

	@Override
	public int getLosers() {
		return 15;
	}

	@Override
	public int getGoalsScored() {
		return 27;
	}

	@Override
	public int getGoalsConceded() {
		return 39;
	}

	@Override
	public int getPoints() {
		return 34;
	}

}
