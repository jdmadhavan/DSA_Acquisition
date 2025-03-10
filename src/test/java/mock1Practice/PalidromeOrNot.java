package mock1Practice;

import org.testng.annotations.Test;

public class PalidromeOrNot {

    /*
    i/p String str= "wow"
    1. initialize the 2 pointers  start =0 & end=str.length()
    2) while(start<end)
         if(!str.charAt(start).equals(start.charAt(end))
             return false;
          start++;
          end--;

     */


    @Test
    public void testOne()
    {
        String str="madamh";
        boolean palindrom = isPalindrom(str);
        System.out.println(" String is Palindrom " +palindrom);
    }


    public boolean isPalindrom(String str) {
        int start = 0, end = str.length()-1;
        while (start < end) {
          //  if (str.indexOf(str.charAt(start)) != str.indexOf(str.charAt(end))) {
            if (str.charAt(start)!=(str.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
