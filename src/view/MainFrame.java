package view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	public MainFrame() {
		this.setTitle("���ϸ���EE");
		this.setBounds(200,100,1024,768);
		
		new Map(this);
		this.setVisible(true);
		this.setResizable(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	

}
