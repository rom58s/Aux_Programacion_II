package exception;
import java.util.ArrayList;
import java.util.Scanner;

//A) Cree la excepción personalizada SueldoInvalidoException
class SueldoInvalidoException extends RuntimeException{
	public SueldoInvalidoException(){
		super("Monto Invalido");
	}
}

//B) Cree una excepción personalizada para validar que el cargo (solo letras)
class CargoInvalidoException extends RuntimeException{
	public CargoInvalidoException(){
		super("Cargo no valido");
	}
}

class Empresa {
	Scanner sc = new Scanner(System.in);
	private String nombreE;
	private ArrayList<Empleado> empleados;
	
	public Empresa(String nombreE){
		this.nombreE = nombreE;
		this.empleados = new ArrayList<>();
	}

	// A),B) 
	public void agregarE() {

		System.out.println("\nINGRESE DATOS DE EMPLEADO");
		System.out.print("\nNOMBRE: ");
		String n = sc.nextLine();
		
		System.out.print("\nCARGO: ");
		String c = "";
		
		boolean t = true;
		
		while(t) {
			c = sc.nextLine();
			try {
				if(!c.matches("[a-zA-Z ]+")) {
					throw new CargoInvalidoException();
				}
				t = false;
			}catch(CargoInvalidoException cr) {
				System.out.println("\nEl cargo no puede tener numeros");
				System.out.println("Intentelo de nuevo");
				System.out.print("\nCARGO: ");
			}
			
		}
			
		
		
		System.out.print("\nSUELDO: ");
		double s = sc.nextDouble();
		sc.nextLine();
		
		try {
			if(s<2500) {
				throw new SueldoInvalidoException();
			}
			
		}catch(SueldoInvalidoException sl){
			System.out.println("El sueldo no puede ser menor a 2500");
			System.out.println("Monto por defecto asignado (2500 bs)");
			s=2500;
		}
		
		empleados.add(new Empleado(n,c,s));
		System.out.println("\nEL EMPLEADO FUE AGREGADO EXITOSAMENTE");
		
	}
	
	/*
	public void mostrar() {
		for(Empleado e: empleados) {
			System.out.println(e);
		}
	}
	*/

}
