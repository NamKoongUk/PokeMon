package controller;

import model.dao.ItemDao;

//����
//ü��ȸ��
public class MCManager {
	//����
	//���ż���üũ->�����ݾ�üũ->���Ű��ɿ��� üũ
	String resultNo = "";
	
	public void useMarket(String itemName, int itemAmount) {
		ItemDao id = new ItemDao(); //->MarketView���� �� ��
		//�ּҼ���, �ִ����
		
		UserManager um = new UserManager();
		int check=0;//���� �ϰ� ���� ������ �ѷ��� ����
		
		ItemManager im = new ItemManager();
		for(int i=0 ; i<id.getItemList().size() ; i++) {
			//������ �� ���� ���Ͽ� �����۸���Ʈ�� ���° �ε����� �ִ� �� Ȯ��
			if(id.getItemList().get(i).getiName().equals(itemName)) {
				//���� �ϰ� ���� �������� �� �ݾ�
				check=(id.getItemList().get(i).getiPrice())*itemAmount;
				//�����κ��� �ִ� �����ݾװ� �� ��	
				//�����ݾ�<check : �����ݾ��� ���� ���Ű� �Ұ��� �մϴ� ��� : MarketView���� �ٷ� �����
				if(um.getuGold()<check) {
					//���� �Ұ�
					resultNo="�� ����";
				}else {
					//���� ����
					//�ߺ� �������� ������ ������ �������Ѿ�
					System.out.println("������ : "+itemName+", ���� : "+itemAmount);
					
					
				}
				//�����ݾ�>check : ���� ���� : �����ϴ� �����۰� ������ ���޹޾� ���� �κ��� ����
			}
		}
		
	}
	public String getResultNo() {
		return resultNo;
	}
	public void setResultNo(String resultNo) {
		this.resultNo = resultNo;
	}
	public void useCenter() {
		//ȸ�� �����ֱ�
		
	}

}
