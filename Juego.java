import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);

     int respuesta;
     String respuesta_2;
     int monto; 
     int aleatorio=0;
     


      System.out.println( "Desea realizar el lanzamiento de la moneda: Si=1 o No=2");
      respuesta=leer.nextInt();

      while (respuesta==1) {
      System.out.println ("Escriba el monto que desea apostar");
      monto=leer.nextInt();

      aleatorio= (int) (Math.random()*(1));
      if (aleatorio==1) {
        
      } else {
        
      }

   }
 }
}
