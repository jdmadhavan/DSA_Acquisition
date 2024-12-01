package pointersAndPrefix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumArray {

    public static void main(String[] args) {





  int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> integers = threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

return  result;
    }
}
