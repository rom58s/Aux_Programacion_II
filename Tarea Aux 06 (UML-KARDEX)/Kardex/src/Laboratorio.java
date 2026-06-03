
public class Laboratorio extends Aula {

    private String tipo;
    private int numComputadoras;

    public Laboratorio(int numero,
                       int capacidad,
                       String tipo,
                       int numComputadoras) {

        super(numero, capacidad);
        this.tipo = tipo;
        this.numComputadoras = numComputadoras;
    }

    public boolean verificarEquipos() {
        return numComputadoras > 0;
    }
}
