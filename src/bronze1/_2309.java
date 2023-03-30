package bronze1;

import java.util.*;

public class _2309 {
    static int[] arr;
    static int sum = 0;
    static boolean flag = false;
    static boolean[] isVisit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[9];
        isVisit =new boolean[9];
        for(int i = 0; i<9; i++){
            int v = sc.nextInt();
            arr[i] = v;
        }
        dfs(0);
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i<9 ; i++){
            if(isVisit[i]) answer.add(arr[i]);
        }
        Collections.sort(answer);
        for(int i : answer){
            System.out.println(i);
        }
    }

    public static void dfs(int cnt){
        if(flag) return;
        if(cnt == 7) {
            sum = 0;
            for (int i = 0; i < 9; i++) {
                if (isVisit[i]) {
                    sum += arr[i];
                }
            }
            if (sum == 100) {
                flag = true;
                return;
            }

        }
            for (int i = 0; i < 9; i++) {
                if(!isVisit[i]){
                    isVisit[i] = true;
                    dfs(cnt+1);
                    if(flag) break;
                    isVisit[i] = false;
                }

            }

        }
}
