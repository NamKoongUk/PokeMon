package model.vo;

import java.awt.Image;

public class recovery extends Item {
	
	private int rType;	//회복약 종류 -> 0 : 상 / 1 : 중 / 2 : 하
	private int amount;	//회복량
	
	public recovery() {}
	
	public recovery(String iName, int iNo, int iPrice, int iType, Image iImg, int rType, int amount) {
		super(iName, iNo, iPrice, iType, iImg);
		this.rType = rType;
		this.amount = amount;
	}

	public int getrType() {
		return rType;
	}

	public int getAmount() {
		return amount;
	}

	public void setrType(int rType) {
		this.rType = rType;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
