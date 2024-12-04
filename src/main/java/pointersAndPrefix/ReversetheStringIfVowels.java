package pointersAndPrefix;

import org.testng.annotations.Test;

public class ReversetheStringIfVowels {
    /*
    https://leetcode.com/problems/reverse-vowels-of-a-string/description/

   Input: s = "IceCreAm"

   Output: "AceCreIm"

   1) Initialize the pointer left=0 & right=str.length()
   2) convert the string to char array
   3) Iterate the str left<right
              if check the left char &Right Char are vowels
                  swap the  chars
    4) return string;
     */

    @Test
    public void testIne()
    {
        String s="IceCreAm";
        String s1 = reversTheVowelse(s);
        System.out.println(s1);
    }


    public String  reversTheVowelse(String s)
    {
        String vowels="aeiouAEIOU";
      char[] charArr=s.toCharArray();
      int left=0 , right=s.length()-1;
      while(left<right)
      {
        if(vowels.indexOf(charArr[right])!=-1 &&vowels.indexOf(charArr[left])!=-1)
        {
            char temp=charArr[left];
            charArr[left]=charArr[right];
            charArr[right]=temp;
            right--;
            left++;
        }
        else if (vowels.indexOf(charArr[left])==-1){
            left++;
        }
        else {
            right--;
        }
      }
    return new String(charArr);
    }
}
