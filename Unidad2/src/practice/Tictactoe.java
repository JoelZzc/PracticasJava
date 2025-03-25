package practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class Tictactoe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public boolean turno=true;
	public boolean finalizado=false;
	public int contador_x=0;
	public int contador_o=0;
	public JButton btnNewButton_3,btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_6,
	btnNewButton_5,btnNewButton_4,btnNewButton_8,btnNewButton_7;
	private JPanel panel_1;
	private JPanel panel_2;
	public int contador_jugadas = 0;
	private JButton btnNewButton_9;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tictactoe frame = new Tictactoe();
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
	public Tictactoe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setBackground(new Color(255, 243, 56));
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		
		btnNewButton_3 = new JButton(" ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(!finalizado) {
					if(turno){
						turno=false;
						btnNewButton_3.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/x.png")));
						player="X";
	
					}else{
						turno=true;
						btnNewButton_3.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/circulo.png")));
						player="O";
	
					}
					btnNewButton_3.setText(player);
					btnNewButton_3.setEnabled(false);
					contador_jugadas++; 
					verificar();
				}else {
					JOptionPane.showMessageDialog(null,"El juego a terminado" );
				}
			}
		});
		panel.add(btnNewButton_3);
		
		btnNewButton_1 = new JButton("  ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(!finalizado) {
					if(turno){
						turno=false;
						btnNewButton_1.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/x.png")));
						player="X";
	
	
					}else{
						turno=true;
						btnNewButton_1.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/circulo.png")));
						player="O";
	
					}
					btnNewButton_1.setText(player);
					btnNewButton_1.setEnabled(false);
					contador_jugadas++; 
					verificar();
				}else {
					JOptionPane.showMessageDialog(null,"El juego a terminado" );
				}
			}
		});
		panel.add(btnNewButton_1); //7
		
		btnNewButton = new JButton("   ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(!finalizado) {
					if(turno){
						turno=false;
						btnNewButton.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/x.png")));
						player="X";
	
					}else{
						turno=true;
						btnNewButton.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/circulo.png")));
						player="O";
	
					}
					btnNewButton.setText(player);
					btnNewButton.setEnabled(false);
					contador_jugadas++; 
					verificar();
				}else {
					JOptionPane.showMessageDialog(null,"El juego a terminado" );
				}
			}
		});
		panel.add(btnNewButton);
		
		btnNewButton_2 = new JButton("    ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(!finalizado) {
					if(turno){
						turno=false;
						btnNewButton_2.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/x.png")));
						player="X";
					}else{
						turno=true;
						btnNewButton_2.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/circulo.png")));
						player="O";
					}
					btnNewButton_2.setText(player);
					btnNewButton_2.setEnabled(false);
					contador_jugadas++; 
					verificar();
				}else {
					JOptionPane.showMessageDialog(null,"El juego a terminado" );
				}

			}
		});
		panel.add(btnNewButton_2);
		
		btnNewButton_4 = new JButton("     ");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(!finalizado) {
					if(turno){
						turno=false;
						btnNewButton_4.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/x.png")));
						player="X";
					}else{
						turno=true;
						btnNewButton_4.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/circulo.png")));
						player="O";
					}
					btnNewButton_4.setText(player);
					btnNewButton_4.setEnabled(false);
					contador_jugadas++; 
					verificar();
				}else {
					JOptionPane.showMessageDialog(null,"El juego a terminado" );
				}

			}
		});
		panel.add(btnNewButton_4);
		
		btnNewButton_6 = new JButton("      ");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(!finalizado) {
					if(turno){
						turno=false;
						btnNewButton_6.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/x.png")));
						player="X";
					}else{
						turno=true;
						btnNewButton_6.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/circulo.png")));
						player="O";
					}
					btnNewButton_6.setText(player);
					btnNewButton_6.setEnabled(false);
					contador_jugadas++; 
					verificar();
				}else {
					JOptionPane.showMessageDialog(null,"El juego a terminado" );
				}

			}
		});
		panel.add(btnNewButton_6);
		
		btnNewButton_5 = new JButton("       ");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(!finalizado) {
					if(turno){
						turno=false;
						btnNewButton_5.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/x.png")));
						player="X";
	
					}else{
						turno=true;
						btnNewButton_5.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/circulo.png")));
						player="O";
	
					}
					btnNewButton_5.setText(player);
					btnNewButton_5.setEnabled(false);
					contador_jugadas++; 
					verificar();
				}else {
					JOptionPane.showMessageDialog(null,"El juego a terminado" );

				}

			}
		});
		panel.add(btnNewButton_5);
		
		btnNewButton_7 = new JButton("        ");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(!finalizado) {
					if(turno){
						turno=false;
						btnNewButton_7.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/x.png")));
						player="X";
	
					}else{
						turno=true;
						btnNewButton_7.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/circulo.png")));
						player="O";
					}
					btnNewButton_7.setText(player);
					btnNewButton_7.setEnabled(false);
					contador_jugadas++; 
					verificar();
				}else {
					JOptionPane.showMessageDialog(null,"El juego a terminado" );

				}

			}
		});
		panel.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("         ");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(!finalizado) {
					if(turno){
						turno=false;
						btnNewButton_8.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/x.png")));
						player="X";
	
					}else{
						turno=true;
						btnNewButton_8.setIcon(new ImageIcon(Tictactoe.class.getResource("/practice/circulo.png")));
						player="O";
					}
					btnNewButton_8.setText(player);
					btnNewButton_8.setEnabled(false);
					contador_jugadas++; 
					verificar();
				}else {
					JOptionPane.showMessageDialog(null,"El juego a terminado" );
				}

			}
		});
		panel.add(btnNewButton_8);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(74, 191, 249));
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("X:"+contador_x+"                                         ");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		panel_1.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("                           O:"+contador_o);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel_1.add(lblNewLabel_1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(165, 254, 37));
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		btnNewButton_9 = new JButton("Reiniciar");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciar();
			}
		});
		btnNewButton_9.setFont(new Font("Arial", Font.PLAIN, 16));
		panel_2.add(btnNewButton_9);
	}
	
	public void verificar() {
		//verificar horizontal
		if(btnNewButton_3.getText().equals(btnNewButton_1.getText())&&btnNewButton_3.getText().equals(btnNewButton.getText()) 
			|| btnNewButton_2.getText().equals(btnNewButton_4.getText())&&btnNewButton_2.getText().equals(btnNewButton_6.getText())
			|| btnNewButton_5.getText().equals(btnNewButton_7.getText())&&btnNewButton_5.getText().equals(btnNewButton_8.getText())) {
			JOptionPane.showMessageDialog(null, "Ganaste");
			if(turno) {
				contador_x++;
			}else {
				contador_o++;
			}
			finalizado=true;

		}
		//verificar vertical
		if(btnNewButton_3.getText().equals(btnNewButton_2.getText())&&btnNewButton_3.getText().equals(btnNewButton_5.getText()) 
				|| btnNewButton_1.getText().equals(btnNewButton_4.getText())&&btnNewButton_1.getText().equals(btnNewButton_7.getText())
				|| btnNewButton.getText().equals(btnNewButton_6.getText())&&btnNewButton.getText().equals(btnNewButton_8.getText())) {
				JOptionPane.showMessageDialog(null, "Ganaste");
				if(turno) {
					contador_x++;
				}else {
					contador_o++;
				}
				finalizado=true;
		}
		//verificar diagonal
		if(btnNewButton_3.getText().equals(btnNewButton_4.getText())&&btnNewButton_3.getText().equals(btnNewButton_8.getText()) 
				|| btnNewButton.getText().equals(btnNewButton_4.getText())&&btnNewButton.getText().equals(btnNewButton_5.getText())) {
				JOptionPane.showMessageDialog(null, "Ganaste");
				if(turno) {
					contador_x++;
				}else {
					contador_o++;
				}
				finalizado=true;

		}
        if (contador_jugadas == 9 && !finalizado) {
            JOptionPane.showMessageDialog(null, "¡Es un empate!");
            finalizado = true;
        }
	}
	
	public void reiniciar() {
		btnNewButton.setEnabled(true);
	    btnNewButton.setIcon(null);
	    btnNewButton.setText("");
	    
	    btnNewButton_1.setEnabled(true);
	    btnNewButton_1.setIcon(null);
	    btnNewButton_1.setText(" ");
	    
	    btnNewButton_2.setEnabled(true);
	    btnNewButton_2.setIcon(null);
	    btnNewButton_2.setText("  ");
	    
	    btnNewButton_3.setEnabled(true);
	    btnNewButton_3.setIcon(null);
	    btnNewButton_3.setText("   ");
	    
	    btnNewButton_4.setEnabled(true);
	    btnNewButton_4.setIcon(null);
	    btnNewButton_4.setText("     ");
	    
	    btnNewButton_5.setEnabled(true);
	    btnNewButton_5.setIcon(null);
	    btnNewButton_5.setText("      ");
	    
	    btnNewButton_6.setEnabled(true);
	    btnNewButton_6.setIcon(null);
	    btnNewButton_6.setText("       ");
	    
	    btnNewButton_7.setEnabled(true);
	    btnNewButton_7.setIcon(null);
	    btnNewButton_7.setText("        ");
	    
	    btnNewButton_8.setEnabled(true);
	    btnNewButton_8.setIcon(null);
	    btnNewButton_8.setText("         ");
		finalizado=false;
		turno=true;
		contador_jugadas = 0;
	}
	

}
