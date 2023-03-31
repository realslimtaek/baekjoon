package bronze2;

import java.util.Scanner;

public class _14914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = Math.min(a,b);

        for(int i = 1; i<=min; i++){
            if(a % i == 0 && b % i == 0){
                System.out.println(i+" "+a/i+" "+b/i);
            }
        }


    }
}
