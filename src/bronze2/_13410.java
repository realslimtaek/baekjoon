package bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class _13410 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[k+1];

        for(int i = 1;i<=k;i++){
            StringBuffer sb = new StringBuffer(String.valueOf(n*i));
            arr[i] = Integer.parseInt(sb.reverse().toString());
        }
        Arrays.sort(arr);
        System.out.println(arr[k]);

    }
}
