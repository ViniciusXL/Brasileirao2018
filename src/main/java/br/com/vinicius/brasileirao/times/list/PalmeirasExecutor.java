package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class PalmeirasExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Palmeiras";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 23;
	}

	@Override
	public int getDraws() {
		return 11;
	}

	@Override
	public int getLosers() {
		return 4;
	}

	@Override
	public int getGoalsScored() {
		return 64;
	}

	@Override
	public int getGoalsConceded() {
		return 26;
	}

	@Override
	public int getPoints() {
		return 80;
	}

}
