package practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import practice.PaintJava.Figura;
import practice.PaintJava.Pincel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import javax.swing.JLabel;
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
	private Player player;
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
		setBounds(100, 100, 1067, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		player = new Player(200,200,25,25,Color.ORANGE);
		
		obstaculos.add(new Player(150,350, 220, 30,Color.RED));
		obstaculos.add(new Player(150,50, 220, 30,Color.RED));

		
		panel = new PaintPanel();
		panel.setBackground(new Color(124, 195, 235));
		panel.setFocusable(true);
		panel.addKeyListener(this);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("00:00");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.x=200;
				player.y=200;
				panel.repaint();
				panel.requestFocus();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
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
		  /*ImageIcon img = new ImageIcon("C:\\Users\\SEARS\\git\\PracticasJava\\Unidad2\\src\\practice\\astronave.png");
		  Image imagen=img.getImage();	
		  g2.drawImage(imagen, player.x, player.y, player.w,player.h,null);*/	
		  g2.setColor(player.c);
		  g2.fillRect(player.x,player.y, player.w, player.h);
		  
		  
		  for (Player pared : obstaculos) {
			  g2.setColor(Color.red);
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
		System.out.println(e.getKeyCode());
		Boolean m=true;
		for (Player pared : obstaculos) {
			if(player.colision(pared))
				m=false;
		}
		
		if(e.getKeyCode()==87) {
			
			if(m) {
				player.y-=10;
				if (player.y<0)
					player.y=panel.getHeight();
			}else {
				player.y+=10;
			}

		}
		if(e.getKeyCode()==83) {
			
			if(m) {
				player.y+=10;
				if (player.y>panel.getHeight())
					player.y=0;
			}else {
				player.y-=10;
			}
		
		}
		if(e.getKeyCode()==65) {
			if(m) {
				player.x-=10;
				if (player.x<0)
					player.x=panel.getWidth();
			}else {
				player.x+=10;
			}
			
		}
		if(e.getKeyCode()==68) {
			if(m) {
				player.x+=10;
				if (player.x>panel.getWidth())
					player.x=0;
			}else {
				player.x-=10;
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
