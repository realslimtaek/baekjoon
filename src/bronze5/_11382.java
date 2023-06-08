package bronze5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _11382 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringTokenizer st =new StringTokenizer(sc.nextLine());
        long sum = 0;
        for(int i=0; i<3; i++){
            sum += Long.parseLong(st.nextToken());
        }

        System.out.println(sum);
    }
}
