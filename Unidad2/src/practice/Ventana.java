package practice;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	public Ventana(String title) {
		this.setTitle(title);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		
		JPanel login= new JPanel();
		login.setVisible(true);
		login.setLocation(0,0);
		login.setSize(500,500);
		login.setOpaque(true);
		login.setBackground(Color.blue);
		login.setLayout(null);
		
		this.add(login);
		this.repaint();
		
		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		etiqueta1.setSize(160,40);
		etiqueta1.setLocation(160,10);
		etiqueta1.setBackground(Color.WHITE);
		etiqueta1.setOpaque(true);
		etiqueta1.setFont(new Font("Arial",Font.BOLD,25));
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		login.add(etiqueta1);
		
		
		
	
		
	}	
}
