package proyecto;

class Estudiante {
    String nombre;
    int id;

    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre;
    }
}
