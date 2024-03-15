public abstract class Productos {
    private double precio;
    private String nombre;

    public Productos() {
        this.nombre = "NULL";
        this.precio = 00.00;
    }

    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString(){
        String cade;
        cade = "Nombre: " + nombre  + "\n" +
                "Precio: "+precio  ;
        return cade;
    }

}
