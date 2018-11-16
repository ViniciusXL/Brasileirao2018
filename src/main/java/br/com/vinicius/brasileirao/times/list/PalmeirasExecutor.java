package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class PalmeirasExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Palmeiras";
	}

	@Override
	public int getGames() {
		return 32;
	}

	@Override
	public int getWins() {
		return 19;
	}

	@Override
	public int getDraws() {
		return 10;
	}

	@Override
	public int getLosers() {
		return 4;
	}

	@Override
	public int getGoalsScored() {
		return 52;
	}

	@Override
	public int getGoalsConceded() {
		return 23;
	}

	@Override
	public int getPoints() {
		return 67;
	}

}
