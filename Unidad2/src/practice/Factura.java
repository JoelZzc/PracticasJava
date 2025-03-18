package practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Factura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factura frame = new Factura();
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
	public Factura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0,102,153,255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("<html>Factura en JAVA - NetBeans - Arraylist y POO<br>\r\n[Sin base de datos]");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 0, 588, 89);
		panel_1.setBorder(new TitledBorder(null, "Datos del cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Documentos:");
		lblNewLabel_1.setBounds(69, 22, 70, 14);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(164, 20, 96, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre:");
		lblNewLabel_1_1.setBounds(323, 22, 45, 14);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(394, 20, 96, 19);
		textField_1.setColumns(10);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Dirección:");
		lblNewLabel_1_1_1.setBounds(86, 64, 53, 14);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_1.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(164, 62, 96, 19);
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Teléfono:");
		lblNewLabel_1_1_1_1.setBounds(323, 64, 48, 14);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_1.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(394, 62, 96, 19);
		textField_3.setColumns(10);
		panel_1.add(textField_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 99, 588, 76);
		panel_2.setBorder(new TitledBorder(null, "Datos de factura", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("N° Factura: ");
		lblNewLabel_1_2.setBounds(53, 30, 62, 14);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("1");
		lblNewLabel_1_3.setBounds(139, 30, 17, 14);
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 12));
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Fecha: ");
		lblNewLabel_1_4.setBounds(301, 30, 39, 14);
		lblNewLabel_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_2.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("17/03/2025");
		lblNewLabel_1_5.setBounds(372, 30, 82, 14);
		lblNewLabel_1_5.setFont(new Font("Arial", Font.BOLD, 12));
		panel_2.add(lblNewLabel_1_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(255, 255, 255));
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBounds(10, 185, 588, 30);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Ver listado de facturas\r\n");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(59, 10, 137, 14);
		panel_3.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Añadir");
		lblNewLabel_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBounds(440, 10, 51, 14);
		panel_3.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Eliminar\r\n");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1_1.setBounds(527, 11, 51, 14);
		panel_3.add(lblNewLabel_1_2_1_1_1);
		
		JLabel imagenUser = new JLabel(new ImageIcon("C:\\Users\\SEARS\\Downloads\\agregar.png"));
		imagenUser.setBounds(395, 0, 51, 33);
		panel_3.add(imagenUser);
		
		JLabel imagenUser_1 = new JLabel(new ImageIcon("C:\\Users\\SEARS\\Downloads\\eliminar.png"));
		imagenUser_1.setBounds(484, 0, 51, 33);
		panel_3.add(imagenUser_1);
		
		JLabel imagenUser_2 = new JLabel(new ImageIcon("C:\\Users\\SEARS\\Downloads\\lista.png"));
		imagenUser_2.setBounds(-2, 0, 51, 33);
		panel_3.add(imagenUser_2);
		
		String[] columnNames= {
				"Producto",
				"Cantidad",
				"Valor",
				"Sub Total",
		};
		
		Object[][]data= {
				{"Producto","Cantidad", "Valor","Sub Total"},
				{"Agua",2, 500, 1000.0},
				{"Cereal", 5, 1000,5000.0},
				{"Leche", 2, 300,6000.0},
		};		
		
		table = new JTable(data,columnNames);
		table.setBounds(10, 237, 588, 76);
		panel.add(table);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("SubTotal:");
		lblNewLabel_1_2_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(22, 336, 62, 14);
		panel.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("% Descuento:");
		lblNewLabel_1_2_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2_3.setBounds(22, 376, 84, 14);
		panel.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("IVA 19%:");
		lblNewLabel_1_2_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2_4.setBounds(22, 411, 62, 14);
		panel.add(lblNewLabel_1_2_4);
		
		JLabel lblNewLabel_1_2_5 = new JLabel("Total Factura:");
		lblNewLabel_1_2_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2_5.setBounds(22, 445, 99, 14);
		panel.add(lblNewLabel_1_2_5);
		
		textField_4 = new JTextField();
		textField_4.setText("5");
		textField_4.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(131, 374, 39, 19);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("6600.0");
		lblNewLabel_1_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_3_1.setBounds(129, 337, 62, 14);
		panel.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("1254.0");
		lblNewLabel_1_3_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_3_2.setBounds(131, 412, 60, 14);
		panel.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("7534.0");
		lblNewLabel_1_3_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_3_3.setBounds(131, 446, 70, 14);
		panel.add(lblNewLabel_1_3_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(191, 373, 33, 21);
		panel.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Valor descontado:\r\n");
		lblNewLabel_1_2_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1.setBounds(244, 377, 111, 14);
		panel.add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("330.0");
		lblNewLabel_1_3_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_3_1_1.setBounds(365, 376, 51, 14);
		panel.add(lblNewLabel_1_3_1_1);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		btnNewButton.setBounds(360, 474, 123, 21);
		panel.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(493, 474, 99, 21);
		panel.add(btnLimpiar);
		
	}
}
