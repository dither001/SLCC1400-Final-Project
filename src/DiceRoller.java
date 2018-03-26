/****************************************
* Last edited: 4/22/2017
* 
* imports Random, sets up dice roller
****************************************/

import java.util.Random;

public class DiceRoller {
   // fields
   private static final Random rand = new Random();
   
   // methods
   public static int testLor(int skill, int mod) {return skillTest(skill, mod);}
   public static int testInf(int skill, int mod) {return skillTest(skill, mod);}
   public static int testObs(int skill, int mod) {return skillTest(skill, mod);}
   public static int testStr(int skill, int mod) {return skillTest(skill, mod);}
   public static int testWil(int skill, int mod) {return skillTest(skill, mod);}
   // overloaded versions with range
   public static int testLor(int skill, int mod, int range){return skillTest(skill, mod, range);}
   public static int testInf(int skill, int mod, int range){return skillTest(skill, mod, range);}
   public static int testObs(int skill, int mod, int range){return skillTest(skill, mod, range);}
   public static int testStr(int skill, int mod, int range){return skillTest(skill, mod, range);}
   public static int testWil(int skill, int mod, int range){return skillTest(skill, mod, range);}
   
   /****************************************
   * Skill Test Method
   ****************************************/
   public static int skillTest(int num, int mod, int range) {
      int successCount = 0;
      num = (num - mod < 1) ? 1 : num - mod;
      for (int i = 1; i <= num; ++i) {
         successCount += (deeRoll(1,6) >= range) ? 1 : 0;
      }
      
      return successCount;
   }
   
   // overloaded SKILL TEST assumes success on 5-6
   public static int skillTest(int num, int mod) {
      return skillTest(num, mod, 5);
   }
   
   // returns X dice with Y sides each
   public static int deeRoll(int num, int sides) {
      int n = 0;
      for (int i = 1; i <= num; ++i) {
         n += deeFace(sides);
      }
      return n;
   }
   
   // returns a single die with N sides
   public static int deeFace(int sides) {
      return rand.nextInt(sides) + 1;
   }
}