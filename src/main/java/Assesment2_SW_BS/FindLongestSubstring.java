package Assesment2_SW_BS;

import org.testng.annotations.Test;

import java.util.HashMap;

public class FindLongestSubstring {

    /*
   Input: s = "abcabcbb"
   Output: 3

   1) Initialize   int max = 0, left = 0;
   2)intialize map
   3)  iterate from 0 to length
             get the current char
           check if the ap contains the char and is >=left
              left =  map.getOrDefault(currentChar,0) + 1;
              else

              put the curretnt value is right;

     4)  retur max = Math.max(max, right - left + 1);


       */

    @Test
    public void testOne()
    {
        String s="abcabcbb";
        int longestSubstringCount = findLongestSubstring(s);
        System.out.println(longestSubstringCount);

    }

    @Test
    public void testTwo()
    {
        String s="bbbbb";
        int longestSubstringCount = findLongestSubstring(s);
        System.out.println(longestSubstringCount);

    }

    @Test
    public void testTh()
    {
        String s="YazaAay";
        int longestSubstringCount = findLongestSubstring(s);
        System.out.println(longestSubstringCount);

    }


    @Test
    public void testThree()
    {
        String s="pwwkew";
        int longestSubstringCount = findLongestSubstring(s);
        System.out.println(longestSubstringCount);

    }

    private int findLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                left = map.getOrDefault(currentChar,0) + 1;
            }
            map.put(currentChar, right);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}

