/****************************************
* Last edited: 4/25/2017
* 
* Represents Encounters using Checks
****************************************/

public class Encounter {
   enum Type {GENERAL, LOCAL, RESEARCH, EXPEDITION, OTHER_WORLD}
   //enum Subtype {CITY, WILD, SEAS}
   
   // fields
   private Type type;
   //private Subtype subtype;
   private String text;
   Check[] checks;
   
   // constructors
   public Encounter() {
      this(null);
   }
   
   public Encounter(Type type) {
      this(type, null);
   }
   
   public Encounter(Type type, String text) {
      this(type, null, (Check) null);
   }

   public Encounter(Type type, String text, Check... c) {
      this.type = type;
      this.text = text;
      checks = new Check[c.length];
      for (int i = 0; i < c.length; ++i) {checks[i] = c[i];}
   }
   
   // methods
   public Type getType() {return type;}
   public String getText() {return text;}
   public Check[] getChecks() {return checks;}
   
}