import java.util.Arrays;
import java.util.*;
import java.util.Arrays;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    
  //List<List<Integer>> result = TripletSumToZero.searchTriplets(new int[]{-3,0,1,2,-1,-1,-2});
  System.out.println(TripletSumToZero.searchTriplets(new int[]{-3,0,1,2,-1,1,-2}));
  System.out.println(TripletSumToZero.searchTriplets(new int[]{-5,2,-1,-2,3}));
  System.out.println(TripletSumToZero.searchTriplets(new int[]{-3,1,2,3,0}));



  }
}

class TripletSumToZero{

  public static List<List<Integer>> searchTriplets(int[] nums) { 

    List<List<Integer>>triplets = new ArrayList<>();
    int n = nums.length;
    int[] squares = new int[nums.length];
    
    Arrays.sort(nums);

    int rightPointer=nums.length-1;
    int seen1 = 0;
    int seen2 = 0;
  
    for(int i=0;i<n;i++){
      int leftPointer = i+1;
      
        while(leftPointer<=rightPointer){ 
          
          /*System.out.println("leftPointer:" +leftPointer);
          System.out.println("absValue:" +Math.abs(nums[i]));
          System.out.println("rightValue:" +nums[rightPointer]);
          System.out.println("leftValue:" +nums[leftPointer]);
          System.out.println("\n");*/
            
          if(nums[leftPointer]+nums[rightPointer]==Math.abs(nums[i])){
            
            if(nums[leftPointer]!=seen1 || nums[rightPointer]!=seen2){

            triplets.add(Arrays.asList(nums[i], nums[leftPointer], nums[rightPointer]));
            seen1=nums[leftPointer];
            seen2=nums[rightPointer];
              
            }
            rightPointer--;


          }else{

            if(nums[leftPointer]+nums[rightPointer]>Math.abs(nums[i])){
              rightPointer--;
              
            }else{         
              leftPointer++;  
              
            }

          }
 
        }    
      seen1=0;
      seen2=0;
      rightPointer=nums.length-1;
      
    }
  
   return triplets;
 }
}