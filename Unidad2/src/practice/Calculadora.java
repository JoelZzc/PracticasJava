package practice;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora extends JFrame {
	
	public Calculadora (String title) {
		this.setTitle(title);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.add(this.panelCalculadora());
		this.repaint();
	}
	
	public JPanel panelCalculadora() {
		
		JPanel panel_calculadora = new JPanel();
		panel_calculadora.setVisible(true);
		panel_calculadora.setLocation(0,0);
		panel_calculadora.setSize(500,500);
		panel_calculadora.setOpaque(true);
		panel_calculadora.setLayout(null);
		panel_calculadora.setBackground(Color.BLACK);
		
		JLabel digitos = new JLabel("123+32+22");
		digitos.setBounds(10,10,460,50);
		digitos.setFont(new Font("Arial",Font.BOLD,25));
		digitos.setHorizontalAlignment(JLabel.CENTER);
		digitos.setOpaque(true);
		panel_calculadora.add(digitos);
		
		JButton ce = new JButton("CE");
		ce.setBounds(10,70,100,70);
		ce.setBackground(Color.GRAY);
		ce.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(ce);
		
		JButton boton = new JButton();
		boton.setBounds(130,70,340,70);
		boton.setBackground(Color.GRAY);
		boton.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(boton);
		
		JButton siete = new JButton("7");
		siete.setBounds(10,150,100,70);
		siete.setBackground(Color.GRAY);
		siete.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(siete);
		
		JButton ocho = new JButton("8");
		ocho.setBounds(130,150,100,70);
		ocho.setBackground(Color.GRAY);
		ocho.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.setBounds(250,150,100,70);
		nueve.setBackground(Color.GRAY);
		nueve.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(nueve);
		
		JButton division = new JButton("/");
		division.setBounds(370,150,100,70);
		division.setBackground(Color.orange);
		division.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(division);
		
		JButton cuatro = new JButton("4");
		cuatro.setBounds(10,230,100,70);
		cuatro.setBackground(Color.GRAY);
		cuatro.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(cuatro);
		
		JButton cinco = new JButton("5");
		cinco.setBounds(130,230,100,70);
		cinco.setBackground(Color.GRAY);
		cinco.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(cinco);
		
		JButton seis = new JButton("6");
		seis.setBounds(250,230,100,70);
		seis.setBackground(Color.GRAY);
		seis.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(seis);
		
		JButton multiplicacion = new JButton("*");
		multiplicacion.setBounds(370,230,100,70);
		multiplicacion.setBackground(Color.orange);
		multiplicacion.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(multiplicacion);
		
		JButton uno = new JButton("1");
		uno.setBounds(10,310,100,70);
		uno.setBackground(Color.GRAY);
		uno.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(uno);
		
		JButton dos = new JButton("2");
		dos.setBounds(130,310,100,70);
		dos.setBackground(Color.GRAY);
		dos.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(dos);
		
		JButton tres = new JButton("3");
		tres.setBounds(250,310,100,70);
		tres.setBackground(Color.GRAY);
		tres.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(tres);
		
		JButton resta = new JButton("-");
		resta.setBounds(370,310,100,70);
		resta.setBackground(Color.orange);
		resta.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(resta);
		
		JButton cero = new JButton("0");
		cero.setBounds(10,390,100,70);
		cero.setBackground(Color.GRAY);
		cero.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(cero);
		
		JButton punto = new JButton(".");
		punto.setBounds(130,390,100,70);
		punto.setBackground(Color.GRAY);
		punto.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(punto);
		
		JButton igual = new JButton("=");
		igual.setBounds(250,390,100,70);
		igual.setBackground(Color.orange);
		igual.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(igual);
		
		JButton suma = new JButton("+");
		suma.setBounds(370,390,100,70);
		suma.setBackground(Color.orange);
		suma.setFont(new Font("Arial",Font.BOLD,20));
		panel_calculadora.add(suma);
		
		
		return panel_calculadora;
	}

}
