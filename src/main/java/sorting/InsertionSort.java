package sorting;

import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {

        int[] nums={5,2,3,4,1};
        int[] nums1 = insertionSort(nums);
        System.out.println(Arrays.toString(nums1));
    }

    public static int[] insertionSort(int[] nums){

        for (int i=1;i<nums.length;i++){
            int j=i-1;
            int curr= nums[i];
            while (j>=0 && nums[j]> curr){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=curr;
        }
        return nums;
    }
}
