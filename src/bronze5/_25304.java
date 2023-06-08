package bronze5;

import java.util.Scanner;

public class _25304 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        for(int i = 0; i<k; i++){
            n -= (sc.nextInt() * sc.nextInt());
        }

        if(n==0) System.out.println("Yes");
        else System.out.println("No");
    }
}
