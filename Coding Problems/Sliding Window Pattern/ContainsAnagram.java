import java.util.Arrays;
import java.util.*;
import java.util.Arrays;


class Main {
  public static void main(String[] args) {
    ArrayList<Integer> result = ContainsAnagram.containsAnagram("accadcabac", "abc");
    System.out.println("Starting indices of the anagrams of the pattern: "+ result);

  }
}

class ContainsAnagram{

  public static ArrayList<Integer> containsAnagram(String str, String pattern) {  
    int windowStart = 0;
    int maxLength = 0;
    int matchCount = 0;
    int patternLength = pattern.length();
    ArrayList<Integer> matches = new ArrayList<Integer>();
    int x =0;
    
    Map<Character,Integer>patterns = new HashMap<>();
    
    for(int i=0; i<patternLength;i++){
      
    char charac = pattern.charAt(i); 
    patterns.put(charac,patterns.getOrDefault(charac,0)+1);  

    }
    
    for(int windowEnd=0; windowEnd<str.length();windowEnd++){ 
      
      char rightChar = str.charAt(windowEnd); 

      
      if(patterns.containsKey(rightChar)){  
        
        patterns.put(rightChar,patterns.get(rightChar)-1);

        if(patterns.get(rightChar)==0){ 
       
          matchCount++;
          
        }
        
      } 

      if(matchCount == patterns.size()){

        matches.add(windowStart);
   
      } 

      if(windowEnd >= patternLength-1){
      
        char leftChar = str.charAt(windowStart++);

        if(patterns.containsKey(leftChar)){

          if(patterns.get(leftChar) == 0){ 
            matchCount--; 
          }

          patterns.put(leftChar,patterns.get(leftChar)+1);
        } 
        
      } 
    }
      return matches;
 }
}
  



