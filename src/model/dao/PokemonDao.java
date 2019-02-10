package model.dao;

import java.util.ArrayList;

import model.vo.Pokemon;

public class PokemonDao {
	private ArrayList<Pokemon> pokemonList = new ArrayList<>();
	
	public PokemonDao() {
		//이름 , 레벨 , 경험치
		Pokemon p1 = new Pokemon(1,"이상해씨",1,3);
		Pokemon p2 = new Pokemon(2,"파이리",1,3);
		Pokemon p3 = new Pokemon(3,"꼬부기",1,3);
		Pokemon p4 = new Pokemon(4,"이상해풀",1,2);
		Pokemon p5 = new Pokemon(5,"리자드",1,2);
		Pokemon p6 = new Pokemon(6,"어니부기",1,2);
		Pokemon p7 = new Pokemon(7,"이상해꽃",1,1);
		Pokemon p8 = new Pokemon(8,"리자몽",1,1);
		Pokemon p9 = new Pokemon(9,"거북왕",1,1);
		Pokemon p10 = new Pokemon(10,"꼬렛",1,3);
		Pokemon p11 = new Pokemon(11,"발챙이",1,3);
		Pokemon p12 = new Pokemon(12,"슈륙챙이",1,2);
		Pokemon p13 = new Pokemon(13,"강챙이",1,1);
		
		pokemonList.add(p1);
		pokemonList.add(p2);
		pokemonList.add(p3);
		pokemonList.add(p4);
		pokemonList.add(p5);
		pokemonList.add(p6);
		pokemonList.add(p7);
		pokemonList.add(p8);
		pokemonList.add(p9);
		pokemonList.add(p10);
		pokemonList.add(p11);
		pokemonList.add(p12);
		pokemonList.add(p13);
	}
	public ArrayList<Pokemon> getBasicPokemonList() {
		return pokemonList;
	}
	public void displayAllList(){
		System.out.println("displayAllList");
		for(Object obj : pokemonList) {

			System.out.println(obj);
		}
	}

	

	
}
