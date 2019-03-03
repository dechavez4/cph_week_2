package sortering;
import java.util.Scanner;
import java.util.Arrays;

public class Sortering {

    public static void main(String[] args) {
              String[] names = {           
              "Oliver",
              "Noah",
              "Alma",
              "William",
              "Victor",
              "Laura",
              "Oscar",
              "Sofia",
              "Ida",
              "Freja"  };
    
    // sort the array, using the sort method of the Arrays class
    Arrays.sort(names);
    
    // print the sorted results
    for (String nameOrder : names)
    {
      System.out.println(nameOrder);
    }
    }
        
}
