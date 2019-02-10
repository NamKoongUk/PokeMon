package model.vo;

import java.util.ArrayList;
import java.util.Date;

public class Player {
	private int gold;
	private Date date;
	private String name;
	public Player(int gold, Date date, String name) {
		super();
		this.gold = gold;
		this.date = date;
		this.name = name;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Player [gold=" + gold + ", date=" + date + ", name=" + name + "]";
	}
	


	
	
}
