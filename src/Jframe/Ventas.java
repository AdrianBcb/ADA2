package Jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.aerolineas;
import clases.ciudades;
import clases.personas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class Ventas extends JFrame {
	//private aerolineas aerolineas;

	private aerolineas aerolineas;
	aerolineas [] avioncitosAerolineas = new aerolineas[] {
		aerolineas = new aerolineas("AeroMéxico", 1500, 750, 60, 150),
		aerolineas = new aerolineas("Turismax", 1000, 500, 50, 100)	

	};
	
	private ciudades ciudades;
	ciudades[] destino = new ciudades[] {
		ciudades = new ciudades("DCMX", true),
		ciudades = new ciudades("Puebla", true),
		ciudades = new ciudades("Nuevo León", true),
		ciudades = new ciudades("Guanajuato", true),
		ciudades = new ciudades("Ecatepec", true)	,
		ciudades = new ciudades("Quintana Roo", true)	,
		ciudades = new ciudades("Cancun", true)	,
		ciudades = new ciudades("Villa hermosa", true)	
		
	};
	ciudades[] origen = new ciudades[] {
		ciudades = new ciudades("Mérida", true),
		ciudades = new ciudades("Cancún", true),
		ciudades = new ciudades("Hobonil", true),
		ciudades = new ciudades("Merida", true)
	};
	private JPanel contentPane;
	public personas p = new personas();
	
	private DefaultComboBoxModel  modelo = new DefaultComboBoxModel();

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
		setTitle("Vuelos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(103, 172, 184));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_reservar = new JButton("Reservar vuelo");
		btn_reservar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_reservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 
			}
		});
		btn_reservar.setBounds(98, 413, 170, 29);
		contentPane.add(btn_reservar);
		
		JComboBox comboBox_destino = new JComboBox();
		comboBox_destino.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_destino.setBounds(142, 87, 237, 29);
		//////////////////////////////////////////////////////////////
	//haciendo esta cosa
	    for(int i=0; i< destino.length;i++){	    
	    	comboBox_destino.addItem(destino[i].getNombres());

	    };
		//comboBox_destino.addItem("");
		
		contentPane.add(comboBox_destino);
		
		JLabel lblNewLabel = new JLabel("Origen");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(32, 37, 85, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Destino");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(32, 87, 90, 29);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox_origen = new JComboBox();
		comboBox_origen.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_origen.setBounds(142, 37, 237, 29);
		   for(int i=0; i< origen.length;i++){	    
		    	comboBox_origen.addItem(origen[i].getNombres());
		   };
		contentPane.add(comboBox_origen);
		
		JComboBox comboAerolinea = new JComboBox();
		comboAerolinea.setFont(new Font("Arial", Font.PLAIN, 14));
		comboAerolinea.setBounds(142, 143, 237, 29);
		   for(int i=0; i< avioncitosAerolineas.length;i++){	    
		    	comboAerolinea.addItem(avioncitosAerolineas[i].getNombre());
		   };
		contentPane.add(comboAerolinea);
		
		JLabel lblNewLabel_1_1 = new JLabel("Aerolinea");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(32, 143, 90, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Costos:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(68, 202, 90, 29);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Primera Clase");
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_2.setBounds(212, 211, 110, 29);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel precio_primeraclase = new JLabel("**");
		precio_primeraclase.setForeground(Color.WHITE);
		precio_primeraclase.setFont(new Font("Arial", Font.BOLD, 14));
		precio_primeraclase.setBounds(332, 211, 61, 29);
		contentPane.add(precio_primeraclase);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Turista");
		lblNewLabel_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_2_2.setBounds(212, 246, 90, 29);
		contentPane.add(lblNewLabel_1_1_2_2);
		
		JLabel precio_turista = new JLabel("**");
		precio_turista.setForeground(Color.WHITE);
		precio_turista.setFont(new Font("Arial", Font.BOLD, 14));
		precio_turista.setBounds(332, 246, 61, 29);
		contentPane.add(precio_turista);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Fecha");
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_3.setBounds(32, 296, 90, 29);
		contentPane.add(lblNewLabel_1_1_3);
		
		JComboBox comboPrimera = new JComboBox();
		comboPrimera.setFont(new Font("Arial", Font.PLAIN, 14));
		comboPrimera.setBounds(403, 211, 55, 29);
		contentPane.add(comboPrimera);
		
		JComboBox comboTurista = new JComboBox();
		comboTurista.setFont(new Font("Arial", Font.PLAIN, 14));
		comboTurista.setBounds(403, 246, 55, 29);
		contentPane.add(comboTurista);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Horario");
		lblNewLabel_1_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_3_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_3_1.setBounds(32, 335, 90, 29);
		contentPane.add(lblNewLabel_1_1_3_1);
		
		JComboBox comboFecha = new JComboBox();
		comboFecha.setFont(new Font("Arial", Font.PLAIN, 14));
		comboFecha.setBounds(142, 285, 186, 29);
		contentPane.add(comboFecha);
		
		JComboBox comboHorario = new JComboBox();
		comboHorario.setFont(new Font("Arial", Font.PLAIN, 14));
		comboHorario.setBounds(142, 335, 157, 29);
		contentPane.add(comboHorario);
		
		JButton btn_reservar_1 = new JButton("_____");
		btn_reservar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_reservar_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_reservar_1.setBounds(332, 413, 170, 29);
		contentPane.add(btn_reservar_1);
	}
}
