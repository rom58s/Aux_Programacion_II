package veterinaria;

class Gato extends Animal {
    private boolean cazaRatones;
    private boolean tomaLeche;

    public Gato(String nombre, int edad, String nombreDueno,
                boolean cazaRatones, boolean tomaLeche) {
        super(nombre, edad, nombreDueno);
        this.cazaRatones = cazaRatones;
        this.tomaLeche = tomaLeche;
    }

    public boolean tomaLeche() {
        return tomaLeche;
    }
}
