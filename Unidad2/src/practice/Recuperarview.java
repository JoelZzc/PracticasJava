package practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Recuperarview extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recuperarview frame = new Recuperarview();
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
	public Recuperarview() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 202, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dar de baja");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(145, 35, 121, 49);
		contentPane.add(lblNewLabel);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVolver.setBounds(39, 257, 141, 34);
		contentPane.add(btnVolver);
		
		JButton btnNewButton_1_1 = new JButton("Siguiente");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(216, 257, 141, 34);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Para poder crear una cuenta es necesesario que \r\ningreses tus datos en los siguientes campos\r\n");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(63, 93, 535, 71);
		contentPane.add(lblNewLabel_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(63, 128, 156, 19);
		contentPane.add(textPane);
		
		JTextArea txtrParaPoderCrear = new JTextArea();
		txtrParaPoderCrear.setText("Para poder crear una cuenta es necesesario que \r\ningreses tus datos en los siguientes campos");
		txtrParaPoderCrear.setBounds(67, 98, 381, 49);
		contentPane.add(txtrParaPoderCrear);
	}
}
