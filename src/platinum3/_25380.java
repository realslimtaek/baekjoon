package platinum3;
import java.util.*;
import java.io.*;

public class _25380 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //변수 선언
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //배열 N 정의
        ArrayList<Integer> N_list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            N_list.add(Integer.parseInt(st.nextToken()));
        }

        //배열 M 정의
        ArrayList<Integer> M_list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++){
            M_list.add(Integer.parseInt(st.nextToken()));
        }

        int[][] po = new int[K][2];
        boolean[][] check = new boolean[K][2];

        for(int i = 0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            if(N_list.contains(temp)) check[i][0] = true;
            po[i][0] = temp;
            temp = Integer.parseInt(st.nextToken());
            if(M_list.contains(temp)) check[i][1] = true;
            po[i][1] = temp;
        }
        System.out.println(solution(N_list,M_list,K,po,check));

    }


    public static int solution(ArrayList<Integer> N, ArrayList<Integer> M, int K, int[][] po, boolean[][] check){

        int answer = 0;
        for(int i = 0; i<K-1; i++){
            for(int j = i+1; j<K; j++) {

                int temp_N_sub = 1000000;
                int temp_M_sub = 1000000;
                if( M.size() == 1 ){


                }

                //둘 다 N M에 소속할 때
                if(check[i][0] && check[j][0] && check[i][1] && check[j][1]){
                    temp_N_sub = Math.abs(po[i][0] - po[j][0]);
                    temp_M_sub = Math.abs(po[i][1] - po[j][1]);
                    answer += temp_M_sub + temp_N_sub;
                    continue;
                }

                //한 쪽만 N에 소속될 때
                if(check[i][0] || check[j][0]){
                    temp_N_sub = Math.abs(po[i][0] - po[j][0]);
                }

                //한 쪽만 M에 소속될 때
                if(check[i][1] || check[j][1]){
                    temp_M_sub = Math.abs(po[i][1] - po[j][1]);
                }

                //둘 다 아닐때

                if(temp_M_sub == 1000000) {
                    for (Integer integer : M) {
                        temp_M_sub = Math.min(temp_M_sub, Math.abs(integer - po[i][1]) + Math.abs((integer-po[j][1])));
                    }
                }

                if(temp_N_sub == 1000000) {
                    for (int integer : N) {
                        temp_N_sub = Math.min(temp_N_sub, Math.abs(integer - po[i][0]) + Math.abs((integer-po[j][0])));
                    }
                }

                answer += temp_M_sub + temp_N_sub;
            }
        }

        return answer;
    }

    /*
2 1 5
-2 5
5
-1 5
0 2
4 -3
5 4
-2 -2

     */
}
