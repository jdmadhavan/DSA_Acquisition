package mock1Practice;

import org.testng.annotations.Test;

import java.util.Arrays;

public class FindTheSecondLargestNumber {

    @Test
    public void testOne() {
        int[] arraVal = {27, 10, 20, 11, 30};
        findtheSecondLargestBySortMethod(arraVal);
    }

    @Test
    public void testTwo() {
        int[] arraVal = {27, 10, 20, 11, 30, 30};
        findtheSecondLargest(arraVal);
    }

    private void findtheSecondLargestBySortMethod(int[] arraVal) {
        Arrays.sort(arraVal);
        int left = 0, right = arraVal.length - 1;
        while (left < right) {
            if (arraVal[right - 1] < arraVal[right]) {
                System.out.println(arraVal[right - 1]);
                break;
            } else {
                right--;
            }
        }
    }

    private void findtheSecondLargest(int[] arraVal) {

        int largestNum = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;

        for (int i = 0; i <= arraVal.length - 1; i++) {
            if (arraVal[i] > largestNum) {
                secondLargestNum = largestNum;
                largestNum = arraVal[i];
            }
            if (largestNum > arraVal[i] && arraVal[i] > secondLargestNum) {
                secondLargestNum = arraVal[i];
            }
        }
        System.out.println(secondLargestNum);
    }
}
