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

        char c = findtheDifference1(s, t);
        System.out.println(c);

    }

    @Test
    public  void testTHree()
    {
        String s="a";
        String t="aa";

        char c = findtheDifference1(s, t);
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

    private char findtheDifference1(String s, String t) {
        HashSet<Character> set = new HashSet<>();

        for(char c:s.toCharArray())
        {
          set.add(c);
        }

        for(char c:t.toCharArray())
        {
            if(s=="")return c;
            if(!set.add(c)) return c;
        }

        return ' ';
    }
}
