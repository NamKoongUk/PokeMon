package controller;

import java.util.Date;

import model.dao.UserDao;
import model.vo.User;

public class UserManager {
	User user;
	UserDao ud;
	
	public UserManager(User user,UserDao ud) {
		this.user = user;
		this.ud = ud;
	}
	
	public void userItemSet() {
		
	}
	public void createUser(String name) {
		//���� ���޹޾� ���� ��ü ����
		user = new User(name,new Date(),0);
		ud = new UserDao(user);
	}
	
	public void firstSelectPokemon(UserDao ud,User user) {
		//ù ���ϸ� �����ϴ� �޼ҵ�
	}
	
	public int getUserGold() {
		//userDao�� �������մ� User��ü���� gold�� ���Ϲ���
		System.out.println(ud.getUser().getuGold());
		return ud.getUser().getuGold();
	}
	public void setUserGold(int gold) {
		ud.getUser().setuGold(gold);
	}
	
	
	
}
