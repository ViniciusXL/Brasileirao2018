package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class AtleticoMineiroExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Atlético Mineiro";
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
		return 8;
	}

	@Override
	public int getLosers() {
		return 12;
	}

	@Override
	public int getGoalsScored() {
		return 49;
	}

	@Override
	public int getGoalsConceded() {
		return 39;
	}

	@Override
	public int getPoints() {
		return 47;
	}

}
