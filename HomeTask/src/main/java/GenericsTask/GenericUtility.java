package GenericsTask;

public class GenericUtility {
	public static <T extends Comparable<T>> T receiveLeastValue(T object1, T object2) {
        if (object1.compareTo(object2) < 0) {
            return object1;
        }
        return object2;
    }
}
