package silver1;

import java.util.*;
import java.io.*;

public class _2667 {

    static int n;
    static int[][] arr;
    static boolean[][] isVisit;
    static final int[] dx = {-1,0,1,0};
    static final int[] dy = {0,-1,0,1};
    static int[] ansarr;
    static int answer=0;
    static int cnt;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        ansarr = new int[n*n];
        isVisit = new boolean[n][n];

        for(int i = 0; i<n; i++){
            char[] temp = br.readLine().toCharArray();
            for(int j = 0; j<n; j++){
                arr[i][j] =Integer.parseInt(String.valueOf((temp[j] - '0')));

            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                cnt = 1;
                if(!isVisit[i][j] && arr[i][j] == 1) {
                    answer++;
                    dfs(i, j);
                    ansarr[answer] = cnt;
                }

            }
        }

        System.out.println(answer);
        Arrays.sort(ansarr);

        for(int i = 0; i<ansarr.length; i++){
            if(ansarr[i] != 0){
                System.out.println(ansarr[i]);
            }
        }

    }
    public static void dfs(int x, int y){
        isVisit[x][y] = true;
        for(int i = 0; i<4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx >=0 && ny >= 0 && nx<n && ny<n)
                if(!isVisit[nx][ny] && arr[nx][ny] == 1){
                    cnt++;
                    dfs(nx,ny);
                }

        }

    }
}
