package Collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        numbers.add(9);
        
        Collections.sort(numbers, Collections.reverseOrder());
        int secondLargest = numbers.get(1);
        System.out.println("The Second Largest Number is: " + secondLargest);
    }
}