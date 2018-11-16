package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class BotafogoExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Botafogo";
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
		return 11;
	}

	@Override
	public int getLosers() {
		return 12;
	}

	@Override
	public int getGoalsScored() {
		return 33;
	}

	@Override
	public int getGoalsConceded() {
		return 43;
	}

	@Override
	public int getPoints() {
		return 41;
	}

}
