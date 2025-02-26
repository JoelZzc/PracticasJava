package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana(String title) {
		this.setTitle(title);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		
		//this.add(this.Registro());
		//this.add(this.login());
		//this.add(this.users());
		this.add(this.calculadoraLayouts());

		this.setMinimumSize(new Dimension(500,500));
		this.setMaximumSize(new Dimension(500,500));
		
		JMenuBar barra= new JMenuBar(); //barra de menus
		
		JMenu menu1 = new JMenu("Archivo");
		JMenuItem op_abrir= new JMenuItem("Abrir");
		JMenuItem op_nuevo= new JMenuItem("Nuevo");
		JMenuItem op_guardar= new JMenuItem("Guardar");
		JMenuItem op_cerrar= new JMenuItem("Cerrar");
		menu1.add(op_abrir);
		menu1.add(op_nuevo);
		menu1.add(op_guardar);
		menu1.add(op_cerrar);
		
		JMenu menu2 = new JMenu("Ayuda");
		JRadioButtonMenuItem op_help= new JRadioButtonMenuItem("Manual de usuario");
		JMenuItem op_soporte= new JMenuItem("Soporte");
		menu2.add(op_help);
		menu2.add(op_soporte);
		
		barra.add(menu1);
		barra.add(menu2);
		
		this.setJMenuBar(barra);
		this.repaint();
		this.revalidate();


	}
	
	public JPanel login () {
		
		JPanel panelFondo= new JPanel();
		panelFondo.setVisible(true);
		panelFondo.setLocation(0,0);
		panelFondo.setSize(1000,1000);
		panelFondo.setBackground(Color.BLACK);
		panelFondo.setOpaque(true);
		panelFondo.setLayout(null);
		
		JPanel panelLogin= new JPanel();
		panelLogin.setVisible(true);
		panelLogin.setLocation(0,0);
		panelLogin.setSize(500,500);
		panelLogin.setBackground(new Color(128,0,128));
		panelLogin.setOpaque(true);
		panelLogin.setLayout(null);
		panelFondo.add(panelLogin);
		
		
		JLabel etiqueta1 = new JLabel("Inicia sesión");
		etiqueta1.setSize(160,40);
		etiqueta1.setLocation(160,10);
		etiqueta1.setFont(new Font("Arial",Font.BOLD,25));
		etiqueta1.setForeground(Color.WHITE);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		panelLogin.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Nombre de usuario ");
		etiqueta2.setSize(180,25);
		etiqueta2.setLocation(90,80);
		etiqueta2.setForeground(Color.WHITE);
		etiqueta2.setFont(new Font("Arial",Font.BOLD,12));
		panelLogin.add(etiqueta2);
		
		JLabel imagenUser = new JLabel(new ImageIcon("name.png"));
		imagenUser.setBounds(30, 100, 30, 30);
		panelLogin.add(imagenUser);
		
		JTextField nombreUsuario = new JTextField();
		nombreUsuario.setBounds(90, 100,300,30);
		nombreUsuario.setText("Nombre de usuario..." );
		panelLogin.add(nombreUsuario);
		
		JLabel contraseña = new JLabel("Contraseña ");
		contraseña.setSize(180,25);
		contraseña.setLocation(90,170);
		contraseña.setForeground(Color.WHITE);
		contraseña.setFont(new Font("Arial",Font.BOLD,12));
		panelLogin.add(contraseña);
		
		JTextField contraseña2 = new JTextField();
		contraseña2.setBounds(90, 190, 300,30);
		contraseña2.setText("Contraseña..." );
		panelLogin.add(contraseña2);
		
		JLabel imagenLock = new JLabel(new ImageIcon("lock2.png"));
		imagenLock.setBounds(30, 190, 35, 60);
		panelLogin.add(imagenLock);
		
		JCheckBox checkBox1 = new JCheckBox("Recordar mi contraseña");
        checkBox1.setBounds(160,250,160,20);
        panelLogin.add(checkBox1);
		
        JLabel olvideContraseña = new JLabel("¿Olvidaste tu contraseña?");
        olvideContraseña.setBounds(160,280,160,20);
        olvideContraseña.setFont(new Font("Arial",Font.BOLD,12));
        olvideContraseña.setForeground(Color.WHITE);
		olvideContraseña.setHorizontalAlignment(JLabel.CENTER);
		
        panelLogin.add(olvideContraseña);
		
		JButton iniciar = new JButton("Siguiente");
		iniciar.setBounds(280,400,180,25);
		iniciar.setFont(new Font("Arial",Font.BOLD,12));
		panelLogin.add(iniciar);
		
		JButton crearCuenta = new JButton("Crear cuenta");
		crearCuenta.setBounds(30,400,180,25);
		crearCuenta.setFont(new Font("Arial",Font.BOLD,12));
		panelLogin.add(crearCuenta);
		
		
		this.repaint();
		
		return panelFondo;
	}	
	
	public JPanel Registro() {
		
		JPanel panelRegistro = new JPanel();
		panelRegistro.setVisible(true);
		panelRegistro.setLocation(0,0);
		panelRegistro.setSize(500,500);
		panelRegistro.setOpaque(true);
		panelRegistro.setLayout(null);
		
		
		JLabel etiqueta1 = new JLabel("Registro");
		etiqueta1.setSize(160,40);
		etiqueta1.setLocation(160,10);
		etiqueta1.setFont(new Font("Arial",Font.BOLD,25));
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		panelRegistro.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Nombre de usuario ");
		etiqueta2.setSize(180,25);
		etiqueta2.setLocation(30,100);
		etiqueta2.setFont(new Font("Arial",Font.BOLD,15));
		panelRegistro.add(etiqueta2);
		
		JTextField nombreUsuario = new JTextField();
		nombreUsuario.setBounds(230, 100, 230,25);
		nombreUsuario.setText("Nombre de usuario..." );
		panelRegistro.add(nombreUsuario);
		
		JLabel bio = new JLabel("BIO ");
		bio.setSize(180,25);
		bio.setLocation(30,160);
		bio.setFont(new Font("Arial",Font.BOLD,15));
		panelRegistro.add(bio);
		
		JTextField bio2 = new JTextField();
		bio2.setBounds(230, 140, 230,50);
		bio2.setText("BIO..." );
		panelRegistro.add(bio2);
		
		JLabel preferencias = new JLabel("Preferencias");
		preferencias.setSize(180,25);
		preferencias.setLocation(30,220);
		preferencias.setFont(new Font("Arial",Font.BOLD,15));
		panelRegistro.add(preferencias);
		
		JCheckBox dulces = new JCheckBox("Dulces");
		dulces.setBounds(30,260,90,25);
        panelRegistro.add(dulces);
        
        JCheckBox salado = new JCheckBox("Salado");
        salado.setBounds(130,260,90,25);
        panelRegistro.add(salado);
        
        JCheckBox saludable = new JCheckBox("Saludable");
        saludable.setBounds(230,260,90,25);
        panelRegistro.add(saludable);
        
        JLabel términos1 = new JLabel("Términos");
        términos1.setBounds(30,300,180,25);
        términos1.setFont(new Font("Arial",Font.BOLD,15));
        panelRegistro.add(términos1);
			
		JButton crearCuenta = new JButton("Crear cuenta");
		crearCuenta.setBounds(150,430,180,25);
		crearCuenta.setFont(new Font("Arial",Font.BOLD,12));
		panelRegistro.add(crearCuenta);
		
		String [] colonias_dataset= {"centro", "Villas del encanto", "pedregal", "Agua escondida","Balandra", "Camino real"};
		JComboBox colonias = new JComboBox(colonias_dataset);
		colonias.setBounds(30, 380, 180, 25);
		panelRegistro.add(colonias);
		
		ButtonGroup terminos= new ButtonGroup();
		
		JRadioButton terms1= new JRadioButton("Acepto los terminos");
		terms1.setBounds(30, 330, 180,40);
		panelRegistro.add(terms1);
		
		JRadioButton terms2= new JRadioButton("No acepto los terminos");
		terms2.setBounds(250, 330, 180,40);
		panelRegistro.add(terms2);
		
		terminos.add(terms1);
		terminos.add(terms2);

				
		return panelRegistro;
	}
	
	public JPanel users() {
		
		JPanel panelTabla = new JPanel();
		panelTabla.setVisible(true);
		panelTabla.setLocation(0,0);
		panelTabla.setSize(1000,500);
		panelTabla.setBackground(Color.CYAN);
		panelTabla.setOpaque(true);
		panelTabla.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Usuarios");
		etiqueta1.setSize(180,40);
		etiqueta1.setLocation(400,10);
		etiqueta1.setFont(new Font("Arial",Font.BOLD,25));
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		panelTabla.add(etiqueta1);
		
		JLabel text1 = new JLabel("Total de usuarios");
		text1.setBounds(50, 70, 180, 40);
		text1.setOpaque(true);
		text1.setFont(new Font("Arial",Font.BOLD,14));
		text1.setHorizontalAlignment(JLabel.CENTER);
		panelTabla.add(text1);
		
		JLabel text2 = new JLabel("90");
		text2.setBounds(50, 100, 180, 40);
		text2.setOpaque(true);
		text2.setFont(new Font("Arial",Font.BOLD,14));
		text2.setHorizontalAlignment(JLabel.CENTER);
		panelTabla.add(text2);
		
		JLabel widget = new JLabel();
		widget.setBounds(30, 60, 220, 100);
		widget.setOpaque(true);
		widget.setBorder(BorderFactory.createLineBorder(Color.black,2));
		panelTabla.add(widget);
		
		JButton export = new JButton("Exportar");
		export.setBounds(700, 140, 120, 40);
		export.setBorder(BorderFactory.createLineBorder(Color.black,2));
		panelTabla.add(export);
		
		JButton add = new JButton("Añadir");
		add.setBounds(840, 140, 120, 40);
		add.setBorder(BorderFactory.createLineBorder(Color.black,2));
		panelTabla.add(add);
		
		
		String[] columnNames= {
				"First Name",
				"First Name",
				"First Name",
				"First Name",
				"First Name",
		};
		
		Object[][]data= {
				{"Joel","Zazueta", "Carrillo", 2005, true},
				{"Lhucas", "Huml", "Patinar",1999,true},
				{"Kathya", "Walrath", "Escalar", 2000,false},
				{"Marcus", "Andrews", "Correr",1997,true},
				{"Angela", "Lalth", "Nadar",1999,false},
				{"Joel","Zazueta", "Carrillo", 2005, true},
				{"Lhucas", "Huml", "Patinar",1999,true},
				{"Kathya", "Walrath", "Escalar", 2000,false},
				{"Marcus", "Andrews", "Correr",1997,true},
				{"Angela", "Lalth", "Nadar",1999,false},
				{"Joel","Zazueta", "Carrillo", 2005, true},
				{"Lhucas", "Huml", "Patinar",1999,true},
				{"Kathya", "Walrath", "Escalar", 2000,false},
				{"Marcus", "Andrews", "Correr",1997,true},
				{"Angela", "Lalth", "Nadar",1999,false}
		};		
		
		JTable table = new JTable(data,columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(30, 200, 930, 200);
		panelTabla.add(scrollPane);

		
		panelTabla.revalidate();
		
		
		return panelTabla;
	}
		
	public JPanel calculadoraLayouts() {
		
		
		
		JPanel panel_calculadora = new JPanel();
		panel_calculadora.setVisible(true);
		panel_calculadora.setLocation(0,0);
		panel_calculadora.setSize(500,500);
		panel_calculadora.setOpaque(true);
		panel_calculadora.setLayout(null);
		panel_calculadora.setBackground(Color.BLACK);
		panel_calculadora.setLayout(new BorderLayout());
		
		
		JLabel digitos = new JLabel("123+32+22");
		//digitos.setSize(500,30);
		//digitos.setBounds(10,10,460,50);
		digitos.setFont(new Font("Arial",Font.BOLD,25));
		digitos.setHorizontalAlignment(JLabel.CENTER);
		digitos.setOpaque(true);
		panel_calculadora.add(digitos,BorderLayout.NORTH);
		
		/*String [] arregloBotones= {
				"7","8","9","7","/",
				"4","5","6","*",
				"1","2","3","-",
				"0",".","=","+"
		};
		
		
		
		for(String arreglobotones: arregloBotones);{
			botones.add(arregloBotones);
			botones.setBackground(Color.GRAY);
			botones.setFont(new Font("Arial",Font.BOLD,20));

		}*/
		JPanel botones = new JPanel();
				JButton siete = new JButton("7");
				JButton ocho = new JButton("8");
				JButton nueve = new JButton("9");
				JButton division = new JButton("/");
				JButton cuatro = new JButton("4");
				JButton cinco = new JButton("5");
				JButton seis = new JButton("6");
				JButton multiplicacion = new JButton("*");
				JButton uno = new JButton("1");
				JButton dos = new JButton("2");
				JButton tres = new JButton("3");
				JButton resta = new JButton("-");
				JButton cero = new JButton("0");
				JButton punto = new JButton(".");
				JButton igual = new JButton("=");
				JButton suma = new JButton("+");
				
		botones.add(siete);
		botones.add(ocho);
		botones.add(nueve);
		botones.add(division);
		botones.add(cuatro);
		botones.add(cinco);
		botones.add(seis);
		botones.add(multiplicacion);
		botones.add(uno);
		botones.add(dos);
		botones.add(tres);
		botones.add(resta);
		botones.add(cero);
		botones.add(punto);
		botones.add(igual);
		botones.add(suma);
		
		botones.setLayout(new GridLayout(4,5));
		//botones.setSize(400,400);
		botones.setVisible(true);
		botones.setOpaque(true);
		panel_calculadora.add(botones,BorderLayout.CENTER);
		
			
;		
		
		
		
		
		return panel_calculadora;
	}
	
	
	
	
	
	
	
	
}
