public class Main {
    public static void main(String[] args) {
        Direccion direc = new Direccion("5ta","55","valles","34059","cdmx");
        Persona perso=new Persona("juan","perez",50,direc);
        System.out.println(perso);
    }
}