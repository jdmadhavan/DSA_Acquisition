package slidingWindow;

import org.testng.annotations.Test;

import java.util.HashMap;

public class NumSubarraysWithSum_BinarySubArray {

    /*
      ip =1,0,1,0,1
      op=4

      1) Initialize left=0, right=0, result=0,sum pointer
      2) Iterate the array  from 0>length
               sum+=nums[i]
               while(sum>goals)
               {
                 sum-=nums[left]
                 left++;
               }
               result+=right-left+1;

     return result;
https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/

     */


    @Test
    public void testOne()
    {
        int[] nums={1,0,1,0,1};
        int goal=2;
        //int result = numSubarraysWithSum(nums, goal)-numSubarraysWithSum(nums, goal-1);
        int result1 = numSubarraysWithSum1(nums, goal);
        System.out.println(result1);
    }

    private int numSubarraysWithSum1(int[] nums, int goal) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int result=0, sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];

             if(map.containsKey(sum-goal))
             {
                 result+=map.get(sum-goal);
             }

             map.put(sum,map.getOrDefault(sum,0)+1);
        }
return  result;
    }


    public int numSubarraysWithSum(int[] nums,int goal)
    {
        int left=0,result=0,sum=0;

        for(int right=0; right<nums.length; right++)
        {
                sum+=nums[right];
                while(sum>goal)
                {
                    sum-=nums[left];
                }
                result+=right-left+1;


        }


    return result;
    }

}
