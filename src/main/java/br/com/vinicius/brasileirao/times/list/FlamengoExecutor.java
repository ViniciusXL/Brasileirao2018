package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class FlamengoExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Flamengo";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 21;
	}

	@Override
	public int getDraws() {
		return 9;
	}

	@Override
	public int getLosers() {
		return 8;
	}

	@Override
	public int getGoalsScored() {
		return 59;
	}

	@Override
	public int getGoalsConceded() {
		return 29;
	}

	@Override
	public int getPoints() {
		return 72;
	}

}
