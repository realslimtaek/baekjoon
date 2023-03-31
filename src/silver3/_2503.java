package silver3;

import java.util.Scanner;

public class _2503 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] check = new int[n];
        int[] strike = new int[n];
        int[] ball = new int[n];

        for(int i = 0; i<n; i++){
            check[i] = sc.nextInt();
            strike[i] = sc.nextInt();
            ball[i] = sc.nextInt();
        }

        int cnt = 0;
        for(int i = 123; i<=987; i++){

            if(i%10==i/10%10) continue;
            if(i/100==i%10) continue;
            if(i/100==i/10%10) continue;

            if(i/10%10 == 0) continue;
            if(i%10 == 0) continue;

            int count = 0;
            for(int j = 0;j<n; j++){
                int now_strike = 0;
                int now_ball = 0;
                //100의 자리
                if(check[j] / 100 == i/100) now_strike++;
                else if (check[j]/100 == i%10 || check[j]/100 == i/10%10){
                    now_ball++;
                }
                //10의 자리
                if(check[j] /10%10 == i/10%10) now_strike++;
                else if(check[j]/10%10 == i/100 || check[j]/10%10 == i%10) now_ball++;

                if(check[j] % 10 == i%10) now_strike++;
                else if(check[j]%10 == i/100 || check[j]%10 == i/10%10) now_ball++;

                if(strike[j] != now_strike || ball[j] != now_ball) break;
                count++;

            }
            if(count == n){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
