package view;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPage extends JPanel implements KeyListener{

	JPanel panel = new JPanel();
	
	
	
	private MainFrame mf;
	private StartPage sp;
	private Image mainPage = new ImageIcon("images/mainPage.gif").getImage();
	
	
	
	
	public StartPage(MainFrame mf) {
		this.mf = mf;
		
		JLabel mlabel = new JLabel(new ImageIcon(mainPage));
		mlabel.setBounds(0, 0, 1024, 768);
		mf.add(mlabel);
		
		
		
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == 27) {
			System.out.println("esc 누름 = 유저메뉴");

			sp.setVisible(false);
			new Map(mf);
		}
		
		switch(e.getKeyCode()){
		case KeyEvent.VK_ENTER :
			System.out.println("ddd");
			new Map(mf);
			mf.remove(sp);
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
