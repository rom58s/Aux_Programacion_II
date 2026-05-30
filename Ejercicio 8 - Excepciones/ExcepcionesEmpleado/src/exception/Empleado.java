package exception;

class Empleado {
	
	private String nombre;
	private String cargo;
	private double sueldo;
	
	public Empleado(String n,String c,double s) {
		this.nombre = n;
		this.cargo = c;
		this.sueldo = s;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", cargo=" + cargo + ", sueldo=" + sueldo + "]";
	}
	
	
	
}
