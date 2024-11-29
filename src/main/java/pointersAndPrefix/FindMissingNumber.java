package pointersAndPrefix;



import org.testng.annotations.Test;

import java.util.Arrays;

public class FindMissingNumber {

    /*
    1)initialize the variable j=0
    2) sort the array  using Arrays.sorrt  funtion
    3) Iterate the array value
          if(num[i]!=j)
          return j

          else j++;
    4) return j;
     */

    @Test
    public void test1() {

        int[] num = {3, 0, 1};
        int no=findMissingNumber (num);
        System.out.println(no);

    }
    @Test
    public void test2() {

        int[] num = {0, 1};
        int no=findMissingNumber (num);
        System.out.println(no);

    }

    @Test
    public void test3() {

        int[] num = {9,6,4,2,3,5,7,0,1};
        int no=findMissingNumber (num);
        System.out.println(no);

    }

    public int findMissingNumber(int[] num) {
        Arrays.sort(num);
        for(int i=0;i<num.length;i++)
        {
            if(i!=num[i])
            {
               return i;
            }

        }
        return num.length;
    }


}
