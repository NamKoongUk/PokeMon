package model.vo;

import java.awt.Image;

public class Item {
	
	private String iName;	//������ �̸�
	private int iNo;		//������ ��ȣ
	private int iPrice;		//������ ����
	private int iType;		//������ Ÿ�� -> 0 : ball(���ͺ�) / 1 : recovery(ȸ����) / 2 : stone(��ȭ�� ��)
	private Image iImg;		//������ �̹���
	
	
	public Item() {}
	
	public Item(String iName, int iNo, int iPrice, int iType, Image iImg) {
		this.iName = iName;
		this.iNo = iNo;
		this.iPrice = iPrice;
		this.iType = iType;
		this.iImg = iImg;
	}


	public String getiName() {
		return iName;
	}


	public int getiNo() {
		return iNo;
	}


	public int getiPrice() {
		return iPrice;
	}


	public int getiType() {
		return iType;
	}


	public Image getiImg() {
		return iImg;
	}


	public void setiName(String iName) {
		this.iName = iName;
	}


	public void setiNo(int iNo) {
		this.iNo = iNo;
	}


	public void setiPrice(int iPrice) {
		this.iPrice = iPrice;
	}


	public void setiType(int iType) {
		this.iType = iType;
	}


	public void setiImg(Image iImg) {
		this.iImg = iImg;
	}
	
	


}