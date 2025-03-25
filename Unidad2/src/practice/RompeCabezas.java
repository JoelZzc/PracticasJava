package practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;

public class RompeCabezas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RompeCabezas frame = new RompeCabezas();
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
	public RompeCabezas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 731, 568);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#e7c294"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.decode("#e7c294"));
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBorder(new LineBorder(Color.decode("#e7c294")));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBorder(new LineBorder(Color.decode("#e7c294")));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("3");
		btnNewButton_4.setBorder(new LineBorder(Color.decode("#e7c294")));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_12 = new JButton("4");
		btnNewButton_12.setBorder(new LineBorder(Color.decode("#e7c294")));
		panel.add(btnNewButton_12);
		
		JButton btnNewButton = new JButton("5");
		btnNewButton.setBorder(new LineBorder(Color.decode("#e7c294")));
		panel.add(btnNewButton);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBorder(new LineBorder(Color.decode("#e7c294")));

		panel.add(btnNewButton_6);
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.setBorder(new LineBorder(Color.decode("#e7c294")));

		panel.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.setBorder(new LineBorder(Color.decode("#e7c294")));

		panel.add(btnNewButton_5);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.setBorder(new LineBorder(Color.decode("#e7c294")));

		panel.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("10");
		btnNewButton_8.setBorder(new LineBorder(Color.decode("#e7c294")));

		panel.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("11");
		btnNewButton_7.setBorder(new LineBorder(Color.decode("#e7c294")));

		panel.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("12");
		btnNewButton_10.setBorder(new LineBorder(Color.decode("#e7c294")));

		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("13");
		btnNewButton_11.setBorder(new LineBorder(Color.decode("#e7c294")));

		panel.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("14");
		btnNewButton_13.setBorder(new LineBorder(Color.decode("#e7c294")));

		panel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("15");
		btnNewButton_14.setBorder(new LineBorder(Color.decode("#e7c294")));
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.setBorder(new LineBorder(Color.decode("#e7c294")));
		panel.add(btnNewButton_15);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#e7c294"));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton_16 = new JButton("Reiniciar");
		panel_1.add(btnNewButton_16);
	}

}
