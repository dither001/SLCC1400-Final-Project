/****************************************
* Last edit: 4/19/2017
* 
* Represents player-collectible objects
* and location-placed objects
****************************************/

import java.util.ArrayList;
import java.util.Collections;

public class Token {
   enum Type {ARTIFACT, ASSET, CLUE, CONDITION, GATE, MONSTER, SKILL, SPELL, TICKET}
   enum Asset {ALLY, ITEM, SERVICE, TRINKET}
   enum AType {MAGICAL, TOME, WEAPON} // TODO - FINISH LIST
   enum Condition {BANE, BOON, DEAL, INJURY, MADNESS} // TODO - FINISH LIST
   enum CType {AMNESIA, BACK_INJURY, BLESSED, CURSED, DARK_PACT, DEBT, DETAINED, HALLUCINATIONS, INTERNAL_INJURY, LEG_INJURY, PARANOIA}
   enum Skill {LORE, INFLUENCE, OBSERVATION, STRENGTH, WILL}
   enum Spell {INCANTATION, RITUAL}
   
   // fields
   private static Investigator[] people = Engine.getPeople();
   
   private String name = "Token";
   private boolean hasReckoning = false;
   private int locationID;
   public Type type;
   public Asset asset;
   public AType atype;
   public Condition condition;
   public CType ctype;
   public Skill skill;
   public Spell spell;
   
   // constructors
   public Token() {
      this(null);
   }
   
   public Token(Type type) {
      this(type, null);
   }
   
   public Token(Type type, String name) {
      this(type, name, 0);
   }
   
   public Token(Type type, String name, int loc) {
      this(type, null, name, loc);
   }
   
   
   public Token(Type type, Asset asset, String name) {
      this(type, asset, name, 0);
   }
   
   public Token(Type type, Asset asset, String name, int loc) {
      this.type = type;
      this.asset = asset;
      this.name = name;
      locationID = loc;
   }
   
   
   /****************************************
   * Card Shuffler
   ****************************************/
   public static void moveIndexUp(ArrayList<Token> list)     {Collections.rotate(list, -1);}
   public static void tokenShuffle(ArrayList<Token> list)    {Collections.shuffle(list);}
   
   /****************************************
   * Clue tokens
   ****************************************/
   public void cluesInit(ArrayList<Token> list) {
      for (int i = 1; i <= 36; ++i) {
         list.add(new Token(Token.Type.CLUE, "Clue", i));
      }
      tokenShuffle(list);
   }
   
   /****************************************
   * Gate tokens
   ****************************************/
   public void gatesInit(ArrayList<Token> list) {
      list.add(new Token(Token.Type.GATE, "San Francisco", 22));
      list.add(new Token(Token.Type.GATE, "Arkham", 23));
      list.add(new Token(Token.Type.GATE, "Buenos Aires", 24));
      list.add(new Token(Token.Type.GATE, "London", 25));
      list.add(new Token(Token.Type.GATE, "Rome", 26));
      list.add(new Token(Token.Type.GATE, "Istanbul", 27));
      list.add(new Token(Token.Type.GATE, "Shanghai", 28));
      list.add(new Token(Token.Type.GATE, "Tokyo", 29));
      list.add(new Token(Token.Type.GATE, "Sydney", 30));
      tokenShuffle(list);
   }
   
   /****************************************
   * Monster tokens
   ****************************************/
   public void monsterInit(ArrayList<Token> list) {
      for (int i = 1; i <= 34; ++i) {
         list.add(new Token(Token.Type.MONSTER, "Monster", i));
      }
   }
   
