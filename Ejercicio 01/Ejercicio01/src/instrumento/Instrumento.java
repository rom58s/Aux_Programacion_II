package instrumento;

class Instrumento {
	public String nombre;
	private String materia;
	private String tipo;
	
	Instrumento(String nombre,String materia,String tipo){
		this.nombre = nombre;
		this.materia = materia;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "nombre:" + nombre + ", materia:" + materia + ", tipo:" + tipo;
	}
	
	//getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
