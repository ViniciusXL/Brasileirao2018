package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class CorinthiansExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Corinthians";
	}

	@Override
	public int getGames() {
		return 33;
	}

	@Override
	public int getWins() {
		return 10;
	}

	@Override
	public int getDraws() {
		return 10;
	}

	@Override
	public int getLosers() {
		return 13;
	}

	@Override
	public int getGoalsScored() {
		return 33;
	}

	@Override
	public int getGoalsConceded() {
		return 32;
	}

	@Override
	public int getPoints() {
		return 40;
	}

}
