package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class CruzeiroExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Cruzeiro";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 14;
	}

	@Override
	public int getDraws() {
		return 11;
	}

	@Override
	public int getLosers() {
		return 13;
	}

	@Override
	public int getGoalsScored() {
		return 34;
	}

	@Override
	public int getGoalsConceded() {
		return 34;
	}

	@Override
	public int getPoints() {
		return 53;
	}

}
