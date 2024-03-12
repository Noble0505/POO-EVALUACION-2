public class Circulo extends Figura {
    private double radio;
    public Circulo(){
        this.radio = 0;
    }
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (3.1416 * Math.pow(radio,2)) ;
    }

    @Override
    public double calcularPerimetro() {
        return (2*3.1416) * radio;
    }
}
