public class Nota {

    private double valor;
    private String tipo;
    private Estudiante estudiante;

    public Nota(double valor,
                String tipo,
                Estudiante estudiante) {

        this.valor = valor;
        this.tipo = tipo;
        this.estudiante = estudiante;
    }

    public double getValor() {
        return valor;
    }
}
