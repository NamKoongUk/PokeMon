package model.vo;

import java.util.Date;

public class User {
	
	private String uName;
	private Date uDate;
	private int uGold;
	
	public User() {}
	
	public User(String uName, Date uDate, int uGold) {
		this.uName = uName;
		this.uDate = uDate;
		this.uGold = uGold;
	}

	public String getuName() {
		return uName;
	}

	public Date getuDate() {
		return uDate;
	}

	public int getuGold() {
		return uGold;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public void setuDate(Date uDate) {
		this.uDate = uDate;
	}

	public void setuGold(int uGold) {
		this.uGold = uGold;
	}
	
	

}
