package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class SantosExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Santos";
	}

	@Override
	public int getGames() {
		return 32;
	}

	@Override
	public int getWins() {
		return 12;
	}

	@Override
	public int getDraws() {
		return 10;
	}

	@Override
	public int getLosers() {
		return 10;
	}

	@Override
	public int getGoalsScored() {
		return 40;
	}

	@Override
	public int getGoalsConceded() {
		return 31;
	}

	@Override
	public int getPoints() {
		return 46;
	}

}
