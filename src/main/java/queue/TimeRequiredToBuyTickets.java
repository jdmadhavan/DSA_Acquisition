package queue;

import org.testng.annotations.Test;

public class TimeRequiredToBuyTickets {

    @Test
    public void testOne() {
        int[] tickets = {2, 3, 2};
        int k = 2;
        int timeRequiredToBuy = findTimeRequiredToBuy(tickets, k);
        System.out.println(timeRequiredToBuy);

    }

    @Test
    public void testTwo() {
        int[] tickets = {5, 1, 1, 1};
        int k = 0;
        int timeRequiredToBuy = findTimeRequiredToBuy1(tickets, k);
        System.out.println(timeRequiredToBuy);

    }


    private int findTimeRequiredToBuy(int[] tickets, int k) {

        int time = 0, i = 0;
        while (tickets[k] > 0) {
            if (tickets[i] == 0) {
                i = 0;
            }
            if (tickets[i] > 0) {
                time++;
                tickets[i]--;
                if (i != tickets.length - 1) {
                    i++;
                } else {
                    i = 0;
                }
            }


        }
        return time;
    }

    private int findTimeRequiredToBuy1(int[] tickets, int k) {

        int time = 0;
        while (tickets[k] > 0) {

            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    time++;
                    tickets[i]--;
                }
            if(tickets[k]==0) break;
            }

        }
        return time;
    }
}
