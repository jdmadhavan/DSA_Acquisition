package codSolvingAssement;

import org.testng.annotations.Test;

public class MatrixSumProgram1 {

    /*
       1) initalize n=mx.length,  int sum=0
       2) iterate the mx 0 to mx.enth
                add sum of primary sum
                add seconday sum
       3) subtract the  odd nums from the total

     */

    @Test
    public void testOne()
    {
        int[][] mx= {{1,2,3},
        {4,5,6},
        {7,8,9}};
        findDinganalSum(mx);


    }

    @Test
    public void testTwo()
    {
        int[][] mx= {{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}};
        findDinganalSum(mx);

    }
    @Test
    public void testThree()
    {
        int[][] mx= {{5}};
        findDinganalSum(mx);


    }


    private void findDinganalSum(int[][] mx) {

        int sum=0;
        int length=mx.length;
        for(int i=0;i<length;i++)
        {
            sum+=mx[i][i];
            sum+=mx[i][length-1-i];
        }

        if(length%2==1)

        {
            sum-=mx[length/2][length/2];
        }
        System.out.println(sum);

    }
}
