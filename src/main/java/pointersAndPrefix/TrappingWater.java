package pointersAndPrefix;

import org.testng.annotations.Test;

public class TrappingWater {

    //https://leetcode.com/problems/trapping-rain-water/description/
    @Test
    public void testOne()
    {
        int[] inputHeights={0,1,0,2,1,0,1,3,2,1,2,1};
        int i = trappingWater(inputHeights);
        System.out.println("Result---->"+i);
    }

    @Test
    public void testTwo()
    {
        int[] inputHeights={1,2,1,1};
        int i = trappingWater(inputHeights);
        System.out.println("Result---->"+i);
    }

    public int trappingWater(int[] height) {

        int result = 0;
        int[] leftMaxHeight=new int[height.length];
        int[] rightMaxHeigth=new int[height.length];
        leftMaxHeight[0]=height[0];
        rightMaxHeigth[rightMaxHeigth.length-1]=height[height.length-1];

        for(int i=1;i<height.length;i++)
        {
            leftMaxHeight[i]=Math.max(leftMaxHeight[i-1],height[i]);
        }
        for(int i=rightMaxHeigth.length-2;i>=0;i--)
        {
            rightMaxHeigth[i]=Math.max(rightMaxHeigth[i+1],height[i]);
        }

        for(int i=0;i<height.length;i++)
        {
            result=result+Math.min(leftMaxHeight[i],rightMaxHeigth[i])-height[i];
            result=Math.max(0,result);
            
        }
return  result;
    }

}
