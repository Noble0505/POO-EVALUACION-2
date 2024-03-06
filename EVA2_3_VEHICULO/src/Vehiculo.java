public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int año;

    public Vehiculo() {
        marca= "Toyota";
        modelo= "Corrolla";
        año = 2022;
        color = "negro";
    }

    public Vehiculo(String marca, String modelo, int año, String color) {
        this.marca = marca;
        this.modelo= modelo;
        this.año = año;
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void imprimirDatos(){
        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " +marca);
        System.out.println("Año: " +año);
        System.out.println("Color: " +color);
    }
}
