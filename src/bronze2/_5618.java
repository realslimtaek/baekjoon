package bronze2;

import java.util.*;
import java.io.*;

public class _5618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int low = Integer.MAX_VALUE;
        int cnt;
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
            if(a[i] < low){
                low = a[i];
            }
        }

        for(int i = 1; i<=low; i++){
            cnt = 0;
            for(int j = 0; j<n; j++){
                if(a[j] % i == 0) cnt++;
            }
            if(cnt == n) System.out.println(i);
        }
    }
}
