package practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalButtonUI;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.UnsupportedLookAndFeelException;


public class nos extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 * 
	 */
	
	
	public static void main(String[] args) {
		try {
            // Cambiar el Look and Feel a "Nimbus"
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            nos frame = new nos();
			frame.setVisible(true);
            // O puedes usar otros, por ejemplo:
            // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // Para el look y feel del sistema

        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
		
		
	}

	/**
	 * Create the frame.
	 */
	public nos() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 670);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Universidad Autónoma de Baja California Sur");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 21));
		lblNewLabel.setBounds(118, 56, 437, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sabiduría como meta, patria como destino");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(288, 94, 240, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Sign up\r\n");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(167, 130, 147, 36);
		btnNewButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Log in");
		btnNewButton_1.setUI(new MetalButtonUI());  // Cambiar la UI del botón
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1.setBounds(351, 130, 147, 36);
		btnNewButton_1.repaint();

		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Journey Begins");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(167, 189, 184, 50);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Log in with Open account ");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(167, 249, 160, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\SEARS\\git\\PracticasJava\\Unidad2\\logotipo-de-apple.png"));
		btnNewButton_2.setBounds(167, 283, 98, 32);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\SEARS\\git\\PracticasJava\\Unidad2\\cromo.png"));
		btnNewButton_2_1.setBounds(281, 283, 103, 32);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.setIcon(new ImageIcon("C:\\Users\\SEARS\\git\\PracticasJava\\Unidad2\\medios-de-comunicacion-social.png"));
		btnNewButton_2_2.setBounds(400, 283, 98, 32);
		contentPane.add(btnNewButton_2_2);
		
		JLabel lblNewLabel_4 = new JLabel("Or");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_4.setBounds(312, 340, 39, 13);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setBorder(BorderFactory.createTitledBorder("Username"));
		textField.setBounds(167, 384, 331, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_1.setBorder(BorderFactory.createTitledBorder("password"));
		textField_1.setColumns(10);
		textField_1.setBounds(167, 455, 331, 44);
		contentPane.add(textField_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember me\r\n");
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(167, 517, 113, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_5 = new JLabel("Forgot password?");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(395, 521, 103, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel imagenUser = new JLabel(new ImageIcon("C:\\Users\\SEARS\\Downloads\\logoUABCS (1).png"));
		imagenUser.setBounds(10, 10, 135, 118);
		contentPane.add(imagenUser);
		
		JLabel imagenUser_1 = new JLabel(new ImageIcon("C:\\Users\\SEARS\\Downloads\\uabcs.jpeg"));
		imagenUser_1.setBounds(538, -22, 511, 665);
		contentPane.add(imagenUser_1);
	}
}
