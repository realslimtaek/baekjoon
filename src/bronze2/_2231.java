package bronze2;
import java.util.*;
import java.io.*;

public class _2231 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 0;

        for(int i = 0; i<n; i++){
            int temp = i;
            int k=0;

            while(temp != 0){
                k += temp % 10;
                temp /= 10;
            }

            if(i + k == n) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
