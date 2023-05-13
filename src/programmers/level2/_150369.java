package programmers.level2;

public class _150369 {

    public static void main(String[] args) {
//        int[] a = {1,0,2,0,1,0,2};
//        int[] b = {0,2,0,1,0,2,0};
//        System.out.println(solution(2,7, a, b));
//        int[] a = {1,0,3,1,2};
//        int[] b = {0,3,0,4,0};
//        System.out.println(solution(4,5,a,b));

//        int[] a = {0,0};
//        int[] b = {0,4};
//        System.out.println(solution(2,2,a,b));

        int[] a = {0,0};
        int[] b = {0,0};
        System.out.println(solution(2,2,a,b));
    }

    public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;

        int q = n-1;
        int w = n-1;
        long a;
        long b;

        while(q >=0){
            if(deliveries[q] == 0) q--;
            else break;
        }
        while(w >=0){
            if(pickups[w] == 0) w--;
            else break;
        }

        long max = Math.max(q,w);
        while(max >= 0){
            a= 0;
            b= 0;

            while(q>= 0) {
                if (deliveries[q] + a <= cap) {
                    a += deliveries[q];
                    deliveries[q] = 0;
                    q--;
                } else {
                    deliveries[q] -= (cap - a);
                    break;
                }
            }

            while(w >= 0) {
                if (pickups[w] + b <= cap) {
                    b += pickups[w];
                    pickups[w] = 0;
                    w--;
                } else {
                    pickups[w] -= (cap - b);
                    break;
                }
            }

            answer += (max +1) * 2;
            max = Math.max(q,w);
        }


        return answer;
    }
}
