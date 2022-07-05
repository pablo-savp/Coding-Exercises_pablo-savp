import java.util.Arrays;
import java.util.*;
import java.util.Arrays;


class Main {
  public static void main(String[] args) {
    String result = MinimumWindowSubstring.findSubstring("abdcabc", "abc");
    System.out.println("Minimum length substring that contains the pattern: "+ result);

  }
}

class MinimumWindowSubstring{

  public static String findSubstring(String str, String pattern) {  
    int windowStart = 0;
    int matchCount = 0;
    int patternLength = pattern.length();
    int minLength = str.length()+1;
    int start =0;
    
    Map<Character,Integer>patterns = new HashMap<>();
    for(int i=0; i<patternLength;i++){
      
    char charac = pattern.charAt(i); 
    patterns.put(charac,patterns.getOrDefault(charac,0)+1);  

    }
    
    for(int windowEnd=0; windowEnd<str.length();windowEnd++){ 
      
      char rightChar = str.charAt(windowEnd); 
      if(patterns.containsKey(rightChar)){  
        
        patterns.put(rightChar,patterns.get(rightChar)-1); 

        if(patterns.get(rightChar)>=0){ 
       
          matchCount++;
          
        }
      } 

        while(matchCount== pattern.length()){ 

          System.out.println("MinLength "+ minLength);
          System.out.println("Window "+ (windowEnd - windowStart +1));
          
          if(minLength > windowEnd - windowStart  +1){
            minLength = windowEnd - windowStart + 1;
            start = windowStart;
          } 
          
        char leftChar = str.charAt(windowStart++);
        if(patterns.containsKey(leftChar)){

          if(patterns.get(leftChar) == 0){ 
              matchCount--;
          }
          patterns.put(leftChar,patterns.get(leftChar)+1);
        }
      }  
    }
      return str.substring(start, start+minLength);
 }
}
  



