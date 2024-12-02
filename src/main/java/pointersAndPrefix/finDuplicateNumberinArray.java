package pointersAndPrefix;

import java.util.Arrays;

public class finDuplicateNumberinArray {


    public static int findDuplicateNumber(int[] nums) {
        int p1=0,p2=1;
        Arrays.sort(nums);
        while(p1<nums.length-1)
        {
            if(nums[p1]==nums[p2])
            {
                return nums[p1];
            }
            p1++;
            p2++;
        }
    return -1;
    }


    public static void main(String[] args) {
        int[] nums = {3,3,3,3,3};
        System.out.println(findDuplicateNumber(nums));

    }
}
