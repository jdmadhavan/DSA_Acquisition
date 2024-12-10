package binarySearch;

import org.testng.annotations.Test;

public class SingleNonDuplicate {

    /*

    i/p= 1,1,2,3,3,4,4,8,8
    0/p= 2;
    1) low=0,high=nums.lenght-1
    2) while(low<=high)
         mid=(low+high)/2;
    3)  if (check mid is even && nums[mid]== nums[mid+1])
                low=mid-1;
           else
                low=mid+1;
      return mid
     */

    @Test
    public void testOne()
    {
        int[] nums={1,1,2,3,3,4,4,8,8};
        int i = singleNonDuplicate(nums);
        System.out.println(i);
    }

    private int singleNonDuplicate(int[] nums) {

        int low=1,high=nums.length-2, n=nums.length;
        if(n==1) return nums [0];
        if (nums [0]!=nums [1]) return nums [0];
        if(nums [n-1]!=nums[n-2]) return nums[n-1];
        while(low<=high)
        {
            int mid=(low+high)/2;

            if ((mid%2==0 && nums[mid]==nums[mid+1])||(mid%2==1 && nums[mid]==nums[mid-1]))
            {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return nums[low];
    }
}
