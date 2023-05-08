package clases;
//clase.para.escribir.en.documentoDB
public class registro_vuelos {
	String nombre;
	String aerolinea;
	String Fecha;
	int Costo;
	String hora;
	String destino;
	String origen;
	String cantp;
	String cantt;
	
public registro_vuelos(String nombre, String object, String object2, String object3, String object4,
		String object5,String cantp,String cantt, int costo) {
this.nombre = nombre;
aerolinea =  object;
origen= object3;
destino= object2;
this.Fecha= object4;
this.hora=object5;
this.Costo= costo;
this.cantp= cantp;
this.cantt=cantt;

}
public String getNombre() {
	return nombre;
}
public String getAerolinea() {
	return aerolinea;
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
public String getDestino() {
	return destino;
}
public String getOrigen() {
	return origen;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void setAerolinea(String aerolinea) {
	this.aerolinea = aerolinea;
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
public void setDestino(String destino) {
	this.destino = destino;
}
public void setOrigen(String origen) {
	this.origen = origen;
}
public String getCantp() {
	return cantp;
}
public String getCantt() {
	return cantt;
}
public void setCantp(String cantp) {
	this.cantp = cantp;
}
public void setCantt(String cantt) {
	this.cantt = cantt;
}

	


}
