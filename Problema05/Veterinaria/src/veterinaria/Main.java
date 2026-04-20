package veterinaria;

public class Main {
    public static void main(String[] args) {
    	
    	/*a. Implementar el diagrama e instanciar 
    	 * 2 centros veterinarios, donde cada uno
		debe contar con al menos 2 perros y 2 gatos*/

        CentroVeterinario c1 = new CentroVeterinario("Centro 1");
        CentroVeterinario c2 = new CentroVeterinario("Centro 2");

        // Centro 1
        c1.agregarPerro(new Perro("Toby", 5, "Ana", true, true));
        c1.agregarPerro(new Perro("Rocky", 3, "Luis", false, true));

        c1.agregarGato(new Gato("Michi", 2, "Ana", true, true));
        c1.agregarGato(new Gato("Luna", 4, "Pedro", true, false));

        // Centro 2
        c2.agregarPerro(new Perro("Max", 6, "Carlos", true, false));
        c2.agregarPerro(new Perro("Bobby", 1, "Ana", false, true));

        c2.agregarGato(new Gato("Nina", 3, "Carlos", false, true));
        c2.agregarGato(new Gato("Kira", 2, "Luis", true, true));

        // pruebas
        c1.ordenarPerros();
        c1.ordenarGatos();
        c1.verificarDueno();
    }
}
