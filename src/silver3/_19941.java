package silver3;

import java.util.Scanner;
//정올 2020 1차 2번
// https://www.acmicpc.net/problem/19941

public class _19941 {
    static int n , k;
    static int ans = 0;
    static char[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        arr = sc.next().toCharArray();

        solution1();
        solution2();
    }
    public static void solution1(){
        int hp = 0, pp = 0;

        while(hp < n || pp < n){
            if( hp >= n || pp >= n) break;
            if(arr[hp]!='H'){
                hp++;
                continue;
            }
            if(arr[pp] != 'P'){
                pp++;
                continue;
            }

            if(Math.abs(hp - pp) <= k){
                ans++;
                hp++;
                pp++;
            } else {
                if(hp <= pp) hp++;
                else pp++;
            }
        }
        System.out.println(ans);
    }

    public static void solution2(){
        for(int i = 0; i<n; i++){
            if(arr[i] == 'P'){
                int start = Math.max(i - k, 0);
                int end = Math.min(i+k,n-1);
                for(int j = start; j <=end; j++){
                    if(arr[j] == 'H'){
                        arr[j] = 'r';
                        ans++;
                        break;
                    }

                }
            }
        }
        System.out.println(ans);
    }
}