   /****************************************
   * Assets, Artifacts, Conditions
   ****************************************/
   public void itemsInit(ArrayList<Token> list) {
      list.add(new Token(Token.Type.ARTIFACT, Token.Asset.ITEM, "Cultes des Goules")); // MAGICAL
      list.add(new Token(Token.Type.ARTIFACT, Token.Asset.ITEM, "De Vermis Mysteriis")); // TOME
      list.add(new Token(Token.Type.ARTIFACT, Token.Asset.ITEM, "Flute of the Outer Gods")); // MAGICAL
      list.add(new Token(Token.Type.ARTIFACT, Token.Asset.ITEM, "Gate Box")); // MAGICAL
      list.add(new Token(Token.Type.ARTIFACT, Token.Asset.ITEM, "Glass of Mortlan")); // MAGICAL
      list.add(new Token(Token.Type.ARTIFACT, Token.Asset.ITEM, "Grotesque Statue"));
      list.add(new Token(Token.Type.ARTIFACT, Token.Asset.ITEM, "Lightning Gun")); // WEAPON, MAGICAL
      list.add(new Token(Token.Type.ARTIFACT, Token.Asset.ITEM, "Mi-go Brain Case")); // MAGICAL, TEAMWORK
      list.add(new Token(Token.Type.ARTIFACT, Token.Asset.ITEM, "Necronomicon")); // TOME
      list.add(new Token(Token.Type.ARTIFACT, Token.Asset.ITEM, "Pallid Mask")); // MAGICAL
      list.add(new Token(Token.Type.ARTIFACT, Token.Asset.ITEM, "Ruby of R'lyeh")); // MAGICAL
      list.add(new Token(Token.Type.ARTIFACT, Token.Asset.ITEM, "The Silver Key")); // MAGICAL
      list.add(new Token(Token.Type.ARTIFACT, Token.Asset.ITEM, "Sword of Saint Jerome")); // WEAPON, MAGICAL
      list.add(new Token(Token.Type.ARTIFACT, Token.Asset.ITEM, "T'tka Halot")); // TOME
      list.add(new Token(Token.Type.ASSET, Token.Asset.ALLY, "Arcane Scholar", 2));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ALLY, "Cat Burglar", 1));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ALLY, "Hired Muscle", 2));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ALLY, "Lodge Researcher", 3));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ALLY, "Personal Assistant", 2));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ALLY, "Private Investigator", 2));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ALLY, "Urban Guide", 4));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ALLY, "Vatican Missionary", 2));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ALLY, "Witch Doctor", 3));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, ".38 Revolver", 1)); // WEAPON
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, ".45 Automatic", 2)); // WEAPON
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Arcane Manuscripts", 1)); // TOME
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Arcane Tome", 3)); // TOME
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Axe", 2)); // WEAPON
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Bandages", 1));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Bull Whip", 1)); // WEAPON
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Carbine Rifle", 3)); // WEAPON
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Double-Barreled Shotgun", 4)); // WEAPON
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Dynamite", 3)); // WEAPON
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Fine Clothes", 2));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Fishing Net", 2));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Holy Cross", 2));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Holy Water", 2)); // MAGICAL
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Kerosene", 1));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "King James Bible", 2)); // TOME
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Protective Amulet", 1));
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Spirit Dagger", 2)); // WEAPON, MAGICAL
      list.add(new Token(Token.Type.ASSET, Token.Asset.ITEM, "Whiskey", 1));
