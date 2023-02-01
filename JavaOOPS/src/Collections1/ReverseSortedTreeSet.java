package Collections1;

import java.util.Comparator;
import java.util.TreeSet;

public class ReverseSortedTreeSet {
    public static void main(String[] args) {
  
        TreeSet<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer number1, Integer number2) {
                return number2.compareTo(number1);
            }
        });
        numbers.add(5);
        numbers.add(9);
        numbers.add(4);
        numbers.add(6);
        numbers.add(1);
        numbers.add(3);
        System.out.println("Numbers in Reverse Order: "+ numbers); 
    }
}