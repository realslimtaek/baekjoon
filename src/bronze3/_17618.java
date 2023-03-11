package bronze3;
import java.util.*;
import java.io.*;
public class _17618 {
    //정올 2019 2차 1번 https://www.acmicpc.net/problem/17618
    static int n;
    static int cnt = 0;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for(int i = 1; i<=n; i++)
            solution(i);

        System.out.println(cnt);
    }

    public static void solution(int a){

        int a_divided = 0;
        int temp = a;


        while(temp != 0){
            a_divided += temp % 10;
            temp /= 10;
        }

        if(a % a_divided == 0) cnt++;


    }
}
