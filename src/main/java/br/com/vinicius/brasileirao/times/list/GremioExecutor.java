package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class GremioExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Grêmio";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 18;
	}

	@Override
	public int getDraws() {
		return 12;
	}

	@Override
	public int getLosers() {
		return 8;
	}

	@Override
	public int getGoalsScored() {
		return 48;
	}

	@Override
	public int getGoalsConceded() {
		return 27;
	}

	@Override
	public int getPoints() {
		return 66;
	}

}