//       list.add(new Token(Token.Type.ASSET, Token.Asset.SERVICE, "Agency Quarantine", 4));
//       list.add(new Token(Token.Type.ASSET, Token.Asset.SERVICE, "Charter Flight", 1));
//       list.add(new Token(Token.Type.ASSET, Token.Asset.SERVICE, "Delivery Service", 1)); //TEAMWORK
//       list.add(new Token(Token.Type.ASSET, Token.Asset.SERVICE, "Private Care", 2));
//       list.add(new Token(Token.Type.ASSET, Token.Asset.SERVICE, "Sanctuary", 2));
//       list.add(new Token(Token.Type.ASSET, Token.Asset.SERVICE, "Silver Twilight Ritual", 3));
//       list.add(new Token(Token.Type.ASSET, Token.Asset.SERVICE, "Wireless Report", 1)); //TEAMWORK
      list.add(new Token(Token.Type.ASSET, Token.Asset.TRINKET, ".18 Derringer", 1)); // WEAPON
      list.add(new Token(Token.Type.ASSET, Token.Asset.TRINKET, "Lucky Cigarette Case", 2));
      list.add(new Token(Token.Type.ASSET, Token.Asset.TRINKET, "Lucky Rabbit's Foot", 1));
      list.add(new Token(Token.Type.ASSET, Token.Asset.TRINKET, "Pocket Watch", 1));
      list.add(new Token(Token.Type.ASSET, Token.Asset.TRINKET, "Puzzle Box", 3));
      tokenShuffle(list);
   }
   
   public String getName() {return name;}
   public Type getType() {return type;}
   public static int getID(Token token) {return token.locationID;}
   
   public static Token getToken(ArrayList<Token> list, int index) {return list.get(index);}
   
   public void setLoc(int newLoc)      {locationID = newLoc;}
   
   @Override
   public String toString() {
      return "" + type + "\\" + getName() + "\\" + locationID;
   }
   
   /****************************************
   * Spawn gates & clues
   ****************************************/
   public static boolean tokenSpawn(Location[] places, 
                           ArrayList<Token> list,
                           int number) {
      
      int index;
      Location place;
      ArrayList<Token> destination;
      boolean placedToken = false;
      
      for (int i = 1; i <= number; ++i) {
         index = getID(getToken(list, 0));
         place = places[index];
         destination = place.getInventory();
         placedToken = tokenMove(list, destination);
         moveIndexUp(list);
      }
      
      return placedToken;
   }
   
   /****************************************
   * Player card awards
   ****************************************/
   
   public static void awardThisClue() {
      Investigator person = people[Engine.getLead()];
      Location place = Location.getPlace(Engine.getBoard(), Location.getLocation());
      tokenMove(place.getInventory(), person.getInventory());
      moveIndexUp(place.getInventory());
   }
   
   public static int clueGain() {
      Investigator person = people[Engine.getLead()];
      tokenMove(Engine.getClueDeck(), person.getInventory());
      moveIndexUp(Engine.getClueDeck());
      
      return -1;
   }
   
   public static void tokenGain(Type token)           {tokenGain(token, null, null, null, null, null, null);}
   public static void tokenGain(Asset token)          {tokenGain(null, token, null, null, null, null, null);}
   public static void tokenGain(AType token)          {tokenGain(null, null, token, null, null, null, null);}
   public static void tokenGain(Condition token)      {tokenGain(null, null, null, token, null, null, null);}
   public static void tokenGain(CType token)          {tokenGain(null, null, null, null, token, null, null);}
   public static void tokenGain(Skill token)          {tokenGain(null, null, null, null, null, token, null);}
   public static void tokenGain(Spell token)          {tokenGain(null, null, null, null, null, null, token);}
   
   public static void tokenGain(    Type token, Asset asset, AType atype,
                                    Condition condition, CType ctype,
                                    Skill skill, Spell spell) {
      Investigator person = people[Engine.getLead()];
      int n = firstToken(token, asset, atype, condition, ctype, skill, spell);
      if (n >= 0) {
         tokenMove(Engine.getItemDeck(), person.getInventory(), n);
         tokenShuffle(Engine.getItemDeck());
      }
   }
   
   //
   public static int firstToken(Type token)        {return firstToken(token, null, null, null, null, null, null);}
   public static int firstToken(Asset token)       {return firstToken(null, token, null, null, null, null, null);}
   public static int firstToken(AType token)       {return firstToken(null, null, token, null, null, null, null);}
   public static int firstToken(Condition token)   {return firstToken(null, null, null, token, null, null, null);}
   public static int firstToken(CType token)       {return firstToken(null, null, null, null, token, null, null);}
   public static int firstToken(Skill token)       {return firstToken(null, null, null, null, null, token, null);}
   public static int firstToken(Spell token)       {return firstToken(null, null, null, null, null, null, token);}
   
   public static int firstToken(    Type token, Asset asset, AType atype,
                                    Condition condition, CType ctype,
                                    Skill skill, Spell spell) {
      ArrayList<Token> deck = Engine.getItemDeck();
      Token el;
      for (int i = 0; i < deck.size(); ++i) {
         el = deck.get(i);
         if (token != null) {
            if (el.type == Token.Type.CLUE) return clueGain();
            else if (el.type == token) return deck.indexOf(el);
         }
         else if (asset != null) {if (el.asset == asset) return deck.indexOf(el);}
         else if (atype != null) {if (el.atype == atype) return deck.indexOf(el);}
         else if (condition != null) {if (el.condition == condition) return deck.indexOf(el);}
         else if (ctype != null) {if (el.ctype == ctype) return deck.indexOf(el);}
         else if (skill != null) {if (el.skill == skill) return deck.indexOf(el);}
         else if (spell != null) {if (el.spell == spell) return deck.indexOf(el);}
      }
      
      return -1;
   }
   
   /****************************************
   * Transfer tokens between inventories
   ****************************************/
   public static boolean tokenMove(    ArrayList<Token> origin,
                                       ArrayList<Token> target,
                                       int index) {
      boolean success = false;
      if (origin.isEmpty() != true) {
         target.add(origin.remove(index));
         success = true;
      }
      
      return success;
   }
   
   public static boolean tokenMove(    ArrayList<Token> origin,
                                       ArrayList<Token> target) {
      return tokenMove(origin, target, 0);
   }
}