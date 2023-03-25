package gold5;
import java.util.*;
import java.io.*;
public class _21758 {
    //정올 2021 1차 1번문제
    //https://www.acmicpc.net/problem/17610
    static int[] place;
    static int[] toRightSum;
    static int[] toLeftSum;
    static int answer = Integer.MIN_VALUE;
    static int n;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        place = new int[n];
        toRightSum = new int[n];
        toLeftSum= new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        toRightSum[0] = place[0] = Integer.parseInt(st.nextToken());
        for(int i = 1; i<n; i++){
            place[i] = Integer.parseInt(st.nextToken());
            toRightSum[i] += toRightSum[i-1] + place[i];
        }
        toLeftSum[n-1] = place[n-1];
        for(int i = n-2; i>=0; i--){
            toLeftSum[i] = place[i] + toLeftSum[i+1];
        }
        case1();
        case2();
        case3();
        System.out.println(answer);
    }

    //꿀통 오른쪽
    public static void case1(){
        for(int bee2 = 1; bee2 < n-1; bee2++){
            int bee1_honey = toRightSum[n-1] - toRightSum[0]- place[bee2];
            int bee2_honey = toRightSum[n-1] - toRightSum[bee2];
            answer = Math.max(answer,(bee1_honey+bee2_honey));
        }
    }
    //꿀통 왼쪽
    public static void case2(){
        for(int bee2 = n-2; bee2 >=0; bee2--){
            int bee1_honey = toLeftSum[0] - toLeftSum[n-1] - place[bee2];
            int bee2_honey = toLeftSum[0] - toLeftSum[bee2];
            answer = Math.max(answer,(bee1_honey+bee2_honey));
        }
    }
    public static void case3(){
        for(int honey_pot = 1; honey_pot <n-1; honey_pot++){
            int bee1_honey = toRightSum[honey_pot] - toRightSum[0];
            int bee2_honey = toLeftSum[honey_pot] - toLeftSum[n-1];
            answer = Math.max(answer,(bee1_honey+bee2_honey));
        }
    }
}
