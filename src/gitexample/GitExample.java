package gitexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gerencsér Gábor
 */
public class GitExample {

    public static void printArray(List<Integer> array){
        for (Integer a : array) {
            System.out.println(a);
        }
    }
    
    public static void main(String[] args) {
        
        List<Integer> array = new ArrayList<>();
        array.add(1);
        printArray(array);
        addValueForArray(array);
    }
    
    public static void addValueForArray(List<Integer> array){
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }
    }
}
