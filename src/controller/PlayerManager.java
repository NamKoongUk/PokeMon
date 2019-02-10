package controller;

import java.util.ArrayList;

import model.dao.PlayerDao;
import model.vo.Player;
import model.vo.Pokemon;

public class PlayerManager {
	private Player player;
	private PlayerDao pdao = new PlayerDao(player);
	
	public PlayerManager(Player player) {
		System.out.println(player+"객체 생성");
		this.player = player;
	}
	public void printPlayerInfo() {
		player.toString();
	}
	
	public ArrayList<Pokemon> getPokemon() {
		return pdao.getPlayerPokemonList();
	}
	public void setPokemon(Pokemon pokemon) {
		pdao.setPokemonList(pokemon);
	}
	
	
	
	
	
}
