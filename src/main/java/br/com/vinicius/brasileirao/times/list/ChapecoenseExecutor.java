package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class ChapecoenseExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Chapecoense";
	}

	@Override
	public int getGames() {
		return 32;
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
		return 14;
	}

	@Override
	public int getGoalsScored() {
		return 30;
	}

	@Override
	public int getGoalsConceded() {
		return 46;
	}

	@Override
	public int getPoints() {
		return 34;
	}

}
