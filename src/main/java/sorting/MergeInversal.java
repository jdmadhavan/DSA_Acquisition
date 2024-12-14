package sorting;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MergeInversal {

   /*nput: intervals = [[0,30],[5,10],[15,20]]
    Output: false


    1) sort the nums. & result=true;
    2) find the start time and end time
          s=nums[0][0]
          e=nums[0][1]
     3) iterate the 2d array from 1 to length
           if(nums[i][0]<=e)
           {
           result=false;
           }
           else
           {
              s=nums[i][0];
              e=nums[i][1];
           }




    */
    @Test
    public void testOne()
    {
     int[][] nums={{0,30},{5,10},{15,20}};
        boolean b = merrgeIntervals(nums);
        System.out.println(b);

    }

    @Test
    public void testThree()
    {
        int[][] nums={{1,4},{2,3}};;
        boolean b = merrgeIntervals(nums);
        System.out.println(b);

    }

    @Test
    public void testTwo()
    {
        int[][] nums={{1,4},{5,7},{8,14}};
        boolean b = merrgeIntervals(nums);
        System.out.println(b);

    }

    public boolean merrgeIntervals(int[][] nums) {

        boolean result=true;
        Arrays.sort(nums,(a,b)->a[0]-b[0]);
        int sTime=nums[0][0];
        int eTime=nums[0][1];
        for(int i=1;i<nums.length;i++)
        {
           if(nums[i][0]<=eTime)
           {
               result=false;
           }
           else {
               sTime=nums[i][0];
               eTime=nums[i][1];
           }
        }


        return result ;
    }
}
