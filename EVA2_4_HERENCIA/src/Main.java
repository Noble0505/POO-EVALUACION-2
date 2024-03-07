public class Main {
    public static void main(String[] args) {
    Persona perso = new Persona();
        System.out.println(perso.toString());
        //el metodo toString viene por herencia, no fue implementado por nosotros.
        //TODAS LAS CLASES EM JAVA DESCIENDEN DE LA CLASE OBJECT
        Estudiante estu = new Estudiante();
        System.out.println("Nombre: " +estu.getNombre());
        System.out.println("Apellido: " +estu.getApellido());
        System.out.println("Edad: " +estu.getEdad());
        System.out.println("noControl: " +estu.getNocontrol());
    }

}
class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "SIN NOMBRE";
        this.apellido = "SIN APELLIDO";
        this.edad = 0;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    }
class Estudiante extends Persona {
    private String nocontrol;

    public Estudiante() {
        this.nocontrol = "SIN NUMERO";
    }

    public String getNocontrol() {
        return nocontrol;
    }

    public void setNocontrol(String nocontrol) {
        this.nocontrol = nocontrol;
    }
}