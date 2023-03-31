package bronze1;

import java.util.Scanner;

public class _1526 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int val1 = 0;

        for(int i = n; i>=0; i--){
            int cnt = 0;
            String str = String.valueOf(i);
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(j) == '7' || str.charAt(j) == '4') cnt++;
            }
            if(cnt == str.length()) {
                val1 = i;
                break;
            }
        }
        System.out.println(val1);
    }
}
