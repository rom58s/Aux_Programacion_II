import java.util.Scanner;

/*Ejercicio 4. Sea la clase Videojuego que 
 * tenga los atributos: nombre, plataforma, cantidad
   de jugadores.*/


public class Videojuego {
	Scanner sc = new Scanner(System.in);
	
	private String nombre;
	private String plataforma;
	private int cantidadJ;
	private String [] jugadores ;
	
	//b) Sobrecargar el constructor 2 veces
	
	public Videojuego(String nombre,int cantidadJ){
		this.nombre = nombre;
		this.plataforma = "Nintendo Swich 2";
		this.cantidadJ = cantidadJ;
		this.jugadores = new String[cantidadJ];
	}
	
	public Videojuego(String nombre,String plataforma,int cantidadJ){
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.cantidadJ = cantidadJ;
		this.jugadores = new String[cantidadJ];
	}

	/*c) Sobrecargar el método agregarJugadores() para: 
	agregar solo un jugador, y agregar
	número de jugadores según una cantidad ingresada 
	por teclado.*/
	
	public void agregarJugadores() {
		for(int i=0;i<jugadores.length;i++) {
			if(jugadores[i]==null) {
				System.out.print("Agregar jugador "+(i+1)+": ");
				jugadores[i]=sc.next();
				break;
			}
		}
	}
	
	public void agregarJugadores(int x) {
		for(int i=0 ;i<x && i<jugadores.length;i++) {
			if(jugadores[i] == null) {
				System.out.print("agregar jugador "+(i+1)+" :");
				jugadores[i] = sc.next();
			}
		}
	}
	
	public static void main(String[] args) {
		//a) Instanciar al menos 2 videojuegos
		Videojuego v1 = new Videojuego("Mario Bros",1);
		Videojuego v2 = new Videojuego("Fornite","PC",2);
		
		v1.agregarJugadores();
		v2.agregarJugadores(2);
		
	}

}
