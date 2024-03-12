public class Triangulo extends Figura {
    private double altura;
    private double base;
    public Triangulo(){
        this.altura = 0;
        this.base = 0;
    }
    public Triangulo(double altura, double base) {
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
        return (base * altura)/2;
    }
    private double calcularHip(){
        return Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
    }
    @Override
    public double calcularPerimetro(){
        return base + altura + calcularHip();
    }
}
