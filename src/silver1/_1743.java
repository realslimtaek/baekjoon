package silver1;

import java.util.*;
import java.io.*;
public class _1743 {
    static int n, m , k;
    static int[][] arr;
    static boolean[][] isVisit;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int answer = 0;
    static int cnt;
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        isVisit = new boolean[n][m];
        for(int i = 0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a-1][b-1] = 1;
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(!isVisit[i][j] && arr[i][j] == 1) {
                    cnt = 1;
                    dfs(i, j);
                    if(answer < cnt) answer = cnt;
                }
            }
        }
        System.out.println(answer);
    }
    public static void dfs(int x, int y){
        isVisit[x][y] = true;

        for(int i = 0;i<4;i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx >=0 && ny >=0 && nx<n && ny<m) {
                if (!isVisit[nx][ny] && arr[nx][ny] == 1) {
                    cnt++;
                    dfs(nx, ny);
                }
            }
        }
    }

}
