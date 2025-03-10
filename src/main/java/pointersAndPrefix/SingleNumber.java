package pointersAndPrefix;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result=0;
        for(int n:nums)
        {
            result^=n;
        }

        return result;

    }
    public static void main(String[] args) {
        int[] nums={2,2,1};
        int i = singleNumber(nums);

    }
}

