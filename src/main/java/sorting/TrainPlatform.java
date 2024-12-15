package sorting;

import org.testng.annotations.Test;

import java.util.Arrays;

public class TrainPlatform {

    /*
    Input: arr[] = [900, 940, 950, 1100, 1500, 1800], dep[] = [910, 1200, 1120, 1130, 1900, 2000]
Output: 3

1) Sort the both array.
2) initialize the P1=0,P2=0  Platform=0,count=0;

3) iterate from i 0 to length
        Check arr[p1]<=dep[p2]
              count++;
              p1++
              platform= Math.max(patform,count);
              else
               count--
               p2++;

 4) return platform.
     */

    @Test
    public void testOne()
    {
        int arr[]={900, 940, 950, 1100, 1500, 1800}, dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int platform = findPlatform(arr, dep);
        System.out.println(platform);
    }

    @Test
    public void testTwo()
    {
        int arr[]={900, 1235, 1100}, dep[] = {1000, 1240, 1200};
        int platform = findPlatform(arr, dep);
        System.out.println(platform);
    }
    @Test
    public void testThree()
    {
        int arr[]={1000, 935, 1100}, dep[] = {1200, 1240, 1130};
        int platform = findPlatform(arr, dep);
        System.out.println(platform);
    }


    private int findPlatform(int[] arr, int[] dep) {
        int p1=0,p2=0, platform=0,count=0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[p1]<=dep[p2])
            {
                count++;
                p1++;
                platform=Math.max(platform,count);
            }
            else {
                count--;
                p2++;
            }
        }
return platform;
    }
}
