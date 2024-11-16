package codSolving;

import org.testng.annotations.Test;

public class givenIntNoIsPalindromeOrNot {
    @Test
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
}
