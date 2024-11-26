package programmers.level2;

import java.util.*;

public class _152996 {
  
    // 이 변수는 무게 별 개수를 저장합니다.
    static Map<Integer, Long> weightList = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(solution(new int[]{100,180,360,100,270})); // 4
        System.out.println(solution(new int[]{200,100,100,200,100})); // 10
        System.out.println(solution(new int[]{100,100,100})); // 3
    }
    public static long solution(int[] weights) {
        
        Arrays.sort(weights);

        //반복을 돌기 위해 중복제거를 합니다.
        int[] dist = Arrays.stream(weights).distinct().toArray();

        long answer = 0;

        // 중복 제거를 한 배열을 반복하며
        // 해당 항목의 개수를 weightList에 넣습니다.
        // 넣으면서, 해당 항목이 2개 이상이라면,
        // 자기 자신으로 짝꿍이 될 수 있으므로 (n * ( n-1 )) / 2  를 활용하여
        // 정답에 추가합니다.
        for ( int i : dist ) {
            long cnt = Arrays.stream(weights).filter(num -> num == i).count();
            weightList.put(i, cnt);
            if(cnt > 1) {
                answer += (cnt * (cnt-1)) / 2 ;
            }
        }

        // 중복이 제거된 항목을 순회하며, n 번과 n+1 번의 항목을 비교합니다.
        for( int i = 0; i < dist.length - 1; i++) {
            for(int j = i + 1; j < dist.length; j++) {

                // 먼저, 해당 항목의 최소공배수를 구합니다.
                int min = lcm(dist[i], dist[j]);

                // 최소공배수와 n의 값을 나누어 둡니다.
                // 이 변수는 n의 좌석을 의미합니다.
                long leftSeatMin = min / dist[i];
                // 최소공배수와 n + 1의 값을 나누어 둡니다.
                // 이 변수는 n+1 의 좌석을 의미합니다.
                long rightSeatMin = min /dist[j];

                // leftSeatMin 혹은 rightSeatMin이 1이라면, 시소의 중심으로 부터 1m 인 좌석에 앉아야 하지만
                // 문제에는 1m 좌석이 없으므로, 2를 곱합니다.
                if(leftSeatMin == 1 || rightSeatMin == 1) {
                    leftSeatMin *= 2;
                    rightSeatMin *= 2;
                }

                // 각 좌석이 4m 이하라면, 아래 코드를 실행합니다.
                if(leftSeatMin <= 4 && rightSeatMin <= 4) {

                    // 좌측에 앉을 수 있는 무게의 개수를 가져옵니다.
                    long weightLeftCount = weightList.get(dist[i]);
                    // 우측에 앉을 수 있는 무게의 개수를 가져옵니다.
                    long weightRightCount = weightList.get(dist[j]);

                    // 각 개수들 중 2가지 항목을 선택하여야 하므로 n * m 을 answer 에 더합니다.
                    long t = weightLeftCount * weightRightCount;
                    answer += t;
                }
            }
        }
        return answer;
    }

    // 최소 공배수를 구합니다.
    // 최소 공배수 = (a * b) / 최대공약수
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }


    // 유클리드 호제법을 사용하여 최대공약수를 구합니다.
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

