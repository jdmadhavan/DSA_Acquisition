package hashing;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class FinsSubArrayisEqualToZero {

/*
1) Initialize the map  ==> key ,value (Integer,Integer),sum=0
2) iterate the array from A[0] to A.length
3)do the sum with array values sum+=arr[i]
4)  if ==> map contains sum returns true
    else  add the arr[i],1 into the map .
 5)  it not matching anything return false.

edge case if array has 1 value.
put default value [0,1]
 */


    @Test
    public  void testOne() {
        int[] inputArray={4, 2, -3, 1, 6};
        boolean subArraySumIsZero = findSubArraySumIsZero(inputArray);
        System.out.println(subArraySumIsZero);
    }

    @Test
    public  void testTwo() {
        int[] inputArray={4, 2, 0, 1, 6};
        boolean subArraySumIsZero = findSubArraySumIsZero(inputArray);
        System.out.println(subArraySumIsZero);
    }

    @Test
    public  void testThree() {
        int[] inputArray={-3, 2, 3, 1, 6};
        boolean subArraySumIsZero = findSubArraySumIsZero(inputArray);
        System.out.println(subArraySumIsZero);
    }


    private boolean findSubArraySumIsZero(int[] inputArray) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
         map.put(0,1);
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];

            if (map.containsKey(inputArray[i])) {
                          return  true;
            }
            else {
                map.put(sum,1);
            }
        }

return false;
    }
}
