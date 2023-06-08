import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class _25405 {

    static int n = 0;
    static int[] l = new int[0];
    static int m = 0;
    static int k = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        l = new int[n];

        String[] a = br.readLine().split(" ");

        for(int i = 0; i < a.length; i++){
            l[i] = Integer.parseInt(a[i]);
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
    }

}