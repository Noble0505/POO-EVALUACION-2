public class Rectangulo extends Figura{
    private double altura;
    private double base;
    public Rectangulo(){
        this.altura = 0;
        this.base = 0;
    }
    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public  double calcularArea(){
        return (base * altura);
    }

    @Override
    public double calcularPerimetro(){
        return (base*2) + (altura*2);
    }

}
