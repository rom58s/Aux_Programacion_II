package biblioteca;

class Libro {
	/*a.Implementar las clases con sus constructores y 
	 * métodos necesarios de la agregación.*/

	private String nombre;
	private String autor;
	private int anio;//año
	
	public Libro(String nombre,String autor,int anio) {
		this.nombre = nombre;
		this.autor = autor;
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "nombre:" + nombre + ", autor:" + autor + ", anio:" + anio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
