package pointersAndPrefix;

import org.testng.annotations.Test;

public class SwapStringValues {

    /*

 Given an input String s. Swap the vowels in the input
Input - "Hello Everyone! Welcome to Testleaf"
Output - "Halle evoryeno! Welcemo te TEstloef"

1) initialize the 2 pointer lp,rp and vowels "aeiouAEIOU"
2) convert the string to charArray
3) while p1<charArray.length
               if(vowels.indexOf(charArray(p1)!=-1&&vowels.indexOf(charArray(p2))
                    char temp=charArray[p1];
                    charArray[p1]=charArray[p2];
                    charArray[p2]=temp;
                    p1++;
                    p2--;
               if(vowels.indexOf(charArray(p2)!=-1)
               {
               p1++;
               }
                if(vowels.indexOf(charArray(p1)!=-1)
               {
               p2--;
               }
4) iterate the charArray and add into new string and print;
     */

    @Test
    public void ipOne() {
        String inputStr = "Hello Everyone! Welcome to Testleaf";
        String s = swapStringValues(inputStr);
        System.out.println(s);


    }
    @Test
    public void ipTwo() {
        String inputStr = "Hello";
        String s = swapStringValues(inputStr);
        System.out.println(s);


    }


    public String swapStringValues(String inputStr) {
        char[] chaArr = inputStr.toCharArray();
        int p1 = 0, p2 = chaArr.length-1;
        String vowels = "aeiouAEIOU";
        while (p1<p2)
        {
            if(vowels.indexOf(chaArr[p2])!=-1&&vowels.indexOf(chaArr[p1])!=-1)
            {
                char temp = chaArr[p1];
                chaArr[p1] = chaArr[p2];
                chaArr[p2] = temp;
                p1++;
                p2--;
            }
            if(vowels.indexOf(chaArr[p1])==-1) {
                p1++;
            }
            if(vowels.indexOf(chaArr[p2])==-1){
                p2--;
            }

        }

        return new String(chaArr);
    }
}
