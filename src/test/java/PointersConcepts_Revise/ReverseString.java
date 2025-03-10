package PointersConcepts_Revise;

import java.util.Arrays;

public class ReverseString {

    /*
    Given as an array
    i/p s = ["h","e","l","l","o"]
    o/p= ["o","l","l","e","h"]

   Intuition :

   Way 1: BrutForce Way with 2 pinter + Extra Space :

     1) Initialize the String array -- result[s.length], int j=0;
     2) Iterate the array for s.length-1 to 0
                reversStr[j]=s[i];
                j++;

     4) print/return the result.

  Optimize Way 2 : 2Pointer with in-space
   1) initialize the  2 pointers (left = 0,right=s.length-1)
   2) while(left<right)
          char temp=s[left];
          s[left]=s[right];
          s[right]=temp;
          left++;
          right--;
   3) print/return the s

     */

    public static void reverseTheString(String[] s)
    {
     String[] reversStr= new String[s.length];
     int j=0;
     for(int i=s.length-1;i>=0;i--)
     {
         reversStr[j]=s[i];
         j++;
     }
        System.out.println(Arrays.toString(reversStr));
    }

    public static String[] reverseTheStringInSpace(String[] s)
    {
        int left=0,right=s.length-1;
        while(left<right)
        {
            String temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;

        }
       return  s;
    }

    public static int[] reverseTheStringInSpace(int[] i)
    {
        int left=0,right=i.length-1;
        while(left<right)
        {
            int temp=i[left];
            i[left]=i[right];
            i[right]=temp;
            left++;
            right--;

        }
        return  i;
    }

    public static char[] reverseTheStringInSpace(char[] c)
    {
        int left=0,right=c.length-1;
        while(left<right)
        {
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;

        }
        return  c;
    }
    public static void main(String[] args) {
        /*//Arrays
        String[] s= {"h","e","l","l","o"};
        //Extra Space
        reverseTheString(s);
        //WithoutExtraSpace
        String[] strings = reverseTheStringInSpace(s);
        System.out.println(Arrays.toString(strings));

        //Int Array
        int[] i={1,2,3,4,5};
        int[] intVal = reverseTheStringInSpace(i);
        System.out.println((Arrays.toString(intVal)));
        //Char Array
        char[] c={'a','b','c'};
        char[] chaVale = reverseTheStringInSpace(c);
        System.out.println((Arrays.toString(chaVale)));*/
        //String With albhanumerric
        String str="ma1< >?dh2av2an"; //
        char[] charVal=str.toCharArray();

        int left=0,right=charVal.length-1;

        while(left<right)
        {
            if(!Character.isLetter(str.charAt(left)))
            {
             left++;
            }
            else if(!Character.isLetter(str.charAt(right)))
            {
            right--;
            }
            else
            {
                char temp=charVal[left];
                charVal[left]=charVal[right];
                charVal[right]=temp;
                right--;
                left++;
            }

        }

        System.out.println(new String(charVal));

    }
}
