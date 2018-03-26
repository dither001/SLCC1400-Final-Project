/****************************************
* Last edit: 4/22/2017
* 
* produces various menus used in play
****************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
   // fields
   private static final Scanner input = new Scanner(System.in);
   private int charaMenu = 0;
   
   /****************************************
   * Resuable methods
   ****************************************/
   
   // prevents user from entering non-integer values
   public static void preventNonInteger() {
      while (!input.hasNextInt()) {
         input.next();
      }
   }
   
   // pauses output until user presses ENTER key
   public static void pressEnter() {
      System.out.print("\n\nPress <ENTER> to continue.");
      try {System.in.read();}
      catch(Exception e){}
   }
   
   /****************************************
   * Investigator selection
   ****************************************/
   public static int investigatorSelect(Investigator[] people) {
      Investigator person;
      String name;
      String title;
      int i = 1;
      
      System.out.print("\nActive investigators:");
      for (Investigator el : people) {
         person = el;
         name = person.getName();
         title = person.getTitle();
         // print name and title with proper spacing
         if    (i < 10) System.out.print("\n" + i + ".  " + name + ", " + title);
         else           System.out.print("\n" + i + ". " + name + ", " + title);
         // spacing between name and stats
//          for (int j = 0; j < 18 - (name.length() + title.length()); ++j) {System.out.print(" ");}
         // print stats
//          System.out.printf("{%d, %d} {%d, %d, %d, %d, %d}",
//                person.getHealth(), person.getSanity(),
//                person.getLor(), person.getInf(), person.getObs(),
//                person.getStr(), person.getWil());
         ++i;
      }
      System.out.print("\n");
      
      // input validation
      int choice;
      do {
         System.out.print("\nChoose an investigator (1-12): ");
         preventNonInteger();
         choice = input.nextInt() - 1;
      } while (choice < 0 || choice >= people.length);
      
      person = people[choice];
      name = person.getName();
      title = person.getTitle();
      System.out.print("\nYou have chosen " + name + ", " + title);
      
      return choice;
   }
   
   /****************************************
   * Action menu
   ****************************************/
   public static void actionMenu() {
      Location[] places = Engine.getBoard();
      int index = Location.getLocation();
      Location here = places[index];
      
      int n = 1;
      // series of menu options behind selection statements
      // if a menu option populates, index increments
      System.out.print("\n======== ======== ======== ======== ");
      System.out.print("\n" + here.getName(places, index));
      System.out.print("\n======== ======== ======== ======== ");
      
      System.out.print("\n" + n + ". Read Newspaper (no action)");
      int newsOption = n;
      ++n;
      System.out.print("\n" + n + ". Check Notebook (no action)");
      int noteOption = n;
      ++n;
      System.out.print("\n" + n + ". Travel");
      int travelOption = n;
      ++n;
      System.out.print("\n" + n + ". Rest");
      int restOption = n;
      //++n;
      
      int choice;
      do {
         System.out.print("\n\nHow will you spend the week: ");
         preventNonInteger();
         choice = input.nextInt();
      } while (choice < 1 || choice > n);
      
      if (choice == newsOption) newspaper();
      else if (choice == noteOption) notebook();
      else if (choice == travelOption) Location.updateLocation(travelMenu());
      else if (choice == restOption) restAction();
      
   }
   
   /****************************************
   * Newspaper
   ****************************************/
   public static void newspaper() {
      Location[] places = Engine.getBoard();
      Location here = places[Location.getLocation()];
      
      System.out.print("\n");
      if (Engine.getTurns() < 10)   System.out.print("\n=EXTRA!= ==== Week  ");
      else                          System.out.print("\n=EXTRA!= ==== Week ");
      System.out.print("" + Engine.getTurns() + " ==== =EXTRA!=");
      System.out.print("\n" + here.getName() + " Newspaper");
      System.out.print("\n-------- -------- -------- -------- ");
      System.out.print("\nHoroscope: " + omenCheck());
      System.out.print("\nYour lucky number is: " + Mythos.getDoom());
      System.out.print("\n");
      System.out.print("\nHeadlines: ");
      printHeadlines();
      pressEnter();
   }
   
   public static String omenCheck() {
      switch (Mythos.getOmen()) {
         case 0: return "Comet seen on horizon.";
         case 1: return "The stars are right.";
         case 2: return "Unseasonal eclipse.";
         case 3: return "The stars are right.";
         default: return "Too cloudy for reading.";
      }
   }
   
   public static void printHeadlines() {
      Location[] places = Engine.getBoard();
      ArrayList<Token> inventory;
      boolean printed = false;
      
      for(Location el : places) {
         inventory = el.getInventory();
         printed = false;
         // checks for presence of gate
         for (Token em : inventory) {
            if (em.type == Token.Type.GATE) {cityGates(el); printed = true; continue;}
         }
         // checks for presence of monster
         for (Token em : inventory) {
            if (em.type == Token.Type.MONSTER) {cityMonsters(el); printed = true; continue;}
         }
      }
      // end of headlines
   }
   
   public static void cityGates(Location place) {
      switch (place.city) {
            case ARKHAM: 
            case BUENOS_AIRES: 
            case ISTANBUL: 
            case LONDON: 
            case ROME: 
            case SHANGHAI: 
            case SAN_FRANCISCO: 
            case SYDNEY: 
            case TOKYO: System.out.print("\nStrange weather over " + place.getName());
            default: break;
         }
   }
   
   public static void cityMonsters(Location place) {
      switch (place.city) {
            case ARKHAM: 
            case BUENOS_AIRES: 
            case ISTANBUL: 
            case LONDON: 
            case ROME: 
            case SHANGHAI: 
            case SAN_FRANCISCO: 
            case SYDNEY: 
            case TOKYO: System.out.print("\nPolice baffled by grisly murders!");
            default: break;
         }
   }
   
   /****************************************
   * Notebook
   ****************************************/
   public static void notebook() {
      Investigator[] people = Engine.getPeople();
      Investigator person = people[Engine.getLead()];
      
      System.out.print("\n0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
      System.out.print("\n-------- -------- -------- --------");
      System.out.print("\n" + person.getName() + "'s Notebook");
      System.out.print("\n======== ======== ======== ========");
      
      System.out.print("\nHealth: " + person.getHealth() + "/" + person.health());
      if (person.getHealth() < 3) {System.out.print(" (consider resting)");}
      System.out.print("\nSanity: " + person.getSanity() + "/" + person.sanity());
      if (person.getSanity() < 3) {System.out.print(" (consider resting)");}
      
      System.out.print("\n\nTo Do:");
      System.out.print("\nCollect clues: " + cluesCarried() + "/6");
      
      System.out.print("\n\nCurrent Leads:");
      printLeads();
      
      pressEnter();
   }
   
   public static void printLeads() {
      Location[] places = Engine.getBoard();
      ArrayList<Token> inventory;
      boolean printed = false;
      
      for(Location el : places) {
         inventory = el.getInventory();
         printed = false;
         // checks for presence of clue
         for (Token em : inventory) {
            if (em.type == Token.Type.CLUE) {
               System.out.print("\n* " + el.getName());
               printed = true;
               continue;
            }
         }
      }
      // end of leads
   }
   
   public static int cluesCarried() {
      Investigator[] people = Engine.getPeople();
      Investigator person = people[Engine.getLead()];
      ArrayList<Token> inventory = person.getInventory();
      
      int n = 0;
      for (Token em : inventory) {
         if (em.type == Token.Type.CLUE) ++n;
      }
      
      return n;
   }
   
   /****************************************
   * Travel Agent
   ****************************************/
   public static int travelMenu() {
      Location[] places = Engine.getBoard();
      int index = Location.getLocation();
      Location here = places[index];
      
      int[] placesToGo = here.getDestinations(places, index);
      int numOptions = here.numDestinations(places, index);
      System.out.print("\n======== ======== ======== ======== ");
      System.out.print("\nTravel Agent");
      System.out.print("\n======== ======== ======== ======== ");
      
      int i = 1;
      System.out.print("\nTravel Destinations:");
      for (int el : here.getDestinations(places, index)) {
         System.out.print("\n" + i + ". " + here.getName(places,el));
         ++i;
      }
      System.out.print("\n");
      
      int choice;
      do {
         System.out.print("\nChoose a destination (0 to return): ");
         preventNonInteger();
         choice = input.nextInt() - 1;
      } while (choice >= numOptions);
      
      if (choice < 0) return index;
      int destination = placesToGo[choice];
      
      Engine.useAction();
      return destination;
   }
   
   /****************************************
   * Travel Agent
   ****************************************/
   public static void restAction() {
      Investigator[] people = Engine.getPeople();
      Investigator person = people[Engine.getLead()];
      
      person.restAction(person);
   }
   
   // end of code
}