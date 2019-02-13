package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.dao.UserDao;
import model.vo.User;

public class UserManager {
	private UserDao ud;
	
	public UserManager() {}
	public UserManager(UserDao ud) {
		//�����Ŵ��� ��ü�� �����Ҷ����� ud�� ���� ��������
		this.ud = ud;
	}
	
	public void userItemSet() {
		
	}
	public void createUser(String name) {
		//���� ���޹޾� ���� ��ü ����
		User user = new User(name,new Date(),1000);
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
	public String viewUserName() {
		return ud.getUser().getuName();
	}
	public String viewUserTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("hh�� mm��");
		
		long diff = ud.getUser().getuDate().getTime() - new Date().getTime();
		
		
		String time = sdf.format(diff);
		return time;
		
	}
	public String viewCreateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E���� hh�� mm��");
		String time = sdf.format(ud.getUser().getuDate());
		return time;
	}
}
