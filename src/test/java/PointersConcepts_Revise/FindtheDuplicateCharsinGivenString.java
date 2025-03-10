package PointersConcepts_Revise;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindtheDuplicateCharsinGivenString {

    /*
    print duplicate
    ip= "hello world"
    op=e;
    BrutForce
    1)outer loop i 0 to str.length()
    2)inner loop j i+1 to str.length()
             if(str.chatAt(i).equal(str.charAt(j))
              print char/add into list
     */
    @Test
    public void testOne()
    {
        String str="hello world";
        printDuplicateUsingBrutForce(str);
    }

    private void printDuplicateUsingBrutForce(String str) {
        HashSet<Character> objects = new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    objects.add(str.charAt(i));
                }
            }
        }
        System.out.println(objects);
    }
}
