package persona;

class Main {

	public static void main(String[] args) {
		//b. Instanciar 2 estudiantes y 1 docente, y mostrar sus datos
		
		Estudiante e1 = new Estudiante("mateo",9931343,21,467829,"Informatica");
		Estudiante e2 = new Estudiante("jose",625172,22,156278,"Medicina");
		
		Docente d1 = new Docente("Ramiro",334451,70,40,5500.50);
		
		e1.mostrar();
		e2.mostrar();
		d1.mostrar();
		
		//c. Verificar si algún estudiante tiene la misma edad que el docente
		
		if(e1.getEdad() == d1.getEdad() ) {
			System.out.println("\n"+e1.getNombre() + " tiene la misma edad que el licenciado "+d1.getNombre());
		}else {
			System.out.println("\n"+e1.getNombre() +" No tiene la misma edad que el licenciado "+d1.getNombre());
		}
		
		if(e2.getEdad() == d1.getEdad()) {
			System.out.println("\n"+e2.getNombre() + " tiene la misma edad que el licenciado "+d1.getNombre());
		}else {
			System.out.println("\n"+e2.getNombre() +" No tiene la misma edad que el licenciado "+d1.getNombre());
		}
		
		//d. verificar si dos estudiantes están en la misma carrera
		e1.verificarCarrera(e2);
		

	}

}
