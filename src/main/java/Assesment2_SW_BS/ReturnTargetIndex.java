package Assesment2_SW_BS;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ReturnTargetIndex
{
     /*
    searchRange
    i/p nums ={5,7,7,8,8,10}
    target=6
    o/p
       [3,4]

       1) initialize the low,high=arrays.length-1,idx=0;
       2)while low<high
              int mid=(low+high)/2;
              if(nums[mid]==target)
                 idx=mid;
                  if(findFirst) high=mid-1;
                  else low=mid+1
              if(nums[mid]>target)
              high=mid-1;
              else
               low=mid+1;
         return the idx;

       3)find the starting index -do the 2nd step with first find as true and find the index
       4) fidn the end index - do the 2nd step with first find first false and find the index
       5) return the both index

      */


    @Test
    public void testOne() {
        int[] nums = {5,7,7,8,8,10};
        int target=8;
        int first = findTargetIndexBinary(nums, target,true);
        int last = findTargetIndexBinary(nums, target,false);
        System.out.println(Arrays.toString(new int[]{first,last}));


    }
    @Test
    public void testTwo() {
        int[] nums = {5,7,7,8,8,10};
        int target=6;
        int first = findTargetIndexBinary(nums, target,true);
        int last = findTargetIndexBinary(nums, target,false);
        System.out.println(Arrays.toString(new int[]{first,last}));
    }

    @Test
    public void testThree() {
        int[] nums = {};
        int target=0;
        int first = findTargetIndexBinary(nums, target,true);
        int last = findTargetIndexBinary(nums, target,false);
        System.out.println(Arrays.toString(new int[]{first,last}));
    }


    private int findTargetIndexBinary(int[] nums, int target, boolean findFirst) {
        int low=0, high= nums.length-1;
        int idx=-1;
        while (low<=high){
            int mid= (low+high)/2;
            if(nums[mid]==target) {
                idx=mid;
                if(findFirst) high=mid-1;
                else low=mid+1;
            }
            else if (nums[mid]>target){
                high=mid-1;
            }else low=mid+1;

        }
        return idx;
    }
}




