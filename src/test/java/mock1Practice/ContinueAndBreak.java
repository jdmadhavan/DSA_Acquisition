package mock1Practice;

public class ContinueAndBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            } else if (i == 8) {
                break;
            }
            System.out.println(i);


        }
    }

}
