package sorting;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {


    @Test
    public void testOne() {

        int nums[] = {5, 3, 1, 4, 2};
          mergeSort(nums);
        System.out.println(Arrays.toString(nums));




    }

    public static int[] mergeSort(int[] nums) {
        sortHelper(nums, 0, nums.length - 1);
        return nums;
    }

    private static void sortHelper(int[] nums, int low, int high) {

        //base case
        if (low >= high) return;
        int mid = (low + high) / 2;
        sortHelper(nums, 0, mid);
        sortHelper(nums, mid + 1, high);
        mergeArrray(nums, low, mid, high);
    }

    private static void mergeArrray(int[] nums, int low, int mid, int high) {

        //initialize the 2 pointer
        //take the left and right array;

        int p1 = 0, p2 = 0, index = low;

        int[] left = Arrays.copyOfRange(nums, low, mid + 1);
        int[] right = Arrays.copyOfRange(nums,mid+1, high+1);
        while (p1 < left.length && p2 < right.length) {
            if (left[p1] <= right[p2]) {
                nums[index++] = left[p1++];
            } else
                nums[index++] = right[p2++];
            }
            while (p1 < left.length) {
                nums[index++] = left[p1++];
            }
            while (p2 < right.length) {
                nums[index++] = right[p2++];
            }

    }
}

