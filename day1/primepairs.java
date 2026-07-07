package tcs;

import java.util.Scanner;

public class primepairs {
    public static boolean isPrime(int n)
    {
    if(n<=1)
    {
        return false;
    }
    for(int i=2;i<Math.sqrt(n);i++)
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;
    }
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Starting point of Range: ");
    int n = sc.nextInt();
    System.out.print("Enter an Ending point of Range: ");
    int m = sc.nextInt();
    int count = 0;
    int[] arr = new int[(m-n)+1];
    int pos = 0;
    for(int i=n; i<=m; i++)
    {
        if(isPrime(i))
        {
            arr[pos] = i;
            pos++;
        }
    }

    for(int i =0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]-arr[i]==6)
            {
                count++;
                System.out.println("("+arr[i]+","+arr[j]+")");
            }

        }
    }
    if(arr.length==0 || count==0)
    {
        System.out.println("No prime pairs found");
    }
    System.out.println("Count: "+count);
    sc.close();
    }
}