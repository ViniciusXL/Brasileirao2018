package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class BotafogoExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Botafogo";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 13;
	}

	@Override
	public int getDraws() {
		return 12;
	}

	@Override
	public int getLosers() {
		return 13;
	}

	@Override
	public int getGoalsScored() {
		return 38;
	}

	@Override
	public int getGoalsConceded() {
		return 46;
	}

	@Override
	public int getPoints() {
		return 51;
	}

}
