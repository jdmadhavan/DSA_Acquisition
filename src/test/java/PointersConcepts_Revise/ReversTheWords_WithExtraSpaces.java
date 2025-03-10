package PointersConcepts_Revise;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ReversTheWords_WithExtraSpaces {

    /*
   Input: s = "the sky is blue"
   Output: "blue is sky the"

  Input: s = "  hello world  "
  Output: "world hello"
  With trailing space and extras spaces
   [hello, World]
   [world, Hello]
  1) Trim the string
  2) Split the string with regex \\S+ and store in String[] strArr
  3) Initialize the left=0, right=strArr.length-1
  4) While left<right
           String temp=strArr[left]
           strArr[left]=strArr[right]
           strArr[right]=temp;
           left++
           right--;
  5)return String.joins(" ",strArr); or String builder
     */

    @Test
    public void testOne()
    {
        String s="   hello  world  ";
        String  reversStr = reversingtheWordsOnlyWithOneSpace(s);
        System.out.println(reversStr);

    }

    @Test
    public void testTwo()
    {
        String s="   hello &^& world @@@  hi me";
        String  reversStr = reversingtheWordsOnlyWithOneSpaceWithSpcial(s);
        System.out.println(reversStr);

    }

    private String reversingtheWordsOnlyWithOneSpace(String s) {
        
        s=s.trim();
        System.out.println(s);
        String[] arrWord=s.split("\\s+");
        System.out.println(Arrays.toString(arrWord));
        int left=0,right=arrWord.length-1;
        while(left<right)
        {
             String temp=arrWord[left];
             arrWord[left]=arrWord[right];
             arrWord[right]=temp;
             right--;
             left++;
        }

    return String.join(" ",arrWord);
    }

    private String reversingtheWordsOnlyWithOneSpaceWithSpcial(String s) {

        s=s.trim();
        String[] arrWord=s.split("\\s+");
        System.out.println(Arrays.toString(arrWord));
        int left=0,right=arrWord.length-1;
        while(left<right)
        {
            if(!arrWord[left].matches(".*[^a-zA-Z0-9].*")&&!arrWord[right].matches(".*[^a-zA-Z0-9].*")) {
                String temp = arrWord[left];
                arrWord[left] = arrWord[right];
                arrWord[right] = temp;
                right--;
                left++;
            }
            else if(!arrWord[left].matches(".*[^a-zA-Z0-9].*"))
            {
               right--;
            }
            else
            {
                left++;
            }
        }

        return String.join(" ",arrWord);
    }

}
