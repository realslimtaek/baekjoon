package silver1;

import java.io.*;
import java.util.*;

public class _22342 {
    static int n,m;
    static int[] dx = {-1, 0 , 1};
    static int[][] arr;
    static int[][] store;
    static int[][] print;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        store = new int[n][m];
        print = new int[n][m];

        for(int i = 0; i<n; i++){
            String str = br.readLine();
            for(int j = 0; j<m; j++){
                arr[i][j] = str.charAt(j)-'0';
            }
        }

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(answer < checkStore(j,i))
                    answer = checkStore(j,i);

            }
        }
        System.out.println(answer);
    }

    public static int checkStore(int a, int b){
        if(b == 0){
            store[a][b] = 0;
            print[a][b] = arr[a][b];
            return store[a][b];
        }
        int temp = 0;
        for(int i : dx) {
            if (i + a < 0) continue;
            if (i + a >= n) continue;

            //comparing print for store
            temp = Math.max(temp, print[i+a][b - 1]);
        }
        store[a][b] = temp;
        print[a][b] = temp + arr[a][b];
        return store[a][b];

    }
}
