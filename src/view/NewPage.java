package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class NewPage extends JPanel implements KeyListener{
private MainFrame mf;
	public NewPage(MainFrame mf) {
		this.mf = mf;
		this.setBounds(0,0,1024,768);
		this.setBackground(Color.black);
		
		mf.addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() ==27) {
			ChangePanel.changePanel(mf, this, new Map(mf));
			this.setVisible(false);
			
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
