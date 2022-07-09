import java.util.Arrays;
import java.util.*;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
  ArrayList<Integer>result = PairWithTargetSum.search(new Integer[]{2,5,9,11}, 11);
    System.out.println("The numbers at both index result in the sum: "+ result);

  }
}

class PairWithTargetSum{

  public static ArrayList<Integer> search(Integer[] nums, int target) { 

    ArrayList<Integer> results = new ArrayList<>();
    
    int startPointer=0;
    int endPointer=nums.length-1;
    int sum =0;

    for(int i=0; i<nums.length;i++){
      
      sum = nums[startPointer]+nums[endPointer];
      if(sum == target){
        results.add(startPointer);
        results.add(endPointer);  
        break;
        
      }else{ 
        if(sum>target){
          endPointer--; //4
        }else{
          startPointer++; //2
        }
          
     }
    
   }
  return results;
 }
}