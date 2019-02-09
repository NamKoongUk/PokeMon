package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NewPage extends JPanel implements KeyListener {
	
	private MainFrame mf;
	private JPanel op;
	private JPanel np;
	private JButton button;
	
	Graphics g;
	Image mg = new ImageIcon("images/UserMenuPage.png").getImage();
	
	public NewPage(MainFrame mf, JPanel op) {
		
		this.mf = mf;
		this.op = op;
		this.np = this;
		
		System.out.println("뉴페이지 실행...");
		
		this.setBackground(Color.blue);
		this.setLayout(null);
		this.setBounds(0,0,1024,768);
		this.setVisible(true);
		
		mf.addKeyListener(this);
		
		button = new JButton("뒤로");
		button.setBounds(940, 675, 65, 50);
		this.add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					System.out.println("백스페이스 누름 = 맵으로 돌아가기");
					
					mf.remove(np);
					op.setVisible(true);
					mf.requestFocus();
					
					((Map) op).start();
				}
			}
		});
		
		JButton button2 = new JButton("색");
		button2.setBounds(500, 500, 65, 50);
		this.add(button2);
		
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button2) {
					System.out.println("배경색 red로 바뀜");
					np.setBackground(Color.red);
					mf.requestFocus();
				}
			}
			
		});
		
	}
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyPressed(KeyEvent e) {
		
		System.out.println(e.getKeyCode());
		
		if(e.getKeyCode() == 8) {
			System.out.println("백스페이스 누름 = 맵으로 돌아가기");
			mf.remove(np);
			op.setVisible(true);
			((Map) op).start();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {}
}
