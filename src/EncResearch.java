/****************************************
* Last edited: 4/22/2017
* 
* Azathoth-themed Research encounters
****************************************/

import java.util.ArrayList;

public class EncResearch {
   // fields
   private String flavor;
   private static Token meeple;
   
   // constructors
   
   /****************************************
   * Reusable code
   ****************************************/
   
   public void localEncounter(Investigator person, Location place) {
      switch (Dice.deeRoll(1,8)) {
         case 1:     encounter1(person, place); break;
         case 2:     encounter2(person, place); break;
         case 3:     encounter3(person, place); break;
         case 4:     encounter4(person, place); break;
         case 5:     encounter5(person, place); break;
         case 6:     encounter6(person, place); break;
         case 7:     encounter7(person, place); break;
         case 8:     encounter8(person, place); break;
         default:    encounter1(person, place); break;
      }
      System.out.print("\n-------- -------- -------- --------");
   }
   
   public void textPrint(ArrayList<String> text) {
      System.out.print("\n-------- ----Research---- --------");
      for (String el : text) {System.out.print("\n" + el);}
   }
   
   /****************************************
   * General encounter 1
   ****************************************/
   public void encounter1(Investigator person, Location place) {
      Location.LocType type = place.type;
      switch (type) {
         case CITY:
            flavor = "Inside a warehouse, you hear a clicking sound and discover a creature that resembles a metallic crate walking around on several legs. You try to follow the thing back to the cult's lair.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Observation skill:");
            Menu.pressEnter();
            if (Dice.testObs(person.getObs(),-1) > 0) {
               Token.awardThisClue();
               Token.clueGain();
               //Token.tokenGain(Token.Type.CLUE);
               System.out.print("\nYou gain 2 clue tokens.");
            }
            break;
         case WILD:
            flavor = "A meteor exploded in the air, scattering a glowing green powder. You try to find a sufficient amount of the compound.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Observation skill:");
            Menu.pressEnter();
            if (Dice.testObs(person.getObs(),-1) > 0) {
               Token.awardThisClue();
               System.out.print("\nYou gain 1 clue token.");
            }
            break;
         case SEAS:
            flavor = "You overhear the Navigator say that the stars are not as they should be. The ship is utterly lost. You believe you understand the significance of the new alignment of stars.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Lore skill:");
            Menu.pressEnter();
            if (Dice.testLor(person.getLor(),0) > 0) {
               Token.awardThisClue();
               Token.clueGain();
               //Token.tokenGain(Token.Type.CLUE);
               System.out.print("\nYou gain 2 clue tokens.");
            }
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
            flavor = "A few hours before the performance of the opera Massa di Requiem per Shuggay you have a chance to examine the libretto.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Lore skill:");
            Menu.pressEnter();
            if (Dice.testLor(person.getLor(),0) > 0) {
               Token.awardThisClue();
               System.out.print("\nYou gain 1 clue token.");
            }
            break;
         case WILD:
            flavor = "Mi-go have dug up the meteor that you were seeking. Curious, you attempt to spy on them.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Observation skill:");
            Menu.pressEnter();
            if (Dice.testObs(person.getObs(),0) > 0) {
               Token.awardThisClue();
               Token.clueGain();
               //Token.tokenGain(Token.Type.CLUE);
               System.out.print("\nYou gain 2 clue tokens.");
            }
            break;
         case SEAS:
            flavor = "Your ship is destroyed by a glowing rock that fell from the sky! Gain this Clue. You struggle to reach wreckage that can keep you afloat.";
            textPrint(TextWrap.textWrap(flavor));
            Token.awardThisClue();
            System.out.print("\nYou gain 1 clue token.");
            System.out.print("\n\nTest your Strength skill:");
            Menu.pressEnter();
            if (Dice.testStr(person.getStr(),0) <1) {
               // LOSE 2 HEALTH
            }
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
            flavor = "Scientists report that their sample of radium was stolen! Your investigation indicates a connection to worshipers of Azathoth.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Observation skill:");
            Menu.pressEnter();
            if (Dice.testObs(person.getObs(),0) > 0) {
               Token.awardThisClue();
               System.out.print("\nYou gain 1 clue token.");
            }
            break;
         case WILD:
            flavor = "An eerie mist surrounds you and you find yourself in the court of Azathoth! Your mind can barely endure what you are seeing.";
            textPrint(TextWrap.textWrap(flavor));
            Token.awardThisClue();
            System.out.print("\nYou gain 1 clue token.");
            System.out.print("\n\nTest your Willpower:");
            Menu.pressEnter();
            if (Dice.testWil(person.getWil(),0) < 1) {
               // LOSE 6 SANITY
            }
            break;
         case SEAS:
            flavor = "You dream of floating through space, watching stars disappear. You try to recognize constellations so you'll remember which stars disappeared.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Observation skill:");
            Menu.pressEnter();
            if (Dice.testObs(person.getObs(),0) > 0) {
               Token.awardThisClue();
               System.out.print("\nYou gain 1 clue token.");
            }
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
            flavor = "A team of geologists have disappeared after studying a chunk of rock that was retrieved from a nearby crater. You visit their lab and feel waves of strange energy emanating from the stone, eroding your body from the inside.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Strength skill:");
            Menu.pressEnter();
            if (Dice.testStr(person.getStr(),0) > 0) {
               Token.awardThisClue();
               System.out.print("\nYou gain 1 clue token.");
            }
            break;
         case WILD:
            flavor = "This far away from city lights, you get an unparalleled view of the night sky. You comb the sky, hoping to catch sight of a meteor shower.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Observation skill:");
            Menu.pressEnter();
            if (Dice.testObs(person.getObs(),0) > 0) {
               Token.awardThisClue();
               System.out.print("\nYou gain 1 clue token.");
               // SPAWN 1 CLUE TOKEN
            }
            break;
         case SEAS:
            flavor = "This far away from city lights, you get an unparalleled view of the night sky. You comb the sky, hoping to catch sight of a meteor shower.";
            textPrint(TextWrap.textWrap(flavor));
            Token.awardThisClue();
            System.out.print("\nYou gain 1 clue token.");
            // PLACE 1 ELDRITCH ON OMEN TRACK
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
            flavor = "Doctors ask you to observe a trephination. They pull away a piece of his skull, and you examine the brain.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Observation skill:");
            Menu.pressEnter();
            if (Dice.testObs(person.getObs(),0) > 0) {
               Token.awardThisClue();
               Token.clueGain();
               //Token.tokenGain(Token.Type.CLUE);
               System.out.print("\nYou gain 2 clue tokens.");
            }
            break;
         case WILD:
            flavor = "You discover a 20-foot-tall, grey metallic cone! You try to make sense of the alien technology inside.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Lore skill:");
            Menu.pressEnter();
            if (Dice.testLor(person.getLor(),-1) > 0) {
               // DISCARD 1 ELDRITCH FROM OMEN TRACK
            }
            break;
         case SEAS:
            flavor = "You wake up to find a large, winged creature in your cabin. If offers you an object to use in your fight against Azathoth.";
            textPrint(TextWrap.textWrap(flavor));
            // ACCEPT DARK PACT FOR THIS CLUE & Ttka Halot Artifact
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
            flavor = "You attend a reading by Edward Pickman Derby from his book Azathoth and Other Horrors and ask him about the occult.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Influence:");
            Menu.pressEnter();
            if (Dice.testInf(person.getInf(),0) > 0) {
               Token.awardThisClue();
               System.out.print("\nYou gain 1 clue token.");
            }
            break;
         case WILD:
            flavor = "You examine an odd cave painting by torchlight. If depicts Azathoth sitting on a throne in the center of a starry spiral. You search for any signs of the painting's source.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Observation skill:");
            Menu.pressEnter();
            if (Dice.testObs(person.getObs(),0) > 0) {
               Token.awardThisClue();
               System.out.print("\nYou gain 1 clue token.");
            }
            break;
         case SEAS:
            flavor = "You watch a meteor shower streak across the night sky.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Observation skill:");
            Menu.pressEnter();
            if (Dice.testObs(person.getObs(),0) > 0) {
               Token.awardThisClue();
               Token.clueGain();
               //Token.tokenGain(Token.Type.CLUE);
               System.out.print("\nYou gain 2 clue tokens.");
            }
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
            flavor = "Something in your brain is manipulating your memories, trying to control you.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Willpower:");
            Menu.pressEnter();
            if (Dice.testWil(person.getWil(),0) > 0) {
               Token.awardThisClue();
               System.out.print("\nYou gain 1 clue token.");
            }
            break;
         case WILD:
            flavor = "You ask the villages about their peculiar folklore.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Influence:");
            Menu.pressEnter();
            if (Dice.testInf(person.getInf(),0) > 0) {
               Token.awardThisClue();
               System.out.print("\nYou gain 1 clue token.");
            }
            break;
         case SEAS:
            flavor = "A volcano throws smoke and burning ask into the air. Despite the toxic fumes, you force yourself to continue watching.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Willpower:");
            Menu.pressEnter();
            if (Dice.testWil(person.getWil(),0) > 0) {
               Token.awardThisClue();
               Token.clueGain();
               //Token.tokenGain(Token.Type.CLUE);
               System.out.print("\nYou gain 2 clue tokens.");
            }
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
            flavor = "The university allows you to use its telescope to search for signs of a green comet.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Observation skill:");
            Menu.pressEnter();
            if (Dice.testObs(person.getObs(),0) > -1) {
               Token.awardThisClue();
               Token.clueGain();
               //Token.tokenGain(Token.Type.CLUE);
               System.out.print("\nYou gain 2 clue tokens.");
            }
            break;
         case WILD:
            flavor = "Something attacks you in the dark. To your eyes, there is nothing around you but trees.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Observation skill:");
            Menu.pressEnter();
            if (Dice.testObs(person.getObs(),0) > 0) {
               Token.awardThisClue();
               Token.clueGain();
               //Token.tokenGain(Token.Type.CLUE);
               System.out.print("\nYou gain 2 clue tokens.");
            }
            break;
         case SEAS:
            flavor = "A pale, blubbery-looking sailor tells you of a dream he's been having about a green stone at the bottom of the ocean. You try to use his description to determine the actual location.";
            textPrint(TextWrap.textWrap(flavor));
            System.out.print("\n\nTest your Observation skill:");
            Menu.pressEnter();
            if (Dice.testObs(person.getObs(),0) > 0) {
               // MOVE OMEN TRACK ANYWHERE W/O ADVANCING DOOM
            }
            break;
         default: break;
      }
   }
}