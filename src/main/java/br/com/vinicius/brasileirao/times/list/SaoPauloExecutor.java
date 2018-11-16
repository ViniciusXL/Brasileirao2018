package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class SaoPauloExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "São Paulo";
	}

	@Override
	public int getGames() {
		return 33;
	}

	@Override
	public int getWins() {
		return 15;
	}

	@Override
	public int getDraws() {
		return 13;
	}

	@Override
	public int getLosers() {
		return 5;
	}

	@Override
	public int getGoalsScored() {
		return 44;
	}

	@Override
	public int getGoalsConceded() {
		return 30;
	}

	@Override
	public int getPoints() {
		return 58;
	}

}
