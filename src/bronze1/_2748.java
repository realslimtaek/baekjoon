package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _2748 {

    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        long[] arr = new long[91];

        arr[0] = 0;
        arr[1] = 1;

        for(int i =2; i<=90; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(arr[Integer.parseInt(br.readLine())]);


    }
}
