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
			jta[i].setText("\t���ϸ� �̸� : "+ ud.getUp_list().get(i).getpName() + "\n"
					+"\t��    �� : " + ud.getUp_list().get(i).getpLevel() + "\n"
					+"\t�� �� �� : " + ud.getUp_list().get(i).getGrade() + "\n"
					+"\t�� �� �� : " + ud.getUp_list().get(i).getpSpeed() + "\n"
					+"\tü    ��  : " +ud.getUp_list().get(i).getpHp() + "\n");
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
