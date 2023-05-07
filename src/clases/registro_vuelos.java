package clases;
//clase.para.escribir.en.documentoDB
public class registro_vuelos {
	aerolineas origen;
	String Fecha;
	int Costo;
	String hora;
	aerolineas Destino;
	
public registro_vuelos(aerolineas ori, aerolineas dest, String fecha, int costo, String hora) {
this.origen=ori;
this.Destino=dest;
this.Fecha=fecha;
this.hora=hora;
this.Costo=costo;
}

public aerolineas getOrigen() {
	return origen;
}

public String getFecha() {
	return Fecha;
}

public int getCosto() {
	return Costo;
}

public String getHora() {
	return hora;
}

public aerolineas getDestino() {
	return Destino;
}

public void setOrigen(aerolineas origen) {
	this.origen = origen;
}

public void setFecha(String fecha) {
	Fecha = fecha;
}

public void setCosto(int costo) {
	Costo = costo;
}

public void setHora(String hora) {
	this.hora = hora;
}

public void setDestino(aerolineas destino) {
	Destino = destino;
}
	


}
