package pointersAndPrefix;

import org.testng.annotations.Test;

import java.util.Arrays;

public class RemoveTargetElementFromArray {

    /*
    https://leetcode.com/problems/remove-element/
    1)initialize p1=0,p2=0
    2)while(p1<nums.length
          if(n[p1]!==val)
             n[p2]=n[p1]
             p2++;

          else
          p1++;

 return p2;
     */

    @Test
    public void testOne() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = removtheTargetElementFromArray(nums, val);
        System.out.println(k);
        Arrays.copyOf(nums, k);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }

    @Test
    public void testTwo() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = removtheTargetElementFromArray(nums, val);
        System.out.println(k);
        Arrays.copyOf(nums, k);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }

    public int removtheTargetElementFromArray(int[] nums, int val) {
        int p1 = 0;
        int p2 = 0;
        while (p1 < nums.length) {
            if (nums[p1] != val) {
                nums[p2] = nums[p1];
                p2++;
            }
            p1++;
        }
        return p2;
    }


}
