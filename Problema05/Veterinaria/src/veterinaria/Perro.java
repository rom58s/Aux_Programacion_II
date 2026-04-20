package veterinaria;

class Perro extends Animal {
    private boolean requiereBosal;
    private boolean ladraFuerte;

    public Perro(String nombre, int edad, String nombreDueno,
                 boolean requiereBosal, boolean ladraFuerte) {
        super(nombre, edad, nombreDueno);
        this.requiereBosal = requiereBosal;
        this.ladraFuerte = ladraFuerte;
    }
}
