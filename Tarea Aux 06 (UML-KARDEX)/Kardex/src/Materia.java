import java.util.ArrayList;
import java.util.List;

public class Materia {

    private String codigo;
    private String nombre;

    private Docente docente;
    private List<Estudiante> estudiantes;

    private Aula aula;

    private List<Nota> notas;
    private List<Examen> examenes;

    public Materia(String codigo,
                   String nombre,
                   Docente docente) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.docente = docente;

        estudiantes = new ArrayList<>();
        notas = new ArrayList<>();
        examenes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void asignarDocente(Docente docente) {
        this.docente = docente;
    }

    public void registrarNota(Nota n) {
        notas.add(n);
    }

    public void programarExamen(Examen e) {
        examenes.add(e);
    }

    public String getCodigo() {
        return codigo;
    }
}
