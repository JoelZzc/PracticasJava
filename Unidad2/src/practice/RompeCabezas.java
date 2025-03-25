package practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RompeCabezas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ArrayList<Integer> numeros= new ArrayList<Integer>();
	public int[][]tablero= {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
	private JButton[][] botones = new JButton[4][4];

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
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);
        numeros.add(14);
        numeros.add(15);
        numeros.add(0);

        Collections.shuffle(numeros);
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tablero[i][j] = numeros.get(k);
                k++;
            }
        }

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

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int x = i;
                int y = j;
                botones[i][j] = new JButton(tablero[i][j] == 0 ? "" : Integer.toString(tablero[i][j]));
                botones[i][j].setBorder(new LineBorder(Color.decode("#e7c294")));
                botones[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        mover(x, y);
                    }
                });
                panel.add(botones[i][j]);
            }
        }

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.decode("#e7c294"));
        contentPane.add(panel_1, BorderLayout.SOUTH);

        JButton btnNewButton_16 = new JButton("Reiniciar");
        panel_1.add(btnNewButton_16);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.decode("#e7c294"));
        contentPane.add(panel_2, BorderLayout.NORTH);

        JLabel lblNewLabel = new JLabel("Rompe Cabezas");
        lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_2.add(lblNewLabel);
    }

    public void mover(int x, int y) {
        if (tablero[x][y] == 0) {
            return;
        }

        if (x > 0 && tablero[x - 1][y] == 0) {
            intercambiar(x, y, x - 1, y); // Mover arriba
        } else if (x < 3 && tablero[x + 1][y] == 0) {
            intercambiar(x, y, x + 1, y); // Mover abajo
        } else if (y > 0 && tablero[x][y - 1] == 0) {
            intercambiar(x, y, x, y - 1); // Mover izquierda
        } else if (y < 3 && tablero[x][y + 1] == 0) {
            intercambiar(x, y, x, y + 1); // Mover derecha
        }
    }

    public void intercambiar(int x1, int y1, int x2, int y2) {
        int bk = tablero[x1][y1];
        tablero[x1][y1] = tablero[x2][y2];
        tablero[x2][y2] = bk;

        botones[x1][y1].setText(tablero[x1][y1] == 0 ? "" : Integer.toString(tablero[x1][y1]));
        botones[x2][y2].setText(tablero[x2][y2] == 0 ? "" : Integer.toString(tablero[x2][y2]));
    }
}

