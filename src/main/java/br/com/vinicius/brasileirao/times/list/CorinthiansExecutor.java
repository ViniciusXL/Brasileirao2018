package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class CorinthiansExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Corinthians";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 11;
	}

	@Override
	public int getDraws() {
		return 11;
	}

	@Override
	public int getLosers() {
		return 16;
	}

	@Override
	public int getGoalsScored() {
		return 34;
	}

	@Override
	public int getGoalsConceded() {
		return 35;
	}

	@Override
	public int getPoints() {
		return 44;
	}

}
