package practice;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
		login.setLayout(null);
		
		this.add(login);
		this.repaint();
		
		
		JLabel etiqueta1 = new JLabel("Inicia sesión");
		etiqueta1.setSize(160,40);
		etiqueta1.setLocation(160,10);
		etiqueta1.setFont(new Font("Arial",Font.BOLD,25));
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		login.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Nombre de usuario ");
		etiqueta2.setSize(180,25);
		etiqueta2.setLocation(30,100);
		etiqueta2.setFont(new Font("Arial",Font.BOLD,15));
		login.add(etiqueta2);
		
		JTextField nombreUsuario = new JTextField();
		nombreUsuario.setBounds(230, 100, 180,25);
		nombreUsuario.setText("Nombre de usuario..." );
		login.add(nombreUsuario);
		
		JLabel contraseña = new JLabel("Contraseña ");
		contraseña.setSize(180,25);
		contraseña.setLocation(30,160);
		contraseña.setFont(new Font("Arial",Font.BOLD,15));
		login.add(contraseña);
		
		JTextField contraseña2 = new JTextField();
		contraseña2.setBounds(230, 160, 180,25);
		contraseña2.setText("Contraseña..." );
		login.add(contraseña2);
		
		JCheckBox checkBox1 = new JCheckBox("Recordar mi contraseña");
        checkBox1.setBounds(30,220,180,25);
        login.add(checkBox1);
		
        JLabel olvideContraseña = new JLabel("¿Olvidaste tu contraseña?");
        olvideContraseña.setBounds(230,220,180,25);
        olvideContraseña.setFont(new Font("Arial",Font.BOLD,12));
		login.add(olvideContraseña);
		
		JButton iniciar = new JButton("Siguiente");
		iniciar.setBounds(230,280,180,25);
		iniciar.setFont(new Font("Arial",Font.BOLD,12));
		login.add(iniciar);
		
		JButton crearCuenta = new JButton("Crear cuenta");
		crearCuenta.setBounds(30,280,180,25);
		crearCuenta.setFont(new Font("Arial",Font.BOLD,12));
		login.add(crearCuenta);
	
		
	}	
}
