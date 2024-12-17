package slidingWindow;

import org.testng.annotations.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndtheAnangrams_returnStartingIndex {

    /*
    i/p s=cbaebabacd p="abc"
    0/P =  [0,2]

    1) Initialize the Integer Array List(result), n=s.length, m=p.length
    2) Initialize the  two integer arras  with size of 256 , currentWin,  matchWindow
    3) iterate the from 0 to m
               add the char into currentWin from s.
               add the char into matchWindow from m.
    4) iterate from m to n

       if(array.equals (currentWin,matchWindow)
           result.add(i-m);
      Add new char into currentWin currentWin[s.charAt(i)]++
      Remove the firstchar from currentWin currentWin[s.charAt(i-m)]--;

   5)Return the result;

     */

    @Test
    public void testOne()
    {
        String s="cbaebabacd";
        String p="abc";
        List<Integer> arnagrramsStarIndex = findArnagrramsStarIndex(s, p);
        System.out.println(arnagrramsStarIndex);
    }

    private List<Integer> findArnagrramsStarIndex(String s, String p) {

        int n=s.length(),m=p.length();
        ArrayList<Integer> sIndex = new ArrayList<>();
        int[] cwindow = new int[26];
        int[] pwindow = new int[26];

        for(int i=0;i<m;i++)
        {
           cwindow[s.charAt(i)-'a']++;
            pwindow[p.charAt(i)-'a']++;
        }

        for(int i=m;i<n;i++)
        {

            if(Arrays.equals(cwindow,pwindow))
            {
                sIndex.add(i-m);
            }
            cwindow[s.charAt(i)-'a']++;
            cwindow[s.charAt(i-m)-'a']--;
        }
        if(Arrays.equals(cwindow,pwindow))
        {
            sIndex.add(n-m);
        }

        return sIndex;
    }
}
