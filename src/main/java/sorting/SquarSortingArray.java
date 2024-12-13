package sorting;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SquarSortingArray {

    /*
    1) iterate the array  for 0 to length
         do the  square nums[i]*nums[i] each element store in the same array
    2)  for sort the array
              - outer loop the element i from 0- length
                inner loop j for 0 to length-1;
                    if j>j+1
                      temp=nums[j]
                      nums[j]=nums[j+1];
                      nums[j+1]=temp

             return nums;

     */

    @Test
    public void testOne() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] ints = converSquarsort(nums);
        System.out.println(Arrays.toString(ints));


    }

    public int[] converSquarsort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
          boolean sort=false;
        for (int i = 0; i < nums.length; i++) {
            sort=false;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    sort=true;
                }
            }
            if(!sort) break;
        }

        return nums;
    }
}

