import java.io.*;

public class Person {
   private static int globalPersonCount = 0;
   private int personId;

   public Person(){
      globalPersonCount += 1;
      personId = globalPersonCount;
   }
}
