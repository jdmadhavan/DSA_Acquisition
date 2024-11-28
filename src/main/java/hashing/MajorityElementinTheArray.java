package hashing;

import org.testng.annotations.Test;

import java.util.HashMap;

public class MajorityElementinTheArray {

    /*
    Brut_Force

    1) Initialize the count=0
    2) iterate the element with nested loop and check  element occurrence in the array
    3)  if the element is match increase the counter
    4) check if the counter is greater than [n/2]
                return the element

  using HashMap
  1) initialize the hashmap with  integer(key), integer (value)
  2) iterate the nums array
  3) if  maps contains the element of array
             - update the value+1
              -else put the element into the map key as element and value as 1
  4) iterate the map keys
              - get the key value and check value is > n/2
              - return the key.



     */

    @Test
    public void testOne() {
        int nums[] = {3, 2, 3};
        //int element_brutForce = majority_BrutForce(nums);
        //System.out.println(element_brutForce);
        int element_Hashing = majority_Hashing(nums);
        System.out.println(element_Hashing);

    }

    @Test
    public void testTwo() {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        /*int element_brutForce = majority_BrutForce(nums);
        System.out.println(element_brutForce);*/
        int element_Hashing = majority_Hashing(nums);
        System.out.println(element_Hashing);


    }

    private int majority_Hashing(int[] nums) {

        HashMap<Integer, Integer> mapVal = new HashMap<>();
        for (int val : nums) {
            if (mapVal.containsKey(val)) {
                mapVal.put(val, mapVal.getOrDefault(val, 0) + 1);
            } else {
                mapVal.put(val, 1);
            }
        }

        for (int key : mapVal.keySet()) {
            if (mapVal.get(key) > nums.length / 2) {
                return key;
            }
        }

        return -1;
    }


    private int majority_BrutForce(int[] nums) {

        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                if (count >= nums.length / 2) {
                    return nums[i];
                }
            }


        }
        return -1;
    }
}