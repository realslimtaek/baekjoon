package silver1;

import java.util.*;
import java.io.*;


public class _17610 {

    //정올 2019 1차 1번문제
    //https://www.acmicpc.net/problem/17610

    static int k;
    static int[] arr;
    static boolean[] boolanswer;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        k = Integer.parseInt(br.readLine());

        arr = new int[k + 1];
        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<k; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        boolanswer = new boolean[sum+1];

        dfs(0,0);
        int cnt = 0;
        for(boolean a : boolanswer){
            if(!a) cnt++;
        }
        System.out.println(cnt-1);
    }
    public static void dfs(int x, int sum){
        if(x == k){
            if(sum > 0)
                boolanswer[sum] = true;
        }
        else{

            dfs(x+1,sum+arr[x]);
            dfs(x+1,sum);
            dfs(x+1,sum-arr[x]);

        }

    }

}



/*

/Library/Java/JavaVirtualMachines/jdk-11.0.16.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=53394:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/kweontaekhyeong/IdeaProjects/baekjoon/out/production/baekjoon silver1._17610
3
1 5 7
0  0
1  0
2  -1
3  -6
3  -1
3  4
4
2  0
3  -5
3  0
3  5
5
2  1
3  -4
3  1
1
3  6
6
1  0
2  -1
3  -6
3  -1
3  4
4
2  0
3  -5
3  0
3  5
5
2  1
3  -4
3  1
1
3  6
6
1  0
2  -1
3  -6
3  -1
3  4
4
2  0
3  -5
3  0
3  5
5
2  1
3  -4
3  1
1
3  6
6
9

Process finished with exit code 0

 */