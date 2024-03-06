public class Main {
    public static void main(String[] args) {
     Persona perso1 = new Persona();
     perso1.imprimirDatos();
        System.out.println("");
     Persona perso2 = new Persona("Pedro", "Paramo", 12);
     perso2.imprimirDatos();
        System.out.println("");
     //al usar los set, se borra los datos previos y son remplazados
     // con los asignados por los metodos set
     perso2.setNombre("Raul");
     perso2.setApellidos("Ornelas");
     perso2.setEdad(18);
     perso2.imprimirDatos();
    }


}