package binarySearch;

import org.testng.annotations.Test;

import java.lang.annotation.Target;
import java.util.Arrays;

public class ReturnTargetIndex
{

    /*
    searchRange
    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    i/p nums ={5,7,7,8,8,10}
    target=6
    o/p
       [3,4]

       1) initialize low=0,high=nums.length-1,
       2) while(low<=high)
           int mid=(low+high)/2;
                  if(target==nums[mid&]target==nums[mid+1])
                     return new array {mid,mid+1}
                    else(target==mid&target==mid-1)
                     return new array {mid-1,mid}

                   if(nums[low]<=nums[mid]
                         if(nums[low]<=target&&target<=nums[mid]
                                  high=mid-1;
                            else  low=mid+1;
                    else if( nums[high]>=nums[mid]
                        if(nums[high]>=target&&target>nums[mid])
                                   low=mid+1
                                 else high=mid-1;
     */

   /* @Test
    public void testOne() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] targetIndex = findTargetIndex(nums, target);
        System.out.println(Arrays.toString(targetIndex));


    }

    @Test
    public void testTwo() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] targetIndex = findTargetIndex(nums, target);
        System.out.println(Arrays.toString(targetIndex));

    }

    @Test
    public void testThree() {
        int[] nums = {};
        int target = 0;
        int[] targetIndex = findTargetIndex(nums, target);
        System.out.println(Arrays.toString(targetIndex));
    }
*/
   /* @Test
    public void testFour() {
        int[] nums = {1};
        int target = 1;
        int[] targetIndex = findTargetIndex(nums, target);
        System.out.println(Arrays.toString(targetIndex));
    }*//* @Test
    public void testFour() {
        int[] nums = {1};
        int target = 1;
        int[] targetIndex = findTargetIndex(nums, target);
        System.out.println(Arrays.toString(targetIndex));
    }*//* @Test
    public void testFour() {
        int[] nums = {1};
        int target = 1;
        int[] targetIndex = findTargetIndex(nums, target);
        System.out.println(Arrays.toString(targetIndex));
    }*/

    @Test
    public void testFive() {
        int[] nums = {5,7,7,8,8,10};
        int target=8;
        int first = findTargetIndexBinary(nums, target,true);
        int last = findTargetIndexBinary(nums, target,false);
        System.out.println(Arrays.toString(new int[]{first,last}));


    }

    private int findTargetIndexBinary(int[] nums, int target, boolean findFirst) {
        int low=0, high= nums.length-1;
        int ans=0;
        while (low<=high){
            int mid= (low+high)/2;
            if(nums[mid]==target) {
                ans=mid;
                if(findFirst) high=mid-1;
                else low=mid+1;
            }
            else if (nums[mid]>target){
                high=mid-1;
            }else low=mid+1;

        }
        return ans;
    }
}

/*
private int[] findTargetIndex(int[] nums, int target)
{


    int low = 0, high = nums.length;
    if (nums.length == 0) return new int[]{-1, -1};
    if (nums[0] == 1 && target == 1) return new int[]{0, 0};
    if (nums[0] == 1 && target == 0) return new int[]{-1, -1};
    while (low <= high) {
        int mid = (low + high) / 2;
        if (target == nums[mid] && target == nums[mid + 1])
            return new int[]{mid, mid + 1};
        else if (target == nums[mid] && target == nums[mid - 1]) return new int[]{mid - 1, mid};
        if (nums[low] <= nums[mid])
            if (nums[mid] <= target && target >= nums[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        else if (nums[high] >= nums[mid]) {
            if (nums[mid] >= target && target <= nums[high]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

    }
    return new int {1,1};
}
*/



