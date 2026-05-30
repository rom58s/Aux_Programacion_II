import java.util.Scanner;
public class Bus {
	
	private String[] pasajeros;
	
	public Bus() {
		pasajeros = new String[20];
	}
	
	/*a) Al bus desean subir X cantidad de pasajeros, 
	actualiza los datos del bus
	*/
	
	public void pasajerosSubiendoBus(int pasajerosX) {
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < pasajeros.length && pasajerosX > 0; i++) {

			if(pasajeros[i] == null) {
				System.out.print("Nombre P" + (i+1) + ": ");
				pasajeros[i] = sc.next();
				pasajerosX--;
			}

		}

	}
	
	/* b) Crea un método para cobrar pasaje a los pasajeros. 
	 * (Costo del pasaje: bs. 1.50)
     */
	
	public void Cobrar() {
		System.out.println("\nCobrando pasaje");
		for(int i = 0 ; i<pasajeros.length;i++) {
			if(pasajeros[i] != null) {
				System.out.println("P"+(i+1)+": "+pasajeros[i]+ "  1.50bs");
			}

		}
	}
	
	//c) Muestra cuántos asientos quedan disponibles.
	
	public void disponibilidad() {
		System.out.println("\nAsientos disponibles:");
		int Nodisponible = 0;
		for(int i = 0 ; i<pasajeros.length;i++) {
			if(pasajeros[i] == null) {
				System.out.println("Asiento "+(i+1)+" Libre ");
			}else {
				Nodisponible = Nodisponible+1;
			}
			
		}
		if(Nodisponible == pasajeros.length) {
			System.out.println("Todos los asientos estan ocupados");
		}
		
	}
	
	public static void main(String[] args) {
		//d) Crea una instancia del bus y utiliza los métodos de los incisos anteriores
		Bus b1 = new Bus();
		b1.pasajerosSubiendoBus(10);
		b1.Cobrar();
		b1.disponibilidad();
	}

}
