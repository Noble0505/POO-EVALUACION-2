public class Vehiculo {
    private int velocidad;
    public Vehiculo() {
        velocidad = 0;
    }
    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void acelerar(int ajuste){
        velocidad += ajuste;
    }

}
