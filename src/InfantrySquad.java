import java.io.*;

public class InfantrySquad {
   private static int globalSquadCount = 0;
   private int squadId;
   private static final double workRate = 1.1;
   private static final int health = 20;
   private int squadHealth;
   private static final int attack = 5;
   private int squadAttack;
   private int squadSize = 5;

   public InfantrySquad() {
      globalSquadCount += 1;
      squadId = globalSquadCount;
      squadHealth = squadSize * health;
      squadAttack = squadSize * attack;
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
