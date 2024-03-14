public class Estudiante extends Persona{
    protected double numcontrol;

    public Estudiante(double numcontrol) {
        this.numcontrol = numcontrol;
    }
    public Estudiante(){
        super();
        this.numcontrol = 23550408;
    }
    public Estudiante(String nombre, String apellido, int edad, double numcontrol) {
        super(nombre, apellido, edad);
        this.numcontrol = numcontrol;
    }

    public double getNumcontrol() {
        return numcontrol;
    }

    public void setNumcontrol(double numcontrol) {
        this.numcontrol = numcontrol;
    }

    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Numero de control: "+numcontrol);
    }
}
