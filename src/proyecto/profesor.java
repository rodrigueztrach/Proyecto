
package proyecto;

class Profesor {
    String nombre;
    int id;

    public Profesor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre;
    }
}
