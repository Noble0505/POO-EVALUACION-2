public final class Computo extends Electronica{
    private int ram;
    private String hd;
    private String procesador;

    public Computo() {
        this.ram = 0;
        this.hd = "Null";
        this.procesador = "Null";
    }

    public Computo(int ram, String hd, String procesador) {
        this.ram = ram;
        this.hd = hd;
        this.procesador = procesador;
    }

    public Computo(String marca, boolean garantia, String nombre, double precio, int ram, String hd, String procesador) {
        super(marca, garantia, nombre, precio);
        this.ram = ram;
        this.hd = hd;
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    @Override
    public String  toString(){
        String cade = super.toString()+ "\n";
        cade+= "Ram: " + ram + "\n"+
                "Hd: "+hd + "\n"+
                 "Procesador: "+procesador;
        return cade;
    }
}
