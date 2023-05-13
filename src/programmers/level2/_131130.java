package programmers.level2;

import java.io.*;
import java.util.*;
public class _131130 {

    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] cards = {10, 5, 6, 7, 8, 9, 1, 2, 3, 4};

        System.out.println(solution(cards));



    }
        public static int solution(int[] cards) {
            int[] way = new int[cards.length];
            int[] point = new int[cards.length];
            int b = 0;
            for(int i = 0; i<cards.length; i++){
                if(way[i] == 1) continue;
                int temp = cards[i];
                int a = temp;
                int cnt = 0;
                do {
                    a = checkcard(a, cards);
                    cnt++;
                    if (cnt == cards.length)
                        return 0;
                    way[a-1] = 1;
                } while (a != temp);

                point[b++] = cnt;
            }
            Arrays.sort(point);
            return point[cards.length-1] * point[cards.length-2];
        }
        public static int checkcard(int check, int[] cards){
            return cards[check-1];
        }
}
