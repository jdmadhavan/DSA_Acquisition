package slidingWindow;

import org.testng.annotations.Test;

public class MinSumsubArray {




    @Test
    public void testOne() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int minsumSubArray = findMinsumSubArray(nums, target);
        System.out.println(minsumSubArray);
    }

    @Test
    public void testTwo() {
        int[] nums = {1,4,4};
        int target = 4;

        int minsumSubArray = findMinsumSubArray(nums, target);
        System.out.println(minsumSubArray);
    }

    private int findMinsumSubArray(int[] nums, int target) {
            int p1 = 0, min = Integer.MAX_VALUE, sum = 0;

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                while (sum>=target) {
                    min = Math.min(min, i - p1 + 1);
                    sum = sum - nums[p1];
                    p1++;
                }
            }
            return min==Integer.MAX_VALUE ? 0 : min;

    }
}
