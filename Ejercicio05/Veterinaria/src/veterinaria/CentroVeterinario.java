package veterinaria;

class CentroVeterinario {
    private String nombre;
    private int cantPerros;
    private int cantGatos;

    private Perro[] perros = new Perro[100];
    private Gato[] gatos = new Gato[100];

    public CentroVeterinario(String nombre) {
        this.nombre = nombre;
        this.cantPerros = 0;
        this.cantGatos = 0;
    }

    // agregar
    public void agregarPerro(Perro p) {
        perros[cantPerros++] = p;
    }

    public void agregarGato(Gato g) {
        gatos[cantGatos++] = g;
    }
    
    /*b. Crear un método para ordenar los perros mediante la edad en forma
    ascendente, si hay empate ordenar por el nombre del dueño
    ascendentemente, si hay empate ordenar por el nombre del perro
    ascendentemente.*/
    
    public void ordenarPerros() {
        for (int i = 0; i < cantPerros - 1; i++) {
            for (int j = 0; j < cantPerros - i - 1; j++) {

                Perro a = perros[j];
                Perro b = perros[j + 1];

                boolean cambiar = false;

                if (a.edad > b.edad) {
                    cambiar = true;
                } 
                else if (a.edad == b.edad) {
                    if (!a.nombreDueno.equals(b.nombreDueno)) {
                        if (a.nombreDueno.compareTo(b.nombreDueno) > 0)
                            cambiar = true;
                    } 
                    else {
                        if (a.nombre.compareTo(b.nombre) < 0)
                            cambiar = true;
                    }
                }

                if (cambiar) {
                    perros[j] = b;
                    perros[j + 1] = a;
                }
            }
        }
    }
    
    /*c. Crear un método para ordenar los gatos, donde primero deben 
     * estar los que toman leche, si hay empate ordenar descendentemente 
     * por la edad, si hay empate ordenar por el nombre del gato 
     * ascendentemente.*/
    
    public void ordenarGatos() {
        for (int i = 0; i < cantGatos - 1; i++) {
            for (int j = 0; j < cantGatos - i - 1; j++) {

                Gato a = gatos[j];
                Gato b = gatos[j + 1];

                boolean cambiar = false;

                if (!a.tomaLeche() && b.tomaLeche()) {
                    cambiar = true;
                } 
                else if (a.tomaLeche() == b.tomaLeche()) {
                    if (a.edad < b.edad)
                        cambiar = true;
                    else if (a.edad == b.edad) {
                        if (a.nombre.compareTo(b.nombre) > 0)
                            cambiar = true;
                    }
                }

                if (cambiar) {
                    gatos[j] = b;
                    gatos[j + 1] = a;
                }
            }
        }
    }
    
    /*d) d. Verificar si existen dos animales ya sean perros o 
     * gatos que sean del mismo dueño, si hay mostrar la cantidad 
     * de animales que tiene ese dueño.*/

    
    public void verificarDueno() {

        for (int i = 0; i < cantPerros; i++) {
            String dueno = perros[i].nombreDueno;
            int contador = 1;

            for (int j = i + 1; j < cantPerros; j++) {
                if (perros[j].nombreDueno.equals(dueno))
                    contador++;
            }

            for (int k = 0; k < cantGatos; k++) {
                if (gatos[k].nombreDueno.equals(dueno))
                    contador++;
            }

            if (contador > 1) {
                System.out.println("Dueño: " + dueno +
                                   " tiene " + contador + " animales");
            }
        }
    }
}
