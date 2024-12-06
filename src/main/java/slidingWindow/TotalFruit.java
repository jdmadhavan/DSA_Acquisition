package slidingWindow;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TotalFruit {
    /*
    i/P=1,2,1
    o/P 3
      1) Initialize the Hashmap <Integer,Integer>, left 0, maxValue=0
      2) iterate the array
                   add the char as key and value as count

       3) While map size >2
                get the left char value from the map and  do -1
                if   left valuein map is ==0
                remove the left key from the map
            left++

       4) find th Math.max(maxValue,right-left-1)
       5)Return
     */


    @Test
    public void testOne()
    {
        int [] arr={1,2,1};
        System.out.println(findTotalFruite(arr));

    }

    private int findTotalFruite(int[] fruites) {

        int left=0, totalFruite=0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i< fruites.length;i++)
        {
            map.put(fruites[i],map.getOrDefault(fruites[i],0)+1);

            while(map.size()>2)
            {
                map.put(fruites[left], map.get(fruites[left])-1);
                if(map.get(fruites[left])==0)
                {
                    map.remove(fruites[left]);
                }
                left++;
            }

            totalFruite=Math.max(totalFruite,i-left+1);
        }
        return  totalFruite;
        }

}
