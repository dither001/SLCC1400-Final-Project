/****************************************
* Last edit: 4/22/2017
* 
* creates and runs game objects
****************************************/

import java.util.ArrayList;

public class Engine {
   // fields
   private static final Location board = new Location();
   private static final Location[] world = board.boardInit();
   private static final Investigator nobody = new Investigator();
   private static final Investigator[] investigators = nobody.investigatorInit();
   
   private static final Menu menu = new Menu();
   private static final EncGeneral enc = new EncGeneral();
   private static final EncGreen green = new EncGreen();
   private static final EncOrange orange = new EncOrange();
   private static final EncPurple purple = new EncPurple();
   private static final EncResearch research = new EncResearch();
   private static final Mythos mythos = new Mythos();
   
   private static final Token meeple = new Token();
   private static ArrayList<Token> clueDeck = new ArrayList<Token>();
   private static ArrayList<Token> gateDeck = new ArrayList<Token>();
   private static ArrayList<Token> itemDeck = new ArrayList<Token>();
   private static ArrayList<Token> monsterDeck = new ArrayList<Token>();
   
   private static int turnCounter = 1;
   private static int leadInvestigator; // index value
   //private static int playerLocation; // index value
   
   private static int actions = 0;
   private static int encounters = 0;
   
   private static final int LAST_MYTHOS = 16;
   private static final int ACTIONS_PER_TURN = 2;
   private static final int ENCOUNTERS_PER_TURN = 1;
   private static final int CLUES_TO_WIN = 6;
   
   // methods
   public static void gameSetup() {
      leadInvestigator = menu.investigatorSelect(investigators);
      Investigator person = investigators[leadInvestigator];
      Location.updateLocation(person.location());
      
      meeple.cluesInit(clueDeck);
      meeple.gatesInit(gateDeck);
      meeple.itemsInit(itemDeck);
      meeple.tokenSpawn(world, clueDeck, 1);
      meeple.tokenSpawn(world, gateDeck, 1);
   }
   
   
   public static Location[] getBoard() {return world;}
   public static Investigator[] getPeople() {return investigators;}
   
   public static int getLead() {return leadInvestigator;}
   public static int getTurns() {return turnCounter;}
   //public static int getLocation() {return playerLocation;}
   //public static void setLocation(int newLocation) {playerLocation = newLocation;}
   public static void useAction() {++actions;}
   
   public static ArrayList<Token> getClueDeck() {return clueDeck;}
   public static ArrayList<Token> getGateDeck() {return gateDeck;}
   public static ArrayList<Token> getItemDeck() {return itemDeck;}
   public static ArrayList<Token> getMonsterDeck() {return monsterDeck;}
   
   /****************************************
   * Encounter Phase
   ****************************************/
   public static void encounterPhase() {
      boolean hasMonster = false;
      boolean hasClue = false;
      boolean hasGate = false;
      Location here = world[Location.getLocation()];
      ArrayList<Token> contents = here.getInventory();
      Token el;
      for (int i = 0; i < contents.size(); ++i) {
         el = contents.get(i);
         if (el.type == Token.Type.CLUE) hasClue = true;
         if (el.type == Token.Type.GATE) hasGate = true;
//          if (el.type == Token.Type.MONSTER) hasMonster = true;
      }
      
      if (hasClue == true) clueEncounters();
      else localEncounters();
   }
   
   public static void monsterEncounters() {
   }
   
   public static void clueEncounters() {
      Investigator person = investigators[leadInvestigator];
      Location place = Location.getPlace(world, Location.getLocation());
      research.localEncounter(person, place);
   }
   
   public static void gateEncounters() {
   }
   
   public static void localEncounters() {
      Investigator person = investigators[leadInvestigator];
      Location place = Location.getPlace(world, Location.getLocation());
      switch (Location.getLocation()) {
         case 22: 
         case 23: 
         case 24: green.localEncounter(person, place); break;
         case 25: 
         case 26: 
         case 27: orange.localEncounter(person, place); break;
         case 28: 
         case 29: 
         case 30: purple.localEncounter(person, place); break;
         default: enc.localEncounter(person, place); break;
      }
   }
   
   /****************************************
   * Mythos Phase
   ****************************************/
   public static void mythosPhase() {
      mythos.drawMythos(turnCounter, world, investigators, leadInvestigator,
                  clueDeck, gateDeck);
      ++turnCounter;
      actions = 0;
      encounters = 0;
   }
   
   /****************************************
   * Game round - basic loop of gameplay
   ****************************************/
   public static void gameRound() {
      while (mythos.getDoom() > 0 && turnCounter <= LAST_MYTHOS) {
         // main phase
         while (actions < ACTIONS_PER_TURN) { // WARNING TURN NUMBER OF ACTIONS BACK TO TWO
            menu.actionMenu();
         }
         
         // encounter phase
         while (encounters < ENCOUNTERS_PER_TURN) {
            encounterPhase();
            ++encounters;
         }
         menu.pressEnter();
         
         // mythos phase
         mythosPhase();
         
         // end of round
      }
   }
   
   /****************************************
   * Main method
   ****************************************/
   public static void main(String[] args) {
      // game setup
      gameSetup();
      //menu.newspaper();
      //menu.notebook();
      gameRound();
      mythos.gameOver();
   }
}