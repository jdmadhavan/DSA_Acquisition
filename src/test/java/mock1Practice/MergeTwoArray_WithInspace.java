package mock1Practice;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MergeTwoArray_WithInspace {
    /*
    ip
    int[] a ={1,2,3,4}
    int[] b={3,5};
    int m=4,n=2;
    op
    int a[]={1,2,3,3,45}

    ---- intuition---

    1) We can write like  array i.e {1,2,3,4,0,0} --add second array size 0's in the end of the first array
    2) initialize the  uni directional pointers and index int p1=m-1;p2=n-1 and index=a.length-1;
    3)while (p1>=0&&p2>=0)
           if(a[p1]<b[p2])
           {
              a[index]=b[p2];
              p2--;
              index--
           }
           else if(a[p1]>b[p2])
           {
           a[index]=a[p1];
           p1--
           index--
           }
           else{
           a[index]=a[p1];
           p1--
           index--
           }

     */

    @Test
    public void testOne()
    {
        int[] a={1,2,3,4,0,0};
        int[] b={3,5};
        int m=4;
        int n=2;
        mergeTwoSortedArray(a,b,m,n);
        System.out.println(Arrays.toString(a));

    }

    @Test
    public void testtwo()
    {
        int[] a={0};
        int[] b={3};
        int m=0;
        int n=1;
        mergeTwoSortedArray(a,b,m,n);
        System.out.println(Arrays.toString(a));

    }

    @Test
    public void testthree()
    {
        int[] a={1};
        int[] b={0};
        int m=1;
        int n=0;
        mergeTwoSortedArray(a,b,m,n);
        System.out.println(Arrays.toString(a));

    }

    private void mergeTwoSortedArray(int[] a, int[] b,int m,int n) {


        int p1=m-1,p2=n-1,index=a.length-1;
        while(p1>=0&p2>=0)
        {
            if(a[p1]<b[p2])
            {
                a[index]=b[p2];
                p2--;
                index--;
            }
            else if(a[p1]>b[p2])
            {
                a[index]=a[p1];
                p1--;
                index--;
            }
            else {
                a[index]=a[p1];
                p1--;
                index--;
            }
        }
        while(p2>=0)
        {
            {
                a[index]=b[p2];
                p2--;
                index--;
            }
        }
    }
}
