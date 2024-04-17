import org.w3c.dom.ls.LSOutput;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Vehiculo flota[]= new Vehiculo[10];
         flota[0] = new Automovil(4,0);
         flota[1] = new Automovil(4,0);
         flota[2] = new Automovil(4,0);
         flota[3] = new Automovil(4,0);
         flota[4] = new Automovil(4,0);
         flota[5] = new Motocicleta(125,0);
         flota[6] = new Motocicleta(125,0);
         flota[7] = new Motocicleta(125,0);
         flota[8] = new Motocicleta(125,0);
         flota[9] = new Motocicleta(125,0);
         //-------------------------------------------------
         Automovil auto = (Automovil) flota[0];
         System.out.println("Numero de puertas: " +auto.getNoPuertas());
         Motocicleta moto = (Motocicleta) flota[5];
         System.out.println("Capacidad: " +moto.getCapacidad());
         //si no sabemos que tipo de objeto estamos almacenando, usamos
         //instanceof
         if(flota[1] instanceof Automovil) {
              auto = (Automovil) flota[1];
              System.out.println("Numero de puertas: " + auto.getNoPuertas());
         }
         acelerar(auto,50);
         acelerar(auto,50);
         System.out.println("velocidad auto: " +auto.getVelocidad());
         acelerar(moto,100);
         System.out.println("velocidad motor: " +moto.getVelocidad());
         acelerar(moto,-30);
         System.out.println("velocidad motor: " +moto.getVelocidad());
         acelerar(flota[2],70);
         System.out.println("velocidad flota: " +flota[2].getVelocidad());
    }
     public static void acelerar(Vehiculo vehiculo, int ajuste) {
          vehiculo.acelerar(ajuste);
     }
}

