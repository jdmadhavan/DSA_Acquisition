package pointersAndPrefix;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreePointer {

    /*
    https://leetcode.com/problems/sort-colors/description/

Left=0, right=nums.length-1, mid=0;
(mid, fast pointer, left, right= slow pointer)

- if(nums[mid]==0){
	// code
	swap left, mid
	increment both mid, left
}else if(nums[mid]==1){
	//mid++
}
else{
	// swap mid and right
	// decremt right
}
     */

    @Test
    public void testOne() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);


    }

    @Test
    public void testWo() {
        int[] nums = {2, 0,  1};
        sortColors(nums);


    }

    public void sortColors(int[] nums) {

        int left = 0, right = nums.length - 1, mid = 0;
        while (mid <= right) {
            if (nums[mid] == 0) {
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                mid++;
                left++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                right--;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
