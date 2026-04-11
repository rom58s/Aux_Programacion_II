package figura;

class Triangulo extends Figura {
	
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo(String color,int lado1 , int lado2 , int lado3){
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	//b. Sobrescribir el método obtenerArea() en cada subclase.
	@Override
	protected double obtenerArea() {
		double a = lado1;
		double b = lado2;
		double c = lado3;
		
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
		    double s = (a + b + c) / 2;
		    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
		} else {
		    return 0; 
		}

		
	}

	@Override
	public void mostrar() {
		System.out.println("\nFigura-Triangulo");
		super.mostrar();
		System.out.println("Lado1: "+this.lado1+" ,Lado2: "+this.lado2+" ,Lado3: "+this.lado3);
	}
	
	
	
	
}
