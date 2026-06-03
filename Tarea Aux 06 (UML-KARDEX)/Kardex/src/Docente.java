import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona {

    private String especialidad;
    private String categoria;
    private List<Materia> materias;

    public Docente(int id, String nombre,
                   String especialidad,
                   String categoria) {
        super(id, nombre);
        this.especialidad = especialidad;
        this.categoria = categoria;
        this.materias = new ArrayList<>();
    }

    public void asignarMateria(Materia m) {
        materias.add(m);
    }

    public List<Materia> verMaterias() {
        return materias;
    }
}