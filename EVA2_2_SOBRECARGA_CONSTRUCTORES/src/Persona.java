public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(){
        nombre = "SIN NOMBRE";
        apellidos = "SIN APPELLIDOS";
        edad = 0;
    }
    //CONSTRUCTOR SOBRECARGADO
    public Persona(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;

    }
    //METODOS GET Y SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimirDatos(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Apellidos: " +apellidos);
        System.out.println("Edad: " +edad);
    }
}
