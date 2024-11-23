package pointersAndPrefix;

import org.testng.annotations.Test;

import java.util.Arrays;

public class RemoveDuplicateFromArray_Part2 {
/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
1)initialize the p1=1,p2=1, counter=1;
2) while (p1<input.length)
        if  input[p1]==input[p1-1]
                  counter++;
         else counter=1;

        if counter<=2
              inout[p2]=input[p1];
              p2++;
     p1++;
     return p1

 4) copyof(nums,p1)












 */
    
    @Test
    public void testOne()
    {
        int[] nums={1,1,1,2,2,3};
        int k = removeDuplicateValue_Array(nums);
        System.out.println(k);

        System.out.println(Arrays.toString( Arrays.copyOf(nums, k)));

    }

    @Test
    public void testOTwo()
    {
        int[] nums={0,0,1,1,1,1,2,3,3};
        int k = removeDuplicateValue_Array(nums);
        System.out.println(k);

        System.out.println(Arrays.toString( Arrays.copyOf(nums, k)));

    }

    public int removeDuplicateValue_Array(int[] nums) {
        int p1=1,p2=1,counter=1;
        while(p1<nums.length)
        {
            if(nums[p1]==nums[p1-1])
            {
              counter++;
            }
            else {
                counter=1;
            }

            if(counter<=2)
            {
                nums[p2]=nums[p1];
                p2++;
            }

        p1++;
        }

        return p2;
    }

}
