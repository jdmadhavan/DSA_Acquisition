package codSolvingAssement;

import org.testng.annotations.Test;

import java.util.*;

public class GroupOfAnagrams_Program4 {

/*
1) Initialize the map <String,List<stirng>
2)  Iterate the input list to input.size
       -create arraylist
       - get the input list value and add into the created array list as a string
       - Create ascii array with size of 26(alphabets size)
       - Iterate the string val from the list and  add into the ascii array
       - if map not contains the ascii keys
          add the list into map
        else
            append the new string value with existing list by creating and  put into the map
3) convert the list of values to new arraylist and return it.




 */

    @Test
    public void testOne()
    {
     String[] anagrm={"eat","tea","tan","ate","nat","bat"};
      /*  List<String> mylist = Arrays.asList(anagrm);*/
        List<List<String>> lists = groupAnagrams(anagrm);
        System.out.println(lists);
    }

    @Test
    public void testTwo()
    {
        String[] anagrm={"a"};
        List<String> mylist = Arrays.asList(anagrm);
        //List<List<String>> lists = groupAnagrams(mylist);
        //System.out.println(lists);
    }

    @Test
    public void testThree()
    {
        String[] anagrm={""};
        List<String> mylist = Arrays.asList(anagrm);
       // List<List<String>> lists = groupAnagrams(mylist);
       // System.out.println(lists);
    }

    public static List<List<String>> groupAnagrams(String[] str){

        List<String> mylist = Arrays.asList(str);
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i=0;i<mylist.size();i++){
            ArrayList<String> valueList = new ArrayList<>();
            String eachStr = mylist.get(i);
            valueList.add(eachStr);
            int[] ascii= new int[26];
            for(int j=0;j<eachStr.length();j++){
                ascii[eachStr.charAt(j)-'a']++;
            }
            String stringval = Arrays.toString(ascii);
            String sortedKey = stringval;
            if(!map.containsKey(sortedKey))
                map.put(sortedKey, valueList);
            else {
                List<String> strings = map.get(sortedKey); //O(1)--> O(logn)
                strings.addAll(valueList); //O(n)
                map.put(sortedKey, strings); // O(1)
            }
        }

        ArrayList<List<String>> finallists = new ArrayList<>(map.values());
        //Collection<List<String>> values = map.values();
        return finallists;//O(n)

    }
}
