package tcs;

import java.util.Scanner;

public class NearestPrimeToN {
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int k = 1; k <= T; k++) {
            int N = sc.nextInt();
            int i = N, j = N;
            while (true) {

                if (isPrime(--i)) {
                    System.out.print("nearest prime: " + i);
                    break;
                }

                if (isPrime(++j)) {
                    System.out.print("Nearest prime: " + j);
                    break;
                }

            }
        }
        sc.close();
    }
}
