package pointersAndPrefix;

import org.testng.annotations.Test;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
1)initialize the p1=0,p2=1;
2)while(p2<nums.lenght)
       if(nums(p2)!=nums[p2-1])
             p1++;
             n[p1]=n[p2];

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
        int p1=1,p2=0;
        while(p1<nums.length)
        {
            if(nums[p1]!=nums[p1-1])
            {
                p2++;
                nums[p2]=nums[p1];
            }
            p1++;
        }

        return p2+1;
    }

}
