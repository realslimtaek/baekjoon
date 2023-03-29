package silver2;
import java.util.*;
import java.io.*;

public class _11724 {
    static int n = 0;
    static int m = 0;
    static int[][] arr ;
    static int cnt = 0;
    static boolean[] isVisit;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];
        isVisit = new boolean[n+1];

        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        for(int i = 1; i<=n; i++){
            if(!isVisit[i]){
                isVisit[i] = true;
                cnt++;
                dfs(i);
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int a){
        for(int i = 1; i<n+1; i++){
            if(!isVisit[i] && arr[a][i] == 1){
                isVisit[i] = true;
                dfs(i);
            }
        }
    }
}
