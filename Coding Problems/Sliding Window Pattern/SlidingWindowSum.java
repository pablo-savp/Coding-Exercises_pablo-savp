import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int result = MaximumSubArraySum.findSum(2, new int[] {2,3,4,1,5});
    System.out.println("Subarray with maximum sum is: "+ result);

  }
}

class MaximumSubArraySum{

  public static int findSum(int k, int[] arr) {  
    //double[] result = new double[arr.length-k+1]; 
    int result =0;
    int windowSum=0;
    int windowStart=0;

    for(int windowEnd=0; windowEnd<arr.length;windowEnd++){
      windowSum= windowSum + arr[windowEnd]; 
      // 2 1 5 1 3 2
   
      if(windowEnd >= k-1){ 

        if(windowSum>result){ 
          result = windowSum;  
        }
        windowSum= windowSum - arr[windowStart]; 
        windowStart++;  
        
      }
      
    }
    
    return result;

  
}
}

