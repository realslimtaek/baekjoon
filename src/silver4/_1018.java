package silver4;

import java.io.*;
import java.util.*;

public class _1018 {

    static int n;
    static int m;
    static boolean[][] chess;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        chess = new boolean[n][m];
        for(int i = 0; i<n; i++){
            String str = br.readLine();

            for(int j = 0; j<m; j++){
                chess[i][j] = Objects.equals(str.charAt(j), 'B');
            }
        }


        int answer = 64;

        for(int i = 0; i<=n-8; i++){
            for(int j = 0; j<=m-8; j++){
                answer = Math.min(answer, dfs(i,j));
            }
        }
        System.out.println(answer);

    }

    public static int dfs(int a, int b){
        int row = a+8;
        int col = b+8;
        int cnt = 0;
        boolean now = true;

        for(int i = a; i<row; i++){
            for(int j = b; j<col; j++){
                if (chess[i][j] != now) {
                    cnt++;
                }
                    now = !now;
            }
            now = !now;
        }
        return Math.min(cnt, 64-cnt);
    }
}