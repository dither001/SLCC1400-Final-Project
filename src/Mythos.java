/****************************************
* Last edit: 4/22/2017
* 
* represents mythos cards
****************************************/

import java.util.ArrayList;

public class Mythos {
   // fields
   enum MythosType {GREEN, AMBER, BLUE}
   
   private static int omen = 0;
   private static int OMEN_MAX = 3;
   private static int doomCounter = 15;
   
   private static DiceRoller dice;
   private String name = "";
   private String text = "";
   public MythosType mythos;
   
   // constructors
   
   // methods
   public static int getDoom() {return doomCounter;}
   public static int getOmen() {return omen;}
   
   public static int updateOmen(Location[] places) {
      ++omen;
      omen = (omen > OMEN_MAX) ? 0 : omen;

      ArrayList<Token> inventory;
      
      for(Location el : places) {
         inventory = el.getInventory();
         // checks for presence of gate
         for (Token em : inventory) {
            if (em.type == Token.Type.GATE) updateDoom(el, omen);
         }
      }
      
      return omen;
   }
   
   public static void updateDoom(Location place, int omen) {
      // ISTANBUL, SAN_FRANCISCO ... green comet
      // BUENOS_AIRES, LONDON, TOKYO ... constellation
      // ARKHAM, ROME, SHANGHAI, SYDNEY ... eclipse
      
      switch (place.city) {
            // green comet
            case ISTANBUL: doomCounter -= (omen == 0) ? 1 : 0; break;
            case SAN_FRANCISCO: doomCounter -= (omen == 0) ? 1 : 0; break;
            // constellation
            case BUENOS_AIRES: doomCounter -= (omen == 1 || omen == 3) ? 1 : 0; break;
            case LONDON: doomCounter -= (omen == 1 || omen == 3) ? 1 : 0; break;
            case TOKYO: doomCounter -= (omen == 1 || omen == 3) ? 1 : 0; break;
            // eclipse
            case ARKHAM: doomCounter -= (omen == 2) ? 1 : 0; break;
            case ROME: doomCounter -= (omen == 2) ? 1 : 0; break;
            case SHANGHAI: doomCounter -= (omen == 2) ? 1 : 0; break;
            case SYDNEY: doomCounter -= (omen == 2) ? 1 : 0; break;
            default: break;
         }
   }
   
   public static void greenMythos(Location[] places, ArrayList<Token> clues) {
      Token clue = clues.get(0);
      updateOmen(places);
      clue.tokenSpawn(places, clues, 1);
   }
   
   public static void amberMythos(Location[] places, ArrayList<Token> gates) {
      Token gate = gates.get(0);
      updateOmen(places);
      if (gate.tokenSpawn(places, gates, 1) != true) --doomCounter;
   }
   
   public static void blueMythos() {
   }
   
   public static void drawMythos(int turns, Location[] places,
                           Investigator[] people, int leader,
                           ArrayList<Token> clues, ArrayList<Token> gates) {
      switch (turns) {
         // stage 1
         case 1: greenMythos(places, clues); break;
         case 2: amberMythos(places, gates); break;
         case 3: amberMythos(places, gates); break;
         case 4: // blue
            break;
         
         // stage 2
         case 5: greenMythos(places, clues); break;
         case 6: greenMythos(places, clues); break;
         case 7: amberMythos(places, gates); break;
         case 8: amberMythos(places, gates); break;
         case 9: amberMythos(places, gates); break;
         case 10: // blue
            break;
         
         // stage 3
         case 11: greenMythos(places, clues); break;
         case 12: greenMythos(places, clues); break;
         case 13: amberMythos(places, gates); break;
         case 14: amberMythos(places, gates); break;
         case 15: amberMythos(places, gates); break;
         case 16: amberMythos(places, gates); break;
         default: break;
      }
      
      if (Menu.cluesCarried() > 5) victory();
   }
   
   /****************************************
   * Game Over - Victory
   ****************************************/
   public static void victory() {
      System.out.print("\n-------- ---- Victory ---- --------");
      System.out.print("\nSecret Name Revealed!\n");
      String flavor = "Your tireless efforts to uncover the dread name of Azathoth prove fruitful, and you rush back to Miskatonic University with your newfound discovery. With the aid of the Occult Research department and some angled mirrors, you close the last gate. The world breathes a sigh of relief. For now.";
      for (String el : TextWrap.textWrap(flavor)) {
         System.out.print("\n" + el);
      }
      System.out.print("\n-------- -----The End----- --------");
      Menu.pressEnter();
      System.exit(0);
   }
   
   /****************************************
   * Game Over - Azathoth
   ****************************************/
   public static void gameOver() {
      System.out.print("\n-------- ----Game Over---- --------");
      System.out.print("\nThe World is Doomed!\n");
      String flavor = "Earthquakes and volcanic eruptions tear the Earth's crust apart at a rate faster than the devastation can be recorded or comprehended. As the planet's atmosphere grows increasingly toxic, the insects of Shaggai return to their ships and teleport away, anxious to doom a different world. Eventually, when every living thing on the planet has been reduced to a cinder, a new Outer God emerges from the ruins and joins Azathoth's court at the center of all things.";
      for (String el : TextWrap.textWrap(flavor)) {
         System.out.print("\n" + el);
      }
      System.out.print("\n-------- -----The End----- --------");
   }
   
   // end of code
}