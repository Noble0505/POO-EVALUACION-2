//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     /* Persona persona = new Persona("Juan","Perez");
      Persona persona2 = new Persona("Juano","Pera");
      Persona persona3 = new Persona("Juana","Peri");

      Estudiante estu1 = new Estudiante("Juan","Perez","01111");
      Estudiante estu2 = new Estudiante("Juano","Pera","02222");
      Estudiante estu3 = new Estudiante("Juana","Peri","03333");

      imprimirDatos(persona);
      imprimirDatos(persona2);
      imprimirDatos(persona3);
      imprimirDatos(estu1);
      imprimirDatos(estu2);
      imprimirDatos(estu3);*/

      Estudiante estudiantes[] = new Estudiante[3000];
      for (int i = 0; i < estudiantes.length; i++) {
          estudiantes[i] = new Estudiante("Estudiante","Sin datos", "01111");
      }
      for (int i = 0; i < estudiantes.length; i++) {
          imprimirDatos(estudiantes[i]);
      }
    }
    public static void imprimirDatos(MostrarDatos datos) {
        datos.imprimirDatos();
        //CASTING
        Estudiante estu;
        Persona perso;
        if (datos instanceof Estudiante) //determina la clase del objeto
         estu = (Estudiante) datos;

        else
            perso = (Persona) datos;
    }

}
