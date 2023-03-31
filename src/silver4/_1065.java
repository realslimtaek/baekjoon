package silver4;

import java.util.Scanner;

public class _1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i<=n; i++){
            String str = String.valueOf(i);
            if(i < 100) {
                cnt++;
            }else {
                int def = Integer.parseInt(String.valueOf(str.charAt(0) - str.charAt(1)));
                for (int j = 2; j < str.length(); j++) {
                    if (def != Integer.parseInt(String.valueOf(str.charAt(j - 1) - str.charAt(j)))) {
                        continue;
                    }
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
