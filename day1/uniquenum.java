package tcs;

import java.util.Scanner;

public class uniquenum {
    public static boolean isUnique(int n) {
        int[] arr = new int[10];
        while(n!=0) {
            arr[n%10]++;
            n/=10;
        } for(int i:arr) {
            if(i>1) return false;
        } return true;
    }
    public static void main(String[] args) {
        int count=0;
        for(int i=9;i<=30;i++) {
            if(isUnique(i)) count++;
        }
        System.out.println(count);
    }
}
