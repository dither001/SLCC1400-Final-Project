/****************************************
* Last edited: 4/22/2017
* 
* city encounters for the Americas
****************************************/

import java.util.ArrayList;

public class EncGreen {
   // fields
   private String flavor;
   
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
      System.out.print("\n-------- ---- America ---- --------");
      for (String el : text) {System.out.print("\n" + el);}
   }
   
   /****************************************
   * Green encounter 1
   ****************************************/
   public void encounter1(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case ARKHAM:
            flavor = "In the restricted section of Miskatonic University's library, you study an esoteric tome.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SAN_FRANCISCO:
            flavor = "Inspector Jack Manion is looking for information about the Tongs in Chinatown. If you can help him, he'll teach you the basics of police work in exchange.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case BUENOS_AIRES:
            flavor = "In an ancient underground chamber, you study strange scientific and magic paraphernalia once used by the Serpent Men.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Green encounter 2
   ****************************************/
   public void encounter2(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case ARKHAM:
            flavor = "During the night, you have a nightmare about the old witch, Keziah Mason. In the dream, she shares her power with you. When you wake up, you fear that the old witch will someday ask you for a favor in return.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SAN_FRANCISCO:
            flavor = "You find the husk of a squid-like creature in a tunnel. Just seeing it terrifies you.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case BUENOS_AIRES:
            flavor = "You sneak into the temple and overhear the rough creaking of deep ones chanting. You recognize familiar elements to the words they are intoning.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Green encounter 3
   ****************************************/
   public void encounter3(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case ARKHAM:
            flavor = "The Silver Twilight Lodge members ask you several riddles to prove your knowledge.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SAN_FRANCISCO:
            flavor = "You meet Hammett, a former Pinkerton Agent, on the street car and try to convince him to teach you how to be a detective.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case BUENOS_AIRES:
            flavor = "The museum's curator shows you a unique golden jewel that was recovered from the sea. You believe that the symbols on it indicate that something is hidden inside.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Green encounter 4
   ****************************************/
   public void encounter4(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case ARKHAM:
            flavor = "An anonymous patient in the asylum pleads with you to share what you've learned.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SAN_FRANCISCO:
            flavor = "You speak to a military prisoner on Alcatraz Island He tells you his story of deserting after encountering a horrific creature.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case BUENOS_AIRES:
            flavor = "A student has been studying the university's copy of the Necronomicon and is eager to share what he's learned in exchange for hearing what you know.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Green encounter 5
   ****************************************/
   public void encounter5(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case ARKHAM:
            flavor = "Some ritual had been performed in the Black Cave, but the cultists are long gone. You look around for anything they may have left behind.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SAN_FRANCISCO:
            flavor = "You are invited to the Hearst Castle and find yourself surrounded by the best and brightest.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case BUENOS_AIRES:
            flavor = "You sneak aboard a ship loaded with stolen antiquities, including an ancient stone tablet. Memorizing the words, you feel yourself slipping into a trance.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Green encounter 6
   ****************************************/
   public void encounter6(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case ARKHAM:
            flavor = "Inside Ye Olde Magick Shoppe, Miriam Beecher talks to you about the finer points of the occult.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SAN_FRANCISCO:
            flavor = "While patrolling in Chinatown, you become adept at spotting signs of cult activity. You find their temple, but must dispel a hex on the door to enter.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case BUENOS_AIRES:
            flavor = "An old woman warns you that you've angered Yig and teaches you a protective chant. Concerned that she may be right, you learn all you can about Yig.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Green encounter 7
   ****************************************/
   public void encounter7(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case ARKHAM:
            flavor = "The administrators of Arkham's Historical Society take great pains to Show you their extensive collection of historical documents.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SAN_FRANCISCO:
            flavor = "The Examiner hires you to spend a night in the Winchester Mystery House. They provide you with experts in detecting the supernatural. The odd architecture and the building's history threaten to unhinge your mind as the evening passes.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case BUENOS_AIRES:
            flavor = "At the hospital you find a bald, old man with leathery skin and a flat face. He speaks very slowly, but his story is fascinating. ";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Green encounter 8
   ****************************************/
   public void encounter8(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case ARKHAM:
            flavor = "A fortune teller in Independence Square warns you of dire events. You try to interpret her words.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SAN_FRANCISCO:
            flavor = "A pulp author named Smith invites you to read his work. The stories disturb you.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case BUENOS_AIRES:
            flavor = "A copy of the Necronomicon is kept at the University of Buenos Aires, but the librarian tells you that it's not available for viewing at this time. You try to convince him of the books importance.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
}