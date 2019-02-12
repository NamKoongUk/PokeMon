package model.vo;

import java.awt.Image;

public class recovery extends Item {
	
	private int rType;	//ȸ���� ���� -> 0 : �� / 1 : �� / 2 : ��
	private int amount;	//ȸ����
	
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
