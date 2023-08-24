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
