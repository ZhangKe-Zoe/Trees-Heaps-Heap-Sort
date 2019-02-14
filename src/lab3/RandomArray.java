package lab3;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author myego
 */
public class RandomArray {
    
private static Double[] anArray;
    
public static Double[] fillArray(int lenght){
    
    anArray = new Double[lenght]; // create the Array with 10 slots
    Random rand = new Random(System.currentTimeMillis()); // create a local variable for Random
    for (int i = 0; i < lenght; i++) // create a loop that executes 10 times
    {
        anArray[i] = rand.nextDouble(); // each execution through the loop
                                        // generates a new random number and
                                        // stores it in the array at the
                                        // position i of the for-loop
    }
    //printArray();
    return anArray;// print the result
}

 public static List<Double> createList(int len){
        List<Double> arr = new ArrayList<Double>();
        Random r = new Random();
        for(int i=0;i<=10000;i++)
            arr.add(r.nextDouble()); 
        return arr;
            
        }

private static void printArray() {
    for (int i = 0; i < 10; i++) {
        System.out.println(anArray[i]);
    }
}
    
}
