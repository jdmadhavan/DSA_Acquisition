package pointersAndPrefix;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MergeSortedArray {

    @Test
    public void mergeArray()
    {
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;
        merge(nums1,m,nums2,n);

        System.out.println(Arrays.toString(nums1));

    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1,p2=n-1,indexVal=nums1.length-1;

        while(p1>=0 && p2>=0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[indexVal] = nums2[p2];
                p2--;
                indexVal--;
            } else if (nums1[p1] > nums2[p2]) {
                nums1[indexVal] = nums1[p1];
                p1--;
                indexVal--;
            } else {
                nums1[indexVal] = nums1[p1];
                p1--;
                indexVal--;
            }
        }

            while(p2>=0)
            {
                nums1[indexVal]=nums2[p2];
                p2--;
                indexVal--;
            }
        }

}

