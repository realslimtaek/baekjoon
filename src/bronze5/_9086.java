package bronze5;

import java.util.Scanner;

public class _9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        for(int i = 0; i<k; i++){
            String a = sc.next();
            System.out.println(a.charAt(0) +""+ a.charAt(a.length()-1));
        }
    }
}