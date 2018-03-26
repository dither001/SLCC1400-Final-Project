/****************************************
* Last edited: 4/20/2017
* 
* encounters for non-Named locations
****************************************/

import java.util.ArrayList;

public class EncGeneral {
   // fields
   private String flavor;
   
   // constructors
   
   /****************************************
   * Reusable code
   ****************************************/
   
   public void localEncounter(Investigator person, Location place) {
      switch (Dice.deeRoll(1,12)) {
         case 1:     encounter1(person, place); break;
         case 2:     encounter2(person, place); break;
         case 3:     encounter3(person, place); break;
         case 4:     encounter4(person, place); break;
         case 5:     encounter5(person, place); break;
         case 6:     encounter6(person, place); break;
         case 7:     encounter7(person, place); break;
         case 8:     encounter8(person, place); break;
         case 9:     encounter9(person, place); break;
         case 10:    encounter10(person, place); break;
         case 11:    encounter11(person, place); break;
         case 12:    encounter12(person, place); break;
         default:    encounter1(person, place); break;
      }
      System.out.print("\n-------- -------- -------- --------");
   }
   
   public void textPrint(ArrayList<String> text) {
      System.out.print("\n-------- ----Encounter---- --------");
      for (String el : text) {System.out.print("\n" + el);}
   }
   
