public class Motocicleta extends Vehiculo {
    private int capacidad;
    public Motocicleta(){
     int capacidad= 0;
    }
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public Motocicleta(int capacidad,int velocidad){
        super();
        this.capacidad = capacidad;
    }
}
