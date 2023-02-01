package Collections1;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortTreeMapByValues {

  public static void main(String[] args) {
    Map<Integer, String> map = new TreeMap<>();
    map.put(1, "Jiya Brein");
    map.put(2, "Paul Niksui");
    map.put(3, "Martin Theron");
    map.put(4, "Nima Roy");
    
    Map<Integer, String> sortedMap = sortByValues(map);
    System.out.println(sortedMap);
  }

  private static Map<Integer, String> sortByValues(Map<Integer, String> map) {
    Map<Integer, String> sortedMap = new TreeMap<>(new ValueComparator(map));
    sortedMap.putAll(map);
    return sortedMap;
  }

  static class ValueComparator implements Comparator<Integer> {
    Map<Integer, String> map;

    ValueComparator(Map<Integer, String> map) {
      this.map = map;
    }

    @Override
    public int compare(Integer key1, Integer key2) {
      String value1 = map.get(key1);
      String value2 = map.get(key2);
      return value2.compareTo(value1);
    }
  }
}