package run;

import java.util.Date;

import controller.PlayerManager;
import model.dao.PokemonDao;
import model.vo.Player;
import view.MainFrame;

public class Run {

	public static void main(String[] args) {
		new PokemonDao();
		new MainFrame();
		
	}

}
