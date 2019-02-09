package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
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
	private Image pInfoImage1 = new ImageIcon("images/pInfo1.png").getImage();
	private Image pInfoImage2 = new ImageIcon("images/pInfo2.png").getImage();
	private Image pInfoImage3 = new ImageIcon("images/pInfo3.png").getImage();
	private Image pInfoImage4 = new ImageIcon("images/pInfo4.png").getImage();
	private Image backButtonImage = new ImageIcon("images/back.png").getImage();

	private JLabel pInfo1 = new JLabel(new ImageIcon(pInfoImage1));
	private JLabel pInfo2 = new JLabel(new ImageIcon(pInfoImage2));
	private JLabel pInfo3 = new JLabel(new ImageIcon(pInfoImage3));
	private JLabel pInfo4 = new JLabel(new ImageIcon(pInfoImage4));
	private JButton backButton = new JButton(new ImageIcon(backButtonImage));

	public PInfoPage(MainFrame mf, UserMenuPage ump) {
		this.mf = mf;
		this.pip = this;
		this.ump = ump;
		pip.setOpaque(false);
		pip.setBounds(0, 0, 1024, 768);
		
		JLabel label = new JLabel();
		label.setText("  ");
		JTextArea p1 = new JTextArea();

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
		p1.setBounds(180, 70, 300, 300);
		pInfo2.setBounds(520, 70, 300, 300);
		pInfo3.setBounds(180, 390, 300, 300);
		pInfo4.setBounds(520, 390, 300, 300);


		pip.add(label);
		pip.add(backButton);
		pip.add(p1);
		pip.add(pInfo2);
		pip.add(pInfo3);
		pip.add(pInfo4);


		//mf.add(pip);
		//mf.setVisible(true);
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
