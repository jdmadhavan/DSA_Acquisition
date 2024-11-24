package hashing;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContainsNearbyDuplicate {
    /*
    intialize the map
     */

    @Test
    public void testOne() {
        int[] nums = {1,2, 3, 1};
        int k = 3;
        boolean b = containsNearbyDuplicate(nums, k);
        System.out.println(b);
    }

    @Test
    public void testTwo() {
        int[] nums = {1,0,1,1};
        int k = 1;
        boolean b = containsNearbyDuplicate(nums, k);
        System.out.println(b);
    }

    private boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
                map.put(nums[i], i);
            }
        return false;
    }
}
