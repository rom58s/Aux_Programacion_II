//Clase Anime
class Anime {
	
	public String nombre;
	public String genero;
	private int nroEpisodios ;
	private String[] episodios ;
	
	
	//constructor
	public Anime(String nombre,String genero,int nroEpisodios){
		this.nombre = nombre;
		this.genero = genero;
		this.nroEpisodios = nroEpisodios;
		this.episodios = new String[nroEpisodios];
	}

}

//Clase Instrumento
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

//Clase Televisor

class Televisor {
	//atributos
	private String marca;
	private int resolucion;
	private String tipo;
	
	//constructor con parametros 
	public Televisor(String marca,int resolucion,String tipo) {
		this.marca = marca;
		this.resolucion = resolucion;
		this.tipo = tipo;
	}
	
	//constructor vacio
	
	public Televisor() {
		
	}

	@Override
	public String toString() {
		return "marca:" + marca + ", resolucion:" + resolucion + ", tipo:" + tipo;
	}
	
}

