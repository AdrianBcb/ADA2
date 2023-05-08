package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class manejoarchivo {
public void escribir (String textoescribir) {
	 try {
         
         FileWriter archivo = new FileWriter("Boleto.txt",true);
      //   BufferedReader reader = new BufferedReader(new FileReader("archivo"));
        // BufferedWriter buffer = new BufferedWriter(archivo);
         archivo.write("\n");
         archivo.write(textoescribir);
         archivo.write("\n");
         archivo.close();
     	JOptionPane.showMessageDialog( null, "El vuelo ha sido reservado");
     } catch (IOException a) {
     	JOptionPane.showMessageDialog(null, "Ha ocurrido un error al guardar el archivo");
         ///System.out.println("Ha ocurrido un error al guardar el archivo.");
         a.printStackTrace();
     		} 		
}

public void leer() {
	try {
		File file = new File("boleto.txt");
	   Scanner scanner = new Scanner(file);					
        String buscando = JOptionPane.showInputDialog("Ingresa el nombre del comprador");
        if (buscando.equals("")) {
			JOptionPane.showMessageDialog(null, "No ingresó nombre para buscar");

        		}else{
        			boolean found = false;
        			while (scanner.hasNextLine()) {
        				String line = scanner.nextLine();
        				if (line.contains(buscando)) {
        					found = true;
        					String textoiimp =line +"\n"+scanner.nextLine()+"\n"+scanner.nextLine()+"\n"+scanner.nextLine()+"\n"
     	        		  +scanner.nextLine()+"\n"+scanner.nextLine()+"\n"+scanner.nextLine()+"\n"
     	        		  +scanner.nextLine()+"\n"+scanner.nextLine()+"\n";
        				JOptionPane.showMessageDialog(null, textoiimp);
     	                }
     	            }
     	            if (!found) {
     	            	JOptionPane.showMessageDialog(null,"El nombre *" + buscando + "* no fue encontrado en el archivo.");
     	            }
     	            scanner.close();
        		}
	 } catch (FileNotFoundException o) {
	   System.out.println("Archivo no encontrado: " + o.getMessage());
	        }
	
}
}
