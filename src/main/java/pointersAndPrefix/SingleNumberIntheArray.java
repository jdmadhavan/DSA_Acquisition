package pointersAndPrefix;

import org.testng.annotations.Test;

import java.util.HashMap;

public class SingleNumberIntheArray {

    /*
    Brut_Force

    1) Initialize the count=0
    2) iterate the element with nested loop and check  element occurrence in the array
    3)  inside the inner loop
              - check it the num[i]==num[j]
              - increase counter++;
    4) outside inner loop
               - check if the counter is ==1
               - return the num[i]

     Optimize way using XOR
     1. initialize result=0
     2) itrate the num[]
           resut^=num[i]

           return result;

     */

    @Test
    public void testOne() {
        int nums[] = {2, 2, 1};
       /* int element_brutForce = SingleNumber_BrutForce(nums);
        System.out.println(element_brutForce);*/
        int OptmizeWay = OptmizeWay(nums);
        System.out.println(OptmizeWay);



    }

    @Test
    public void testTwo() {
        int nums[] = {4, 1, 2, 1, 2};
        int element_brutForce = SingleNumber_BrutForce(nums);
        System.out.println(element_brutForce);


    }

    private int OptmizeWay(int[] nums) {
        //using XOR operator
        int result=0;
        for(int n:nums)
        {
            result^=n;
        }

        return result;
    }


    private int SingleNumber_BrutForce(int[] nums) {

        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }

            }
            if (count == 1) {
                return nums[i];
            }
        }


        return -1;
    }
}