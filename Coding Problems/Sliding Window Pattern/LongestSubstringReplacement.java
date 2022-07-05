import java.util.Arrays;
import java.util.*;
import java.util.Arrays;


class Main {
  public static void main(String[] args) {
    int result = CharReplacement.findLength(1, "aabccbb");
    System.out.println("Char replacement max length: "+ result);

  }
}

class CharReplacement{

  public static int findLength(int k, String str) {  
    
    int windowStart = 0;
    int maxLength = 0;
    int maxLetterRepeatCount = 0;
    
    Map<Character,Integer> charIndex = new HashMap<>();
    
    for(int windowEnd=0; windowEnd<str.length();windowEnd++){ 

      char rightChar = str.charAt(windowEnd); 
      charIndex.put(rightChar, charIndex.getOrDefault(rightChar,0)+1); 
      maxLetterRepeatCount = Math.max(maxLetterRepeatCount, charIndex.get(rightChar));

      if(windowEnd - windowStart + 1 - maxLetterRepeatCount > k){
        
        char leftChar = str.charAt(windowStart); 
        charIndex.put(leftChar, charIndex.getOrDefault(leftChar,0)-1);
        windowStart++; 
            
      }
      
     maxLength = Math.max(maxLength, windowEnd-windowStart+1);      
      
  }
  return maxLength;
  
}

  
   
}


