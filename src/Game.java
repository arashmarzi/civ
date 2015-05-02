import java.io.*;

public class Game {
   public static void main(String[] args) {
      Wood wood = new Wood();
      InfantrySquad is1 = new InfantrySquad();
      System.out.println("res: " + wood.getResType());
      while(wood.getSupply() != 0) {
         System.out.println("extracted: " + wood.decrRes(is1.getWorkRate()));
         System.out.println("supply: " + wood.getSupply());
      }
   }
}
