package mock1Practice;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicate {


    @Test
    public void testOne()
    {
     String strVal= "madhavan";
     findTheDuplicateCount(strVal);
    }


    public void findTheDuplicateCount(String strVal)
    {
        HashMap<Character, Integer> hMap = new HashMap<>();



        for(int i=0;i<strVal.length();i++)
        {
            
            if(hMap.containsKey(strVal.charAt(i)))
            {
                hMap.put(strVal.charAt(i),hMap.getOrDefault(strVal.charAt(i),0)+1);
            }
            else {
                hMap.put(strVal.charAt(i),1);
            }
        }
        System.out.println(hMap);

       for( Map.Entry<Character,Integer> entry:hMap.entrySet())
       {
           if(entry.getValue()>1)
           {
               System.out.println(entry.getKey());
           }
       }
    }



}
