public class Persona implements MostrarDatos {
    private String nombre;
    private String apellido;

    public Persona() {
        this.nombre = "___";
        this.apellido = "___";

    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Nombre Completo: " + nombre + " " + apellido;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido);
    }
}