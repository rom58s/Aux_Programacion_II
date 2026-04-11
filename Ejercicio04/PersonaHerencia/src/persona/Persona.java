package persona;

class Persona {
	
	protected String nombre;
	protected int carnet;
	protected int edad;
	
	/*a. Implementar las clases con sus 
	 * respectivos constructores y método para
	   mostrar.*/
	
	public Persona(String nombre,int carnet,int edad){
		this.nombre = nombre;
		this.carnet = carnet;
		this.edad = edad;
	}
	
	public void mostrar() {
		System.out.println("\n|Nombre: "+this.nombre+" |carnet: "+this.carnet+ " |edad: "+this.edad);
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	

}
