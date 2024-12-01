package slidingWindow;

import org.testng.annotations.Test;

public class MaxSumSubarray {


    @Test
    public void testOne() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};


        int maximumSubArry = maximumSubArry(nums);
        System.out.println(maximumSubArry);
    }

    private int maximumSubArry(int[] nums) {
        int csum=nums[0];
        int msum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
         csum=Math.max(csum+nums[i],nums[i]);
         msum=Math.max(msum,csum);
        }
return  msum;
    }
}
