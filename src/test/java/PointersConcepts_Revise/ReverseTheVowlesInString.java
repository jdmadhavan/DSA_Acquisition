package PointersConcepts_Revise;

public class ReverseTheVowlesInString {
    //https://leetcode.com/problems/reverse-vowels-of-a-string/
    /*
    Intuition
    Input: s = "IceCreAm"
    Output: "AceCreIm"
    1) convert the string to char array(charVal)
    2) Initialize the left=0, right= charArray.length-1,vowels ="aeiouAEIOU"
    3) while left<right
           if(vowels.indexOf(Char[left]!=-1&&!vowels.indexOf(Char[left]!=-1)
           swp the char
           left++
           right--
          else if(!vowels.indexOf(Char[left]=-1)
          left++;
          else
          right++;

     */

    public static void main(String[] args) {

        //String s="IceCreAm";
        String s="AE";
        String val=reverseTheVowels(s);
        System.out.println(val);
        
    }

    private static String reverseTheVowels(String s) {
        if(s.length()<=1) return s;
        char[] charArr=s.toCharArray();
        String vowels="AEIOUaeiou";
        int left=0,right=charArr.length-1;
        while(left<right)
        {
         if(vowels.indexOf(charArr[left]) != -1 && vowels.indexOf(charArr[right])!= -1)
         {
             char temp=charArr[left];
             charArr[left]=charArr[right];
             charArr[right]=temp;
             left++;
             right--;
         }
         else if(vowels.indexOf(charArr[left]) != -1)
         {
             right--;
         }
         else {
             left++;
         }
        }
     return  new String(charArr);
    }
}
