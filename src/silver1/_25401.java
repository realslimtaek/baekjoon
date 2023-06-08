package silver1;
//https://www.acmicpc.net/problem/25401

import java.util.*;
import java.io.*;


public class _25401 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] list = new int[n+1];
        for(int i = 1; i<=n; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n,list));
    }

    public static int solution(int n, int[] list){
        int answer = n-2;
        int temp = 0;
        int k = 0;
        int count = 0;

        for(int i = 1; i<n;i++){
            for(int j = i+1; j<=n; j++){
                //4 / 1 2 2 4 예시 i = 1, j = 4
                // 먼저 두 개의 수를 뽑은 후 그 수 들의 차이를 구함.= temp, list[j]-list[i] = 4 -1 = 3
                temp = Math.max(list[i] - list[j] ,list[j]-list[i]);

                // 그리고 수의 간격을 구함. = k, j - i = 3
                k = j - i;

                // temp % k를 하였을 때, 나머지가 있다면 정수가 아닌 수를 차례로 더해야 함으로 continue
                if(temp % k == 1) continue;

                //한 칸당 실질적으로 올라야하는 수를 구함. d, 3 / 3 = 1;
                int d = temp / k;

                //값이 다른 수를 알아내기 위한 count 초기화
                count = 0;

                //list배열을 처음부터 반복
                for(int z = 1; z <= n; z++){
                    //list[z]와 list[i]의 d만큼 오른 i번째 수를 비교
                    //예 z가 3이고 i가 1이라면 list[i] + 2만큼 된 list[z]와 비교
                    int now = list[i] + d * (z-i);
                    //그 두 값이 같지 않다면 바꿔야함으로 count++
                    if(now != list[z]){
                        count++;
                    }
                }
                answer = Math.min(answer, count);
            }
        }


        return answer;
    }
}