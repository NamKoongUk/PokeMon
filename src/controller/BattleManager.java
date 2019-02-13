package controller;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import model.dao.PokemonDao;
import model.dao.SkillDao;
import model.dao.UserDao;
import model.vo.Pokemon;
import view.PInfoPage;

public class BattleManager {


	private static UserDao ud = new UserDao();
	private static PokemonDao pd = new PokemonDao();
	private static PInfoPage pip;
	private static Pokemon poke;
	private static SkillDao sd;

	public static Pokemon getPoke() {
		return poke;
	}

	public static void setPoke(Pokemon poke) {
		BattleManager.poke = poke;
	}

	//���� ���ϸ� �����ִ� �κ�
	public static void showP(PInfoPage pip) {
		BattleManager.pip = pip;

		JTextArea[] jta = new JTextArea[4];
		JLabel[] jl = new JLabel[4];

		for(int i=0; i<ud.getUp_list().size(); i++) {


			jl[i] = new JLabel();
			jl[i].setIcon(new ImageIcon(ud.getUp_list().get(i).getpImg()));

			jta[i] = new JTextArea();
			jta[i].setText("\t���ϸ� �̸� : "+ ud.getUp_list().get(i).getpName() + "\n"
					+"\t��    �� : " + ud.getUp_list().get(i).getpLevel() + "\n"
					+"\t�� �� �� : " + ud.getUp_list().get(i).getGrade() + "\n"
					+"\t�� �� �� : " + ud.getUp_list().get(i).getpSpeed() + "\n"
					+"\tü    ��  : " +ud.getUp_list().get(i).getpHp() + "\n");
			jta[i].setEditable(false);



		}

		pip.setpInfoText(jta);
		pip.setpInfo(jl);


	}

	//���ϸ� ���� ���
	public static void randomP() {



		int randomIndex = new Random().nextInt(4)+1;
		int randomLevel = new Random().nextInt(10)+1;
		poke = pd.getpList().get(randomIndex);

		//pd.setNum(poke.getpNo());

		//���ϸ� �Ӽ� ����
		poke.setpLevel(randomLevel);
		poke.setExp(randomLevel);
		poke.setpHp(randomLevel);
		poke.setpSpeed(randomLevel);
		poke.setExp(randomLevel);

		
		for(int i =0; i<4; i++) {
			int random = new Random().nextInt(4);
			if(poke.getpType() == 0) {
			}
		}
		

	}

	//��ų Ŭ������ ��
	public static void selectS() {

	}


	//�� ���ϸ��� ����
	public static void atkMP(UserDao user, Pokemon poke) {

	}

	//��� ���ϸ��� ����
	public static void atkEP(UserDao user, Pokemon poke) {

		Pokemon myPoke= user.getUp_list().get(0);

		if(poke.getpSpeed() > myPoke.getpSpeed()) {
			int random = new Random().nextInt(4);
			poke.getpSkill().get(random);



		}



	}


	//���ϸ� ĳġ ���
	public static void catchP() {

		for(int i=0; i<ud.getUi_list().size(); i++) {
			if(ud.getUi_list().get(i).getiType() == 0) {

			}
		}
	}





}