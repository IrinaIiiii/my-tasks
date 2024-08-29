package task1;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 3};
        metod(array);
    }

    public static void metod(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int s = 1;
            if (map.containsKey(array[i])) {
                s = map.get(array[i]) + 1;
            }
            map.put(array[i], s);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}


