package silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class _11659 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];

        int e = arr[0];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=n; i++){
            arr[i] = e + Integer.parseInt(st.nextToken());
            e=arr[i];
        }


        int[][] m = new int[k][2];
        for(int i = 0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            m[i][0] = Integer.parseInt(st.nextToken());
            m[i][1] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arr, k, m));
    }

    public static String solution(int[]arr, int k, int[][] m){
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i<k; i++){
            answer.append(arr[m[i][1]] - arr[m[i][0]-1]).append("\n");
        }

        return answer.toString();
    }
}
