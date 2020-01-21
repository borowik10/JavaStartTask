package tasks.FizzBuzz;

import java.util.Random;

public class FiBu {
    public static void main(String[] args) {
        Random ran = new Random();
        int a = ran.nextInt(100);
        boolean byThree = a % 3 == 0;
        boolean byFive = a % 5 == 0;
        System.out.println(a);
      if (byThree && byFive) {
          System.out.println("FizzBuzz");
      }else if (byThree){
          System.out.println("Fizz");
      }
      else if (byFive){
          System.out.println("Buzz");
      }
    }


}
