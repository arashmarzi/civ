import java.io.*;

public class Fort {
   protected static int globalFortCount = 0;
   protected int fortId;

   public Fort() {
      globalFortCount += 1;
      fortId = globalFortCount;
   }

   public int getFortId() {
      return fortId;
   }
}
