/****************************************
* Last edit: 4/22/2017
* 
* represents game board locations
****************************************/

import java.util.ArrayList;

public class Location {
   // fields
   enum LocType {CITY, WILD, SEAS}
   enum CityName {ARKHAM, BUENOS_AIRES, SAN_FRANCISCO, ISTANBUL, LONDON, ROME, SHANGHAI, SYDNEY, TOKYO}
   enum WildName {AMAZON, HEART_AFRICA, PYRAMIDS, ANTARCTICA, TUNGUSKA, HIMALAYAS}
   
   private static int currentLocation = 0;
   private String name = "";
   private int where;
   private int[] destinations;
   
   public LocType type;
   public CityName city;
   public WildName wild;
   
   private ArrayList<Token> inventory = new ArrayList<Token>();
   
   // constructors
   public Location() {
      this("Nowhere", null, 0);
   }
   
   public Location(String name, LocType type, int where, int... d) {
      this.name = name;
      this.type = type;
      this.where = where;
      
      switch (name) {
         // named cities
         case "Arkham": city = Location.CityName.ARKHAM; break;
         case "Buenos Aires": city = Location.CityName.BUENOS_AIRES; break;
         case "San Francisco": city = Location.CityName.SAN_FRANCISCO; break;
         case "London": city = Location.CityName.LONDON; break;
         case "Rome": city = Location.CityName.ROME; break;
         case "Istanbul": city = Location.CityName.ISTANBUL; break;
         case "Tokyo": city = Location.CityName.TOKYO; break;
         case "Shanghai": city = Location.CityName.SHANGHAI; break;
         case "Sydney": city = Location.CityName.SYDNEY; break;
         // named wilds
         case "The Amazon": wild = Location.WildName.AMAZON; break;
         case "The Pyramids": wild = Location.WildName.PYRAMIDS; break;
         case "Heart of Africa": wild = Location.WildName.HEART_AFRICA; break;
         case "Antarctica": wild = Location.WildName.ANTARCTICA; break;
         case "Tunguska": wild = Location.WildName.TUNGUSKA; break;
         case "The Himalayas": wild = Location.WildName.HIMALAYAS; break;
         default: break;
      }
      
      int n = 0;
      for (int el : d) {++n;}
      destinations = new int[n];
      
      for (int i = 0; i < destinations.length; ++i) {
         destinations[i] = d[i];
      }
   }
   
   // methods
   public static int getLocation() {
      return currentLocation;
   }
   
   public static void updateLocation(int newLocation) {
      currentLocation = newLocation;
   }
   
   public String getName()                               {return name;}
   public String getName(Location place)                 {return place.getName();}
   public String getName(Location[] places, int index)   {return getName(places[index]);}
   
   public int[] getDestinations()                        {return this.destinations;}
   public int[] getDestinations(Location place)          {return place.getDestinations();}
   public int[] getDestinations(Location[] places, int index) {
      return getDestinations(places[index]);
   }
   
   public int numDestinations()                          {return this.destinations.length;}
   public int numDestinations(Location place)            {return place.numDestinations();}
   public int numDestinations(Location[] places, int index) {
      return numDestinations(places[index]);
   }
   
   public ArrayList<Token> getInventory()                {return this.inventory;}
   public ArrayList<Token> getInventory(Location place)  {return place.getInventory();}
   public ArrayList<Token> getInventory(Location[] places, int index) {
      return getInventory(places[index]);
   }
   
   public static Location getPlace(Location[] places, int index) {
      return places[index];
   }
   
   public int getIndex(Location place) {
      return where;
   }
   
   /****************************************
   * Initializes game board
   ****************************************/
   public static Location[] boardInit() {
      Location[] places = {
         // location 0
         new Location("The Reserve",Location.LocType.CITY,0),
         // locations 1-10
         new Location("Anchorage",Location.LocType.CITY,1,              4,19,22),
         new Location("Hawaii",Location.LocType.SEAS,2,                 22,29),
         new Location("South Pacific",Location.LocType.SEAS,3,          24,30),
         new Location("Canadian Wilds",Location.LocType.WILD,4,         1,5),
         new Location("American Heartland",Location.LocType.CITY,5,     4,23,22),
         new Location("Deep South",Location.LocType.CITY,6,             7,23,22),
         new Location("Central America",Location.LocType.CITY,7,        6,8,24,22,31),
         new Location("Bermuda",Location.LocType.SEAS,8,                7,10,23,22),
         new Location("Greenland",Location.LocType.WILD,9,              23),
         new Location("West Africa",Location.LocType.WILD,10,           8,15,26,32),
         // locations 11-20
         new Location("South Atlantic",Location.LocType.SEAS,11,        15,24),
         new Location("Southern Ocean",Location.LocType.SEAS,12,        24,34),
         new Location("Arctic Ocean",Location.LocType.SEAS,13,          25),
         new Location("Northern Europe",Location.LocType.CITY,14,       16,26),
         new Location("South Africa",Location.LocType.CITY,15,          10,11,17,18,33),
         new Location("Central Russia",Location.LocType.CITY,16,        14,27,35),
         new Location("Bombay",Location.LocType.WILD,17,                15,20,27,28,36),
         new Location("Indian Ocean",Location.LocType.SEAS,18,          15,30),
         new Location("East Siberia",Location.LocType.WILD,19,          1,28,29,35),
         new Location("Indonesia",Location.LocType.SEAS,20,             17,28,30,29),
         // locations 21-30
         new Location("North Australia",Location.LocType.SEAS,21,       30),
         new Location("San Francisco",Location.LocType.CITY,22,         1,2,5,6,7),
         new Location("Arkham",Location.LocType.CITY,23,                5,6,8,9,25),
         new Location("Buenos Aires",Location.LocType.CITY,24,          3,7,8,11,12,31),
         new Location("London",Location.LocType.CITY,25,                13,23,26),
         new Location("Rome",Location.LocType.CITY,26,                  10,14,25,27,32),
         new Location("Istanbul",Location.LocType.CITY,27,              16,17,26,32),
         new Location("Shanghai",Location.LocType.CITY,28,              17,20,29,36),
         new Location("Tokyo",Location.LocType.CITY,29,                 2,19,20,28),
         new Location("Sydney",Location.LocType.CITY,30,                3,12,18,21,34),
         // locations 31-36
         new Location("The Amazon",Location.LocType.WILD,31,            7,24),
         new Location("The Pyramids",Location.LocType.WILD,32,          10,25,26,33),
         new Location("Heart of Africa",Location.LocType.WILD,33,       15,32),
         new Location("Antarctica",Location.LocType.WILD,34,            12,30),
         new Location("Tunguska",Location.LocType.WILD,35,              16,19),
         new Location("The Himalayas",Location.LocType.WILD,36,         17,28)
      };
      
      return places;
   }
}