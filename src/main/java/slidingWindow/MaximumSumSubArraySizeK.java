package slidingWindow;

import org.testng.annotations.Test;

public class MaximumSumSubArraySizeK {

    @Test
    public void testOne()
    {
        int arr[] = {700, 200, 300, 400};
        int k = 2 ;
        sumOfSubarrayK(arr,k);


    }

    private int sumOfSubarrayK(int[] nums, int k) {

        int csum=0, msum=0;

        for(int i=0;i<k;i++)
        {
            csum+=nums[i];
            msum=Math.max(msum,csum);
        }

        for(int i=k;i<nums.length;i++)
        {
            csum-=nums[i-k];
            csum+=nums[i];
            msum=Math.max(msum,csum);
        }
      return msum;
    }
}
