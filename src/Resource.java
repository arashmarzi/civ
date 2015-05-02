import java.io.*;

public class Resource {

      private static int globalResCount = 0;
      private int resId;
      private static final maxSupply = 2000;
      private int supply;
      private static final String resTypes = {"wood", "metal", "stone","food"};
      private String resType;

      public Resource(String resType) {
         globalResCount += 1;
         resId = globalResCount;
         supply = maxSupply;
         this.resType = resType;
      }

      public int decrRes(double workRate) {
         int extract = 0;
         if(supply > 0) {git@github.com:arashmarzi/civ.git
            extract = supply - (supply / workrate);
            supply /= workRate;
         }

         return extract;
      }

   }
