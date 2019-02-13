package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.dao.UserDao;
import model.vo.User;

public class UserManager {
	private UserDao ud;
	
	public UserManager() {}
	public UserManager(UserDao ud) {
		//유저매니져 객체를 생성할때마다 ud의 값을 가져야함
		this.ud = ud;
	}
	
	public void userItemSet() {
		
	}
	public void createUser(String name) {
		//값을 전달받아 유저 객체 생성
		User user = new User(name,new Date(),1000);
		ud = new UserDao(user);
		
	}
	
	public void firstSelectPokemon(UserDao ud,User user) { 
		//첫 포켓몬 선택하는 메소드
	}
	
	public int getUserGold() {
		//userDao가 가지고잇는 User객체값의 gold를 리턴받음
		System.out.println(ud.getUser().getuGold());
		return ud.getUser().getuGold();
	}
	public void setUserGold(int gold) {
		ud.getUser().setuGold(gold);
	}
	public String viewUserName() {
		return ud.getUser().getuName();
	}
	public String viewUserTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("hh시 mm분");
		
		long diff = ud.getUser().getuDate().getTime() - new Date().getTime();
		
		
		String time = sdf.format(diff);
		return time;
		
	}
	public String viewCreateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 hh시 mm분");
		String time = sdf.format(ud.getUser().getuDate());
		return time;
	}
}
