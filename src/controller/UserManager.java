package controller;

import java.util.Date;

import model.dao.UserDao;
import model.vo.User;

public class UserManager {
	User user;
	UserDao ud;
	
	public UserManager() {
		
	}
	
	public void userItemSet() {
		
	}
	public void createUser(String name) {
		//값을 전달받아 유저 객체 생성
		user = new User(name,new Date(),0);
		ud = new UserDao(user);
	}
	
	public void firstSelectPokemon(UserDao ud,User user) {
		//첫 포켓몬 선택하는 메소드
	}
	
	public int getUserGold() {
		//userDao가 가지고잇는 User객체값의 gold를 리턴받음
		return ud.getUser().getuGold();
	}
	public void setUserGold(int gold) {
		ud.getUser().setuGold(gold);
	}
	
	
	
}
