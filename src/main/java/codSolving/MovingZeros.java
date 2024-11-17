package codSolving;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MovingZeros {

    /*
    https://leetcode.com/problems/move-zeroes/description/

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

Psudo Code:
1) Declare 2 points p1,p2, Both pointer Start with 0 position
2) while (p1<nums.length)
     - if(nums[p1]!=0}
             -do swap int temp=nums[p1];
                       nums[p1]=nums[p2];
                       nums[p2]=temp
                       p1++;
      - if(nums[p1]==0)
             -p2++

 3) return nums
     */
    @Test
    public void validateInputOne()
    {
        int[] nums = {0,1,0,3,12};
         moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void validateInputTwo()
    {
        int[] nums = {0};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeros(int[] nums1) {
        int p1 = 0;
        int p2 = 0;
        while (p1 < nums1.length) {
            if (nums1[p1] != 0) {
                int tempVar = nums1[p2];
                nums1[p2] = nums1[p1];
                nums1[p1] = tempVar;
                p2++;
            }
            p1++;

        }


    }
}

