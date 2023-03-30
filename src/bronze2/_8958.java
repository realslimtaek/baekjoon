package bronze2;
import java.util.*;
public class _8958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            char bef = 'X';
            int point = 1;
            int sum = 0;
            for (char val : s.toCharArray()) {
                if (val == 'O') {
                    if (bef == 'O') {
                        point++;
                    }
                    sum += point;
                    bef = 'O';
                    continue;
                }
                bef = 'X';
                point = 1;
            }
            System.out.println(sum);
        }
    }
}
