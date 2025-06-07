package InitialsProgramme;

import java.util.Scanner;

public class PrimeNumber {
    static Scanner scn=new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter a integer Value");
        int i=scn.nextInt();
        Boolean result=isPrime(i);
        System.out.println("Is Prime :" + result);

    }

    public static boolean isPrime(int i)
    {
        if(i<=1)
        {
            return false;
        }
        else {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    return false;
                }

            }
        }

       return true;
    }
}
