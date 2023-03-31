package silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class _2583 {
    static int m,n,k, cnt;
    static int[][] arr;
    static boolean[][] isVisit;
    static ArrayList<Integer> answerarr;
    static final int[] dx = {-1,0,1,0};
    static final int[] dy = {0,-1,0,1};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[m][n+1];
        answerarr = new ArrayList<>();
        isVisit = new boolean[m+1][n+1];

        for(int i = 0; i<k;i++){
            st = new StringTokenizer(br.readLine());
            int y1 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            for(int j = x1; j<x2;j++){
                for(int k = y1; k<y2; k++){
                    arr[j][k] = 1;
                }
            }
        }


        int answer = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(!isVisit[i][j] && arr[i][j] == 0) {
                    cnt = 1;
                    answer++;
                    dfs(i, j);
                    answerarr.add(cnt);
                }

            }
        }

        System.out.println(answer);
        Collections.sort(answerarr);
        for(int i : answerarr){
            System.out.print(i + " ");
        }
    }

    public static void dfs(int x, int y){
        isVisit[x][y] = true;

        for(int i = 0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny>=0 && nx<m && ny<n){
                if(!isVisit[nx][ny] && arr[nx][ny] == 0){
                    cnt++;
                    dfs(nx,ny);
                }
            }
        }
    }
}
