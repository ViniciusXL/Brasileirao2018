package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class InternacionalExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Internacional";
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
		return 11;
	}

	@Override
	public int getLosers() {
		return 5;
	}

	@Override
	public int getGoalsScored() {
		return 45;
	}

	@Override
	public int getGoalsConceded() {
		return 25;
	}

	@Override
	public int getPoints() {
		return 62;
	}

}
