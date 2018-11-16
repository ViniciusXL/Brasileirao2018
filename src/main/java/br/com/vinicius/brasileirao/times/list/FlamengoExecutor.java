package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class FlamengoExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Flamengo";
	}

	@Override
	public int getGames() {
		return 33;
	}

	@Override
	public int getWins() {
		return 17;
	}

	@Override
	public int getDraws() {
		return 9;
	}

	@Override
	public int getLosers() {
		return 7;
	}

	@Override
	public int getGoalsScored() {
		return 52;
	}

	@Override
	public int getGoalsConceded() {
		return 27;
	}

	@Override
	public int getPoints() {
		return 60;
	}

}
