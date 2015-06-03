package civ.population;

import java.io.*;

public class Person {
   protected static int globalPersonCount = 0;
   private int personId;
   protected static final int health = 20;

   public Person(){
      globalPersonCount += 1;
      personId = globalPersonCount;
   }

   public int getPersonId() {
      return personId;
   }
}
