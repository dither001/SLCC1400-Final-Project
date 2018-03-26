/****************************************
* Last edited: 4/19/2017
* 
* confines text to set chars per line
****************************************/

import java.util.ArrayList;
import java.util.Collections;

public class TextWrap {
   // fields
   private static final char WRAP_KEY = ' ';
   private static final int LINE_LENGTH = 32;
   
   // constructors
   
   // methods
   public static ArrayList<String> textWrap(String text) {
      int start = 0;
      int end = 0;
      int pointer = LINE_LENGTH;
      boolean atEnd = false;
      
      ArrayList<String> parser = new ArrayList<>();
      while (atEnd != true) {
         if (pointer >= text.length()) {
            pointer = text.length() - 1;
            atEnd = true;
         }
         while (text.charAt(pointer) != WRAP_KEY) {--pointer;}
         end = pointer;
         parser.add(text.substring(start, end));
         // reset
         start = end;
         pointer += LINE_LENGTH;
         if (pointer >= text.length()) {
            end = text.length();
            parser.add(text.substring(start, end));
            atEnd = true;
         }
      }
      
      return parser;
   }
}