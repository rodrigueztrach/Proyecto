
package proyecto;

class Matricula {
    Estudiante estudiante;
    Curso curso;

    public Matricula(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public String toString() {
        return "Estudiante: " + estudiante.nombre + ", Curso: " + curso.nombre;
    }
}