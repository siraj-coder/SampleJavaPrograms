import java.util.*; 
import java.lang.*; 
  
public class Array { 
  
    
    public static int findremainder(int arr[], 
                                   int len, int n) 
    { 
        int mul = 1; 
  
        
        for (int i = 0; i < len; i++) 
            mul = (mul * (arr[i] % n)) % n; 
  
        return mul % n; 
    } 
  
        public static void main(String argc[]) 
    { 
        int[] arr = new int[] { 100, 10, 5, 
                                25, 35, 14 }; 
        int len = 6; 
        int n = 11; 
  
        
        System.out.println(findremainder(arr, len, n)); 
    } 
} 
