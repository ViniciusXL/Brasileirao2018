package br.com.vinicius.brasileirao.times;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.vinicius.brasileirao.times.list.*;

public enum Times {

	AMERICA_MG(new AmericaMGExecutor()), 
	ATLETICO_MINEIRO(new AtleticoMineiroExecutor()), 
	ATLETICO_PR(new AtleticoPRExecutor()), 
	BAHIA(new BahiaExecutor()),
	BOTAFOGO(new BotafogoExecutor()), 
	CEARA(new CearaExecutor()), 
	CHAPECOENSE(new ChapecoenseExecutor()), 
	CORINTHIANS(new CorinthiansExecutor()), 
	CRUZEIRO(new CruzeiroExecutor()), 
	FLAMENGO(new FlamengoExecutor()), 
	FLUMINENSE(new FluminenseExecutor()), 
	GREMIO(new GremioExecutor()), 
	INTERNACIONAL(new InternacionalExecutor()), 
	PALMEIRAS(new PalmeirasExecutor()), 
	PARANA(new ParanaExecutor()), 
	SANTOS(new SantosExecutor()), 
	SAO_PAULO(new SaoPauloExecutor()), 
	SPORT_RCIFE(new SportRecifeExecutor()), 
	VASCO_DA_GAMA(new VascoDaGamaExecutor()), 
	VITORIA(new VitoriaExecutor());

	private final TimesExecutor executor;

	private Times(TimesExecutor executor) {
		this.executor = executor;
	}

	public final TimesExecutor getExecutor() {
		return executor;
	}

	public final String getName() {
		return executor.getName();
	}

	public final int getGames() {
		return executor.getGames();
	}

	public final int getWins() {
		return executor.getWins();
	}

	public final int getDraws() {
		return executor.getDraws();
	}

	public final int getLosers() {
		return executor.getLosers();
	}

	public final int getGoalsScored() {
		return executor.getGoalsScored();
	}

	public final int getGoalsConceded() {
		return executor.getGoalsConceded();
	}

	public final int getGoalsDifference() {
		return executor.getGoalsDifference();
	}

	public final int getPoints() {
		return executor.getPoints();
	}

	public final String toString() {
		return String.format("%s, MP: %s, W: %s, D: %s, L: %s, GF: %s, GA: %s, GD: %s, PTs: %s", this.getName(),
				this.getGames(), this.getWins(), this.getDraws(), this.getLosers(), this.getGoalsScored(),
				this.getGoalsConceded(), this.getGoalsDifference(), this.getPoints());
	}

	public static final List<Times> getTeams(Comparator<? super Times> comparator) {
		return Arrays.asList(values()).stream().sorted(comparator).collect(Collectors.toList());
	}
}
