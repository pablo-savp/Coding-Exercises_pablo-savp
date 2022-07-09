import java.util.Arrays;
import java.util.*;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
  int result = RemoveDuplicates.remove(new Integer[]{2,3,3,3,6,9,9});
    System.out.println("The array length without duplicates: "+ result);

  result = RemoveDuplicates.remove(new Integer[]{2,2,2,11});
  System.out.println("The array length without duplicates: "+ result);

  }
}

class RemoveDuplicates{

  public static int remove(Integer[] nums) { 

    int length = nums.length;
    
    for(int i=0; i<nums.length-1;i++){
      
      if(nums[i]==nums[i+1]){ 
        length--; 
      }

   }
  return length;
 }
}