package bronze5;

import java.util.Scanner;

public class _11021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("Case #" + (i+1) + ": " + (sc.nextInt() + sc.nextInt()));
        }
    }
}
