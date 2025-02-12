package practice;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame{
	
	public Ventana(String title) {
		this.setTitle(title);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		
		etiqueta1.setSize(100,100);
		etiqueta1.setLocation(10,50);
		etiqueta1.setBackground(Color.ORANGE);
		this.add(etiqueta1);
		
		
		
	
		
	}	
}
