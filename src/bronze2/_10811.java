package bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class _10811 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i<n+1; i++){
            arr[i] = i;

        }

        for(int i =0; i<k; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

                reverse(arr, a, b+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=n; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }

    static void reverse(int[]arr, int s, int e) {

        int[]copy = Arrays.copyOfRange(arr, s, e);
        int len = copy.length;

        for(int i=0; i<len; i++) {
            arr[s+i]= copy[len -(i+1)];
        }
    }
}
