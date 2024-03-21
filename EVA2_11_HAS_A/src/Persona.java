public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;
    public Persona() {
        this.nombre="___";
        this.apellido="___";
        this.edad= 0;
        this.direccion= new Direccion();
    }

    public Persona(String nombre,String apellido,int edad,Direccion direccion ) {
        this.nombre = nombre;
        this.apellido= apellido;
        this.edad = edad;
        this.direccion=direccion; //PERSONA HAS A DIRECCION, direccion es componente de persona
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString(){
        String cade= "Nombre: " +nombre+ "\n" +
                "Apellido: " +apellido+ "\n" +
                "Edad: " +edad+ "\n" +
                "Direccion: " +direccion.toString();
        return cade;
    }
}
