package controller;

import model.dao.UserDao;
import model.vo.Pokemon;

public class BattleManager {

	private UserDao ud = new UserDao();
	
	
	
	
	
	public void catch_p() {
		
	for(int i=0; i<ud.getUi_list().size(); i++) {
		if(ud.getUi_list().get(i).getiType() == 0) {
			
		}
	}
		
	}
}
