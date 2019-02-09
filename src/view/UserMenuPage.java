package view;


import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class UserMenuPage extends JPanel {
	private JPanel ump;
	private MainFrame mf;
	private Map m;
	private PInfoPage pip;
	private static JPanel oldPage;

	private Image backButtonImage = new ImageIcon("images/back.png").getImage();
	private Image saveButtonImage = new ImageIcon("images/saveButton.PNG").getImage();
	private Image pBookButtonImage = new ImageIcon("images/pBookButton.PNG").getImage();
	private Image pokemonInfoButtonImage = new ImageIcon("images/pokemonInfoButton.PNG").getImage();
	private Image userInfoButtonImage = new ImageIcon("images/userInfoButton.PNG").getImage();
	private Image userInvenButtonImage = new ImageIcon("images/userInvenButton.PNG").getImage();
	private Image saveButtonEnteredImage = new ImageIcon("images/saveButtonEntered.PNG").getImage();
	private Image pBookButtonEnteredImage = new ImageIcon("images/pBookButtonEntered.PNG").getImage();
	private Image pokemonInfoButtonEnteredImage = new ImageIcon("images/pokemonInfoButtonEntered.PNG").getImage();
	private Image userInfoButtonEnteredImage = new ImageIcon("images/userInfoButtonEntered.PNG").getImage();
	private Image userInvenButtonEnteredImage = new ImageIcon("images/userInvenButtonEntered.PNG").getImage();

	private JButton saveButton = new JButton(new ImageIcon(saveButtonImage));
	private JButton pBookButton = new JButton(new ImageIcon(pBookButtonImage));
	private JButton pokemonInfoButton = new JButton(new ImageIcon(pokemonInfoButtonImage));
	private JButton userInfoButton = new JButton(new ImageIcon(userInfoButtonImage));
	private JButton userInvenButton = new JButton(new ImageIcon(userInvenButtonImage));
	private JButton backButton = new JButton(new ImageIcon(backButtonImage));

	private JButton saveButtonEntered = new JButton(new ImageIcon(saveButtonEnteredImage));
	private JButton pBookButtonEntered = new JButton(new ImageIcon(pBookButtonEnteredImage));
	private JButton pokemonInfoButtonEntered = new JButton(new ImageIcon(pokemonInfoButtonEnteredImage));
	private JButton userInfoButtonEntered = new JButton(new ImageIcon(userInfoButtonEnteredImage));
	private JButton userInvenButtonEntered = new JButton(new ImageIcon(userInvenButtonEnteredImage));



	public UserMenuPage(MainFrame mf, JPanel panel) {
		this.ump = this;
		this.mf = mf;
		this.m = (Map) panel;
		this.pip = new PInfoPage(mf, this);
		
		settingButton(saveButton);

		saveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				saveButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				saveButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//ChangePanel.changePanel(mf, ump, new SavePage(mf));			
			}
		});

		this.add(saveButton);

		settingButton(pBookButton);
		pBookButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pBookButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pBookButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//ChangePanel.changePanel(mf, ump, new PBookPage(mf));
			}
		});
		this.add(pBookButton);

		settingButton(pokemonInfoButton);
		pokemonInfoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pokemonInfoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pokemonInfoButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				ump.setVisible(false);
				pip.setVisible(true);
				mf.add(pip);
				//ChangePanel.changePanel(mf, ump, new PInfoPage(mf));
			}
		});
		this.add(pokemonInfoButton);

		settingButton(userInfoButton);
		userInfoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				userInfoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				userInfoButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
				//ChangePanel.changePanel(mf, ump, new UserInfoPage(mf));
			}
		});
		this.add(userInfoButton);

		settingButton(userInvenButton);

		userInvenButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				userInvenButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				userInvenButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
				//ChangePanel.changePanel(mf, ump, new UserInvenPage(mf));
			}
		});
		this.add(userInvenButton);

		backButton.setBounds(920, 700, 70, 50);
		settingButton(backButton);
		backButton.setBorderPainted(false);
		backButton.setFocusPainted(false);
		backButton.setContentAreaFilled(false);
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				backButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				mf.remove(ump);
				m.setVisible(true);
				mf.requestFocus();
				((Map) m).start();
				//ChangePanel.changePanel(mf, userMenu, oldPage);
			}
		});
		
		this.add(backButton);

	}
	/*public UserMenuPage(MainFrame mf,JPanel oldPage) {
		//this(mf);
		this.oldPage = oldPage;
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				backButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//ChangePanel.changePanel(mf, userMenu, oldPage);
			}
		});

		mf.add(this);
		mf.setVisible(true);
	}*/
	public void settingButton(JButton jb) {
		jb.setBorderPainted(false);
		jb.setFocusPainted(false);
		jb.setContentAreaFilled(false);
	}




}
