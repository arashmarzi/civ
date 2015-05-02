import java.io.*;

public class Game {
   public static void main(String[] args) {
      Wood wood = new Wood();
      Metal metal = new Metal();
      InfantrySquad is1 = new InfantrySquad();
      System.out.println("wood res: " + wood.getResType());
      System.out.println("wood id: " + wood.getResId());
      System.out.println("metal res: " + metal.getResType());
      System.out.println("metal id: " + metal.getResId());
      while(wood.getSupply() != 0) {
         System.out.println("extracted: " + wood.decrRes(is1.getWorkRate()));
         System.out.println("supply: " + wood.getSupply());
      }
   }
}
