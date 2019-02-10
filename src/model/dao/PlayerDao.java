package model.dao;

import java.util.ArrayList;

import model.vo.Item;
import model.vo.Player;
import model.vo.Pokemon;

public class PlayerDao {
	private ArrayList<Pokemon> playerPokemonList = new ArrayList<>();
	private ArrayList<Item> playerItemList = new ArrayList<>();
	
	public PlayerDao(Player p) {
		
	}

	public ArrayList<Pokemon> getPlayerPokemonList() {
		return playerPokemonList;
	}

	public void setPlayerPokemonList(ArrayList<Pokemon> playerPokemonList) {
		this.playerPokemonList = playerPokemonList;
	}

	public ArrayList<Item> getPlayerItemList() {
		return playerItemList;
	}

	public void setPlayerItemList(ArrayList<Item> playerItemList) {
		this.playerItemList = playerItemList;
	}
	public ArrayList<Pokemon> getPokemonList() {
		return playerPokemonList;
	}
	public void setPokemonList(Pokemon p) {
		this.playerPokemonList.add(p);
	}
	
	
}
