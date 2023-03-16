package gold3;
import java.util.*;
import java.io.*;

class point implements Comparable<point>{
    int start, end, num;
    public point(int val, int val2, int val4){
        this.start = val;
        this.end = val2;
        this.num = val4;
    }
    public int compareTo(point p){
        if(this.start == p.start)
            return p.end - this.end;
        else return this.start - p.start;
    }
}

public class _17619 {

//    static int n;
//    static int q;
//    static point[] Point;
//    static int[] group_arr;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        point[] Point = new point[n+1];
        Point[0] = new point(0,0,0);
        int[] group_arr = new int[n+1];
        for(int i = 1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            Point[i] = new point(x1,x2,i);
        }
        Arrays.sort(Point);
        for(int i = 0; i<=n; i++) {
            System.out.println(Point[i].num + "  " + Point[i].start + "  " + Point[i].end);
        }
        int end = -1;
        int group = 0;
        for(int i = 1; i <=n; i++){
            if(Point[i].start > end){
                end = Point[i].end;
                group += 1;
            } else {
                end = Math.max(Point[i].end, end);
            }
            group_arr[Point[i].num] = group;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<q; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(group_arr[a] == group_arr[b])
                sb.append(1 + "\n");
            else sb.append(0 + "\n");
        }
        System.out.println(sb);
    }
}
/*
5 2
1 5 2
1 4 2
3 7 4
7 9 1
10 13 4
1 3
1 4

 */