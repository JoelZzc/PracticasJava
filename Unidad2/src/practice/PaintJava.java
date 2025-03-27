package practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSlider;

public class PaintJava extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaintJava frame = new PaintJava();
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
	public PaintJava() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 608);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(343, 27, 671, 521);
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(40, 27, 263, 521);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Shapes");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(42, 21, 74, 22);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Rectangle");
		btnNewButton.setIcon(new ImageIcon(PaintJava.class.getResource("/practice/rectangulo.png")));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(42, 53, 113, 27);
		panel.add(btnNewButton);
		
		JButton btnCircle = new JButton("Circle  ");
		btnCircle.setIcon(new ImageIcon(PaintJava.class.getResource("/practice/registro.png")));
		btnCircle.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCircle.setBounds(42, 92, 113, 27);
		panel.add(btnCircle);
		
		JButton btnNewButton_1_1 = new JButton("  Triangle");
		btnNewButton_1_1.setIcon(new ImageIcon(PaintJava.class.getResource("/practice/triangulo.png")));
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(42, 129, 113, 27);
		panel.add(btnNewButton_1_1);
		
		JLabel lblOptions = new JLabel("Options");
		lblOptions.setFont(new Font("Arial", Font.PLAIN, 18));
		lblOptions.setBounds(42, 180, 74, 22);
		panel.add(lblOptions);
		
		JButton btnBrush = new JButton("Brush");
		btnBrush.setIcon(new ImageIcon(PaintJava.class.getResource("/practice/pincel-de-arte.png")));
		btnBrush.setFont(new Font("Arial", Font.PLAIN, 12));
		btnBrush.setBounds(42, 212, 113, 27);
		panel.add(btnBrush);
		
		JButton btnEraser = new JButton("Eraser");
		btnEraser.setIcon(new ImageIcon(PaintJava.class.getResource("/practice/herramienta-de-borrador.png")));
		btnEraser.setFont(new Font("Arial", Font.PLAIN, 12));
		btnEraser.setBounds(42, 249, 113, 27);
		panel.add(btnEraser);
		
		JButton btnFillColor = new JButton("Fill color");
		btnFillColor.setIcon(new ImageIcon(PaintJava.class.getResource("/practice/rectangulo.png")));
		btnFillColor.setFont(new Font("Arial", Font.PLAIN, 12));
		btnFillColor.setBounds(42, 286, 113, 27);
		panel.add(btnFillColor);
		
		JSlider slider = new JSlider();
		slider.setBounds(42, 323, 200, 26);
		panel.add(slider);
		
		JLabel lblColors = new JLabel("Colors");
		lblColors.setFont(new Font("Arial", Font.PLAIN, 18));
		lblColors.setBounds(42, 359, 74, 22);
		panel.add(lblColors);
		
		JButton btnCircle_1 = new JButton("");
		btnCircle_1.setBackground(new Color(255, 255, 255));
		btnCircle_1.setIcon(null);
		btnCircle_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCircle_1.setBounds(24, 391, 28, 27);
		panel.add(btnCircle_1);
		
		JButton btnCircle_1_1 = new JButton("");
		btnCircle_1_1.setBackground(new Color(0, 128, 255));
		btnCircle_1_1.setIcon(null);
		btnCircle_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCircle_1_1.setBounds(62, 391, 28, 27);
		panel.add(btnCircle_1_1);
		
		JButton btnCircle_1_2 = new JButton("");
		btnCircle_1_2.setBackground(new Color(0, 0, 0));
		btnCircle_1_2.setIcon(null);
		btnCircle_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCircle_1_2.setBounds(100, 391, 28, 27);
		panel.add(btnCircle_1_2);
		
		JButton btnCircle_1_3 = new JButton("");
		btnCircle_1_3.setBackground(new Color(128, 128, 128));
		btnCircle_1_3.setIcon(null);
		btnCircle_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCircle_1_3.setBounds(138, 391, 28, 27);
		panel.add(btnCircle_1_3);
		
		JButton btnCircle_1_4 = new JButton("");
		btnCircle_1_4.setBackground(new Color(255, 0, 0));
		btnCircle_1_4.setIcon(null);
		btnCircle_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCircle_1_4.setBounds(176, 391, 28, 27);
		panel.add(btnCircle_1_4);
		
		JButton btnCircle_1_5 = new JButton("");
		btnCircle_1_5.setBackground(new Color(0, 255, 64));
		btnCircle_1_5.setIcon(null);
		btnCircle_1_5.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCircle_1_5.setBounds(214, 391, 28, 27);
		panel.add(btnCircle_1_5);
		
		JButton btnNewButton_1 = new JButton("Clear canvas");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton_1.setBounds(42, 443, 187, 27);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Save as image");
		btnNewButton_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton_1_2.setBounds(42, 484, 187, 27);
		panel.add(btnNewButton_1_2);
	}
}
