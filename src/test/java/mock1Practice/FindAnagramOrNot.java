package mock1Practice;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class FindAnagramOrNot {

    @Test
    public void testOne() {
        String myStr1 = "ate";
        String mystr2 = "eat";
        isAnagram(myStr1, mystr2);
    }

    @Test
    public void testTwo() {
        String myStr1 = "ate";
        String mystr2 = "tea";
        isAnagram(myStr1, mystr2);
    }



    public void isAnagram(String myStr1, String myStr2) {
        if (myStr1.length() != myStr2.length()) {
            throw  new RuntimeException("Not An Anagram");
        }

        Map<Character, Integer> myMap1 = new HashMap<Character, Integer>();
        Map<Character, Integer> myMap2 = new HashMap<Character, Integer>();
        for (int i = 0; i < myStr1.length(); i++) {
            if (myMap1.containsKey(myStr1.charAt(i))) {
                myMap1.put(myStr1.charAt(i), myMap1.getOrDefault(myStr1.charAt(i), 0) + 1);
            } else {
                myMap1.put(myStr1.charAt(i), 1);
            }

            if (myMap2.containsKey(myStr2.charAt(i))) {
                myMap2.put(myStr2.charAt(i), myMap2.getOrDefault(myStr2.charAt(i), 0) + 1);
            } else {
                myMap2.put(myStr2.charAt(i), 1);
            }
        }

        if(myMap1.equals(myMap2))
        {
            System.out.println("Given String are anagram");
        }
        else {
            System.out.println("Given String not anagram");
        }

    }
}
