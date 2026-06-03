import java.util.ArrayList;
import java.util.List;

public class Kardex {

    private String gestion;
    private int semestre;
    private List<Materia> materias;

    public Kardex(String gestion, int semestre) {
        this.gestion = gestion;
        this.semestre = semestre;
        this.materias = new ArrayList<>();
    }

    public void inscribir(Estudiante e, Materia m) {

        m.agregarEstudiante(e);
        e.inscribirse(m);

        if (!materias.contains(m)) {
            materias.add(m);
        }
    }

    public void asignarDocente(Docente d, Materia m) {

        m.asignarDocente(d);
        d.asignarMateria(m);

        if (!materias.contains(m)) {
            materias.add(m);
        }
    }

    public List<Materia> listarMaterias() {
        return materias;
    }

    public Materia buscarMateria(String codigo) {

        for (Materia m : materias) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }

        return null;
    }
}
