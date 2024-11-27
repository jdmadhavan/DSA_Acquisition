package hashing;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class SentancePangram {

    /*
    1) initialize the hashset<Character> and iterate string
    2) Add into the set = set will remove the duplicates
    3) size equal to 26 return tru or false
     */

    @Test
    public void testOne() {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        boolean isPanagram = isPanagram(str);
        System.out.println(isPanagram);
    }

    @Test
    public void testTwo() {
        String str = "leetcode";
        boolean isPanagram = isPanagram(str);
        System.out.println(isPanagram);
    }

    private boolean isPanagram(String str) {

        Set<Character> charVal = new HashSet<>();
        for (char c : str.toCharArray()) {
            charVal.add(c);
        }
        return charVal.size() == 26;
    }
}
