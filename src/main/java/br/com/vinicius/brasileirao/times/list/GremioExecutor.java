package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class GremioExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Grêmio";
	}

	@Override
	public int getGames() {
		return 33;
	}

	@Override
	public int getWins() {
		return 16;
	}

	@Override
	public int getDraws() {
		return 10;
	}

	@Override
	public int getLosers() {
		return 7;
	}

	@Override
	public int getGoalsScored() {
		return 44;
	}

	@Override
	public int getGoalsConceded() {
		return 24;
	}

	@Override
	public int getPoints() {
		return 58;
	}

}
