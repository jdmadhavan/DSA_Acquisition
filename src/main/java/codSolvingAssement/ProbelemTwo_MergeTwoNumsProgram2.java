package codSolvingAssement;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ProbelemTwo_MergeTwoNumsProgram2 {

    /*
    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]


      1)Initialize the  p1=m-1,p2=n-1, idx=nums1.length()
      2)  While (p1>=0 &&p2>=0)
             if(nums1[p1]<nums2[p2])
                   nums[idx]=nums1[p2];
                   idx--
                   p2--

              if(nums1[p1]>nums2[p2])
                nums[idx]=nums1[p1];
                idx--
                p1--;

             else
                   nums[idx]=nums1[p1];
                   p1--;
                  idx--

            3)) While p2>=0
             nums[idx]=nums[p1];
             p2--
             idx--
     */

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

    @Test
    public void mergeArray2()
    {
        int[] nums1={1};
        int m=1;
        int[] nums2={};
        int n=0;
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

    }

}
