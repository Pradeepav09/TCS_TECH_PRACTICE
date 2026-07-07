package tcs;

public class minmax {
    public static void main(String[] args) {
        int[] arr ={1,2,6,5,4,7};
        int min=arr[0], max=arr[0];
        for(int i: arr) {
            if (i>max) max=i;
            if (i<min) min=i;
        }
        System.out.print("Min: " + min+ " " + "Max : " + max);
    }
}
