package array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        String[] anArray; 
        anArray  = new String[4];
        
        anArray[0] = "Hvem";
        anArray[1] = "fuck";
        anArray[2] = "er";
        anArray[3] = "du!";
        System.out.println(Arrays.toString(anArray));
    
                String[] nameOrder = {
              "Oliver",
              "Noah",
              "Alma",
              "William",
              "Victor",
              "Laura",
              "Oscar",
              "Sofia",
              "Ida",
              "Freja"
            };
        System.out.println(Arrays.toString(nameOrder));           
    }            
}
