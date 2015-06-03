package civ.resource;

import java.io.*;

public class Food extends Resource {
   private String resType;

   public Food() {
      super();
      resType = this.resTypes[0];
   }

   public String getResType() {
      return resType;
   }
}
