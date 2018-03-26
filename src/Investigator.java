/****************************************
* Last edited: 4/22/2017
* 
* represents playable characters
****************************************/

import java.util.ArrayList;

public class Investigator {
   enum Status {ACTIVE, RETIRED, DEVOURED}
   
   // fields
   private String name = "";
   private String title = "";
   private int startingLocation;    // index
   private int invLocation;     // index
   private int currentHealth;
   private int currentSanity;
   private int[] attributes = new int[7];
   private boolean isDelayed = false;
   private ArrayList<Token> inventory = new ArrayList<Token>();
   
   // constructors
   public Investigator() {this(null, null, 0, 0, 0, 0, 0, 0, 0, 0);}
   
   public Investigator(String name, String title, int location,
                     int lor, int inf, int obs, int str, int wil,
                     int health, int sanity){
      this.name = name;
      this.title = title;
      startingLocation = location;
      invLocation = location;
      // initializes investigator attributes
      attributes[0] = lor;
      attributes[1] = inf;
      attributes[2] = obs;
      attributes[3] = str;
      attributes[4] = wil;
      attributes[5] = health;
      attributes[6] = sanity;
      
      currentHealth = attributes[5];
      currentSanity = attributes[6];
   }
   
   // methods
   public String getName()       {return name;}
   public String getTitle()      {return title;}
   public int location()         {return startingLocation;}
   public int getLor()           {return attributes[0];}
   public int getInf()           {return attributes[1];}
   public int getObs()           {return attributes[2];}
   public int getStr()           {return attributes[3];}
   public int getWil()           {return attributes[4];}
   public int health()           {return attributes[5];}
   public int sanity()           {return attributes[6];}
   
   public int getHealth()        {return currentHealth;}
   public int getSanity()        {return currentSanity;}
   
   
   public int restoreHealth()    {return restoreHealth(1);}
   public int restoreSanity()    {return restoreSanity(1);}
   public int damageHealth()    {return damageHealth(1);}
   public int damageSanity()    {return damageSanity(1);}
   
   
   public int restoreHealth(int heals) {
      currentHealth = (currentHealth + heals > getHealth()) ? getHealth() : currentHealth + heals;
      return currentHealth;
   }
   
   public int restoreSanity(int heals) {
      currentSanity = (currentSanity + heals > getSanity()) ? getSanity() : currentSanity + heals;
      return currentSanity;
   }
   
   public int damageHealth(int damage) {
      currentHealth = (currentHealth - damage < 0) ? 0 : currentHealth - damage;
      return currentHealth;
   }
   
   public int damageSanity(int damage) {
      currentSanity = (currentSanity - damage < 0) ? 0 : currentSanity - damage;
      return currentSanity;
   }
   
   public static Investigator getPerson(Investigator[] people, int index) {return people[index];}
   
   public int getLocation(Investigator person) {return person.invLocation;}
   public void setLocation(Investigator person, int newLocation) {person.invLocation = newLocation;}
   
   //
   public void restAction(Investigator person) {
      if (person.getHealth() < person.health()) restoreHealth(1);
      if (person.getSanity() < person.sanity()) restoreSanity(1);
      Engine.useAction();
   }
   
   public ArrayList<Token> getInventory()                      {return this.inventory;}
   public ArrayList<Token> getInventory(Investigator person)   {return person.getInventory();}
   public ArrayList<Token> getInventory(Investigator[] people, int index) {
      return getInventory(people[index]);
   }

   /****************************************
   * Initializes investigators
   ****************************************/
   public static Investigator[] investigatorInit() {
      Investigator[] people = {
         new Investigator("Akachi Onyele","the Shaman",15,              3,2,2,2,4,5,7),
         new Investigator("Charlie Kane","the Politician",22,           2,4,3,2,2,4,8),
         new Investigator("Diana Stanley","the Redeemed Cultist",7,     4,2,3,3,1,7,5),
         new Investigator("Jacqueline Fine","the Psychic",5,            4,2,3,1,3,4,8),
         new Investigator("Jim Culver","the Musician",6,                3,3,2,2,3,7,5),
         new Investigator("Leo Anderson","Expedition Leader",24,        2,2,3,3,3,6,6),
         new Investigator("Lily Chen","Martial Artist",28,              2,2,2,4,3,6,6),
         new Investigator("Lola Hayes","the Actress",29,                2,4,2,2,3,5,7),
         new Investigator("Mark Harrigan","the Soldier",14,             1,2,2,4,4,8,4),
         new Investigator("Norman Withers","the Astronomer",23,         3,1,3,2,4,5,7),
         new Investigator("Silas Marsh","the Sailor",30,                1,3,3,3,3,8,4),
         new Investigator("Trish Scarborough","the Spy",16,             1,3,4,3,2,7,5)
      };
      
      return people;
   }
}