package figura;

class Cuadrado extends Figura {
	
	private int lado;
	
	public Cuadrado(String color,int lado){
		super(color);
		this.lado = lado;
	}
	
	//b. Sobrescribir el método obtenerArea() en cada subclase.

	@Override
	protected double obtenerArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

	@Override
	public void mostrar() {
		System.out.println("\nFigura-Cuadrada");
		super.mostrar();
		System.out.println("Lado: "+this.lado);
		
	}
	
	
	


}
