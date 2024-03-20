public class Esudiante extends Persona implements Datos, GenerarFecha{
    private String numcontrol;

    public Esudiante(String numcontrol) {
        this.numcontrol = numcontrol;
    }
    public Esudiante(){
        super();
        this.numcontrol = "----";
    }
    public Esudiante(String nombre, String apellido, int edad, String numcontrol) {
        super(nombre, apellido, edad);
        this.numcontrol = numcontrol;
    }

    public String getNumcontrol() {

        return numcontrol;
    }

    public void setNumcontrol(String numcontrol) {

        this.numcontrol = numcontrol;
    }

     @Override
    public void imprimirDatos() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Edad: "+getEdad());

    }

    @Override
    public String generarNombrecom() {
        return getNombre() +" "+ getApellido();
    }

    @Override
    public int generarAñonac() {
        return 2024 - getEdad();
    }
}
