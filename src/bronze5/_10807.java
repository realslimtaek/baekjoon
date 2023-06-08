package bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10807 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int k = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i<  n; i++) {
            if(Integer.parseInt(arr[i]) == k ) cnt++;
        }

        System.out.println(cnt);



    }
}
