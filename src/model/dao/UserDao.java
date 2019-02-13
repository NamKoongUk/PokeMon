package model.dao;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import model.vo.Item;
import model.vo.Pokemon;

public class UserDao {

	
	private List<Pokemon> up_list = new ArrayList<Pokemon>(4);
	private List<Item> ui_list = new ArrayList<Item>();
	private List<Pokemon> tp_list = new ArrayList<Pokemon>();
	private Image img = new ImageIcon("").getImage();
	
	public UserDao() {
		ui_list.add(new Item());
		up_list.add(new Pokemon("帕备府",104,0,false,img,1));
		up_list.add(new Pokemon("帕备府",104,0,false,img,1));
		up_list.add(new Pokemon("帕备府",104,0,false,img,1));
		up_list.add(new Pokemon("帕备府",104,0,false,img,1));
		
	}
	
	
	public List<Pokemon> getUp_list() {
		return up_list;
	}


	public void setUp_list(List<Pokemon> up_list) {
		this.up_list = up_list;
	}


	public List<Item> getUi_list() {
		return ui_list;
	}


	public void setUi_list(List<Item> ui_list) {
		this.ui_list = ui_list;
	}


	public List<Pokemon> getTp_list() {
		return tp_list;
	}


	public void setTp_list(List<Pokemon> tp_list) {
		this.tp_list = tp_list;
	}


	public void addPokemon(Pokemon poke) {
		up_list.add(poke);
	}
	public void addItem(Item item) {
		ui_list.add(item);
	}
	public void addPokemon2(Pokemon poke) {
		tp_list.add(poke);
	}
	
	
	
	
	
}
