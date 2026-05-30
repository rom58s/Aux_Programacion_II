package persona;

class Docente extends Persona {
	
	private int antiguedad;
	private double sueldo;
	
	/*a. Implementar las clases con sus 
	 * respectivos constructores y método para
	   mostrar.*/
	
	public Docente(String nombre,int carnet,int edad,int antiguedad,double sueldo) {
		super(nombre,carnet,edad);
		this.antiguedad = antiguedad;
		this.sueldo = sueldo;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("|antiguedad: "+this.antiguedad+" |sueldo: "+this.sueldo);
	}
	
	
	
	

}
