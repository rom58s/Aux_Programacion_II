package biblioteca;

class Biblioteca {
	/*a.Implementar las clases con sus constructores y 
	 * métodos necesarios de la agregación.*/
	
	private String nombre;
	private int cantLibros;
	private Libro[] libros = new Libro[100];
	
	public Biblioteca(String nombre){
		this.nombre = nombre;
		this.cantLibros = 0;
	}
	
	public void agregar(Libro l) {
	    if (cantLibros < libros.length) {
	        libros[cantLibros] = l;
	        cantLibros++;
	    } else {
	        System.out.println("Biblioteca llena");
	    }
	}
	
	public void mostrar() {
		System.out.println("\nBiblioteca "+nombre);
		System.out.println("Cantidad de libros: "+cantLibros);
		System.out.println("Libros Disponibles");
		for(int i=0;i<cantLibros;i++) {
			System.out.println("\n"+ (i+1) +") "+libros[i]);	
		}
	}
	
	/*c.Crear un método para verificar si el libro de 
	 * nombre X está en la biblioteca, si lo está mostrar 
	 * sus datos.*/
	
	public void verificarLibro(String n) {
	    boolean encontrado = false;

	    for (int i = 0; i < cantLibros; i++) {
	        if (libros[i] != null && libros[i].getNombre().equalsIgnoreCase(n)) {
	            System.out.println(libros[i]);
	            encontrado = true;
	        }
	    }

	    if (!encontrado) {
	        System.out.println("El libro no existe");
	    }
	}

	/*d. Mostrar la biblioteca que contenga la mayor 
	 * cantidad de libros, si hay empate
	debe mostrar ambas.*/
	
	public void mayorCantLibBi(Biblioteca b) {
		int mayor = cantLibros;
		if(mayor == b.cantLibros) {
			System.out.println("\nAmbas tienen la misma cantidad de libros");
			mostrar();
			b.mostrar();
		}else {
			if(mayor <  b.cantLibros) {
				System.out.println("\nBiblioteca con mas libros");
				b.mostrar();
			}else {
				System.out.println("\nBiblioteca con mas libros");
				mostrar();
			}
		}
	}
	
}
