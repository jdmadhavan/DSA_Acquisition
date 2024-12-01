package codSolvingAssement;

public class givenIntNoIsPalindromeOrNot {
   /* @Test
    public void testOne() {
        int inputVal = -121;
        boolean isPolidrome = isPalindorme(inputVal);
        System.out.println(isPolidrome);
    }

    public boolean isPalindorme(int x) {
        int num = x;
        int revNumber = 0;
        if (x < 0) {
            x = 0;
        }
        while (num != 0) {
            revNumber = revNumber * 10 + num % 10;
            num = num / 10;
        }

        return revNumber == x;
    }
*/
    public static void main(String[] args) {
       // String s = "anagram", t = "nagaram";
    /*    int[] ascii= new int[26];
        int[] ascii1= new int[26];
        for(int i=0;i<s.length();i++)
        {
            ascii[s.charAt(i)-'a']++;
            ascii1[t.charAt(i)-'a']++;

        }

        if(Arrays.toString(ascii).equals(Arrays.toString(ascii1)))
        {
            System.out.println(true);

    }*/

        char[] c={'H','a','n','n','a','h'};
        int r=c.length-1;
        int l=0;
        while(l<r)
        {
            char tem=c[l];
            c[l]=c[r];
            c[r]=tem;
            l++;
            r--;
        }

        System.out.println(c);
    }
}
