package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class ParanaExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Paraná";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 4;
	}

	@Override
	public int getDraws() {
		return 11;
	}

	@Override
	public int getLosers() {
		return 23;
	}

	@Override
	public int getGoalsScored() {
		return 18;
	}

	@Override
	public int getGoalsConceded() {
		return 57;
	}

	@Override
	public int getPoints() {
		return 23;
	}

}
