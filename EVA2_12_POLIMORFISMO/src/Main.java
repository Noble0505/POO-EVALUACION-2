public class Main {
    public static void main(String[] args) {
    Estudiante est = new Estudiante("Juan","Perez","012424" );
        System.out.println(est);
        //PODEMOS CONVERTIR UN OBJETO DE UNA SUBCLSSE A UNO DE UNA SUPERCLASE
        Persona persona = est;
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());
        //------------------------------------------------------
        Persona perso = new Persona("Paco","Perez");
        System.out.println(perso);
       //Estudiante estu = perso; //NO SE PUEDE CONVERTIR UNA PERSONA EN UN ESTUDIANTE
    }
}
class Persona{
    private String nombre;
    private String apellido;

    public Persona() {
        this.nombre="___";
        this.apellido="___";

    }

    public Persona(String nombre,String apellido) {
        this.nombre = nombre;
        this.apellido= apellido;
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
        return "Nombre Completo: "+nombre+" "+apellido;
    }
}
class Estudiante extends Persona{
    private String noControl;
    public Estudiante() {
        super();
        this.noControl="___";
    }
    public Estudiante(String nombre,String apellido,String noControl) {
        super(nombre,apellido);
        this.noControl=noControl;
    }
    public String getNoControl() {
        return noControl;
    }
    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
   @Override
    public String toString() {
        return super.toString() + " NoControl: "+noControl;
   }

}