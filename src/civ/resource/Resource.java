package civ.resource;

import java.io.*;

public class Resource {

      protected static int globalResCount = 0;
      protected int resId;
      protected static final int maxSupply = 2000;
      protected int supply;
      protected static final String[] resTypes = {"wood", "metal", "stone","food"};

      public Resource() {
         globalResCount += 1;
         resId = globalResCount;
         supply = maxSupply;
      }

      public int decrRes(double workRate) {
         int extract = 0;
         if(supply > 0) {
            extract = (int) (supply - (supply / workRate));
            supply /= workRate;
         }

         return extract;
      }

      public int getSupply() {
         return supply;
      }

      public int getResId() {
         return resId;
      }
   }
