package binarySearch;

import org.testng.annotations.Test;

public class Searchin2DArray {
    /*
    https://leetcode.com/problems/search-a-2d-matrix/description/

    1) find the  2d array row(m) & colmun (n)
    2) initialize low=0, high=m*n-1
    3) while(low<=high)
          mid=(low+high)/2
          find the co-ordinate mid to find the value
          row= mid/n;
          col=mid%n;
          int midvalue=matrx[row][col]

          if(midval==target
              return true;
          if(midvalue>target)
          high=mid-1
         else low=mid+1;
     */

    @Test
    public void testOne()
    {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=65;
        boolean b = findtheTarget(matrix, target);
        System.out.println(b);

    }

    private boolean findtheTarget(int[][] matrix, int target) {

        int row=matrix.length;
        int col=matrix[0].length;
        int low=0, high=row*col-1;

        if(matrix==null||matrix.length==0||matrix[0].length==0)
        {return false;}
        while(low<=high)
        {
            int mid=(low+high)/2;

            int mrow=mid/col;
            int mcol=mid%col;

            int midVal=matrix[mrow][mcol];

            if(midVal==target) {
                return true;
            }
            else if(midVal<target) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }

        }

        return  false;
    }
}
