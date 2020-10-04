import java.io.*; 
  
class Perimeter { 
  
    // Function to calculate perimeter 
    static int perimeter(int diameter, int height) 
    { 
        return 2 * (diameter + height); 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args) 
    { 
        int diameter = 5; 
        int height = 10; 
        System.out.println("Perimeter = " + 
                         perimeter(diameter, height)  
                                       + " units\n"); 
    } 
} 
