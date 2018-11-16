package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class ParanaExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Paraná";
	}

	@Override
	public int getGames() {
		return 33;
	}

	@Override
	public int getWins() {
		return 4;
	}

	@Override
	public int getDraws() {
		return 9;
	}

	@Override
	public int getLosers() {
		return 20;
	}

	@Override
	public int getGoalsScored() {
		return 15;
	}

	@Override
	public int getGoalsConceded() {
		return 51;
	}

	@Override
	public int getPoints() {
		return 21;
	}

}
