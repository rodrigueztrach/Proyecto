package proyecto;

class Curso {
    String nombre;
    int id;
    Profesor profesor;

    public Curso(int id, String nombre, Profesor profesor) {
        this.id = id;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Profesor: " + profesor.nombre;
    }
}