package mock1Practice;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ReversTheEachWord {

    @Test
    public void TestOne()
    {
        String val="i am mdn";
        reverseEachWord(val);
    }

    @Test
    public void TestTwo()
    {
        String val="t";
        reverseEachWord(val);
    }

    private void reverseEachWord(String val) {
        String[] arrVal=val.split("\\s");
        StringBuffer sVal=new StringBuffer();
        int left=0,right=arrVal.length-1;
        while(left<=right) {
            if (arrVal[left].length() > 1) {
                int p1=0,p2=arrVal[left].length();
                char[] charArray = arrVal[left].toCharArray();
                while(p1<=p2)
                {
                    char temp=charArray[p1];
                    charArray[p1]=charArray[p2-1];
                    charArray[p2-1]=temp;
                    p1++;
                    p2--;
                }
                sVal.append(new String(charArray)).append(" ");
           left++;
            }
            else {
                sVal.append(arrVal[left]).append(" ");
                left++;
            }

        }
        System.out.println(sVal);

    }
}
