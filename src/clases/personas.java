package clases;

public class personas {
	private String nombre;
	 private String apellidos;
	 private String genero;
	 private int edad;
	//constructor
public personas() {
	
}
public personas(String nombre, String apellidos, int edad,String genero ){
			this.nombre=nombre;
			this.genero=genero;
			this.edad=edad;
			this.apellidos=apellidos;
		}
	//métodos
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
}
