package hashing;

import org.testng.annotations.Test;

public class PivotIndex {

    /*
      1) Intialize leftSum=0,;
      2) Put value into has map Key =0, value=1
      3) iterate the nums array and add total sum
      4) iterate the array from 0 index to <arrays.length
      5) if(leftsum==totalSum-leftSum-nums[i])

         return i

      return leftsum+=num[i];

     */

    @Test
    public void tesOne() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int thepiovtIndex = findThepiovtIndex(nums);
        System.out.println("thepiovtIndex---->" + thepiovtIndex);

    }

    @Test
    public void tesTwo() {
        int[] nums = {1, 2, 3};
        int thepiovtIndex = findThepiovtIndex(nums);
        System.out.println("thepiovtIndex---->" + thepiovtIndex);

    }

    @Test
    public void tesThee() {
        int[] nums = {2, 1, -1};
        int thepiovtIndex = findThepiovtIndex(nums);
        System.out.println("thepiovtIndex---->" + thepiovtIndex);

    }

    public int findThepiovtIndex(int[] nums) {

        int leftSum = 0, totalSum = 0;
        for (int val : nums) {
            totalSum += val;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }

}
