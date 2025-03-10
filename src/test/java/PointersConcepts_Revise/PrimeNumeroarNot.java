package PointersConcepts_Revise;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class PrimeNumeroarNot {

    /* int i

     1) for loop from i=2 to i<n;i++
        if(n%i==0)
          return false;
         else
         return true;
     */


    @Test
    public void testOne() {
        int num = 13;

        boolean prime = isPrime(num);
        System.out.println(prime);


    }

    @Test
    public void testTwo() {
        int[] num = {10, 11, 12, 13};

        printPrimeNumbers(num);


    }

    private boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            } else return true;
        }
        return false;
    }

    private void printPrimeNumbers(int num[]) {
        ArrayList<Integer> objects = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                objects.add(num[i]);

            }
        }
        System.out.println(objects);

    }
}
