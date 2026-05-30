package figura;

class Redondo extends Figura{
	
	private int radio;
	
	public Redondo(String color,int radio){
		super(color);
		this.radio = radio;
	}
	
	

	//b. Sobrescribir el método obtenerArea() en cada subclase.
	@Override
	protected double obtenerArea() {
		// TODO Auto-generated method stub
		return Math.PI * (radio*radio);
	}



	@Override
	public void mostrar() {
		System.out.println("\nFigura-Redonda");
		super.mostrar();
		System.out.println("radio: "+this.radio);
	}
	
	
	
	
}
