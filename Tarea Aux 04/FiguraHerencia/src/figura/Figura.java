package figura;

//a. Implementar la clase base como abstracta
public abstract class Figura {
	protected String color;
	
	public Figura(String color) {
		this.color = color;
	}
	
	protected abstract double obtenerArea();
	
	public void mostrar() {
		System.out.println("Color de figura: "+this.color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
