package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


class Map extends JPanel implements Runnable, 
KeyListener{

	boolean keyUp = false;
	boolean keyDown = false;
	boolean keyLeft = false;
	boolean keyRight = false; 
	boolean playerMove = false;

	Toolkit tk = Toolkit.getDefaultToolkit();

	Image map = new ImageIcon("images/gym.PNG").getImage();
	Image map1 = new ImageIcon("images/main.PNG").getImage();
	Image img = new ImageIcon("images/img.PNG").getImage();

	//���� �̹��� �̸��� �ٷ� rpg.png�Դϴ�. �̹����� �ҷ��ɴϴ�
	Image buffimg;// ������۸��� �Դϴ�.
	Graphics gc;

	Thread th;

	int x, y; // �ɸ����� ���� ��ǥ�� ���� ����
	int cnt; //���� ������ ī���� �ϱ� ���� ����
	int moveStatus; //�ɸ��Ͱ� ��� �ٶ󺸴��� ������ ���� ����
	int num=0;
	int ctn=0;

	private MainFrame mf;

	public Map(MainFrame mf) {
		this.mf = mf;
		
		this.setBounds(0,0,1024,768);
		init();
		start();
		//JLabel l1 = new JLabel(new ImageIcon(map));
		//this.add(l1);

		/* JPanel panel = new JPanel();
      panel.setBackground(Color.blue);
      this.add(panel);
      this.setComponentZOrder(panel, 1);*/
		Dimension screen = tk.getScreenSize();

		int xpos = (int)(screen.getWidth() / 2 - getWidth() / 2);
		int ypos = (int)(screen.getHeight() / 2 - getHeight() / 2);
		setLocation(xpos, ypos);
		
		mf.add(this);
		
	}




	public void init(){
		x = 100;
		y = 100;

		moveStatus = 2;
		//�ɸ��Ͱ� �����Ҷ� �ٶ󺸴� ������ �Ʒ����Դϴ�.
		// 0 : ����, 1 : ������, 2 : �Ʒ���, 3 : ����

	}

	public void start(){ // �⺻���� ���ó��
		mf.addKeyListener(this);
		th = new Thread(this);
		th.start();
	}

	public void run(){ // ������ �޼ҵ�, ���� ����
		while(true){
			try{
				keyProcess();


				repaint();



				Thread.sleep(20);
				cnt++;

			}catch(Exception e){}
		}
	}

	public void paint(Graphics g){ //������۸��� ����մϴ�.
		buffimg = createImage(1024, 768);
		gc = buffimg.getGraphics();
		update(g);
	}

	public void update(Graphics g){
		//���� ���۸��� �̿��� ���ۿ� �׷������� �����ɴϴ�.
		DrawImg();

		g.drawImage(buffimg, 0, 0, this);
	}
	public void DrawImg(){
		gc.setFont(new Font("Default", Font.BOLD, 20));
		gc.drawString(Integer.toString(cnt), 50, 50);
		gc.drawString(Integer.toString((playerMove)?1:0),200, 50);

		switch(num) {
		case 0 : gc.drawImage(map, 0, 0, 1024, 768, this); break;
		case 1 : gc.drawImage(map1, 0, 0, 1024, 768, this); break;

		}

		//���� �ܼ��� ���ѷ��� ���뿩�ο� �ɸ��� ���� üũ�� ����
		//������ ���鼭 �׽�Ʈ�� �뵵�� ���̴� �ؽ�Ʈ ǥ���Դϴ�.

		MoveImage(img, x, y, 32, 32);
		//�ɸ��͸� �ɾ�� ����� ���� �߰��� ���� �޼ҵ� �Դϴ�.
	}




	public void MoveImage(Image img, int x, int y, int width, 
			int height){
		//�ɸ��� �̹���, �ɸ��� ��ġ, �ɸ��� ũ�⸦ �޽��ϴ�.
		//���� ���� �̿��ؼ� ���� �̹���Ĩ�¿��� �ɸ��͸� �߶�
		//ǥ���ϵ��� ����ϴ� �޼ҵ� �Դϴ�.

		gc.setClip(x  , y, width, height);
		//���� ��ǥ���� �ɸ����� ũ�� ��ŭ �̹����� �߶� �׸��ϴ�.

		if( playerMove ){ // �ɸ����� ������ ���θ� �Ǵ��մϴ�.
			if ( cnt / 10 % 4 == 0 ){ gc.drawImage(img,
					x - ( width * 0 ), y - ( height * moveStatus ), this);

			}else  if(cnt/10%4 == 1){ gc.drawImage(img,
					x - ( width * 1 ), y - ( height * moveStatus ), this);

			}else  if(cnt/10%4 == 2){  gc.drawImage(img,
					x - ( width * 2 ), y - ( height * moveStatus ), this);

			}else  if(cnt/10%4 == 3){ gc.drawImage(img,
					x - ( width * 1 ), y - ( height * moveStatus ), this);
			}
			//�ɸ����� ���⿡ ���� �ɾ�� ����� ���ϴ� 
			//�ɸ��� �̹����� �ð����� �̿��� ���������� �׸��ϴ�.

		}else { gc.drawImage(img, x - ( width * 1 ), 
				y - ( height * moveStatus ), this);
		//�ɸ��Ͱ� �������� ������ ������ �ɸ��͸� �׸��ϴ�.

		}
	}

	public void keyProcess(){
		//���⼭�� �ܼ� �ɸ��Ͱ� �̵��ϴ� ��ǥ ����
		//�ɸ����� ������ ���ι� ������ üũ �մϴ�.
		playerMove = false;

		if ( keyUp && keyDown == false){
			playerMove = true;
			y -= 8;
			moveStatus = 3;
		}

		if ( keyDown){
			y += 8;
			moveStatus = 0;
			playerMove = true;
		}

		if ( keyLeft && keyDown == false && keyUp == false){
			x -= 8;
			moveStatus = 1;
			playerMove = true;
		}

		if ( keyRight && x < 780 && keyDown == false && keyUp == false){
			x += 8;
			moveStatus = 2;
			playerMove = true;

		}
	}

	public void keyPressed(KeyEvent e) {

		if(e.getKeyCode() == 27) {
			ChangePanel.changePanel(mf, this, new NewPage(mf));
		}


		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT :
			keyLeft = true;
			break;
		case KeyEvent.VK_RIGHT :
			keyRight = true;
			break;
		case KeyEvent.VK_UP :
			keyUp = true;
			break;
		case KeyEvent.VK_DOWN :
			keyDown = true;
			break;
		}
		if((x >390 && x<460) &&
				(y>685 && y <720)) {
			num =1;
			x= 480;
			y = 160;
		}


		if( num ==1 &&(x >480 && x <510) &&
				(y>120 && y <155)) {

			num =0;
			x = 500;
			y=500;
		}


	}

	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT :
			keyLeft = false;
			break;
		case KeyEvent.VK_RIGHT :
			keyRight = false;
			break;
		case KeyEvent.VK_UP :
			keyUp = false;
			break;
		case KeyEvent.VK_DOWN :
			keyDown = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {}

}