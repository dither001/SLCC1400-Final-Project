/****************************************
* Last edited: 4/25/2017
* 
* Represents different skill tests
****************************************/

public class Check {
   enum Type {FREEBIE, PENALTY, REWARD, SETBACK}
   enum Test {LOR, INF, OBS, STR, WIL}
   // fields
   private Type type;
   private Test test;
   //private int mod;
   private String text = "";
   private int[] effects;
   
   // constructors
   Check() {
//       this(null, null, 0);
   }
   
   Check(Type type, Test test, int... fx) { // int mod, 
      this.type = type;
      this.test = test;
      //this.mod = mod;
      effects = new int[fx.length];
      
      switch (test) {
         case LOR: this.text = "Test your Lore skill."; break;
         case INF: this.text = "Test your Influence."; break;
         case OBS: this.text = "Test your Observation."; break;
         case STR: this.text = "Test your Strength."; break;
         case WIL: this.text = "Test your Willpower."; break;
         default: break;
      }
      
      for (int i = 0; i < fx.length; ++i) {effects[i] = fx[i];}
   }
   
   // methods
   public Type getType() {return type;}
   public Test getTest() {return test;}
   
   //public Effect getEffect(int[] effects, int index) {return effects[index];}
   
   public void getEffect(int effectID) {
      switch (effectID) {
         case 0: Token.tokenGain(Token.Type.ARTIFACT); break;
         case 1: Token.tokenGain(Token.Type.ASSET); break;
         case 2: Token.tokenGain(Token.Type.CLUE); break;
         case 3: Token.tokenGain(Token.Type.CONDITION); break;
         case 4: Token.tokenGain(Token.Type.SKILL); break;
         case 5: Token.tokenGain(Token.Type.SPELL); break;
         case 6: Token.tokenGain(Token.Type.TICKET); break;
         case 7: Token.tokenGain(Token.Asset.ALLY); break;
         case 8: Token.tokenGain(Token.Asset.ITEM); break;
         case 9: Token.tokenGain(Token.Asset.SERVICE); break;
         case 10: Token.tokenGain(Token.Asset.TRINKET); break;
         case 11: Token.tokenGain(Token.AType.MAGICAL); break;
         case 12: Token.tokenGain(Token.AType.TOME); break;
         case 13: Token.tokenGain(Token.AType.WEAPON); break;
         case 14: Token.tokenGain(Token.Condition.BANE); break;
         case 15: Token.tokenGain(Token.Condition.BOON); break;
         case 16: Token.tokenGain(Token.Condition.DEAL); break;
         case 17: Token.tokenGain(Token.Condition.INJURY); break;
         case 18: Token.tokenGain(Token.Condition.MADNESS); break;
         case 19: Token.tokenGain(Token.Skill.LORE); break;
         case 20: Token.tokenGain(Token.Skill.INFLUENCE); break;
         case 21: Token.tokenGain(Token.Skill.OBSERVATION); break;
         case 22: Token.tokenGain(Token.Skill.STRENGTH); break;
         case 23: Token.tokenGain(Token.Skill.WILL); break;
         case 24: Token.tokenGain(Token.Spell.INCANTATION); break;
         case 25: Token.tokenGain(Token.Spell.RITUAL); break;
         case 26: Token.tokenGain(Token.CType.AMNESIA); break;
         case 27: Token.tokenGain(Token.CType.BACK_INJURY); break;
         case 28: Token.tokenGain(Token.CType.BLESSED); break;
         case 29: Token.tokenGain(Token.CType.CURSED); break;
         case 30: Token.tokenGain(Token.CType.DARK_PACT); break;
         case 31: Token.tokenGain(Token.CType.DEBT); break;
         case 32: Token.tokenGain(Token.CType.DETAINED); break;
         case 33: Token.tokenGain(Token.CType.HALLUCINATIONS); break;
         case 34: Token.tokenGain(Token.CType.INTERNAL_INJURY); break;
         case 35: Token.tokenGain(Token.CType.LEG_INJURY); break;
         case 36: Token.tokenGain(Token.CType.PARANOIA); break;
         case 37: // gain health
            break;
         case 38: // gain sanity
            break;
         default: break;
      }
   }
}