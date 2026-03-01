package television;

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
