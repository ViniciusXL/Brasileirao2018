package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class SaoPauloExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "São Paulo";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 16;
	}

	@Override
	public int getDraws() {
		return 15;
	}

	@Override
	public int getLosers() {
		return 7;
	}

	@Override
	public int getGoalsScored() {
		return 46;
	}

	@Override
	public int getGoalsConceded() {
		return 34;
	}

	@Override
	public int getPoints() {
		return 63;
	}

}
