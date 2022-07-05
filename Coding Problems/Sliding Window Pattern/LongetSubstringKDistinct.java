import java.util.Arrays;
import java.util.*;
import java.util.Arrays;


class Main {
  public static void main(String[] args) {
    int result = LongestSubstringKDistinct.findLength(2,"araaci");
    System.out.println("Longest Substring Length: "+ result);

  }
}

class LongestSubstringKDistinct{

  public static int findLength(int k, String word) {  
    int windowStart=0;
    int maxLength=0;
    Map<Character,Integer> charFrequencyMap = new HashMap<>();

    for(int windowEnd=0; windowEnd<word.length();windowEnd++){
      // a r a a c
      //windowEnd 4
      //windowStart 2
      char rightChar = word.charAt(windowEnd);
      charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar,0)+1);

      while(charFrequencyMap.size() > k){

        char leftChar = word.charAt(windowStart);
        charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar)-1);

        if(charFrequencyMap.get(leftChar)==0){
          charFrequencyMap.remove(leftChar);
        }
        windowStart++;
       
      }
      maxLength = Math.max(maxLength, windowEnd-windowStart+1);
  }
  return maxLength;
  
}

  
   
}


