package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class InternacionalExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Internacional";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 19;
	}

	@Override
	public int getDraws() {
		return 12;
	}

	@Override
	public int getLosers() {
		return 7;
	}

	@Override
	public int getGoalsScored() {
		return 51;
	}

	@Override
	public int getGoalsConceded() {
		return 29;
	}

	@Override
	public int getPoints() {
		return 69;
	}

}
