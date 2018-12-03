package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class SantosExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Santos";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 13;
	}

	@Override
	public int getDraws() {
		return 11;
	}

	@Override
	public int getLosers() {
		return 14;
	}

	@Override
	public int getGoalsScored() {
		return 46;
	}

	@Override
	public int getGoalsConceded() {
		return 40;
	}

	@Override
	public int getPoints() {
		return 50;
	}

}
