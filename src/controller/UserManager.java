package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.dao.UserDao;
import model.vo.User;

public class UserManager {
	private static User user;
	private static UserDao ud;
	
	public UserManager(User user,UserDao ud) {
		this.user = user;
		this.ud = ud;
	}
	
	public void userItemSet() {
		
	}
	public static void createUser(String name) {
		//값을 전달받아 유저 객체 생성
		user = new User(name,new Date(),0);
		ud = new UserDao(user);
	}
	
	public void firstSelectPokemon(UserDao ud,User user) { 
		//첫 포켓몬 선택하는 메소드
	}
	
	public static int getUserGold() {
		//userDao가 가지고잇는 User객체값의 gold를 리턴받음
		System.out.println(ud.getUser().getuGold());
		return ud.getUser().getuGold();
	}
	public static void setUserGold(int gold) {
		ud.getUser().setuGold(gold);
	}
	public static String viewUserName() {
		return ud.getUser().getuName();
	}
	public static String viewUserTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("hh시 mm분");
		
		long diff = ud.getUser().getuDate().getTime() - new Date().getTime();
		
		
		String time = sdf.format(diff);
		return time;
		
	}
	public static String viewCreateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 hh시 mm분");
		String time = sdf.format(ud.getUser().getuDate());
		return time;
	}
}
