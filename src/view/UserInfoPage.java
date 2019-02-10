package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.PlayerManager;

public class UserInfoPage extends JPanel implements KeyListener{
	private MainFrame mf;
	private PlayerManager pm;
	private JPanel uip;
	private UserMenuPage ump;
	
	private JLabel charactorLabel = new JLabel(new ImageIcon("images/userMenuImages/charactorImage.PNG"));
	private JLabel badgeLable = new JLabel(new ImageIcon("images/userMenuImages/badge.PNG"));
	private JLabel playTimeLabel = new JLabel(new ImageIcon("images/userMenuImages/playTime.PNG"));
	private JLabel goldLabel = new JLabel(new ImageIcon("images/userMenuImages/gold.PNG"));
	private JLabel getPokeLabel = new JLabel(new ImageIcon("images/userMenuImages/getPoke.PNG"));
	private JLabel userNameLabel;
	private JButton backButton = new JButton(new ImageIcon("images/userMenuImages/backButtonBasic.PNG"));
	
	public UserInfoPage(MainFrame mf,UserMenuPage ump,PlayerManager pm) {
		this.pm = pm;
		this.mf = mf;
		this.uip = this;
		this.ump = ump;
		uip.setOpaque(false);
		uip.setBounds(0, 0, 1024, 768);
		
		userNameLabel = new JLabel();
		
		
		mf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == UserMenuPage.ESC) {
					mf.remove(uip);
					uip.setVisible(false);
				}
			}
		});
		JLabel label = new JLabel();
		label.setText("유저 정보 페이지");

		this.setLayout(null);
		this.setBackground(Color.WHITE);
		this.addKeyListener(this);
		backButton.setBounds(900, 610, 90, 120);
		backButton.setBorderPainted(false);
		backButton.setFocusPainted(false);
		backButton.setContentAreaFilled(false);
		//뒤로가기 버튼
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				backButton.setIcon(new ImageIcon("images/userMenuImages/backButtonEntered.PNG"));
				backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				backButton.setIcon(new ImageIcon("images/userMenuImages/backButtonBasic.PNG"));
				backButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				mf.remove(uip);
				ump.setVisible(true);
				mf.requestFocus();
			}
		});
		
		label.setBounds(450, 20, 200, 40);
		
		charactorLabel.setBounds(180, 70, 300, 200);
		userNameLabel.setBounds(180, 280, 300, 90);
		badgeLable.setBounds(520, 70, 300, 300);
		playTimeLabel.setBounds(180, 390, 300, 300);
		goldLabel.setBounds(520, 390, 300, 140);
		getPokeLabel.setBounds(520, 550, 300, 140);
		
		
		this.add(label);
		this.add(backButton);
		this.add(charactorLabel);
		this.add(userNameLabel);
		this.add(badgeLable);
		this.add(playTimeLabel);
		this.add(goldLabel);
		this.add(getPokeLabel);
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
