package hashing;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class SumOfSubArrayISEqualToK {


/* Define HAshmap.
Initialize it with Key 0 and value 1.
iterate through the input array, calculate prefixSum and add the PREFIX SUM as key in the map and count as value.
Before adding, find sum-k = index value,
if index value is present in the map, add it to the result. increment counter value and put it in the map both if else cases using getdefault.
 return result.
 */

    @Test
    public  void testOne() {
        int[] inputArray={1,1,1};
        int k=2;
        int numbers = sumOfSubArraySumIsEqual(inputArray,k);
        System.out.println(numbers);
    }
    @Test
    public  void Test2() {
        int[] inpArray = {1,2,3};
        int k =3;
        int result = sumOfSubArraySumIsEqual(inpArray, k);
        System.out.println(result);
    }



    private int sumOfSubArraySumIsEqual(int[] nums, int k) {
        int sum = 0;
        int count=0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
         map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
          sum+=nums[i];

          if(map.containsKey(sum-k))
          {
              count+=map.get(sum-k);
          }

          map.put(sum,map.getOrDefault(sum,0)+1);

        }

return count;
    }
}
