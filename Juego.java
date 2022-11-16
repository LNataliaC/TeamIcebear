import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);

     int respuesta;
     int respuesta2;
     int monto; 
     int aleatorio=0;
     int respuesta3;
     int totalsuma;
     int totalresta;
     int totalapuesta;
     int contador=0;
     int acumulador=0;


      System.out.println( "Desea realizar el lanzamiento de la moneda: Si=1 o No=2");
      respuesta=leer.nextInt();

      while (respuesta==1) {
    
      System.out.println ("Escriba el monto que desea apostar");
      monto=leer.nextInt();

      aleatorio= (int) (Math.random()*(1));
      if (aleatorio==1) {
        respuesta2=(1);
      } else {
        respuesta2=(0);
      }
      System.out.println ("Escriba la opcion que cree que va a salir: Cara=1 o Sello=2");
      respuesta3=leer.nextInt();

      System.out.println ("La moneda cayo en:");
      System.out.println (aleatorio);

      if (respuesta2==respuesta3){
        System.out.println ("Gano el juego");
        totalsuma=monto*(2);
        System.out.println ("La cantidad de dinero ganado es de:");
        System.out.println (totalsuma);
      } else {
        System.out.println ("Perdio el juego");
        totalresta=(totalsuma-monto);
        System.out.println ("La cantidad de dinero perdido es de:");
        System.out.println (totalresta);
      }
      totalapuesta=(totalsuma+totalresta);
      System.out.println ("El valor total ganado es de:");
      System.out.println (totalapuesta);

      System.out.println ("Desea realizar otro lanzamiento: Si=1 o No=0");
      respuesta= leer.nextInt();

      contador=contador+1;
      acumulador= acumulador + monto;
   }
   System.out.println("La cantidad de veces que jugo fueron:");
   System.out.println(contador);

   System.out.println("El dinero acumulado en apuestas fue:");
   System.out.println (acumulador);
 }
}
