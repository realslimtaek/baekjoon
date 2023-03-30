package silver1;
import java.util.*;
import java.io.*;

public class _2178 {
    static int n;
    static int m;
    static int[][] maze;
    static final int[] dx = {-1,1,0,0};
    static final int[] dy = {0,0,-1,1};
    static boolean[][] isVisit;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze = new int[n][m];
        isVisit = new boolean[n][m];
        isVisit[0][0] = true;


        for(int i=0; i<n; i++) {
            String s = br.readLine();
            for(int j=0; j<m; j++) {
                maze[i][j] = s.charAt(j) - '0';
            }
        }


//        solution(0,0, 1);
        bfs(0,0);
        System.out.println(maze[n-1][m-1]);
    }
//    public static void solution(int x, int y,int cnt){
//        if(x == n-1 && y == m-1){
//            if(answer > cnt){
//                answer = cnt;
//            }
//        }else {
//            isVisit[x][y] = true;
//            for (int i = 0; i < 4; i++) {
//                int nx = x + dx[i];
//                int ny = y + dy[i];
//                if (nx >= 0 && nx < n && ny >= 0 && ny < m
//                        && !isVisit[nx][ny] && maze[nx][ny] == 1) {
//                    solution(nx, ny, cnt + 1);
//                }
//            }
//            isVisit[x][y] = false;
//        }
//    }
    public static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x,y});
        while(!q.isEmpty()){
                int[] b = q.poll();
                int curx = b[0];
                int cury = b[1];

                    for (int j = 0; j < 4; j++) {
                        int nx = curx + dx[j];
                        int ny = cury + dy[j];
                        if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                            continue;
                        if (isVisit[nx][ny] || maze[nx][ny] == 0)
                            continue;

                        q.offer(new int[] {nx,ny});
                        maze[nx][ny] = maze[curx][cury] + 1;
                        isVisit[nx][ny] = true;

                }

        }
    }
}
/*
3 3
111
101
111
 */
