package bronze5;

import java.util.Scanner;

public class _25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for(int i = 0; i < n/4; i++) {
            sb.append("long").append(" ");
        }

        System.out.println(sb + "int");
    }
}
