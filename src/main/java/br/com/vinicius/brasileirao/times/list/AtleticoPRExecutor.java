package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class AtleticoPRExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Atlético-PR";
	}

	@Override
	public int getGames() {
		return 33;
	}

	@Override
	public int getWins() {
		return 13;
	}

	@Override
	public int getDraws() {
		return 7;
	}

	@Override
	public int getLosers() {
		return 13;
	}

	@Override
	public int getGoalsScored() {
		return 46;
	}

	@Override
	public int getGoalsConceded() {
		return 32;
	}

	@Override
	public int getPoints() {
		return 46;
	}

}
