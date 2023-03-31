package bronze1;

import java.util.Scanner;

public class _11170 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cnt = 0;
            for(int j = a; j<=b; j++){
                String str = String.valueOf(j);
                for(int k = 0; k<str.length(); k++){
                    if(str.charAt(k) == '0') cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb.toString());
    }
}
