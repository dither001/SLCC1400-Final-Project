/****************************************
* Last edited: 4/22/2017
* 
* city encounters for Asia/Australia
****************************************/

import java.util.ArrayList;

public class EncPurple {
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
      System.out.print("\n--------  Asia / Australia --------");
      for (String el : text) {System.out.print("\n" + el);}
      
   }
   
   /****************************************
   * Purple encounter 1
   ****************************************/
   public void encounter1(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case SHANGHAI:
            flavor = "You search through old copies of The Shanghai Courier to find strange or unexplained stories.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case TOKYO:
            flavor = "You ask the enigmatic Dragon Lords to rid the world of potential threats to Japan.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SYDNEY:
            flavor = "You dream of crossing a vast desert hunted by an enormous winged creature. In the dream, you turn to face your fears.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Purple encounter 2
   ****************************************/
   public void encounter2(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case SHANGHAI:
            flavor = "If you can convince Chu Min to help, he will use New China's vast resources to provide you with any sort of instruction you require.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case TOKYO:
            flavor = "You may become Delayed to explore some submerged pyramids off the coast of Okinawa. If you do, you discover ancient writing that claims to \"harm one's enemies;\"";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SYDNEY:
            flavor = "A group of hunters provide you with the skills to trace down a bunyip. When you find the massive four-legged creature, your weapons cannot pierce its leathery hide. You try to protect yourself from the beast's terrible claws and teeth.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Purple encounter 3
   ****************************************/
   public void encounter3(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case SHANGHAI:
            flavor = "The shrine holds an abundance of ancient relics. Your eye catches strange figures written on the ceiling. You find it hard to look away.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case TOKYO:
            flavor = "You find a gem bearing the symbol of the Emerald Lama. In its facets, you see the image of some horrible beast. Suddenly, the creature is right next to you!";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SYDNEY:
            flavor = "Your money and passport have been stolen! You work on the Sydney Harbor Bridge to pay the bills. You meet the job's rigorous demands. When your passport is found at the scene of a crime, you need to prove your innocence.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Purple encounter 4
   ****************************************/
   public void encounter4(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case SHANGHAI:
            flavor = "The Shanghai Museum recommends you speak to Mu Hsien, a preeminent scholar of the occult. You send him a message that you hope will convince him to help.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case TOKYO:
            flavor = "The reigning Emperor has been plagued by nightmares. His advisors ask your opinion and you assure them that these horrors are real.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SYDNEY:
            flavor = "Several passengers on an underground train have been trapped by a tunnel collapse. The dark and claustrophobic climb through the rubble is terrifying.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Purple encounter 5
   ****************************************/
   public void encounter5(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case SHANGHAI:
            flavor = "The decadent crime lord, Lin Tang-Yu, offers you access to his library of occult treasures in exchange for information.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case TOKYO:
            flavor = "Captain Isoge Taro of the Imperial Japanese Navy takes particular interest in your investigations. You describe the threats that the world is facing.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SYDNEY:
            flavor = "The Theosophical Society is excited to hear what knowledge you have gained during your travels.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Purple encounter 6
   ****************************************/
   public void encounter6(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case SHANGHAI:
            flavor = "You break into a warehouse filled with ancient wonders and learn much by studying its contents. You must remain silent to avoid being caught.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case TOKYO:
            flavor = "The Brotherhood of the Black Lotus has poisoned you! You fall into a coma and confront your greatest fears.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SYDNEY:
            flavor = "Due to a city-wide shortage of supplies, shopkeepers won't even show you their wares unless you prove that you can pay top dollar.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Purple encounter 7
   ****************************************/
   public void encounter7(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case SHANGHAI:
            flavor = "The old man offers to make tea for you. You see him mix in a strange, green powder that he calls \"tyuk.\"";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case TOKYO:
            flavor = "A strange man dressed in the charred robes of a monk offers you help in exchange for knowledge.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SYDNEY:
            flavor = "An old, aboriginal man is on trial for a murder that you know he didn't commit. You agree to testify to prove his innocence.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
   
   /****************************************
   * Purple encounter 8
   ****************************************/
   public void encounter8(Investigator person, Location place) {
      Location.CityName city = place.city;
      switch (city) {
         case SHANGHAI:
            flavor = "You spot an odd, fish-like man pull a young monk underwater! You dive in to rescue him, holding your breath as long as you can.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case TOKYO:
            flavor = "A translation of The Tao of Immortality is kept in the Tokyo University Library. If you are deemed trustworthy, you are granted access to the ancient text.";
            textPrint(TextWrap.textWrap(flavor));
            break;
         case SYDNEY:
            flavor = "The constable sees you admire the abandoned weapon. \"Give it a bit to see if anyone claims it,\" he says. \"If not, you can help yourself.\"";
            textPrint(TextWrap.textWrap(flavor));
            break;
         default: break;
      }
   }
}