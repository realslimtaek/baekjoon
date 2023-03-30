package bronze2;

import java.util.*;
import java.io.*;
public class _2577 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = 1;
        for(int i = 0; i<3; i++){
            val *= sc.nextInt();
        }
        char[] temp = String.valueOf(val).toCharArray();

        for(int i = 0; i<10; i++){
            int cnt = 0;
            for (char c : temp) {
                if (c - '0' == i)
                    cnt++;
            }
            System.out.println(cnt);
        }

    }
}
