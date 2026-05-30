package figura;

class Main {

	public static void main(String[] args) {
		//c. Instanciar 2 objetos de cada subclase y mostrarlos.
		
		Cuadrado c1 = new Cuadrado("Azul",4);
		Cuadrado c2 = new Cuadrado("Rojo",4);
		
		Triangulo t1 = new Triangulo("Turquesa",3,4,5);
		Triangulo t2 = new Triangulo("Amarillo",6,7,8);
		
		Redondo r1 = new Redondo("Verde",5);
		Redondo r2 = new Redondo("Celeste",10);
		
		c1.mostrar();
		c2.mostrar();
		t1.mostrar();
		t2.mostrar();
		r1.mostrar();
		r2.mostrar();
		
		/*d. Dado un Cuadrado y Un Triángulo mostrar 
		el color de la figura que tiene
		mayor área.*/
		
		if(c1.obtenerArea() > t1.obtenerArea()) {
			System.out.println("\nColor de figura que tiene mayor area");
			System.out.println("Cuadrado-color: " + c1.getColor());
		}else {
			System.out.println("\nfigura que tiene mayor area");
			System.out.println("Triangulo-color: " + t1.getColor());
		}

	}

}
