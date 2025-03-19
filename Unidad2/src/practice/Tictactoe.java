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
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tictactoe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public boolean turno=true;
	public JButton btnNewButton_3,btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_6,
	btnNewButton_5,btnNewButton_4,btnNewButton_8,btnNewButton_7;
	
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
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		btnNewButton_3 = new JButton(" ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno){
					turno=false;
					player="X";

				}else{
					turno=true;
					player="O";
				}
				btnNewButton_3.setText(player);
				btnNewButton_3.setEnabled(false);
				verificar();
			}
		});
		contentPane.add(btnNewButton_3);
		
		btnNewButton_1 = new JButton("  ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno){
					turno=false;
					player="X";

				}else{
					turno=true;
					player="O";
				}
				btnNewButton_1.setText(player);
				btnNewButton_1.setEnabled(false);
				verificar();

			}
		});
		contentPane.add(btnNewButton_1);
		
		btnNewButton = new JButton("   ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno){
					turno=false;
					player="X";

				}else{
					turno=true;
					player="O";
				}
				btnNewButton.setText(player);
				btnNewButton.setEnabled(false);
				verificar();

			}
		});
		contentPane.add(btnNewButton);
		
		btnNewButton_2 = new JButton("    ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno){
					turno=false;
					player="X";

				}else{
					turno=true;
					player="O";
				}
				btnNewButton_2.setText(player);
				btnNewButton_2.setEnabled(false);
				verificar();

			}
		});
		contentPane.add(btnNewButton_2);
		
		btnNewButton_4 = new JButton("     ");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno){
					turno=false;
					player="X";

				}else{
					turno=true;
					player="O";
				}
				btnNewButton_4.setText(player);
				btnNewButton_4.setEnabled(false);
				verificar();

			}
		});
		contentPane.add(btnNewButton_4);
		
		btnNewButton_6 = new JButton("      ");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno){
					turno=false;
					player="X";

				}else{
					turno=true;
					player="O";
				}
				btnNewButton_6.setText(player);
				btnNewButton_6.setEnabled(false);
				verificar();

			}
		});
		contentPane.add(btnNewButton_6);
		
		btnNewButton_5 = new JButton("       ");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno){
					turno=false;
					player="X";

				}else{
					turno=true;
					player="O";
				}
				btnNewButton_5.setText(player);
				btnNewButton_5.setEnabled(false);
				verificar();

			}
		});
		contentPane.add(btnNewButton_5);
		
		btnNewButton_7 = new JButton("        ");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno){
					turno=false;
					player="X";

				}else{
					turno=true;
					player="O";
				}
				btnNewButton_7.setText(player);
				btnNewButton_7.setEnabled(false);
				verificar();

			}
		});
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("         ");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno){
					turno=false;
					player="X";

				}else{
					turno=true;
					player="O";
				}
				btnNewButton_8.setText(player);
				btnNewButton_8.setEnabled(false);
				verificar();

			}
		});
		contentPane.add(btnNewButton_8);
	}
	
	public void verificar() {
		//verificar horizontal
		if(btnNewButton_3.getText().equals(btnNewButton_1.getText())&&btnNewButton_3.getText().equals(btnNewButton.getText()) 
			|| btnNewButton_2.getText().equals(btnNewButton_4.getText())&&btnNewButton_2.getText().equals(btnNewButton_6.getText())
			|| btnNewButton_5.getText().equals(btnNewButton_7.getText())&&btnNewButton_5.getText().equals(btnNewButton_8.getText())) {
			JOptionPane.showMessageDialog(null, "Ganaste");
		}
		//verificar vertical
		if(btnNewButton_3.getText().equals(btnNewButton_2.getText())&&btnNewButton_3.getText().equals(btnNewButton_5.getText()) 
				|| btnNewButton_1.getText().equals(btnNewButton_4.getText())&&btnNewButton_1.getText().equals(btnNewButton_7.getText())
				|| btnNewButton.getText().equals(btnNewButton_6.getText())&&btnNewButton.getText().equals(btnNewButton_8.getText())) {
				JOptionPane.showMessageDialog(null, "Ganaste");
		}
		//verificar diagonal
		if(btnNewButton_3.getText().equals(btnNewButton_4.getText())&&btnNewButton_3.getText().equals(btnNewButton_8.getText()) 
				|| btnNewButton.getText().equals(btnNewButton_4.getText())&&btnNewButton.getText().equals(btnNewButton_5.getText())) {
				JOptionPane.showMessageDialog(null, "Ganaste");
		}
		
		
	}

}
