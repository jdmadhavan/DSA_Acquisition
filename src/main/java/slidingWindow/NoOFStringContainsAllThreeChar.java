package slidingWindow;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

public class NoOFStringContainsAllThreeChar {

    /*
    i/p aaacb
    o/p = 3
    1), create int cwindow[3], int left=0;count=0;
    3) iterate the from 0 to s.length
           add the char into cwindow
           cwindow is contains a&B&c

           count+=n-i;
           remove the first element from the cwindow;
           Left++

         return count;
     */

    @Test
    public void testOne() {
        String s = "abcabc";
        int theCOntainsSubstringcount = findTheCOntainsSubstringcount(s);
        System.out.println(theCOntainsSubstringcount);

    }

    private int findTheCOntainsSubstringcount(String s) {

        int count = 0, left = 0, n = s.length();
        int[] cwindow = new int [26];
        for (int i = 0; i < s.length(); i++) {
            cwindow[s.charAt(i)-'a']++;
            while (cwindow[0]>0&& cwindow[1]>0 && cwindow[2]>0) {
                count += n - i;
                cwindow[s.charAt(left)-'a']--;
                left++;
            }

        }
        return count;
    }
}
