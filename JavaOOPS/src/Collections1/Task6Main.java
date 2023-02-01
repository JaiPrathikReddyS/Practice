package Collections1;
import java.util.Comparator;
import java.util.TreeMap;

public class Task6Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put(8, "Value8");
        treeMap.put(5, "Value5");
        treeMap.put(7, "Value7");
        treeMap.put(4, "Value4");
        treeMap.put(9, "Value9"); 

        System.out.println(treeMap);
    }
}