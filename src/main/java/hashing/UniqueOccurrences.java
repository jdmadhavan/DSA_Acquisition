package hashing;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {
    /*
    intialize the map
     */

    @Test
    public void testOne() {
        int[] nums = {1, 2, 3, 1};
        int k = 1;
        boolean b = uniAccurance(nums);
        System.out.println(b);
    }

    private boolean uniAccurance(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put((arr[i]), map.getOrDefault(arr[i], 0) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Set<Integer> uniqueoccurance = new HashSet<>(map.values());
        return map.values().size() == uniqueoccurance.size();
    }
}
