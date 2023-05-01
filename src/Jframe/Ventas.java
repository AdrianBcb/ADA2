package Jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.ciudades;
import clases.personas;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventas extends JFrame {
	
	
	private ciudades ciudades;
	ciudades[] destino = new ciudades[] {
		ciudades = new ciudades("", true),
		ciudades = new ciudades("DCMX", true),
		ciudades = new ciudades("Merida", true),
		ciudades = new ciudades("Merida", true),
		ciudades = new ciudades("Merida", true),
		ciudades = new ciudades("Merida", true)	,
		ciudades = new ciudades("Merida", true)	,
		ciudades = new ciudades("Merida", true)	,
		ciudades = new ciudades("Merida", true)	
		
	};
	ciudades[] origen = new ciudades[] {
		ciudades = new ciudades("Mérida", true),
		ciudades = new ciudades("Cancún", true),
		ciudades = new ciudades("Hobonil", true),
		ciudades = new ciudades("Merida", true)
	};
	private JPanel contentPane;
	public personas p = new personas();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventas frame = new Ventas();
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
	public Ventas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(105, 149, 85, 21);
		contentPane.add(btnNewButton);
	}
}
