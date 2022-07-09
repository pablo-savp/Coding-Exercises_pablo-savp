import java.util.Arrays;
import java.util.*;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    
  int[] result = SortedArraySquares.makeSquares(new int[]{-2,-1,0,2,3});
    System.out.println("The sorted squared array: ");
    for(int x=0;x<result.length;x++){
       System.out.println(result[x]);    
    }

  System.out.println("The sorted squared array: ");
  result = SortedArraySquares.makeSquares(new int[]{-3,-1,0,1,2});
  for(int x=0;x<result.length;x++){
       System.out.println(result[x]);
      
    }

  }
}

class SortedArraySquares{

  public static int[] makeSquares(int[] nums) { 
    
    int n = nums.length;
    int[] squares = new int[nums.length];
    
    int leftPointer=0;
    int rightPointer=nums.length-1;
    int highestSquareIndex = n-1;

    while(leftPointer<=rightPointer){ 

      int resLeft = nums[leftPointer]*nums[leftPointer];
      int resRight = nums[rightPointer]*nums[rightPointer];

      if(resLeft>resRight){ 
        squares[highestSquareIndex--] =resLeft; 
        leftPointer++; 
      }else{
        squares[highestSquareIndex--] = resRight;
        rightPointer--; 
      }

   }

   return squares;
 }
}