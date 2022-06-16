import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    double[] result = AverageOfSubarrayOfSizeK.findAverages(5, new int[] {1,3,2,6,-1,4,1,8,2,9});
    System.out.println("Averages of subarrays of size K: "+ Arrays.toString(result));

  }
}

class AverageOfSubarrayOfSizeK{

  public static double[] findAverages(int k, int[] arr) {
    
    double[] result = new double[arr.length-k+1]; //Creamos un arreglo del tamaño del original menos el K+1
    double windowSum=0;
    int windowStart=0;

    for(int windowEnd=0; windowEnd<arr.length;windowEnd++){
      windowSum= windowSum + arr[windowEnd]; //Sumatoria la cual va sumando los valores de cada iteracion.
      
      //En el momento en que la ventana abarca la cantidad de K elementos, entramos al if. 
      if(windowEnd >= k-1){ 
        
        result[windowStart] = windowSum/k; //Calculamos el promedio pedido.
        windowSum= windowSum - arr[windowStart]; //Quitamos el primer elemento de la ventana para dar paso a un nuevo elemento, considerando que la ventana solo puede tener k elementos.
        windowStart++;  //Movemos la ventana hacia adelante   
      }
      
    }
    

    return result;

  
}
}

