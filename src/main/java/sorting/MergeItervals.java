package sorting;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeItervals {

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
    public void testOne() {
        int[][] nums = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] b = merrgeIntervals(nums);
        System.out.println(Arrays.deepToString(b));

    }


    public int[][] merrgeIntervals(int[][] nums) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        int sTime = nums[0][0];
        int eTime = nums[0][1];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i][0] <= eTime) {
                eTime = Math.max(nums[i][1], eTime);
            } else {
                list.add(Arrays.asList(sTime, eTime));
                sTime = nums[i][0];
                eTime = nums[i][1];

            }
        }
            list.add(Arrays.asList(sTime, eTime));
            int[][] output = new int[list.size()][2];
            for (int i = 0; i < list.size(); i++) {
                output[i][0] = list.get(i).get(0); // start time
                output[i][1] = list.get(i).get(1); // end time
            }
        return output;
    }

}
