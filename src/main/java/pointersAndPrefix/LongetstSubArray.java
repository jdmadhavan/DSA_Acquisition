package pointersAndPrefix;

public class LongetstSubArray {

    public static int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0; // To track the number of zeroes in the current window
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            // If the current element is zero, increase the zeroCount
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Shrink the window if there are more than one zero in the window
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Update the maximum length (excluding one element)
            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }

    public static void main(String[] args) {
       int[] nums = {1,1,0,1};
        int i = longestSubarray(nums);
        System.out.println(i);
    }
}
