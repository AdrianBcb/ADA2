package Jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.aerolineas;
import clases.ciudades;
import clases.manejoarchivo;
import clases.registro_vuelos;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.io.FileWriter;
import javax.swing.JTextField;

public class Ventas extends JFrame {
	manejoarchivo ma = new manejoarchivo();

	
	//private aerolineas aerolineas;
	private aerolineas aerolineas;
	aerolineas [] avioncitosAerolineas = new aerolineas[] {
		aerolineas = new aerolineas("AeroMéxico",1500, 750, 60, 150, "10/05/2023","16:00pm"),
		aerolineas = new aerolineas("Turismax", 1000, 500, 50, 100, "15/06/2023", "15:00pm")	
		
	};
	String[] opciones = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	private ciudades ciudades;
	ciudades[] destino = new ciudades[] {
		ciudades = new ciudades("Seleccione", false),
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
	
	private DefaultComboBoxModel  modelo = new DefaultComboBoxModel();
	private JTextField textField;

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
		
		JLabel precio_primeraclase = new JLabel("**");
		JLabel precio_turista = new JLabel("**");
		JComboBox comboAerolinea = new JComboBox();
		JComboBox comboPrimera = new JComboBox();
		JComboBox comboTurista = new JComboBox();
		JComboBox comboBox_destino = new JComboBox();

		comboBox_destino.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_destino.setBounds(145, 136, 237, 29);
		//haciendo esta cosa
	    for(int i=0; i< destino.length;i++){
	    	comboBox_destino.addItem(destino[i]);
	    };
		//comboBox_destino.addItem("");
		contentPane.add(comboBox_destino);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setForeground(new Color(255, 255, 255));
		lblOrigen.setFont(new Font("Arial", Font.BOLD, 14));
		lblOrigen.setBounds(35, 86, 85, 29);
		contentPane.add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setForeground(new Color(255, 255, 255));
		lblDestino.setFont(new Font("Arial", Font.BOLD, 14));
		lblDestino.setBounds(35, 136, 90, 29);
		contentPane.add(lblDestino);
		
		JComboBox comboBox_origen = new JComboBox();
		comboBox_origen.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_origen.setBounds(145, 86, 237, 29);
		   for(int i=0; i< origen.length;i++){	    
		    	comboBox_origen.addItem(origen[i]);
		   };
		contentPane.add(comboBox_origen);
		
		comboAerolinea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i< avioncitosAerolineas.length;i++){	    
				    if (avioncitosAerolineas[i].getNombre().equals(comboAerolinea.getSelectedItem().toString())) {
						precio_primeraclase.setText(Integer.toString(avioncitosAerolineas[i].getCosto_primeraclase()));
				   		precio_turista.setText(Integer.toString(avioncitosAerolineas[i].getCosto_mm()));
			    	}};
			}
		});
		
		comboAerolinea.setFont(new Font("Arial", Font.PLAIN, 14));
		comboAerolinea.setBounds(145, 192, 237, 29);
		   for(int i=0; i< avioncitosAerolineas.length;i++){	    
		    	comboAerolinea.addItem(avioncitosAerolineas[i]);
		   };
		contentPane.add(comboAerolinea);
		
		JLabel lblAerolinea = new JLabel("Aerolinea");
		lblAerolinea.setForeground(Color.WHITE);
		lblAerolinea.setFont(new Font("Arial", Font.BOLD, 14));
		lblAerolinea.setBounds(35, 192, 90, 29);
		contentPane.add(lblAerolinea);
		JLabel lblNombre = new JLabel("Nombre");

		JLabel lblNewLabel_1_1_1 = new JLabel("Costos:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(73, 231, 90, 29);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblPrimera = new JLabel("Primera Clase");
		lblPrimera.setForeground(Color.WHITE);
		lblPrimera.setFont(new Font("Arial", Font.BOLD, 14));
		lblPrimera.setBounds(201, 242, 110, 29);
		contentPane.add(lblPrimera);
		
		precio_primeraclase.setForeground(Color.WHITE);
		precio_primeraclase.setFont(new Font("Arial", Font.BOLD, 14));
		precio_primeraclase.setBounds(321, 242, 61, 29);
		contentPane.add(precio_primeraclase);
		
		JLabel lblTurista = new JLabel("Turista");
		lblTurista.setForeground(Color.WHITE);
		lblTurista.setFont(new Font("Arial", Font.BOLD, 14));
		lblTurista.setBounds(201, 277, 90, 29);
		contentPane.add(lblTurista);
		
		precio_turista.setForeground(Color.WHITE);
		precio_turista.setFont(new Font("Arial", Font.BOLD, 14));
		precio_turista.setBounds(321, 277, 61, 29);
		contentPane.add(precio_turista);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Arial", Font.BOLD, 14));
		lblFecha.setBounds(35, 327, 90, 29);
		contentPane.add(lblFecha);
		//____________________________________________________________
		comboPrimera.setFont(new Font("Arial", Font.PLAIN, 14));
		comboPrimera.setBounds(392, 242, 99, 29);
		   for(int i=0; i< opciones.length;i++){	    
		    	comboPrimera.addItem(i);

		    };
		contentPane.add(comboPrimera);
		
		comboTurista.setFont(new Font("Arial", Font.PLAIN, 14));
		comboTurista.setBounds(392, 277, 99, 29);
		   for(int i=0; i< opciones.length;i++){	    
		    	comboTurista.addItem(i);

		    };
		contentPane.add(comboTurista);
		
		//_-------------------------------------------------------------------------
		JLabel lblHorario = new JLabel("Horario");
		lblHorario.setForeground(Color.WHITE);
		lblHorario.setFont(new Font("Arial", Font.BOLD, 14));
		lblHorario.setBounds(35, 366, 90, 29);
		contentPane.add(lblHorario);
		
		JComboBox comboFecha = new JComboBox();
		comboFecha.setFont(new Font("Arial", Font.PLAIN, 14));
		comboFecha.setBounds(145, 316, 186, 29);
		 for(int i=0; i< avioncitosAerolineas.length;i++){	    
		    	comboFecha.addItem(avioncitosAerolineas[i].getFecha());
		   };
		contentPane.add(comboFecha);
		
		JComboBox comboHorario = new JComboBox();
		comboHorario.setFont(new Font("Arial", Font.PLAIN, 14));
		comboHorario.setBounds(145, 366, 157, 29);
		 for(int i=0; i< avioncitosAerolineas.length;i++){	    
		    	comboHorario.addItem(avioncitosAerolineas[i].getHora());
		   };
		contentPane.add(comboHorario);
		
		JButton btn_buscar = new JButton("Buscar por nombre");
		btn_buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//EStebotonestabueno
				ma.leer();
				    }
		});
		btn_buscar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_buscar.setBounds(314, 429, 230, 29);
		contentPane.add(btn_buscar);

		JButton btn_reservar = new JButton("Reservar vuelo");
		btn_reservar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_reservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_destino.getSelectedItem().toString().equals("Seleccione")) {
					JOptionPane.showMessageDialog(btn_reservar, "Selecciona un destino");
		    	}else {
		    		int total = (Integer.parseInt(precio_primeraclase.getText())*Integer.parseInt(comboPrimera.getSelectedItem().toString()) )
							+(Integer.parseInt(precio_turista.getText())*Integer.parseInt((comboTurista.getSelectedItem().toString())) );
		    	
		    		registro_vuelos registrar = new registro_vuelos(textField.getText(),comboAerolinea.getSelectedItem().toString(), comboBox_destino.getSelectedItem().toString(), 
		    			comboBox_origen.getSelectedItem().toString(),comboFecha.getSelectedItem().toString(),comboHorario.getSelectedItem().toString(),comboPrimera.getSelectedItem().toString(),
		    			comboTurista.getSelectedItem().toString() , total);
		    		
		    		String textoescribir = 
		    			 lblNombre.getText()    + ": "+  registrar.getNombre() 
		    	+ "\n"+ lblDestino.getText()    + ": "+  registrar.getDestino()
				+ "\n" + lblOrigen.getText()    + ": " + registrar.getOrigen()
				+ "\n" + lblAerolinea.getText() + ": " + registrar.getAerolinea()
				+ "\n" + lblPrimera.getText()   + ": " + registrar.getCantp()
				+ "\n" + lblTurista.getText()   + ": " + registrar.getCantt()
				+ "\n" + lblFecha.getText()     + ": " + registrar.getFecha()
				+ "\n" + lblHorario.getText()   + ": " + registrar.getHora()
				+ "\n" + "Total pagado"         + ": " + registrar.getCosto();
		    		ma.escribir(textoescribir);
		    	}
				
			};
			
		});
		btn_reservar.setBounds(80, 429, 170, 29);
		contentPane.add(btn_reservar);
		
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Arial", Font.BOLD, 14));
		lblNombre.setBounds(35, 31, 85, 29);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setBounds(145, 37, 237, 23);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
