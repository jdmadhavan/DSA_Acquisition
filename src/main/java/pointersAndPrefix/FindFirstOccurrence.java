package pointersAndPrefix;

import org.testng.annotations.Test;

public class FindFirstOccurrence {

    @Test
    public void testOne() {
        String haystack = "sadbutsad", needle = "sad";
        int firstOccurance = findFirstOccurance(haystack, needle);
        System.out.println(firstOccurance);

    }

    @Test
    public void testTwo() {
        String haystack = "leetcode", needle = "leeto";
        int firstOccurance = findFirstOccurance(haystack, needle);
        System.out.println(firstOccurance);

    }

    private int findFirstOccurance(String haystack, String needle) {

        int str1 = haystack.length();
        int str2 = needle.length();
        int p1 = 0;
        while (p1 < str1) {
            int p2 = 0;
            while (p2 < str2 && haystack.charAt(p1 + p2) == needle.charAt(p2)) {
                p2++;
            }

            if (p2 == str2) {
                return p1;
            } else {
                p1++;
            }
        }

        return -1;
    }
}
