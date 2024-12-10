package slidingWindow;

import org.testng.annotations.Test;

public class NoOFSuarrayWithSumEqualTOK_BinarySubArra {

    @Test
    public void testOne()
    {
        int [] nums={1,0,1,0,1};
        int goal=2;
        int i = numSubarraysWithSum(nums, goal)- numSubarraysWithSum(nums, goal-1);
        System.out.println(i);
    }


    private int numSubarraysWithSum(int[] nums, int goal) {

        int count=0,left=0,sum=0;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];

            while(sum>goal)
            {
             sum-=nums[left];
             left++;

            }
            count+=right-left+1;
        }

        return count;
    }
}
