package codSolving;

import org.testng.annotations.Test;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
1)initialize the p1=0,p2=1;
2)while(p2<nums.lenght)
       if(nums(p2)!=nums[p2-1])
             p1++;
             n[p2=n[i];

3)return p1+1;

 */
    
    @Test
    public void testOne()
    {
        int[] nums={1,1,2};
        int k = removeDuplicateValue_Array(nums);
        System.out.println(k);

        System.out.println(Arrays.toString( Arrays.copyOf(nums, k)));

    }

    public int removeDuplicateValue_Array(int[] nums) {
        int p1=0,p2=1;
        while(p2<nums.length)
        {
            if(nums[p2]!=nums[p2-1])
            {
                p1++;
                nums[p1]=nums[p2];
            }
            p2++;
        }

        return p1+1;
    }

}
