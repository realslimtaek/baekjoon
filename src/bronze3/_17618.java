package bronze3;
import java.util.*;
import java.io.*;
public class _17618 {
    //정올 2019 2차 1번 https://www.acmicpc.net/problem/17618
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 1; i<=n; i++){
            int sum = 0;
            for(char asdf : Integer.toString(i).toCharArray()){
                sum += asdf-48;
            }
            if(i % sum == 0) cnt++;
        }


        System.out.println(cnt);
    }
}
