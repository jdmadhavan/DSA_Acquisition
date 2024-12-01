package codSolvingAssement;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumDividableByK {


/* Define HAshmap.
Initialize it with Key 0 and value 1.
iterate through the input array, calculate prefixSum
find the reminder sum%k
if reminder  value is not present in the map, get the reminder value and add to counter
else get the default value and add increment the reminder+1
 return result.
 */

    @Test
    public  void testOne() {
        int[] inputArray={4,5,0,-2,-3,1};
        int k=5;
        int numbers = sumOfSubArraySumIsEqual(inputArray,k);
        System.out.println(numbers);
    }
    @Test
    public  void Test2() {
        int[] inpArray = {5};
        int k =9;
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
          int remider=sum%k;
          if(map.containsKey(remider))
          {
              count+=map.get(remider);
          }

          map.put(remider,map.getOrDefault(remider,0)+1);

        }

return count;
    }
}
