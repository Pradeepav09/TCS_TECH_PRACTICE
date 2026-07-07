package tcs;

public class sumthedigit {
    public static void main(String[] args) {
        int n=125;
        int sum=0;
        while(n!=0) {
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}