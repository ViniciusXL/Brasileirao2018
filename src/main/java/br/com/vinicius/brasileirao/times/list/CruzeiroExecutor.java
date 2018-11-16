package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class CruzeiroExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Cruzeiro";
	}

	@Override
	public int getGames() {
		return 33;
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
		return 11;
	}

	@Override
	public int getGoalsScored() {
		return 30;
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
