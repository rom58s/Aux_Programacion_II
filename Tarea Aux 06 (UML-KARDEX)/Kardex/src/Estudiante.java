import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {

    private String ru;
    private String carrera;
    private List<Materia> materias;

    public Estudiante(int id, String nombre,
                      String ru,
                      String carrera) {
        super(id, nombre);
        this.ru = ru;
        this.carrera = carrera;
        this.materias = new ArrayList<>();
    }

    public void inscribirse(Materia materia) {
        materias.add(materia);
    }

    public List<Materia> verMaterias() {
        return materias;
    }
}
