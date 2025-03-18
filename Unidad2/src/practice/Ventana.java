package practice;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalButtonUI;

public class Ventana extends JFrame{
	
	public Ventana(String title) {
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,650);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.decode("#0665c0"));
		this.setVisible(true);
		this.setResizable(true);
		ImageIcon imageIcon = new ImageIcon("website.png");
		Image image=imageIcon.getImage();
	    this.setIconImage(image);
	    
    
		//this.add(this.Registro());
		//this.add(this.login());
		this.add(this.boton());
		//this.add(this.users());
		//this.add(this.calculadoraLayouts());
		//this.add(this.interfaz());

		
		this.setMinimumSize(new Dimension(1000,650));
		//this.setMaximumSize(new Dimension(1000,1000));
		
		JMenuBar barra= new JMenuBar(); //barra de menus
		
		JMenu menu_archivo = new JMenu("Archivo");
		JMenuItem op_abrir= new JMenuItem("Abrir");
		JMenuItem op_nuevo= new JMenuItem("Nuevo");
		JMenuItem op_guardar= new JMenuItem("Guardar");
		JMenuItem op_cerrar= new JMenuItem("Cerrar");
		

		menu_archivo.add(op_abrir);
		menu_archivo.add(op_nuevo);
		menu_archivo.add(op_guardar);
		menu_archivo.add(op_cerrar);
		
		JMenu menu_cuenta = new JMenu("Cuenta");
		JMenuItem ir_login= new JMenuItem("login");
		ir_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("login");

			}
		});
		
		JMenuItem ir_registro= new JMenuItem("registro");
		ir_registro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("register");

			}
		});
		
		JMenuItem ir_recupera_cuenta= new JMenuItem("Recuperación de cuenta");
		ir_recupera_cuenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("recuperacionCuenta");

			}
		});
		
		menu_cuenta.add(ir_login);
		menu_cuenta.add(ir_registro);
		menu_cuenta.add(ir_recupera_cuenta);
		
		JMenu menu_usuario = new JMenu("Usuarios");
		JMenuItem ir_alta= new JMenuItem("Alta");
		ir_alta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("darAlta");

			}
		});
		
		JMenuItem ir_baja= new JMenuItem("Baja");
		ir_baja.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("darBaja");

			}
		});
		
		JMenuItem ir_consultar= new JMenuItem("Consultar");
		ir_consultar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("consultar_cuenta");

			}
		});
		
		menu_usuario.add(ir_alta);
		menu_usuario.add(ir_baja);
		menu_usuario.add(ir_consultar);
		
		
		JMenu menu_ayuda = new JMenu("Ayuda");
		JMenuItem ir_crea_usuario= new JMenuItem("¿Cómo crear un usuario?");
		ir_crea_usuario.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("ayuda_crea_usuario");

			}
		});
		JMenuItem ir_acceder_sistema= new JMenuItem("¿Cómo acceder al sistema?");
		ir_acceder_sistema.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("ayuda_accede_sistema");

			}
		});
		JMenuItem ir_ayuda_contraseña= new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		ir_ayuda_contraseña.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("ayuda_recupera_contraseña");

			}
		});
		
		
		
		menu_ayuda.add(ir_crea_usuario);
		menu_ayuda.add(ir_acceder_sistema);
		menu_ayuda.add(ir_ayuda_contraseña);
		
		
		barra.add(menu_archivo);
		barra.add(menu_cuenta);
		barra.add(menu_usuario);
		barra.add(menu_ayuda);
		
		this.setJMenuBar(barra);
		this.repaint();
		this.revalidate();


	}
	
	public JPanel login () {
		
		JPanel panelFondo= new JPanel();
		panelFondo.setVisible(true);
		panelFondo.setLocation(0,0);
		panelFondo.setSize(1000,1000);
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
		panelLogin.add(nombreUsuario);
		
		JLabel contraseña = new JLabel("Contraseña ");
		contraseña.setSize(180,25);
		contraseña.setLocation(90,170);
		contraseña.setForeground(Color.WHITE);
		contraseña.setFont(new Font("Arial",Font.BOLD,12));
		panelLogin.add(contraseña);
		
		JTextField contraseña2 = new JTextField();
		contraseña2.setBounds(90, 190, 300,30);
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
		iniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Boolean flag1=false,flag2=false;
				
				
				if(nombreUsuario.getText().equals("")){
					nombreUsuario.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					nombreUsuario.setBorder(BorderFactory.createLineBorder(Color.green,2));
					flag1=true;
				}
					
				if(contraseña2.getText().equals("")){
					contraseña2.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					contraseña2.setBorder(BorderFactory.createLineBorder(Color.green,2));
					flag2=true;
				}
				
				if (flag1 && flag2) {
					if(nombreUsuario.getText().equals("joel12@gmail.com")) {
						if(contraseña2.getText().equals("1234")) {
							JOptionPane.showMessageDialog(panelLogin, "Bienvenido");
						}else {
							JOptionPane.showMessageDialog(panelLogin, "Error");

						}
					}else {
						JOptionPane.showMessageDialog(panelLogin, "Error");

					}
				}
			}
		});	
		panelLogin.add(iniciar);
		
		JButton ir_al_registro = new JButton ("¿Aún no tienes cuenta?");
		ir_al_registro.setSize(180,25);
		ir_al_registro.setLocation(30, 400);
		ir_al_registro.setFont(new Font("Arial",Font.BOLD,12));		
		ir_al_registro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("register");
				
			}
		});
		
		
		panelLogin.add(ir_al_registro);
		this.repaint();
		
		return panelFondo;
	}	
	
	public JPanel Registro() {
		
		JPanel panelRegistro = new JPanel();
		panelRegistro.setVisible(true);
		panelRegistro.setLocation(0,0);
		panelRegistro.setSize(500,500);
		panelRegistro.setBackground(new Color(171, 231, 242));
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
		//nombreUsuario.setText("Nombre de usuario..." );
		panelRegistro.add(nombreUsuario);
		
		JLabel bio = new JLabel("BIO ");
		bio.setSize(180,25);
		bio.setLocation(30,160);
		bio.setFont(new Font("Arial",Font.BOLD,15));
		panelRegistro.add(bio);
		
		JTextField bio2 = new JTextField();
		bio2.setBounds(230, 140, 230,50);
		//bio2.setText("BIO..." );
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

		JButton crearCuenta = new JButton("Crear cuenta");
		crearCuenta.setBounds(280,480,180,25);
		crearCuenta.setFont(new Font("Arial",Font.BOLD,12));
		crearCuenta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(nombreUsuario.getText().equals("")){
					nombreUsuario.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else
					nombreUsuario.setBorder(BorderFactory.createLineBorder(Color.green,2));
			}
		});
		crearCuenta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(bio2.getText().equals("")){
					bio2.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else
					bio2.setBorder(BorderFactory.createLineBorder(Color.green,2));
			}
		});
		crearCuenta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				terms1.setBorderPainted(true);
				if(!terms1.isSelected() && terms2.isSelected()){
					terms1.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else
					terms1.setBorder(BorderFactory.createLineBorder(Color.green,2));
			}
		});	
		panelRegistro.add(crearCuenta);
		
		JButton ir_al_login = new JButton ("Inicio");
		ir_al_login.setSize(180,25);
		ir_al_login.setLocation(30, 480);
		ir_al_login.setFont(new Font("Arial",Font.BOLD,12));		
		ir_al_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("login");
				
			}
		});
		
		panelRegistro.add(ir_al_login);

				
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
	
	public JPanel interfaz() {
		JPanel panelFondo= new JPanel();
		panelFondo.setVisible(true);
		panelFondo.setSize(1000,1000);
		panelFondo.setBackground(Color.WHITE);
		panelFondo.setOpaque(true);
		panelFondo.setLayout(new BorderLayout());

		
		JLabel title = new JLabel("Interés");
		title.setSize(160,40);
		//title.setLocation(0,10);
		title.setFont(new Font("Arial",Font.ITALIC,25));
		title.setForeground(Color.RED);
		title.setHorizontalAlignment(JLabel.CENTER);
		panelFondo.add(title,BorderLayout.NORTH);
		
		JPanel panelInteres= new JPanel();
		panelInteres.setVisible(true);
		panelInteres.setBackground(new Color(51,255,125));
		panelInteres.setOpaque(true);
		panelInteres.setLayout(new GridLayout(4,2,30,90));
		panelInteres.setBorder(BorderFactory.createTitledBorder("Calcular interés"));
		panelFondo.add(panelInteres,BorderLayout.CENTER);
		
		//items panel interés
		
		JLabel capital = new JLabel("Capital: ");
		capital.setForeground(Color.BLACK);
		capital.setFont(new Font("Arial",Font.BOLD,18));
		capital.setHorizontalAlignment(JLabel.CENTER);
		capital.setBorder(BorderFactory.createLineBorder(new Color(51,255,125), 3));
		panelInteres.add(capital);
		
		JTextField capital_input = new JTextField();
		capital_input.setText("1222" );
		capital_input.setFont(new Font("Arial",Font.BOLD,18));
		capital_input.setBorder(BorderFactory.createLineBorder(new Color(51,255,125), 3));
		panelInteres.add(capital_input);
		
		JLabel tiempo_tag = new JLabel("Tiempo: ");
		tiempo_tag.setForeground(Color.BLACK);
		tiempo_tag.setFont(new Font("Arial",Font.BOLD,18));
		tiempo_tag.setHorizontalAlignment(JLabel.CENTER);
		tiempo_tag.setBorder(BorderFactory.createLineBorder(new Color(51,255,125), 3));

		panelInteres.add(tiempo_tag);
		
		JTextField tiempo_input = new JTextField();
		tiempo_input.setText("2" );
		tiempo_input.setFont(new Font("Arial",Font.BOLD,18));
		tiempo_input.setBorder(BorderFactory.createLineBorder(new Color(51,255,125), 3));

		panelInteres.add(tiempo_input);
		
		JLabel tasainteres_tag = new JLabel("Tasa interés:");
		tasainteres_tag.setForeground(Color.BLACK);
		tasainteres_tag.setFont(new Font("Arial",Font.BOLD,18));
		tasainteres_tag.setHorizontalAlignment(JLabel.CENTER);
		tasainteres_tag.setBorder(BorderFactory.createLineBorder(new Color(51,255,125), 3));

		panelInteres.add(tasainteres_tag);
		
		JTextField tasainteres_input = new JTextField();
		tasainteres_input.setText("0.1" );
		tasainteres_input.setFont(new Font("Arial",Font.BOLD,18));
		tasainteres_input.setBorder(BorderFactory.createLineBorder(new Color(51,255,125), 3));

		panelInteres.add(tasainteres_input);
		
		//Botones
		JButton calcular = new JButton("Calcular");
		calcular.setFont(new Font("Arial",Font.BOLD,18));
		calcular.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

		panelInteres.add(calcular);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setFont(new Font("Arial",Font.BOLD,18));
		cancelar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		panelInteres.add(cancelar);
		
		JPanel footer= new JPanel();
		footer.setVisible(true);
		footer.setBackground(new Color(255,51,134));
		footer.setOpaque(true);
		footer.setLayout(new GridLayout(2,2,30,200));
		panelFondo.add(footer,BorderLayout.SOUTH);
		//items footer
		JLabel interes_tag= new JLabel("Interés");
		interes_tag.setFont(new Font("Arial",Font.BOLD,20));
		interes_tag.setHorizontalAlignment(JLabel.CENTER);
		interes_tag.setBorder(BorderFactory.createLineBorder(new Color(255,51,134), 3));
		
		JTextField interes_input= new JTextField("123.212");
		interes_input.setFont(new Font("Arial",Font.BOLD,20));
		interes_input.setBorder(BorderFactory.createLineBorder(new Color(255,51,134), 3));
		
		JLabel amount_tag= new JLabel("Monto:");
		amount_tag.setFont(new Font("Arial",Font.BOLD,20));
		amount_tag.setHorizontalAlignment(JLabel.CENTER);
		amount_tag.setBorder(BorderFactory.createLineBorder(new Color(255,51,134), 3));
		
		JTextField amount_input= new JTextField("12223.212");
		amount_input.setFont(new Font("Arial",Font.BOLD,20));
		amount_input.setBorder(BorderFactory.createLineBorder(new Color(255,51,134), 3));

		
		footer.add(interes_tag);
		footer.add(interes_input);
		
		footer.add(amount_tag);
		footer.add(amount_input);
		
		
		this.repaint();
		return panelFondo;
	}
	
	public void manager(String target) {
		
		this.getContentPane().removeAll();
		
		if(target.equals("register")) {
			this.add(this.Registro());
		}
		if(target.equals("login")) {
			this.add(this.login());
		}
		if(target.equals("recuperacionCuenta")) {
			this.add(this.recuperacionCuenta());
		}
		if(target.equals("darAlta")) {
			this.add(this.darAlta());
		}
		if(target.equals("darBaja")) {
			this.add(this.darBaja());
		}
		if(target.equals("consultar_cuenta")) {
			this.add(this.consultar_cuenta());
		}
		if(target.equals("ayuda_crea_usuario")) {
			this.add(this.ayuda_crea_usuario());
		}
		if(target.equals("ayuda_accede_sistema")) {
			this.add(this.ayuda_accede_sistema());
		}
		if(target.equals("ayuda_recupera_contraseña")) {
			this.add(this.ayuda_recupera_contraseña());
		}
		
		this.repaint();
		this.revalidate();
		
		
	}
	
	public JPanel recuperacionCuenta() {
		JPanel contentPane;
		JTextField textField;
		JTextField textField_1;
		JTextField textField_2;
		
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 202, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Recuperar tu cuenta");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(113, 43, 245, 49);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBorder(BorderFactory.createTitledBorder("Correo o numero celular"));
		textField.setBounds(113, 155, 196, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(BorderFactory.createTitledBorder("Nombre"));
		textField_1.setColumns(10);
		textField_1.setBounds(113, 225, 196, 34);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBorder(BorderFactory.createTitledBorder("Apellidos"));
		textField_2.setColumns(10);
		textField_2.setBounds(113, 290, 196, 34);
		contentPane.add(textField_2);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBounds(60, 373, 141, 34);
		btnVolver.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("login");
				
			}
		});
		contentPane.add(btnVolver);
		
		JButton btnNewButton_1_1 = new JButton("Siguiente");
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(217, 373, 141, 34);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				
				if(textField.getText().equals("")){
					textField.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					textField.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
					
				if(textField_1.getText().equals("")){
					textField_1.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					textField_1.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				if(textField_2.getText().equals("")){
					textField_2.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					textField_2.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
			}
		});	
		contentPane.add(btnNewButton_1_1);
		
		return contentPane;
		
	}
	
	public JPanel darAlta() {
		JPanel contentPane;
		JTextField textField;
		JTextField textField_1;
		JTextField textField_2;
		
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 202, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dar de alta");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(113, 43, 245, 49);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBorder(BorderFactory.createTitledBorder("Nombre de usuario"));
		textField.setBounds(113, 155, 196, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(BorderFactory.createTitledBorder("Contraseña"));
		textField_1.setColumns(10);
		textField_1.setBounds(113, 225, 196, 34);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBorder(BorderFactory.createTitledBorder("Confimar contraseña"));
		textField_2.setColumns(10);
		textField_2.setBounds(113, 290, 196, 34);
		contentPane.add(textField_2);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBounds(60, 373, 141, 34);
		btnVolver.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("login");
				
			}
		});
		contentPane.add(btnVolver);
		
		JButton btnNewButton_1_1 = new JButton("Siguiente");
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(217, 373, 141, 34);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				
				if(textField.getText().equals("")){
					textField.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					textField.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
					
				if(textField_1.getText().equals("")){
					textField_1.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					textField_1.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				if(textField_2.getText().equals("")){
					textField_2.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					textField_2.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
			}
		});	
		contentPane.add(btnNewButton_1_1);
		
		return contentPane;
		
	}
	
	public JPanel darBaja() {
		JPanel contentPane;
		JTextField textField_1;

		
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 202, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dar de baja");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(113, 43, 245, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("¿Estas seguro de eliminar tu cuenta?");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(53, 132, 251, 17);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Si");
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(59, 165, 93, 21);
		contentPane.add(chckbxNewCheckBox);
		
		textField_1 = new JTextField();
		textField_1.setBorder(BorderFactory.createTitledBorder("Contraseña"));
		textField_1.setColumns(10);
		textField_1.setBounds(59, 225, 196, 34);
		contentPane.add(textField_1);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBounds(60, 373, 141, 34);
		btnVolver.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("login");
				
			}
		});
		contentPane.add(btnVolver);
		
		JButton btnNewButton_1_1 = new JButton("Siguiente");
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(217, 373, 141, 34);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
					
				if(textField_1.getText().equals("")){
					textField_1.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					textField_1.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
			}
		});	
		contentPane.add(btnNewButton_1_1);
		
		return contentPane;
		
	}
	
	public JPanel consultar_cuenta() {
		JPanel contentPane;
		
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 202, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informacion de la cuenta");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(400, 43, 245, 49);
		contentPane.add(lblNewLabel);
		
		JLabel text1 = new JLabel("Total de usuarios");
		text1.setBounds(50, 70, 180, 40);
		text1.setOpaque(true);
		text1.setFont(new Font("Arial",Font.BOLD,14));
		text1.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(text1);
		
		JLabel text2 = new JLabel("90");
		text2.setBounds(50, 100, 180, 40);
		text2.setOpaque(true);
		text2.setFont(new Font("Arial",Font.BOLD,14));
		text2.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(text2);
		
		JLabel widget = new JLabel();
		widget.setBounds(30, 60, 220, 100);
		widget.setOpaque(true);
		widget.setBorder(BorderFactory.createLineBorder(Color.black,2));
		contentPane.add(widget);
		
		JButton export = new JButton("Exportar");
		export.setBounds(840, 140, 120, 40);
		export.setBorder(BorderFactory.createLineBorder(Color.black,2));
		contentPane.add(export);
		
		JButton add = new JButton("Volver");
		add.setBounds(700, 140, 120, 40);
		add.setBorder(BorderFactory.createLineBorder(Color.black,2));
		add.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("login");
				
			}
		});
		
		contentPane.add(add);
		
		
		String[] columnNames= {
				"Nombre",
				"Apellido paterno",
				"Apellido materno",
				"Año nacimiento",
				"Inscrito",
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
		contentPane.add(scrollPane);

		
		contentPane.revalidate();
		
		return contentPane;
		
	}
	
	public JPanel ayuda_crea_usuario() {
		JPanel contentPane;
		JTextField textField;
		JTextField textField_1;
		JTextField textField_2;
		
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 202, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿Como crear tu cuenta?");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(113, 43, 245, 49);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrParaPoderCrear = new JTextArea();
		txtrParaPoderCrear.setText("Para poder crear una cuenta es necesesario que \r\ningreses tus datos en los siguientes campos");
		txtrParaPoderCrear.setBounds(67, 98, 301, 49);
		txtrParaPoderCrear.setBackground(new Color(255, 202, 255));
		contentPane.add(txtrParaPoderCrear);
		
		textField = new JTextField();
		textField.setBorder(BorderFactory.createTitledBorder("Correo"));
		textField.setBounds(113, 155, 196, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(BorderFactory.createTitledBorder("Contraseña"));
		textField_1.setColumns(10);
		textField_1.setBounds(113, 225, 196, 34);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBorder(BorderFactory.createTitledBorder("Confimar contraseña"));
		textField_2.setColumns(10);
		textField_2.setBounds(113, 290, 196, 34);
		contentPane.add(textField_2);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBounds(60, 373, 141, 34);
		btnVolver.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("login");
				
			}
		});
		contentPane.add(btnVolver);
		
		JButton btnNewButton_1_1 = new JButton("Siguiente");
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(217, 373, 141, 34);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				manager("register");
			}
		});	
		contentPane.add(btnNewButton_1_1);
		
		return contentPane;
		
	}
	
	public JPanel ayuda_accede_sistema() {
		JPanel contentPane;
		JTextField textField;
		JTextField textField_1;
		JTextField textField_2;
		
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 202, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿Como crear tu cuenta?");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(113, 43, 245, 49);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrParaPoderCrear = new JTextArea();
		txtrParaPoderCrear.setText("Para poder acceder al sistema es necesesario que primero \r\ningreses tus datos en los siguientes campos");
		txtrParaPoderCrear.setBounds(67, 98, 301, 49);
		txtrParaPoderCrear.setBackground(new Color(255, 202, 255));
		contentPane.add(txtrParaPoderCrear);
		
		textField = new JTextField();
		textField.setBorder(BorderFactory.createTitledBorder("Correo"));
		textField.setBounds(113, 155, 196, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(BorderFactory.createTitledBorder("Contraseña"));
		textField_1.setColumns(10);
		textField_1.setBounds(113, 225, 196, 34);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBorder(BorderFactory.createTitledBorder("Confimar contraseña"));
		textField_2.setColumns(10);
		textField_2.setBounds(113, 290, 196, 34);
		contentPane.add(textField_2);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBounds(60, 373, 141, 34);
		btnVolver.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("login");
				
			}
		});
		contentPane.add(btnVolver);
		
		JButton btnNewButton_1_1 = new JButton("Siguiente");
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(217, 373, 141, 34);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				manager("register");
			}
		});	
		contentPane.add(btnNewButton_1_1);
		
		return contentPane;
		
	}
	
	public JPanel ayuda_recupera_contraseña() {
		JPanel contentPane;
		JTextField textField;
		JTextField textField_1;
		JTextField textField_2;
		
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 202, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿Como recuperar tu contraseña?");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(113, 43, 345, 49);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrParaPoderCrear = new JTextArea();
		txtrParaPoderCrear.setText("Para poder recuperar tu contraseña primero \r\ningreses tus datos en los siguientes campos");
		txtrParaPoderCrear.setBounds(67, 98, 301, 49);
		txtrParaPoderCrear.setBackground(new Color(255, 202, 255));
		contentPane.add(txtrParaPoderCrear);
		
		textField = new JTextField();
		textField.setBorder(BorderFactory.createTitledBorder("Correo o numero celular"));
		textField.setBounds(113, 155, 196, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBounds(60, 373, 141, 34);
		btnVolver.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				manager("login");
				
			}
		});
		contentPane.add(btnVolver);
		
		JButton btnNewButton_1_1 = new JButton("Siguiente");
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(217, 373, 141, 34);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				manager("recuperacionCuenta");
			}
		});	
		contentPane.add(btnNewButton_1_1);
		
		return contentPane;
		
	}
	
	public JPanel boton() {
		JPanel frame= new JPanel();
		frame.setVisible(true);
		frame.setLocation(0,0);
		frame.setSize(1000,650);
		frame.setBackground(new Color(70, 190, 250));
		frame.setOpaque(true);
		frame.setLayout(null);
		
		JButton main_boton= new JButton("Click me");
		main_boton.setSize(400,60);
		main_boton.setLocation(300,400);
		main_boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			    Random rand = new Random();

				JButton boton= new JButton("Click me");
				boton.setBackground(new Color(rand.nextInt(250), rand.nextInt(250), rand.nextInt(250)));
				boton.setSize(rand.nextInt(100),rand.nextInt(200));
				boton.setLocation(rand.nextInt(1000),rand.nextInt(600));
				boton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null,boton.getBackground());
					}
				});
				
				
				
				frame.add(boton);
				frame.repaint();
				
			}
		});
		frame.add(main_boton);
		
		
		return frame;
	}
	/*
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2= (Graphics2D) g;
		g2.setColor(Color.RED);
		g2.drawRect(80, 80, 400, 400);
		g2.fillRect(200, 200, 200, 200);
		g2.clearRect(220, 220, 50, 50);
		
		g2.setColor(Color.blue);
		g2.fillRoundRect(400, 80, 200, 200, 30, 30);
	
		g2.setColor(Color.green);
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(100, 100, 900, 500);
		
		g2.drawOval(400, 400, 90, 90);
		g2.fillOval(400, 450, 75, 150);
		
		g2.setColor(new Color(207,147,240));
		g2.drawArc(600,200,100,100,1,-180);
		g2.fillArc(600,200,100,100,1,180);
		
		g2.setColor(Color.decode("#33A7F1"));
		g2.setFont(new Font("Arial",Font.BOLD,25));

		g2.drawString("Hola como andamos", 350, 200);
		
		ImageIcon img = new ImageIcon("mono.png");
		Image imagen=img.getImage();		
		g2.drawImage(imagen, 800, 250, 100, 100,Color.gray, null);
		
		int[] xs= {100,100,400};
		int[] ys= {100,200,400};
		
		g2.drawPolygon(xs,ys,3);
		
		int[] xs2= {600,500,400};
		int[] ys2= {100,200,400};
		
		g2.drawPolygon(xs2,ys2,3);
		
		

		
	}
	
	*/
	//CASA
	/*
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2= (Graphics2D) g;
		
		// Estrellas en el cielo
	    g2.setColor(new Color(233, 238, 243));
	    for (int i = 0; i < 100; i++) {  
	        int x = (int) (Math.random() * getWidth()); 
	        int y = (int) (Math.random() * 300); 
	        int size = (int) (Math.random() * 3 + 1);
	        g2.fillOval(x, y, size, size);
	    }
	    
		g2.setColor(new Color(86, 84, 83));		
		g2.fillRect(0, 780,getWidth(),50);
		g2.setColor(new Color(67, 179, 15));	//suelo
		g2.fillRect(0, 740,getWidth(),40);
		g2.setColor(new Color(74, 76, 73));	
		g2.fillRect(500, 700,600,40);
		
		g2.setColor(new Color(74, 76, 73));	
		g2.fillRect(500, 700,600,40);			//casa
		g2.setColor(new Color(243, 243, 72));	
		g2.fillRect(540, 300, 500, 400);
		
		g2.setColor(Color.RED); //techo
        int[] xs = {525, 1050, 800};
        int[] ys = {300, 300, 150};
        g2.fillPolygon(xs, ys, 3);
        
        g2.setColor(new Color(172, 124, 59)); //puerta
        g2.fillRect(600, 490, 150, 210);
        g2.setColor(new Color(238, 233, 226));  
        g2.fillOval(725, 620, 20, 20); 

       		
        g2.setColor(new Color(238, 233, 226)); //Ventana
        g2.fillRect(870, 440, 100, 100);
        g2.setColor(Color.BLACK);
        g2.fillRect(915, 440, 10, 100); // vertical
        g2.fillRect(870, 490, 100, 5); //horizontal
        
        
        g2.setColor(new Color(132, 129, 125));
        g2.fillRect(855, 530, 130, 15); // borde ventana 
        
        g2.setColor(new Color(132, 129, 125)); //chimenea
        g2.fillRect(620, 200, 40, 80); // Base
        g2.fillRect(630, 140, 20, 60); // Parte superior
        
     // Cerco
        g2.setColor(new Color(139, 69, 19));
        int cercoHeight = 80; 
        int cercoYPosition = 700;
        int cercoTopYPosition = 680;
        
        for (int i = 0; i < getWidth() / 60; i++) {
            g2.fillRect(i * 60, cercoYPosition, 50, cercoHeight); // Las tablas
            int[] xPointsCerco = {i * 60, i * 60 + 50, i * 60 + 25}; 
            int[] yPointsCerco = {cercoYPosition, cercoYPosition, cercoTopYPosition}; 
            g2.fillPolygon(xPointsCerco, yPointsCerco, 3); 
        }
        
        //luna
        g2.setColor(new Color(186, 193, 201));
		g2.fillArc(10,60,200,200,0,360);

	}*/
	
	//Mario Bros
	/*
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2= (Graphics2D) g;
		
		g2.setColor(new Color(255, 201, 189));		//suelo
		g2.fillRect(0, 770,getWidth(),60);
		
		g2.setColor(Color.BLACK);
		g2.fillRoundRect(630, 420, 250, 350, 20, 20);
		g2.fillRoundRect(595, 390, 265, 380, 20, 20);
		g2.setColor(new Color(113, 194, 255));		//bloque azul
		g2.fillRoundRect(600, 395, 250, 370, 20, 20);
		g2.setColor(new Color(0, 148, 230));		//sombra azul
		g2.fillRoundRect(835, 395, 20, 365, 10, 30);
		g2.setColor(new Color(0, 109, 174));		//sombra azul
		g2.fillRoundRect(605, 745, 250, 20,10,30);
		
		g2.setColor(Color.BLACK);
		g2.fillRoundRect(520, 570, 200, 200, 20, 20);
		g2.fillRoundRect(465, 530, 240, 240, 20, 20);
		g2.setColor(Color.decode("#ffc3b8"));		//bloque crema
		g2.fillRoundRect(470, 535, 230, 230, 20, 20);
		g2.setColor(Color.decode("#e8906c"));		//sombra crema
		g2.fillRoundRect(680, 535, 20, 225, 10, 30);
		g2.setColor(Color.decode("#dca286"));		//sombra crema
		g2.fillRoundRect(470, 745, 230, 20,10,30);
		
		g2.setColor(Color.BLACK);
		g2.fillRoundRect(230,100, 215, 80, 20, 20);
		g2.setColor(Color.decode("#ff8f5f"));		//bloques dobles ?
		g2.fillRoundRect(235,105, 100, 70, 20, 20);
		g2.setColor(Color.decode("#ff8f5f"));		//bloques ?
		g2.fillRoundRect(340,105, 100, 70, 20, 20);
		g2.setColor(Color.decode("#dca286"));		//sombra crema
		g2.fillRoundRect(470, 745, 230, 20,10,30);
		
		g2.setColor(Color.BLACK);
		g2.fillRoundRect(80,400, 110, 80, 20, 20);
		g2.setColor(Color.decode("#ff8f5f"));		//bloque izquierdo ?
		g2.fillRoundRect(85,405, 100, 70, 20, 20);
		
		g2.setColor(Color.BLACK);
		g2.fillRoundRect(getWidth()-150,200, 110, 80, 20, 20);
		g2.setColor(Color.decode("#ff8f5f"));		//bloque derecho ?
		g2.fillRoundRect(getWidth()-145,205, 100, 70, 20, 20);
		
		g2.setColor(Color.BLACK);
		g2.fillRoundRect(getWidth()-210, 530, 240, 240, 20, 20);
		g2.setColor(Color.decode("#51d96b"));		//bloque verde
		g2.fillRoundRect(getWidth()-205, 535, 230, 230, 20, 20);
		g2.setColor(Color.decode("#2a5e28"));		//sombra crema
		g2.fillRoundRect(getWidth()-205, 757, 230, 10,50,30);
		
		g2.setColor(Color.BLACK); 
		g2.fillArc(200, 675, 130, 190, 0, 180); // Arbusto
        g2.setColor(Color.decode("#43d06f")); 
        g2.fillArc(205, 680, 120, 180, 0, 180); // Arbusto
        
        g2.setColor(Color.BLACK);
		g2.fillRect(getWidth()-510, 600, 130, 170);
		g2.setColor(Color.BLACK);						//tubo borde
		g2.fillRect(getWidth()-550, 525, 210, 75);
		g2.setColor(Color.decode("#51d96b"));
		g2.fillRect(getWidth()-505, 600, 120, 165);
		g2.setColor(Color.decode("#51d96b"));						//tubo verde
		g2.fillRect(getWidth()-545, 530, 200, 65);
       

		

	}*/
	
	//ESCENA DE SUPER MARIO WORLD
	/*
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2= (Graphics2D) g;
		
		g2.setColor(Color.BLACK);		//suelo (Borde)
		g2.fillRect(0, 700,getWidth(),150);
		g2.setColor(Color.decode("#cf9e5f"));		//suelo (tierra)
		g2.fillRect(0, 730,getWidth(),100);
		g2.setColor(Color.decode("#85651e"));		//suelo (sombra tierra)
		g2.fillRect(0, 730,getWidth(),10);
		g2.setColor(Color.decode("#926f2a"));		//suelo (sombra tierra2)
		g2.fillRect(0, 740,getWidth(),2);
		g2.setColor(Color.decode("#18b22a"));		//suelo (pasto)
		g2.fillRect(0, 705,getWidth(),20);
		g2.setColor(Color.decode("#12823c"));		//suelo (pasto sombra)
		g2.fillRect(0, 720,getWidth(),5);
		
		g2.setColor(Color.decode("#b2d3d6"));
        g2.fillOval(160, 560, 300, 65);  // Nubes
        g2.setColor(Color.decode("#ecf3fe"));
        g2.fillOval(160, 555, 300, 60);
        
        g2.setColor(Color.decode("#b2d3d6"));
        g2.fillOval(540, 520, 300, 65);  // Nubes
        g2.setColor(Color.decode("#ecf3fe"));
        g2.fillOval(540, 515, 300, 60);
        
        g2.setColor(Color.decode("#b2d3d6"));
        g2.fillOval(560, 630, 300, 65);  // Nubes
        g2.setColor(Color.decode("#ecf3fe"));
        g2.fillOval(560, 625, 300, 60);
        
        g2.setColor(Color.decode("#b2d3d6"));
        g2.fillOval(1000, 220, 300, 65);  // Nubes
        g2.setColor(Color.decode("#ecf3fe"));
        g2.fillOval(1000, 215, 300, 60);
        
        g2.setColor(Color.decode("#b2d3d6"));
        g2.fillOval(1300, 155, 200, 65);  // Nubes
        g2.setColor(Color.decode("#ecf3fe"));
        g2.fillOval(1300, 150, 200, 60);
		
		g2.setColor(Color.decode("#95c1c7")); 
		g2.fillArc(30, 220, 220, 280, 0, 180); // pilar fondo izquierda(sombra)
		g2.fillRect(30, 360, 220, 340);	
        g2.setColor(Color.decode("#c6e3e7")); 
        g2.fillArc(30, 220, 200, 280, 0, 180); // pilar fondo izquierda
		g2.fillRect(30, 360, 200, 340);
		
		g2.setColor(Color.decode("#95c1c7")); 
		g2.fillArc(700, 220, 220, 280, 0, 180); // pilar centro fondo (sombra)
		g2.fillRect(700, 360, 220, 340);	
        g2.setColor(Color.decode("#c6e3e7")); 
        g2.fillArc(700, 220, 200, 280, 0, 180); // pilar  centro  fondo
		g2.fillRect(700, 360, 200, 340);
		
		g2.setColor(Color.decode("#95c1c7")); 
		g2.fillArc(920, 100, 230, 280, 0, 180); // pilar derecha fondo (sombra)
		g2.fillRect(920, 240, 230, 460);	
        g2.setColor(Color.decode("#c6e3e7")); 
        g2.fillArc(920, 100, 210, 280, 0, 180); // pilar  derecha  fondo
		g2.fillRect(920, 240, 210, 460);
		
		g2.setColor(Color.decode("#125175")); 
		g2.fillArc(-120, 520, 310, 300, 0, 180); // pilar pequeño fondo izquierda(sombra)
		g2.fillRect(-120,660, 310, 40);	
		g2.setColor(Color.decode("#76b2d7")); 
		g2.fillArc(-120, 525, 290, 300, 0, 180); // pilar pequeño fondo izquierda
		g2.fillRect(-120,665, 290, 35);	
		
		g2.setColor(Color.decode("#125175")); 
		g2.fillArc(700, 520, 310, 300, 0, 180); // pilar pequeño fondo centro(sombra)
		g2.fillRect(700,660, 310, 40);	
		g2.setColor(Color.decode("#76b2d7")); 
		g2.fillArc(702, 525, 290, 300, 0, 180); // pilar pequeño fondo centro
		g2.fillRect(702,665, 290, 35);	
		
		g2.setColor(Color.decode("#b2d3d6"));
        g2.fillOval(840, 460, 300, 65);  // Nubes
        g2.setColor(Color.decode("#ecf3fe"));
        g2.fillOval(840, 455, 300, 60);
		
		g2.setColor(Color.decode("#125175")); 
		g2.fillArc(1010, 280, 310, 300, 0, 180); // pilar pequeño fondo derecha(sombra)
		g2.fillRect(1010,420, 310, 280);	
		g2.setColor(Color.decode("#76b2d7")); 
		g2.fillArc(1012, 285, 290, 300, 0, 180); // pilar pequeño fondo derecha
		g2.fillRect(1012,425, 290, 275);	
		
		g2.setColor(Color.decode("#125175")); 
		g2.fillArc(getWidth()-120, 520, 310, 300, 0, 180); // pilar pequeño fondo derecha(sombra)
		g2.fillRect(getWidth()-120,660, 310, 40);	
		g2.setColor(Color.decode("#76b2d7")); 
		g2.fillArc(getWidth()-120, 525, 290, 300, 0, 180); // pilar pequeño fondo derecha
		g2.fillRect(getWidth()-120,665, 290, 35);	
		
		g2.setColor(Color.decode("#b2d3d6"));
        g2.fillOval(getWidth()-240, 635, 300, 65);  // Nubes
        g2.setColor(Color.decode("#ecf3fe"));
        g2.fillOval(getWidth()-240, 630, 300, 60);
		
		g2.setColor(Color.BLACK);
		g2.fillRoundRect(820, 575, 110, 125,20,20);
		g2.setColor(Color.BLACK);						//tubo centro borde
		g2.fillRoundRect(805, 510, 140, 70,20,20);
		g2.setColor(Color.decode("#6e6bb7"));
		g2.fillRoundRect(825, 580, 90, 120,20,20);
		g2.setColor(Color.decode("#6e6bb7"));						//tubo centro 
		g2.fillRoundRect(810, 515, 120, 60,20,20);
		g2.setColor(Color.decode("#d7e1fb")); 
		g2.fillRect(840,580, 15, 120);	
		g2.fillRect(830,515, 15, 60);	//superior
		
		g2.setColor(Color.BLACK);
		g2.fillRoundRect(getWidth()-90, 620, 110, 80,20,20);
		g2.setColor(Color.BLACK);						//tubo centro borde
		g2.fillRoundRect(getWidth()-105, 555, 140, 70,20,20);
		g2.setColor(Color.decode("#6e6bb7"));
		g2.fillRoundRect(getWidth()-85, 625, 90, 75,20,20);
		g2.setColor(Color.decode("#6e6bb7"));						//tubo centro 
		g2.fillRoundRect(getWidth()-100, 560, 120, 60,20,20);
		g2.setColor(Color.decode("#d7e1fb")); 
		g2.fillRect(getWidth()-65,625, 15, 75);	
		g2.fillRect(getWidth()-75,560, 15, 60);	//superior
		
		
		//-5 Y 
		g2.setColor(Color.decode("#b2d3d6"));
        g2.fillOval(-140, 360, 300, 65);  // Nubes
        g2.setColor(Color.decode("#ecf3fe"));
        g2.fillOval(-140, 355, 300, 60); 
        
        g2.setColor(Color.decode("#b2d3d6"));
        g2.fillOval(460, 425, 300, 65);  // Nubes
        g2.setColor(Color.decode("#ecf3fe"));
        g2.fillOval(460, 420, 300, 60);
        
        //+5 X Y -10 largo -10 ancho
        g2.setColor(Color.BLACK);
		g2.fillRoundRect(getWidth()-185,645, 80, 60, 30, 30);
		g2.setColor(Color.decode("#737071"));					//bloque 
		g2.fillRoundRect(getWidth()-180,650, 70, 50, 30, 30);
		g2.setColor(Color.decode("#c6c5cc"));					
		g2.fillRoundRect(getWidth()-180,650, 65, 45, 30, 30);

		//-60 Y
		g2.setColor(Color.BLACK);
		g2.fillRoundRect(getWidth()-185,585, 80, 60, 30, 30);
		g2.setColor(Color.decode("#737071"));					//bloque 
		g2.fillRoundRect(getWidth()-180,590, 70, 50, 30, 30);
		g2.setColor(Color.decode("#c6c5cc"));					
		g2.fillRoundRect(getWidth()-180,590, 65, 45, 30, 30);

		g2.setColor(Color.BLACK);
		g2.fillRoundRect(getWidth()-185,525, 80, 60, 30, 30);
		g2.setColor(Color.decode("#737071"));					//bloque 
		g2.fillRoundRect(getWidth()-180,530, 70, 50, 30, 30);
		g2.setColor(Color.decode("#c6c5cc"));					
		g2.fillRoundRect(getWidth()-180,530, 65, 45, 30, 30);
		
		g2.setColor(Color.BLACK);
		g2.fillRoundRect(getWidth()-185,465, 80, 60, 30, 30);
		g2.setColor(Color.decode("#737071"));					//bloque 
		g2.fillRoundRect(getWidth()-180,470, 70, 50, 30, 30);
		g2.setColor(Color.decode("#c6c5cc"));					
		g2.fillRoundRect(getWidth()-180,470, 65, 45, 30, 30);
		
		g2.setColor(Color.BLACK);
		g2.fillRoundRect(getWidth()-105,465, 80, 60, 30, 30);
		g2.setColor(Color.decode("#dd9f3e"));					//bloque AMARILLO
		g2.fillRoundRect(getWidth()-100,470, 70, 50, 30, 30);
		g2.setColor(Color.decode("#ffd52e"));					
		g2.fillRoundRect(getWidth()-100,470, 65, 45, 30, 30);
		g2.setColor(Color.BLACK);
		g2.fillRect(getWidth()-80,480, 6, 25);
		g2.fillRect(getWidth()-60,480, 6, 25);

		g2.setColor(Color.BLACK);
		g2.fillRoundRect(getWidth()-25,465, 80, 60, 30, 30);
		g2.setColor(Color.decode("#dd9f3e"));					//bloque AMARILLO
		g2.fillRoundRect(getWidth()-20,470, 70, 50, 30, 30);
		g2.setColor(Color.decode("#ffd52e"));					
		g2.fillRoundRect(getWidth()-20,470, 65, 45, 30, 30);
		
		g2.setColor(Color.decode("#c8e2e0"));
        g2.fillOval(1060, 405, 40, 60);  // sombras ovaladas
        g2.fillOval(1200, 600, 40, 60);  // sombras ovaladas
        

        g2.setColor(Color.decode("#f2f2ff"));
        g2.fillOval(70, 450, 40, 60);  // sombras ovaladas
        g2.fillOval(150, 400, 40, 60);  // sombras ovaladas
        g2.fillOval(160, 300, 40, 60);  // sombras ovaladas
        
        
        g2.fillOval(725, 480, 40, 60);  // sombras ovaladas
        g2.fillOval(725, 360, 40, 60);  // sombras ovaladas
        g2.fillOval(800, 280, 40, 60);  // sombras ovaladas
        
        g2.fillOval(960, 300, 40, 60);  // sombras ovaladas
        g2.fillOval(1050, 190, 40, 60);  // sombras ovaladas
        
        ImageIcon img = new ImageIcon("planta2.png");
		Image imagen=img.getImage();		
		g2.drawImage(imagen, 825, 390, 90, 100, null);
		
		ImageIcon img_mario = new ImageIcon("mario.png");
		Image imagen_mario=img_mario.getImage();		
		g2.drawImage(imagen_mario, 225, 600, 80, 100, null);
        
        
	}*/
	
	
	
	
}
