package silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1002 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
                int x1 = Integer.parseInt(st.nextToken());
                int y1 = Integer.parseInt(st.nextToken());
                int r1 = Integer.parseInt(st.nextToken());
                int x2 = Integer.parseInt(st.nextToken());
                int y2 = Integer.parseInt(st.nextToken());
                int r2 = Integer.parseInt(st.nextToken());

                double q = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
                int asdf = Math.abs(r1-r2);
                if(q==0 && r1==r2){
                    System.out.println("-1");
                } else if (q < r1+r2 && asdf < q){
                    System.out.println("2");
                } else if (q == r1+r2 || q ==asdf) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }

        }

    }
}
