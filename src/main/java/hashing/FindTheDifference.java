package hashing;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;

public class FindTheDifference {

    @Test
    public  void testOne()
    {
        String s="abcd";
        String t="abcde";

        char c = findtheDifference(s, t);
        System.out.println(c);

    }

    @Test
    public  void testTwo()
    {
        String s="";
        String t="y";

        char c = findtheDifference(s, t);
        System.out.println(c);

    }

    private char findtheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c:t.toCharArray())
        {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return c;
            }
            map.put(c, map.get(c) - 1);
          }

        return ' ';
    }
}
