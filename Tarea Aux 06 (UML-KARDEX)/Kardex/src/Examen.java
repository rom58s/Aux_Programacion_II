public class Examen {

    private String fecha;
    private String tipo;

    public Examen(String fecha, String tipo) {
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public void programar() {
        System.out.println("Examen programado");
    }
}
