package binarySearch;

import org.testng.annotations.Test;

public class SqrX {

    @Test
    public void tetsOne() {
        int x = 8;
        int sqrX = findSqrX(x);
        System.out.println(sqrX);
    }

    private int findSqrX(int x) {

       /* int ans = 0;
        while (ans * ans <= x) {
            ans++;
        }
        return ans - 1;*/

        int low=0, high=x;
        if (x < 2) {
            return x;
        }

        while(low<=high)
        {
            int mid=(low+high)/2;
            long midVal= (long) mid *mid;
            if(midVal==x)
            {
                return mid;
            } else if (midVal<x)
            {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }

return  high;
    }
}
