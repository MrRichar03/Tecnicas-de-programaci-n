# Ejercicios-del-dia-23-de-ago

Ejercicio 1
import java.util.;

public class Main {
    public static void main(String[] args) {
      System.out.println("Desarrollo ejercicio 1");
      System.out.println("");
      System.out.println("Primero pasaremos de celsius a Fahrenheit ");
      System.out.println("");
      System.out.println(" 0C a Fahrenheit es : " + ((09/5) +32));
      System.out.println("");
      System.out.println(" 100C a Fahrenheit es : " + ((1009/5) +32));
      System.out.println("");
      System.out.println(" 25C a Fahrenheit es : " + ((259/5) +32));
      System.out.println("");
      System.out.println(" -10C a Fahrenheit es : " + ((-109/5) +32));
      System.out.println("");
      System.out.println("Ahora pasaremos de Fahrenheit a celsius ");
      System.out.println("");
      System.out.println(" 32F a celsius es : " + ((32-32)5/9));
      System.out.println("");
      System.out.println(" 100F a celsius es : " + ((100-32)5/9));
      System.out.println("");
      System.out.println(" -40F a celsius es : " + ((-40-32)5/9));

  }
}






Ejercicio 2

import java.util.*;

public class Main {
    public static void main(String[] args) {
      int num1;
      int[] list = new int[7];
      list[0] = 40;
      list[1] = 50;
      list[2] = 60;
      list[3] = 24;
      list[4] = 66;
      list[5] = 12;
      list[6] = 98;
      num1 = (40+50+60+24+66+12+98)/7;
      System.out.println(num1);
      for(int listnum:list){
        if (listnum==num1){
          System.out.println("El numero "+listnum+" es igual que el promedio");
        }else if(listnum<num1){
          System.out.println("El numero "+listnum+" es menor que el promedio");
        }
        else{
          System.out.println("El numero "+listnum+" es mayor que el promedio");
        }
      }
  }
}
