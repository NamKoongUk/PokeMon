package model.vo;

import java.util.Random;

public class Pokemon {
	public final static double GET_BASIC_EXP = 50;
	public final static double GET_EXP_INCREASE = 1.15;
	public final static double GIVE_EXP_GRADE_A = 10;
	public final static double GIVE_EXP_GRADE_B = 7;
	public final static double GIVE_EXP_GRADE_C = 4;
	public final static double GIVE_EXP_INCREASE = 1.13;
	
	private String pokemonName;
	private int pokemonNumber;


	private int pokemonLevel;
	private int pokemonHp;
	private int exp;
	private int	maxExp;
	private int pokemonAtk;
	private int pokemonSpeed;
	private int pokemonGrade;
	private int giveExp;

	//포켓몬 1등급
	//레벨 1기준
	//hp
	public Pokemon(int pokemonNumber,String pokemonName, int pokemonLevel,int pokemonGrade) {
		super();
		
		this.pokemonNumber = pokemonNumber;
		this.pokemonName = pokemonName;
		this.pokemonLevel = pokemonLevel;

		this.pokemonGrade = pokemonGrade;
		setPokemonAbility(pokemonLevel, pokemonGrade);
/*		this.pokemonAtk = pokemonAtk;
		this.pokemonSpeed = pokemonSpeed; 
		this.pokemonHp = pokemonLevel; 
		this.exp = exp;
		this.maxExp = maxExp; */
	}
	public Pokemon(Pokemon p) {
		this.pokemonNumber = p.pokemonNumber;
		this.pokemonLevel = p.pokemonLevel;
		this.pokemonHp = p.pokemonHp;
		this.exp = p.exp;
		this.maxExp = p.maxExp;
		this.pokemonAtk = p.pokemonAtk;
		this.pokemonSpeed = p.pokemonSpeed;
		this.pokemonGrade = p.pokemonGrade;
		this.giveExp = p.giveExp;
	}
	public int getPokemonNumber() {
		return pokemonNumber;
	}
	public void setPokemonNumber(int pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}
	public int getGiveExp() {
		return giveExp;
	}
	public void setGiveExp(int giveExp) {
		this.giveExp = giveExp;
	}
	public String getPokemonName() {
		return pokemonName;
	}
	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	public int getPokemonLevel() {
		return pokemonLevel;
	}
	public void setPokemonLevel(int pokemonLevel) {
		this.pokemonLevel = pokemonLevel;
	}
	public int getPokemonHp() {
		return pokemonHp;
	}
	public void setPokemonHp(int pokemonHp) {
		this.pokemonHp = pokemonHp;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getMaxExp() {
		return maxExp;
	}
	public void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}
	public int getPokemonAtk() {
		return pokemonAtk;
	}
	public void setPokemonAtk(int pokemonAtk) {
		this.pokemonAtk = pokemonAtk;
	}
	public int getPokemonSpeed() {
		return pokemonSpeed;
	}
	public void setPokemonSpeed(int pokemonSpeed) {
		this.pokemonSpeed = pokemonSpeed;
	}
	public int getPokemonGrade() {
		return pokemonGrade;
	}
	public void setPokemonGrade(int pokemonGrade) {
		this.pokemonGrade = pokemonGrade;
	}
	
	private void setPokemonAbility(int level,int grade) {
		
/*		int ranHpA = new Random().nextInt(6)+45;
  		int ranAtkA = new Random().nextInt(6)+30;
  		int ranSpeedA = new Random().nextInt(3)+20;
  		
		int ranHpB = new Random().nextInt(6)+37;
		int ranSpeedB = new Random().nextInt(3)+17;
		int ranAtkB = new Random().nextInt(6)+23;
		
		int ranHpC = new Random().nextInt(6)+30;	
		int ranSpeedC = new Random().nextInt(3)+14;
		int ranAtkC = new Random().nextInt(6)+16;*/
		double basicExp = GET_BASIC_EXP;
		for(int i=1; i <= level; i++) {
			basicExp *= GET_EXP_INCREASE; 
		}
		this.maxExp = (int)basicExp;
		
		double giveExp = 0;
		if(grade==1) {
			//pokemon grade A
			giveExp = GIVE_EXP_GRADE_A; 
			for(int i=1; i <= level; i++) {
				this.pokemonAtk += new Random().nextInt(6)+30;
				this.pokemonHp += new Random().nextInt(6)+45;
				this.pokemonSpeed += new Random().nextInt(3)+20;
				giveExp *= GIVE_EXP_INCREASE;
			}
		} else if(grade==2) {
			//pokemon grade B
			giveExp = GIVE_EXP_GRADE_B; 
			for(int i=1; i <= level; i++) {
				this.pokemonAtk += new Random().nextInt(6)+23;
				this.pokemonHp += new Random().nextInt(6)+37;
				this.pokemonSpeed += new Random().nextInt(3)+17;
				giveExp *= GIVE_EXP_INCREASE;
			}
		} else {
			//pokemon grade C
			giveExp = GIVE_EXP_GRADE_C; 
			for(int i=1; i <= level; i++) {
				this.pokemonAtk += new Random().nextInt(6)+16;
				this.pokemonHp += new Random().nextInt(6)+30;
				this.pokemonSpeed += new Random().nextInt(3)+14;
				giveExp *= GIVE_EXP_INCREASE;
			}
		}
		this.giveExp = (int)giveExp;
	}
	
	@Override
	public String toString() {
		return "Pokemon [pokemonName=" + pokemonName + ", pokemonNumber=" + pokemonNumber + ", pokemonLevel="
				+ pokemonLevel + ", pokemonHp=" + pokemonHp + ", exp=" + exp + ", maxExp=" + maxExp + ", pokemonAtk="
				+ pokemonAtk + ", pokemonSpeed=" + pokemonSpeed + ", pokemonGrade=" + pokemonGrade + ", giveExp="
				+ giveExp + "]";
	}
	
	
	
}
