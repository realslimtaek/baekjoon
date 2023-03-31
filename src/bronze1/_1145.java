package bronze1;
import java.util.*;

public class _1145 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int cnt = 0;
        int val = 1;
        while(true){
            for(int i = 0; i<5; i++){
                if(val % arr[i] == 0) cnt++;
            }
            if(cnt >= 3){
                System.out.println(val);
                break;
            }
            val++;
            cnt = 0;
        }
    }
}
