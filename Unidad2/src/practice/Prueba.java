package practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import java.awt.Insets;
import javax.swing.JMenuItem;

public class Prueba extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtJoel;
	private JTextField txtZazueta;
	private JTextField txtCarrillo;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
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
	public Prueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_registro = new JPanel();
		panel_registro.setBorder(new LineBorder(new Color(255, 255, 255,15)));
		panel_registro.setBackground(new Color(128, 255, 0));
		contentPane.add(panel_registro, BorderLayout.NORTH);
		panel_registro.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE USUARIO");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		panel_registro.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 255, 255,15)));
		panel_1.setBackground(new Color(128, 255, 0));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel panel_datosgenerales = new JPanel();
		panel_datosgenerales.setBorder(new TitledBorder(null, "Datos Generales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_datosgenerales.setBackground(new Color(0, 128, 192));
		panel_1.add(panel_datosgenerales);
		panel_datosgenerales.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Nombres: ");
		lblNewLabel_3.setBounds(105, 47, 48, 13);
		panel_datosgenerales.add(lblNewLabel_3);
		
		txtJoel = new JTextField();
		txtJoel.setBounds(170, 44, 96, 19);
		txtJoel.setText("Joel");
		panel_datosgenerales.add(txtJoel);
		txtJoel.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido paterno");
		lblNewLabel_4.setBounds(86, 80, 74, 13);
		panel_datosgenerales.add(lblNewLabel_4);
		
		txtZazueta = new JTextField();
		txtZazueta.setText("Zazueta");
		txtZazueta.setBounds(170, 77, 96, 19);
		panel_datosgenerales.add(txtZazueta);
		txtZazueta.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Apellido Materno\r\n");
		lblNewLabel_5.setBounds(80, 116, 77, 13);
		panel_datosgenerales.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha Nacimineto");
		lblNewLabel_6.setBounds(68, 151, 96, 13);
		panel_datosgenerales.add(lblNewLabel_6);
		
		txtCarrillo = new JTextField();
		txtCarrillo.setText("Carrillo");
		txtCarrillo.setBounds(170, 113, 96, 19);
		panel_datosgenerales.add(txtCarrillo);
		txtCarrillo.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Sexo");
		lblNewLabel_7.setBounds(115, 204, 45, 13);
		panel_datosgenerales.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setText("11/09/2005");
		textField_3.setBounds(170, 148, 96, 19);
		panel_datosgenerales.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Nacionalidad");
		lblNewLabel_8.setBounds(86, 256, 92, 13);
		panel_datosgenerales.add(lblNewLabel_8);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBounds(170, 184, 74, 21);
		panel_datosgenerales.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBounds(170, 218, 71, 21);
		panel_datosgenerales.add(rdbtnNewRadioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Peru", "colombia", "méxico", "España"}));
		comboBox.setSelectedIndex(3);
		comboBox.setToolTipText("");
		comboBox.setBounds(170, 252, 114, 21);
		panel_datosgenerales.add(comboBox);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Perfil de Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel imagenUser = new JLabel(new ImageIcon("user.png"));
		imagenUser.setLocation(125, 21);
		imagenUser.setSize(160,160);
		panel_3.add(imagenUser);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil\r\n");
		chckbxNewCheckBox.setBounds(126, 187, 159, 21);
		panel_3.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar fecha de nacimiento \r\n");
		chckbxNewCheckBox_1.setBounds(126, 227, 159, 21);
		panel_3.add(chckbxNewCheckBox_1);
		
		JPanel panel_datos_opcionales = new JPanel();
		panel_datos_opcionales.setBorder(new TitledBorder(null, "Datos Opcionales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_datos_opcionales.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_datos_opcionales);
		panel_datos_opcionales.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Descripción");
		lblNewLabel_1.setBounds(41, 51, 52, 13);
		panel_datos_opcionales.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Preferencias");
		lblNewLabel_2.setBounds(300, 51, 57, 13);
		panel_datos_opcionales.add(lblNewLabel_2);
		
		JTextArea txtrHolaAmigosDe = new JTextArea();
		txtrHolaAmigosDe.setText("Hola amigos de youtube \r\ngracias por \r\ncompratir mis videos");
		txtrHolaAmigosDe.setDropMode(DropMode.ON);
		txtrHolaAmigosDe.setWrapStyleWord(true);
		txtrHolaAmigosDe.setBounds(23, 91, 181, 98);
		panel_datos_opcionales.add(txtrHolaAmigosDe);
		
		JList list = new JList();
		list.setBackground(new Color(255, 255, 255));
		list.setValueIsAdjusting(true);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Cantar,", "Escuchar Musica,", "Leer,", "Deportes,", "Otros"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectedIndex(8);
		list.setBounds(292, 74, 80, 168);
		panel_datos_opcionales.add(list);
		
		JPanel panel_botones = new JPanel();
		panel_botones.setBackground(new Color(255, 128, 192));
		panel_1.add(panel_botones);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setBounds(150, 80, 94, 34);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_botones.setLayout(null);
		panel_botones.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setBounds(150, 142, 94, 34);
		panel_botones.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setBounds(150, 203, 94, 34);
		panel_botones.add(btnNewButton_2);
	}
}
