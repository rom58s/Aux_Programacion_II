
/*Ejercicio 5. Dada la clase Aula. Se tiene los siguientes atributos, 
 * Nombre de aula, piso en el que se encuentra, 
 * y una matriz de estudiantes y sus notas.*/

public class Aula {
	
	private String nomAula = "Quinto B";
	private int piso = 2;
	private String[][] estudNotas = {{"mateo","90"},{"Pepe","40"},{"pablo","100"}};
	
	//a) Sobrecargar un método para:
	
	   //i) Mostrar todos los datos del aula.

	public void mostrarDatos() {
		System.out.println("\nDatos Generales");
		System.out.println("Nombre del Aula: " +nomAula);
		System.out.println("nro de piso: " +piso);
		System.out.println("\nNombres  Notas");
		for(int i=0;i<estudNotas.length;i++) {
		    System.out.println(estudNotas[i][0] + "    " + estudNotas[i][1]);
		}
	}
	
	   /*ii) Mostrar a los estudiantes con un mensaje 
	    * de “APROBADO”, “REPROBADO”,
		con respecto a la nota obtenida.*/
	
	public void mostrarDatos(String x) {
		System.out.println("\n\nEstado de estudiantes:");

		for(int i=0;i<estudNotas.length;i++) {

			int nota = Integer.parseInt(estudNotas[i][1]);

			if(nota >= 51) {
				System.out.println(estudNotas[i][0] + " : APROBADO");
			}else {
				System.out.println(estudNotas[i][0] + " : REPROBADO");
			}

		}

	}
	
	public static void main(String[] args) {
		Aula a1 = new Aula();
		a1.mostrarDatos();
		a1.mostrarDatos("estado");

	}

}
