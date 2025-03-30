package practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaintJava extends JFrame implements MouseListener, MouseMotionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PaintPanel panel_2;
	private ArrayList<Point> puntos = new ArrayList<Point>();
	public int grosor;
	public String color="#000000";
 	List<Pincel> listaDePuntos = new ArrayList<>(); 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaintJava frame = new PaintJava();
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
	public PaintJava() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 608);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_2 = new PaintPanel();
		panel_2.setBounds(343, 27, 671, 521);
		panel_2.addMouseListener(this);
 		panel_2.addMouseMotionListener(this);
		contentPane.add(panel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(40, 27, 263, 521);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Shapes");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(42, 21, 74, 22);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Rectangle");
		btnNewButton.setIcon(new ImageIcon(PaintJava.class.getResource("/practice/rectangulo.png")));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(42, 53, 113, 27);
		panel.add(btnNewButton);
		
		JButton btnCircle = new JButton("Circle  ");
		btnCircle.setIcon(new ImageIcon(PaintJava.class.getResource("/practice/registro.png")));
		btnCircle.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCircle.setBounds(42, 92, 113, 27);
		panel.add(btnCircle);
		
		JButton btnNewButton_1_1 = new JButton("  Triangle");
		btnNewButton_1_1.setIcon(new ImageIcon(PaintJava.class.getResource("/practice/triangulo.png")));
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(42, 129, 113, 27);
		panel.add(btnNewButton_1_1);
		
		JLabel lblOptions = new JLabel("Options");
		lblOptions.setFont(new Font("Arial", Font.PLAIN, 18));
		lblOptions.setBounds(42, 180, 74, 22);
		panel.add(lblOptions);
		
		JButton btnBrush = new JButton("Brush");
		btnBrush.setIcon(new ImageIcon(PaintJava.class.getResource("/practice/pincel-de-arte.png")));
		btnBrush.setFont(new Font("Arial", Font.PLAIN, 12));
		btnBrush.setBounds(42, 212, 113, 27);
		panel.add(btnBrush);
		
		JButton btnEraser = new JButton("Eraser");
		btnEraser.setIcon(new ImageIcon(PaintJava.class.getResource("/practice/herramienta-de-borrador.png")));
		btnEraser.setFont(new Font("Arial", Font.PLAIN, 12));
		btnEraser.setBounds(42, 249, 113, 27);
		panel.add(btnEraser);
		
		JButton btnFillColor = new JButton("Fill color");
		btnFillColor.setIcon(new ImageIcon(PaintJava.class.getResource("/practice/rectangulo.png")));
		btnFillColor.setFont(new Font("Arial", Font.PLAIN, 12));
		btnFillColor.setBounds(42, 286, 113, 27);
		panel.add(btnFillColor);
		
		JSlider slider = new JSlider(0,50,5);
		slider.setBounds(24, 323, 200, 26);
		slider.addChangeListener(new ChangeListener() {
		      public void stateChanged(ChangeEvent e) {
		        JSlider source = (JSlider) e.getSource();
		        grosor = source.getValue();
		      }
		    });
		panel.add(slider);
		
		JLabel lblColors = new JLabel("Colors");
		lblColors.setFont(new Font("Arial", Font.PLAIN, 18));
		lblColors.setBounds(42, 359, 74, 22);
		panel.add(lblColors);
		
		JButton btnCircle_1 = new JButton("");
		btnCircle_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color="#fefefe";
			}
		});
		btnCircle_1.setBackground(new Color(255, 255, 255));
		btnCircle_1.setIcon(null);
		btnCircle_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCircle_1.setBounds(24, 391, 28, 27);
		panel.add(btnCircle_1);
		
		JButton btnCircle_1_1 = new JButton("");
		btnCircle_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color="#2e88f4";
			}
		});
		btnCircle_1_1.setBackground(new Color(0, 128, 255));
		btnCircle_1_1.setIcon(null);
		btnCircle_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCircle_1_1.setBounds(62, 391, 28, 27);
		panel.add(btnCircle_1_1);
		
		JButton btnCircle_1_2 = new JButton("");
		btnCircle_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color="#000000";
			}
		});
		btnCircle_1_2.setBackground(new Color(0, 0, 0));
		btnCircle_1_2.setIcon(null);
		btnCircle_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCircle_1_2.setBounds(100, 391, 28, 27);
		panel.add(btnCircle_1_2);
		
		JButton btnCircle_1_3 = new JButton("");
		btnCircle_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color="#a8abaf";
			}
		});
		btnCircle_1_3.setBackground(new Color(128, 128, 128));
		btnCircle_1_3.setIcon(null);
		btnCircle_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCircle_1_3.setBounds(138, 391, 28, 27);
		panel.add(btnCircle_1_3);
		
		JButton btnCircle_1_4 = new JButton("");
		btnCircle_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color="#f10c16";
			}
		});
		btnCircle_1_4.setBackground(new Color(255, 0, 0));
		btnCircle_1_4.setIcon(null);
		btnCircle_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCircle_1_4.setBounds(176, 391, 28, 27);
		panel.add(btnCircle_1_4);
		
		JButton btnCircle_1_5 = new JButton("");
		btnCircle_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color="#40f10c";
			}
		});
		btnCircle_1_5.setBackground(new Color(0, 255, 64));
		btnCircle_1_5.setIcon(null);
		btnCircle_1_5.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCircle_1_5.setBounds(214, 391, 28, 27);
		panel.add(btnCircle_1_5);
		
		JButton btnNewButton_1 = new JButton("Clear canvas");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton_1.setBounds(42, 443, 187, 27);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Save as image");
		btnNewButton_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton_1_2.setBounds(42, 484, 187, 27);
		panel.add(btnNewButton_1_2);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		//Crea una copia de los puntos 
		ArrayList ArrList2  = (ArrayList)puntos.clone();
 		
 		//se guarda en el historial de dibujos
 		listaDePuntos.add(new Pincel(ArrList2,grosor,color));
	
 		//limpiamos el trazo actual
 		puntos.clear();		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
		panel_2.repaint();
 		
 		puntos.add(e.getPoint());
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	class Pincel{
		List<Point>puntos;
		int grosor;
		String color;
		
		public Pincel(List<Point>puntos, int grosor, String color) {
			this.puntos=puntos;
			this.grosor=grosor;
			this.color=color;
		}
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
 	       g2.setColor(Color.decode(color)); 
 	       g2.setStroke(new BasicStroke(grosor)); 
 		   
 	       //dibujar la trayectoria de puntos 
 	       //solo cuando tengo más de 2 puntos
 	       if(puntos.size()>1) {
 	    	   
 	    	   for (int i = 1; i < puntos.size(); i++) {
 	    		   
 	    		   Point p1 = puntos.get(i-1);
 	    		   Point p2 = puntos.get(i);
 	    		   
 	    		   g2.drawLine(p1.x,p1.y,p2.x,p2.y);
 	    	   }
 	    	   
 	       }
 	       
 	       for (Pincel pincel : listaDePuntos) {
 	    	   List<Point> trazo = pincel.puntos;
 	    	   int grosor= pincel.grosor; 
 	    	   String color=pincel.color;
 	    	   g2.setStroke(new BasicStroke(grosor));
 	    	   g2.setColor(Color.decode(color));
 				if(trazo.size()>1) {
 		    	   
 		    	   for (int i = 1; i < trazo.size(); i++) {
 		    		   
 		    		   Point p1 = trazo.get(i-1);
 		    		   Point p2 = trazo.get(i);
 		    		   
 		    		   g2.drawLine(p1.x,p1.y,p2.x,p2.y);
 		    	   }
 		    	   
 		       }
 			
 	       }
 	       
 	       
 	       
 	   }
 		
 	}
}
