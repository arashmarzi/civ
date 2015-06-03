package civ.utils;

import java.util.Random;

public class Probability {
   public static int generateRand() {
      Random random = new Random();
      return random.nextInt();
   }

   public static boolean isEven(int number) {
      return (number % 2 == 0);
   }
}
