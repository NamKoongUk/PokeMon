package controller;

import java.util.Random;

import javax.swing.JTextArea;

import model.dao.PokemonDao;
import model.dao.UserDao;
import model.vo.Pokemon;
import view.PInfoPage;

public class BattleManager {

	private static UserDao ud = new UserDao();
	private static PokemonDao pd = new PokemonDao();
	private static PInfoPage pip;


	//���� ���ϸ� �����ִ� �κ�
	public static void showP(PInfoPage pip) {
		BattleManager.pip = pip;


		JTextArea[] jta = new JTextArea[4];

		for(int i=0; i<ud.getUp_list().size(); i++) {
			jta[i] = new JTextArea();
			jta[i].setText("\t���ϸ� �̸� : "+ ud.getUp_list().get(i).getpName() + "\n"
					+"\t��    �� : " + ud.getUp_list().get(i).getpLevel() + "\n"
					+"\t�� �� �� : " + ud.getUp_list().get(i).getGrade() + "\n"
					+"\t�� �� �� : " + ud.getUp_list().get(i).getpSpeed() + "\n"
					+"\tü    ��  : " +ud.getUp_list().get(i).getpHp() + "\n");
			jta[i].setEditable(false);
		}

		pip.setpInfoText(jta);


	}

	//���ϸ� ���� ���
	public static void randomP() {


		int randomIndex = new Random().nextInt(4)+1;
		int randomLevel = new Random().nextInt(10)+1;
		Pokemon poke = pd.getpList().get(randomIndex);


		//���ϸ� �Ӽ� ����
		poke.setpLevel(randomLevel);
		poke.setExp(randomLevel);
		poke.setpHp(randomLevel);
		poke.setpSpeed(randomLevel);
		poke.setExp(randomLevel);

		for(int i=0; i<4; i++) {
		}

	}







	//���ϸ� ĳġ ���
	public static void catchP() {

		for(int i=0; i<ud.getUi_list().size(); i++) {
			if(ud.getUi_list().get(i).getiType() == 0) {

			}
		}
	}

	public static void selectS() {

	}



}