   /****************************************
   * General encounter 1
   ****************************************/
   public void encounter1(Investigator person, Location place) {
      ArrayList<Token> inventory = person.getInventory(person);
      Location.LocType type = place.type;
      switch (type) {
         case CITY:
            flavor = "You make sure no one is watching before sneaking out of the shop with your stolen goods.";
            textPrint(TextWrap.textWrap(flavor));
            if (Dice.testObs(person.getObs(),0) > 0) {
            }
            else {
            }
            break;
         case WILD:
            flavor = "The remains of a long-dead explorer lie before you. Some of his gear still seems salvageable, and he won't miss it. You dig through the dead man's pockets.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SEAS:
            flavor = "You find the floating detritus of some sunken ship and search for any survivors or salvageable objects.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
      
   /****************************************
   * General encounter 2
   ****************************************/
   public void encounter2(Investigator person, Location place) {
      Location.LocType type = place.type;
      switch (type) {
         case CITY:
            flavor = "Corrupt members of the police force pressure you for a bribe. You speak to some people you know to take care of the problem.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case WILD:
            flavor = "Far from any road or village, you find a shallow grave marked only with an arcane symbol. As you dig, a growing dread weakens your resolve.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SEAS:
            flavor = "Your ship becomes lost in a dense fog bank, terrifying the superstitious crew. When the mist finally clears, you've somehow traveled hundreds of miles. ";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
      
   /****************************************
   * General encounter 3
   ****************************************/
   public void encounter3(Investigator person, Location place) {
      Location.LocType type = place.type;
      switch (type) {
         case CITY:
            flavor = "The shop is robbed while you are browsing! You attempt to fend off the thieves.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case WILD:
            flavor = "You scrape away years of moss and lichen from the stone altar, uncovering a series of prehistoric symbols. You think you can interpret the carvings.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SEAS:
            flavor = "One of the sailors is singing an old sea shanty about a woman searching for her dead husband. The story seems familiar to you.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
      
   /****************************************
   * General encounter 4
   ****************************************/
   public void encounter4(Investigator person, Location place) {
      Location.LocType type = place.type;
      switch (type) {
         case CITY:
            flavor = "A group of intimidating Syndicate members demand you pay them for protection. You offer the well-dressed men what you can afford.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case WILD:
            flavor = "The terrain ahead of you looks impassable, but going around would take too long. You'll need to find some way to move forward.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SEAS:
            flavor = "You discover a signal fire on a small island, but don't find any people. You search the beach for signs of life.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
      
   /****************************************
   * General encounter 5
   ****************************************/
   public void encounter5(Investigator person, Location place) {
      Location.LocType type = place.type;
      switch (type) {
         case CITY:
            flavor = "A shady figure offers to sell you a weapon, no questions asked. You speak with him to determine his motives.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case WILD:
            flavor = "The ground slopes upward so uniformly that you suspect a structure exists underneath. You search for a buried entrance to claim the treasures found inside.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SEAS:
            flavor = "The captain tells you that you are passing over the site of a famous shipwreck. You can use the ship's deep-sea diving equipment to explore the wreckage.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
      
   /****************************************
   * General encounter 6
   ****************************************/
   public void encounter6(Investigator person, Location place) {
      Location.LocType type = place.type;
      switch (type) {
         case CITY:
            flavor = "You wander through the aisles of an antique book store. Although many extremely rare books can be found here, the organizational system is almost impossible to decipher.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case WILD:
            flavor = "You help a young woman search the countryside for her uncle.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SEAS:
            flavor = "The ship ahead of you seemed abandoned, but now you see that it is crewed entirely by ghostly figures. You try to discern what ship this had once been and what happened to it.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
      
   /****************************************
   * General encounter 7
   ****************************************/
   public void encounter7(Investigator person, Location place) {
      Location.LocType type = place.type;
      switch (type) {
         case CITY:
            flavor = "A friendly game of cards ends with a very high-stakes hand.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case WILD:
            flavor = "Your map is gone, and you must navigate based on your own observations.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SEAS:
            flavor = "A sudden storm descends upon you and strong winds whip around your vessel. Huge waves toss your ship around like a toy, and you are thrown to the deck repeatedly.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
      
   /****************************************
   * General encounter 8
   ****************************************/
   public void encounter8(Investigator person, Location place) {
      Location.LocType type = place.type;
      switch (type) {
         case CITY:
            flavor = "A night of drinking and good cheer helps raise your spirits. While you are celebrating, you hardly notice that you are being robbed.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case WILD:
            flavor = "Past where your campfire allows you to see, you hear voices chanting. You try to draw a protective sigil in the ground.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SEAS:
            flavor = "You find a terrified Stowaway aboard the ship. You attempt to comfort him and coax him into telling you his story.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
      
   /****************************************
   * General encounter 9
   ****************************************/
   public void encounter9(Investigator person, Location place) {
      Location.LocType type = place.type;
      switch (type) {
         case CITY:
            flavor = "The police report that people are being abducted by a monster dwelling in the sewer system. Wandering through the underground tunnels you are suddenly attacked by a deep one!";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case WILD:
            flavor = "In the middle of the night, a feral beast rips apart your camp and attacks you!";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SEAS:
            flavor = "The captain of the ship invites you to dine with him. You have the feeling that he's had some experience with unearthly creatures and try to convince him to share his stories.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
      
   /****************************************
   * General encounter 10
   ****************************************/
   public void encounter10(Investigator person, Location place) {
      Location.LocType type = place.type;
      switch (type) {
         case CITY:
            flavor = "The police ask for your help investigating a series of ritual killings. The grisly crime scenes threaten to overwhelm you with chills and nausea.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case WILD:
            flavor = "Extreme conditions have left you fevered and delirious. You force yourself to keep moving, putting a terrible strain on your body.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SEAS:
            flavor = "You're awakened in the night by gunfire. Deep ones have climbed aboard the ship and are trying to sabotage the engine. You do your best to help the crew fight them.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
      
   /****************************************
   * General encounter 11
   ****************************************/
   public void encounter11(Investigator person, Location place) {
      Location.LocType type = place.type;
      switch (type) {
         case CITY:
            flavor = "Legends say that this cemetery is haunted. Exploring the headstones, you encounter an angry specter, eager to share his story. The experience is nerve-wracking, but you try to listen.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case WILD:
            flavor = "According to your map, you can make a detour to visit a lake purported to have restorative powers.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SEAS:
            flavor = "One of the sailors speaks in a strange, ancient dialect. You try to communicate with the man based on obscure languages you have studied.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * General encounter 12
   ****************************************/
   public void encounter12(Investigator person, Location place) {
      Location.LocType type = place.type;
      switch (type) {
         case CITY:
            flavor = "The Syndicate is engaged in a gang war with local thugs and is under intense legal scrutiny. You try to trade your political clout for assistance.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case WILD:
            flavor = "You find a primitive painting on the wall of a cave and decide to explore the subterranean depths that lie beyond. The dark, constricting passages create a terrible sense of claustrophobia.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SEAS:
            flavor = "A large wave washes across the deck, and a prized possession slips from your fingers. You dive into the water, holding your breath as long as you can to recover the object before it sinks out of reach.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Blank encounter template
   ****************************************/
   public void encounterN(Investigator person, Location place) {
      Location.LocType type = place.type;
      switch (type) {
         case CITY:
            flavor = "";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case WILD:
            flavor = "";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SEAS:
            flavor = "";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   // end of class
}