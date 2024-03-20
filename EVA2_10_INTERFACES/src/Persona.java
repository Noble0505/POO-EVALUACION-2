public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre="___";
        this.apellido="___";
        this.edad= 0;
    }

    public Persona(String nombre,String apellido,int edad ) {
        this.nombre = nombre;
        this.apellido= apellido;
        this.edad = edad;
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

    /*@Override
    public void imprimirDatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);

    }

    @Override
    public String generarNombrecom() {
        return nombre +" "+ apellido;
    }*/
}
