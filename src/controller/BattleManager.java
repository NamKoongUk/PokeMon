package controller;

import java.awt.Color;

import javax.swing.JTextArea;

import model.dao.UserDao;
import view.PInfoPage;

public class BattleManager {

	private UserDao ud = new UserDao();
	private PInfoPage pip;


	public void show_p(PInfoPage pip) {
		this.pip = pip;


		JTextArea[] jta = new JTextArea[4];

		for(int i=0; i<ud.getUp_list().size(); i++) {
			jta[i] = new JTextArea();
			jta[i].setBackground(new Color(0,0,0,0));
			jta[i].setText("\t포켓몬 이름 : "+ ud.getUp_list().get(i).getpName() + "\n"
					+"\t레    벨 : " + ud.getUp_list().get(i).getpLevel() + "\n"
					+"\t공 격 력 : " + ud.getUp_list().get(i).getGrade() + "\n"
					+"\t스 피 드 : " + ud.getUp_list().get(i).getpSpeed() + "\n"
					+"\t체    력  : " +ud.getUp_list().get(i).getpHp() + "\n");
		}
		
		pip.setpInfoText(jta);


	}







	public void catch_p() {

		for(int i=0; i<ud.getUi_list().size(); i++) {
			if(ud.getUi_list().get(i).getiType() == 0) {

			}
		}

	}
}
