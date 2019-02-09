package view;

import javax.swing.JPanel;


public class ChangePanel {

	public static void changePanel(MainFrame mf, JPanel op, JPanel np) {
		
		System.out.println("체인지 패널 실행...");
		
		mf.remove(op);
		mf.add(np);
		mf.repaint();
		
	}

	
	
}
