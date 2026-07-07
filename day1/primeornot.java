package tcs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int flag=1;
        for(int i=2;i<=n/2;i++) { //for(int i=2;i*i<=n;i++) {
            if(n%i==0) {
                System.out.println("Not a prime");
                flag = 0;
                break;
            }
        } if(flag==1) {
            System.out.println("Prime");
        }
    }
}

//  (OR)
//        int count=0;
//        for(int i=1;i<=n;i++)
//        {
//            if(n%i==0) {
//                count++;
//            }
//        }
//        if(count==2) {
//            System.out.println(n + "is a prime num");
//        } else {
//            System.out.println(n + "is not a prime num");
//        }