package revision;

public class ReverseTheWord {

    /*
    i/p: String strVal=my self madhavan
    o/p: madhavan self my

    intuition
    1) trim the string
    2) split the string and store words in string array(word)
    3) initialize the pointers int left=0 ,right=words.length-1
            while(left<right)
               temp=words[left];
               words[left]=words[right]
               words[right]=temp;
               right--;
               left++;

     4) String.joins(" ", words);
     */

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

        public static void main(String[] args) {
            StringBuffer s=new StringBuffer();
            //String strVal="Do it well";
            String strVal=" Do well ";
            strVal.trim();
            String[] words=strVal.split("\\s");
            int left=0,right=words.length-1;

            while(left<right)
            {
                String temp=words[left];
                words[left]=words[right];
                words[right]=temp;
                right--;
                left++;
            }
            String opStrVal=String.join(" ",words);
            System.out.println(opStrVal);

        }}

