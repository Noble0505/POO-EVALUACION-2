public class Estudiante extends Persona {
    private String noControl;
    public Estudiante() {
        super();
        this.noControl="___";
    }
    public Estudiante(String nombre,String apellido,String noControl) {
        super(nombre, apellido);
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

    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("No de control: "+noControl);
    }
}
