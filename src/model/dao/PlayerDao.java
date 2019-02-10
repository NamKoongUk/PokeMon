package model.dao;

import java.util.ArrayList;

import model.vo.Item;
import model.vo.Player;
import model.vo.Pokemon;

public class PlayerDao {
	private Player p;
	private ArrayList<Pokemon> playerPokemonList = new ArrayList<>();
	private ArrayList<Item> playerItemList = new ArrayList<>();
	
	public PlayerDao(Player p) {
		this.p = p;
	}

	public ArrayList<Pokemon> getPlayerPokemonList() {
		return playerPokemonList;
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
	
	//유저 포켓몬 추가
	public void setPokemonList(Pokemon p) {
		this.playerPokemonList.add(p);
	}
	//포켓몬 경험치획득
	public void givePokemonExp(Pokemon p) {
		
	}


	
	
	
}
