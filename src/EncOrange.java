/****************************************
* Last edited: 4/22/2017
* 
* city encounters for Africa/Europe
****************************************/

import java.util.ArrayList;

public class EncOrange {
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
      System.out.print("\n-------- -Africa / Europe- --------");
      for (String el : text) {System.out.print("\n" + el);}
   }
   
   /****************************************
   * Orange encounter 1
   ****************************************/
   public void encounter1(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case LONDON:
            flavor = "The Silver Twilight Lodge is locked up tight. You look over the old building for a possible entrance.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ROME:
            flavor = "The Vatican Library is so vast! You ask a librarian for a recommendation.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ISTANBUL:
            flavor = "Inside the loud hustle and bustle of the Grand Bazaar, you negotiate to find a skilled instructor to tutor you.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }

   /****************************************
   * Orange encounter 2
   ****************************************/
   public void encounter2(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case LONDON:
            flavor = "Inside the Herefordshire Asylum, a patient asks you if you've seen the Yellow Sign. You listen to his story of the King in Yellow.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ROME:
            flavor = "You have an inspirational dream in which you are a proud Roman quaestor. Your reverie is interrupted by a band of small, primitive men running wild outside. You try to negotiate with this lost tribe of Miri Nigri.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ISTANBUL:
            flavor = "People from every walk of life can be found enjoying the cleansing steam of the Turkish baths. Inside, you'll eventually find an expert in any given field.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }

   /****************************************
   * Orange encounter 3
   ****************************************/
   public void encounter3(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case LONDON:
            flavor = "You peruse The Scoop, a tabloid paper that specializes in strange and lurid stories.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ROME:
            flavor = "You speak to a number of Vatican authorities about your investigations. They carefully consider your story.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ISTANBUL:
            flavor = "Professor Azap at the Topkapi Museum is not easily impressed. Only serious scholars can earn his respect.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }

   /****************************************
   * Orange encounter 4
   ****************************************/
   public void encounter4(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case LONDON:
            flavor = "In exchange for a generous donation, the Penhew Foundation will happily show the results of its global explorations.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ROME:
            flavor = "You discover a hidden shrine to Cybele in an ancient catacomb. It will be a long process to excavate the find, but removing such a blight from Rome's foundations will grant you a higher reward.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ISTANBUL:
            flavor = "You see a horrid apparition slowly ascending the stairs and have the immediate impulse to run away.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }

   /****************************************
   * Orange encounter 5
   ****************************************/
   public void encounter5(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case LONDON:
            flavor = "Impulsively, you look through the inspector's files While his back is turned. Unfortunately, he sees you, and you'll need to fight your way out of Scotland Yard.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ROME:
            flavor = "Ever since arriving in Rome, you've had nightmares about being betrayed. You try to assure yourself that they are only dreams.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ISTANBUL:
            flavor = "The British Ambassador, Sir Douglas Rutherford, begs for your help. His child has been abducted by the Brothers of the Skin.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }

   /****************************************
   * Orange encounter 6
   ****************************************/
   public void encounter6(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case LONDON:
            flavor = "You meet an eccentric painter in Soho who offers to show you his work. Amid his bizarre, alien landscapes, you notice some familiar details.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ROME:
            flavor = "A group of Blackshirts are interrogating an old priest, and you try to intervene.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ISTANBUL:
            flavor = "Members of the Turkish parliament offer you help in exchange for clearing a group of cultists out of the Shunned Mosque. Inside, you interrupt a ritual and must resist the effect of its magical energies.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }

   /****************************************
   * Orange encounter 7
   ****************************************/
   public void encounter7(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case LONDON:
            flavor = "At the lecture of a noted archaeologist, he reveals startling information! During the presentation, a stranger tries to sneak a scarab into your pocket, it is inscribed with the words, \"Cursed be he who moves my body. To him shall come fire, water, and pestilence.\"";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ROME:
            flavor = "A witch cult must have used this villa to conduct their rituals. They've left behind a number of small potions.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ISTANBUL:
            flavor = "A secret group of scholars has taken an interest in you. They show you a shocking, ancient text written by Theodorus Philetas regarding his translation of the Necronomicon. His words deeply disturb you.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }

   /****************************************
   * Orange encounter 8
   ****************************************/
   public void encounter8(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case LONDON:
            flavor = "You are invited to journey down to Oxford to examine John Dee's translation of the Necronomicon.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ROME:
            flavor = "You are invigorated by a visit to a magnificent cathedral. In the basement, you find a mosaic depicting robed men bowing before a great fire. To your horror, it is surrounded by scorch marks that resemble human silhouettes!";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case ISTANBUL:
            flavor = "You suspect that you are being followed. You use a reflective window to watch the people walking behind you.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
}