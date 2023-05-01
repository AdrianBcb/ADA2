package clases;

public class aerolineas {
String nombre;
int costo_primeraclase;
int costo_mm;
int asientos_primeraclase;
int asientos_turista;



public aerolineas(String nombre, int costo_primeraclase, int costo_mm, int asientos_primeraclase,
		int asientos_turista) {
	this.nombre = nombre;
	this.costo_primeraclase = costo_primeraclase;
	this.costo_mm = costo_mm;
	this.asientos_primeraclase = asientos_primeraclase;
	this.asientos_turista = asientos_turista;
}
public String getNombre() {
	return nombre;
}
public int getCosto_primeraclase() {
	return costo_primeraclase;
}
public int getCosto_mm() {
	return costo_mm;
}
public int getAsientos_primeraclase() {
	return asientos_primeraclase;
}
public int getAsientos_turista() {
	return asientos_turista;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void setCosto_primeraclase(int costo_primeraclase) {
	this.costo_primeraclase = costo_primeraclase;
}
public void setCosto_mm(int costo_mm) {
	this.costo_mm = costo_mm;
}
public void setAsientos_primeraclase(int asientos_primeraclase) {
	this.asientos_primeraclase = asientos_primeraclase;
}
public void setAsientos_turista(int asientos_turista) {
	this.asientos_turista = asientos_turista;
}

}
