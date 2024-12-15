package binarySearch;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OneD_To_2DArray {

    /*

    1) Check 1d array length is != m*n return [][];
    2) initialize result array [m][n]
    3) iterate the 1d array from 0 t0 array length
                          result[i/n][i%n]=nums[i];
                        return the result;

     */

    @Test
    public  void testiNo()
    {
        int[] orginal={1,2,3,4};
        int m=2,n=2;
        int[][] ints = construct2DArray(orginal, m, n);
        System.out.println(Arrays.deepToString(ints));


    }

    private int[][] construct2DArray(int[] orginal, int m, int n) {

        int[][] resultArray=new int [m][n];
        if(orginal.length!=m*n)
        {
            return new int [0][0];
        }
        for(int i=0;i<orginal.length;i++)
        {
      resultArray[i/n][i%n]=orginal[i];
        }

        return resultArray;
    }
}
