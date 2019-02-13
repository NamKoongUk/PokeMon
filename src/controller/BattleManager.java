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


	//현재 포켓몬 보여주는 부분
	public static void showP(PInfoPage pip) {
		BattleManager.pip = pip;

		JTextArea[] jta = new JTextArea[4];

		for(int i=0; i<ud.getUp_list().size(); i++) {
			jta[i] = new JTextArea();
			jta[i].setText("\t포켓몬 이름 : "+ ud.getUp_list().get(i).getpName() + "\n"
					+"\t레    벨 : " + ud.getUp_list().get(i).getpLevel() + "\n"
					+"\t공 격 력 : " + ud.getUp_list().get(i).getGrade() + "\n"
					+"\t스 피 드 : " + ud.getUp_list().get(i).getpSpeed() + "\n"
					+"\t체    력  : " +ud.getUp_list().get(i).getpHp() + "\n");
			jta[i].setEditable(false);
		}

		pip.setpInfoText(jta);


	}

	//포켓몬 생성 기능
	public static void randomP() {


		int randomIndex = new Random().nextInt(4)+1;
		int randomLevel = new Random().nextInt(10)+1;
		Pokemon poke = pd.getpList().get(randomIndex);


		//포켓몬 속성 정의
		poke.setpLevel(randomLevel);
		poke.setExp(randomLevel);
		poke.setpHp(randomLevel);
		poke.setpSpeed(randomLevel);
		poke.setExp(randomLevel);

		for(int i=0; i<4; i++) {
		}

	}







	//포켓몬 캐치 기능
	public static void catchP() {

		for(int i=0; i<ud.getUi_list().size(); i++) {
			if(ud.getUi_list().get(i).getiType() == 0) {

			}
		}
	}

	public static void selectS() {

	}



}