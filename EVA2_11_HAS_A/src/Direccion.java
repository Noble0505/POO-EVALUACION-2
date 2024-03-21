public class Direccion {
    private String calle;
    private String numero;
    private String colonia;
    private String cp;
    private String ciudad;

    public Direccion() {
        this.calle="___";
        this.numero="___";
        this.colonia="___";
        this.cp="___";
        this.ciudad = "___";
    }

    public Direccion(String calle, String numero, String colonia, String cp, String ciudad) {
        this.calle=calle;
        this.numero=numero;
        this.colonia=colonia;
        this.cp=cp;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
  public String toString(){
        String cade= "Calle: " +calle+ "\n"+
                "Numero: " +numero+ "\n"+
                "Colonia: " +colonia+ "\n"+
                "C.P: " +cp+ "\n"+
                "Ciudad: " +ciudad+ "\n";
        return cade;
  }
}
