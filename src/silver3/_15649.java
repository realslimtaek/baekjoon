package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15649 {

    static int n;
    static int[] listN;
    static int m;
    static boolean[] isVisit;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        listN = new int[n+1];
        isVisit = new boolean[n+1];

        solution("", 0);
    }

    public static void solution(String answer, int cnt){
        if(cnt == m){
                System.out.println(answer);
        }
        else{
            for(int i = 1; i<=n; i++){
                if(!isVisit[i]){
                    isVisit[i] = true;
                    solution(answer+(i)+" ", cnt+1);
                    isVisit[i] = false;
                }
            }
        }
    }
}
