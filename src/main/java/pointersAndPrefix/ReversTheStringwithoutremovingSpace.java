package pointersAndPrefix;

public class ReversTheStringwithoutremovingSpace {

    public static void main(String[] args) {
        String str="Let's take LeetCode contest";
        char[] charr=str.toCharArray();
         int left=0,right=0,n=charr.length;
        for(int i=0;i<=charr.length;i++)
        {

            if(right==charr.length)
            {
                while(left<right) {
                    char temp = charr[left];
                    charr[left] = charr[right - 1];
                    charr[right - 1] = temp;
                    left++;
                    right--;
                }
            }
            else if(charr[i] ==' ')
            {
                right=i;
                while(left<right) {

                    char temp = charr[left];
                    charr[left] = charr[right-1];
                    charr[right - 1] = temp;
                    left++;
                    right--;
                }
                left=i+1;
                right=i+1;
            }
            else {
                right++;
            }



        }
        System.out.println(new String(charr));
    }
}
