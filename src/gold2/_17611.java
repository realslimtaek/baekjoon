package gold2;

import java.util.*;
import java.io.*;
public class _17611 {
    //정올 2019 1차 2번 - https://www.acmicpc.net/problem/17618
    static int n ;
    static final int max = 1000010;
    static int[][] cor;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        cor = new int[n+1][2];
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            cor[i][0] = Integer.parseInt(st.nextToken()) + 500000;
            cor[i][1] = Integer.parseInt(st.nextToken()) + 500000;
        }
        cor[n][0] = cor[0][0];
        cor[n][1] = cor[0][1];

        solution();
    }

    public static void solution(){
        int px = cor[0][0];
        int py = cor[0][1];
        int[] x_cor = new int[max];
        int[] y_cor = new int[max];

        for(int i = 1; i <= n; i++){
            int x = cor[i][0];
            int y = cor[i][1];

            if(px == x){
                int start = Math.min(py,y);
                int end = Math.max(py,y);
                y_cor[start]++;
                y_cor[end]--;
            } else {
                int start = Math.min(px,x);
                int end = Math.max(px,x);
                x_cor[start]++;
                x_cor[end]--;
            }
            px = cor[i][0];
            py = cor[i][1];
        }
        for(int i = 1; i<max; i++){
            x_cor[i] += x_cor[i-1];
            y_cor[i] += y_cor[i-1];
        }

        int answer = 0;
        for(int i = 1; i<max; i++){
            answer = Math.max(Math.max(x_cor[i],y_cor[i]),answer);
        }

        System.out.println(answer);

    }
}
