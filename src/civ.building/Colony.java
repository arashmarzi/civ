import java.io.*;

/*
   colony represents starting base of a civilization;
   limit of 1 per civilization;
   units must deposit resources at colony;
   units are produced in adjacent tiles around colony
*/

public class Colony {
   private static int globalColonyCount = 0;
   private ArrayList<Fort> fortList;
   private ArrayList<Person> population;
   private int popSize;
   private ArrayList<Resource> resList;
   private int resSize;

   public Colony() {
      fortList = new ArrayList<Fort>();
      population = new ArrayList<Person>();
      resList = new ArrayList<Resource>();
      popSize = 0;
      resSize = 0;
      creatInitPop();
   }

   private void createInitPop() {
      int startPop = 5;

      for(int i = 0; i < startPop; i++) {
         population.add(new Person());
         updatePopSize();
      }
   }

   public void getPopSize() {
      return popSize;
   }

   public void updatePopSize() {
      popSize = population.size();
   }

   /* create at least one of each resource */
   private void createInitRes() {
      int numInitRes = 4;

      // initial staple resources
      resList.add(new Food());
      resList.add(new Metal());
      resList.add(new Stone());
      resList.add(new Wood());

      // additional random resources
      for(int i = 0; i < numInitRes; i++) {
         switch(i) {
            case 0:
               if(Probability.isEven(Probability.generateRand())) {
                  resList.add(new Food());
               }
               break;
            case 1:
               if(Probability.isEven(Probability.generateRand())) {
                  resList.add(new Metal());
               }
               break;
            case 2:
               if(Probability.isEven(Probability.generateRand())) {
                  resList.add(new Stone());
               }
               break;
            case 3:
               if(Probability.isEven(Probability.generateRand())) {
                  resList.add(new Wood());
               }
               break;
         }
      }

   }
}
