package tcs;

import java.util.Scanner;

public class segregate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int zeroes=0;
        int[] arr= new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
            if(arr[i]==0) {
                zeroes++;
            }
        }
        for(int i=0;i<zeroes;i++) {
            arr[i]=0;
        }
        for(int i=zeroes;i<n;i++) {
            arr[i]=1;
        }
        for(int i:arr) {
            System.out.print(i + " ");
        }
    }
}
