package Collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ReverseListUsingComparator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer number1, Integer number2) {
                return number2 - number1;
            }
        });

        System.out.println("Sorted Numbers in Reverse Order: " + numbers);
    }
}