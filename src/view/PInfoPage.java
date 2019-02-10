package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PInfoPage extends JPanel implements KeyListener{
	private MainFrame mf;
	private Map m;
	private JPanel pip;
	private UserMenuPage ump;

	private JLabel pInfo1 = new JLabel(new ImageIcon("images/userMenuImages/pInfo1.png"));
	private JLabel pInfo2 = new JLabel(new ImageIcon("images/userMenuImages/pInfo2.png"));
	private JLabel pInfo3 = new JLabel(new ImageIcon("images/userMenuImages/pInfo3.png"));
	private JLabel pInfo4 = new JLabel(new ImageIcon("images/userMenuImages/pInfo4.png"));
	private JButton backButton = new JButton(new ImageIcon("images/userMenuImages/backButtonBasic.png"));

	public PInfoPage(MainFrame mf, UserMenuPage ump) {
		this.mf = mf;
		this.pip = this;
		this.ump = ump;
		pip.setOpaque(false);
		pip.setBounds(0, 0, 1024, 768);
		
		mf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == UserMenuPage.ESC) {
					mf.remove(pip);
					pip.setVisible(false);
				}
			}
		});
		
		JLabel label = new JLabel();
		label.setText("  ");

		pip.setBackground(Color.WHITE);
		pip.setLayout(null);
		this.addKeyListener(this);
		backButton.setBounds(920, 640, 70, 50);
		backButton.setBorderPainted(false);
		backButton.setFocusPainted(false);
		backButton.setContentAreaFilled(false);

		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				backButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				mf.remove(pip);
				ump.setVisible(true);
				mf.requestFocus();

			}
		});

		label.setBounds(450, 20, 200, 40);
		pInfo1.setBounds(180, 70, 300, 300);
		pInfo2.setBounds(520, 70, 300, 300);
		pInfo3.setBounds(180, 390, 300, 300);
		pInfo4.setBounds(520, 390, 300, 300);


		pip.add(label);
		pip.add(backButton);
		pip.add(pInfo1);
		pip.add(pInfo2);
		pip.add(pInfo3);
		pip.add(pInfo4);
	}

	@Override
	public void paintComponent(Graphics g) {
		//g.drawImage(backButtonImage, 920, 640, 70, 50,backButton);
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
