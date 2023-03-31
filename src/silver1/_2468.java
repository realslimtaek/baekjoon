package silver1;

import java.util.*;
import java.io.*;
public class _2468 {

    static int N;
    static int[][] arr;
    static boolean[][] isVisit;
    static int highest = 0;
    static int lowest = Integer.MAX_VALUE;
    static final int[] dx = {-1,0,1,0};
    static final int[] dy = {0,-1,0,1};
    static int answer = 1;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                int a = Integer.parseInt(st.nextToken());
                if(highest < a) highest = a;
                if(lowest > a) lowest = a;
                arr[i][j] = a;
            }
        }
        for(int i = lowest; i<highest;i++){
            isVisit = new boolean[N][N];
            int cnt = 0;
            for(int j = 0; j<N; j++){
                for(int k = 0; k<N; k++){
                    if(!isVisit[j][k] && arr[j][k] > i) {
                        cnt++;
                        solution(i,j,k);
                    }
                }
            }
            if(answer < cnt) answer = cnt;
        }
        System.out.println(answer);
    }
    public static void solution(int high, int x,int y){
        isVisit[x][y] = true;
        for(int i = 0; i<4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx >=0 && ny >= 0 && nx < N && ny < N){
                if(!isVisit[nx][ny] && arr[nx][ny] > high)
                    solution(high,nx,ny);
            }

        }

    }

}
