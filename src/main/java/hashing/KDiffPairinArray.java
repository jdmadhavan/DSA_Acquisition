package hashing;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairinArray {

    /*
    #1 Brutforce
   - itrate all the pair using nested loop(i 0,i<length),j=i+1 j<length

  - check  if(Math.abs(num[i]-num[j]==K
             counter++;

    #2 Using HashMap
   1) Intialize the Hashmap <Integer,Interger>, count=0;
   2) iterate the array
             - add the array value occurance in the map
   3) iterate the map keyset
             if k==0
                  check values of the num key is >1 in the map
                  count++
            else
               if  map contains (num +K)
               counter++

    4) finally return counter;

     */

    @Test
    public void testOne() {
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;
        int kDiffPair = findKDiffPair(nums, k);
        System.out.println(kDiffPair);

    }

    private int findKDiffPair(int[] nums, int k) {
        int counter = 0;
        Map<Integer, Integer> mapVal = new HashMap<>();
        for (int num : nums) {
            mapVal.put(num, mapVal.getOrDefault(num, 0) + 1);
        }

        for (int num : mapVal.keySet()) {
            if (k == 0) {
                if (mapVal.get(num) > 1) {
                    counter++;
                }
            } else if(mapVal.containsKey(num+k))
            {
                counter++;

            }


        }

        return counter;
    }
}
