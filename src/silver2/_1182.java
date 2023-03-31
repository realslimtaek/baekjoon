package silver2;
import java.io.*;
import java.util.*;

public class _1182 {

    static boolean[] isVisit;
    static int[] arr;
    static int n, s;
    static int answer= 0;

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new int[n];
        isVisit = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i<=n; i++){
            dfs(0,i, 0);
        }
        System.out.println(answer);
    }

    public static void dfs(int start, int max, int cnt){
        if(cnt == max){
            int sum = 0;
            for(int i = 0; i<n; i++){
                if(isVisit[i]) {
                    sum += arr[i];
                }
            }
            if(sum == s) {
                answer++;
            }
        } else {
            for (int i = start; i < n; i++) {
                if (!isVisit[i]) {
                    isVisit[i] = true;
                    dfs(i+1,max, cnt + 1);
                    isVisit[i] = false;
                }
            }
        }
    }
}
