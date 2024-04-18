//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //NO SE PUEDEN CREAR OBJETOS DE INTERFACES
        //USANDO POLIMORFISMO
        //Estamos creando una clase sin nombre que implementa
        //los metodos de la interfaz
        //RELACION POR HERENCIA
        Prueba prueba = new Prueba() {
            @Override
            public void publicarMensaje() {
                System.out.println("HOLA TONOTOS");
            }
        };
        ClaseAbstracta prueba2 = new ClaseAbstracta() {
            @Override
            public void otroMensaje() {
                System.out.println("ADIOS TONOTOS");
            }
        };


        prueba.publicarMensaje();
        prueba2.otroMensaje();

    }

}

interface Prueba{
    public void publicarMensaje();
}

abstract class ClaseAbstracta{
    public abstract void otroMensaje();

    public void mensaje(){
        System.out.println("Mensaje de prueba");
    }
}