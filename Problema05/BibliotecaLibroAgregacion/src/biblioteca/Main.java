package biblioteca;

class Main {

	public static void main(String[] args) {
		/*b. Instanciar 2 Bibliotecas, agregar al menos 
		 * 2 libros a cada biblioteca
		 */
		
		Libro l1 = new Libro("Caperusa Roja","Charles Perrault",2026);
		Libro l2 = new Libro("El amanecer","Jose Varientos",2020);
		Libro l3 = new Libro("Los tres cerditos","Hermanos Grifin",2025);
		Libro l4 = new Libro("La luna","Hermanos Grifin",2025);
		Libro l5 = new Libro("Destello estelar","Ruides",2025);

		Biblioteca b1 = new Biblioteca("Don bosco");
		Biblioteca b2 = new Biblioteca("Mejillones");
		
		b1.agregar(l1);
		b1.agregar(l2);
		b2.agregar(l3);
		b2.agregar(l4);
		b2.agregar(l5);
		
		//c.Verificar si el libro de nombre X está en la biblioteca y mostrar sus datos
		System.out.println("Verificamos si existe un libro en la biblioteca 1");
		b1.verificarLibro("Caperusa Roja");
		
		//*d.Mostrar la biblioteca que contenga la mayor cantidad de libros....
		b1.mayorCantLibBi(b2);

	}

}
