package civ.population;

import java.io.*;
import java.util.*;
public class InfantrySquad {
   private static int globalSquadCount = 0;
   private int squadId;
   private static final double workRate = 1.1;
   private int squadHealth;
   private static final int health = 30;
   private static final int attack = 5;
   private int squadAttack;
   private int squadSize = 5;
/* need to fix relationship between person and InfantrySquad, maybe add Infantry person; make person abstract class?*/

   private ArrayList<Person> personList;


   public InfantrySquad() {
      globalSquadCount += 1;
      squadId = globalSquadCount;
      squadHealth = squadSize * health;
      squadAttack = squadSize * attack;
      personList = new ArrayList<Person>(squadSize);
      initPersonList();
   }

   private void initPersonList() {
      for(int i = 0; i < squadSize; i++) {
	      personList.add(new Person());
      }
   }

   public void recalcSquadHealth() {
      squadHealth = squadSize * health;
   }

   public void recalcSquadAttack() {
      squadAttack = squadSize * attack;
   }

   public void incrSquadSize() {
      squadSize += 1;
      recalcSquadAttack();
      recalcSquadHealth();
   }

   public void decrSquadSize() {
      squadSize -= 1;
      recalcSquadAttack();
      recalcSquadHealth();
   }

   public double getWorkRate() {
      return workRate;
   }
}
