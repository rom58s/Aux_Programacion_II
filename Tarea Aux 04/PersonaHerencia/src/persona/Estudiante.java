package persona;

class Estudiante extends Persona{
	
	private int matricula;
	private String carrera;
	
	/*a. Implementar las clases con sus 
	 * respectivos constructores y método para
	   mostrar.*/
	
	public Estudiante(String nombre,int carnet,int edad,int matricula,String carrera){
		super(nombre,carnet,edad);
		this.matricula = matricula;
		this.carrera = carrera;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("|matricula: "+this.matricula+" |carrera: "+this.carrera);
	}
	
	//d. Crear un método para verificar si 
	//   dos estudiantes están en la misma carrera
	
	public void verificarCarrera(Estudiante otro) {
		if(this.carrera.equalsIgnoreCase(otro.carrera)) {
			System.out.println("\n Estan en la misma carrera: "+ this.carrera);
		}else {
			System.out.println("\n Diferentes carreras");
		}
	}
	
	

}
