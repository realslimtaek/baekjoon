package bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class _10813 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n+1];
        for(int i = 1 ;i<=n; i++){
            arr[i] = i;
        }

        for(int i = 0; i< k; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == b) continue;
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=n; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
