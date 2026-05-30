import java.util.Scanner;

public class Minecraft {
	private String[] jugadores = new String[10];
	private int[] diamantes = new int[jugadores.length];
	
	public Minecraft(){

	}
	
	//a) Crea un método para agregar un nuevo jugador al servidor
	
	public void agregarJugadores(int a) {
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<jugadores.length && a>0;i++) {
			if(jugadores[i] == null) {
				System.out.print("Jugador "+(i+1)+":");
				jugadores[i] = sc.next() ;
				a--;
			}

		}
	}
	
	
	public void agregarDiamantes() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<diamantes.length ;i++) {
			if(jugadores[i] != null ) {
				System.out.print("Diamantes Agregados a jugador "+(i+1)+":");
				diamantes[i] = sc.nextInt() ;
			}
		}
	}
	
	/* b) Crea un método para verificar cuántos stacks de diamantes 
	 * tiene cada jugador en el servidor. 
	 * (1 stack contiene 64 diamantes, y si un jugador tiene 65 diamantes, 
	 * solo tiene 1 stack de diamante).
     */
	
	public void veriDiamJugador() {
		for(int i = 0; i<jugadores.length;i++) {
			if(jugadores[i] != null) {
				System.out.println(jugadores[i] +" tiene "+ (diamantes[i]/64 )+ " Stack");
			}
		}
	}
	
	//c) Mostrar el nombre del jugador que 
	//tiene más diamantes en el servidor.
	
	
	public void mostrarJugMasDia() {
	    int mayor = diamantes[0];
	    String jugador = jugadores[0];
	    boolean empate = false;

	    for(int i = 1; i < jugadores.length; i++) {

	        if(diamantes[i] > mayor) {
	            mayor = diamantes[i];
	            jugador = jugadores[i];
	            empate = false;
	        }
	        else if(diamantes[i] == mayor) {
	            empate = true;
	        }
	    }

	    if(empate) {
	        System.out.println("Empate de jugadores con diamantes");
	    } else {
	        System.out.println("El jugador que tiene mas diamantes es: " + jugador);
	    }
	}
	
	//d) Mostrar el total de diamantes entre todos los jugadores.
	
	public void totalDiamantes() {
		int totalD = 0;
		for(int i=0;i<jugadores.length;i++) {
			if(jugadores[i] != null ) {
				totalD = totalD + diamantes[i] ;
			}
		}
		System.out.println("Total de diamantes del servidor: "+totalD);
	}
	
	public static void main(String[] args) {
		Minecraft m1 = new Minecraft();
		m1.agregarJugadores(4);
		m1.agregarDiamantes();
		m1.veriDiamJugador();
		m1.mostrarJugMasDia();
		m1.totalDiamantes();

	}

}
