package clases;

public class ciudades {
String nombres;
boolean disponibilidad;


public ciudades(String nombres, boolean disponibilidad) {
	super();
	this.nombres = nombres;
	this.disponibilidad = disponibilidad;
}
public String getNombres() {
	return nombres;
}
public boolean isDisponibilidad() {
	return disponibilidad;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public void setDisponibilidad(boolean disponibilidad) {
	this.disponibilidad = disponibilidad;
}

}
