package codSolving;

import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoSumOfIndices {

    /*
   https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

    Input: numbers = [2,7,11,15], target = 9
     Output: [1,2]

     psudo code
     1) Declare Left & Right Pointer.
     2) iterate  array  until left<right
     3) if nums[left]+nums[right]==target , return left,right
     4) if( nums[left]+nums[right]>target), Decrese right--
     5) if(nums[left]+nums[right]<target), increase left++



    */

    @Test
    public void testOne() {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] twoSumValue = twoSum(nums,target);
        System.out.println(Arrays.toString(twoSumValue));
    }

    @Test
    public void testInputTwo() {
        int[] nums = {2,3,4};
        int target = 6;
        int[] twoSumValue =  twoSum(nums,target);
        System.out.println(Arrays.toString(twoSumValue));
    }

    @Test
    public void testInputThree() {
        int[] nums = {-1,0};
        int target = -1;
        int[] twoSumValue =  twoSum(nums,target);
        System.out.println(Arrays.toString(twoSumValue));
    }

    public int[] twoSum(int[] numbers,int target) {

        int letftvale = 0;
        int rightValue = numbers.length - 1;
        while (letftvale < rightValue) {
            if (numbers[letftvale] + numbers[rightValue] == target) {
                return new int[]{letftvale+1, rightValue+1};
            }
            else if (numbers[letftvale] + numbers[rightValue] > target) {
                rightValue--;
            }
            else {
                letftvale++;
            }
        }

        return new int[]{-1, -1};
    }
}


