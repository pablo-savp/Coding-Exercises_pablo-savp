import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int result = SmallestSubArrayWithGivenSum.findSmallest(7, new int[] {3,4,1,1,5});
    System.out.println("Smallest Subarray length: "+ result);

  }
}

class SmallestSubArrayWithGivenSum{

  public static int findSmallest(int k, int[] arr) {  
    int windowSum=0;
    int windowStart=0;
    int minLength = arr.length;
  
    for(int windowEnd=0; windowEnd<arr.length;windowEnd++){
      
      windowSum= windowSum + arr[windowEnd]; 

      while(windowSum>=k){

        minLength = Math.min(minLength, windowEnd-windowStart+1);
        windowSum = windowSum - arr[windowStart];
        windowStart++;
     
      }
   
    }
    
    return minLength;

}
}

