package practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import practice.PaintJava.Figura;
import practice.PaintJava.Pincel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Keyboard extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PaintPanel panel;
	private Player player,shadow;
	private Player goal;
	private Timer timer2,timer;
	private JLabel lblNewLabel;
	private int lastpress;
	private ArrayList<Player> obstaculos = new ArrayList<Player>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Keyboard frame = new Keyboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Keyboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//setBounds(0, 0, 800, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		player = new Player(40,35,15,15,Color.ORANGE);
		shadow = new Player(40,35,15,15,Color.ORANGE);
		goal= new Player(965,690,20,20,Color.GREEN);

		obstaculos.add(new Player(20,20, 5,690,Color.RED));
		obstaculos.add(new Player(20,20,970, 5,Color.BLUE));//Bordes de todo el cuadro
		obstaculos.add(new Player(20,710,945, 5,Color.BLUE));//Bordes de todo el cuadro
		
		obstaculos.add(new Player(20,60,120, 5,Color.BLUE)); //paredes internas horizontal
		obstaculos.add(new Player(170,20, 5, 125,Color.RED));//pared vertical 
		obstaculos.add(new Player(100,60,5, 50,Color.RED)); 
		obstaculos.add(new Player(50,105, 50, 5,Color.RED));
		obstaculos.add(new Player(105,140,65, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(105,145, 5, 60,Color.RED)); //vertical 
		obstaculos.add(new Player(60,200,115, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(60,200, 5, 75,Color.RED)); //vertical 
		obstaculos.add(new Player(60,270,150, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(100,200, 5, 50,Color.RED)); //vertical 
		obstaculos.add(new Player(135,230, 5, 100,Color.RED)); //vertical 
		obstaculos.add(new Player(20,300,80, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(100,300, 5, 50,Color.RED)); //vertical 
		obstaculos.add(new Player(100,350,70, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(170,305, 5, 50,Color.RED)); //vertical 
		obstaculos.add(new Player(205,270, 5, 110,Color.RED)); //vertical 
		obstaculos.add(new Player(60,375,500, 5,Color.RED)); //horizontal 500
		obstaculos.add(new Player(60,330, 5, 50,Color.RED)); //vertical 
		obstaculos.add(new Player(20,400,190, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(210,400, 5, 50,Color.RED)); //vertical 
		obstaculos.add(new Player(135,400, 5, 50,Color.RED)); //vertical 
		obstaculos.add(new Player(172,430, 5, 50,Color.RED)); //vertical 
		obstaculos.add(new Player(100,480,240, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(100,450, 5, 125,Color.RED)); //vertical 
		obstaculos.add(new Player(60,575,45, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(60,575, 5, 80,Color.RED)); //vertical 
		obstaculos.add(new Player(20,680,370, 5,Color.RED)); //horizontal esquina izquierda
		obstaculos.add(new Player(100,660, 5,20,Color.RED)); //vertical 
		obstaculos.add(new Player(150,635, 5,25,Color.RED)); //vertical 
		obstaculos.add(new Player(150,660,280, 5,Color.RED)); //horizontal


		
		obstaculos.add(new Player(205,60, 5, 170,Color.RED)); //vertical 
		obstaculos.add(new Player(205,105, 50, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(170,230,165, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(250,110, 5,60,Color.RED)); //vertical 
		obstaculos.add(new Player(330,105, 5, 125,Color.RED)); //vertical 
		obstaculos.add(new Player(330,105, 50, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(380,70, 5,40,Color.RED)); //vertical 
		obstaculos.add(new Player(380,70,80, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(460,20, 5,55,Color.RED)); //vertical 
		obstaculos.add(new Player(290,20, 5,55,Color.RED)); //vertical 
		obstaculos.add(new Player(290,70,50, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(270,230, 5, 70,Color.RED)); //vertical 
		obstaculos.add(new Player(270,300,50, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(320,300, 5,40,Color.RED)); //vertical 
		obstaculos.add(new Player(270,340,55, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(555,340, 5,40,Color.RED)); //vertical 
		obstaculos.add(new Player(370,340,280, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(645,300, 5,40,Color.RED)); //vertical 
		obstaculos.add(new Player(370,230, 5,110,Color.RED)); //vertical 
		obstaculos.add(new Player(330,270,40, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(370,230,100, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(470,190, 5,45,Color.RED)); //vertical 
		obstaculos.add(new Player(470,190,80, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(550,190, 5,45,Color.RED)); //vertical 
		obstaculos.add(new Player(550,235,50, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(600,80, 5,160,Color.RED)); //vertical 
		obstaculos.add(new Player(520,80,180, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(210,450,100, 5,Color.RED)); //horizontal 
		obstaculos.add(new Player(310,400, 5,55,Color.RED)); //vertical 
		obstaculos.add(new Player(310,400,50, 5,Color.RED)); //horizontal 
		obstaculos.add(new Player(360,400, 5,40,Color.RED)); //vertical 
		obstaculos.add(new Player(260,380, 5,50,Color.RED)); //vertical 
		obstaculos.add(new Player(390,380, 5,40,Color.RED)); //vertical
		obstaculos.add(new Player(360,440,60, 5,Color.RED)); //horizontal 
		obstaculos.add(new Player(420,400, 5,45,Color.RED)); //vertical 
		obstaculos.add(new Player(420,400,180, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(600,370, 5,35,Color.RED)); //vertical
		obstaculos.add(new Player(600,370,150, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(700,120, 5,255,Color.RED)); //vertical
		obstaculos.add(new Player(600,270,100, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(600,270, 5,45,Color.RED)); //vertical
		obstaculos.add(new Player(420,310,180, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(420,270, 5,45,Color.RED)); //vertical
		obstaculos.add(new Player(420,270,90, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(510,230, 5,45,Color.RED)); //vertical
		obstaculos.add(new Player(700,120,120, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(770,80, 5,45,Color.RED)); //vertical
		obstaculos.add(new Player(820,120, 5,60,Color.RED)); //vertical
		obstaculos.add(new Player(820,180,100, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(920,180, 5,80,Color.RED)); //vertical
		obstaculos.add(new Player(770,260,155, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(770,260, 5,60,Color.RED)); //vertical
		obstaculos.add(new Player(770,320,100, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(870,320, 5,50,Color.RED)); //vertical
		obstaculos.add(new Player(800,370,75, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(800,370, 5,50,Color.RED)); //vertical
		obstaculos.add(new Player(730,420,180, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(640,395,120, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(640,395, 5,100,Color.RED)); //vertical
		obstaculos.add(new Player(670,395, 5,40,Color.RED)); //vertical
		obstaculos.add(new Player(520,430,120, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(520,430, 5,40,Color.RED)); //vertical
		obstaculos.add(new Player(425,470,100, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(425,470, 5,50,Color.RED)); //vertical
		obstaculos.add(new Player(425,520,280, 5,Color.RED)); //horizontal
		//obstaculos.add(new Player(525,510, 5,40,Color.RED)); //vertical
		obstaculos.add(new Player(705,520, 5,40,Color.RED)); //vertical
		obstaculos.add(new Player(705,560,60, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(765,560, 5,40,Color.RED)); //vertical
		obstaculos.add(new Player(765,600,180, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(835,560, 5,40,Color.RED)); //vertical
		obstaculos.add(new Player(805,560,35, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(805,500,5,60,Color.RED)); //vertical
		obstaculos.add(new Player(730,500,80, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(730,420,5,85,Color.RED)); //vertical
		obstaculos.add(new Player(680,470,50, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(770,455,75, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(700,220,170, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(760,160,5,60,Color.RED)); //vertical
		obstaculos.add(new Player(700,290,40, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(520,80,5,60,Color.RED)); //vertical
		obstaculos.add(new Player(420,140,140, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(420,140,5,50,Color.RED)); //vertical
		obstaculos.add(new Player(375,190,50, 5,Color.RED)); //horizontal

		obstaculos.add(new Player(525,550,150, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(675,550, 5,40,Color.RED)); //vertical
		obstaculos.add(new Player(590,590,135, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(725,590, 5,40,Color.RED)); //vertical
		obstaculos.add(new Player(725,630,260, 5,Color.RED)); //horizontal pega en limite
		obstaculos.add(new Player(755,630, 5,30,Color.RED)); //vertical
		obstaculos.add(new Player(725,685,220, 5,Color.RED)); //horizontal 
		obstaculos.add(new Player(725,660, 5,30,Color.RED)); //vertical
		obstaculos.add(new Player(625,670,100, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(625,670, 5,40,Color.RED)); //vertical
		obstaculos.add(new Player(590,630, 5,50,Color.RED)); //vertical
		obstaculos.add(new Player(540,675,50, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(590,645,90, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(675,620, 5,30,Color.RED)); //vertical
		obstaculos.add(new Player(625,590, 5,30,Color.RED)); //vertical
		obstaculos.add(new Player(540,625,55, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(540,580, 5,45,Color.RED)); //vertical
		obstaculos.add(new Player(160,580,380, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(160,580, 5,30,Color.RED)); //vertical
		obstaculos.add(new Player(160,610,40, 5,Color.RED)); //horizontal

		obstaculos.add(new Player(65,630,240, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(305,605, 5,30,Color.RED)); //vertical
		obstaculos.add(new Player(305,605,40, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(345,605, 5,30,Color.RED)); //vertical
		obstaculos.add(new Player(385,580,5,55,Color.RED)); //vertical
		obstaculos.add(new Player(385,635,40, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(425,635,5,50,Color.RED)); //vertical
		obstaculos.add(new Player(480,610,5,100,Color.RED)); //vertical
		obstaculos.add(new Player(430,610,50, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(480,650,70, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(210,485,5,60,Color.RED)); //vertical
		obstaculos.add(new Player(150,545,100, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(100,515,70, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(245,515,40, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(285,515,5,30,Color.RED)); //vertical
		obstaculos.add(new Player(285,545,40, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(325,545,5,35,Color.RED)); //vertical
		obstaculos.add(new Player(335,455,5,60,Color.RED)); //vertical
		//obstaculos.add(new Player(340,480,85, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(335,515,55, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(385,515,5,35,Color.RED)); //vertical
		obstaculos.add(new Player(385,550,140, 5,Color.RED)); //horizontal
		
		
		obstaculos.add(new Player(840,20,5,50,Color.RED)); //vertical arriba
		obstaculos.add(new Player(840,70,85, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(925,120,60, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(985,20,5,675,Color.RED)); //vertical 
		obstaculos.add(new Player(800,295,190, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(945,295,5,200,Color.RED)); //vertical 
		obstaculos.add(new Player(840,395,105, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(840,495,110, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(840,455,5,40,Color.RED)); //vertical 
		obstaculos.add(new Player(905,425,5,40,Color.RED)); //vertical 
		obstaculos.add(new Player(905,495,5,40,Color.RED)); //vertical 
		obstaculos.add(new Player(905,535,40, 5,Color.RED)); //horizontal
		obstaculos.add(new Player(580,460,5,35,Color.RED)); //vertical 
		obstaculos.add(new Player(580,490,60, 5,Color.RED)); //horizontal
	
		panel = new PaintPanel();
		panel.setBackground(Color.BLACK);
		panel.setFocusable(true);
		panel.addKeyListener(this);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("0:0");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciar();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		ActionListener taskPerformer= new ActionListener(){
			 
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] partes = lblNewLabel.getText().split(":");
		        int segundos = Integer.parseInt(partes[0]);
		        int mil = Integer.parseInt(partes[1]);

		        mil++;

		        if (mil >= 10) {
		        	mil = 0;
		        	segundos++;
		        }

		        lblNewLabel.setText(segundos + ":" + mil);				
			}
		};
			timer= new Timer(100,taskPerformer);
		
		ActionListener movimiento= new ActionListener(){
			 
			@Override
			public void actionPerformed(ActionEvent e) {
				update();
			}
		};
			timer2= new Timer(10,movimiento);
			
		
	}
	public void reiniciar() {
		player.x=40;
		player.y=35;
		shadow.x=40;
		shadow.y=35;
		
		timer.stop();
		lblNewLabel.setText("0:0");
		timer2.stop();
		panel.repaint();
		panel.requestFocus();
	}

	class PaintPanel extends JPanel{
 		
 		public PaintPanel()
 		{
 			this.setBackground(Color.white);
 		}
 		
 		@Override
 	   public void paintComponent(Graphics g) {
 	       super.paintComponent(g);
 	       
 	       Graphics2D g2 = (Graphics2D) g; 	
		  g2.setColor(player.c);
		  g2.fillArc(player.x,player.y, player.w, player.h,30,300);
		  
		  g2.setColor(Color.ORANGE);
		  g2.fillRect(goal.x,goal.y, goal.w, goal.h);
		  
		  for (Player pared : obstaculos) {
			  g2.setColor(Color.BLUE);
			  g2.fillRect(pared.x,pared.y, pared.w, pared.h);
		}


 	   }
 		
 	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	    timer.start();
		
		timer2.start();
		lastpress=e.getKeyCode();
		update();
	}
	
	public void update() {
		Boolean m=true;
		for (Player pared : obstaculos) {
			if(player.colision(pared)) {
				m=false;
			}
		}
		if(player.colision(goal)) {
			JOptionPane.showMessageDialog(null,"GANASTE" );
			reiniciar();
		}
		if(m) {
			shadow.x=player.x;
			shadow.y=player.y;
		}
		if(lastpress==87) {
			
			if(m) {
				player.y-=10;
				if (player.y<0)
					player.y=panel.getHeight();
			}else {
				player.y=shadow.y;
				player.x=shadow.x;
			}

		}
		if(lastpress==83) {
			
			if(m) {
				player.y+=10;
				if (player.y>panel.getHeight())
					player.y=0;
			}else {
				player.y=shadow.y;
				player.x=shadow.x;
			}
		
		}
		if(lastpress==65) {
			if(m) {
				player.x-=10;
				if (player.x<0)
					player.x=panel.getWidth();
			}else {
				player.y=shadow.y;
				player.x=shadow.x;
			}
			
		}
		if(lastpress==68) {
			if(m) {
				player.x+=10;
				if (player.x>panel.getWidth())
					player.x=0;
			}else {
				player.y=shadow.y;
				player.x=shadow.x;
			}
		}
		
		  panel.repaint();
	}

	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	class Player{
		int x=0,y=0,w=0,h=0;
		Color c=Color.orange;
		public Player(int x, int y, int w, int h, Color c) {
			this.x=x;
			this.y=y;
			this.w=w;
			this.h=h;					
			
		}
		
		public Boolean colision(Player target){
			return (this.x < target.x + target.w && 
					this.x + this.w > target.x &&
	                this.y < target.y + target.h &&
	                this.y + this.h > target.y);
		}
	}
	
}
