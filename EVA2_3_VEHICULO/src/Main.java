//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo carro1 = new Vehiculo();
        carro1.imprimirDatos();
        Vehiculo carro2 = new Vehiculo("BMW","Serie 3", 2021, "azul");
            carro2.imprimirDatos();

    }
}