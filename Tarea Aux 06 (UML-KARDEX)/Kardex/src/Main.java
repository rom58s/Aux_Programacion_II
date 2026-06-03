public class Main {

    public static void main(String[] args) {

        Docente docente =
                new Docente(1,
                        "Juan Perez",
                        "Programacion",
                        "Titular");

        Estudiante estudiante =
                new Estudiante(101,
                        "Mateo",
                        "2025001",
                        "Informatica");

        Materia materia =
                new Materia("INF-121",
                        "Programacion II",
                        docente);

        Kardex kardex =
                new Kardex("2026", 1);

        kardex.inscribir(estudiante, materia);

        Nota nota =
                new Nota(85,
                        "Primer Parcial",
                        estudiante);

        materia.registrarNota(nota);

        Examen examen =
                new Examen("10/06/2026",
                        "Final");

        materia.programarExamen(examen);

        System.out.println(
                "Materia encontrada: "
                        + kardex.buscarMateria("INF-121")
                                .getCodigo()
        );
    }
}
