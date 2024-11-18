package codSolving;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray
{            /*
 https://leetcode.com/problems/intersection-of-two-arrays/description/ - NS
        // intersection of two arrays
- sort the arrays
- initialise the pointers with value 0, to traverse both the arrays
- compare the elements at index p1, p2
- if(num1[p1]<nums2[p2])
-p1++;
- else if (nums1[p1]>nums2[p2]){
-p2++;
- else
// add the element into the set //an array
p1++;p2++
         */
    @Test
public  void findIntersection()
{
    int[] nums1={1,2,2,1};
    int[] nums2={2,2};
    int[] intersection = intersection(nums1, nums2);
    System.out.println(Arrays.toString(intersection));
}

public int[] intersection ( int[] nums1, int[] nums2){
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            Set<Integer> s = new HashSet<>();
            int p1 = 0, p2 = 0;
            while ((p1 < nums1.length) && (p2 < nums2.length)) {
                if (nums1[p1] < nums2[p2])
                    p1++;
                else if (nums1[p1] > nums2[p2])
                    p2++;
                else {
                    s.add(nums1[p1]);
                    p1++;
                    p2++;
                }

            }
            Integer[] tempArray = s.toArray(new Integer[0]);
            int[] resultArray= new int[tempArray.length];
            for(int i=0;i< tempArray.length;i++)
            {
                resultArray[i]=tempArray[i];
            }
            return resultArray;

        }


    }