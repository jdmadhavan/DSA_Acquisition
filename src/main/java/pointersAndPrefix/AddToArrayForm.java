package pointersAndPrefix;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm {

    /*

    https://leetcode.com/problems/add-to-array-form-of-integer/ - NS
    1) Iterate the array element  nums[0] to nums[length]
    2)  multiple element with 10 and store in int result.
    3) Add the new int value add with result value
    4)
     */

    @Test
    public void testOne()
    {
   int myarr[]={1,2,0,0};
   int kVal=34;
   List<Integer> myToArrayForm = addToArrayForm(myarr, kVal);
        System.out.println(myToArrayForm);


    }

    public List<Integer> addToArrayForm(int[] num, int k) {
         int resultAddedVal = 0;
        for(int i=0;i<num.length;i++)
        {
            resultAddedVal=resultAddedVal*10+num[i];

        }
        resultAddedVal=resultAddedVal+k;
        ArrayList<Integer> arrayFormLisatValue = new ArrayList<>();

        while(resultAddedVal>0)
        {
            arrayFormLisatValue.add(0,resultAddedVal%10);
            resultAddedVal/=10;
        }

return arrayFormLisatValue;

    }
}
