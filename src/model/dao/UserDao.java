package model.dao;

import java.util.ArrayList;
import java.util.List;

import model.vo.Item;
import model.vo.Pokemon;
import model.vo.User;

public class UserDao {

	private User user;
	private List<Pokemon> up_list = new ArrayList<Pokemon>(4);
	private List<Item> ui_list = new ArrayList<Item>();
	private List<Pokemon> tp_list = new ArrayList<Pokemon>();
	private int num=1;
	//private Image img = new ImageIcon("images/userMenuImages/pBook/00"+ num +".png").getImage();
	private PokemonDao pd = new PokemonDao();
	
	
	public UserDao() {
		
		up_list.add(pd.getpList().get(0));
		up_list.add(pd.getpList().get(1));
		up_list.add(pd.getpList().get(2));
		up_list.add(pd.getpList().get(3));
	
	}
	
	
	public UserDao(User user) {
		this.user = user;
		ui_list.add(new Item());
		
		up_list.add(pd.getpList().get(0));
		up_list.add(pd.getpList().get(1));
		up_list.add(pd.getpList().get(2));
		up_list.add(pd.getpList().get(3));
		
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


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
}
